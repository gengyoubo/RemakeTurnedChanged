package net.ltxprogrammer.turned.procedures;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/FlamethowerWhileBulletFlyingTickProcedure.class */
public class FlamethowerWhileBulletFlyingTickProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world instanceof ServerLevel) {
            ((ServerLevel) world).sendParticles(ParticleTypes.FLAME, x, y, z, 5, 1.0d, 1.0d, 1.0d, 1.0d);
        }
    }
}
