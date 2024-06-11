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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/LatexcobwebfixUpdateTickProcedure.class */
public class LatexcobwebfixUpdateTickProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSPREAD) && Math.random() * 100.0d <= ((double) world.getLevelData().getGameRules().getInt(LatexModGameRules.DARKLATEXSPREADSPEED))) {
            if (world.getBlockState(new BlockPos(x + 1.0d, y, z)).getBlock() == Blocks.COBWEB) {
                BlockPos _bp = new BlockPos(x, y, z);
                BlockState _bs = ((Block) LatexModBlocks.LATEXCOBWEBFIX.get()).defaultBlockState();
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
            } else if (world.getBlockState(new BlockPos(x - 1.0d, y, z)).getBlock() == Blocks.COBWEB) {
                BlockPos _bp2 = new BlockPos(x, y, z);
                BlockState _bs2 = ((Block) LatexModBlocks.LATEXCOBWEBFIX.get()).defaultBlockState();
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
            } else if (world.getBlockState(new BlockPos(x, y + 1.0d, z)).getBlock() == Blocks.COBWEB) {
                BlockPos _bp3 = new BlockPos(x, y, z);
                BlockState _bs3 = ((Block) LatexModBlocks.LATEXCOBWEBFIX.get()).defaultBlockState();
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
            } else if (world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.COBWEB) {
                BlockPos _bp4 = new BlockPos(x, y, z);
                BlockState _bs4 = ((Block) LatexModBlocks.LATEXCOBWEBFIX.get()).defaultBlockState();
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
            } else if (world.getBlockState(new BlockPos(x, y, z + 1.0d)).getBlock() == Blocks.COBWEB) {
                BlockPos _bp5 = new BlockPos(x, y, z);
                BlockState _bs5 = ((Block) LatexModBlocks.LATEXCOBWEBFIX.get()).defaultBlockState();
                UnmodifiableIterator it5 = world.getBlockState(_bp5).getValues().entrySet().iterator();
                while (it5.hasNext()) {
                    Map.Entry<Property<?>, Comparable<?>> entry5 = (Map.Entry) it5.next();
                    Property _property5 = _bs5.getBlock().getStateDefinition().getProperty(entry5.getKey().getName());
                    if (!(_property5 == null || _bs5.getValue(_property5) == null)) {
                        try {
                            _bs5 = (BlockState) _bs5.setValue(_property5, entry5.getValue());
                        } catch (Exception e5) {
                        }
                    }
                }
                world.setBlock(_bp5, _bs5, 3);
            } else if (world.getBlockState(new BlockPos(x, y, z - 1.0d)).getBlock() == Blocks.COBWEB) {
                BlockPos _bp6 = new BlockPos(x, y, z);
                BlockState _bs6 = ((Block) LatexModBlocks.LATEXCOBWEBFIX.get()).defaultBlockState();
                UnmodifiableIterator it6 = world.getBlockState(_bp6).getValues().entrySet().iterator();
                while (it6.hasNext()) {
                    Map.Entry<Property<?>, Comparable<?>> entry6 = (Map.Entry) it6.next();
                    Property _property6 = _bs6.getBlock().getStateDefinition().getProperty(entry6.getKey().getName());
                    if (!(_property6 == null || _bs6.getValue(_property6) == null)) {
                        try {
                            _bs6 = (BlockState) _bs6.setValue(_property6, entry6.getValue());
                        } catch (Exception e6) {
                        }
                    }
                }
                world.setBlock(_bp6, _bs6, 3);
            }
        }
    }
}
