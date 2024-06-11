package net.mcreator.latexes.block;

import io.netty.buffer.Unpooled;
import java.util.Collections;
import java.util.List;
import net.mcreator.latexes.block.entity.SmallBoxBlockEntity;
import net.mcreator.latexes.init.LatexModBlocks;
import net.mcreator.latexes.world.inventory.SmallboxguiMenu;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.Containers;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.network.NetworkHooks;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/block/SmallBoxBlock.class */
public class SmallBoxBlock extends Block implements SimpleWaterloggedBlock, EntityBlock {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
    public static final BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

    public SmallBoxBlock() {
        super(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(0.65f, 3.5f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor(bs, br, bp -> {
            return false;
        }));
        registerDefaultState((BlockState) ((BlockState) this.stateDefinition.any().setValue(FACING, Direction.NORTH)).setValue(WATERLOGGED, false));
    }

    public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
        return state.getFluidState().isEmpty();
    }

    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 0;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING, WATERLOGGED});
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return (BlockState) ((BlockState) defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite())).setValue(WATERLOGGED, Boolean.valueOf(context.getLevel().getFluidState(context.getClickedPos()).getType() == Fluids.WATER));
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return (BlockState) state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
    }

    public FluidState getFluidState(BlockState state) {
        return ((Boolean) state.getValue(WATERLOGGED)).booleanValue() ? Fluids.WATER.getSource(false) : getFluidState(state);
    }

    public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor world, BlockPos currentPos, BlockPos facingPos) {
        if (((Boolean) state.getValue(WATERLOGGED)).booleanValue()) {
            world.scheduleTick(currentPos, Fluids.WATER, Fluids.WATER.getTickDelay(world));
        }
        return updateShape(state, facing, facingState, world, currentPos, facingPos);
    }

    public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
        TieredItem tieredItem = player.getInventory().getSelected().getItem();
        return (tieredItem instanceof TieredItem) && tieredItem.getTier().getLevel() >= 0;
    }

    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> dropsOriginal = getDrops(state, builder);
        if (!dropsOriginal.isEmpty()) {
            return dropsOriginal;
        }
        return Collections.singletonList(new ItemStack((ItemLike) LatexModBlocks.BOX_INVENTORY.get()));
    }

    public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
        use(blockstate, world, pos, entity, hand, hit);
        if (entity instanceof ServerPlayer) {
            NetworkHooks.openGui((ServerPlayer) entity, new AnonymousClass1(pos), pos);
        }
        return InteractionResult.SUCCESS;
    }

    /* renamed from: net.mcreator.latexes.block.SmallBoxBlock$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/block/SmallBoxBlock$1.class */
    class AnonymousClass1 implements MenuProvider {
        final /* synthetic */ BlockPos val$pos;

        /* JADX WARN: Incorrect args count in method signature: ()V */
        AnonymousClass1(BlockPos blockPos) {
            this.val$pos = blockPos;
        }

        public Component getDisplayName() {
            return new TextComponent("Small Box");
        }

        public AbstractContainerMenu createMenu(int id, Inventory inventory, Player player) {
            return new SmallboxguiMenu(id, inventory, new FriendlyByteBuf(Unpooled.buffer()).writeBlockPos(this.val$pos));
        }
    }

    public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
        BlockEntity tileEntity = worldIn.getBlockEntity(pos);
        if (tileEntity instanceof MenuProvider) {
            return (MenuProvider) tileEntity;
        }
        return null;
    }

    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new SmallBoxBlockEntity(pos, state);
    }

    public boolean triggerEvent(BlockState state, Level world, BlockPos pos, int eventID, int eventParam) {
        triggerEvent(state, world, pos, eventID, eventParam);
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity == null) {
            return false;
        }
        return blockEntity.triggerEvent(eventID, eventParam);
    }

    public void onRemove(BlockState state, Level world, BlockPos pos, BlockState newState, boolean isMoving) {
        if (state.getBlock() != newState.getBlock()) {
            BlockEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof SmallBoxBlockEntity) {
                Containers.dropContents(world, pos, (SmallBoxBlockEntity) blockEntity);
                world.updateNeighbourForOutputSignal(pos, this);
            }
            onRemove(state, world, pos, newState, isMoving);
        }
    }

    public boolean hasAnalogOutputSignal(BlockState state) {
        return true;
    }

    public int getAnalogOutputSignal(BlockState blockState, Level world, BlockPos pos) {
        BlockEntity tileentity = world.getBlockEntity(pos);
        if (tileentity instanceof SmallBoxBlockEntity) {
            return AbstractContainerMenu.getRedstoneSignalFromContainer((SmallBoxBlockEntity) tileentity);
        }
        return 0;
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        ItemBlockRenderTypes.setRenderLayer((Block) LatexModBlocks.SMALL_BOX.get(), renderType -> {
            return renderType == RenderType.cutout();
        });
    }
}
