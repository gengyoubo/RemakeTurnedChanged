//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.entity;

import java.util.List;
import javax.annotation.Nullable;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModItems;
import net.mcreator.latexes.procedures.AHVHertxRightClickedOnEntityProcedure;
import net.mcreator.latexes.procedures.HertxEntityDiesProcedure;
import net.mcreator.latexes.procedures.HertxOnInitialEntitySpawnProcedure;
import net.mcreator.latexes.procedures.HertxPlayerCollidesWithThisEntityProcedure;
import net.mcreator.latexes.procedures.HertxThisEntityKillsAnotherOneProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.FollowOwnerGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtTargetGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

public class AHVHertxEntity extends TamableAnimal {
    public AHVHertxEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType)LatexModEntities.AHV_HERTX.get(), world);
    }

    public AHVHertxEntity(EntityType<AHVHertxEntity> type, Level world) {
        super(type, world);
        this.xpReward = 15;
        this.setNoAi(false);
        this.setPersistenceRequired();
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false) {
            protected double getAttackReachSqr(LivingEntity entity) {
                return 4.0 + (double)(entity.getBbWidth() * entity.getBbWidth());
            }
        });
        this.goalSelector.addGoal(2, new OwnerHurtByTargetGoal(this));
        this.targetSelector.addGoal(3, new OwnerHurtTargetGoal(this));
        this.goalSelector.addGoal(4, new FollowOwnerGoal(this, 1.0, 2.0F, 48.0F, false));
        this.goalSelector.addGoal(5, new OpenDoorGoal(this, true));
        this.goalSelector.addGoal(6, new OpenDoorGoal(this, false));
        this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(8, new RandomStrollGoal(this, 1.0));
        this.targetSelector.addGoal(9, new HurtByTargetGoal(this, new Class[0]));
        this.goalSelector.addGoal(10, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(11, new FloatGoal(this));
    }

    public MobType getMobType() {
        return MobType.UNDEFINED;
    }

    public boolean removeWhenFarAway(double distanceToClosestPlayer) {
        return false;
    }

    protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
        super.dropCustomDeathLoot(source, looting, recentlyHitIn);
        this.spawnAtLocation(new ItemStack((ItemLike)LatexModItems.HERTXVISOR.get()));
    }

    public SoundEvent getAmbientSound() {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:robot_beep"));
    }

    public void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
    }

    public SoundEvent getHurtSound(DamageSource ds) {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
    }

    public SoundEvent getDeathSound() {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:death_beep"));
    }

    public boolean hurt(DamageSource source, float amount) {
        if (source == DamageSource.FALL) {
            return false;
        } else if (source == DamageSource.CACTUS) {
            return false;
        } else {
            return source == DamageSource.DROWN ? false : super.hurt(source, amount);
        }
    }

    public void die(DamageSource source) {
        super.die(source);
        HertxEntityDiesProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
    }

    public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
        HertxOnInitialEntitySpawnProcedure.execute(world, this.getX(), this.getY(), this.getZ(), this);
        return retval;
    }

    public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
        ItemStack itemstack = sourceentity.getItemInHand(hand);
        InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
        Item item = itemstack.getItem();
        if (itemstack.getItem() instanceof SpawnEggItem) {
            retval = super.mobInteract(sourceentity, hand);
        } else if (this.level.isClientSide()) {
            retval = (!this.isTame() || !this.isOwnedBy(sourceentity)) && !this.isFood(itemstack) ? InteractionResult.PASS : InteractionResult.sidedSuccess(this.level.isClientSide());
        } else if (this.isTame()) {
            if (this.isOwnedBy(sourceentity)) {
                if (item.isEdible() && this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
                    this.usePlayerItem(sourceentity, hand, itemstack);
                    this.heal((float)item.getFoodProperties().getNutrition());
                    retval = InteractionResult.sidedSuccess(this.level.isClientSide());
                } else if (this.isFood(itemstack) && this.getHealth() < this.getMaxHealth()) {
                    this.usePlayerItem(sourceentity, hand, itemstack);
                    this.heal(4.0F);
                    retval = InteractionResult.sidedSuccess(this.level.isClientSide());
                } else {
                    retval = super.mobInteract(sourceentity, hand);
                }
            }
        } else if (this.isFood(itemstack)) {
            this.usePlayerItem(sourceentity, hand, itemstack);
            if (this.random.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame(this, sourceentity)) {
                this.tame(sourceentity);
                this.level.broadcastEntityEvent(this, (byte)7);
            } else {
                this.level.broadcastEntityEvent(this, (byte)6);
            }

            this.setPersistenceRequired();
            retval = InteractionResult.sidedSuccess(this.level.isClientSide());
        } else {
            retval = super.mobInteract(sourceentity, hand);
            if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
                this.setPersistenceRequired();
            }
        }

        double x = this.getX();
        double y = this.getY();
        double z = this.getZ();
        Entity entity = this;
        Level world = this.level;
        AHVHertxRightClickedOnEntityProcedure.execute(world, x, y, z, entity, sourceentity);
        return retval;
    }

    public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
        super.awardKillScore(entity, score, damageSource);
        HertxThisEntityKillsAnotherOneProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), entity);
    }

    public void playerTouch(Player sourceentity) {
        super.playerTouch(sourceentity);
        HertxPlayerCollidesWithThisEntityProcedure.execute(this);
    }

    public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
        AHVHertxEntity retval = (AHVHertxEntity)((EntityType)LatexModEntities.AHV_HERTX.get()).create(serverWorld);
        retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
        return retval;
    }

    public boolean isFood(ItemStack stack) {
        return List.of((Item)LatexModItems.DARKLATEXGOO.get(), Items.SLIME_BALL).contains(stack.getItem());
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
        builder = builder.add(Attributes.MAX_HEALTH, 50.0);
        builder = builder.add(Attributes.ARMOR, 6.0);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 6.0);
        builder = builder.add(Attributes.FOLLOW_RANGE, 16.0);
        builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.5);
        builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.5);
        return builder;
    }
}
