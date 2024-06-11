package net.mcreator.latexes.procedures;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import net.mcreator.latexes.init.LatexModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.level.block.state.properties.Property;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/BunkerDoorBlockAddedProcedure.class */
public class BunkerDoorBlockAddedProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
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
        if (new AnonymousClass1(world).getDirection(new BlockPos(x, y, z)) == Direction.NORTH || new AnonymousClass2(world).getDirection(new BlockPos(x, y, z)) == Direction.SOUTH) {
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

    /* renamed from: net.mcreator.latexes.procedures.BunkerDoorBlockAddedProcedure$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/BunkerDoorBlockAddedProcedure$1.class */
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

    /* renamed from: net.mcreator.latexes.procedures.BunkerDoorBlockAddedProcedure$2  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/BunkerDoorBlockAddedProcedure$2.class */
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
}
