//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.Direction.AxisDirection;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

public class LabDoorBlockAddedProcedure {
    public LabDoorBlockAddedProcedure() {
    }

    public static void execute(final LevelAccessor world, double x, double y, double z) {
        if (((<undefinedtype>)(new Object() {
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
        })).getDirection(new BlockPos(x, y, z)) == Direction.SOUTH) {
            world.setBlock(new BlockPos(x, y + 1.0, z), Blocks.BARRIER.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x - 1.0, y + 1.0, z), Blocks.BARRIER.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x - 1.0, y, z), Blocks.BARRIER.defaultBlockState(), 3);
        } else if (((<undefinedtype>)(new Object() {
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
        })).getDirection(new BlockPos(x, y, z)) == Direction.NORTH) {
            world.setBlock(new BlockPos(x, y + 1.0, z), Blocks.BARRIER.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x + 1.0, y + 1.0, z), Blocks.BARRIER.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x + 1.0, y, z), Blocks.BARRIER.defaultBlockState(), 3);
        } else if (((<undefinedtype>)(new Object() {
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
        })).getDirection(new BlockPos(x, y, z)) == Direction.WEST) {
            world.setBlock(new BlockPos(x, y + 1.0, z), Blocks.BARRIER.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x, y + 1.0, z - 1.0), Blocks.BARRIER.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x, y, z - 1.0), Blocks.BARRIER.defaultBlockState(), 3);
        } else if (((<undefinedtype>)(new Object() {
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
        })).getDirection(new BlockPos(x, y, z)) == Direction.EAST) {
            world.setBlock(new BlockPos(x, y + 1.0, z), Blocks.BARRIER.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x, y + 1.0, z + 1.0), Blocks.BARRIER.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x, y, z + 1.0), Blocks.BARRIER.defaultBlockState(), 3);
        }

    }
}
