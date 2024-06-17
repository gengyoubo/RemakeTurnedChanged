//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.block;

import java.util.Random;
import net.mcreator.latexes.init.LatexModBlocks;
import net.mcreator.latexes.procedures.DarklatexblockEntityCollidesInTheBlockProcedure;
import net.mcreator.latexes.procedures.DarklatexleavesBlockDestroyedByPlayerProcedure;
import net.mcreator.latexes.procedures.DarklatexleavesUpdateTickProcedure;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.GrassColor;
import net.minecraft.world.level.Level;
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
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ColorHandlerEvent;
import org.jetbrains.annotations.NotNull;

public class DarklatexleavesBlock extends Block {
    public static final DirectionProperty FACING;

    public DarklatexleavesBlock() {
        super(Properties.of(Material.LEAVES).sound(SoundType.SLIME_BLOCK).strength(0.35F, 2.5F).requiresCorrectToolForDrops().friction(0.8F).speedFactor(0.5F).jumpFactor(0.5F).noOcclusion().isRedstoneConductor((bs, br, bp) -> {
            return false;
        }).noDrops());
        this.registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue(FACING, Direction.NORTH));
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
        return 25;
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
        world.scheduleTick(pos, this, 60);
    }

    public void tick(@NotNull BlockState blockstate, @NotNull ServerLevel world, @NotNull BlockPos pos, @NotNull Random random) {
        super.tick(blockstate, world, pos, random);
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        DarklatexleavesUpdateTickProcedure.execute(world, (double)x, (double)y, (double)z);
        world.scheduleTick(pos, this, 60);
    }

    public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
        boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
        DarklatexleavesBlockDestroyedByPlayerProcedure.execute(world, (double)pos.getX(), (double)pos.getY(), (double)pos.getZ());
        return retval;
    }

    public void entityInside(@NotNull BlockState blockstate, @NotNull Level world, @NotNull BlockPos pos, @NotNull Entity entity) {
        super.entityInside(blockstate, world, pos, entity);
        DarklatexblockEntityCollidesInTheBlockProcedure.execute(entity);
    }

    public void stepOn(@NotNull Level world, @NotNull BlockPos pos, @NotNull BlockState blockstate, @NotNull Entity entity) {
        super.stepOn(world, pos, blockstate, entity);
        DarklatexblockEntityCollidesInTheBlockProcedure.execute(entity);
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        ItemBlockRenderTypes.setRenderLayer((Block)LatexModBlocks.DARKLATEXLEAVES.get(), (renderType) -> {
            return renderType == RenderType.cutout();
        });
    }

    @OnlyIn(Dist.CLIENT)
    public static void blockColorLoad(ColorHandlerEvent.Block event) {
        event.getBlockColors().register((bs, world, pos, index) -> {
            return world != null && pos != null ? BiomeColors.getAverageGrassColor(world, pos) : GrassColor.get(0.5, 1.0);
        }, new Block[]{(Block)LatexModBlocks.DARKLATEXLEAVES.get()});
    }

    static {
        FACING = DirectionalBlock.FACING;
    }
}
