package net.mcreator.latexes.procedures;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import net.mcreator.latexes.init.LatexModBlocks;
import net.mcreator.latexes.init.LatexModGameRules;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DlsharkEntityDiesProcedure.class */
public class DlsharkEntityDiesProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXESLEAVEBLOCK)) {
            if (!(world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.BEDROCK)) {
                if (!(world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.WATER || world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.BUBBLE_COLUMN || world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.WATER || world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.VOID_AIR)) {
                    BlockPos _bp = new BlockPos(x, y, z);
                    BlockState _bs = ((Block) LatexModBlocks.DARKLATEXCARPET.get()).defaultBlockState();
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
                } else if (world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.WATER || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.BUBBLE_COLUMN || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.WATER || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.VOID_AIR) {
                    BlockPos _bp2 = new BlockPos(x, y, z);
                    BlockState _bs2 = ((Block) LatexModBlocks.DARKLATEXCARPET.get()).defaultBlockState();
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
}
