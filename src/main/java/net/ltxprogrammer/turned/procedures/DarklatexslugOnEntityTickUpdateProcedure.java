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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/DarklatexslugOnEntityTickUpdateProcedure.class */
public class DarklatexslugOnEntityTickUpdateProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if (world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.CHEST) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                BlockPos _bp = new BlockPos(x, y - 1.0d, z);
                BlockState _bs = ((Block) LatexModBlocks.CHES_TRAP.get()).defaultBlockState();
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
            } else if (world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == LatexModBlocks.BOX.get() || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == LatexModBlocks.BOX_INVENTORY.get()) {
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
                BlockPos _bp2 = new BlockPos(x, y - 1.0d, z);
                BlockState _bs2 = ((Block) LatexModBlocks.BOX_TRAP.get()).defaultBlockState();
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
            }
        }
    }
}
