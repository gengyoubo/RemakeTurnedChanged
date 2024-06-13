//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.entity;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Random;
import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
import net.ltxprogrammer.changed.init.ChangedItems;
import net.ltxprogrammer.changed.util.Color3;
import LatexModEntities;
import net.ltxprogrammer.turned.procedures.CheckforskyProcedure;
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
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

public class DLbeeEntity extends AbstractDarkLatexEntity {
    public DLbeeEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.D_LBEE.get(), world);
    }

    public DLbeeEntity(EntityType<DLbeeEntity> type, Level world) {
        super(type, world);
        this.xpReward = 6;
        this.setNoAi(false);
        this.moveControl = new FlyingMoveControl(this, 10, true);
    }

    public @NotNull Packet<?> getAddEntityPacket() {
        return NetworkHooks.getEntitySpawningPacket(this);
    }

    protected @NotNull PathNavigation createNavigation(@NotNull Level world) {
        return new FlyingPathNavigation(this, world);
    }

    protected void registerGoals() {
        super.registerGoals();
        this.goalSelector.addGoal(1, new Goal() {
            {
                this.setFlags(EnumSet.of(Flag.MOVE));
            }

            public boolean canUse() {
                if (DLbeeEntity.this.getTarget() != null && !DLbeeEntity.this.getMoveControl().hasWanted()) {
                    double x = DLbeeEntity.this.getX();
                    double y = DLbeeEntity.this.getY();
                    double z = DLbeeEntity.this.getZ();
                    Entity entity = DLbeeEntity.this;
                    return true;
                } else {
                    return false;
                }
            }

            public boolean canContinueToUse() {
                return DLbeeEntity.this.getMoveControl().hasWanted() && DLbeeEntity.this.getTarget() != null && DLbeeEntity.this.getTarget().isAlive();
            }

            public void start() {
                LivingEntity livingentity = DLbeeEntity.this.getTarget();
                Vec3 vec3d = livingentity.getEyePosition(1.0F);
                DLbeeEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1.0);
            }

            public void tick() {
                LivingEntity livingentity = DLbeeEntity.this.getTarget();
                if (DLbeeEntity.this.getBoundingBox().intersects(Objects.requireNonNull(livingentity).getBoundingBox())) {
                    DLbeeEntity.this.doHurtTarget(livingentity);
                } else {
                    double d0 = DLbeeEntity.this.distanceToSqr(livingentity);
                    if (d0 < 16.0) {
                        Vec3 vec3d = livingentity.getEyePosition(1.0F);
                        DLbeeEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1.0);
                    }
                }

            }
        });
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.0, true) {
            protected double getAttackReachSqr(@NotNull LivingEntity entity) {
                return 4.0 + (double)(entity.getBbWidth() * entity.getBbWidth());
            }
        });
        this.goalSelector.addGoal(24, new WaterAvoidingRandomStrollGoal(this, 0.8));
        this.goalSelector.addGoal(25, new RandomStrollGoal(this, 0.8, 20) {
            protected Vec3 getPosition() {
                Random random = DLbeeEntity.this.getRandom();
                double dir_x = DLbeeEntity.this.getX() + (double)((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
                double dir_y = DLbeeEntity.this.getY() + (double)((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
                double dir_z = DLbeeEntity.this.getZ() + (double)((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
                return new Vec3(dir_x, dir_y, dir_z);
            }

            public boolean canUse() {
                double x = DLbeeEntity.this.getX();
                double y = DLbeeEntity.this.getY();
                double z = DLbeeEntity.this.getZ();
                Entity entity = DLbeeEntity.this;
                Level world = DLbeeEntity.this.level;
                return super.canUse() && CheckforskyProcedure.execute(world, x, y, z);
            }
        });
    }

    public MobType getMobType() {
        return MobType.ARTHROPOD;
    }

    protected void dropCustomDeathLoot(@NotNull DamageSource source, int looting, boolean recentlyHitIn) {
        super.dropCustomDeathLoot(source, looting, recentlyHitIn);
        this.spawnAtLocation(new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
    }

    public SoundEvent getAmbientSound() {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.bee.loop"));
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
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0.5);
        builder = builder.add(Attributes.MAX_HEALTH, 20.0);
        builder = builder.add(Attributes.ARMOR, 0.0);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 4.0);
        builder = builder.add(Attributes.FOLLOW_RANGE, 16.0);
        builder = builder.add(Attributes.FLYING_SPEED, 0.5);
        return builder;
    }

    public Color3 getDripColor() {
        return Color3.DARK;
    }
}
