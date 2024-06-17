//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.procedures;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import net.mcreator.latexes.init.LatexModBlocks;
import net.mcreator.latexes.init.LatexModGameRules;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

public class DarklatexcarpetUpdateTick2Procedure {
    public DarklatexcarpetUpdateTick2Procedure() {
    }

    public static boolean execute(LevelAccessor world, double x, double y, double z) {
        double underblocktransform = 0.0;
        if (!world.getBlockState(new BlockPos(x, y - 1.0, z)).is(BlockTags.create(new ResourceLocation("latex:invalidblockbelow"))) && world.getBlockState(new BlockPos(x, y - 1.0, z)).getBlock() != LatexModBlocks.DARKLATEXCRYSTALEGG.get() && world.getBlockState(new BlockPos(x, y - 1.0, z)).getBlock() != LatexModBlocks.DARKLATEXICE.get() && world.getBlockState(new BlockPos(x, y - 1.0, z)).getBlock() != LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get() && world.getBlockState(new BlockPos(x, y - 1.0, z)).getBlock() != LatexModBlocks.DARKLATEXBLOCK.get()) {
            if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSPREAD)) {
                if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSUNLIGHTONLY)) {
                    if (world.getBlockState(new BlockPos(x, y, z)).getLightEmission(world, new BlockPos(x, y, z)) >= 5 || world.canSeeSkyFromBelowWater(new BlockPos(x, y, z))) {
                        DarklatexcarpetUpdateTickProcedure.execute(world, x, y, z);
                    }
                } else {
                    DarklatexcarpetUpdateTickProcedure.execute(world, x, y, z);
                }
            }

            if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSPREAD) && Math.random() < 0.0075 && !world.getBlockState(new BlockPos(x, y - 1.0, z)).is(BlockTags.create(new ResourceLocation("latex:tag_immune_blocks"))) && (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSTONESPREAD) || !world.getBlockState(new BlockPos(x - 0.0, y - 1.0, z + 0.0)).is(BlockTags.create(new ResourceLocation("latex:tag_stone_blocks"))))) {
                BlockPos _bp;
                BlockState _bs;
                BlockState _bso;
                UnmodifiableIterator var12;
                Map.Entry entry;
                Property _property;
                if (world.getBlockState(new BlockPos(x, y - 1.0, z + 0.0)).getBlock() != Blocks.OAK_LEAVES && world.getBlockState(new BlockPos(x, y + 1.0, z - 0.0)).getBlock() != Blocks.GRASS && world.getBlockState(new BlockPos(x, y - 1.0, z + 0.0)).getBlock() != Blocks.SWEET_BERRY_BUSH && world.getBlockState(new BlockPos(x, y + 1.0, z - 0.0)).getBlock() != Blocks.VINE) {
                    if (world.getFluidState(new BlockPos(x, y - 1.0, z)).createLegacyBlock().getBlock() != Blocks.WATER && world.getFluidState(new BlockPos(x, y - 1.0, z)).createLegacyBlock().getBlock() != Blocks.WATER) {
                        if (world.getBlockState(new BlockPos(x + 0.0, y - 1.0, z + 0.0)).is(BlockTags.create(new ResourceLocation("latex:cobblestone"))) && world.getLevelData().getGameRules().getBoolean(LatexModGameRules.CANCOBBLESTONEBEINFESTED)) {
                            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
                            _bp = new BlockPos(x + 0.0, y - 1.0, z + 0.0);
                            _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).defaultBlockState();
                            _bso = world.getBlockState(_bp);
                            var12 = _bso.getValues().entrySet().iterator();

                            while(var12.hasNext()) {
                                entry = (Map.Entry)var12.next();
                                _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
                                if (_property != null && _bs.getValue(_property) != null) {
                                    try {
                                        _bs = (BlockState)_bs.setValue(_property, (Comparable)entry.getValue());
                                    } catch (Exception var17) {
                                    }
                                }
                            }

                            world.setBlock(_bp, _bs, 3);
                        } else {
                            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
                            _bp = new BlockPos(x - 0.0, y - 1.0, z + 0.0);
                            _bs = ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
                            _bso = world.getBlockState(_bp);
                            var12 = _bso.getValues().entrySet().iterator();

                            while(var12.hasNext()) {
                                entry = (Map.Entry)var12.next();
                                _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
                                if (_property != null && _bs.getValue(_property) != null) {
                                    try {
                                        _bs = (BlockState)_bs.setValue(_property, (Comparable)entry.getValue());
                                    } catch (Exception var16) {
                                    }
                                }
                            }

                            world.setBlock(_bp, _bs, 3);
                        }
                    } else {
                        if (!world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXFLUIDS)) {
                            return true;
                        }

                        world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
                        _bp = new BlockPos(x + 0.0, y - 1.0, z + 0.0);
                        _bs = ((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
                        _bso = world.getBlockState(_bp);
                        var12 = _bso.getValues().entrySet().iterator();

                        while(var12.hasNext()) {
                            entry = (Map.Entry)var12.next();
                            _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
                            if (_property != null && _bs.getValue(_property) != null) {
                                try {
                                    _bs = (BlockState)_bs.setValue(_property, (Comparable)entry.getValue());
                                } catch (Exception var18) {
                                }
                            }
                        }

                        world.setBlock(_bp, _bs, 3);
                    }
                } else {
                    world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
                    _bp = new BlockPos(x - 0.0, y - 1.0, z + 0.0);
                    _bs = ((Block)LatexModBlocks.DARKLATEXLEAVES.get()).defaultBlockState();
                    _bso = world.getBlockState(_bp);
                    var12 = _bso.getValues().entrySet().iterator();

                    while(var12.hasNext()) {
                        entry = (Map.Entry)var12.next();
                        _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
                        if (_property != null && _bs.getValue(_property) != null) {
                            try {
                                _bs = (BlockState)_bs.setValue(_property, (Comparable)entry.getValue());
                            } catch (Exception var19) {
                            }
                        }
                    }

                    world.setBlock(_bp, _bs, 3);
                }
            }

            return false;
        } else {
            world.destroyBlock(new BlockPos(x, y, z), false);
            return true;
        }
    }
}
