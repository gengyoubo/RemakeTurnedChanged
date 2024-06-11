package net.mcreator.latexes.procedures;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/TankCannonWhileBulletFlyingTickProcedure.class */
public class TankCannonWhileBulletFlyingTickProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world instanceof ServerLevel) {
            ((ServerLevel) world).sendParticles(ParticleTypes.SQUID_INK, x, y, z, 5, 1.0d, 1.0d, 1.0d, 1.0d);
        }
    }
}
