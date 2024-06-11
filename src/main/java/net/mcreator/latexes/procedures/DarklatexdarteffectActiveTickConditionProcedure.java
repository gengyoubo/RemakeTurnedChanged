package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarklatexdarteffectActiveTickConditionProcedure.class */
public class DarklatexdarteffectActiveTickConditionProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        world.addParticle((SimpleParticleType) LatexModParticleTypes.DLEFFECTPARTICLES.get(), x, y, z, 0.0d, 1.0d, 0.0d);
    }
}
