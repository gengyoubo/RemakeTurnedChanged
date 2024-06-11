package net.mcreator.latexes.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/HighPressureCylinderUpdateTickProcedure.class */
public class HighPressureCylinderUpdateTickProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if ((world.getBlockState(new BlockPos(x + 1.0d, y, z)).getBlock() == Blocks.FIRE || world.getBlockState(new BlockPos(x - 1.0d, y, z)).getBlock() == Blocks.FIRE || world.getBlockState(new BlockPos(x, y, z + 1.0d)).getBlock() == Blocks.FIRE || world.getBlockState(new BlockPos(x, y, z - 1.0d)).getBlock() == Blocks.FIRE) && Math.random() < 0.1d && (world instanceof Level)) {
            Level _level = (Level) world;
            if (!_level.isClientSide()) {
                _level.explode((Entity) null, x, y, z, 4.0f, Explosion.BlockInteraction.BREAK);
            }
        }
    }
}
