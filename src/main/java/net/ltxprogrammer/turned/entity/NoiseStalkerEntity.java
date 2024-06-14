package net.ltxprogrammer.turned.entity;

import javax.annotation.Nullable;
import net.ltxprogrammer.changed.init.ChangedItems;
import net.ltxprogrammer.turned.entity.p000ai.TargetCheck;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.ltxprogrammer.turned.procedures.NightstalkertestPlayerCollidesWithThisEntityProcedure;
import net.ltxprogrammer.turned.procedures.NoiseStalkerDetectGameruleProcedure;
import net.ltxprogrammer.turned.procedures.NoiseStalkerOnInitialEntitySpawnProcedure;
import net.ltxprogrammer.turned.procedures.NoiseStalkerThisEntityKillsAnotherOneProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.BreakDoorGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RemoveBlockGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Evoker;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.monster.Vindicator;
import net.minecraft.world.entity.monster.Witch;
import net.minecraft.world.entity.monster.Zoglin;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.minecraft.world.entity.monster.ZombifiedPiglin;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.npc.WanderingTrader;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/entity/NoiseStalkerEntity.class */
public class NoiseStalkerEntity extends Monster {
    public NoiseStalkerEntity(PlayMessages.SpawnEntity packet, Level world) {
        this(LatexModEntities.NOISE_STALKER.get(), world);
    }

    public NoiseStalkerEntity(EntityType<NoiseStalkerEntity> type, Level world) {
        super(type, world);
        this.xpReward = 10;
        setNoAi(false);
    }

    public @NotNull Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    protected void registerGoals() {
        registerGoals();
        this.goalSelector.addGoal(1, new BreakDoorGoal(this, e -> true));
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.2d, true) { // from class: net.ltxprogrammer.turned.entity.NoiseStalkerEntity.1
            protected double getAttackReachSqr(@NotNull LivingEntity entity) {
                return 4.0d + ((double) (entity.getBbWidth() * entity.getBbWidth()));
            }
        });
        this.targetSelector.addGoal(3, new HurtByTargetGoal(this).setAlertOthers());
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal<>(this, PathfinderMob.class, 10, false, true, TargetCheck.IS_SLIMELING));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal<>(this, MilitaryEntity.class, false, true));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal<>(this, ScientistEntity.class, false, true));
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal<>(this, MilitaryflameunitEntity.class, false, true));
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal<>(this, EvilScientistEntity.class, false, true));
        this.targetSelector.addGoal(9, new NearestAttackableTargetGoal<>(this, EvilSniperEntity.class, false, true));
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal<>(this, EvilMilitaryEntity.class, false, true));
        this.targetSelector.addGoal(11, new NearestAttackableTargetGoal<>(this, Player.class, false, true));
        this.targetSelector.addGoal(12, new NearestAttackableTargetGoal<>(this, Villager.class, false, true));
        this.targetSelector.addGoal(13, new NearestAttackableTargetGoal<>(this, WanderingTrader.class, false, true));
        this.targetSelector.addGoal(14, new NearestAttackableTargetGoal<>(this, IronGolem.class, false, true));
        this.targetSelector.addGoal(15, new NearestAttackableTargetGoal<>(this, Witch.class, false, true));
        this.targetSelector.addGoal(16, new NearestAttackableTargetGoal<>(this, Pillager.class, false, true));
        this.targetSelector.addGoal(17, new NearestAttackableTargetGoal<>(this, Vindicator.class, false, true));
        this.targetSelector.addGoal(18, new NearestAttackableTargetGoal<>(this, Evoker.class, false, true));
        this.targetSelector.addGoal(19, new NearestAttackableTargetGoal<>(this, Zombie.class, false, true));
        this.targetSelector.addGoal(20, new NearestAttackableTargetGoal<>(this, ZombieVillager.class, false, true));
        this.targetSelector.addGoal(21, new NearestAttackableTargetGoal<>(this, Piglin.class, false, true));
        this.targetSelector.addGoal(22, new NearestAttackableTargetGoal<>(this, ZombifiedPiglin.class, false, true));
        this.targetSelector.addGoal(23, new NearestAttackableTargetGoal<>(this, PiglinBrute.class, false, true));
        this.targetSelector.addGoal(24, new NearestAttackableTargetGoal<>(this, Zoglin.class, false, true));
        this.goalSelector.addGoal(25, new RemoveBlockGoal(Blocks.SMOOTH_STONE, this, 1.0d, 3) { // from class: net.ltxprogrammer.turned.entity.NoiseStalkerEntity.2
            public boolean canUse() {
                NoiseStalkerEntity.this.getX();
                NoiseStalkerEntity.this.getY();
                NoiseStalkerEntity.this.getZ();
                NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
                return canUse() && NoiseStalkerDetectGameruleProcedure.execute(NoiseStalkerEntity.this.level);
            }
        });
        this.goalSelector.addGoal(26, new RemoveBlockGoal(Blocks.SMOOTH_SANDSTONE, this, 1.0d, 3) { // from class: net.ltxprogrammer.turned.entity.NoiseStalkerEntity.3
            public boolean canUse() {
                NoiseStalkerEntity.this.getX();
                NoiseStalkerEntity.this.getY();
                NoiseStalkerEntity.this.getZ();
                NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
                return canUse() && NoiseStalkerDetectGameruleProcedure.execute(NoiseStalkerEntity.this.level);
            }
        });
        this.goalSelector.addGoal(27, new RemoveBlockGoal(Blocks.SMOOTH_RED_SANDSTONE, this, 1.0d, 3) { // from class: net.ltxprogrammer.turned.entity.NoiseStalkerEntity.4
            public boolean canUse() {
                NoiseStalkerEntity.this.getX();
                NoiseStalkerEntity.this.getY();
                NoiseStalkerEntity.this.getZ();
                NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
                return canUse() && NoiseStalkerDetectGameruleProcedure.execute(NoiseStalkerEntity.this.level);
            }
        });
        this.goalSelector.addGoal(28, new RemoveBlockGoal(Blocks.BIRCH_DOOR, this, 1.0d, 3) { // from class: net.ltxprogrammer.turned.entity.NoiseStalkerEntity.5
            public boolean canUse() {
                NoiseStalkerEntity.this.getX();
                NoiseStalkerEntity.this.getY();
                NoiseStalkerEntity.this.getZ();
                NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
                return canUse() && NoiseStalkerDetectGameruleProcedure.execute(NoiseStalkerEntity.this.level);
            }
        });
        this.goalSelector.addGoal(29, new RemoveBlockGoal(Blocks.SPRUCE_DOOR, this, 1.0d, 3) { // from class: net.ltxprogrammer.turned.entity.NoiseStalkerEntity.6
            public boolean canUse() {
                NoiseStalkerEntity.this.getX();
                NoiseStalkerEntity.this.getY();
                NoiseStalkerEntity.this.getZ();
                NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
                return canUse() && NoiseStalkerDetectGameruleProcedure.execute(NoiseStalkerEntity.this.level);
            }
        });
        this.goalSelector.addGoal(30, new RemoveBlockGoal(Blocks.OAK_DOOR, this, 1.0d, 3) { // from class: net.ltxprogrammer.turned.entity.NoiseStalkerEntity.7
            public boolean canUse() {
                NoiseStalkerEntity.this.getX();
                NoiseStalkerEntity.this.getY();
                NoiseStalkerEntity.this.getZ();
                NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
                return canUse() && NoiseStalkerDetectGameruleProcedure.execute(NoiseStalkerEntity.this.level);
            }
        });
        this.goalSelector.addGoal(31, new RemoveBlockGoal(Blocks.JUNGLE_DOOR, this, 1.0d, 3) { // from class: net.ltxprogrammer.turned.entity.NoiseStalkerEntity.8
            public boolean canUse() {
                NoiseStalkerEntity.this.getX();
                NoiseStalkerEntity.this.getY();
                NoiseStalkerEntity.this.getZ();
                NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
                return canUse() && NoiseStalkerDetectGameruleProcedure.execute(NoiseStalkerEntity.this.level);
            }
        });
        this.goalSelector.addGoal(32, new RemoveBlockGoal(Blocks.ACACIA_DOOR, this, 1.0d, 3) { // from class: net.ltxprogrammer.turned.entity.NoiseStalkerEntity.9
            public boolean canUse() {
                NoiseStalkerEntity.this.getX();
                NoiseStalkerEntity.this.getY();
                NoiseStalkerEntity.this.getZ();
                NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
                return canUse() && NoiseStalkerDetectGameruleProcedure.execute(NoiseStalkerEntity.this.level);
            }
        });
        this.goalSelector.addGoal(33, new RemoveBlockGoal(Blocks.DARK_OAK_DOOR, this, 1.0d, 3) { // from class: net.ltxprogrammer.turned.entity.NoiseStalkerEntity.10
            public boolean canUse() {
                NoiseStalkerEntity.this.getX();
                NoiseStalkerEntity.this.getY();
                NoiseStalkerEntity.this.getZ();
                NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
                return canUse() && NoiseStalkerDetectGameruleProcedure.execute(NoiseStalkerEntity.this.level);
            }
        });
        this.goalSelector.addGoal(34, new RemoveBlockGoal(Blocks.CRIMSON_DOOR, this, 1.0d, 3) { // from class: net.ltxprogrammer.turned.entity.NoiseStalkerEntity.11
            public boolean canUse() {
                NoiseStalkerEntity.this.getX();
                NoiseStalkerEntity.this.getY();
                NoiseStalkerEntity.this.getZ();
                NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
                return canUse() && NoiseStalkerDetectGameruleProcedure.execute(NoiseStalkerEntity.this.level);
            }
        });
        this.goalSelector.addGoal(35, new RemoveBlockGoal(Blocks.WARPED_DOOR, this, 1.0d, 3) { // from class: net.ltxprogrammer.turned.entity.NoiseStalkerEntity.12
            public boolean canUse() {
                NoiseStalkerEntity.this.getX();
                NoiseStalkerEntity.this.getY();
                NoiseStalkerEntity.this.getZ();
                NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
                return canUse() && NoiseStalkerDetectGameruleProcedure.execute(NoiseStalkerEntity.this.level);
            }
        });
        this.goalSelector.addGoal(36, new RandomStrollGoal(this, 0.8d));
        this.goalSelector.addGoal(37, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(38, new FloatGoal(this));
    }

    public @NotNull MobType getMobType() {
        return MobType.ARTHROPOD;
    }

    protected void dropCustomDeathLoot(@NotNull DamageSource source, int looting, boolean recentlyHitIn) {
        dropCustomDeathLoot(source, looting, recentlyHitIn);
        spawnAtLocation(new ItemStack(ChangedItems.DARK_LATEX_GOO.get()));
    }

    public SoundEvent getAmbientSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ravager.ambient"));
    }

    public void playStepSound(@NotNull BlockPos pos, @NotNull BlockState blockIn) {
        playSound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15f, 1.0f);
    }

    public SoundEvent getHurtSound(@NotNull DamageSource ds) {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ravager.hurt"));
    }

    public SoundEvent getDeathSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
    }

    public boolean hurt(@NotNull DamageSource source, float amount) {
        if (source == DamageSource.FALL || source == DamageSource.CACTUS) {
            return false;
        }
        return hurt(source, amount);
    }

    public SpawnGroupData finalizeSpawn(@NotNull ServerLevelAccessor world, @NotNull DifficultyInstance difficulty, @NotNull MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = finalizeSpawn(world, difficulty, reason, livingdata, tag);
        NoiseStalkerOnInitialEntitySpawnProcedure.execute(this);
        return retval;
    }

    public void awardKillScore(@NotNull Entity entity, int score, @NotNull DamageSource damageSource) {
        awardKillScore(entity, score, damageSource);
        NoiseStalkerThisEntityKillsAnotherOneProcedure.execute(this.level, getX(), getY(), getZ(), entity, this);
    }

    public void playerTouch(@NotNull Player sourceentity) {
        playerTouch(sourceentity);
        NightstalkertestPlayerCollidesWithThisEntityProcedure.execute(this);
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.28d).add(Attributes.MAX_HEALTH, 48.0d).add(Attributes.ARMOR, 4.0d).add(Attributes.ATTACK_DAMAGE, 6.0d).add(Attributes.FOLLOW_RANGE, 24.0d).add(Attributes.KNOCKBACK_RESISTANCE, 0.5d).add(Attributes.ATTACK_KNOCKBACK, 0.2d);
    }
}
