package net.mcreator.latexes.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/CheckforskyProcedure.class */
public class CheckforskyProcedure {
    public static boolean execute(LevelAccessor world, double x, double y, double z) {
        return world.canSeeSkyFromBelowWater(new BlockPos(x, y, z));
    }
}
