package net.ltxprogrammer.turned.procedures;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import net.ltxprogrammer.turned.init.LatexModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Property;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/BunkerDoorBlockAddedProcedure.class */
public class BunkerDoorBlockAddedProcedure {
    public static void execute(final LevelAccessor world, double x, double y, double z) {
        if (!(world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == LatexModBlocks.BUNKER_DOOR.get() || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.BARRIER || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() == Blocks.CAVE_AIR)) {
            world.destroyBlock(new BlockPos(x, y, z), false);
            BlockPos _bp = new BlockPos(x, y + 1.0d, z);
            BlockState _bs = ((Block) LatexModBlocks.BUNKER_DOOR.get()).defaultBlockState();
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
        }
        if (new Object() { // from class: net.ltxprogrammer.turned.procedures.BunkerDoorBlockAddedProcedure.1
            public Direction getDirection(BlockPos pos) {
                BlockState _bs2 = world.getBlockState(pos);
                Property<?> property = _bs2.getBlock().getStateDefinition().getProperty("facing");
                if (property != null) {
                    Direction _dir = _bs2.getValue(property);
                    if (_dir instanceof Direction) {
                        return _dir;
                    }
                }
                Property<?> property2 = _bs2.getBlock().getStateDefinition().getProperty("axis");
                if (property2 != null) {
                    Direction.Axis _axis = _bs2.getValue(property2);
                    if (_axis instanceof Direction.Axis) {
                        return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
                    }
                }
                return Direction.NORTH;
            }
        }.getDirection(new BlockPos(x, y, z)) == Direction.NORTH || new Object() { // from class: net.ltxprogrammer.turned.procedures.BunkerDoorBlockAddedProcedure.2
            public Direction getDirection(BlockPos pos) {
                BlockState _bs2 = world.getBlockState(pos);
                Property<?> property = _bs2.getBlock().getStateDefinition().getProperty("facing");
                if (property != null) {
                    Direction _dir = _bs2.getValue(property);
                    if (_dir instanceof Direction) {
                        return _dir;
                    }
                }
                Property<?> property2 = _bs2.getBlock().getStateDefinition().getProperty("axis");
                if (property2 != null) {
                    Direction.Axis _axis = _bs2.getValue(property2);
                    if (_axis instanceof Direction.Axis) {
                        return Direction.fromAxisAndDirection(_axis, Direction.AxisDirection.POSITIVE);
                    }
                }
                return Direction.NORTH;
            }
        }.getDirection(new BlockPos(x, y, z)) == Direction.SOUTH) {
            if (!(world.getBlockState(new BlockPos(x - 1.0d, y, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x - 1.0d, y, z)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x - 1.0d, y, z)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x + 1.0d, y, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x + 1.0d, y, z)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x + 1.0d, y, z)).getBlock() == Blocks.CAVE_AIR)) {
                Direction _dir = Direction.WEST;
                BlockPos _pos = new BlockPos(x, y, z);
                BlockState _bs2 = world.getBlockState(_pos);
                Property<?> _property2 = _bs2.getBlock().getStateDefinition().getProperty("facing");
                if (_property2 instanceof DirectionProperty) {
                    DirectionProperty _dp = (DirectionProperty) _property2;
                    if (_dp.getPossibleValues().contains(_dir)) {
                        world.setBlock(_pos, (BlockState) _bs2.setValue(_dp, _dir), 3);
                        return;
                    }
                }
                Property<?> _property3 = _bs2.getBlock().getStateDefinition().getProperty("axis");
                if (_property3 instanceof EnumProperty) {
                    EnumProperty _ap = (EnumProperty) _property3;
                    if (_ap.getPossibleValues().contains(_dir.getAxis())) {
                        world.setBlock(_pos, (BlockState) _bs2.setValue(_ap, _dir.getAxis()), 3);
                    }
                }
            }
        }
    }
}
