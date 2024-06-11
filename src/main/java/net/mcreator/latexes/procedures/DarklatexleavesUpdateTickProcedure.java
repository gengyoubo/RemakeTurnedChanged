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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarklatexleavesUpdateTickProcedure.class */
public class DarklatexleavesUpdateTickProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSPREAD) && Math.random() * 100.0d < ((double) world.getLevelData().getGameRules().getInt(LatexModGameRules.DARKLATEXSPREADSPEED))) {
            if (world.getBlockState(new BlockPos(x + 1.0d, y + 0.0d, z + 0.0d)).getBlock() == Blocks.OAK_LEAVES) {
                BlockPos _bp = new BlockPos(x + 1.0d, y, z);
                BlockState _bs = ((Block) LatexModBlocks.DARKLATEXLEAVES.get()).defaultBlockState();
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
            } else if (world.getBlockState(new BlockPos(x - 1.0d, y + 0.0d, z + 0.0d)).getBlock() == Blocks.OAK_LEAVES) {
                BlockPos _bp2 = new BlockPos(x - 1.0d, y, z);
                BlockState _bs2 = ((Block) LatexModBlocks.DARKLATEXLEAVES.get()).defaultBlockState();
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
            } else if (world.getBlockState(new BlockPos(x + 0.0d, y + 1.0d, z + 0.0d)).getBlock() == Blocks.OAK_LEAVES) {
                BlockPos _bp3 = new BlockPos(x, y + 1.0d, z);
                BlockState _bs3 = ((Block) LatexModBlocks.DARKLATEXLEAVES.get()).defaultBlockState();
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
            } else if (world.getBlockState(new BlockPos(x + 0.0d, y - 1.0d, z + 0.0d)).getBlock() == Blocks.OAK_LEAVES) {
                BlockPos _bp4 = new BlockPos(x, y - 1.0d, z);
                BlockState _bs4 = ((Block) LatexModBlocks.DARKLATEXLEAVES.get()).defaultBlockState();
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
            } else if (world.getBlockState(new BlockPos(x + 0.0d, y + 0.0d, z + 1.0d)).getBlock() == Blocks.OAK_LEAVES) {
                BlockPos _bp5 = new BlockPos(x, y, z + 1.0d);
                BlockState _bs5 = ((Block) LatexModBlocks.DARKLATEXLEAVES.get()).defaultBlockState();
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
            } else if (world.getBlockState(new BlockPos(x + 0.0d, y + 0.0d, z - 1.0d)).getBlock() == Blocks.OAK_LEAVES) {
                BlockPos _bp6 = new BlockPos(x, y, z - 1.0d);
                BlockState _bs6 = ((Block) LatexModBlocks.DARKLATEXLEAVES.get()).defaultBlockState();
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
            if (world.getBlockState(new BlockPos(x + 1.0d, y + 0.0d, z + 0.0d)).getBlock() == Blocks.OAK_LOG) {
                BlockPos _bp7 = new BlockPos(x + 1.0d, y, z);
                BlockState _bs7 = ((Block) LatexModBlocks.DARKLATEXLOG.get()).defaultBlockState();
                UnmodifiableIterator it7 = world.getBlockState(_bp7).getValues().entrySet().iterator();
                while (it7.hasNext()) {
                    Map.Entry<Property<?>, Comparable<?>> entry7 = (Map.Entry) it7.next();
                    Property _property7 = _bs7.getBlock().getStateDefinition().getProperty(entry7.getKey().getName());
                    if (!(_property7 == null || _bs7.getValue(_property7) == null)) {
                        try {
                            _bs7 = (BlockState) _bs7.setValue(_property7, entry7.getValue());
                        } catch (Exception e7) {
                        }
                    }
                }
                world.setBlock(_bp7, _bs7, 3);
            } else if (world.getBlockState(new BlockPos(x - 1.0d, y + 0.0d, z + 0.0d)).getBlock() == Blocks.OAK_LOG) {
                BlockPos _bp8 = new BlockPos(x - 1.0d, y, z);
                BlockState _bs8 = ((Block) LatexModBlocks.DARKLATEXLOG.get()).defaultBlockState();
                UnmodifiableIterator it8 = world.getBlockState(_bp8).getValues().entrySet().iterator();
                while (it8.hasNext()) {
                    Map.Entry<Property<?>, Comparable<?>> entry8 = (Map.Entry) it8.next();
                    Property _property8 = _bs8.getBlock().getStateDefinition().getProperty(entry8.getKey().getName());
                    if (!(_property8 == null || _bs8.getValue(_property8) == null)) {
                        try {
                            _bs8 = (BlockState) _bs8.setValue(_property8, entry8.getValue());
                        } catch (Exception e8) {
                        }
                    }
                }
                world.setBlock(_bp8, _bs8, 3);
            } else if (world.getBlockState(new BlockPos(x + 0.0d, y + 1.0d, z + 0.0d)).getBlock() == Blocks.OAK_LOG) {
                BlockPos _bp9 = new BlockPos(x, y + 1.0d, z);
                BlockState _bs9 = ((Block) LatexModBlocks.DARKLATEXLOG.get()).defaultBlockState();
                UnmodifiableIterator it9 = world.getBlockState(_bp9).getValues().entrySet().iterator();
                while (it9.hasNext()) {
                    Map.Entry<Property<?>, Comparable<?>> entry9 = (Map.Entry) it9.next();
                    Property _property9 = _bs9.getBlock().getStateDefinition().getProperty(entry9.getKey().getName());
                    if (!(_property9 == null || _bs9.getValue(_property9) == null)) {
                        try {
                            _bs9 = (BlockState) _bs9.setValue(_property9, entry9.getValue());
                        } catch (Exception e9) {
                        }
                    }
                }
                world.setBlock(_bp9, _bs9, 3);
            } else if (world.getBlockState(new BlockPos(x + 0.0d, y - 1.0d, z + 0.0d)).getBlock() == Blocks.OAK_LOG) {
                BlockPos _bp10 = new BlockPos(x, y - 1.0d, z);
                BlockState _bs10 = ((Block) LatexModBlocks.DARKLATEXLOG.get()).defaultBlockState();
                UnmodifiableIterator it10 = world.getBlockState(_bp10).getValues().entrySet().iterator();
                while (it10.hasNext()) {
                    Map.Entry<Property<?>, Comparable<?>> entry10 = (Map.Entry) it10.next();
                    Property _property10 = _bs10.getBlock().getStateDefinition().getProperty(entry10.getKey().getName());
                    if (!(_property10 == null || _bs10.getValue(_property10) == null)) {
                        try {
                            _bs10 = (BlockState) _bs10.setValue(_property10, entry10.getValue());
                        } catch (Exception e10) {
                        }
                    }
                }
                world.setBlock(_bp10, _bs10, 3);
            } else if (world.getBlockState(new BlockPos(x + 0.0d, y + 0.0d, z + 1.0d)).getBlock() == Blocks.OAK_LOG) {
                BlockPos _bp11 = new BlockPos(x, y, z + 1.0d);
                BlockState _bs11 = ((Block) LatexModBlocks.DARKLATEXLOG.get()).defaultBlockState();
                UnmodifiableIterator it11 = world.getBlockState(_bp11).getValues().entrySet().iterator();
                while (it11.hasNext()) {
                    Map.Entry<Property<?>, Comparable<?>> entry11 = (Map.Entry) it11.next();
                    Property _property11 = _bs11.getBlock().getStateDefinition().getProperty(entry11.getKey().getName());
                    if (!(_property11 == null || _bs11.getValue(_property11) == null)) {
                        try {
                            _bs11 = (BlockState) _bs11.setValue(_property11, entry11.getValue());
                        } catch (Exception e11) {
                        }
                    }
                }
                world.setBlock(_bp11, _bs11, 3);
            } else if (world.getBlockState(new BlockPos(x + 0.0d, y + 0.0d, z - 1.0d)).getBlock() == Blocks.OAK_LOG) {
                BlockPos _bp12 = new BlockPos(x, y, z - 1.0d);
                BlockState _bs12 = ((Block) LatexModBlocks.DARKLATEXLOG.get()).defaultBlockState();
                UnmodifiableIterator it12 = world.getBlockState(_bp12).getValues().entrySet().iterator();
                while (it12.hasNext()) {
                    Map.Entry<Property<?>, Comparable<?>> entry12 = (Map.Entry) it12.next();
                    Property _property12 = _bs12.getBlock().getStateDefinition().getProperty(entry12.getKey().getName());
                    if (!(_property12 == null || _bs12.getValue(_property12) == null)) {
                        try {
                            _bs12 = (BlockState) _bs12.setValue(_property12, entry12.getValue());
                        } catch (Exception e12) {
                        }
                    }
                }
                world.setBlock(_bp12, _bs12, 3);
            }
        }
    }
}
