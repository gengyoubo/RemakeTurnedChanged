package net.mcreator.latexes.entity;

import java.util.EnumSet;
import java.util.Random;
import javax.annotation.Nullable;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModItems;
import net.mcreator.latexes.procedures.DarklatexEntityDiesProcedure;
import net.mcreator.latexes.procedures.DarklatexOnInitialEntitySpawnProcedure;
import net.mcreator.latexes.procedures.DarklatexThisEntityKillsAnotherOneProcedure;
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
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.LeapAtTargetGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.animal.Fox;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Evoker;
import net.minecraft.world.entity.monster.Guardian;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.monster.Vindicator;
import net.minecraft.world.entity.monster.Witch;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.npc.WanderingTrader;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/DarkLatexMothEntity.class */
public class DarkLatexMothEntity extends Monster {
    public DarkLatexMothEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.DARK_LATEX_MOTH.get(), world);
    }

    public DarkLatexMothEntity(EntityType<DarkLatexMothEntity> type, Level world) {
        super(type, world);
        this.xpReward = 5;
        setNoAi(false);
        this.moveControl = new FlyingMoveControl(this, 10, true);
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    protected PathNavigation createNavigation(Level world) {
        return new FlyingPathNavigation(this, world);
    }

    /* renamed from: net.mcreator.latexes.entity.DarkLatexMothEntity$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/DarkLatexMothEntity$1.class */
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
        this.goalSelector.addGoal(1, new AnonymousClass1(this, 1.1d, false));
        this.goalSelector.addGoal(2, new AnonymousClass2());
        this.targetSelector.addGoal(3, new HurtByTargetGoal(this, new Class[0]).setAlertOthers(new Class[0]));
        this.targetSelector.addGoal(5, new AnonymousClass3(this, SlimelingEntity.class, false, false));
        this.targetSelector.addGoal(6, new AnonymousClass4(this, MilitaryflameunitEntity.class, true, false));
        this.targetSelector.addGoal(7, new AnonymousClass5(this, ScientistEntity.class, true, false));
        this.targetSelector.addGoal(8, new AnonymousClass6(this, MilitaryEntity.class, true, false));
        this.targetSelector.addGoal(9, new AnonymousClass7(this, EvilScientistEntity.class, true, false));
        this.targetSelector.addGoal(10, new AnonymousClass8(this, EvilSniperEntity.class, true, false));
        this.targetSelector.addGoal(11, new AnonymousClass9(this, EvilMilitaryEntity.class, true, false));
        this.targetSelector.addGoal(12, new AnonymousClass10(this, Player.class, true, false));
        this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, WanderingTrader.class, true, false));
        this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, Villager.class, true, false));
        this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, IronGolem.class, true, false));
        this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, Witch.class, true, false));
        this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, Pillager.class, true, false));
        this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, Vindicator.class, true, false));
        this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, Evoker.class, true, false));
        this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, Guardian.class, true, false));
        this.targetSelector.addGoal(21, new NearestAttackableTargetGoal(this, Bee.class, true, false));
        this.targetSelector.addGoal(22, new NearestAttackableTargetGoal(this, Fox.class, true, false));
        this.targetSelector.addGoal(23, new NearestAttackableTargetGoal(this, Zombie.class, true, false));
        this.targetSelector.addGoal(24, new NearestAttackableTargetGoal(this, ZombieVillager.class, true, false));
        this.targetSelector.addGoal(25, new NearestAttackableTargetGoal(this, Piglin.class, true, false));
        this.targetSelector.addGoal(26, new NearestAttackableTargetGoal(this, PiglinBrute.class, true, false));
        this.goalSelector.addGoal(27, new AnonymousClass11(this, 0.8d, 20));
        this.goalSelector.addGoal(28, new RandomStrollGoal(this, 0.8d));
        this.goalSelector.addGoal(29, new LookAtPlayerGoal(this, LivingEntity.class, 5.0f));
        this.goalSelector.addGoal(30, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(31, new FloatGoal(this));
        this.goalSelector.addGoal(32, new LeapAtTargetGoal(this, 0.5f));
    }

    /* renamed from: net.mcreator.latexes.entity.DarkLatexMothEntity$2  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/DarkLatexMothEntity$2.class */
    class AnonymousClass2 extends Goal {
        AnonymousClass2() {
            setFlags(EnumSet.of(Goal.Flag.MOVE));
        }

        public boolean canUse() {
            if (DarkLatexMothEntity.this.getTarget() == null || DarkLatexMothEntity.this.getMoveControl().hasWanted()) {
                return false;
            }
            return true;
        }

        public boolean canContinueToUse() {
            return DarkLatexMothEntity.this.getMoveControl().hasWanted() && DarkLatexMothEntity.this.getTarget() != null && DarkLatexMothEntity.this.getTarget().isAlive();
        }

        public void start() {
            Vec3 vec3d = DarkLatexMothEntity.this.getTarget().getEyePosition(1.0f);
            DarkLatexMothEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1.0d);
        }

        public void tick() {
            LivingEntity livingentity = DarkLatexMothEntity.this.getTarget();
            if (DarkLatexMothEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
                DarkLatexMothEntity.this.doHurtTarget(livingentity);
            } else if (DarkLatexMothEntity.this.distanceToSqr(livingentity) < 9.0d) {
                Vec3 vec3d = livingentity.getEyePosition(1.0f);
                DarkLatexMothEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1.0d);
            }
        }
    }

    /* renamed from: net.mcreator.latexes.entity.DarkLatexMothEntity$3  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/DarkLatexMothEntity$3.class */
    class AnonymousClass3 extends NearestAttackableTargetGoal {
        AnonymousClass3(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            DarkLatexMothEntity.this.getX();
            DarkLatexMothEntity.this.getY();
            DarkLatexMothEntity.this.getZ();
            Entity entity = DarkLatexMothEntity.this;
            Level level = DarkLatexMothEntity.this.level;
            return canUse() && TargetwearingmaskProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.DarkLatexMothEntity$4  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/DarkLatexMothEntity$4.class */
    class AnonymousClass4 extends NearestAttackableTargetGoal {
        AnonymousClass4(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            DarkLatexMothEntity.this.getX();
            DarkLatexMothEntity.this.getY();
            DarkLatexMothEntity.this.getZ();
            Entity entity = DarkLatexMothEntity.this;
            Level level = DarkLatexMothEntity.this.level;
            return canUse() && TargetwearingmaskProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.DarkLatexMothEntity$5  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/DarkLatexMothEntity$5.class */
    class AnonymousClass5 extends NearestAttackableTargetGoal {
        AnonymousClass5(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            DarkLatexMothEntity.this.getX();
            DarkLatexMothEntity.this.getY();
            DarkLatexMothEntity.this.getZ();
            Entity entity = DarkLatexMothEntity.this;
            Level level = DarkLatexMothEntity.this.level;
            return canUse() && TargetwearingmaskProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.DarkLatexMothEntity$6  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/DarkLatexMothEntity$6.class */
    class AnonymousClass6 extends NearestAttackableTargetGoal {
        AnonymousClass6(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            DarkLatexMothEntity.this.getX();
            DarkLatexMothEntity.this.getY();
            DarkLatexMothEntity.this.getZ();
            Entity entity = DarkLatexMothEntity.this;
            Level level = DarkLatexMothEntity.this.level;
            return canUse() && TargetwearingmaskProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.DarkLatexMothEntity$7  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/DarkLatexMothEntity$7.class */
    class AnonymousClass7 extends NearestAttackableTargetGoal {
        AnonymousClass7(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            DarkLatexMothEntity.this.getX();
            DarkLatexMothEntity.this.getY();
            DarkLatexMothEntity.this.getZ();
            Entity entity = DarkLatexMothEntity.this;
            Level level = DarkLatexMothEntity.this.level;
            return canUse() && TargetwearingmaskProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.DarkLatexMothEntity$8  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/DarkLatexMothEntity$8.class */
    class AnonymousClass8 extends NearestAttackableTargetGoal {
        AnonymousClass8(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            DarkLatexMothEntity.this.getX();
            DarkLatexMothEntity.this.getY();
            DarkLatexMothEntity.this.getZ();
            Entity entity = DarkLatexMothEntity.this;
            Level level = DarkLatexMothEntity.this.level;
            return canUse() && TargetwearingmaskProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.DarkLatexMothEntity$9  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/DarkLatexMothEntity$9.class */
    class AnonymousClass9 extends NearestAttackableTargetGoal {
        AnonymousClass9(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            DarkLatexMothEntity.this.getX();
            DarkLatexMothEntity.this.getY();
            DarkLatexMothEntity.this.getZ();
            Entity entity = DarkLatexMothEntity.this;
            Level level = DarkLatexMothEntity.this.level;
            return canUse() && TargetwearingmaskProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.DarkLatexMothEntity$10  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/DarkLatexMothEntity$10.class */
    class AnonymousClass10 extends NearestAttackableTargetGoal {
        AnonymousClass10(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            DarkLatexMothEntity.this.getX();
            DarkLatexMothEntity.this.getY();
            DarkLatexMothEntity.this.getZ();
            Entity entity = DarkLatexMothEntity.this;
            Level level = DarkLatexMothEntity.this.level;
            return canUse() && TargetwearingmaskProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.DarkLatexMothEntity$11  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/DarkLatexMothEntity$11.class */
    class AnonymousClass11 extends RandomStrollGoal {
        AnonymousClass11(PathfinderMob arg0, double arg1, int arg2) {
            super(arg0, arg1, arg2);
        }

        protected Vec3 getPosition() {
            Random random = DarkLatexMothEntity.this.getRandom();
            return new Vec3(DarkLatexMothEntity.this.getX() + ((double) (((random.nextFloat() * 2.0f) - 1.0f) * 16.0f)), DarkLatexMothEntity.this.getY() + ((double) (((random.nextFloat() * 2.0f) - 1.0f) * 16.0f)), DarkLatexMothEntity.this.getZ() + ((double) (((random.nextFloat() * 2.0f) - 1.0f) * 16.0f)));
        }
    }

    public MobType getMobType() {
        return MobType.ARTHROPOD;
    }

    protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
        dropCustomDeathLoot(source, looting, recentlyHitIn);
        spawnAtLocation(new ItemStack((ItemLike) LatexModItems.DARKLATEXGOO.get()));
    }

    public void playStepSound(BlockPos pos, BlockState blockIn) {
        playSound((SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15f, 1.0f);
    }

    public SoundEvent getHurtSound(DamageSource ds) {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
    }

    public SoundEvent getDeathSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
    }

    public boolean causeFallDamage(float l, float d, DamageSource source) {
        return false;
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
        DarklatexOnInitialEntitySpawnProcedure.execute(this);
        return retval;
    }

    public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
        awardKillScore(entity, score, damageSource);
        DarklatexThisEntityKillsAnotherOneProcedure.execute(this.level, getX(), getY(), getZ(), entity, this);
    }

    protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
    }

    public void setNoGravity(boolean ignored) {
        setNoGravity(true);
    }

    public void aiStep() {
        aiStep();
        setNoGravity(true);
    }

    public static void init() {
        DungeonHooks.addDungeonMob((EntityType) LatexModEntities.DARK_LATEX_MOTH.get(), 180);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.225d).add(Attributes.MAX_HEALTH, 18.0d).add(Attributes.ARMOR, 1.5d).add(Attributes.ATTACK_DAMAGE, 3.0d).add(Attributes.FOLLOW_RANGE, 16.0d).add(Attributes.KNOCKBACK_RESISTANCE, 0.3d).add(Attributes.ATTACK_KNOCKBACK, 0.5d).add(Attributes.FLYING_SPEED, 0.225d);
    }
}
