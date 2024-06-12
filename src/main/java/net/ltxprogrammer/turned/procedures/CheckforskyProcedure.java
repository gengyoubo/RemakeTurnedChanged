package net.ltxprogrammer.turned.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/CheckforskyProcedure.class */
public class CheckforskyProcedure {
    public static boolean execute(LevelAccessor world, double x, double y, double z) {
        return world.canSeeSkyFromBelowWater(new BlockPos(x, y, z));
    }
}
