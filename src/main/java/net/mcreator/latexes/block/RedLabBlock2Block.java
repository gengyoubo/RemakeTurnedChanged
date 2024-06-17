//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.block;

import java.util.Collections;
import java.util.List;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
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

public class RedLabBlock2Block extends Block {
    public static final DirectionProperty FACING;

    public RedLabBlock2Block() {
        super(Properties.of(Material.STONE).sound(SoundType.STONE).strength(1.2F, 12.5F));
        this.registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue(FACING, Direction.NORTH));
    }

    public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("Variant 2"));
    }

    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 15;
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(new Property[]{FACING});
    }

    public BlockState getStateForPlacement(BlockPlaceContext context) {
        return (BlockState)this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    public BlockState rotate(BlockState state, Rotation rot) {
        return (BlockState)state.setValue(FACING, rot.rotate((Direction)state.getValue(FACING)));
    }

    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.getRotation((Direction)state.getValue(FACING)));
    }

    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        return !dropsOriginal.isEmpty() ? dropsOriginal : Collections.singletonList(new ItemStack(this, 1));
    }

    static {
        FACING = HorizontalDirectionalBlock.FACING;
    }
}
