package net.ltxprogrammer.turned.client.particle;

import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.TextureSheetParticle;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/particle/DleffectparticlesParticle.class */
public class DleffectparticlesParticle extends TextureSheetParticle {
    private final SpriteSet spriteSet;
    private float angularVelocity = 0.0f;
    private final float angularAcceleration = 1.2f;

    public static DleffectparticlesParticleProvider provider(SpriteSet spriteSet) {
        return new DleffectparticlesParticleProvider(spriteSet);
    }

    /* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/client/particle/DleffectparticlesParticle$DleffectparticlesParticleProvider.class */
    public static class DleffectparticlesParticleProvider implements ParticleProvider<SimpleParticleType> {
        private final SpriteSet spriteSet;

        public DleffectparticlesParticleProvider(SpriteSet spriteSet) {
            this.spriteSet = spriteSet;
        }

        public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
            return new DleffectparticlesParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
        }
    }

    protected DleffectparticlesParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
        super(world, x, y, z);
        this.spriteSet = spriteSet;
        setSize(0.5f, 0.5f);
        this.quadSize *= 0.4f;
        this.lifetime = 15;
        this.gravity = -0.4f;
        this.hasPhysics = true;
        this.xd = vx * 0.5d;
        this.yd = vy * 0.5d;
        this.zd = vz * 0.5d;
        setSpriteFromAge(spriteSet);
    }

    public ParticleRenderType getRenderType() {
        return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
    }

    public void tick() {
        tick();
        this.oRoll = this.roll;
        this.roll += this.angularVelocity;
        this.angularVelocity += this.angularAcceleration;
        if (!this.removed) {
            setSprite(this.spriteSet.get(((this.age / 15) % 5) + 1, 5));
        }
    }
}
