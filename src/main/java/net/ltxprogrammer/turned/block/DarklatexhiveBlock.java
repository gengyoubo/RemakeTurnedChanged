//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.block;

import java.util.Random;
import net.ltxprogrammer.turned.procedures.DarklatexhiveBlockDestroyedByExplosionProcedure;
import net.ltxprogrammer.turned.procedures.DarklatexhiveUpdateTickProcedure;
import net.minecraft.client.Minecraft;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
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
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.BlockBehaviour.Properties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.jetbrains.annotations.NotNull;

public class DarklatexhiveBlock extends Block {
    public static final DirectionProperty FACING;

    public DarklatexhiveBlock() {
        super(Properties.of(Material.DIRT).sound(SoundType.SLIME_BLOCK).strength(0.75F, 5.0F).requiresCorrectToolForDrops().friction(0.3F).speedFactor(0.6F).jumpFactor(0.6F).randomTicks());
        this.registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue(FACING, Direction.NORTH));
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

    public void tick(@NotNull BlockState blockstate, @NotNull ServerLevel world, @NotNull BlockPos pos, @NotNull Random random) {
        super.tick(blockstate, world, pos, random);
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        DarklatexhiveUpdateTickProcedure.execute(world, (double)x, (double)y, (double)z);
    }

    @OnlyIn(Dist.CLIENT)
    public void animateTick(@NotNull BlockState blockstate, @NotNull Level world, @NotNull BlockPos pos, @NotNull Random random) {
        super.animateTick(blockstate, world, pos, random);
        Player entity = Minecraft.getInstance().player;
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();

        for(int l = 0; l < 2; ++l) {
            double x0 = (double)((float)x + random.nextFloat());
            double y0 = (double)((float)y + random.nextFloat());
            double z0 = (double)((float)z + random.nextFloat());
            double dx = ((double)random.nextFloat() - 0.5) * 0.5000000014901161;
            double dy = ((double)random.nextFloat() - 0.5) * 0.5000000014901161;
            double dz = ((double)random.nextFloat() - 0.5) * 0.5000000014901161;
            world.addParticle(ParticleTypes.FALLING_NECTAR, x0, y0, z0, dx, dy, dz);
        }

    }

    public boolean onDestroyedByPlayer(BlockState blockstate, Level world, BlockPos pos, Player entity, boolean willHarvest, FluidState fluid) {
        boolean retval = super.onDestroyedByPlayer(blockstate, world, pos, entity, willHarvest, fluid);
        DarklatexhiveBlockDestroyedByExplosionProcedure.execute(world, (double)pos.getX(), (double)pos.getY(), (double)pos.getZ());
        return retval;
    }

    public void wasExploded(@NotNull Level world, @NotNull BlockPos pos, @NotNull Explosion e) {
        super.wasExploded(world, pos, e);
        DarklatexhiveBlockDestroyedByExplosionProcedure.execute(world, (double)pos.getX(), (double)pos.getY(), (double)pos.getZ());
    }

    static {
        FACING = HorizontalDirectionalBlock.FACING;
    }
}
