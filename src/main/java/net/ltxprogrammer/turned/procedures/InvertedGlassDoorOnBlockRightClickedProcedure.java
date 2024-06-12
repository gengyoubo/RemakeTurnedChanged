package net.ltxprogrammer.turned.procedures;

import java.util.Map;
import net.ltxprogrammer.turned.init.LatexModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/InvertedGlassDoorOnBlockRightClickedProcedure.class */
public class InvertedGlassDoorOnBlockRightClickedProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        BlockPos _bp = new BlockPos(x, y, z);
        BlockState _bs = LatexModBlocks.INVERTED_OPEN_GLASS_DOOR.get().defaultBlockState();
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
    }
}
