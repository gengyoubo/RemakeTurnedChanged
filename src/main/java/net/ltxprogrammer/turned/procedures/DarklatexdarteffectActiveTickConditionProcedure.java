package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.init.LatexModParticleTypes;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/DarklatexdarteffectActiveTickConditionProcedure.class */
public class DarklatexdarteffectActiveTickConditionProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        world.addParticle((SimpleParticleType) LatexModParticleTypes.DLEFFECTPARTICLES.get(), x, y, z, 0.0d, 1.0d, 0.0d);
    }
}
