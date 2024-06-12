package net.ltxprogrammer.turned.procedures;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/TSCPistolWhileBulletFlyingTickProcedure.class */
public class TSCPistolWhileBulletFlyingTickProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        world.addParticle(ParticleTypes.WITCH, x, y, z, 1.0d, 1.0d, 1.0d);
    }
}
