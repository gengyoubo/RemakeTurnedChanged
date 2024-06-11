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
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.client.event.ColorHandlerEvent;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/block/DarklatexleavesBlock.class */
public class DarklatexleavesBlock extends Block {
    public static final DirectionProperty FACING = DirectionalBlock.FACING;

    public DarklatexleavesBlock() {
        super(BlockBehaviour.Properties.of(Material.LEAVES).sound(SoundType.SLIME_BLOCK).strength(0.35f, 2.5f).requiresCorrectToolForDrops().friction(0.8f).speedFactor(0.5f).jumpFactor(0.5f).noOcclusion().isRedstoneConductor(bs, br, bp -> {
            return false;
        }).noDrops());
        registerDefaultState((BlockState) this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 15;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING});
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return (BlockState) defaultBlockState().setValue(FACING, context.getNearestLookingDirection().getOpposite());
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return (BlockState) state.setValue(FACING, rot.rotate(state.getValue(FACING)));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation(state.getValue(FACING)));
    }

    public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 25;
    }

    public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 30;
    }

    public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
        TieredItem tieredItem = player.getInventory().getSelected().getItem();
        return (tieredItem instanceof TieredItem) && tieredItem.getTier().getLevel() >= 0;
    }

    public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
        onPlace(blockstate, world, pos, oldState, moving);
        world.scheduleTick(pos, this, 60);
    }

    public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
        tick(blockstate, world, pos, random);
        DarklatexleavesUpdateTickProcedure.execute(world, (double) pos.getX(), (double) pos.getY(), (double) pos.getZ());
        world.scheduleTick(pos, this, 60);
    }

    public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
        boolean retval = onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
        DarklatexleavesBlockDestroyedByPlayerProcedure.execute(world, (double) pos.getX(), (double) pos.getY(), (double) pos.getZ());
        return retval;
    }

    public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
        entityInside(blockstate, world, pos, entity);
        DarklatexblockEntityCollidesInTheBlockProcedure.execute(entity);
    }

    public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
        stepOn(world, pos, blockstate, entity);
        DarklatexblockEntityCollidesInTheBlockProcedure.execute(entity);
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        ItemBlockRenderTypes.setRenderLayer((Block) LatexModBlocks.DARKLATEXLEAVES.get(), renderType -> {
            return renderType == RenderType.cutout();
        });
    }

    @OnlyIn(Dist.CLIENT)
    public static void blockColorLoad(ColorHandlerEvent.Block event) {
        event.getBlockColors().register(bs, world, pos, index -> {
            return (world == null || pos == null) ? GrassColor.get(0.5d, 1.0d) : BiomeColors.getAverageGrassColor(world, pos);
        }, new Block[]{(Block) LatexModBlocks.DARKLATEXLEAVES.get()});
    }
}
