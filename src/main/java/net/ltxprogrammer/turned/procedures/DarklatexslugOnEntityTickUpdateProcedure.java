//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.procedures;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import net.ltxprogrammer.turned.init.LatexModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

public class DarklatexslugOnEntityTickUpdateProcedure {
    public DarklatexslugOnEntityTickUpdateProcedure() {
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            BlockPos _bp;
            BlockState _bs;
            BlockState _bso;
            UnmodifiableIterator var11;
            Map.Entry entry;
            Property _property;
            if (world.getBlockState(new BlockPos(x, y - 1.0, z)).getBlock() == Blocks.CHEST) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }

                _bp = new BlockPos(x, y - 1.0, z);
                _bs = ((Block)LatexModBlocks.CHES_TRAP.get()).defaultBlockState();
                _bso = world.getBlockState(_bp);
                var11 = _bso.getValues().entrySet().iterator();

                while(var11.hasNext()) {
                    entry = (Map.Entry)var11.next();
                    _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
                    if (_property != null && _bs.getValue(_property) != null) {
                        try {
                            _bs = (BlockState)_bs.setValue(_property, (Comparable)entry.getValue());
                        } catch (Exception var16) {
                        }
                    }
                }

                world.setBlock(_bp, _bs, 3);
            } else if (world.getBlockState(new BlockPos(x, y - 1.0, z)).getBlock() == LatexModBlocks.BOX.get() || world.getBlockState(new BlockPos(x, y - 1.0, z)).getBlock() == LatexModBlocks.BOX_INVENTORY.get()) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }

                _bp = new BlockPos(x, y - 1.0, z);
                _bs = ((Block)LatexModBlocks.BOX_TRAP.get()).defaultBlockState();
                _bso = world.getBlockState(_bp);
                var11 = _bso.getValues().entrySet().iterator();

                while(var11.hasNext()) {
                    entry = (Map.Entry)var11.next();
                    _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
                    if (_property != null && _bs.getValue(_property) != null) {
                        try {
                            _bs = (BlockState)_bs.setValue(_property, (Comparable)entry.getValue());
                        } catch (Exception var15) {
                        }
                    }
                }

                world.setBlock(_bp, _bs, 3);
            }

        }
    }
}
