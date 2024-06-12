package net.ltxprogrammer.turned.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/NukeBlockDestroyedByExplosionProcedure.class */
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
