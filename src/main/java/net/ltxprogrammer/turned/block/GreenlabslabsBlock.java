/*    */ package net.ltxprogrammer.turned.block;
/*    */ 
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.BlockGetter;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.block.SlabBlock;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ import net.minecraft.world.level.block.state.properties.SlabType;
/*    */ import net.minecraft.world.level.material.Material;
/*    */ import net.minecraft.world.level.storage.loot.LootContext;
/*    */ 
/*    */ public class GreenlabslabsBlock extends SlabBlock {
/*    */   public GreenlabslabsBlock() {
/* 20 */     super(BlockBehaviour.Properties.m_60939_(Material.f_76278_).m_60918_(SoundType.f_56742_).m_60913_(1.2F, 12.5F).m_60911_(0.5F));
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 25 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<ItemStack> m_7381_(BlockState state, LootContext.Builder builder) {
/* 30 */     List<ItemStack> dropsOriginal = super.m_7381_(state, builder);
/* 31 */     if (!dropsOriginal.isEmpty())
/* 32 */       return dropsOriginal; 
/* 33 */     return Collections.singletonList(new ItemStack((ItemLike)this, (state.m_61143_((Property)f_56353_) == SlabType.DOUBLE) ? 2 : 1));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\block\GreenlabslabsBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */