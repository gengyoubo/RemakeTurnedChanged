//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.entity;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Random;
import javax.annotation.Nullable;
import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
import net.ltxprogrammer.changed.init.ChangedItems;
import net.ltxprogrammer.changed.util.Color3;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.ltxprogrammer.turned.procedures.DarklatexOnInitialEntitySpawnProcedure;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.network.protocol.Packet;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.control.FlyingMoveControl;
import net.minecraft.world.entity.ai.goal.Goal;
import net.minecraft.world.entity.ai.goal.LeapAtTargetGoal;
import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
import net.minecraft.world.entity.ai.navigation.PathNavigation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.ServerLevelAccessor;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.DungeonHooks;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import org.jetbrains.annotations.NotNull;

public class DarkLatexMothEntity extends AbstractDarkLatexEntity {
    public DarkLatexMothEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType)LatexModEntities.DARK_LATEX_MOTH.get(), world);
    }

    public DarkLatexMothEntity(EntityType<DarkLatexMothEntity> type, Level world) {
        super(type, world);
        this.xpReward = 5;
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
                if (DarkLatexMothEntity.this.getBoundingBox().intersects(Objects.requireNonNull(livingentity).getBoundingBox())) {
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
        this.goalSelector.addGoal(27, new RandomStrollGoal(this, 0.8, 20) {
            protected Vec3 getPosition() {
                Random random = DarkLatexMothEntity.this.getRandom();
                double dir_x = DarkLatexMothEntity.this.getX() + (double)((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
                double dir_y = DarkLatexMothEntity.this.getY() + (double)((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
                double dir_z = DarkLatexMothEntity.this.getZ() + (double)((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
                return new Vec3(dir_x, dir_y, dir_z);
            }
        });
        this.goalSelector.addGoal(32, new LeapAtTargetGoal(this, 0.5F));
    }

    public MobType getMobType() {
        return MobType.ARTHROPOD;
    }

    protected void dropCustomDeathLoot(@NotNull DamageSource source, int looting, boolean recentlyHitIn) {
        super.dropCustomDeathLoot(source, looting, recentlyHitIn);
        this.spawnAtLocation(new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
    }

    public SpawnGroupData finalizeSpawn(@NotNull ServerLevelAccessor world, @NotNull DifficultyInstance difficulty, @NotNull MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
        DarklatexOnInitialEntitySpawnProcedure.execute(this);
        return retval;
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

    public Color3 getDripColor() {
        return Color3.DARK;
    }
}
