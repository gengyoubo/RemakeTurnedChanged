//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.block;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import net.mcreator.latexes.init.LatexModItems;
import net.mcreator.latexes.procedures.EvilBeaconOffUpdateTickProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
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
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.phys.BlockHitResult;
import org.jetbrains.annotations.NotNull;

public class EvilBeaconBlock extends Block {
    public static final DirectionProperty FACING;

    public EvilBeaconBlock() {
        super(Properties.of(Material.METAL).sound(SoundType.METAL).strength(2.0F, 20.0F).requiresCorrectToolForDrops());
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

    public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
        Item var6 = player.getInventory().getSelected().getItem();
        if (var6 instanceof TieredItem tieredItem) {
            return tieredItem.getTier().getLevel() >= 1;
        } else {
            return false;
        }
    }

    public @NotNull List<ItemStack> getDrops(@NotNull BlockState state, LootContext.@NotNull Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        return !dropsOriginal.isEmpty() ? dropsOriginal : Collections.singletonList(new ItemStack((ItemLike)LatexModItems.RADIO_DROPPODCALLER.get()));
    }

    public void onPlace(@NotNull BlockState blockstate, @NotNull Level world, @NotNull BlockPos pos, @NotNull BlockState oldState, boolean moving) {
        super.onPlace(blockstate, world, pos, oldState, moving);
        world.scheduleTick(pos, this, 10);
        EvilBeaconOffUpdateTickProcedure.execute(world, (double)pos.getX(), (double)pos.getY(), (double)pos.getZ());
    }

    public void neighborChanged(@NotNull BlockState blockstate, @NotNull Level world, @NotNull BlockPos pos, @NotNull Block neighborBlock, @NotNull BlockPos fromPos, boolean moving) {
        super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
        if (world.getBestNeighborSignal(pos) > 0) {
            EvilBeaconOffUpdateTickProcedure.execute(world, (double)pos.getX(), (double)pos.getY(), (double)pos.getZ());
        }

    }

    public void tick(@NotNull BlockState blockstate, @NotNull ServerLevel world, @NotNull BlockPos pos, @NotNull Random random) {
        super.tick(blockstate, world, pos, random);
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        EvilBeaconOffUpdateTickProcedure.execute(world, (double)x, (double)y, (double)z);
        world.scheduleTick(pos, this, 10);
    }

    public void attack(@NotNull BlockState blockstate, @NotNull Level world, @NotNull BlockPos pos, @NotNull Player entity) {
        super.attack(blockstate, world, pos, entity);
        EvilBeaconOffUpdateTickProcedure.execute(world, (double)pos.getX(), (double)pos.getY(), (double)pos.getZ());
    }

    public void stepOn(@NotNull Level world, @NotNull BlockPos pos, @NotNull BlockState blockstate, @NotNull Entity entity) {
        super.stepOn(world, pos, blockstate, entity);
        EvilBeaconOffUpdateTickProcedure.execute(world, (double)pos.getX(), (double)pos.getY(), (double)pos.getZ());
    }

    public void setPlacedBy(@NotNull Level world, @NotNull BlockPos pos, @NotNull BlockState blockstate, LivingEntity entity, @NotNull ItemStack itemstack) {
        super.setPlacedBy(world, pos, blockstate, entity, itemstack);
        EvilBeaconOffUpdateTickProcedure.execute(world, (double)pos.getX(), (double)pos.getY(), (double)pos.getZ());
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
        EvilBeaconOffUpdateTickProcedure.execute(world, (double)x, (double)y, (double)z);
        return InteractionResult.SUCCESS;
    }

    static {
        FACING = HorizontalDirectionalBlock.FACING;
    }
}
