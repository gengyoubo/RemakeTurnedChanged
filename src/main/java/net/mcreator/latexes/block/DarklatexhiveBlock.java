package net.mcreator.latexes.block;

import java.util.Random;
import net.mcreator.latexes.procedures.DarklatexhiveBlockDestroyedByExplosionProcedure;
import net.mcreator.latexes.procedures.DarklatexhiveUpdateTickProcedure;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.TieredItem;
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
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/block/DarklatexhiveBlock.class */
public class DarklatexhiveBlock extends Block {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public DarklatexhiveBlock() {
        super(BlockBehaviour.Properties.of(Material.DIRT).sound(SoundType.SLIME_BLOCK).strength(0.75f, 5.0f).requiresCorrectToolForDrops().friction(0.3f).speedFactor(0.6f).jumpFactor(0.6f).randomTicks());
        registerDefaultState((BlockState) this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 15;
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

    public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 20;
    }

    public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 30;
    }

    public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
        TieredItem tieredItem = player.getInventory().getSelected().getItem();
        return (tieredItem instanceof TieredItem) && tieredItem.getTier().getLevel() >= 0;
    }

    public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
        tick(blockstate, world, pos, random);
        DarklatexhiveUpdateTickProcedure.execute(world, (double) pos.getX(), (double) pos.getY(), (double) pos.getZ());
    }

    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState blockstate, Level world, BlockPos pos, Random random) {
        animateTick(blockstate, world, pos, random);
        LocalPlayer localPlayer = Minecraft.getInstance().player;
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        for (int l = 0; l < 2; l++) {
            world.addParticle(ParticleTypes.FALLING_NECTAR, (double) (((float) x) + random.nextFloat()), (double) (((float) y) + random.nextFloat()), (double) (((float) z) + random.nextFloat()), (((double) random.nextFloat()) - 0.5d) * 0.5000000014901161d, (((double) random.nextFloat()) - 0.5d) * 0.5000000014901161d, (((double) random.nextFloat()) - 0.5d) * 0.5000000014901161d);
        }
    }

    public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
        boolean retval = onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
        DarklatexhiveBlockDestroyedByExplosionProcedure.execute(world, (double) pos.getX(), (double) pos.getY(), (double) pos.getZ());
        return retval;
    }

    public void wasExploded(Level world, BlockPos pos, Explosion e) {
        wasExploded(world, pos, e);
        DarklatexhiveBlockDestroyedByExplosionProcedure.execute(world, (double) pos.getX(), (double) pos.getY(), (double) pos.getZ());
    }
}
