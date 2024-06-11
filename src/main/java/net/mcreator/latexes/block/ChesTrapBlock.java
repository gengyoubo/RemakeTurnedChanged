package net.mcreator.latexes.block;

import java.util.Collections;
import java.util.List;
import net.mcreator.latexes.block.entity.ChesTrapBlockEntity;
import net.mcreator.latexes.init.LatexModBlocks;
import net.mcreator.latexes.procedures.BoxTrapOnBlockRightClickedProcedure;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
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
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/block/ChesTrapBlock.class */
public class ChesTrapBlock extends Block implements EntityBlock {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public ChesTrapBlock() {
        super(BlockBehaviour.Properties.of(Material.WOOD).sound(SoundType.WOOD).strength(1.0f, 5.0f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor(bs, br, bp -> {
            return false;
        }));
        registerDefaultState((BlockState) this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
        appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("Wait"));
        list.add(new TextComponent("It's a trap!"));
    }

    public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
        return true;
    }

    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 0;
    }

    /* renamed from: net.mcreator.latexes.block.ChesTrapBlock$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/block/ChesTrapBlock$1.class */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$net$minecraft$core$Direction = new int[Direction.values().length];

        static {
            try {
                $SwitchMap$net$minecraft$core$Direction[Direction.NORTH.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$net$minecraft$core$Direction[Direction.EAST.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                $SwitchMap$net$minecraft$core$Direction[Direction.WEST.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
        }
    }

    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        switch (AnonymousClass1.$SwitchMap$net$minecraft$core$Direction[state.getValue(FACING).ordinal()]) {
            case 1:
                return box(1.0d, 0.0d, 1.0d, 15.0d, 15.0d, 15.0d);
            case 2:
                return box(1.0d, 0.0d, 1.0d, 15.0d, 15.0d, 15.0d);
            case 3:
                return box(1.0d, 0.0d, 1.0d, 15.0d, 15.0d, 15.0d);
            default:
                return box(1.0d, 0.0d, 1.0d, 15.0d, 15.0d, 15.0d);
        }
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING});
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return (BlockState) defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return (BlockState) state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
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
        return Collections.singletonList(new ItemStack(this, 1));
    }

    public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
        boolean retval = onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
        BoxTrapOnBlockRightClickedProcedure.execute(world, (double) pos.getX(), (double) pos.getY(), (double) pos.getZ());
        return retval;
    }

    public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
        stepOn(world, pos, blockstate, entity);
        BoxTrapOnBlockRightClickedProcedure.execute(world, (double) pos.getX(), (double) pos.getY(), (double) pos.getZ());
    }

    public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
        use(blockstate, world, pos, entity, hand, hit);
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        double d = hit.getLocation().x;
        double d2 = hit.getLocation().y;
        double d3 = hit.getLocation().z;
        hit.getDirection();
        BoxTrapOnBlockRightClickedProcedure.execute(world, (double) x, (double) y, (double) z);
        return InteractionResult.SUCCESS;
    }

    public MenuProvider getMenuProvider(BlockState state, Level worldIn, BlockPos pos) {
        BlockEntity tileEntity = worldIn.getBlockEntity(pos);
        if (tileEntity instanceof MenuProvider) {
            return (MenuProvider) tileEntity;
        }
        return null;
    }

    public BlockEntity newBlockEntity(BlockPos pos, BlockState state) {
        return new ChesTrapBlockEntity(pos, state);
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
            if (blockEntity instanceof ChesTrapBlockEntity) {
                Containers.dropContents(world, pos, (ChesTrapBlockEntity) blockEntity);
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
        if (tileentity instanceof ChesTrapBlockEntity) {
            return AbstractContainerMenu.getRedstoneSignalFromContainer((ChesTrapBlockEntity) tileentity);
        }
        return 0;
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        ItemBlockRenderTypes.setRenderLayer((Block) LatexModBlocks.CHES_TRAP.get(), renderType -> {
            return renderType == RenderType.cutout();
        });
    }
}
