package net.ltxprogrammer.turned.entity;

import java.util.List;
import javax.annotation.Nullable;
import net.ltxprogrammer.changed.init.ChangedItems;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.ltxprogrammer.turned.init.LatexModItems;
import net.ltxprogrammer.turned.procedures.AHVHertxRightClickedOnEntityProcedure;
import net.ltxprogrammer.turned.procedures.HertxEntityDiesProcedure;
import net.ltxprogrammer.turned.procedures.HertxOnInitialEntitySpawnProcedure;
import net.ltxprogrammer.turned.procedures.HertxPlayerCollidesWithThisEntityProcedure;
import net.ltxprogrammer.turned.procedures.HertxThisEntityKillsAnotherOneProcedure;
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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/entity/AHVHertxEntity.class */
public class AHVHertxEntity extends TamableAnimal {
    public AHVHertxEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.AHV_HERTX.get(), world);
    }

    public AHVHertxEntity(EntityType<AHVHertxEntity> type, Level world) {
        super(type, world);
        this.xpReward = 15;
        setNoAi(false);
        setPersistenceRequired();
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    protected void registerGoals() {
        registerGoals();
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2d, false) { // from class: net.ltxprogrammer.turned.entity.AHVHertxEntity.1
            protected double getAttackReachSqr(LivingEntity entity) {
                return 4.0d + ((double) (entity.getBbWidth() * entity.getBbWidth()));
            }
        });
        this.goalSelector.addGoal(2, new OwnerHurtByTargetGoal(this));
        this.targetSelector.addGoal(3, new OwnerHurtTargetGoal(this));
        this.goalSelector.addGoal(4, new FollowOwnerGoal(this, 1.0d, 2.0f, 48.0f, false));
        this.goalSelector.addGoal(5, new OpenDoorGoal(this, true));
        this.goalSelector.addGoal(6, new OpenDoorGoal(this, false));
        this.goalSelector.addGoal(7, new LookAtPlayerGoal(this, Player.class, 6.0f));
        this.goalSelector.addGoal(8, new RandomStrollGoal(this, 1.0d));
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
        dropCustomDeathLoot(source, looting, recentlyHitIn);
        spawnAtLocation(new ItemStack((ItemLike) LatexModItems.HERTXVISOR.get()));
    }

    public SoundEvent getAmbientSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:robot_beep"));
    }

    public void playStepSound(BlockPos pos, BlockState blockIn) {
        playSound((SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15f, 1.0f);
    }

    public SoundEvent getHurtSound(DamageSource ds) {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
    }

    public SoundEvent getDeathSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:death_beep"));
    }

    public boolean hurt(DamageSource source, float amount) {
        if (source == DamageSource.FALL || source == DamageSource.CACTUS || source == DamageSource.DROWN) {
            return false;
        }
        return hurt(source, amount);
    }

    public void die(DamageSource source) {
        die(source);
        HertxEntityDiesProcedure.execute(this.level, getX(), getY(), getZ());
    }

    public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = finalizeSpawn(world, difficulty, reason, livingdata, tag);
        HertxOnInitialEntitySpawnProcedure.execute(world, getX(), getY(), getZ(), this);
        return retval;
    }

    public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
        ItemStack itemstack = sourceentity.getItemInHand(hand);
        InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
        Item item = itemstack.getItem();
        if (itemstack.getItem() instanceof SpawnEggItem) {
            retval = mobInteract(sourceentity, hand);
        } else if (this.level.isClientSide()) {
            if ((!isTame() || !isOwnedBy(sourceentity)) && !isFood(itemstack)) {
                retval = InteractionResult.PASS;
            } else {
                retval = InteractionResult.sidedSuccess(this.level.isClientSide());
            }
        } else if (isTame()) {
            if (isOwnedBy(sourceentity)) {
                if (item.isEdible() && isFood(itemstack) && getHealth() < getMaxHealth()) {
                    usePlayerItem(sourceentity, hand, itemstack);
                    heal((float) item.getFoodProperties().getNutrition());
                    retval = InteractionResult.sidedSuccess(this.level.isClientSide());
                } else if (!isFood(itemstack) || getHealth() >= getMaxHealth()) {
                    retval = mobInteract(sourceentity, hand);
                } else {
                    usePlayerItem(sourceentity, hand, itemstack);
                    heal(4.0f);
                    retval = InteractionResult.sidedSuccess(this.level.isClientSide());
                }
            }
        } else if (isFood(itemstack)) {
            usePlayerItem(sourceentity, hand, itemstack);
            if (this.random.nextInt(3) != 0 || ForgeEventFactory.onAnimalTame(this, sourceentity)) {
                this.level.broadcastEntityEvent(this, (byte) 6);
            } else {
                tame(sourceentity);
                this.level.broadcastEntityEvent(this, (byte) 7);
            }
            setPersistenceRequired();
            retval = InteractionResult.sidedSuccess(this.level.isClientSide());
        } else {
            retval = mobInteract(sourceentity, hand);
            if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
                setPersistenceRequired();
            }
        }
        AHVHertxRightClickedOnEntityProcedure.execute(this.level, getX(), getY(), getZ(), this, sourceentity);
        return retval;
    }

    public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
        awardKillScore(entity, score, damageSource);
        HertxThisEntityKillsAnotherOneProcedure.execute(this.level, getX(), getY(), getZ(), entity);
    }

    public void playerTouch(Player sourceentity) {
        playerTouch(sourceentity);
        HertxPlayerCollidesWithThisEntityProcedure.execute(this);
    }

    public AgeableMob getBreedOffspring(ServerLevel serverWorld, AgeableMob ageable) {
        AHVHertxEntity retval = ((EntityType) LatexModEntities.AHV_HERTX.get()).create(serverWorld);
        retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, null, null);
        return retval;
    }

    public boolean isFood(ItemStack stack) {
        return List.of((Item) ChangedItems.DARK_LATEX_GOO.get(), Items.SLIME_BALL).contains(stack.getItem());
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.3d).add(Attributes.MAX_HEALTH, 50.0d).add(Attributes.ARMOR, 6.0d).add(Attributes.ATTACK_DAMAGE, 6.0d).add(Attributes.FOLLOW_RANGE, 16.0d).add(Attributes.KNOCKBACK_RESISTANCE, 0.5d).add(Attributes.ATTACK_KNOCKBACK, 0.5d);
    }
}
