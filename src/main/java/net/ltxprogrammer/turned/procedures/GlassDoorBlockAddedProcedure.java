package net.ltxprogrammer.turned.procedures;

import java.util.Map;
import net.ltxprogrammer.turned.init.LatexModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/GlassDoorBlockAddedProcedure.class */
public class GlassDoorBlockAddedProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world.getBlockState(new BlockPos(x + 1.0d, y, z)).getBlock() == LatexModBlocks.GLASS_DOOR.get()) {
            BlockPos _bp = new BlockPos(x + 1.0d, y, z);
            BlockState _bs = LatexModBlocks.INVERTED_GLASS_DOOR.get().defaultBlockState();
            for (Map.Entry<Property<?>, Comparable<?>> propertyComparableEntry : world.getBlockState(_bp).getValues().entrySet()) {
                Map.Entry<Property<?>, Comparable<?>> entry = (Map.Entry) propertyComparableEntry;
                Property<?> _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
                if (!(_property == null)) {
                    try {
                        _bs = (BlockState) _bs.setValue(_property, entry.getValue());
                    } catch (Exception e) {
                    }
                }
            }
            world.setBlock(_bp, _bs, 3);
        } else if (world.getBlockState(new BlockPos(x - 1.0d, y, z)).getBlock() == LatexModBlocks.GLASS_DOOR.get()) {
            InvertedOpenGlassDoorOnBlockRightClickedProcedure.execute(world, x, y, z);
        } else if (world.getBlockState(new BlockPos(x, y, z + 1.0d)).getBlock() == LatexModBlocks.GLASS_DOOR.get()) {
            InvertedGlassDoorOnBlockRightClickedProcedure.execute(world, x, y, z);
        } else if (world.getBlockState(new BlockPos(x, y, z - 1.0d)).getBlock() == LatexModBlocks.GLASS_DOOR.get()) {
            BlockPos _bp4 = new BlockPos(x, y, z - 1.0d);
            BlockState _bs4 = LatexModBlocks.INVERTED_GLASS_DOOR.get().defaultBlockState();
            for (Map.Entry<Property<?>, Comparable<?>> propertyComparableEntry : world.getBlockState(_bp4).getValues().entrySet()) {
                Map.Entry<Property<?>, Comparable<?>> entry4 = (Map.Entry) propertyComparableEntry;
                Property<?> _property4 = _bs4.getBlock().getStateDefinition().getProperty(entry4.getKey().getName());
                if (!(_property4 == null)) {
                    try {
                        _bs4 = (BlockState) _bs4.setValue(_property4, entry4.getValue());
                    } catch (Exception e4) {
                    }
                }
            }
            world.setBlock(_bp4, _bs4, 3);
        }
    }
}
