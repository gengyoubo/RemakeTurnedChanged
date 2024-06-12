package net.ltxprogrammer.turned.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/HertxOnSpawnProcedure.class */
public class HertxOnSpawnProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            HertxOnInitialEntitySpawnProcedure.execute(world, x, y, z, entity);
        }
    }
}
