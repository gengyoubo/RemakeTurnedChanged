package net.ltxprogrammer.turned.procedures;

import com.google.common.collect.UnmodifiableIterator;
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
            BlockState _bs = ((Block) LatexModBlocks.INVERTED_GLASS_DOOR.get()).defaultBlockState();
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
        } else if (world.getBlockState(new BlockPos(x - 1.0d, y, z)).getBlock() == LatexModBlocks.GLASS_DOOR.get()) {
            BlockPos _bp2 = new BlockPos(x, y, z);
            BlockState _bs2 = ((Block) LatexModBlocks.INVERTED_GLASS_DOOR.get()).defaultBlockState();
            UnmodifiableIterator it2 = world.getBlockState(_bp2).getValues().entrySet().iterator();
            while (it2.hasNext()) {
                Map.Entry<Property<?>, Comparable<?>> entry2 = (Map.Entry) it2.next();
                Property _property2 = _bs2.getBlock().getStateDefinition().getProperty(entry2.getKey().getName());
                if (!(_property2 == null || _bs2.getValue(_property2) == null)) {
                    try {
                        _bs2 = (BlockState) _bs2.setValue(_property2, entry2.getValue());
                    } catch (Exception e2) {
                    }
                }
            }
            world.setBlock(_bp2, _bs2, 3);
        } else if (world.getBlockState(new BlockPos(x, y, z + 1.0d)).getBlock() == LatexModBlocks.GLASS_DOOR.get()) {
            BlockPos _bp3 = new BlockPos(x, y, z);
            BlockState _bs3 = ((Block) LatexModBlocks.INVERTED_OPEN_GLASS_DOOR.get()).defaultBlockState();
            UnmodifiableIterator it3 = world.getBlockState(_bp3).getValues().entrySet().iterator();
            while (it3.hasNext()) {
                Map.Entry<Property<?>, Comparable<?>> entry3 = (Map.Entry) it3.next();
                Property _property3 = _bs3.getBlock().getStateDefinition().getProperty(entry3.getKey().getName());
                if (!(_property3 == null || _bs3.getValue(_property3) == null)) {
                    try {
                        _bs3 = (BlockState) _bs3.setValue(_property3, entry3.getValue());
                    } catch (Exception e3) {
                    }
                }
            }
            world.setBlock(_bp3, _bs3, 3);
        } else if (world.getBlockState(new BlockPos(x, y, z - 1.0d)).getBlock() == LatexModBlocks.GLASS_DOOR.get()) {
            BlockPos _bp4 = new BlockPos(x, y, z - 1.0d);
            BlockState _bs4 = ((Block) LatexModBlocks.INVERTED_GLASS_DOOR.get()).defaultBlockState();
            UnmodifiableIterator it4 = world.getBlockState(_bp4).getValues().entrySet().iterator();
            while (it4.hasNext()) {
                Map.Entry<Property<?>, Comparable<?>> entry4 = (Map.Entry) it4.next();
                Property _property4 = _bs4.getBlock().getStateDefinition().getProperty(entry4.getKey().getName());
                if (!(_property4 == null || _bs4.getValue(_property4) == null)) {
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
