package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/LatexcapsuleBlockDestroyedByPlayerProcedure.class */
public class LatexcapsuleBlockDestroyedByPlayerProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (Math.random() < 0.5d) {
            world.setBlock(new BlockPos(x, y, z), ((Block) LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState(), 3);
        }
    }
}
