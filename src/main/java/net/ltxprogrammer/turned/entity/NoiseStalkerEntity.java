//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.entity;

import javax.annotation.Nullable;
import net.ltxprogrammer.changed.init.ChangedItems;
import net.ltxprogrammer.turned.entity.ai.TargetCheck;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.ltxprogrammer.turned.procedures.NightstalkertestPlayerCollidesWithThisEntityProcedure;
import net.ltxprogrammer.turned.procedures.NoiseStalkerDetectGameruleProcedure;
import net.ltxprogrammer.turned.procedures.NoiseStalkerOnInitialEntitySpawnProcedure;
import net.ltxprogrammer.turned.procedures.NoiseStalkerThisEntityKillsAnotherOneProcedure;
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
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

public class NoiseStalkerEntity extends Monster {
    public NoiseStalkerEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType)LatexModEntities.NOISE_STALKER.get(), world);
    }

    public NoiseStalkerEntity(EntityType<NoiseStalkerEntity> type, Level world) {
        super(type, world);
        this.xpReward = 10;
        this.setNoAi(false);
    }

    public Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new BreakDoorGoal(this, (e) -> {
            return true;
        }));
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.2, true) {
            protected double getAttackReachSqr(LivingEntity entity) {
                return 4.0 + (double)(entity.getBbWidth() * entity.getBbWidth());
            }
        });
        this.targetSelector.addGoal(3, (new HurtByTargetGoal(this, new Class[0])).setAlertOthers(new Class[0]));
        this.targetSelector.addGoal(4, new NearestAttackableTargetGoal(this, PathfinderMob.class, 10, false, true, TargetCheck.IS_SLIMELING));
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
        this.goalSelector.addGoal(25, new RemoveBlockGoal(Blocks.SMOOTH_STONE, this, 1.0, 3) {
            public boolean canUse() {
                double x = NoiseStalkerEntity.this.getX();
                double y = NoiseStalkerEntity.this.getY();
                double z = NoiseStalkerEntity.this.getZ();
                Entity entity = NoiseStalkerEntity.this;
                Level world = NoiseStalkerEntity.this.level;
                return super.canUse() && NoiseStalkerDetectGameruleProcedure.execute(world);
            }
        });
        this.goalSelector.addGoal(26, new RemoveBlockGoal(Blocks.SMOOTH_SANDSTONE, this, 1.0, 3) {
            public boolean canUse() {
                double x = NoiseStalkerEntity.this.getX();
                double y = NoiseStalkerEntity.this.getY();
                double z = NoiseStalkerEntity.this.getZ();
                Entity entity = NoiseStalkerEntity.this;
                Level world = NoiseStalkerEntity.this.level;
                return super.canUse() && NoiseStalkerDetectGameruleProcedure.execute(world);
            }
        });
        this.goalSelector.addGoal(27, new RemoveBlockGoal(Blocks.SMOOTH_RED_SANDSTONE, this, 1.0, 3) {
            public boolean canUse() {
                double x = NoiseStalkerEntity.this.getX();
                double y = NoiseStalkerEntity.this.getY();
                double z = NoiseStalkerEntity.this.getZ();
                Entity entity = NoiseStalkerEntity.this;
                Level world = NoiseStalkerEntity.this.level;
                return super.canUse() && NoiseStalkerDetectGameruleProcedure.execute(world);
            }
        });
        this.goalSelector.addGoal(28, new RemoveBlockGoal(Blocks.BIRCH_DOOR, this, 1.0, 3) {
            public boolean canUse() {
                double x = NoiseStalkerEntity.this.getX();
                double y = NoiseStalkerEntity.this.getY();
                double z = NoiseStalkerEntity.this.getZ();
                Entity entity = NoiseStalkerEntity.this;
                Level world = NoiseStalkerEntity.this.level;
                return super.canUse() && NoiseStalkerDetectGameruleProcedure.execute(world);
            }
        });
        this.goalSelector.addGoal(29, new RemoveBlockGoal(Blocks.SPRUCE_DOOR, this, 1.0, 3) {
            public boolean canUse() {
                double x = NoiseStalkerEntity.this.getX();
                double y = NoiseStalkerEntity.this.getY();
                double z = NoiseStalkerEntity.this.getZ();
                Entity entity = NoiseStalkerEntity.this;
                Level world = NoiseStalkerEntity.this.level;
                return super.canUse() && NoiseStalkerDetectGameruleProcedure.execute(world);
            }
        });
        this.goalSelector.addGoal(30, new RemoveBlockGoal(Blocks.OAK_DOOR, this, 1.0, 3) {
            public boolean canUse() {
                double x = NoiseStalkerEntity.this.getX();
                double y = NoiseStalkerEntity.this.getY();
                double z = NoiseStalkerEntity.this.getZ();
                Entity entity = NoiseStalkerEntity.this;
                Level world = NoiseStalkerEntity.this.level;
                return super.canUse() && NoiseStalkerDetectGameruleProcedure.execute(world);
            }
        });
        this.goalSelector.addGoal(31, new RemoveBlockGoal(Blocks.JUNGLE_DOOR, this, 1.0, 3) {
            public boolean canUse() {
                double x = NoiseStalkerEntity.this.getX();
                double y = NoiseStalkerEntity.this.getY();
                double z = NoiseStalkerEntity.this.getZ();
                Entity entity = NoiseStalkerEntity.this;
                Level world = NoiseStalkerEntity.this.level;
                return super.canUse() && NoiseStalkerDetectGameruleProcedure.execute(world);
            }
        });
        this.goalSelector.addGoal(32, new RemoveBlockGoal(Blocks.ACACIA_DOOR, this, 1.0, 3) {
            public boolean canUse() {
                double x = NoiseStalkerEntity.this.getX();
                double y = NoiseStalkerEntity.this.getY();
                double z = NoiseStalkerEntity.this.getZ();
                Entity entity = NoiseStalkerEntity.this;
                Level world = NoiseStalkerEntity.this.level;
                return super.canUse() && NoiseStalkerDetectGameruleProcedure.execute(world);
            }
        });
        this.goalSelector.addGoal(33, new RemoveBlockGoal(Blocks.DARK_OAK_DOOR, this, 1.0, 3) {
            public boolean canUse() {
                double x = NoiseStalkerEntity.this.getX();
                double y = NoiseStalkerEntity.this.getY();
                double z = NoiseStalkerEntity.this.getZ();
                Entity entity = NoiseStalkerEntity.this;
                Level world = NoiseStalkerEntity.this.level;
                return super.canUse() && NoiseStalkerDetectGameruleProcedure.execute(world);
            }
        });
        this.goalSelector.addGoal(34, new RemoveBlockGoal(Blocks.CRIMSON_DOOR, this, 1.0, 3) {
            public boolean canUse() {
                double x = NoiseStalkerEntity.this.getX();
                double y = NoiseStalkerEntity.this.getY();
                double z = NoiseStalkerEntity.this.getZ();
                Entity entity = NoiseStalkerEntity.this;
                Level world = NoiseStalkerEntity.this.level;
                return super.canUse() && NoiseStalkerDetectGameruleProcedure.execute(world);
            }
        });
        this.goalSelector.addGoal(35, new RemoveBlockGoal(Blocks.WARPED_DOOR, this, 1.0, 3) {
            public boolean canUse() {
                double x = NoiseStalkerEntity.this.getX();
                double y = NoiseStalkerEntity.this.getY();
                double z = NoiseStalkerEntity.this.getZ();
                Entity entity = NoiseStalkerEntity.this;
                Level world = NoiseStalkerEntity.this.level;
                return super.canUse() && NoiseStalkerDetectGameruleProcedure.execute(world);
            }
        });
        this.goalSelector.addGoal(36, new RandomStrollGoal(this, 0.8));
        this.goalSelector.addGoal(37, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(38, new FloatGoal(this));
    }

    public MobType getMobType() {
        return MobType.ARTHROPOD;
    }

    protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
        super.dropCustomDeathLoot(source, looting, recentlyHitIn);
        this.spawnAtLocation(new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
    }

    public SoundEvent getAmbientSound() {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ravager.ambient"));
    }

    public void playStepSound(BlockPos pos, BlockState blockIn) {
        this.playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
    }

    public SoundEvent getHurtSound(DamageSource ds) {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ravager.hurt"));
    }

    public SoundEvent getDeathSound() {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
    }

    public boolean hurt(DamageSource source, float amount) {
        if (source == DamageSource.FALL) {
            return false;
        } else {
            return source == DamageSource.CACTUS ? false : super.hurt(source, amount);
        }
    }

    public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
        NoiseStalkerOnInitialEntitySpawnProcedure.execute(this);
        return retval;
    }

    public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
        super.awardKillScore(entity, score, damageSource);
        NoiseStalkerThisEntityKillsAnotherOneProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), entity, this);
    }

    public void playerTouch(Player sourceentity) {
        super.playerTouch(sourceentity);
        NightstalkertestPlayerCollidesWithThisEntityProcedure.execute(this);
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0.28);
        builder = builder.add(Attributes.MAX_HEALTH, 48.0);
        builder = builder.add(Attributes.ARMOR, 4.0);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 6.0);
        builder = builder.add(Attributes.FOLLOW_RANGE, 24.0);
        builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.5);
        builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.2);
        return builder;
    }
}
