package net.ltxprogrammer.turned.entity;

import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
import net.ltxprogrammer.changed.block.AbstractLatexBlock;
import net.ltxprogrammer.changed.entity.LatexType;
import net.ltxprogrammer.changed.init.ChangedBlocks;
import net.ltxprogrammer.changed.init.ChangedItems;
import net.ltxprogrammer.turned.entity.p000ai.RevertBlockStateGoal;
import net.ltxprogrammer.turned.entity.p000ai.TargetCheck;
import net.ltxprogrammer.turned.init.LatexModBlocks;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.ltxprogrammer.turned.init.LatexModItems;
import net.ltxprogrammer.turned.procedures.CheckiftamedProcedure;
import net.ltxprogrammer.turned.procedures.SlimelingEntityDiesProcedure;
import net.ltxprogrammer.turned.procedures.SlimelingTamedOnInitialEntitySpawnProcedure;
import net.ltxprogrammer.turned.procedures.SlimelingTamedRightClickedOnEntityProcedure;
import net.ltxprogrammer.turned.procedures.SlimelingThisEntityKillsAnotherOneProcedure;
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
import net.minecraft.world.entity.AreaEffectCloud;
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
import net.minecraft.world.entity.ai.goal.RemoveBlockGoal;
import net.minecraft.world.entity.ai.goal.TemptGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.OwnerHurtTargetGoal;
import net.minecraft.world.entity.monster.Evoker;
import net.minecraft.world.entity.monster.Illusioner;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.monster.Vindicator;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.npc.WanderingTrader;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.event.ForgeEventFactory;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/entity/SlimelingTamedEntity.class */
public class SlimelingTamedEntity extends TamableAnimal {
    public SlimelingTamedEntity(PlayMessages.SpawnEntity packet, Level world) {
        this(LatexModEntities.SLIMELING_TAMED.get(), world);
    }

    public SlimelingTamedEntity(EntityType<SlimelingTamedEntity> type, Level world) {
        super(type, world);
        this.xpReward = 4;
        setNoAi(false);
        setPersistenceRequired();
    }

    public @NotNull Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    protected void registerGoals() {
        registerGoals();
        this.goalSelector.addGoal(1, new FollowOwnerGoal(this, 0.9d, 12.0f, 2.0f, false));
        this.targetSelector.addGoal(2, new OwnerHurtTargetGoal(this));
        this.goalSelector.addGoal(3, new OwnerHurtByTargetGoal(this));
        this.goalSelector.addGoal(4, new MeleeAttackGoal(this, 1.2d, false) { // from class: net.ltxprogrammer.turned.entity.SlimelingTamedEntity.1
            protected double getAttackReachSqr(@NotNull LivingEntity entity) {
                return 4.0d + ((double) (entity.getBbWidth() * entity.getBbWidth()));
            }
        });
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal<>(this, LivingEntity.class, 10, false, false, TargetCheck.IS_LATEX));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal<>(this, Mob.class, 10, true, false, TargetCheck.IS_EVIL));
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, Pillager.class, true, false) { // from class: net.ltxprogrammer.turned.entity.SlimelingTamedEntity.2
            public boolean canUse() {
                return canUse() && CheckiftamedProcedure.execute(SlimelingTamedEntity.this.level, SlimelingTamedEntity.this.getX(), SlimelingTamedEntity.this.getY(), SlimelingTamedEntity.this.getZ(), SlimelingTamedEntity.this);
            }
        });
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, Vindicator.class, true, false) { // from class: net.ltxprogrammer.turned.entity.SlimelingTamedEntity.3
            public boolean canUse() {
                return canUse() && CheckiftamedProcedure.execute(SlimelingTamedEntity.this.level, SlimelingTamedEntity.this.getX(), SlimelingTamedEntity.this.getY(), SlimelingTamedEntity.this.getZ(), SlimelingTamedEntity.this);
            }
        });
        this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, Illusioner.class, true, false) { // from class: net.ltxprogrammer.turned.entity.SlimelingTamedEntity.4
            public boolean canUse() {
                return canUse() && CheckiftamedProcedure.execute(SlimelingTamedEntity.this.level, SlimelingTamedEntity.this.getX(), SlimelingTamedEntity.this.getY(), SlimelingTamedEntity.this.getZ(), SlimelingTamedEntity.this);
            }
        });
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, Evoker.class, true, false) { // from class: net.ltxprogrammer.turned.entity.SlimelingTamedEntity.5
            public boolean canUse() {
                return canUse() && CheckiftamedProcedure.execute(SlimelingTamedEntity.this.level, SlimelingTamedEntity.this.getX(), SlimelingTamedEntity.this.getY(), SlimelingTamedEntity.this.getZ(), SlimelingTamedEntity.this);
            }
        });
        this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, PiglinBrute.class, true, false) { // from class: net.ltxprogrammer.turned.entity.SlimelingTamedEntity.6
            public boolean canUse() {
                return canUse() && CheckiftamedProcedure.execute(SlimelingTamedEntity.this.level, SlimelingTamedEntity.this.getX(), SlimelingTamedEntity.this.getY(), SlimelingTamedEntity.this.getZ(), SlimelingTamedEntity.this);
            }
        });
        this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, Piglin.class, true, false) { // from class: net.ltxprogrammer.turned.entity.SlimelingTamedEntity.7
            public boolean canUse() {
                return canUse() && CheckiftamedProcedure.execute(SlimelingTamedEntity.this.level, SlimelingTamedEntity.this.getX(), SlimelingTamedEntity.this.getY(), SlimelingTamedEntity.this.getZ(), SlimelingTamedEntity.this);
            }
        });
        this.goalSelector.addGoal(12, new RevertBlockStateGoal<>(AbstractLatexBlock.COVERED, LatexType.DARK_LATEX, LatexType.NEUTRAL, this, 1.0d, 3));
        this.goalSelector.addGoal(12, new RevertBlockStateGoal<>(AbstractLatexBlock.COVERED, LatexType.WHITE_LATEX, LatexType.NEUTRAL, this, 1.0d, 3));
        this.goalSelector.addGoal(13, new RemoveBlockGoal(ChangedBlocks.DARK_LATEX_ICE.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(14, new RemoveBlockGoal(ChangedBlocks.LATEX_CRYSTAL.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(15, new RemoveBlockGoal(ChangedBlocks.DARK_LATEX_BLOCK.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(20, new RemoveBlockGoal(LatexModBlocks.DARKLATEXHIVE.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(20, new RemoveBlockGoal(LatexModBlocks.DARKLATEXHIVE.get(), this, 1.0d, 3));
        this.goalSelector.addGoal(21, new LookAtPlayerGoal(this, Player.class, 9.0f));
        this.goalSelector.addGoal(22, new LookAtPlayerGoal(this, ScientistEntity.class, 9.0f));
        this.goalSelector.addGoal(23, new LookAtPlayerGoal(this, Villager.class, 9.0f));
        this.goalSelector.addGoal(24, new LookAtPlayerGoal(this, WanderingTrader.class, 9.0f));
        this.goalSelector.addGoal(25, new TemptGoal(this, 0.6d, Ingredient.of((ItemLike) ChangedItems.DARK_LATEX_GOO.get()), true) { // from class: net.ltxprogrammer.turned.entity.SlimelingTamedEntity.8
            public boolean canUse() {
                return canUse() && CheckiftamedProcedure.execute(SlimelingTamedEntity.this.level, SlimelingTamedEntity.this.getX(), SlimelingTamedEntity.this.getY(), SlimelingTamedEntity.this.getZ(), SlimelingTamedEntity.this);
            }
        });
        this.goalSelector.addGoal(26, new TemptGoal(this, 0.6d, Ingredient.of(Items.SLIME_BALL), true) { // from class: net.ltxprogrammer.turned.entity.SlimelingTamedEntity.9
            public boolean canUse() {
                return canUse() && CheckiftamedProcedure.execute(SlimelingTamedEntity.this.level, SlimelingTamedEntity.this.getX(), SlimelingTamedEntity.this.getY(), SlimelingTamedEntity.this.getZ(), SlimelingTamedEntity.this);
            }
        });
        this.goalSelector.addGoal(27, new TemptGoal(this, 0.7d, Ingredient.of((ItemLike) LatexModItems.LATEX_SOUP.get()), true) { // from class: net.ltxprogrammer.turned.entity.SlimelingTamedEntity.10
            public boolean canUse() {
                return canUse() && CheckiftamedProcedure.execute(SlimelingTamedEntity.this.level, SlimelingTamedEntity.this.getX(), SlimelingTamedEntity.this.getY(), SlimelingTamedEntity.this.getZ(), SlimelingTamedEntity.this);
            }
        });
        this.goalSelector.addGoal(28, new RandomStrollGoal(this, 1.0d));
        this.goalSelector.addGoal(29, new OpenDoorGoal(this, true));
        this.goalSelector.addGoal(30, new OpenDoorGoal(this, false));
        this.targetSelector.addGoal(31, new HurtByTargetGoal(this).setAlertOthers());
        this.goalSelector.addGoal(32, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(33, new FloatGoal(this));
    }

    protected void dropCustomDeathLoot(@NotNull DamageSource source, int looting, boolean recentlyHitIn) {
        dropCustomDeathLoot(source, looting, recentlyHitIn);
        spawnAtLocation(new ItemStack(LatexModItems.SLIMEESSENCE.get()));
    }

    public void playStepSound(@NotNull BlockPos pos, @NotNull BlockState blockIn) {
        playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15f, 1.0f);
    }

    public SoundEvent getHurtSound(@NotNull DamageSource ds) {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
    }

    public SoundEvent getDeathSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
    }

    public boolean hurt(DamageSource source, float amount) {
        if ((source.getDirectEntity() instanceof ThrownPotion) || (source.getDirectEntity() instanceof AreaEffectCloud) || source == DamageSource.FALL || source == DamageSource.CACTUS || source == DamageSource.WITHER || source.getMsgId().equals("witherSkull")) {
            return false;
        }
        return hurt(source, amount);
    }

    public void die(@NotNull DamageSource source) {
        die(source);
        SlimelingEntityDiesProcedure.execute(this.level, getX(), getY(), getZ());
    }

    public SpawnGroupData finalizeSpawn(@NotNull ServerLevelAccessor world, @NotNull DifficultyInstance difficulty, @NotNull MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = finalizeSpawn(world, difficulty, reason, livingdata, tag);
        SlimelingTamedOnInitialEntitySpawnProcedure.execute(world, getX(), getY(), getZ(), this);
        return retval;
    }

    public @NotNull InteractionResult mobInteract(Player sourceentity, @NotNull InteractionHand hand) {
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
                    heal((float) Objects.requireNonNull(item.getFoodProperties()).getNutrition());
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
        SlimelingTamedRightClickedOnEntityProcedure.execute(this.level, getX(), getY(), getZ(), this, sourceentity);
        return retval;
    }

    public void awardKillScore(@NotNull Entity entity, int score, @NotNull DamageSource damageSource) {
        awardKillScore(entity, score, damageSource);
        SlimelingThisEntityKillsAnotherOneProcedure.execute(this.level, getX(), getY(), getZ(), entity, this);
    }

    public AgeableMob getBreedOffspring(@NotNull ServerLevel serverWorld, @NotNull AgeableMob ageable) {
        SlimelingTamedEntity retval = ((EntityType<?>) LatexModEntities.SLIMELING_TAMED.get()).create(serverWorld);
        Objects.requireNonNull(retval).finalizeSpawn(serverWorld, serverWorld.getCurrentDifficultyAt(retval.blockPosition()), MobSpawnType.BREEDING, null, null);
        return retval;
    }

    public boolean isFood(ItemStack stack) {
        return List.of(ChangedItems.DARK_LATEX_GOO.get(), Items.SLIME_BALL, LatexModItems.LATEX_SOUP.get()).contains(stack.getItem());
    }

    public static void init() {
        DungeonHooks.addDungeonMob(LatexModEntities.SLIMELING_TAMED.get(), 180);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.3d).add(Attributes.MAX_HEALTH, 20.0d).add(Attributes.ARMOR, 0.0d).add(Attributes.ATTACK_DAMAGE, 2.0d).add(Attributes.FOLLOW_RANGE, 16.0d);
    }
}
