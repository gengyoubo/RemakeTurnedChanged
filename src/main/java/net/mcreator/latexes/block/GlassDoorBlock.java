//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.block;

import java.util.Collections;
import java.util.List;
import net.mcreator.latexes.init.LatexModBlocks;
import net.mcreator.latexes.procedures.GlassDoorBlockAddedProcedure;
import net.mcreator.latexes.procedures.GlassDoorOnBlockRightClickedProcedure;
import net.mcreator.latexes.procedures.GlassDoorUpdateTickProcedure;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.Mirror;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.pathfinder.BlockPathTypes;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

public class GlassDoorBlock extends Block {
    public static final DirectionProperty FACING;

    public GlassDoorBlock() {
        super(Properties.of(Material.GLASS).sound(SoundType.STONE).strength(0.75F, 7.5F).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> {
            return false;
        }));
        this.registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue(FACING, Direction.NORTH));
    }

    public boolean propagatesSkylightDown(@NotNull BlockState state, @NotNull BlockGetter reader, @NotNull BlockPos pos) {
        return true;
    }

    public int getLightBlock(@NotNull BlockState state, @NotNull BlockGetter worldIn, @NotNull BlockPos pos) {
        return 0;
    }

    public @NotNull VoxelShape getShape(BlockState state, @NotNull BlockGetter world, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        VoxelShape var10000;
        switch ((Direction)state.getValue(FACING)) {
            case NORTH -> var10000 = box(0.0, 0.0, 5.0, 16.0, 32.0, 11.0);
            case EAST -> var10000 = box(5.0, 0.0, 0.0, 11.0, 32.0, 16.0);
            case WEST -> var10000 = box(5.0, 0.0, 0.0, 11.0, 32.0, 16.0);
            default -> var10000 = box(0.0, 0.0, 5.0, 16.0, 32.0, 11.0);
        }

        return var10000;
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

    public BlockPathTypes getAiPathNodeType(BlockState state, BlockGetter world, BlockPos pos, Mob entity) {
        return BlockPathTypes.DOOR_WOOD_CLOSED;
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

    public void onPlace(@NotNull BlockState blockstate, @NotNull Level world, @NotNull BlockPos pos, @NotNull BlockState oldState, boolean moving) {
        super.onPlace(blockstate, world, pos, oldState, moving);
        GlassDoorBlockAddedProcedure.execute(world, (double)pos.getX(), (double)pos.getY(), (double)pos.getZ());
    }

    public void neighborChanged(@NotNull BlockState blockstate, @NotNull Level world, @NotNull BlockPos pos, @NotNull Block neighborBlock, @NotNull BlockPos fromPos, boolean moving) {
        super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
        GlassDoorUpdateTickProcedure.execute(world, (double)pos.getX(), (double)pos.getY(), (double)pos.getZ());
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
        GlassDoorOnBlockRightClickedProcedure.execute(world, (double)x, (double)y, (double)z);
        return InteractionResult.SUCCESS;
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        ItemBlockRenderTypes.setRenderLayer((Block)LatexModBlocks.GLASS_DOOR.get(), (renderType) -> {
            return renderType == RenderType.cutout();
        });
    }

    static {
        FACING = HorizontalDirectionalBlock.FACING;
    }
}
