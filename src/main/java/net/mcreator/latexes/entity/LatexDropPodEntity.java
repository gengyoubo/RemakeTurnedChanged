//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.entity;

import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.procedures.DROPPODEntityDiesProcedure;
import net.mcreator.latexes.procedures.LatexDropPodOnEntityTickUpdateProcedure;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.protocol.Packet;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.AreaEffectCloud;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobType;
import net.minecraft.world.entity.PathfinderMob;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.ThrownPotion;
import net.minecraft.world.level.Level;
import net.minecraftforge.network.NetworkHooks;
import net.minecraftforge.network.PlayMessages;
import net.minecraftforge.registries.ForgeRegistries;

public class LatexDropPodEntity extends PathfinderMob {
    public LatexDropPodEntity(PlayMessages.SpawnEntity packet, Level world) {
        this((EntityType)LatexModEntities.LATEX_DROP_POD.get(), world);
    }

    public LatexDropPodEntity(EntityType<LatexDropPodEntity> type, Level world) {
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
    }

    public MobType getMobType() {
        return MobType.UNDEFINED;
    }

    public boolean removeWhenFarAway(double distanceToClosestPlayer) {
        return false;
    }

    public SoundEvent getHurtSound(DamageSource ds) {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
    }

    public SoundEvent getDeathSound() {
        return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.land"));
    }

    public boolean hurt(DamageSource source, float amount) {
        if (source.getDirectEntity() instanceof Player) {
            return false;
        } else if (!(source.getDirectEntity() instanceof ThrownPotion) && !(source.getDirectEntity() instanceof AreaEffectCloud)) {
            if (source == DamageSource.FALL) {
                return false;
            } else if (source == DamageSource.CACTUS) {
                return false;
            } else if (source == DamageSource.DROWN) {
                return false;
            } else if (source == DamageSource.LIGHTNING_BOLT) {
                return false;
            } else if (source.getMsgId().equals("trident")) {
                return false;
            } else if (source == DamageSource.ANVIL) {
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
        DROPPODEntityDiesProcedure.execute(this.level, this.getX(), this.getY(), this.getZ());
    }

    public void baseTick() {
        super.baseTick();
        LatexDropPodOnEntityTickUpdateProcedure.execute(this.level, this.getX(), this.getY(), this.getZ(), this);
    }

    public void aiStep() {
        super.aiStep();
        double x = this.getX();
        double y = this.getY();
        double z = this.getZ();
        Level world = this.level;

        for(int l = 0; l < 5; ++l) {
            double x0 = x + (double)this.random.nextFloat();
            double y0 = y + (double)this.random.nextFloat();
            double z0 = z + (double)this.random.nextFloat();
            double dx = ((double)this.random.nextFloat() - 0.5) * 0.25;
            double dy = ((double)this.random.nextFloat() - 0.5) * 0.25;
            double dz = ((double)this.random.nextFloat() - 0.5) * 0.25;
            world.addParticle(ParticleTypes.LARGE_SMOKE, x0, y0, z0, dx, dy, dz);
        }

    }

    public static void init() {
    }

    public static AttributeSupplier.Builder createAttributes() {
        AttributeSupplier.Builder builder = Mob.createMobAttributes();
        builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3);
        builder = builder.add(Attributes.MAX_HEALTH, 25.0);
        builder = builder.add(Attributes.ARMOR, 0.0);
        builder = builder.add(Attributes.ATTACK_DAMAGE, 3.0);
        builder = builder.add(Attributes.FOLLOW_RANGE, 16.0);
        return builder;
    }
}
