package net.ltxprogrammer.turned.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/LabDoorBlockAddedProcedure.class */
public class LabDoorBlockAddedProcedure {
    public static void execute(final LevelAccessor world, double x, double y, double z) {
        if (new Object() { // from class: net.ltxprogrammer.turned.procedures.LabDoorBlockAddedProcedure.1
            public Direction getDirection(BlockPos pos) {
                BlockState _bs = world.getBlockState(pos);
                Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
                if (property != null) {
                    Direction _dir = _bs.getValue(property);
                    if (_dir instanceof Direction) {
                        return _dir;
                    }
                }
                Property<?> property2 = _bs.getBlock().getStateDefinition().getProperty("axis");
                if (property2 != null) {
                    Direction.Axis _axis = _bs.getValue(property2);
                    if (_axis instanceof Direction.Axis) {
                        return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
                    }
                }
                return Direction.NORTH;
            }
        }.getDirection(new BlockPos(x, y, z)) == Direction.SOUTH) {
            world.setBlock(new BlockPos(x, y + 1.0d, z), Blocks.BARRIER.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x - 1.0d, y + 1.0d, z), Blocks.BARRIER.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x - 1.0d, y, z), Blocks.BARRIER.defaultBlockState(), 3);
        } else if (new Object() { // from class: net.ltxprogrammer.turned.procedures.LabDoorBlockAddedProcedure.2
            public Direction getDirection(BlockPos pos) {
                BlockState _bs = world.getBlockState(pos);
                Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
                if (property != null) {
                    Direction _dir = _bs.getValue(property);
                    if (_dir instanceof Direction) {
                        return _dir;
                    }
                }
                Property<?> property2 = _bs.getBlock().getStateDefinition().getProperty("axis");
                if (property2 != null) {
                    Direction.Axis _axis = _bs.getValue(property2);
                    if (_axis instanceof Direction.Axis) {
                        return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
                    }
                }
                return Direction.NORTH;
            }
        }.getDirection(new BlockPos(x, y, z)) == Direction.NORTH) {
            world.setBlock(new BlockPos(x, y + 1.0d, z), Blocks.BARRIER.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x + 1.0d, y + 1.0d, z), Blocks.BARRIER.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x + 1.0d, y, z), Blocks.BARRIER.defaultBlockState(), 3);
        } else if (new Object() { // from class: net.ltxprogrammer.turned.procedures.LabDoorBlockAddedProcedure.3
            public Direction getDirection(BlockPos pos) {
                BlockState _bs = world.getBlockState(pos);
                Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
                if (property != null) {
                    Direction _dir = _bs.getValue(property);
                    if (_dir instanceof Direction) {
                        return _dir;
                    }
                }
                Property<?> property2 = _bs.getBlock().getStateDefinition().getProperty("axis");
                if (property2 != null) {
                    Direction.Axis _axis = _bs.getValue(property2);
                    if (_axis instanceof Direction.Axis) {
                        return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
                    }
                }
                return Direction.NORTH;
            }
        }.getDirection(new BlockPos(x, y, z)) == Direction.WEST) {
            world.setBlock(new BlockPos(x, y + 1.0d, z), Blocks.BARRIER.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x, y + 1.0d, z - 1.0d), Blocks.BARRIER.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x, y, z - 1.0d), Blocks.BARRIER.defaultBlockState(), 3);
        } else if (new Object() { // from class: net.ltxprogrammer.turned.procedures.LabDoorBlockAddedProcedure.4
            public Direction getDirection(BlockPos pos) {
                BlockState _bs = world.getBlockState(pos);
                Property<?> property = _bs.getBlock().getStateDefinition().getProperty("facing");
                if (property != null) {
                    Direction _dir = _bs.getValue(property);
                    if (_dir instanceof Direction) {
                        return _dir;
                    }
                }
                Property<?> property2 = _bs.getBlock().getStateDefinition().getProperty("axis");
                if (property2 != null) {
                    Direction.Axis _axis = _bs.getValue(property2);
                    if (_axis instanceof Direction.Axis) {
                        return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
                    }
                }
                return Direction.NORTH;
            }
        }.getDirection(new BlockPos(x, y, z)) == Direction.EAST) {
            world.setBlock(new BlockPos(x, y + 1.0d, z), Blocks.BARRIER.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x, y + 1.0d, z + 1.0d), Blocks.BARRIER.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x, y, z + 1.0d), Blocks.BARRIER.defaultBlockState(), 3);
        }
    }
}
