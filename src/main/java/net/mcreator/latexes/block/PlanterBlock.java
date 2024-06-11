/*    */ package net.mcreator.latexes.block;
/*    */ 
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import net.mcreator.latexes.init.LatexModBlocks;
/*    */ import net.minecraft.client.renderer.ItemBlockRenderTypes;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.Direction;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.TieredItem;
/*    */ import net.minecraft.world.item.context.BlockPlaceContext;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.HorizontalDirectionalBlock;
/*    */ import net.minecraft.world.level.block.Mirror;
/*    */ import net.minecraft.world.level.block.Rotation;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.StateDefinition;
/*    */ import net.minecraft.world.level.block.state.properties.DirectionProperty;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ import net.minecraft.world.level.material.Material;
/*    */ import net.minecraft.world.level.material.MaterialColor;
/*    */ import net.minecraft.world.level.storage.loot.LootContext;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.api.distmarker.OnlyIn;
/*    */ import net.minecraftforge.common.IPlantable;
/*    */ 
/*    */ public class PlanterBlock
/*    */   extends Block {
/* 36 */   public static final DirectionProperty FACING = HorizontalDirectionalBlock.FACING;
/*    */   
/*    */   public PlanterBlock() {
/* 39 */     super(BlockBehaviour.Properties.of(Material.DIRT, MaterialColor.GRASS).sound(SoundType.WOOD).strength(0.75F, 6.5F)
/* 40 */         .requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
/* 41 */     registerDefaultState((BlockState)((BlockState)this.stateDefinition.any()).setValue((Property)FACING, (Comparable)Direction.NORTH));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
/* 46 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 51 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
/* 56 */     builder.add(new Property[] { (Property)FACING });
/*    */   }
/*    */ 
/*    */   
/*    */   public BlockState getStateForPlacement(BlockPlaceContext context) {
/* 61 */     return (BlockState)defaultBlockState().setValue((Property)FACING, (Comparable)context.getHorizontalDirection().getOpposite());
/*    */   }
/*    */   
/*    */   public BlockState rotate(BlockState state, Rotation rot) {
/* 65 */     return (BlockState)state.setValue((Property)FACING, (Comparable)rot.rotate((Direction)state.getValue((Property)FACING)));
/*    */   }
/*    */   
/*    */   public BlockState mirror(BlockState state, Mirror mirrorIn) {
/* 69 */     return state.rotate(mirrorIn.getRotation((Direction)state.getValue((Property)FACING)));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction direction, IPlantable plantable) {
/* 74 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/* 79 */     Item item = player.getInventory().getSelected().getItem(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/* 80 */       return (tieredItem.getTier().getLevel() >= 0); }
/* 81 */      return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
/* 86 */     List<ItemStack> dropsOriginal = super.getDrops(state, builder);
/* 87 */     if (!dropsOriginal.isEmpty())
/* 88 */       return dropsOriginal; 
/* 89 */     return Collections.singletonList(new ItemStack((ItemLike)this, 1));
/*    */   }
/*    */   
/*    */   @OnlyIn(Dist.CLIENT)
/*    */   public static void registerRenderLayer() {
/* 94 */     ItemBlockRenderTypes.setRenderLayer((Block)LatexModBlocks.PLANTER.get(), renderType -> (renderType == RenderType.cutout()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\PlanterBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */