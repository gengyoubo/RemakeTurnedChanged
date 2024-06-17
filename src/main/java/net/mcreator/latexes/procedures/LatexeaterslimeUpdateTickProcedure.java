//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.procedures;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import net.mcreator.latexes.init.LatexModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

public class LatexeaterslimeUpdateTickProcedure {
    public LatexeaterslimeUpdateTickProcedure() {
    }

    public static void execute(LevelAccessor world, double x, double y, double z) {
        BlockPos _bp;
        BlockState _bs;
        BlockState _bso;
        UnmodifiableIterator var10;
        Map.Entry entry;
        Property _property;
        if (world.getBlockState(new BlockPos(x + 1.0, y, z)).is(BlockTags.create(new ResourceLocation("latex:darklatexblocks")))) {
            _bp = new BlockPos(x + 1.0, y, z);
            _bs = ((Block)LatexModBlocks.LATEXEATERSLIME.get()).defaultBlockState();
            _bso = world.getBlockState(_bp);
            var10 = _bso.getValues().entrySet().iterator();

            while(var10.hasNext()) {
                entry = (Map.Entry)var10.next();
                _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
                if (_property != null && _bs.getValue(_property) != null) {
                    try {
                        _bs = (BlockState)_bs.setValue(_property, (Comparable)entry.getValue());
                    } catch (Exception var19) {
                    }
                }
            }

            world.setBlock(_bp, _bs, 3);
        } else if (world.getBlockState(new BlockPos(x - 1.0, y, z)).is(BlockTags.create(new ResourceLocation("latex:darklatexblocks")))) {
            _bp = new BlockPos(x - 1.0, y, z);
            _bs = ((Block)LatexModBlocks.LATEXEATERSLIME.get()).defaultBlockState();
            _bso = world.getBlockState(_bp);
            var10 = _bso.getValues().entrySet().iterator();

            while(var10.hasNext()) {
                entry = (Map.Entry)var10.next();
                _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
                if (_property != null && _bs.getValue(_property) != null) {
                    try {
                        _bs = (BlockState)_bs.setValue(_property, (Comparable)entry.getValue());
                    } catch (Exception var18) {
                    }
                }
            }

            world.setBlock(_bp, _bs, 3);
        } else if (world.getBlockState(new BlockPos(x, y + 1.0, z)).is(BlockTags.create(new ResourceLocation("latex:darklatexblocks")))) {
            _bp = new BlockPos(x, y + 1.0, z);
            _bs = ((Block)LatexModBlocks.LATEXEATERSLIME.get()).defaultBlockState();
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
        } else if (world.getBlockState(new BlockPos(x, y - 1.0, z)).is(BlockTags.create(new ResourceLocation("latex:darklatexblocks")))) {
            _bp = new BlockPos(x, y - 1.0, z);
            _bs = ((Block)LatexModBlocks.LATEXEATERSLIME.get()).defaultBlockState();
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
        } else if (world.getBlockState(new BlockPos(x, y, z + 1.0)).is(BlockTags.create(new ResourceLocation("latex:darklatexblocks")))) {
            _bp = new BlockPos(x, y, z + 1.0);
            _bs = ((Block)LatexModBlocks.LATEXEATERSLIME.get()).defaultBlockState();
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
        } else if (world.getBlockState(new BlockPos(x, y, z - 1.0)).is(BlockTags.create(new ResourceLocation("latex:darklatexblocks")))) {
            _bp = new BlockPos(x, y, z - 1.0);
            _bs = ((Block)LatexModBlocks.LATEXEATERSLIME.get()).defaultBlockState();
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
        } else if (Math.random() < 0.3) {
            world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
        }

    }
}
