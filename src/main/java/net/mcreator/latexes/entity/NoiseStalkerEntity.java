package net.mcreator.latexes.entity;

import javax.annotation.Nullable;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModItems;
import net.mcreator.latexes.procedures.CheckSlimelingProcedure;
import net.mcreator.latexes.procedures.DarklatexEntityDiesProcedure;
import net.mcreator.latexes.procedures.NightstalkertestPlayerCollidesWithThisEntityProcedure;
import net.mcreator.latexes.procedures.NoiseStalkerDetectGameruleProcedure;
import net.mcreator.latexes.procedures.NoiseStalkerOnInitialEntitySpawnProcedure;
import net.mcreator.latexes.procedures.NoiseStalkerThisEntityKillsAnotherOneProcedure;
import net.mcreator.latexes.procedures.TargetwearingmaskProcedure;
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
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/NoiseStalkerEntity.class */
public class NoiseStalkerEntity extends Monster {
    public NoiseStalkerEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.NOISE_STALKER.get(), world);
    }

    public NoiseStalkerEntity(EntityType<NoiseStalkerEntity> type, Level world) {
        super(type, world);
        this.xpReward = 10;
        setNoAi(false);
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    protected void registerGoals() {
        registerGoals();
        this.goalSelector.addGoal(1, new BreakDoorGoal(this, e -> {
            return true;
        }));
        this.goalSelector.addGoal(2, new AnonymousClass1(this, 1.2d, true));
        this.targetSelector.addGoal(3, new HurtByTargetGoal(this, new Class[0]).setAlertOthers(new Class[0]));
        this.targetSelector.addGoal(4, new AnonymousClass2(this, PathfinderMob.class, false, true));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, MilitaryEntity.class, false, true));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, ScientistEntity.class, false, true));
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, MilitaryflameunitEntity.class, false, true));
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, EvilScientistEntity.class, false, true));
        this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, EvilSniperEntity.class, false, true));
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, EvilMilitaryEntity.class, false, true));
        this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, Player.class, false, true));
        this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, Villager.class, false, true));
        this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, WanderingTrader.class, false, true));
        this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, IronGolem.class, false, true));
        this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, Witch.class, false, true));
        this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, Pillager.class, false, true));
        this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, Vindicator.class, false, true));
        this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, Evoker.class, false, true));
        this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, Zombie.class, false, true));
        this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, ZombieVillager.class, false, true));
        this.targetSelector.addGoal(21, new NearestAttackableTargetGoal(this, Piglin.class, false, true));
        this.targetSelector.addGoal(22, new NearestAttackableTargetGoal(this, ZombifiedPiglin.class, false, true));
        this.targetSelector.addGoal(23, new NearestAttackableTargetGoal(this, PiglinBrute.class, false, true));
        this.targetSelector.addGoal(24, new NearestAttackableTargetGoal(this, Zoglin.class, false, true));
        this.goalSelector.addGoal(25, new AnonymousClass3(Blocks.SMOOTH_STONE, this, 1.0d, 3));
        this.goalSelector.addGoal(26, new AnonymousClass4(Blocks.SMOOTH_SANDSTONE, this, 1.0d, 3));
        this.goalSelector.addGoal(27, new AnonymousClass5(Blocks.SMOOTH_RED_SANDSTONE, this, 1.0d, 3));
        this.goalSelector.addGoal(28, new AnonymousClass6(Blocks.BIRCH_DOOR, this, 1.0d, 3));
        this.goalSelector.addGoal(29, new AnonymousClass7(Blocks.SPRUCE_DOOR, this, 1.0d, 3));
        this.goalSelector.addGoal(30, new AnonymousClass8(Blocks.OAK_DOOR, this, 1.0d, 3));
        this.goalSelector.addGoal(31, new AnonymousClass9(Blocks.JUNGLE_DOOR, this, 1.0d, 3));
        this.goalSelector.addGoal(32, new AnonymousClass10(Blocks.ACACIA_DOOR, this, 1.0d, 3));
        this.goalSelector.addGoal(33, new AnonymousClass11(Blocks.DARK_OAK_DOOR, this, 1.0d, 3));
        this.goalSelector.addGoal(34, new AnonymousClass12(Blocks.CRIMSON_DOOR, this, 1.0d, 3));
        this.goalSelector.addGoal(35, new AnonymousClass13(Blocks.WARPED_DOOR, this, 1.0d, 3));
        this.goalSelector.addGoal(36, new RandomStrollGoal(this, 0.8d));
        this.goalSelector.addGoal(37, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(38, new FloatGoal(this));
    }

    /* renamed from: net.mcreator.latexes.entity.NoiseStalkerEntity$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/NoiseStalkerEntity$1.class */
    class AnonymousClass1 extends MeleeAttackGoal {
        AnonymousClass1(PathfinderMob arg0, double arg1, boolean arg2) {
            super(arg0, arg1, arg2);
        }

        protected double getAttackReachSqr(LivingEntity entity) {
            return 4.0d + ((double) (entity.getBbWidth() * entity.getBbWidth()));
        }

        public boolean canUse() {
            NoiseStalkerEntity.this.getX();
            NoiseStalkerEntity.this.getY();
            NoiseStalkerEntity.this.getZ();
            Entity entity = NoiseStalkerEntity.this;
            Level level = NoiseStalkerEntity.this.level;
            return canUse() && TargetwearingmaskProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.NoiseStalkerEntity$2  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/NoiseStalkerEntity$2.class */
    class AnonymousClass2 extends NearestAttackableTargetGoal {
        AnonymousClass2(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            NoiseStalkerEntity.this.getX();
            NoiseStalkerEntity.this.getY();
            NoiseStalkerEntity.this.getZ();
            Entity entity = NoiseStalkerEntity.this;
            Level level = NoiseStalkerEntity.this.level;
            return canUse() && CheckSlimelingProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.NoiseStalkerEntity$3  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/NoiseStalkerEntity$3.class */
    class AnonymousClass3 extends RemoveBlockGoal {
        AnonymousClass3(Block arg0, PathfinderMob arg1, double arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            NoiseStalkerEntity.this.getX();
            NoiseStalkerEntity.this.getY();
            NoiseStalkerEntity.this.getZ();
            NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
            return canUse() && NoiseStalkerDetectGameruleProcedure.execute(NoiseStalkerEntity.this.level);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.NoiseStalkerEntity$4  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/NoiseStalkerEntity$4.class */
    class AnonymousClass4 extends RemoveBlockGoal {
        AnonymousClass4(Block arg0, PathfinderMob arg1, double arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            NoiseStalkerEntity.this.getX();
            NoiseStalkerEntity.this.getY();
            NoiseStalkerEntity.this.getZ();
            NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
            return canUse() && NoiseStalkerDetectGameruleProcedure.execute(NoiseStalkerEntity.this.level);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.NoiseStalkerEntity$5  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/NoiseStalkerEntity$5.class */
    class AnonymousClass5 extends RemoveBlockGoal {
        AnonymousClass5(Block arg0, PathfinderMob arg1, double arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            NoiseStalkerEntity.this.getX();
            NoiseStalkerEntity.this.getY();
            NoiseStalkerEntity.this.getZ();
            NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
            return canUse() && NoiseStalkerDetectGameruleProcedure.execute(NoiseStalkerEntity.this.level);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.NoiseStalkerEntity$6  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/NoiseStalkerEntity$6.class */
    class AnonymousClass6 extends RemoveBlockGoal {
        AnonymousClass6(Block arg0, PathfinderMob arg1, double arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            NoiseStalkerEntity.this.getX();
            NoiseStalkerEntity.this.getY();
            NoiseStalkerEntity.this.getZ();
            NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
            return canUse() && NoiseStalkerDetectGameruleProcedure.execute(NoiseStalkerEntity.this.level);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.NoiseStalkerEntity$7  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/NoiseStalkerEntity$7.class */
    class AnonymousClass7 extends RemoveBlockGoal {
        AnonymousClass7(Block arg0, PathfinderMob arg1, double arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            NoiseStalkerEntity.this.getX();
            NoiseStalkerEntity.this.getY();
            NoiseStalkerEntity.this.getZ();
            NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
            return canUse() && NoiseStalkerDetectGameruleProcedure.execute(NoiseStalkerEntity.this.level);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.NoiseStalkerEntity$8  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/NoiseStalkerEntity$8.class */
    class AnonymousClass8 extends RemoveBlockGoal {
        AnonymousClass8(Block arg0, PathfinderMob arg1, double arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            NoiseStalkerEntity.this.getX();
            NoiseStalkerEntity.this.getY();
            NoiseStalkerEntity.this.getZ();
            NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
            return canUse() && NoiseStalkerDetectGameruleProcedure.execute(NoiseStalkerEntity.this.level);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.NoiseStalkerEntity$9  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/NoiseStalkerEntity$9.class */
    class AnonymousClass9 extends RemoveBlockGoal {
        AnonymousClass9(Block arg0, PathfinderMob arg1, double arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            NoiseStalkerEntity.this.getX();
            NoiseStalkerEntity.this.getY();
            NoiseStalkerEntity.this.getZ();
            NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
            return canUse() && NoiseStalkerDetectGameruleProcedure.execute(NoiseStalkerEntity.this.level);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.NoiseStalkerEntity$10  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/NoiseStalkerEntity$10.class */
    class AnonymousClass10 extends RemoveBlockGoal {
        AnonymousClass10(Block arg0, PathfinderMob arg1, double arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            NoiseStalkerEntity.this.getX();
            NoiseStalkerEntity.this.getY();
            NoiseStalkerEntity.this.getZ();
            NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
            return canUse() && NoiseStalkerDetectGameruleProcedure.execute(NoiseStalkerEntity.this.level);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.NoiseStalkerEntity$11  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/NoiseStalkerEntity$11.class */
    class AnonymousClass11 extends RemoveBlockGoal {
        AnonymousClass11(Block arg0, PathfinderMob arg1, double arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            NoiseStalkerEntity.this.getX();
            NoiseStalkerEntity.this.getY();
            NoiseStalkerEntity.this.getZ();
            NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
            return canUse() && NoiseStalkerDetectGameruleProcedure.execute(NoiseStalkerEntity.this.level);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.NoiseStalkerEntity$12  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/NoiseStalkerEntity$12.class */
    class AnonymousClass12 extends RemoveBlockGoal {
        AnonymousClass12(Block arg0, PathfinderMob arg1, double arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            NoiseStalkerEntity.this.getX();
            NoiseStalkerEntity.this.getY();
            NoiseStalkerEntity.this.getZ();
            NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
            return canUse() && NoiseStalkerDetectGameruleProcedure.execute(NoiseStalkerEntity.this.level);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.NoiseStalkerEntity$13  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/NoiseStalkerEntity$13.class */
    class AnonymousClass13 extends RemoveBlockGoal {
        AnonymousClass13(Block arg0, PathfinderMob arg1, double arg2, int arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            NoiseStalkerEntity.this.getX();
            NoiseStalkerEntity.this.getY();
            NoiseStalkerEntity.this.getZ();
            NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
            return canUse() && NoiseStalkerDetectGameruleProcedure.execute(NoiseStalkerEntity.this.level);
        }
    }

    public MobType getMobType() {
        return MobType.ARTHROPOD;
    }

    protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
        dropCustomDeathLoot(source, looting, recentlyHitIn);
        spawnAtLocation(new ItemStack((ItemLike) LatexModItems.DARKLATEXGOO.get()));
    }

    public SoundEvent getAmbientSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ravager.ambient"));
    }

    public void playStepSound(BlockPos pos, BlockState blockIn) {
        playSound((SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15f, 1.0f);
    }

    public SoundEvent getHurtSound(DamageSource ds) {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ravager.hurt"));
    }

    public SoundEvent getDeathSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
    }

    public boolean hurt(DamageSource source, float amount) {
        if (source == DamageSource.FALL || source == DamageSource.CACTUS) {
            return false;
        }
        return hurt(source, amount);
    }

    public void die(DamageSource source) {
        die(source);
        DarklatexEntityDiesProcedure.execute(this.level, getX(), getY(), getZ(), this);
    }

    public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = finalizeSpawn(world, difficulty, reason, livingdata, tag);
        NoiseStalkerOnInitialEntitySpawnProcedure.execute(this);
        return retval;
    }

    public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
        awardKillScore(entity, score, damageSource);
        NoiseStalkerThisEntityKillsAnotherOneProcedure.execute(this.level, getX(), getY(), getZ(), entity, this);
    }

    public void playerTouch(Player sourceentity) {
        playerTouch(sourceentity);
        NightstalkertestPlayerCollidesWithThisEntityProcedure.execute(this);
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.28d).add(Attributes.MAX_HEALTH, 48.0d).add(Attributes.ARMOR, 4.0d).add(Attributes.ATTACK_DAMAGE, 6.0d).add(Attributes.FOLLOW_RANGE, 24.0d).add(Attributes.KNOCKBACK_RESISTANCE, 0.5d).add(Attributes.ATTACK_KNOCKBACK, 0.2d);
    }
}
