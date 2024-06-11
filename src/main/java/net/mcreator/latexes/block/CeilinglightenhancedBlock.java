/*    */ package net.mcreator.latexes.block;
/*    */ 
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import net.mcreator.latexes.init.LatexModBlocks;
/*    */ import net.mcreator.latexes.procedures.CeilinglightBlockIsPlacedByProcedure;
/*    */ import net.minecraft.client.renderer.ItemBlockRenderTypes;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.TieredItem;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.material.Material;
/*    */ import net.minecraft.world.level.storage.loot.LootContext;
/*    */ import net.minecraft.world.phys.shapes.CollisionContext;
/*    */ import net.minecraft.world.phys.shapes.VoxelShape;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.api.distmarker.OnlyIn;
/*    */ 
/*    */ 
/*    */ public class CeilinglightenhancedBlock
/*    */   extends Block
/*    */ {
/*    */   public CeilinglightenhancedBlock() {
/* 35 */     super(BlockBehaviour.Properties.of(Material.GLASS).sound(SoundType.GLASS).strength(0.65F, 6.5F).lightLevel(s -> 14)
/* 36 */         .requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
/* 41 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 46 */     return 0;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
/* 52 */     return box(0.0D, 13.0D, 0.0D, 16.0D, 16.0D, 16.0D);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/* 57 */     Item item = player.getInventory().getSelected().getItem(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/* 58 */       return (tieredItem.getTier().getLevel() >= 0); }
/* 59 */      return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
/* 64 */     List<ItemStack> dropsOriginal = super.getDrops(state, builder);
/* 65 */     if (!dropsOriginal.isEmpty())
/* 66 */       return dropsOriginal; 
/* 67 */     return Collections.singletonList(new ItemStack((ItemLike)this, 1));
/*    */   }
/*    */ 
/*    */   
/*    */   public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
/* 72 */     super.neighborChanged(blockstate, world, pos, neighborBlock, fromPos, moving);
/* 73 */     CeilinglightBlockIsPlacedByProcedure.execute((LevelAccessor)world, pos.getX(), pos.getY(), pos.getZ());
/*    */   }
/*    */ 
/*    */   
/*    */   public void setPlacedBy(Level world, BlockPos pos, BlockState blockstate, LivingEntity entity, ItemStack itemstack) {
/* 78 */     super.setPlacedBy(world, pos, blockstate, entity, itemstack);
/* 79 */     CeilinglightBlockIsPlacedByProcedure.execute((LevelAccessor)world, pos.getX(), pos.getY(), pos.getZ());
/*    */   }
/*    */   
/*    */   @OnlyIn(Dist.CLIENT)
/*    */   public static void registerRenderLayer() {
/* 84 */     ItemBlockRenderTypes.setRenderLayer((Block)LatexModBlocks.CEILINGLIGHTENHANCED.get(), renderType -> (renderType == RenderType.cutout()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\block\CeilinglightenhancedBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */