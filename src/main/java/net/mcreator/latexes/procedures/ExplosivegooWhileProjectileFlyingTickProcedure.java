package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/ExplosivegooWhileProjectileFlyingTickProcedure.class */
public class ExplosivegooWhileProjectileFlyingTickProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world instanceof ServerLevel) {
            ((ServerLevel) world).sendParticles((SimpleParticleType) LatexModParticleTypes.DLEFFECTPARTICLES.get(), x, y, z, 6, 1.0d, 1.0d, 1.0d, 0.1d);
        }
    }
}
