//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.block;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import net.ltxprogrammer.turned.init.LatexModBlocks;
import net.ltxprogrammer.turned.procedures.HighPressureCylinderBlockDestroyedByExplosionProcedure;
import net.ltxprogrammer.turned.procedures.HighPressureCylinderUpdateTickProcedure;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.TooltipFlag;
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
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class HighPressureCylinderRedBlock extends Block {
    public static final DirectionProperty FACING;

    public HighPressureCylinderRedBlock() {
        super(Properties.of(Material.METAL).sound(SoundType.METAL).strength(1.2F, 7.5F).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> {
            return false;
        }));
        this.registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue(FACING, Direction.NORTH));
    }

    public void appendHoverText(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("Red"));
    }

    public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
        return true;
    }

    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 0;
    }

    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        VoxelShape var10000;
        switch ((Direction)state.getValue(FACING)) {
            case NORTH -> var10000 = box(3.0, 0.0, 3.0, 13.0, 30.0, 13.0);
            case EAST -> var10000 = box(3.0, 0.0, 3.0, 13.0, 30.0, 13.0);
            case WEST -> var10000 = box(3.0, 0.0, 3.0, 13.0, 30.0, 13.0);
            default -> var10000 = box(3.0, 0.0, 3.0, 13.0, 30.0, 13.0);
        }

        return var10000;
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

    public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
        Item var6 = player.getInventory().getSelected().getItem();
        if (var6 instanceof TieredItem tieredItem) {
            return tieredItem.getTier().getLevel() >= 1;
        } else {
            return false;
        }
    }

    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> dropsOriginal = super.getDrops(state, builder);
        return !dropsOriginal.isEmpty() ? dropsOriginal : Collections.singletonList(new ItemStack(this, 1));
    }

    public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
        super.onPlace(blockstate, world, pos, oldState, moving);
        world.scheduleTick(pos, this, 25);
    }

    public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
        super.tick(blockstate, world, pos, random);
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        HighPressureCylinderUpdateTickProcedure.execute(world, (double)x, (double)y, (double)z);
        world.scheduleTick(pos, this, 25);
    }

    public void wasExploded(Level world, BlockPos pos, Explosion e) {
        super.wasExploded(world, pos, e);
        HighPressureCylinderBlockDestroyedByExplosionProcedure.execute(world, (double)pos.getX(), (double)pos.getY(), (double)pos.getZ());
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        ItemBlockRenderTypes.setRenderLayer((Block)LatexModBlocks.HIGH_PRESSURE_CYLINDER_RED.get(), (renderType) -> {
            return renderType == RenderType.cutout();
        });
    }

    static {
        FACING = HorizontalDirectionalBlock.FACING;
    }
}
