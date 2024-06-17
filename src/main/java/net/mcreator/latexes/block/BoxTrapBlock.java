//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.block;

import java.util.Collections;
import java.util.List;
import net.mcreator.latexes.block.entity.BoxTrapBlockEntity;
import net.mcreator.latexes.procedures.BoxTrapOnBlockRightClickedProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;

public class BoxTrapBlock extends Block implements EntityBlock {
    public static final DirectionProperty FACING;

    public BoxTrapBlock() {
        super(Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(0.75F, 5.0F).requiresCorrectToolForDrops());
        this.registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue(FACING, Direction.NORTH));
    }

    public void appendHoverText(@NotNull ItemStack itemstack, BlockGetter world, @NotNull List<Component> list, @NotNull TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("Wait"));
        list.add(new TextComponent("It's a trap!"));
    }

    public int getLightBlock(@NotNull BlockState state, @NotNull BlockGetter worldIn, @NotNull BlockPos pos) {
        return 15;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING});
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return (BlockState)this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    public @NotNull BlockState rotate(BlockState state, Rotation rot) {
        return (BlockState)state.setValue(FACING, rot.rotate((Direction)state.getValue(FACING)));
    }

    public @NotNull BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation((Direction)state.getValue(FACING)));
    }

    public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
        Item var6 = player.getInventory().getSelected().getItem();
        if (var6 instanceof TieredItem tieredItem) {
            return tieredItem.getTier().getLevel() >= 0;
        } else {
            return false;
        }
    }

    public @NotNull List<ItemStack> getDrops(@NotNull BlockState state, LootContext.@NotNull Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        return !dropsOriginal.isEmpty() ? dropsOriginal : Collections.singletonList(new ItemStack(this, 1));
    }

    public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
        boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
        BoxTrapOnBlockRightClickedProcedure.execute(world, (double)pos.getX(), (double)pos.getY(), (double)pos.getZ());
        return retval;
    }

    public void stepOn(@NotNull Level world, @NotNull BlockPos pos, @NotNull BlockState blockstate, @NotNull Entity entity) {
        super.stepOn(world, pos, blockstate, entity);
        BoxTrapOnBlockRightClickedProcedure.execute(world, (double)pos.getX(), (double)pos.getY(), (double)pos.getZ());
    }

    public @NotNull InteractionResult use(@NotNull BlockState blockstate, @NotNull Level world, @NotNull BlockPos pos, @NotNull Player entity, @NotNull InteractionHand hand, @NotNull BlockHitResult hit) {
        super.use(blockstate, world, pos, entity, hand, hit);
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        double hitX = hit.getLocation().x;
        double hitY = hit.getLocation().y;
        double hitZ = hit.getLocation().z;
        Direction direction = hit.getDirection();
        BoxTrapOnBlockRightClickedProcedure.execute(world, (double)x, (double)y, (double)z);
        return InteractionResult.SUCCESS;
    }

    public MenuProvider getMenuProvider(@NotNull BlockState state, Level worldIn, @NotNull BlockPos pos) {
        BlockEntity tileEntity = worldIn.getBlockEntity(pos);
        MenuProvider var10000;
        if (tileEntity instanceof MenuProvider menuProvider) {
            var10000 = menuProvider;
        } else {
            var10000 = null;
        }

        return var10000;
    }

    public BlockEntity newBlockEntity(@NotNull BlockPos pos, @NotNull BlockState state) {
        return new BoxTrapBlockEntity(pos, state);
    }

    public boolean triggerEvent(@NotNull BlockState state, @NotNull Level world, @NotNull BlockPos pos, int eventID, int eventParam) {
        super.triggerEvent(state, world, pos, eventID, eventParam);
        BlockEntity blockEntity = world.getBlockEntity(pos);
        return blockEntity == null ? false : blockEntity.triggerEvent(eventID, eventParam);
    }

    public void onRemove(BlockState state, @NotNull Level world, @NotNull BlockPos pos, BlockState newState, boolean isMoving) {
        if (state.getBlock() != newState.getBlock()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof BoxTrapBlockEntity) {
                BoxTrapBlockEntity be = (BoxTrapBlockEntity)blockEntity;
                Containers.dropContents(world, pos, be);
                world.updateNeighbourForOutputSignal(pos, this);
            }

            super.onRemove(state, world, pos, newState, isMoving);
        }

    }

    public boolean hasAnalogOutputSignal(@NotNull BlockState state) {
        return true;
    }

    public int getAnalogOutputSignal(@NotNull BlockState blockState, Level world, @NotNull BlockPos pos) {
        BlockEntity tileentity = world.getBlockEntity(pos);
        if (tileentity instanceof BoxTrapBlockEntity be) {
            return AbstractContainerMenu.getRedstoneSignalFromContainer(be);
        } else {
            return 0;
        }
    }

    static {
        FACING = HorizontalDirectionalBlock.FACING;
    }
}
