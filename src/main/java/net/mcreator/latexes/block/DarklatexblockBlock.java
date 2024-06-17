//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.block;

import java.util.Random;
import net.mcreator.latexes.procedures.DarklatexblockEntityCollidesInTheBlockProcedure;
import net.mcreator.latexes.procedures.DarklatexblockUpdateTickProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.Material;
import org.jetbrains.annotations.NotNull;

public class DarklatexblockBlock extends Block {
    public static final DirectionProperty FACING;

    public DarklatexblockBlock() {
        super(Properties.of(Material.CLAY).sound(SoundType.SLIME_BLOCK).strength(0.75F, 5.0F).requiresCorrectToolForDrops().friction(0.45F).speedFactor(0.5F).jumpFactor(0.7F));
        this.registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue(FACING, Direction.NORTH));
    }

    public float[] getBeaconColorMultiplier(BlockState state, LevelReader world, BlockPos pos, BlockPos beaconPos) {
        return new float[]{0.2F, 0.2F, 0.2F};
    }

    public int getLightBlock(@NotNull BlockState state, @NotNull BlockGetter worldIn, @NotNull BlockPos pos) {
        return 15;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING});
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return (BlockState)this.defaultBlockState().setValue(FACING, context.getNearestLookingDirection().getOpposite());
    }

    public @NotNull BlockState rotate(BlockState state, Rotation rot) {
        return (BlockState)state.setValue(FACING, rot.rotate((Direction)state.getValue(FACING)));
    }

    public @NotNull BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation((Direction)state.getValue(FACING)));
    }

    public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 20;
    }

    public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 30;
    }

    public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
        Item var6 = player.getInventory().getSelected().getItem();
        if (var6 instanceof TieredItem tieredItem) {
            return tieredItem.getTier().getLevel() >= 0;
        } else {
            return false;
        }
    }

    public void onPlace(@NotNull BlockState blockstate, @NotNull Level world, @NotNull BlockPos pos, @NotNull BlockState oldState, boolean moving) {
        super.onPlace(blockstate, world, pos, oldState, moving);
        world.scheduleTick(pos, this, 325);
    }

    public void tick(@NotNull BlockState blockstate, @NotNull ServerLevel world, @NotNull BlockPos pos, @NotNull Random random) {
        super.tick(blockstate, world, pos, random);
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        DarklatexblockUpdateTickProcedure.execute(world, (double)x, (double)y, (double)z);
        world.scheduleTick(pos, this, 325);
    }

    public void entityInside(@NotNull BlockState blockstate, @NotNull Level world, @NotNull BlockPos pos, @NotNull Entity entity) {
        super.entityInside(blockstate, world, pos, entity);
        DarklatexblockEntityCollidesInTheBlockProcedure.execute(entity);
    }

    public void stepOn(@NotNull Level world, @NotNull BlockPos pos, @NotNull BlockState blockstate, @NotNull Entity entity) {
        super.stepOn(world, pos, blockstate, entity);
        DarklatexblockEntityCollidesInTheBlockProcedure.execute(entity);
    }

    static {
        FACING = DirectionalBlock.FACING;
    }
}
