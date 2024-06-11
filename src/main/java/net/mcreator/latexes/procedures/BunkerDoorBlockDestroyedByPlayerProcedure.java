package net.mcreator.latexes.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/BunkerDoorBlockDestroyedByPlayerProcedure.class */
public class BunkerDoorBlockDestroyedByPlayerProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world.getBlockState(new BlockPos(x, y, z + 1.0d)).getBlock() == Blocks.BARRIER && world.getBlockState(new BlockPos(x, y, z - 1.0d)).getBlock() == Blocks.BARRIER) {
            world.setBlock(new BlockPos(x, y, z + 1.0d), Blocks.AIR.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x, y, z - 1.0d), Blocks.AIR.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x, y + 1.0d, z), Blocks.AIR.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x, y - 1.0d, z), Blocks.AIR.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x, y + 1.0d, z + 1.0d), Blocks.AIR.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x, y + 1.0d, z - 1.0d), Blocks.AIR.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x, y - 1.0d, z + 1.0d), Blocks.AIR.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x, y - 1.0d, z - 1.0d), Blocks.AIR.defaultBlockState(), 3);
            return;
        }
        world.setBlock(new BlockPos(x + 1.0d, y, z), Blocks.AIR.defaultBlockState(), 3);
        world.setBlock(new BlockPos(x - 1.0d, y, z), Blocks.AIR.defaultBlockState(), 3);
        world.setBlock(new BlockPos(x, y + 1.0d, z), Blocks.AIR.defaultBlockState(), 3);
        world.setBlock(new BlockPos(x, y - 1.0d, z), Blocks.AIR.defaultBlockState(), 3);
        world.setBlock(new BlockPos(x + 1.0d, y + 1.0d, z), Blocks.AIR.defaultBlockState(), 3);
        world.setBlock(new BlockPos(x - 1.0d, y + 1.0d, z), Blocks.AIR.defaultBlockState(), 3);
        world.setBlock(new BlockPos(x + 1.0d, y - 1.0d, z), Blocks.AIR.defaultBlockState(), 3);
        world.setBlock(new BlockPos(x - 1.0d, y - 1.0d, z), Blocks.AIR.defaultBlockState(), 3);
    }
}
