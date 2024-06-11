package net.mcreator.latexes.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/LabDoorBlockAddedProcedure.class */
public class LabDoorBlockAddedProcedure {

    /* renamed from: net.mcreator.latexes.procedures.LabDoorBlockAddedProcedure$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/LabDoorBlockAddedProcedure$1.class */
    class AnonymousClass1 {
        final /* synthetic */ LevelAccessor val$world;

        AnonymousClass1(LevelAccessor levelAccessor) {
            this.val$world = levelAccessor;
        }

        public Direction getDirection(BlockPos pos) {
            BlockState _bs = this.val$world.getBlockState(pos);
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
    }

    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (new AnonymousClass1(world).getDirection(new BlockPos(x, y, z)) == Direction.SOUTH) {
            world.setBlock(new BlockPos(x, y + 1.0d, z), Blocks.BARRIER.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x - 1.0d, y + 1.0d, z), Blocks.BARRIER.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x - 1.0d, y, z), Blocks.BARRIER.defaultBlockState(), 3);
        } else if (new AnonymousClass2(world).getDirection(new BlockPos(x, y, z)) == Direction.NORTH) {
            world.setBlock(new BlockPos(x, y + 1.0d, z), Blocks.BARRIER.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x + 1.0d, y + 1.0d, z), Blocks.BARRIER.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x + 1.0d, y, z), Blocks.BARRIER.defaultBlockState(), 3);
        } else if (new AnonymousClass3(world).getDirection(new BlockPos(x, y, z)) == Direction.WEST) {
            world.setBlock(new BlockPos(x, y + 1.0d, z), Blocks.BARRIER.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x, y + 1.0d, z - 1.0d), Blocks.BARRIER.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x, y, z - 1.0d), Blocks.BARRIER.defaultBlockState(), 3);
        } else if (new AnonymousClass4(world).getDirection(new BlockPos(x, y, z)) == Direction.EAST) {
            world.setBlock(new BlockPos(x, y + 1.0d, z), Blocks.BARRIER.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x, y + 1.0d, z + 1.0d), Blocks.BARRIER.defaultBlockState(), 3);
            world.setBlock(new BlockPos(x, y, z + 1.0d), Blocks.BARRIER.defaultBlockState(), 3);
        }
    }

    /* renamed from: net.mcreator.latexes.procedures.LabDoorBlockAddedProcedure$2  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/LabDoorBlockAddedProcedure$2.class */
    class AnonymousClass2 {
        final /* synthetic */ LevelAccessor val$world;

        AnonymousClass2(LevelAccessor levelAccessor) {
            this.val$world = levelAccessor;
        }

        public Direction getDirection(BlockPos pos) {
            BlockState _bs = this.val$world.getBlockState(pos);
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
    }

    /* renamed from: net.mcreator.latexes.procedures.LabDoorBlockAddedProcedure$3  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/LabDoorBlockAddedProcedure$3.class */
    class AnonymousClass3 {
        final /* synthetic */ LevelAccessor val$world;

        AnonymousClass3(LevelAccessor levelAccessor) {
            this.val$world = levelAccessor;
        }

        public Direction getDirection(BlockPos pos) {
            BlockState _bs = this.val$world.getBlockState(pos);
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
    }

    /* renamed from: net.mcreator.latexes.procedures.LabDoorBlockAddedProcedure$4  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/LabDoorBlockAddedProcedure$4.class */
    class AnonymousClass4 {
        final /* synthetic */ LevelAccessor val$world;

        AnonymousClass4(LevelAccessor levelAccessor) {
            this.val$world = levelAccessor;
        }

        public Direction getDirection(BlockPos pos) {
            BlockState _bs = this.val$world.getBlockState(pos);
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
    }
}
