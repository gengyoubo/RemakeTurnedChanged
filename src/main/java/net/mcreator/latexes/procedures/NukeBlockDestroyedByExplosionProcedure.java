package net.mcreator.latexes.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/NukeBlockDestroyedByExplosionProcedure.class */
public class NukeBlockDestroyedByExplosionProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world instanceof Level) {
            Level _level = (Level) world;
            if (!_level.isClientSide()) {
                _level.explode((Entity) null, x, y, z, 8.0f, Explosion.BlockInteraction.DESTROY);
            }
        }
    }
}
