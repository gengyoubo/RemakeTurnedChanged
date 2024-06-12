package net.ltxprogrammer.turned.entity;

import java.util.EnumSet;
import java.util.Random;
import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
import net.ltxprogrammer.changed.init.ChangedItems;
import net.ltxprogrammer.changed.init.ChangedParticles;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.ltxprogrammer.turned.procedures.CheckforskyProcedure;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/entity/DLbeeEntity.class */
public class DLbeeEntity extends AbstractDarkLatexEntity {
    public DLbeeEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType) LatexModEntities.D_LBEE.get(), world);
    }

    public DLbeeEntity(EntityType<DLbeeEntity> type, Level world) {
        super(type, world);
        this.xpReward = 6;
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
        this.goalSelector.addGoal(1, new Goal() { // from class: net.ltxprogrammer.turned.entity.DLbeeEntity.1
            {
                setFlags(EnumSet.of(Goal.Flag.MOVE));
            }

            public boolean canUse() {
                if (DLbeeEntity.this.getTarget() == null || DLbeeEntity.this.getMoveControl().hasWanted()) {
                    return false;
                }
                DLbeeEntity.this.getX();
                DLbeeEntity.this.getY();
                DLbeeEntity.this.getZ();
                DLbeeEntity dLbeeEntity = DLbeeEntity.this;
                return true;
            }

            public boolean canContinueToUse() {
                return DLbeeEntity.this.getMoveControl().hasWanted() && DLbeeEntity.this.getTarget() != null && DLbeeEntity.this.getTarget().isAlive();
            }

            public void start() {
                Vec3 vec3d = DLbeeEntity.this.getTarget().getEyePosition(1.0f);
                DLbeeEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1.0d);
            }

            public void tick() {
                LivingEntity livingentity = DLbeeEntity.this.getTarget();
                if (DLbeeEntity.this.getBoundingBox().intersects(livingentity.getBoundingBox())) {
                    DLbeeEntity.this.doHurtTarget(livingentity);
                } else if (DLbeeEntity.this.distanceToSqr(livingentity) < 16.0d) {
                    Vec3 vec3d = livingentity.getEyePosition(1.0f);
                    DLbeeEntity.this.moveControl.setWantedPosition(vec3d.x, vec3d.y, vec3d.z, 1.0d);
                }
            }
        });
        this.goalSelector.addGoal(2, new MeleeAttackGoal(this, 1.0d, true) { // from class: net.ltxprogrammer.turned.entity.DLbeeEntity.2
            protected double getAttackReachSqr(LivingEntity entity) {
                return 4.0d + ((double) (entity.getBbWidth() * entity.getBbWidth()));
            }
        });
        this.goalSelector.addGoal(24, new WaterAvoidingRandomStrollGoal(this, 0.8d));
        this.goalSelector.addGoal(25, new RandomStrollGoal(this, 0.8d, 20) { // from class: net.ltxprogrammer.turned.entity.DLbeeEntity.3
            protected Vec3 getPosition() {
                Random random = DLbeeEntity.this.getRandom();
                return new Vec3(DLbeeEntity.this.getX() + ((double) (((random.nextFloat() * 2.0f) - 1.0f) * 16.0f)), DLbeeEntity.this.getY() + ((double) (((random.nextFloat() * 2.0f) - 1.0f) * 16.0f)), DLbeeEntity.this.getZ() + ((double) (((random.nextFloat() * 2.0f) - 1.0f) * 16.0f)));
            }

            public boolean canUse() {
                double x = DLbeeEntity.this.getX();
                double y = DLbeeEntity.this.getY();
                double z = DLbeeEntity.this.getZ();
                DLbeeEntity dLbeeEntity = DLbeeEntity.this;
                return canUse() && CheckforskyProcedure.execute(DLbeeEntity.this.level, x, y, z);
            }
        });
    }

    public MobType getMobType() {
        return MobType.ARTHROPOD;
    }

    protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
        dropCustomDeathLoot(source, looting, recentlyHitIn);
        spawnAtLocation(new ItemStack((ItemLike) ChangedItems.DARK_LATEX_GOO.get()));
    }

    public SoundEvent getAmbientSound() {
        return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.bee.loop"));
    }

    public void setNoGravity(boolean ignored) {
        setNoGravity(true);
    }

    public void aiStep() {
        aiStep();
        setNoGravity(true);
    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        return Mob.createMobAttributes().add(Attributes.MOVEMENT_SPEED, 0.5d).add(Attributes.MAX_HEALTH, 20.0d).add(Attributes.ARMOR, 0.0d).add(Attributes.ATTACK_DAMAGE, 4.0d).add(Attributes.FOLLOW_RANGE, 16.0d).add(Attributes.FLYING_SPEED, 0.5d);
    }

    public ChangedParticles.Color3 getDripColor() {
        return ChangedParticles.Color3.DARK;
    }
}
