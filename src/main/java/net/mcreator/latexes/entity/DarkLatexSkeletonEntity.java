//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.entity;

import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModItems;
import net.mcreator.latexes.procedures.CheckEvilProcedure;
import net.mcreator.latexes.procedures.CheckGoodProcedure;
import net.mcreator.latexes.procedures.CheckSlimelingProcedure;
import net.mcreator.latexes.procedures.CheckentityislatexProcedure;
import net.mcreator.latexes.procedures.DarkLatexSkeletonThisEntityKillsAnotherOneProcedure;
import net.mcreator.latexes.procedures.DarklatexEntityDiesProcedure;
import net.mcreator.latexes.procedures.TargetwearingmaskProcedure;
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
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.BreakDoorGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LeapAtTargetGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.Bee;
import net.minecraft.world.entity.animal.Fox;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Evoker;
import net.minecraft.world.entity.monster.Guardian;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraft.world.entity.monster.Witch;
import net.minecraft.world.entity.monster.WitherSkeleton;
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
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

public class DarkLatexSkeletonEntity extends Monster {
    public DarkLatexSkeletonEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType)LatexModEntities.DARK_LATEX_SKELETON.get(), world);
    }

    public DarkLatexSkeletonEntity(EntityType<DarkLatexSkeletonEntity> type, Level world) {
        super(type, world);
        this.xpReward = 8;
        this.setNoAi(false);
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
                double x = DarkLatexSkeletonEntity.this.getX();
                double y = DarkLatexSkeletonEntity.this.getY();
                double z = DarkLatexSkeletonEntity.this.getZ();
                Entity entity = DarkLatexSkeletonEntity.this;
                Level world = DarkLatexSkeletonEntity.this.level;
                return super.canUse() && TargetwearingmaskProcedure.execute(entity);
            }
        });
        this.targetSelector.addGoal(2, (new HurtByTargetGoal(this, new Class[0])).setAlertOthers(new Class[0]));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, LivingEntity.class, false, true) {
            public boolean canUse() {
                double x = DarkLatexSkeletonEntity.this.getX();
                double y = DarkLatexSkeletonEntity.this.getY();
                double z = DarkLatexSkeletonEntity.this.getZ();
                Entity entity = DarkLatexSkeletonEntity.this;
                Level world = DarkLatexSkeletonEntity.this.level;
                return super.canUse() && CheckSlimelingProcedure.execute(entity);
            }
        });
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, LivingEntity.class, true, false) {
            public boolean canUse() {
                double x = DarkLatexSkeletonEntity.this.getX();
                double y = DarkLatexSkeletonEntity.this.getY();
                double z = DarkLatexSkeletonEntity.this.getZ();
                Entity entity = DarkLatexSkeletonEntity.this;
                Level world = DarkLatexSkeletonEntity.this.level;
                return super.canUse() && CheckGoodProcedure.execute(entity);
            }
        });
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, LivingEntity.class, true, false) {
            public boolean canUse() {
                double x = DarkLatexSkeletonEntity.this.getX();
                double y = DarkLatexSkeletonEntity.this.getY();
                double z = DarkLatexSkeletonEntity.this.getZ();
                Entity entity = DarkLatexSkeletonEntity.this;
                Level world = DarkLatexSkeletonEntity.this.level;
                return super.canUse() && CheckEvilProcedure.execute(entity);
            }
        });
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, Skeleton.class, false, true));
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, WitherSkeleton.class, false, true));
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, Player.class, true, false));
        this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, Villager.class, true, false));
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, WanderingTrader.class, true, false));
        this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, IronGolem.class, true, false));
        this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, Witch.class, true, false));
        this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, Pillager.class, true, false));
        this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, Evoker.class, true, false));
        this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, Bee.class, true, false));
        this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, Guardian.class, true, false));
        this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, Fox.class, true, false));
        this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, Zombie.class, true, false));
        this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, ZombieVillager.class, true, false));
        this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, Piglin.class, true, false));
        this.targetSelector.addGoal(21, new NearestAttackableTargetGoal(this, PiglinBrute.class, true, false));
        this.goalSelector.addGoal(22, new BreakDoorGoal(this, (e) -> {
            return true;
        }));
        this.goalSelector.addGoal(23, new RandomStrollGoal(this, 0.8));
        this.goalSelector.addGoal(24, new LookAtPlayerGoal(this, DarkLatexDragonEntity.class, 7.0F));
        this.goalSelector.addGoal(25, new LeapAtTargetGoal(this, 0.5F));
        this.goalSelector.addGoal(26, new LookAtPlayerGoal(this, LivingEntity.class, 4.0F) {
            public boolean canUse() {
                double x = DarkLatexSkeletonEntity.this.getX();
                double y = DarkLatexSkeletonEntity.this.getY();
                double z = DarkLatexSkeletonEntity.this.getZ();
                Entity entity = DarkLatexSkeletonEntity.this;
                Level world = DarkLatexSkeletonEntity.this.level;
                return super.canUse() && CheckentityislatexProcedure.execute(entity);
            }
        });
        this.goalSelector.addGoal(27, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(28, new FloatGoal(this));
    }

    public MobType getMobType() {
        return MobType.UNDEAD;
    }

    protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
        super.dropCustomDeathLoot(source, looting, recentlyHitIn);
        this.spawnAtLocation(new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
    }

    public void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
    }

    public SoundEvent getHurtSound(DamageSource ds) {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.skeleton.hurt"));
    }

    public SoundEvent getDeathSound() {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.skeleton.death"));
    }

    public boolean hurt(DamageSource source, float amount) {
        if (source == DamageSource.FALL) {
            return false;
        } else {
            return source == DamageSource.CACTUS ? false : super.hurt(source, amount);
        }
    }

    public void die(DamageSource source) {
        super.die(source);
        DarklatexEntityDiesProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
    }

    public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
        super.awardKillScore(entity, score, damageSource);
        DarkLatexSkeletonThisEntityKillsAnotherOneProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), entity, this);
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
        builder = builder.add(Attributes.MAX_HEALTH, 24.0);
        builder = builder.add(Attributes.ARMOR, 2.5);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 3.0);
        builder = builder.add(Attributes.FOLLOW_RANGE, 16.0);
        builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.4);
        builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.1);
        return builder;
    }
}
