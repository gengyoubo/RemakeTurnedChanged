//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

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
import net.minecraft.world.entity.ai.goal.Goal.Flag;
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

public class DarkLatexMothEntity extends Monster {
    public DarkLatexMothEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType)LatexModEntities.DARK_LATEX_MOTH.get(), world);
    }

    public DarkLatexMothEntity(EntityType<DarkLatexMothEntity> type, Level world) {
        super(type, world);
        this.xpReward = 5;
        this.setNoAi(false);
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
        this.goalSelector.addGoal(1, new MeleeAttackGoal(this, 1.1, false) {
            protected double getAttackReachSqr(LivingEntity entity) {
                return 4.0 + (double)(entity.getBbWidth() * entity.getBbWidth());
            }
        });
        this.goalSelector.addGoal(2, new Goal() {
            {
                this.setFlags(EnumSet.of(Flag.MOVE));
            }

            public boolean canUse() {
                return DarkLatexMothEntity.this.getTarget() != null && !DarkLatexMothEntity.this.getMoveControl().hasWanted();
            }

            public boolean canContinueToUse() {
                return DarkLatexMothEntity.this.getMoveControl().hasWanted() && DarkLatexMothEntity.this.getTarget() != null && DarkLatexMothEntity.this.getTarget().isAlive();
            }

            public void start() {
                LivingEntity livingentity = DarkLatexMothEntity.this.getTarget();
                Vec3 vec3d = livingentity.getEyePosition(1.0F);
                DarkLatexMothEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1.0);
            }

            public void tick() {
                LivingEntity livingentity = DarkLatexMothEntity.this.getTarget();
                if (DarkLatexMothEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
                    DarkLatexMothEntity.this.doHurtTarget(livingentity);
                } else {
                    double d0 = DarkLatexMothEntity.this.distanceToSqr(livingentity);
                    if (d0 < 9.0) {
                        Vec3 vec3d = livingentity.getEyePosition(1.0F);
                        DarkLatexMothEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1.0);
                    }
                }

            }
        });
        this.targetSelector.addGoal(3, (new HurtByTargetGoal(this, new Class[0])).setAlertOthers(new Class[0]));
        this.targetSelector.addGoal(5, new NearestAttackableTargetGoal(this, SlimelingEntity.class, false, false) {
            public boolean canUse() {
                double x = DarkLatexMothEntity.this.getX();
                double y = DarkLatexMothEntity.this.getY();
                double z = DarkLatexMothEntity.this.getZ();
                Entity entity = DarkLatexMothEntity.this;
                Level world = DarkLatexMothEntity.this.level;
                return super.canUse() && TargetwearingmaskProcedure.execute(entity);
            }
        });
        this.targetSelector.addGoal(6, new NearestAttackableTargetGoal(this, MilitaryflameunitEntity.class, true, false) {
            public boolean canUse() {
                double x = DarkLatexMothEntity.this.getX();
                double y = DarkLatexMothEntity.this.getY();
                double z = DarkLatexMothEntity.this.getZ();
                Entity entity = DarkLatexMothEntity.this;
                Level world = DarkLatexMothEntity.this.level;
                return super.canUse() && TargetwearingmaskProcedure.execute(entity);
            }
        });
        this.targetSelector.addGoal(7, new NearestAttackableTargetGoal(this, ScientistEntity.class, true, false) {
            public boolean canUse() {
                double x = DarkLatexMothEntity.this.getX();
                double y = DarkLatexMothEntity.this.getY();
                double z = DarkLatexMothEntity.this.getZ();
                Entity entity = DarkLatexMothEntity.this;
                Level world = DarkLatexMothEntity.this.level;
                return super.canUse() && TargetwearingmaskProcedure.execute(entity);
            }
        });
        this.targetSelector.addGoal(8, new NearestAttackableTargetGoal(this, MilitaryEntity.class, true, false) {
            public boolean canUse() {
                double x = DarkLatexMothEntity.this.getX();
                double y = DarkLatexMothEntity.this.getY();
                double z = DarkLatexMothEntity.this.getZ();
                Entity entity = DarkLatexMothEntity.this;
                Level world = DarkLatexMothEntity.this.level;
                return super.canUse() && TargetwearingmaskProcedure.execute(entity);
            }
        });
        this.targetSelector.addGoal(9, new NearestAttackableTargetGoal(this, EvilScientistEntity.class, true, false) {
            public boolean canUse() {
                double x = DarkLatexMothEntity.this.getX();
                double y = DarkLatexMothEntity.this.getY();
                double z = DarkLatexMothEntity.this.getZ();
                Entity entity = DarkLatexMothEntity.this;
                Level world = DarkLatexMothEntity.this.level;
                return super.canUse() && TargetwearingmaskProcedure.execute(entity);
            }
        });
        this.targetSelector.addGoal(10, new NearestAttackableTargetGoal(this, EvilSniperEntity.class, true, false) {
            public boolean canUse() {
                double x = DarkLatexMothEntity.this.getX();
                double y = DarkLatexMothEntity.this.getY();
                double z = DarkLatexMothEntity.this.getZ();
                Entity entity = DarkLatexMothEntity.this;
                Level world = DarkLatexMothEntity.this.level;
                return super.canUse() && TargetwearingmaskProcedure.execute(entity);
            }
        });
        this.targetSelector.addGoal(11, new NearestAttackableTargetGoal(this, EvilMilitaryEntity.class, true, false) {
            public boolean canUse() {
                double x = DarkLatexMothEntity.this.getX();
                double y = DarkLatexMothEntity.this.getY();
                double z = DarkLatexMothEntity.this.getZ();
                Entity entity = DarkLatexMothEntity.this;
                Level world = DarkLatexMothEntity.this.level;
                return super.canUse() && TargetwearingmaskProcedure.execute(entity);
            }
        });
        this.targetSelector.addGoal(12, new NearestAttackableTargetGoal(this, Player.class, true, false) {
            public boolean canUse() {
                double x = DarkLatexMothEntity.this.getX();
                double y = DarkLatexMothEntity.this.getY();
                double z = DarkLatexMothEntity.this.getZ();
                Entity entity = DarkLatexMothEntity.this;
                Level world = DarkLatexMothEntity.this.level;
                return super.canUse() && TargetwearingmaskProcedure.execute(entity);
            }
        });
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
        this.goalSelector.addGoal(27, new RandomStrollGoal(this, 0.8, 20) {
            protected Vec3 getPosition() {
                Random random = DarkLatexMothEntity.this.getRandom();
                double dir_x = DarkLatexMothEntity.this.getX() + (double)((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
                double dir_y = DarkLatexMothEntity.this.getY() + (double)((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
                double dir_z = DarkLatexMothEntity.this.getZ() + (double)((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
                return new Vec3(dir_x, dir_y, dir_z);
            }
        });
        this.goalSelector.addGoal(28, new RandomStrollGoal(this, 0.8));
        this.goalSelector.addGoal(29, new LookAtPlayerGoal(this, LivingEntity.class, 5.0F));
        this.goalSelector.addGoal(30, new RandomLookAroundGoal(this));
        this.goalSelector.addGoal(31, new FloatGoal(this));
        this.goalSelector.addGoal(32, new LeapAtTargetGoal(this, 0.5F));
    }

    public MobType getMobType() {
        return MobType.ARTHROPOD;
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

    public boolean causeFallDamage(float l, float d, DamageSource source) {
        return false;
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

    public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
        DarklatexOnInitialEntitySpawnProcedure.execute(this);
        return retval;
    }

    public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
        super.awardKillScore(entity, score, damageSource);
        DarklatexThisEntityKillsAnotherOneProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), entity, this);
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
        DungeonHooks.addDungeonMob((EntityType)LatexModEntities.DARK_LATEX_MOTH.get(), 180);
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0.225);
        builder = builder.add(Attributes.MAX_HEALTH, 18.0);
        builder = builder.add(Attributes.ARMOR, 1.5);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 3.0);
        builder = builder.add(Attributes.FOLLOW_RANGE, 16.0);
        builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.3);
        builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.5);
        builder = builder.add(Attributes.FLYING_SPEED, 0.225);
        return builder;
    }
}
