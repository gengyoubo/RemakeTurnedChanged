package net.mcreator.latexes.entity;

import java.util.List;
import javax.annotation.Nullable;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModItems;
import net.mcreator.latexes.procedures.CheckiftamedProcedure;
import net.mcreator.latexes.procedures.HertxEntityDiesProcedure;
import net.mcreator.latexes.procedures.HertxOnInitialEntitySpawnProcedure;
import net.mcreator.latexes.procedures.HertxPlayerCollidesWithThisEntityProcedure;
import net.mcreator.latexes.procedures.HertxThisEntityKillsAnotherOneProcedure;
import net.mcreator.latexes.procedures.NXTHertxRightClickedOnEntityProcedure;
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
import net.minecraft.world.entity.PathfinderMob;
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
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtTargetGoal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/NXTHertxEntity.class */
public class NXTHertxEntity extends TamableAnimal {
    public NXTHertxEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.NXT_HERTX.get(), world);
    }

    public NXTHertxEntity(EntityType<NXTHertxEntity> type, Level world) {
        super(type, world);
        this.xpReward = 15;
        setNoAi(false);
        setPersistenceRequired();
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    /* renamed from: net.mcreator.latexes.entity.NXTHertxEntity$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/NXTHertxEntity$1.class */
    class AnonymousClass1 extends MeleeAttackGoal {
        AnonymousClass1(PathfinderMob arg0, double arg1, boolean arg2) {
            super(arg0, arg1, arg2);
        }

        protected double getAttackReachSqr(LivingEntity entity) {
            return 4.0d + ((double) (entity.getBbWidth() * entity.getBbWidth()));
        }
    }

    protected void registerGoals() {
        registerGoals();
        this.goalSelector.addGoal(1, new AnonymousClass1(this, 1.2d, false));
        this.targetSelector.addGoal(2, new AnonymousClass2(this, SlimelingEntity.class, false, false));
        this.goalSelector.addGoal(3, new OwnerHurtByTargetGoal(this));
        this.targetSelector.addGoal(4, new OwnerHurtTargetGoal(this));
        this.goalSelector.addGoal(5, new FollowOwnerGoal(this, 1.0d, 2.0f, 48.0f, false));
        this.goalSelector.addGoal(6, new OpenDoorGoal(this, true));
        this.goalSelector.addGoal(7, new OpenDoorGoal(this, false));
        this.goalSelector.addGoal(8, new LookAtPlayerGoal(this, DarklatexEntity.class, 6.0f));
        this.goalSelector.addGoal(9, new RandomStrollGoal(this, 1.0d));
        this.targetSelector.addGoal(10, new HurtByTargetGoal(this, new Class[0]));
        this.goalSelector.addGoal(11, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(12, new FloatGoal(this));
    }

    /* renamed from: net.mcreator.latexes.entity.NXTHertxEntity$2  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/NXTHertxEntity$2.class */
    class AnonymousClass2 extends NearestAttackableTargetGoal {
        AnonymousClass2(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            return canUse() && CheckiftamedProcedure.execute(NXTHertxEntity.this.level, NXTHertxEntity.this.getX(), NXTHertxEntity.this.getY(), NXTHertxEntity.this.getZ(), NXTHertxEntity.this);
        }
    }

    public MobType getMobType() {
        return MobType.UNDEFINED;
    }

    public boolean removeWhenFarAway(double distanceToClosestPlayer) {
        return false;
    }

    public SoundEvent getAmbientSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:robot_beep"));
    }

    public void playStepSound(BlockPos pos, BlockState blockIn) {
        playSound((SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15f, 1.0f);
    }

    public SoundEvent getHurtSound(DamageSource ds) {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
    }

    public SoundEvent getDeathSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:death_beep"));
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
        NXTHertxRightClickedOnEntityProcedure.execute(this.level, getX(), getY(), getZ(), this, sourceentity);
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
        NXTHertxEntity retval = ((EntityType) LatexModEntities.NXT_HERTX.get()).create(serverWorld);
        retval.finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, null, null);
        return retval;
    }

    public boolean isFood(ItemStack stack) {
        return List.of((Item) LatexModItems.DARKLATEXGOO.get(), Items.REDSTONE, (Item) LatexModItems.BATTERY.get()).contains(stack.getItem());
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.3d).add(Attributes.MAX_HEALTH, 50.0d).add(Attributes.ARMOR, 8.0d).add(Attributes.ATTACK_DAMAGE, 6.0d).add(Attributes.FOLLOW_RANGE, 16.0d).add(Attributes.KNOCKBACK_RESISTANCE, 1.0d);
    }
}
