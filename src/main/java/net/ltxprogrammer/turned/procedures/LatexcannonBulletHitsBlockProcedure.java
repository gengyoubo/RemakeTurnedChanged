package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.changed.init.ChangedBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/LatexcannonBulletHitsBlockProcedure.class */
public class LatexcannonBulletHitsBlockProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (!(world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.CAVE_AIR)) {
            if (world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x, y, z)).getBlock() == ChangedBlocks.DARK_LATEX_BLOCK.get() || world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.CAVE_AIR) {
                world.setBlock(new BlockPos(x, y, z), ChangedBlocks.DARK_LATEX_BLOCK.get().defaultBlockState(), 3);
            }
        }
    }
}
