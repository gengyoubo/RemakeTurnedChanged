package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarklatexblockcrystalgrowUpdateTickProcedure.class */
public class DarklatexblockcrystalgrowUpdateTickProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (Math.random() >= 0.3d) {
            return;
        }
        if (!(world.getBlockState(new BlockPos(x, y + 1.0d, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x, y + 1.0d, z)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x, y + 1.0d, z)).getBlock() == Blocks.CAVE_AIR)) {
            return;
        }
        if (world.getBlockState(new BlockPos(x, y + 1.0d, z)).getBlock() == LatexModBlocks.DARKLATEXCRYSTALEGG.get()) {
            return;
        }
        world.setBlock(new BlockPos(x, y + 1.0d, z), ((Block) LatexModBlocks.DARKLATEXCRYSTALEGG.get()).defaultBlockState(), 3);
    }
}
