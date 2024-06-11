package net.mcreator.latexes.procedures;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import net.mcreator.latexes.init.LatexModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/GlassDoorOnBlockRightClickedProcedure.class */
public class GlassDoorOnBlockRightClickedProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        BlockPos _bp = new BlockPos(x, y, z);
        BlockState _bs = ((Block) LatexModBlocks.OPEN_GLASS_DOOR.get()).defaultBlockState();
        UnmodifiableIterator it = world.getBlockState(_bp).getValues().entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<Property<?>, Comparable<?>> entry = (Map.Entry) it.next();
            Property _property = _bs.getBlock().getStateDefinition().getProperty(entry.getKey().getName());
            if (!(_property == null || _bs.getValue(_property) == null)) {
                try {
                    _bs = (BlockState) _bs.setValue(_property, entry.getValue());
                } catch (Exception e) {
                }
            }
        }
        world.setBlock(_bp, _bs, 3);
    }
}
