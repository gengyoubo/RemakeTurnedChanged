/*    */ package net.ltxprogrammer.turned.block;
/*    */ 
/*    */ import java.util.Collections;
/*    */ import java.util.List;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.network.chat.TextComponent;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.TieredItem;
/*    */ import net.minecraft.world.item.TooltipFlag;
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
/*    */ public class RedLabStairsBlock extends StairBlock {
/*    */   public RedLabStairsBlock() {
/* 25 */     super(() -> Blocks.f_50016_.m_49966_(), 
/* 26 */         BlockBehaviour.Properties.m_60939_(Material.f_76278_).m_60918_(SoundType.f_56742_).m_60913_(1.0F, 10.0F).m_60999_().m_60988_());
/*    */   }
/*    */ 
/*    */   
/*    */   public float m_7325_() {
/* 31 */     return 10.0F;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_6724_(BlockState p_56947_) {
/* 36 */     return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_5871_(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
/* 41 */     super.m_5871_(itemstack, world, list, flag);
/* 42 */     list.add(new TextComponent("Variant C"));
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 47 */     return 0;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/* 52 */     Item item = player.m_150109_().m_36056_().m_41720_(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/* 53 */       return (tieredItem.m_43314_().m_6604_() >= 1); }
/* 54 */      return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<ItemStack> m_7381_(BlockState state, LootContext.Builder builder) {
/* 59 */     List<ItemStack> dropsOriginal = super.m_7381_(state, builder);
/* 60 */     if (!dropsOriginal.isEmpty())
/* 61 */       return dropsOriginal; 
/* 62 */     return Collections.singletonList(new ItemStack((ItemLike)this, 1));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\block\RedLabStairsBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */