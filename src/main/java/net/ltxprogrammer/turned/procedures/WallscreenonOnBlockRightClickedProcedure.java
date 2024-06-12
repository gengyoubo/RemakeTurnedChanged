package net.ltxprogrammer.turned.procedures;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import net.ltxprogrammer.turned.init.LatexModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/WallscreenonOnBlockRightClickedProcedure.class */
public class WallscreenonOnBlockRightClickedProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        BlockPos _bp = new BlockPos(x, y, z);
        BlockState _bs = ((Block) LatexModBlocks.WALLSCREEN.get()).defaultBlockState();
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
