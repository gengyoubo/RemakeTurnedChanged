package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/LatexcannonBulletHitsBlockProcedure.class */
public class LatexcannonBulletHitsBlockProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (!(world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.CAVE_AIR)) {
            if (world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x, y, z)).getBlock() == LatexModBlocks.DARKLATEXBLOCK.get() || world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.CAVE_AIR) {
                world.setBlock(new BlockPos(x, y, z), ((Block) LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState(), 3);
            }
        }
    }
}
