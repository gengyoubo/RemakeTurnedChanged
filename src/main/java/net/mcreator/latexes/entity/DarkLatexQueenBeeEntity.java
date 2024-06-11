package net.mcreator.latexes.entity;

import java.util.EnumSet;
import java.util.Random;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModItems;
import net.mcreator.latexes.procedures.CheckEvilProcedure;
import net.mcreator.latexes.procedures.CheckGoodProcedure;
import net.mcreator.latexes.procedures.CheckSlimelingProcedure;
import net.mcreator.latexes.procedures.DarkLatexQueenBeeEntityDiesProcedure;
import net.mcreator.latexes.procedures.DarkLatexQueenBeeEntityIsHurtProcedure;
import net.mcreator.latexes.procedures.DarkLatexQueenBeePlayerCollidesWithThisEntityProcedure;
import net.mcreator.latexes.procedures.DarkLatexQueenBeeThisEntityKillsAnotherOneProcedure;
import net.mcreator.latexes.procedures.TargetwearingmaskProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerBossEvent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.BossEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AreaEffectCloud;
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
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.CaveSpider;
import net.minecraft.world.entity.monster.Evoker;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.monster.Spider;
import net.minecraft.world.entity.monster.Vindicator;
import net.minecraft.world.entity.monster.Witch;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.npc.WanderingTrader;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/DarkLatexQueenBeeEntity.class */
public class DarkLatexQueenBeeEntity extends Monster {
    private final ServerBossEvent bossInfo;

    public DarkLatexQueenBeeEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.DARK_LATEX_QUEEN_BEE.get(), world);
    }

    public DarkLatexQueenBeeEntity(EntityType<DarkLatexQueenBeeEntity> type, Level world) {
        super(type, world);
        this.bossInfo = new ServerBossEvent(getDisplayName(), BossEvent.BossBarColor.YELLOW, BossEvent.BossBarOverlay.PROGRESS);
        this.xpReward = 15;
        setNoAi(false);
        setPersistenceRequired();
        this.moveControl = new FlyingMoveControl(this, 10, true);
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    protected PathNavigation createNavigation(Level world) {
        return new FlyingPathNavigation(this, world);
    }

    /* renamed from: net.mcreator.latexes.entity.DarkLatexQueenBeeEntity$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/DarkLatexQueenBeeEntity$1.class */
    class AnonymousClass1 extends Goal {
        AnonymousClass1() {
            setFlags(EnumSet.of(Goal.Flag.MOVE));
        }

        public boolean canUse() {
            if (DarkLatexQueenBeeEntity.this.getTarget() == null || DarkLatexQueenBeeEntity.this.getMoveControl().hasWanted()) {
                return false;
            }
            return true;
        }

        public boolean canContinueToUse() {
            return DarkLatexQueenBeeEntity.this.getMoveControl().hasWanted() && DarkLatexQueenBeeEntity.this.getTarget() != null && DarkLatexQueenBeeEntity.this.getTarget().isAlive();
        }

        public void start() {
            Vec3 vec3d = DarkLatexQueenBeeEntity.this.getTarget().getEyePosition(1.0f);
            DarkLatexQueenBeeEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1.5d);
        }

        public void tick() {
            LivingEntity livingentity = DarkLatexQueenBeeEntity.this.getTarget();
            if (DarkLatexQueenBeeEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
                DarkLatexQueenBeeEntity.this.doHurtTarget(livingentity);
            } else if (DarkLatexQueenBeeEntity.this.distanceToSqr(livingentity) < 12.0d) {
                Vec3 vec3d = livingentity.getEyePosition(1.0f);
                DarkLatexQueenBeeEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1.5d);
            }
        }
    }

    protected void registerGoals() {
        registerGoals();
        this.goalSelector.addGoal(1, new AnonymousClass1());
        this.targetSelector.addGoal(2, new HurtByTargetGoal(this, new Class[0]).setAlertOthers(new Class[0]));
        this.goalSelector.addGoal(3, new AnonymousClass2(this, 1.1d, true));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, DarkLatexSpiderQueenEntity.class, true, false));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, DarkLatexSpiderEntity.class, true, false));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, CaveSpider.class, true, false));
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, Spider.class, true, false));
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, DarkLatexQueenBeeEntity.class, true, false));
        this.targetSelector.addGoal(9, new AnonymousClass3(this, LivingEntity.class, false, true));
        this.targetSelector.addGoal(10, new AnonymousClass4(this, LivingEntity.class, true, false));
        this.targetSelector.addGoal(11, new AnonymousClass5(this, LivingEntity.class, true, false));
        this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, Player.class, true, false));
        this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, Villager.class, true, false));
        this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, WanderingTrader.class, true, false));
        this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, IronGolem.class, true, false));
        this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, Witch.class, true, false));
        this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, Pillager.class, true, false));
        this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, Vindicator.class, true, false));
        this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, Evoker.class, true, false));
        this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, Zombie.class, true, false));
        this.targetSelector.addGoal(21, new NearestAttackableTargetGoal(this, ZombieVillager.class, true, false));
        this.targetSelector.addGoal(22, new NearestAttackableTargetGoal(this, Piglin.class, true, false));
        this.targetSelector.addGoal(23, new NearestAttackableTargetGoal(this, PiglinBrute.class, true, false));
        this.goalSelector.addGoal(24, new AnonymousClass6(this, 1.2d, 20));
        this.goalSelector.addGoal(25, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(26, new FloatGoal(this));
    }

    /* renamed from: net.mcreator.latexes.entity.DarkLatexQueenBeeEntity$2  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/DarkLatexQueenBeeEntity$2.class */
    class AnonymousClass2 extends MeleeAttackGoal {
        AnonymousClass2(PathfinderMob arg0, double arg1, boolean arg2) {
            super(arg0, arg1, arg2);
        }

        protected double getAttackReachSqr(LivingEntity entity) {
            return 4.0d + ((double) (entity.getBbWidth() * entity.getBbWidth()));
        }

        public boolean canUse() {
            DarkLatexQueenBeeEntity.this.getX();
            DarkLatexQueenBeeEntity.this.getY();
            DarkLatexQueenBeeEntity.this.getZ();
            Entity entity = DarkLatexQueenBeeEntity.this;
            Level level = DarkLatexQueenBeeEntity.this.level;
            return canUse() && TargetwearingmaskProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.DarkLatexQueenBeeEntity$3  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/DarkLatexQueenBeeEntity$3.class */
    class AnonymousClass3 extends NearestAttackableTargetGoal {
        AnonymousClass3(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            DarkLatexQueenBeeEntity.this.getX();
            DarkLatexQueenBeeEntity.this.getY();
            DarkLatexQueenBeeEntity.this.getZ();
            Entity entity = DarkLatexQueenBeeEntity.this;
            Level level = DarkLatexQueenBeeEntity.this.level;
            return canUse() && CheckSlimelingProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.DarkLatexQueenBeeEntity$4  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/DarkLatexQueenBeeEntity$4.class */
    class AnonymousClass4 extends NearestAttackableTargetGoal {
        AnonymousClass4(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            DarkLatexQueenBeeEntity.this.getX();
            DarkLatexQueenBeeEntity.this.getY();
            DarkLatexQueenBeeEntity.this.getZ();
            Entity entity = DarkLatexQueenBeeEntity.this;
            Level level = DarkLatexQueenBeeEntity.this.level;
            return canUse() && CheckGoodProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.DarkLatexQueenBeeEntity$5  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/DarkLatexQueenBeeEntity$5.class */
    class AnonymousClass5 extends NearestAttackableTargetGoal {
        AnonymousClass5(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
            super(arg0, arg1, arg2, arg3);
        }

        public boolean canUse() {
            DarkLatexQueenBeeEntity.this.getX();
            DarkLatexQueenBeeEntity.this.getY();
            DarkLatexQueenBeeEntity.this.getZ();
            Entity entity = DarkLatexQueenBeeEntity.this;
            Level level = DarkLatexQueenBeeEntity.this.level;
            return canUse() && CheckEvilProcedure.execute(entity);
        }
    }

    /* renamed from: net.mcreator.latexes.entity.DarkLatexQueenBeeEntity$6  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/entity/DarkLatexQueenBeeEntity$6.class */
    class AnonymousClass6 extends RandomStrollGoal {
        AnonymousClass6(PathfinderMob arg0, double arg1, int arg2) {
            super(arg0, arg1, arg2);
        }

        protected Vec3 getPosition() {
            Random random = DarkLatexQueenBeeEntity.this.getRandom();
            return new Vec3(DarkLatexQueenBeeEntity.this.getX() + ((double) (((random.nextFloat() * 2.0f) - 1.0f) * 16.0f)), DarkLatexQueenBeeEntity.this.getY() + ((double) (((random.nextFloat() * 2.0f) - 1.0f) * 16.0f)), DarkLatexQueenBeeEntity.this.getZ() + ((double) (((random.nextFloat() * 2.0f) - 1.0f) * 16.0f)));
        }
    }

    public MobType getMobType() {
        return MobType.ARTHROPOD;
    }

    public boolean removeWhenFarAway(double distanceToClosestPlayer) {
        return false;
    }

    public double getPassengersRidingOffset() {
        return getPassengersRidingOffset() + 0.2d;
    }

    protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
        dropCustomDeathLoot(source, looting, recentlyHitIn);
        spawnAtLocation(new ItemStack((ItemLike) LatexModItems.DARKLATEXGOO.get()));
    }

    public SoundEvent getAmbientSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.bee.loop"));
    }

    public void playStepSound(BlockPos pos, BlockState blockIn) {
        playSound((SoundEvent) ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15f, 1.0f);
    }

    public SoundEvent getHurtSound(DamageSource ds) {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.hurt"));
    }

    public SoundEvent getDeathSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.death"));
    }

    public boolean causeFallDamage(float l, float d, DamageSource source) {
        return false;
    }

    public boolean hurt(DamageSource source, float amount) {
        DarkLatexQueenBeeEntityIsHurtProcedure.execute(this.level, getX(), getY(), getZ(), this);
        if ((source.getDirectEntity() instanceof ThrownPotion) || (source.getDirectEntity() instanceof AreaEffectCloud) || source == DamageSource.FALL || source == DamageSource.CACTUS || source == DamageSource.LIGHTNING_BOLT) {
            return false;
        }
        return hurt(source, amount);
    }

    public void die(DamageSource source) {
        die(source);
        DarkLatexQueenBeeEntityDiesProcedure.execute(this.level, getX(), getY(), getZ());
    }

    public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
        awardKillScore(entity, score, damageSource);
        DarkLatexQueenBeeThisEntityKillsAnotherOneProcedure.execute(this.level, getX(), getY(), getZ(), entity);
    }

    public void playerTouch(Player sourceentity) {
        playerTouch(sourceentity);
        DarkLatexQueenBeePlayerCollidesWithThisEntityProcedure.execute(this);
    }

    public boolean canChangeDimensions() {
        return false;
    }

    public void startSeenByPlayer(ServerPlayer player) {
        startSeenByPlayer(player);
        this.bossInfo.addPlayer(player);
    }

    public void stopSeenByPlayer(ServerPlayer player) {
        stopSeenByPlayer(player);
        this.bossInfo.removePlayer(player);
    }

    public void customServerAiStep() {
        customServerAiStep();
        this.bossInfo.setProgress(getHealth() / getMaxHealth());
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
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.4d).add(Attributes.MAX_HEALTH, 80.0d).add(Attributes.ARMOR, 5.0d).add(Attributes.ATTACK_DAMAGE, 7.0d).add(Attributes.FOLLOW_RANGE, 16.0d).add(Attributes.KNOCKBACK_RESISTANCE, 0.2d).add(Attributes.ATTACK_KNOCKBACK, 0.1d).add(Attributes.FLYING_SPEED, 0.4d);
    }
}
