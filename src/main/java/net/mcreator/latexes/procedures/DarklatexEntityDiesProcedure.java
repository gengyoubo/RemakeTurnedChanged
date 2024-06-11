package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModBlocks;
import net.mcreator.latexes.init.LatexModGameRules;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarklatexEntityDiesProcedure.class */
public class DarklatexEntityDiesProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null && world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXESLEAVEBLOCK)) {
            if (world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.BEDROCK) {
                return;
            }
            if ((world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.AIR) && Math.random() < 0.72d && !entity.isOnFire()) {
                world.setBlock(new BlockPos(x, y, z), ((Block) LatexModBlocks.DARKLATEXCARPET.get()).defaultBlockState(), 3);
            }
        }
    }
}
