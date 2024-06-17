/**
package net.mcreator.latexes.entity;

import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModItems;
import net.mcreator.latexes.procedures.CheckEvilProcedure;
import net.mcreator.latexes.procedures.CheckGoodProcedure;
import net.mcreator.latexes.procedures.CheckSlimelingProcedure;
import net.mcreator.latexes.procedures.DarkLatexDragonEntityDiesProcedure;
import net.mcreator.latexes.procedures.DarkLatexDragonEntityIsHurtProcedure;
import net.mcreator.latexes.procedures.DarkLatexDragonThisEntityKillsAnotherOneProcedure;
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
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Evoker;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.monster.Vindicator;
import net.minecraft.world.entity.monster.Witch;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.entity.monster.ZombieVillager;
import net.minecraft.world.entity.monster.piglin.Piglin;
import net.minecraft.world.entity.monster.piglin.PiglinBrute;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

public class DarkLatexDragonEntity extends Monster {
    private final ServerBossEvent bossInfo;

    public DarkLatexDragonEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType)LatexModEntities.DARK_LATEX_DRAGON.get(), world);
    }

    public DarkLatexDragonEntity(EntityType<DarkLatexDragonEntity> type, Level world) {
        super(type, world);
        this.bossInfo = new ServerBossEvent(this.getDisplayName(), BossBarColor.WHITE, BossBarOverlay.PROGRESS);
        this.xpReward = 32;
        this.setNoAi(false);
        this.setPersistenceRequired();
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.1, true) {
            protected double getAttackReachSqr(LivingEntity entity) {
                return 4.0 + (double)(entity.getBbWidth() * entity.getBbWidth());
            }

            public boolean canUse() {
                double x = DarkLatexDragonEntity.this.getX();
                double y = DarkLatexDragonEntity.this.getY();
                double z = DarkLatexDragonEntity.this.getZ();
                Entity entity = DarkLatexDragonEntity.this;
                Level world = DarkLatexDragonEntity.this.level;
                return super.canUse() && TargetwearingmaskProcedure.execute(entity);
            }
        });
        this.targetSelector.addGoal(2, (new HurtByTargetGoal(this, new Class[0])).setAlertOthers(new Class[0]));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, PathfinderMob.class, false, false) {
            public boolean canUse() {
                double x = DarkLatexDragonEntity.this.getX();
                double y = DarkLatexDragonEntity.this.getY();
                double z = DarkLatexDragonEntity.this.getZ();
                Entity entity = DarkLatexDragonEntity.this;
                Level world = DarkLatexDragonEntity.this.level;
                return super.canUse() && CheckSlimelingProcedure.execute(entity);
            }
        });
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, PathfinderMob.class, true, false) {
            public boolean canUse() {
                double x = DarkLatexDragonEntity.this.getX();
                double y = DarkLatexDragonEntity.this.getY();
                double z = DarkLatexDragonEntity.this.getZ();
                Entity entity = DarkLatexDragonEntity.this;
                Level world = DarkLatexDragonEntity.this.level;
                return super.canUse() && CheckGoodProcedure.execute(entity);
            }
        });
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, PathfinderMob.class, true, false) {
            public boolean canUse() {
                double x = DarkLatexDragonEntity.this.getX();
                double y = DarkLatexDragonEntity.this.getY();
                double z = DarkLatexDragonEntity.this.getZ();
                Entity entity = DarkLatexDragonEntity.this;
                Level world = DarkLatexDragonEntity.this.level;
                return super.canUse() && CheckEvilProcedure.execute(entity);
            }
        });
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, IronGolem.class, true, false));
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, Witch.class, true, false));
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, Pillager.class, true, false));
        this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, Vindicator.class, true, false));
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, Evoker.class, true, false));
        this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, Zombie.class, true, false));
        this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, ZombieVillager.class, true, false));
        this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, Piglin.class, true, false));
        this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, PiglinBrute.class, true, false));
        this.goalSelector.addGoal(15, new RandomStrollGoal(this, 0.8));
        this.goalSelector.addGoal(16, new LookAtPlayerGoal(this, LivingEntity.class, 5.0F));
        this.goalSelector.addGoal(17, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(18, new FloatGoal(this));
    }

    public MobType getMobType() {
        return MobType.UNDEFINED;
    }

    public boolean removeWhenFarAway(double distanceToClosestPlayer) {
        return false;
    }

    protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
        super.dropCustomDeathLoot(source, looting, recentlyHitIn);
        this.spawnAtLocation(new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
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

    public boolean hurt(DamageSource source, float amount) {
        DarkLatexDragonEntityIsHurtProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
        if (!(source.getDirectEntity() instanceof ThrownPotion) && !(source.getDirectEntity() instanceof AreaEffectCloud)) {
            if (source == DamageSource.FALL) {
                return false;
            } else if (source == DamageSource.CACTUS) {
                return false;
            } else if (source == DamageSource.DROWN) {
                return false;
            } else if (source == DamageSource.WITHER) {
                return false;
            } else {
                return source.getMsgId().equals("witherSkull") ? false : super.hurt(source, amount);
            }
        } else {
            return false;
        }
    }

    public void die(DamageSource source) {
        super.die(source);
        DarkLatexDragonEntityDiesProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
    }

    public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
        super.awardKillScore(entity, score, damageSource);
        DarkLatexDragonThisEntityKillsAnotherOneProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), entity, this);
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

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0.28);
        builder = builder.add(Attributes.MAX_HEALTH, 150.0);
        builder = builder.add(Attributes.ARMOR, 5.0);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 6.0);
        builder = builder.add(Attributes.FOLLOW_RANGE, 32.0);
        builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 2.0);
        builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.7999999999999999);
        return builder;
    }
}
*/