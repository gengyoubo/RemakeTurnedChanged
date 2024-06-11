package net.mcreator.latexes.procedures;

import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/TSCPistolWhileBulletFlyingTickProcedure.class */
public class TSCPistolWhileBulletFlyingTickProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        world.addParticle(ParticleTypes.WITCH, x, y, z, 1.0d, 1.0d, 1.0d);
    }
}
