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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarklatexcarpetUpdateTick2Procedure.class */
public class DarklatexcarpetUpdateTick2Procedure {
    public static boolean execute(LevelAccessor world, double x, double y, double z) {
        if (world.getBlockState(new BlockPos(x, y - 1.0d, z)).is(BlockTags.create(new ResourceLocation("latex:invalidblockbelow"))) || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == LatexModBlocks.DARKLATEXCRYSTALEGG.get() || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == LatexModBlocks.DARKLATEXICE.get() || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get() || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == LatexModBlocks.DARKLATEXBLOCK.get()) {
            world.destroyBlock(new BlockPos(x, y, z), false);
            return true;
        }
        if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSPREAD)) {
            if (!world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSUNLIGHTONLY)) {
                DarklatexcarpetUpdateTickProcedure.execute(world, x, y, z);
            } else if (world.getBlockState(new BlockPos(x, y, z)).getLightEmission(world, new BlockPos(x, y, z)) >= 5 || world.canSeeSkyFromBelowWater(new BlockPos(x, y, z))) {
                DarklatexcarpetUpdateTickProcedure.execute(world, x, y, z);
            }
        }
        if (!world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSPREAD) || Math.random() >= 0.0075d || world.getBlockState(new BlockPos(x, y - 1.0d, z)).is(BlockTags.create(new ResourceLocation("latex:tag_immune_blocks")))) {
            return false;
        }
        if (!world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSTONESPREAD) && world.getBlockState(new BlockPos(x - 0.0d, y - 1.0d, z + 0.0d)).is(BlockTags.create(new ResourceLocation("latex:tag_stone_blocks")))) {
            return false;
        }
        if (world.getBlockState(new BlockPos(x, y - 1.0d, z + 0.0d)).getBlock() == Blocks.OAK_LEAVES || world.getBlockState(new BlockPos(x, y + 1.0d, z - 0.0d)).getBlock() == Blocks.GRASS || world.getBlockState(new BlockPos(x, y - 1.0d, z + 0.0d)).getBlock() == Blocks.SWEET_BERRY_BUSH || world.getBlockState(new BlockPos(x, y + 1.0d, z - 0.0d)).getBlock() == Blocks.VINE) {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
            BlockPos _bp = new BlockPos(x - 0.0d, y - 1.0d, z + 0.0d);
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
            return false;
        } else if (world.getFluidState(new BlockPos(x, y - 1.0d, z)).createLegacyBlock().getBlock() == Blocks.WATER || world.getFluidState(new BlockPos(x, y - 1.0d, z)).createLegacyBlock().getBlock() == Blocks.WATER) {
            if (!world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXFLUIDS)) {
                return true;
            }
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
            BlockPos _bp2 = new BlockPos(x + 0.0d, y - 1.0d, z + 0.0d);
            BlockState _bs2 = ((Block) LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
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
            return false;
        } else if (!world.getBlockState(new BlockPos(x + 0.0d, y - 1.0d, z + 0.0d)).is(BlockTags.create(new ResourceLocation("latex:cobblestone"))) || !world.getLevelData().getGameRules().getBoolean(LatexModGameRules.CANCOBBLESTONEBEINFESTED)) {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
            BlockPos _bp3 = new BlockPos(x - 0.0d, y - 1.0d, z + 0.0d);
            BlockState _bs3 = ((Block) LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
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
            return false;
        } else {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
            BlockPos _bp4 = new BlockPos(x + 0.0d, y - 1.0d, z + 0.0d);
            BlockState _bs4 = ((Block) LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).defaultBlockState();
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
            return false;
        }
    }
}
