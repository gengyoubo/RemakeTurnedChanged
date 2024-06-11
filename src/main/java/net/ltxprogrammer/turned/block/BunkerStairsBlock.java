/*    */ package net.ltxprogrammer.turned.block;
/*    */ 
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.StairBlock;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.material.Material;
/*    */ import net.minecraft.world.level.storage.loot.LootContext;
/*    */ 
/*    */ public class BunkerStairsBlock
/*    */   extends StairBlock {
/*    */   public BunkerStairsBlock() {
/* 20 */     super(() -> Blocks.f_50016_.m_49966_(), 
/* 21 */         BlockBehaviour.Properties.m_60939_(Material.f_76278_).m_60918_(SoundType.f_56742_).m_60913_(5.0F, 25.0F).m_60988_());
/*    */   }
/*    */ 
/*    */   
/*    */   public float m_7325_() {
/* 26 */     return 25.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_6724_(BlockState p_56947_) {
/* 31 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 36 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<ItemStack> m_7381_(BlockState state, LootContext.Builder builder) {
/* 41 */     List<ItemStack> dropsOriginal = super.m_7381_(state, builder);
/* 42 */     if (!dropsOriginal.isEmpty())
/* 43 */       return dropsOriginal; 
/* 44 */     return Collections.singletonList(new ItemStack((ItemLike)this, 1));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\block\BunkerStairsBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */