//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.procedures;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import net.mcreator.latexes.init.LatexModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Direction.AxisDirection;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Property;

public class BunkerDoorBlockAddedProcedure {
    public BunkerDoorBlockAddedProcedure() {
    }

    public static void execute(final LevelAccessor world, double x, double y, double z) {
        BlockState _bs;
        if (world.getBlockState(new BlockPos(x, y - 1.0, z)).getBlock() != LatexModBlocks.BUNKER_DOOR.get() && world.getBlockState(new BlockPos(x, y - 1.0, z)).getBlock() != Blocks.BARRIER && world.getBlockState(new BlockPos(x, y - 1.0, z)).getBlock() != Blocks.AIR && world.getBlockState(new BlockPos(x, y - 1.0, z)).getBlock() != Blocks.VOID_AIR && world.getBlockState(new BlockPos(x, y - 1.0, z)).getBlock() != Blocks.CAVE_AIR) {
            world.destroyBlock(new BlockPos(x, y, z), false);
            BlockPos _bp = new BlockPos(x, y + 1.0, z);
            BlockState _bs = ((Block)LatexModBlocks.BUNKER_DOOR.get()).defaultBlockState();
            _bs = world.getBlockState(_bp);
            UnmodifiableIterator var10 = _bs.getValues().entrySet().iterator();

            while(var10.hasNext()) {
                Map.Entry<Property<?>, Comparable<?>> entry = (Map.Entry)var10.next();
                Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
                if (_property != null && _bs.getValue(_property) != null) {
                    try {
                        _bs = (BlockState)_bs.setValue(_property, (Comparable)entry.getValue());
                    } catch (Exception var14) {
                    }
                }
            }

            world.setBlock(_bp, _bs, 3);
        }

        if ((((<undefinedtype>)(new Object() {
            public Direction getDirection(BlockPos pos) {
                BlockState _bs = world.getBlockState(pos);
                Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
                Comparable var5;
                if (property != null) {
                    var5 = _bs.getValue(property);
                    if (var5 instanceof Direction) {
                        Direction _dir = (Direction)var5;
                        return _dir;
                    }
                }

                property = _bs.getBlock().getStateDefinition().getProperty("axis");
                if (property != null) {
                    var5 = _bs.getValue(property);
                    if (var5 instanceof Direction.Axis) {
                        Direction.Axis _axis = (Direction.Axis)var5;
                        return Direction.fromAxisAndDirection(_axis, AxisDirection.POSITIVE);
                    }
                }

                return Direction.NORTH;
            }
        })).getDirection(new BlockPos(x, y, z)) == Direction.NORTH || ((<undefinedtype>)(new Object() {
            public Direction getDirection(BlockPos pos) {
                BlockState _bs = world.getBlockState(pos);
                Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
                Comparable var5;
                if (property != null) {
                    var5 = _bs.getValue(property);
                    if (var5 instanceof Direction) {
                        Direction _dir = (Direction)var5;
                        return _dir;
                    }
                }

                property = _bs.getBlock().getStateDefinition().getProperty("axis");
                if (property != null) {
                    var5 = _bs.getValue(property);
                    if (var5 instanceof Direction.Axis) {
                        Direction.Axis _axis = (Direction.Axis)var5;
                        return Direction.fromAxisAndDirection(_axis, AxisDirection.POSITIVE);
                    }
                }

                return Direction.NORTH;
            }
        })).getDirection(new BlockPos(x, y, z)) == Direction.SOUTH) && world.getBlockState(new BlockPos(x - 1.0, y, z)).getBlock() != Blocks.AIR && world.getBlockState(new BlockPos(x - 1.0, y, z)).getBlock() != Blocks.VOID_AIR && world.getBlockState(new BlockPos(x - 1.0, y, z)).getBlock() != Blocks.CAVE_AIR && world.getBlockState(new BlockPos(x + 1.0, y, z)).getBlock() != Blocks.AIR && world.getBlockState(new BlockPos(x + 1.0, y, z)).getBlock() != Blocks.VOID_AIR && world.getBlockState(new BlockPos(x + 1.0, y, z)).getBlock() != Blocks.CAVE_AIR) {
            Direction _dir = Direction.WEST;
            BlockPos _pos = new BlockPos(x, y, z);
            _bs = world.getBlockState(_pos);
            Property<?> _property = _bs.getBlock().getStateDefinition().getProperty("facing");
            if (_property instanceof DirectionProperty) {
                DirectionProperty _dp = (DirectionProperty)_property;
                if (_dp.getPossibleValues().contains(_dir)) {
                    world.setBlock(_pos, (BlockState)_bs.setValue(_dp, _dir), 3);
                    return;
                }
            }

            _property = _bs.getBlock().getStateDefinition().getProperty("axis");
            if (_property instanceof EnumProperty) {
                EnumProperty _ap = (EnumProperty)_property;
                if (_ap.getPossibleValues().contains(_dir.getAxis())) {
                    world.setBlock(_pos, (BlockState)_bs.setValue(_ap, _dir.getAxis()), 3);
                }
            }
        }

    }
}
