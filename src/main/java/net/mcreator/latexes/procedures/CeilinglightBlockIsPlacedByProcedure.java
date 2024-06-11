package net.mcreator.latexes.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/CeilinglightBlockIsPlacedByProcedure.class */
public class CeilinglightBlockIsPlacedByProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world.getBlockState(new BlockPos(x, y + 1.0d, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x, y + 1.0d, z)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x, y + 1.0d, z)).getBlock() == Blocks.VOID_AIR) {
            BlockPos _pos = new BlockPos(x, y, z);
            Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), (BlockEntity) null);
            world.destroyBlock(_pos, false);
        }
    }
}
