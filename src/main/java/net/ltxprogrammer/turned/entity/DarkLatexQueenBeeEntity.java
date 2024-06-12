package net.ltxprogrammer.turned.entity;

import java.util.EnumSet;
import java.util.Random;
import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
import net.ltxprogrammer.changed.init.ChangedItems;
import net.ltxprogrammer.changed.init.ChangedParticles;
import net.ltxprogrammer.turned.entity.p000ai.TargetCheck;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.ltxprogrammer.turned.procedures.DarkLatexQueenBeeEntityDiesProcedure;
import net.ltxprogrammer.turned.procedures.DarkLatexQueenBeeEntityIsHurtProcedure;
import net.ltxprogrammer.turned.procedures.DarkLatexQueenBeePlayerCollidesWithThisEntityProcedure;
import net.ltxprogrammer.turned.procedures.DarkLatexQueenBeeThisEntityKillsAnotherOneProcedure;
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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/entity/DarkLatexQueenBeeEntity.class */
public class DarkLatexQueenBeeEntity extends AbstractDarkLatexEntity {
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

    protected void registerGoals() {
        registerGoals();
        this.goalSelector.addGoal(1, new Goal() { // from class: net.ltxprogrammer.turned.entity.DarkLatexQueenBeeEntity.1
            {
                setFlags(EnumSet.of(Goal.Flag.MOVE));
            }

            public boolean canUse() {
                return DarkLatexQueenBeeEntity.this.getTarget() != null && !DarkLatexQueenBeeEntity.this.getMoveControl().hasWanted();
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
        });
        this.targetSelector.addGoal(2, new HurtByTargetGoal(this, new Class[0]).setAlertOthers(new Class[0]));
        this.goalSelector.addGoal(3, new MeleeAttackGoal(this, 1.1d, true) { // from class: net.ltxprogrammer.turned.entity.DarkLatexQueenBeeEntity.2
            protected double getAttackReachSqr(LivingEntity entity) {
                return 4.0d + ((double) (entity.getBbWidth() * entity.getBbWidth()));
            }
        });
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, DarkLatexSpiderQueenEntity.class, true, false));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, DarkLatexSpiderEntity.class, true, false));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, CaveSpider.class, true, false));
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, Spider.class, true, false));
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, DarkLatexQueenBeeEntity.class, true, false));
        this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, LivingEntity.class, 10, false, true, TargetCheck.IS_SLIMELING));
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, LivingEntity.class, 10, true, false, TargetCheck.IS_GOOD));
        this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, LivingEntity.class, 10, true, false, TargetCheck.IS_EVIL));
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
        this.goalSelector.addGoal(24, new RandomStrollGoal(this, 1.2d, 20) { // from class: net.ltxprogrammer.turned.entity.DarkLatexQueenBeeEntity.3
            protected Vec3 getPosition() {
                Random random = DarkLatexQueenBeeEntity.this.getRandom();
                return new Vec3(DarkLatexQueenBeeEntity.this.getX() + ((double) (((random.nextFloat() * 2.0f) - 1.0f) * 16.0f)), DarkLatexQueenBeeEntity.this.getY() + ((double) (((random.nextFloat() * 2.0f) - 1.0f) * 16.0f)), DarkLatexQueenBeeEntity.this.getZ() + ((double) (((random.nextFloat() * 2.0f) - 1.0f) * 16.0f)));
            }
        });
        this.goalSelector.addGoal(25, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(26, new FloatGoal(this));
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
        spawnAtLocation(new ItemStack((ItemLike) ChangedItems.DARK_LATEX_GOO.get()));
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

    public ChangedParticles.Color3 getDripColor() {
        return ChangedParticles.Color3.DARK;
    }
}
