//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.block;

import java.util.Collections;
import java.util.List;
import net.mcreator.latexes.init.LatexModBlocks;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
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
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

public class BigcouchBlock extends Block {
    public static final DirectionProperty FACING;

    public BigcouchBlock() {
        super(Properties.of(Material.WOOL).sound(SoundType.WOOL).strength(1.1F, 10.0F).noOcclusion().isRedstoneConductor((bs, br, bp) -> {
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
            case NORTH -> var10000 = Shapes.or(box(0.0, 0.0, -4.0, 16.0, 9.0, 17.0), box(0.0, 7.0, 14.0, 16.0, 22.0, 17.0));
            case EAST -> var10000 = Shapes.or(box(-1.0, 0.0, 0.0, 20.0, 9.0, 16.0), box(-1.0, 7.0, 0.0, 2.0, 22.0, 16.0));
            case WEST -> var10000 = Shapes.or(box(-4.0, 0.0, 0.0, 17.0, 9.0, 16.0), box(14.0, 7.0, 0.0, 17.0, 22.0, 16.0));
            default -> var10000 = Shapes.or(box(0.0, 0.0, -1.0, 16.0, 9.0, 20.0), box(0.0, 7.0, -1.0, 16.0, 22.0, 2.0));
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

    public @NotNull List<ItemStack> getDrops(@NotNull BlockState state, LootContext.@NotNull Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        return !dropsOriginal.isEmpty() ? dropsOriginal : Collections.singletonList(new ItemStack(this, 1));
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        ItemBlockRenderTypes.setRenderLayer((Block)LatexModBlocks.BIGCOUCH.get(), (renderType) -> {
            return renderType == RenderType.cutout();
        });
    }

    static {
        FACING = HorizontalDirectionalBlock.FACING;
    }
}
