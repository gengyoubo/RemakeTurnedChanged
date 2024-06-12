package net.ltxprogrammer.turned.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/TankCannonBulletHitsBlockProcedure.class */
public class TankCannonBulletHitsBlockProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            entity.setSecondsOnFire(10);
            if (world instanceof Level _level) {
                if (!_level.isClientSide()) {
                    _level.explode(null, x, y, z, 5.0f, Explosion.BlockInteraction.BREAK);
                }
            }
        }
    }
}
