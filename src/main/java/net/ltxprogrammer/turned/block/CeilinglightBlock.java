/*    */ package net.ltxprogrammer.turned.block;
/*    */ 
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import net.ltxprogrammer.turned.init.LatexModBlocks;
/*    */ import net.ltxprogrammer.turned.procedures.CeilinglightBlockIsPlacedByProcedure;
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
/*    */ public class CeilinglightBlock
/*    */   extends Block
/*    */ {
/*    */   public CeilinglightBlock() {
/* 34 */     super(BlockBehaviour.Properties.m_60939_(Material.f_76275_).m_60918_(SoundType.f_56744_).m_60913_(0.5F, 5.0F).m_60953_(s -> 12).m_60999_()
/* 35 */         .m_60955_().m_60924_((bs, br, bp) -> false));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_7420_(BlockState state, BlockGetter reader, BlockPos pos) {
/* 40 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 45 */     return 0;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   public VoxelShape m_5940_(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
/* 51 */     return m_49796_(6.0D, 11.0D, 6.0D, 10.0D, 16.0D, 10.0D);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/* 56 */     Item item = player.m_150109_().m_36056_().m_41720_(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/* 57 */       return (tieredItem.m_43314_().m_6604_() >= 0); }
/* 58 */      return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<ItemStack> m_7381_(BlockState state, LootContext.Builder builder) {
/* 63 */     List<ItemStack> dropsOriginal = super.m_7381_(state, builder);
/* 64 */     if (!dropsOriginal.isEmpty())
/* 65 */       return dropsOriginal; 
/* 66 */     return Collections.singletonList(new ItemStack((ItemLike)this, 1));
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_6861_(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, BlockPos fromPos, boolean moving) {
/* 71 */     super.m_6861_(blockstate, world, pos, neighborBlock, fromPos, moving);
/* 72 */     CeilinglightBlockIsPlacedByProcedure.execute((LevelAccessor)world, pos.m_123341_(), pos.m_123342_(), pos.m_123343_());
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_6402_(Level world, BlockPos pos, BlockState blockstate, LivingEntity entity, ItemStack itemstack) {
/* 77 */     super.m_6402_(world, pos, blockstate, entity, itemstack);
/* 78 */     CeilinglightBlockIsPlacedByProcedure.execute((LevelAccessor)world, pos.m_123341_(), pos.m_123342_(), pos.m_123343_());
/*    */   }
/*    */   
/*    */   @OnlyIn(Dist.CLIENT)
/*    */   public static void registerRenderLayer() {
/* 83 */     ItemBlockRenderTypes.setRenderLayer((Block)LatexModBlocks.CEILINGLIGHT.get(), renderType -> (renderType == RenderType.m_110463_()));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\block\CeilinglightBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */