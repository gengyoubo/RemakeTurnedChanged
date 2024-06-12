package net.ltxprogrammer.turned.block;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import net.ltxprogrammer.turned.init.LatexModBlocks;
import net.ltxprogrammer.turned.procedures.HighPressureCylinderBlockDestroyedByExplosionProcedure;
import net.ltxprogrammer.turned.procedures.HighPressureCylinderUpdateTickProcedure;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/block/HighPressureCylinderBlock.class */
public class HighPressureCylinderBlock extends Block {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public HighPressureCylinderBlock() {
        super(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(1.2f, 7.5f).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor(bs, br, bp -> {
            return false;
        }));
        registerDefaultState((BlockState) this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
        appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("Blue"));
    }

    public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
        return true;
    }

    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 0;
    }

    /* renamed from: net.ltxprogrammer.turned.block.HighPressureCylinderBlock$1 */
    /* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/block/HighPressureCylinderBlock$1.class */
    static /* synthetic */ class C00281 {
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
        switch (C00281.$SwitchMap$net$minecraft$core$Direction[state.getValue(FACING).ordinal()]) {
            case 1:
                return box(3.0d, 0.0d, 3.0d, 13.0d, 30.0d, 13.0d);
            case 2:
                return box(3.0d, 0.0d, 3.0d, 13.0d, 30.0d, 13.0d);
            case 3:
                return box(3.0d, 0.0d, 3.0d, 13.0d, 30.0d, 13.0d);
            default:
                return box(3.0d, 0.0d, 3.0d, 13.0d, 30.0d, 13.0d);
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
        return (tieredItem instanceof TieredItem) && tieredItem.getTier().getLevel() >= 1;
    }

    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> dropsOriginal = getDrops(state, builder);
        if (!dropsOriginal.isEmpty()) {
            return dropsOriginal;
        }
        return Collections.singletonList(new ItemStack(this, 1));
    }

    public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
        onPlace(blockstate, world, pos, oldState, moving);
        world.scheduleTick(pos, this, 25);
    }

    public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
        tick(blockstate, world, pos, random);
        HighPressureCylinderUpdateTickProcedure.execute(world, (double) pos.getX(), (double) pos.getY(), (double) pos.getZ());
        world.scheduleTick(pos, this, 25);
    }

    public void wasExploded(Level world, BlockPos pos, Explosion e) {
        wasExploded(world, pos, e);
        HighPressureCylinderBlockDestroyedByExplosionProcedure.execute(world, (double) pos.getX(), (double) pos.getY(), (double) pos.getZ());
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        ItemBlockRenderTypes.setRenderLayer((Block) LatexModBlocks.HIGH_PRESSURE_CYLINDER.get(), renderType -> {
            return renderType == RenderType.cutout();
        });
    }
}
