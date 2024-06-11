package net.mcreator.latexes.block;

import java.util.List;
import net.mcreator.latexes.procedures.DarklatexblockEntityCollidesInTheBlockProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
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
import net.minecraft.world.level.material.Material;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/block/DarklatexblockharmlessBlock.class */
public class DarklatexblockharmlessBlock extends Block {
    public static final DirectionProperty FACING = DirectionalBlock.FACING;

    public DarklatexblockharmlessBlock() {
        super(BlockBehaviour.Properties.of(Material.STONE).sound(SoundType.SLIME_BLOCK).strength(0.75f, 5.0f).requiresCorrectToolForDrops().friction(0.8f).speedFactor(0.5f).jumpFactor(0.5f));
        registerDefaultState((BlockState) this.stateDefinition.any().setValue(FACING, Direction.NORTH));
    }

    public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
        appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("But harmless"));
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
        return 20;
    }

    public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 30;
    }

    public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
        TieredItem tieredItem = player.getInventory().getSelected().getItem();
        return (tieredItem instanceof TieredItem) && tieredItem.getTier().getLevel() >= 0;
    }

    public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
        entityInside(blockstate, world, pos, entity);
        DarklatexblockEntityCollidesInTheBlockProcedure.execute(entity);
    }

    public void stepOn(Level world, BlockPos pos, BlockState blockstate, Entity entity) {
        stepOn(world, pos, blockstate, entity);
        DarklatexblockEntityCollidesInTheBlockProcedure.execute(entity);
    }
}
