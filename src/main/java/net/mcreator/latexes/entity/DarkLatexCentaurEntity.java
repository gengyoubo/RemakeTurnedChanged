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
import net.mcreator.latexes.procedures.DarkLatexCentaurThisEntityKillsAnotherOneProcedure;
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
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.BreakDoorGoal;
import net.minecraft.world.entity.ai.goal.FloatGoal;
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
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

public class DarkLatexCentaurEntity extends Monster {
    public DarkLatexCentaurEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType)LatexModEntities.DARK_LATEX_CENTAUR.get(), world);
    }

    public DarkLatexCentaurEntity(EntityType<DarkLatexCentaurEntity> type, Level world) {
        super(type, world);
        this.xpReward = 8;
        this.setNoAi(false);
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.5, false) {
            protected double getAttackReachSqr(LivingEntity entity) {
                return 4.0 + (double)(entity.getBbWidth() * entity.getBbWidth());
            }

            public boolean canUse() {
                double x = DarkLatexCentaurEntity.this.getX();
                double y = DarkLatexCentaurEntity.this.getY();
                double z = DarkLatexCentaurEntity.this.getZ();
                Entity entity = DarkLatexCentaurEntity.this;
                Level world = DarkLatexCentaurEntity.this.level;
                return super.canUse() && TargetwearingmaskProcedure.execute(entity);
            }
        });
        this.targetSelector.addGoal(2, (new HurtByTargetGoal(this, new Class[0])).setAlertOthers(new Class[0]));
        this.goalSelector.addGoal(3, new BreakDoorGoal(this, (e) -> {
            return true;
        }));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, PathfinderMob.class, false, false) {
            public boolean canUse() {
                double x = DarkLatexCentaurEntity.this.getX();
                double y = DarkLatexCentaurEntity.this.getY();
                double z = DarkLatexCentaurEntity.this.getZ();
                Entity entity = DarkLatexCentaurEntity.this;
                Level world = DarkLatexCentaurEntity.this.level;
                return super.canUse() && CheckSlimelingProcedure.execute(entity);
            }
        });
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, LivingEntity.class, true, false) {
            public boolean canUse() {
                double x = DarkLatexCentaurEntity.this.getX();
                double y = DarkLatexCentaurEntity.this.getY();
                double z = DarkLatexCentaurEntity.this.getZ();
                Entity entity = DarkLatexCentaurEntity.this;
                Level world = DarkLatexCentaurEntity.this.level;
                return super.canUse() && CheckGoodProcedure.execute(entity);
            }
        });
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, LivingEntity.class, true, false) {
            public boolean canUse() {
                double x = DarkLatexCentaurEntity.this.getX();
                double y = DarkLatexCentaurEntity.this.getY();
                double z = DarkLatexCentaurEntity.this.getZ();
                Entity entity = DarkLatexCentaurEntity.this;
                Level world = DarkLatexCentaurEntity.this.level;
                return super.canUse() && CheckEvilProcedure.execute(entity);
            }
        });
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, LivingEntity.class, true, false) {
            public boolean canUse() {
                double x = DarkLatexCentaurEntity.this.getX();
                double y = DarkLatexCentaurEntity.this.getY();
                double z = DarkLatexCentaurEntity.this.getZ();
                Entity entity = DarkLatexCentaurEntity.this;
                Level world = DarkLatexCentaurEntity.this.level;
                return super.canUse() && CheckSlimelingProcedure.execute(entity);
            }
        });
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, Player.class, true, false));
        this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, WanderingTrader.class, true, false));
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, Villager.class, true, false));
        this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, IronGolem.class, true, false));
        this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, Witch.class, true, false));
        this.targetSelector.addGoal(13, new NearestAttackableTargetGoal(this, Pillager.class, true, false));
        this.targetSelector.addGoal(14, new NearestAttackableTargetGoal(this, Vindicator.class, true, false));
        this.targetSelector.addGoal(15, new NearestAttackableTargetGoal(this, Evoker.class, true, false));
        this.targetSelector.addGoal(16, new NearestAttackableTargetGoal(this, Guardian.class, true, false));
        this.targetSelector.addGoal(17, new NearestAttackableTargetGoal(this, Bee.class, true, false));
        this.targetSelector.addGoal(18, new NearestAttackableTargetGoal(this, Fox.class, true, false));
        this.targetSelector.addGoal(19, new NearestAttackableTargetGoal(this, Zombie.class, true, false));
        this.targetSelector.addGoal(20, new NearestAttackableTargetGoal(this, ZombieVillager.class, true, false));
        this.targetSelector.addGoal(21, new NearestAttackableTargetGoal(this, Piglin.class, true, false));
        this.targetSelector.addGoal(22, new NearestAttackableTargetGoal(this, PiglinBrute.class, true, false));
        this.goalSelector.addGoal(23, new RandomStrollGoal(this, 0.7));
        this.goalSelector.addGoal(24, new LookAtPlayerGoal(this, PathfinderMob.class, 12.0F));
        this.goalSelector.addGoal(25, new LookAtPlayerGoal(this, Player.class, 6.0F));
        this.goalSelector.addGoal(26, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(27, new FloatGoal(this));
    }

    public MobType getMobType() {
        return MobType.ARTHROPOD;
    }

    public double getPassengersRidingOffset() {
        return super.getPassengersRidingOffset() + 1.4000000000000001;
    }

    protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
        super.dropCustomDeathLoot(source, looting, recentlyHitIn);
        this.spawnAtLocation(new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
    }

    public void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
    }

    public SoundEvent getHurtSound(DamageSource ds) {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
    }

    public SoundEvent getDeathSound() {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
    }

    public boolean hurt(DamageSource source, float amount) {
        if (source == DamageSource.FALL) {
            return false;
        } else if (source == DamageSource.CACTUS) {
            return false;
        } else if (source == DamageSource.WITHER) {
            return false;
        } else {
            return source.getMsgId().equals("witherSkull") ? false : super.hurt(source, amount);
        }
    }

    public void die(DamageSource source) {
        super.die(source);
        DarklatexEntityDiesProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
    }

    public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
        super.awardKillScore(entity, score, damageSource);
        DarkLatexCentaurThisEntityKillsAnotherOneProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), entity, this);
    }

    public static void init() {
        DungeonHooks.addDungeonMob((EntityType)LatexModEntities.DARK_LATEX_CENTAUR.get(), 180);
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0.32);
        builder = builder.add(Attributes.MAX_HEALTH, 28.0);
        builder = builder.add(Attributes.ARMOR, 1.0);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 4.0);
        builder = builder.add(Attributes.FOLLOW_RANGE, 16.0);
        builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.5);
        builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.2);
        return builder;
    }
}
