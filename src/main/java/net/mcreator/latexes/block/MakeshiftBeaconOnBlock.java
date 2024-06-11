package net.mcreator.latexes.block;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import net.mcreator.latexes.procedures.CheckevilraidProcedure;
import net.mcreator.latexes.procedures.MakeshiftBeaconOnUpdateTickProcedure;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;
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
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/block/MakeshiftBeaconOnBlock.class */
public class MakeshiftBeaconOnBlock extends Block {
    public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;

    public MakeshiftBeaconOnBlock() {
        super(BlockBehaviour.Properties.of(Material.METAL).sound(SoundType.METAL).strength(1.0f, 12.0f).lightLevel(s -> {
            return 12;
        }).requiresCorrectToolForDrops());
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
        world.scheduleTick(pos, this, 10);
    }

    public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
        tick(blockstate, world, pos, random);
        MakeshiftBeaconOnUpdateTickProcedure.execute(world, (double) pos.getX(), (double) pos.getY(), (double) pos.getZ());
        world.scheduleTick(pos, this, 10);
    }

    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState blockstate, Level world, BlockPos pos, Random random) {
        animateTick(blockstate, world, pos, random);
        LocalPlayer localPlayer = Minecraft.getInstance().player;
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        if (CheckevilraidProcedure.execute(world)) {
            for (int l = 0; l < 3; l++) {
                world.addParticle(ParticleTypes.SOUL_FIRE_FLAME, (double) (((float) x) + random.nextFloat()), (double) (((float) y) + random.nextFloat()), (double) (((float) z) + random.nextFloat()), (((double) random.nextFloat()) - 0.5d) * 0.5d, (((double) random.nextFloat()) - 0.5d) * 0.5d, (((double) random.nextFloat()) - 0.5d) * 0.5d);
            }
        }
    }
}
