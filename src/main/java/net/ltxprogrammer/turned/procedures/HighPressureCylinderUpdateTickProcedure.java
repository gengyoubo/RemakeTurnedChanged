package net.ltxprogrammer.turned.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/HighPressureCylinderUpdateTickProcedure.class */
public class HighPressureCylinderUpdateTickProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if ((world.getBlockState(new BlockPos(x + 1.0d, y, z)).getBlock() == Blocks.FIRE || world.getBlockState(new BlockPos(x - 1.0d, y, z)).getBlock() == Blocks.FIRE || world.getBlockState(new BlockPos(x, y, z + 1.0d)).getBlock() == Blocks.FIRE || world.getBlockState(new BlockPos(x, y, z - 1.0d)).getBlock() == Blocks.FIRE) && Math.random() < 0.1d && (world instanceof Level _level)) {
            if (!_level.isClientSide()) {
                _level.explode(null, x, y, z, 4.0f, Explosion.BlockInteraction.BREAK);
            }
        }
    }
}
