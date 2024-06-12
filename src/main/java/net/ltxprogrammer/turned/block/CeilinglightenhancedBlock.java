package net.ltxprogrammer.turned.block;

import java.util.Collections;
import java.util.List;
import net.ltxprogrammer.turned.init.LatexModBlocks;
import net.ltxprogrammer.turned.procedures.CeilinglightBlockIsPlacedByProcedure;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.storage.loot.LootContext;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/block/CeilinglightenhancedBlock.class */
public class CeilinglightenhancedBlock extends Block {
    public CeilinglightenhancedBlock() {
        super(BlockBehaviour.Properties.of(Material.GLASS).sound(SoundType.GLASS).strength(0.65f, 6.5f).lightLevel(s -> {
            return 14;
        }).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor(bs, br, bp -> {
            return false;
        }));
    }

    public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
        return true;
    }

    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 0;
    }

    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        return box(0.0d, 13.0d, 0.0d, 16.0d, 16.0d, 16.0d);
    }

    public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
        TieredItem tieredItem = player.getInventory().getSelected().getItem();
        return (tieredItem instanceof TieredItem) && tieredItem.getTier().getLevel() >= 0;
    }

    public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
        List<ItemStack> dropsOriginal = getDrops(state, builder);
        if (!dropsOriginal.isEmpty()) {
            return dropsOriginal;
        }
        return Collections.singletonList(new ItemStack(this, 1));
    }

    public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
        neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
        CeilinglightBlockIsPlacedByProcedure.execute(world, (double) pos.getX(), (double) pos.getY(), (double) pos.getZ());
    }

    public void setPlacedBy(Level world, BlockPos pos, BlockState blockstate, LivingEntity entity, ItemStack itemstack) {
        setPlacedBy(world, pos, blockstate, entity, itemstack);
        CeilinglightBlockIsPlacedByProcedure.execute(world, (double) pos.getX(), (double) pos.getY(), (double) pos.getZ());
    }

    @OnlyIn(Dist.CLIENT)
    public static void registerRenderLayer() {
        ItemBlockRenderTypes.setRenderLayer((Block) LatexModBlocks.CEILINGLIGHTENHANCED.get(), renderType -> {
            return renderType == RenderType.cutout();
        });
    }
}
