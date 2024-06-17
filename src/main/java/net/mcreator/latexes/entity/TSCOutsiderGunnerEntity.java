//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.entity;

import net.mcreator.latexes.init.LatexModBlocks;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.procedures.CheckEvilProcedure;
import net.mcreator.latexes.procedures.CheckentityislatexProcedure;
import net.mcreator.latexes.procedures.TSCOutsiderGunnerEntityDiesProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.goal.FloatGoal;
import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
import net.minecraft.world.entity.ai.goal.RemoveBlockGoal;
import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
import net.minecraft.world.entity.animal.IronGolem;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.RangedAttackMob;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.npc.WanderingTrader;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

public class TSCOutsiderGunnerEntity extends Monster implements RangedAttackMob {
    public TSCOutsiderGunnerEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType)LatexModEntities.TSC_OUTSIDER_GUNNER.get(), world);
    }

    public TSCOutsiderGunnerEntity(EntityType<TSCOutsiderGunnerEntity> type, Level world) {
        super(type, world);
        this.xpReward = 0;
        this.setNoAi(false);
        this.setPersistenceRequired();
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.2, false) {
            protected double getAttackReachSqr(LivingEntity entity) {
                return 4.0 + (double)(entity.getBbWidth() * entity.getBbWidth());
            }
        });
        this.goalSelector.addGoal(2, new OpenDoorGoal(this, true));
        this.targetSelector.addGoal(3, new NearestAttackableTargetGoal(this, Player.class, true, false));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, LivingEntity.class, true, false) {
            public boolean canUse() {
                double x = TSCOutsiderGunnerEntity.this.getX();
                double y = TSCOutsiderGunnerEntity.this.getY();
                double z = TSCOutsiderGunnerEntity.this.getZ();
                Entity entity = TSCOutsiderGunnerEntity.this;
                Level world = TSCOutsiderGunnerEntity.this.level;
                return super.canUse() && CheckentityislatexProcedure.execute(entity);
            }
        });
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, LivingEntity.class, true, false) {
            public boolean canUse() {
                double x = TSCOutsiderGunnerEntity.this.getX();
                double y = TSCOutsiderGunnerEntity.this.getY();
                double z = TSCOutsiderGunnerEntity.this.getZ();
                Entity entity = TSCOutsiderGunnerEntity.this;
                Level world = TSCOutsiderGunnerEntity.this.level;
                return super.canUse() && CheckentityislatexProcedure.execute(entity);
            }
        });
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, Villager.class, true, false));
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, WanderingTrader.class, true, false));
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, IronGolem.class, true, false));
        this.goalSelector.addGoal(9, new RandomStrollGoal(this, 1.0));
        this.goalSelector.addGoal(10, new LookAtPlayerGoal(this, LivingEntity.class, 4.0F) {
            public boolean canUse() {
                double x = TSCOutsiderGunnerEntity.this.getX();
                double y = TSCOutsiderGunnerEntity.this.getY();
                double z = TSCOutsiderGunnerEntity.this.getZ();
                Entity entity = TSCOutsiderGunnerEntity.this;
                Level world = TSCOutsiderGunnerEntity.this.level;
                return super.canUse() && CheckEvilProcedure.execute(entity);
            }
        });
        this.goalSelector.addGoal(11, new LookAtPlayerGoal(this, Player.class, 8.0F));
        this.targetSelector.addGoal(12, (new HurtByTargetGoal(this, new Class[0])).setAlertOthers(new Class[0]));
        this.goalSelector.addGoal(13, new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXBLOCK.get(), this, 1.0, 3));
        this.goalSelector.addGoal(14, new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXBLOCKHARMLESS.get(), this, 1.0, 3));
        this.goalSelector.addGoal(15, new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get(), this, 1.0, 3));
        this.goalSelector.addGoal(16, new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXHIVE.get(), this, 1.0, 3));
        this.goalSelector.addGoal(17, new OpenDoorGoal(this, false));
        this.goalSelector.addGoal(18, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(19, new FloatGoal(this));
        this.goalSelector.addGoal(1, new RangedAttackGoal(this, 1.25, 20, 10.0F) {
            public boolean canContinueToUse() {
                return this.canUse();
            }
        });
    }

    public MobType getMobType() {
        return MobType.UNDEFINED;
    }

    public boolean removeWhenFarAway(double distanceToClosestPlayer) {
        return false;
    }

    protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
        super.dropCustomDeathLoot(source, looting, recentlyHitIn);
        this.spawnAtLocation(new ItemStack(Items.IRON_INGOT));
    }

    public void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.step")), 0.15F, 1.0F);
    }

    public SoundEvent getHurtSound(DamageSource ds) {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal.hit"));
    }

    public SoundEvent getDeathSound() {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:death_beep"));
    }

    public boolean hurt(DamageSource source, float amount) {
        if (!(source.getDirectEntity() instanceof ThrownPotion) && !(source.getDirectEntity() instanceof AreaEffectCloud)) {
            if (source == DamageSource.DROWN) {
                return false;
            } else if (source == DamageSource.DRAGON_BREATH) {
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
        TSCOutsiderGunnerEntityDiesProcedure.execute();
    }

    public void performRangedAttack(LivingEntity target, float flval) {
        TSCPistolEntity.shoot(this, target);
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
        builder = builder.add(Attributes.MAX_HEALTH, 30.0);
        builder = builder.add(Attributes.ARMOR, 6.0);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 3.0);
        builder = builder.add(Attributes.FOLLOW_RANGE, 16.0);
        builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.5);
        return builder;
    }
}
