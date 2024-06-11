package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModBlocks;
import net.mcreator.latexes.init.LatexModGameRules;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarkLatexSpiderEntityDiesProcedure.class */
public class DarkLatexSpiderEntityDiesProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXESLEAVEBLOCK)) {
            if (world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.BEDROCK) {
                return;
            }
            if (Math.random() < 0.64d) {
                world.setBlock(new BlockPos(x, y - 1.0d, z), ((Block) LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState(), 3);
            } else if (Math.random() < 0.12d) {
                world.setBlock(new BlockPos(x, y - 1.0d, z), ((Block) LatexModBlocks.LATEXCOBWEBFIX.get()).defaultBlockState(), 3);
            }
        }
    }
}
