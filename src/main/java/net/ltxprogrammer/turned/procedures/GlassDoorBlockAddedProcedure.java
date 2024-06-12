//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.procedures;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import net.ltxprogrammer.turned.init.LatexModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

public class GlassDoorBlockAddedProcedure {
    public GlassDoorBlockAddedProcedure() {
    }

    public static void execute(LevelAccessor world, double x, double y, double z) {
        BlockPos _bp;
        BlockState _bs;
        BlockState _bso;
        UnmodifiableIterator var10;
        Map.Entry entry;
        Property _property;
        if (world.getBlockState(new BlockPos(x + 1.0, y, z)).getBlock() == LatexModBlocks.GLASS_DOOR.get()) {
            _bp = new BlockPos(x + 1.0, y, z);
            _bs = ((Block)LatexModBlocks.INVERTED_GLASS_DOOR.get()).defaultBlockState();
            _bso = world.getBlockState(_bp);
            var10 = _bso.getValues().entrySet().iterator();

            while(var10.hasNext()) {
                entry = (Map.Entry)var10.next();
                _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
                if (_property != null && _bs.getValue(_property) != null) {
                    try {
                        _bs = (BlockState)_bs.setValue(_property, (Comparable)entry.getValue());
                    } catch (Exception var17) {
                    }
                }
            }

            world.setBlock(_bp, _bs, 3);
        } else if (world.getBlockState(new BlockPos(x - 1.0, y, z)).getBlock() == LatexModBlocks.GLASS_DOOR.get()) {
            _bp = new BlockPos(x, y, z);
            _bs = ((Block)LatexModBlocks.INVERTED_GLASS_DOOR.get()).defaultBlockState();
            _bso = world.getBlockState(_bp);
            var10 = _bso.getValues().entrySet().iterator();

            while(var10.hasNext()) {
                entry = (Map.Entry)var10.next();
                _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
                if (_property != null && _bs.getValue(_property) != null) {
                    try {
                        _bs = (BlockState)_bs.setValue(_property, (Comparable)entry.getValue());
                    } catch (Exception var16) {
                    }
                }
            }

            world.setBlock(_bp, _bs, 3);
        } else if (world.getBlockState(new BlockPos(x, y, z + 1.0)).getBlock() == LatexModBlocks.GLASS_DOOR.get()) {
            _bp = new BlockPos(x, y, z);
            _bs = ((Block)LatexModBlocks.INVERTED_OPEN_GLASS_DOOR.get()).defaultBlockState();
            _bso = world.getBlockState(_bp);
            var10 = _bso.getValues().entrySet().iterator();

            while(var10.hasNext()) {
                entry = (Map.Entry)var10.next();
                _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
                if (_property != null && _bs.getValue(_property) != null) {
                    try {
                        _bs = (BlockState)_bs.setValue(_property, (Comparable)entry.getValue());
                    } catch (Exception var15) {
                    }
                }
            }

            world.setBlock(_bp, _bs, 3);
        } else if (world.getBlockState(new BlockPos(x, y, z - 1.0)).getBlock() == LatexModBlocks.GLASS_DOOR.get()) {
            _bp = new BlockPos(x, y, z - 1.0);
            _bs = ((Block)LatexModBlocks.INVERTED_GLASS_DOOR.get()).defaultBlockState();
            _bso = world.getBlockState(_bp);
            var10 = _bso.getValues().entrySet().iterator();

            while(var10.hasNext()) {
                entry = (Map.Entry)var10.next();
                _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
                if (_property != null && _bs.getValue(_property) != null) {
                    try {
                        _bs = (BlockState)_bs.setValue(_property, (Comparable)entry.getValue());
                    } catch (Exception var14) {
                    }
                }
            }

            world.setBlock(_bp, _bs, 3);
        }

    }
}
