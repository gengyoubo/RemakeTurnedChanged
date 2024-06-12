package net.ltxprogrammer.turned.entity;

import java.util.EnumSet;
import java.util.Random;
import javax.annotation.Nullable;
import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
import net.ltxprogrammer.changed.init.ChangedItems;
import net.ltxprogrammer.changed.init.ChangedParticles;
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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/entity/DarkLatexMothEntity.class */
public class DarkLatexMothEntity extends AbstractDarkLatexEntity {
    public DarkLatexMothEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.DARK_LATEX_MOTH.get(), world);
    }

    public DarkLatexMothEntity(EntityType<DarkLatexMothEntity> type, Level world) {
        super(type, world);
        this.xpReward = 5;
        setNoAi(false);
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
        this.goalSelector.addGoal(2, new Goal() { // from class: net.ltxprogrammer.turned.entity.DarkLatexMothEntity.1
            {
                setFlags(EnumSet.of(Goal.Flag.MOVE));
            }

            public boolean canUse() {
                return DarkLatexMothEntity.this.getTarget() != null && !DarkLatexMothEntity.this.getMoveControl().hasWanted();
            }

            public boolean canContinueToUse() {
                return DarkLatexMothEntity.this.getMoveControl().hasWanted() && DarkLatexMothEntity.this.getTarget() != null && DarkLatexMothEntity.this.getTarget().isAlive();
            }

            public void start() {
                Vec3 vec3d = DarkLatexMothEntity.this.getTarget().getEyePosition(1.0f);
                DarkLatexMothEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1.0d);
            }

            public void tick() {
                LivingEntity livingentity = DarkLatexMothEntity.this.getTarget();
                if (DarkLatexMothEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
                    DarkLatexMothEntity.this.doHurtTarget(livingentity);
                } else if (DarkLatexMothEntity.this.distanceToSqr(livingentity) < 9.0d) {
                    Vec3 vec3d = livingentity.getEyePosition(1.0f);
                    DarkLatexMothEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1.0d);
                }
            }
        });
        this.goalSelector.addGoal(27, new RandomStrollGoal(this, 0.8d, 20) { // from class: net.ltxprogrammer.turned.entity.DarkLatexMothEntity.2
            protected Vec3 getPosition() {
                Random random = DarkLatexMothEntity.this.getRandom();
                return new Vec3(DarkLatexMothEntity.this.getX() + ((double) (((random.nextFloat() * 2.0f) - 1.0f) * 16.0f)), DarkLatexMothEntity.this.getY() + ((double) (((random.nextFloat() * 2.0f) - 1.0f) * 16.0f)), DarkLatexMothEntity.this.getZ() + ((double) (((random.nextFloat() * 2.0f) - 1.0f) * 16.0f)));
            }
        });
        this.goalSelector.addGoal(32, new LeapAtTargetGoal(this, 0.5f));
    }

    public MobType getMobType() {
        return MobType.ARTHROPOD;
    }

    protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
        dropCustomDeathLoot(source, looting, recentlyHitIn);
        spawnAtLocation(new ItemStack((ItemLike) ChangedItems.DARK_LATEX_GOO.get()));
    }

    public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
        SpawnGroupData retval = finalizeSpawn(world, difficulty, reason, livingdata, tag);
        DarklatexOnInitialEntitySpawnProcedure.execute(this);
        return retval;
    }

    public void setNoGravity(boolean ignored) {
        setNoGravity(true);
    }

    public void aiStep() {
        aiStep();
        setNoGravity(true);
    }

    public static void init() {
        DungeonHooks.addDungeonMob((EntityType) LatexModEntities.DARK_LATEX_MOTH.get(), 180);
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.225d).add(Attributes.MAX_HEALTH, 18.0d).add(Attributes.ARMOR, 1.5d).add(Attributes.ATTACK_DAMAGE, 3.0d).add(Attributes.FOLLOW_RANGE, 16.0d).add(Attributes.KNOCKBACK_RESISTANCE, 0.3d).add(Attributes.ATTACK_KNOCKBACK, 0.5d).add(Attributes.FLYING_SPEED, 0.225d);
    }

    public ChangedParticles.Color3 getDripColor() {
        return ChangedParticles.Color3.DARK;
    }
}
