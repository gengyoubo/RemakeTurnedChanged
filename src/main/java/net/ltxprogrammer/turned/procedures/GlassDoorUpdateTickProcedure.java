package net.ltxprogrammer.turned.procedures;

import java.util.Map;
import net.ltxprogrammer.turned.init.LatexModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/GlassDoorUpdateTickProcedure.class */
public class GlassDoorUpdateTickProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world.getBlockState(new BlockPos(x + 1.0d, y, z)).getBlock() == LatexModBlocks.OPEN_GLASS_DOOR.get()) {
            InvertedGlassDoorOnBlockRightClickedProcedure.execute(world, x, y, z);
        } else if (world.getBlockState(new BlockPos(x + 1.0d, y, z)).getBlock() == LatexModBlocks.GLASS_DOOR.get()) {
            InvertedOpenGlassDoorOnBlockRightClickedProcedure.execute(world, x, y, z);
        } else if (world.getBlockState(new BlockPos(x + 1.0d, y, z)).getBlock() == LatexModBlocks.INVERTED_OPEN_GLASS_DOOR.get()) {
            GlassDoorOnBlockRightClickedProcedure.execute(world, x, y, z);
        } else if (world.getBlockState(new BlockPos(x + 1.0d, y, z)).getBlock() == LatexModBlocks.INVERTED_GLASS_DOOR.get()) {
            OpenGlassDoorOnBlockRightClickedProcedure.execute(world, x, y, z);
        } else if (world.getBlockState(new BlockPos(x - 1.0d, y, z)).getBlock() == LatexModBlocks.OPEN_GLASS_DOOR.get()) {
            InvertedGlassDoorOnBlockRightClickedProcedure.execute(world, x, y, z);
        } else if (world.getBlockState(new BlockPos(x - 1.0d, y, z)).getBlock() == LatexModBlocks.GLASS_DOOR.get()) {
            InvertedOpenGlassDoorOnBlockRightClickedProcedure.execute(world, x, y, z);
        } else if (world.getBlockState(new BlockPos(x - 1.0d, y, z)).getBlock() == LatexModBlocks.INVERTED_OPEN_GLASS_DOOR.get()) {
            GlassDoorOnBlockRightClickedProcedure.execute(world, x, y, z);
        } else if (world.getBlockState(new BlockPos(x - 1.0d, y, z)).getBlock() == LatexModBlocks.INVERTED_GLASS_DOOR.get()) {
            OpenGlassDoorOnBlockRightClickedProcedure.execute(world, x, y, z);
        } else if (world.getBlockState(new BlockPos(x, y, z + 1.0d)).getBlock() == LatexModBlocks.OPEN_GLASS_DOOR.get()) {
            InvertedGlassDoorOnBlockRightClickedProcedure.execute(world, x, y, z);
        } else if (world.getBlockState(new BlockPos(x, y, z + 1.0d)).getBlock() == LatexModBlocks.GLASS_DOOR.get()) {
            InvertedOpenGlassDoorOnBlockRightClickedProcedure.execute(world, x, y, z);
        } else if (world.getBlockState(new BlockPos(x, y, z + 1.0d)).getBlock() == LatexModBlocks.INVERTED_OPEN_GLASS_DOOR.get()) {
            GlassDoorOnBlockRightClickedProcedure.execute(world, x, y, z);
        } else if (world.getBlockState(new BlockPos(x, y, z + 1.0d)).getBlock() == LatexModBlocks.INVERTED_GLASS_DOOR.get()) {
            OpenGlassDoorOnBlockRightClickedProcedure.execute(world, x, y, z);
        } else if (world.getBlockState(new BlockPos(x, y, z - 1.0d)).getBlock() == LatexModBlocks.OPEN_GLASS_DOOR.get()) {
            InvertedGlassDoorOnBlockRightClickedProcedure.execute(world, x, y, z);
        } else if (world.getBlockState(new BlockPos(x, y, z - 1.0d)).getBlock() == LatexModBlocks.GLASS_DOOR.get()) {
            InvertedOpenGlassDoorOnBlockRightClickedProcedure.execute(world, x, y, z);
        } else if (world.getBlockState(new BlockPos(x, y, z - 1.0d)).getBlock() == LatexModBlocks.INVERTED_OPEN_GLASS_DOOR.get()) {
            GlassDoorOnBlockRightClickedProcedure.execute(world, x, y, z);
        } else if (world.getBlockState(new BlockPos(x, y, z - 1.0d)).getBlock() == LatexModBlocks.INVERTED_GLASS_DOOR.get()) {
            OpenGlassDoorOnBlockRightClickedProcedure.execute(world, x, y, z);
        }
    }
}
