//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.block;

import java.util.Collections;
import java.util.List;
import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
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
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;
import org.jetbrains.annotations.NotNull;

public class DarklatexiceBlock extends Block {
    public static final DirectionProperty FACING;

    public DarklatexiceBlock() {
        super(Properties.of(Material.ICE).sound(SoundType.GLASS).strength(0.75F, 2.0F).requiresCorrectToolForDrops().friction(0.98F));
        this.registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue(FACING, Direction.NORTH));
    }

    public int getLightBlock(@NotNull BlockState state, @NotNull BlockGetter worldIn, @NotNull BlockPos pos) {
        return 7;
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
        return !dropsOriginal.isEmpty() ? dropsOriginal : Collections.singletonList(new ItemStack((ItemLike)LatexModItems.DARKLATEXCRYSTAL.get(), 3));
    }

    static {
        FACING = DirectionalBlock.FACING;
    }
}
