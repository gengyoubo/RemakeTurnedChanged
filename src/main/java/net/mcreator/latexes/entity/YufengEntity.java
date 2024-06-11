package net.mcreator.latexes.entity;

import java.util.EnumSet;
import java.util.Random;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModItems;
import net.mcreator.latexes.procedures.CheckEvilProcedure;
import net.mcreator.latexes.procedures.CheckGoodProcedure;
import net.mcreator.latexes.procedures.CheckSlimelingProcedure;
import net.mcreator.latexes.procedures.TargetwearingmaskProcedure;
import net.mcreator.latexes.procedures.YufengEntityDiesProcedure;
import net.mcreator.latexes.procedures.YufengThisEntityKillsAnotherOneProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Evoker;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.Vindicator;
import net.minecraft.world.entity.monster.Witch;
import net.minecraft.world.entity.monster.Zoglin;
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
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/YufengEntity.class */
public class YufengEntity extends Monster {
    public YufengEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.YUFENG.get(), world);
    }

    public YufengEntity(EntityType<YufengEntity> type, Level world) {
        super(type, world);
        this.xpReward = 8;
        setNoAi(false);
        this.moveControl = new FlyingMoveControl(this, 10, true);
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    protected PathNavigation createNavigation(Level world) {
        return new FlyingPathNavigation(this, world);
    }

    /* renamed from: net.mcreator.latexes.entity.YufengEntity$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/YufengEntity$1.class */
    class AnonymousClass1 extends Goal {
        AnonymousClass1() {
            setFlags(EnumSet.of(Goal.Flag.MOVE));
        }

        public boolean canUse() {
            if (YufengEntity.this.getTarget() == null || YufengEntity.this.getMoveControl().hasWanted()) {
                return false;
            }
            YufengEntity.this.getX();
            YufengEntity.this.getY();
            YufengEntity.this.getZ();
            return TargetwearingmaskProcedure.execute(YufengEntity.this);
        }

        public boolean canContinueToUse() {
            return YufengEntity.this.getMoveControl().hasWanted() && YufengEntity.this.getTarget() != null && YufengEntity.this.getTarget().isAlive();
        }

        public void start() {
            Vec3 vec3d = YufengEntity.this.getTarget().getEyePosition(1.0f);
            YufengEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1.0d);
        }

        public void tick() {
            LivingEntity livingentity = YufengEntity.this.getTarget();
            if (YufengEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
                YufengEntity.this.doHurtTarget(livingentity);
            } else if (YufengEntity.this.distanceToSqr(livingentity) < 16.0d) {
                Vec3 vec3d = livingentity.getEyePosition(1.0f);
                YufengEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1.0d);
            }
        }
    }

    protected void registerGoals() {
        registerGoals();
        this.goalSelector.addGoal(1, new AnonymousClass1());
        this.goalSelector.addGoal(2, new AnonymousClass2(this, 1.0d, true));
        this.targetSelector.addGoal(3, new HurtByTargetGoal(this, new Class[0]).setAlertOthers(new Class[0]));
        this.targetSelector.addGoal(4, new AnonymousClass3(this, LivingEntity.class, false, false));
        this.targetSelector.addGoal(5, new AnonymousClass4(this, LivingEntity.class, true, false));
        this.targetSelector.addGoal(6, new AnonymousClass5(this, LivingEntity.class, true, false));
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, Player.class, true, false));
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, Villager.class, true, false));
        this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, WanderingTrader.class, true, false));
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, IronGolem.class, true, false));
        this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, Witch.class, true, false));
        this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, Pillager.class, true, false));
        this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, Vindicator.class, true, false));
        this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, Evoker.class, true, false));
        this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, Skeleton.class, true, false));
        this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, Zombie.class, true, false));
        this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, ZombieVillager.class, true, false));
        this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, Piglin.class, true, false));
        this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, PiglinBrute.class, true, false));
        this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, Zoglin.class, true, false));
        this.goalSelector.addGoal(21, new WaterAvoidingRandomStrollGoal(this, 0.8d));
        this.goalSelector.addGoal(22, new AnonymousClass6(this, 0.8d, 20));
        this.goalSelector.addGoal(23, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(24, new FloatGoal(this));
    }

    /* renamed from: net.mcreator.latexes.entity.YufengEntity$2  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/YufengEntity$2.class */
    class AnonymousClass2 extends MeleeAttackGoal {
        AnonymousClass2(PathfinderMob arg0, double arg1, boolean arg2) {
            super(arg0, arg1, arg2);
        }

        protected double getAttackReachSqr(LivingEntity entity) {
            return 4.0d + ((double) (entity.getBbWidth() * entity.getBbWidth()));
        }

        public boolean canUse() {
            YufengEntity.this.getX();
            YufengEntity.this.getY();
            YufengEntity.this.getZ();
            Entity entity = YufengEntity.this;
            Level level = YufengEntity.this.level;
            return canUse() && TargetwearingmaskProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.YufengEntity$3  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/YufengEntity$3.class */
    class AnonymousClass3 extends NearestAttackableTargetGoal {
        AnonymousClass3(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            YufengEntity.this.getX();
            YufengEntity.this.getY();
            YufengEntity.this.getZ();
            Entity entity = YufengEntity.this;
            Level level = YufengEntity.this.level;
            return canUse() && CheckSlimelingProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.YufengEntity$4  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/YufengEntity$4.class */
    class AnonymousClass4 extends NearestAttackableTargetGoal {
        AnonymousClass4(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            YufengEntity.this.getX();
            YufengEntity.this.getY();
            YufengEntity.this.getZ();
            Entity entity = YufengEntity.this;
            Level level = YufengEntity.this.level;
            return canUse() && CheckGoodProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.YufengEntity$5  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/YufengEntity$5.class */
    class AnonymousClass5 extends NearestAttackableTargetGoal {
        AnonymousClass5(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            YufengEntity.this.getX();
            YufengEntity.this.getY();
            YufengEntity.this.getZ();
            Entity entity = YufengEntity.this;
            Level level = YufengEntity.this.level;
            return canUse() && CheckEvilProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.YufengEntity$6  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/YufengEntity$6.class */
    class AnonymousClass6 extends RandomStrollGoal {
        AnonymousClass6(PathfinderMob arg0, double arg1, int arg2) {
            super(arg0, arg1, arg2);
        }

        protected Vec3 getPosition() {
            Random random = YufengEntity.this.getRandom();
            return new Vec3(YufengEntity.this.getX() + ((double) (((random.nextFloat() * 2.0f) - 1.0f) * 16.0f)), YufengEntity.this.getY() + ((double) (((random.nextFloat() * 2.0f) - 1.0f) * 16.0f)), YufengEntity.this.getZ() + ((double) (((random.nextFloat() * 2.0f) - 1.0f) * 16.0f)));
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
        YufengEntityDiesProcedure.execute(this.level, getX(), getY(), getZ());
    }

    public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
        awardKillScore(entity, score, damageSource);
        YufengThisEntityKillsAnotherOneProcedure.execute(this.level, getX(), getY(), getZ(), entity, this);
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
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.6d).add(Attributes.MAX_HEALTH, 18.0d).add(Attributes.ARMOR, 0.0d).add(Attributes.ATTACK_DAMAGE, 2.0d).add(Attributes.FOLLOW_RANGE, 16.0d).add(Attributes.FLYING_SPEED, 0.6d);
    }
}
