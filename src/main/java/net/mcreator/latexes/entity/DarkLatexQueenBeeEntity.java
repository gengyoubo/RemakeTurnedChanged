//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

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
import net.minecraft.world.BossEvent.BossBarColor;
import net.minecraft.world.BossEvent.BossBarOverlay;
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
import net.minecraft.world.entity.ai.goal.Goal.Flag;
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

public class DarkLatexQueenBeeEntity extends Monster {
    private final ServerBossEvent bossInfo;

    public DarkLatexQueenBeeEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType)LatexModEntities.DARK_LATEX_QUEEN_BEE.get(), world);
    }

    public DarkLatexQueenBeeEntity(EntityType<DarkLatexQueenBeeEntity> type, Level world) {
        super(type, world);
        this.bossInfo = new ServerBossEvent(this.getDisplayName(), BossBarColor.YELLOW, BossBarOverlay.PROGRESS);
        this.xpReward = 15;
        this.setNoAi(false);
        this.setPersistenceRequired();
        this.moveControl = new FlyingMoveControl(this, 10, true);
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    protected PathNavigation createNavigation(Level world) {
        return new FlyingPathNavigation(this, world);
    }

    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new Goal() {
            {
                this.setFlags(EnumSet.of(Flag.MOVE));
            }

            public boolean canUse() {
                return DarkLatexQueenBeeEntity.this.getTarget() != null && !DarkLatexQueenBeeEntity.this.getMoveControl().hasWanted();
            }

            public boolean canContinueToUse() {
                return DarkLatexQueenBeeEntity.this.getMoveControl().hasWanted() && DarkLatexQueenBeeEntity.this.getTarget() != null && DarkLatexQueenBeeEntity.this.getTarget().isAlive();
            }

            public void start() {
                LivingEntity livingentity = DarkLatexQueenBeeEntity.this.getTarget();
                Vec3 vec3d = livingentity.getEyePosition(1.0F);
                DarkLatexQueenBeeEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1.5);
            }

            public void tick() {
                LivingEntity livingentity = DarkLatexQueenBeeEntity.this.getTarget();
                if (DarkLatexQueenBeeEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
                    DarkLatexQueenBeeEntity.this.doHurtTarget(livingentity);
                } else {
                    double d0 = DarkLatexQueenBeeEntity.this.distanceToSqr(livingentity);
                    if (d0 < 12.0) {
                        Vec3 vec3d = livingentity.getEyePosition(1.0F);
                        DarkLatexQueenBeeEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1.5);
                    }
                }

            }
        });
        this.targetSelector.addGoal(2, (new HurtByTargetGoal(this, new Class[0])).setAlertOthers(new Class[0]));
        this.goalSelector.addGoal(3, new MeleeAttackGoal(this, 1.1, true) {
            protected double getAttackReachSqr(LivingEntity entity) {
                return 4.0 + (double)(entity.getBbWidth() * entity.getBbWidth());
            }

            public boolean canUse() {
                double x = DarkLatexQueenBeeEntity.this.getX();
                double y = DarkLatexQueenBeeEntity.this.getY();
                double z = DarkLatexQueenBeeEntity.this.getZ();
                Entity entity = DarkLatexQueenBeeEntity.this;
                Level world = DarkLatexQueenBeeEntity.this.level;
                return super.canUse() && TargetwearingmaskProcedure.execute(entity);
            }
        });
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, DarkLatexSpiderQueenEntity.class, true, false));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, DarkLatexSpiderEntity.class, true, false));
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, CaveSpider.class, true, false));
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, Spider.class, true, false));
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, DarkLatexQueenBeeEntity.class, true, false));
        this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, LivingEntity.class, false, true) {
            public boolean canUse() {
                double x = DarkLatexQueenBeeEntity.this.getX();
                double y = DarkLatexQueenBeeEntity.this.getY();
                double z = DarkLatexQueenBeeEntity.this.getZ();
                Entity entity = DarkLatexQueenBeeEntity.this;
                Level world = DarkLatexQueenBeeEntity.this.level;
                return super.canUse() && CheckSlimelingProcedure.execute(entity);
            }
        });
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, LivingEntity.class, true, false) {
            public boolean canUse() {
                double x = DarkLatexQueenBeeEntity.this.getX();
                double y = DarkLatexQueenBeeEntity.this.getY();
                double z = DarkLatexQueenBeeEntity.this.getZ();
                Entity entity = DarkLatexQueenBeeEntity.this;
                Level world = DarkLatexQueenBeeEntity.this.level;
                return super.canUse() && CheckGoodProcedure.execute(entity);
            }
        });
        this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, LivingEntity.class, true, false) {
            public boolean canUse() {
                double x = DarkLatexQueenBeeEntity.this.getX();
                double y = DarkLatexQueenBeeEntity.this.getY();
                double z = DarkLatexQueenBeeEntity.this.getZ();
                Entity entity = DarkLatexQueenBeeEntity.this;
                Level world = DarkLatexQueenBeeEntity.this.level;
                return super.canUse() && CheckEvilProcedure.execute(entity);
            }
        });
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
        this.goalSelector.addGoal(24, new RandomStrollGoal(this, 1.2, 20) {
            protected Vec3 getPosition() {
                Random random = DarkLatexQueenBeeEntity.this.getRandom();
                double dir_x = DarkLatexQueenBeeEntity.this.getX() + (double)((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
                double dir_y = DarkLatexQueenBeeEntity.this.getY() + (double)((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
                double dir_z = DarkLatexQueenBeeEntity.this.getZ() + (double)((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
                return new Vec3(dir_x, dir_y, dir_z);
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
        return super.getPassengersRidingOffset() + 0.2;
    }

    protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
        super.dropCustomDeathLoot(source, looting, recentlyHitIn);
        this.spawnAtLocation(new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
    }

    public SoundEvent getAmbientSound() {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.bee.loop"));
    }

    public void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
    }

    public SoundEvent getHurtSound(DamageSource ds) {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.hurt"));
    }

    public SoundEvent getDeathSound() {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.death"));
    }

    public boolean causeFallDamage(float l, float d, DamageSource source) {
        return false;
    }

    public boolean hurt(DamageSource source, float amount) {
        DarkLatexQueenBeeEntityIsHurtProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
        if (!(source.getDirectEntity() instanceof ThrownPotion) && !(source.getDirectEntity() instanceof AreaEffectCloud)) {
            if (source == DamageSource.FALL) {
                return false;
            } else if (source == DamageSource.CACTUS) {
                return false;
            } else {
                return source == DamageSource.LIGHTNING_BOLT ? false : super.hurt(source, amount);
            }
        } else {
            return false;
        }
    }

    public void die(DamageSource source) {
        super.die(source);
        DarkLatexQueenBeeEntityDiesProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
    }

    public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
        super.awardKillScore(entity, score, damageSource);
        DarkLatexQueenBeeThisEntityKillsAnotherOneProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), entity);
    }

    public void playerTouch(Player sourceentity) {
        super.playerTouch(sourceentity);
        DarkLatexQueenBeePlayerCollidesWithThisEntityProcedure.execute(this);
    }

    public boolean canChangeDimensions() {
        return false;
    }

    public void startSeenByPlayer(ServerPlayer player) {
        super.startSeenByPlayer(player);
        this.bossInfo.addPlayer(player);
    }

    public void stopSeenByPlayer(ServerPlayer player) {
        super.stopSeenByPlayer(player);
        this.bossInfo.removePlayer(player);
    }

    public void customServerAiStep() {
        super.customServerAiStep();
        this.bossInfo.setProgress(this.getHealth() / this.getMaxHealth());
    }

    protected void checkFallDamage(double y, boolean onGroundIn, BlockState state, BlockPos pos) {
    }

    public void setNoGravity(boolean ignored) {
        super.setNoGravity(true);
    }

    public void aiStep() {
        super.aiStep();
        this.setNoGravity(true);
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0.4);
        builder = builder.add(Attributes.MAX_HEALTH, 80.0);
        builder = builder.add(Attributes.ARMOR, 5.0);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 7.0);
        builder = builder.add(Attributes.FOLLOW_RANGE, 16.0);
        builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.2);
        builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.1);
        builder = builder.add(Attributes.FLYING_SPEED, 0.4);
        return builder;
    }
}
