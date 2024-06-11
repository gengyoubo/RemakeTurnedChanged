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
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.SoundType;
/*    */ import net.minecraft.world.level.block.state.BlockBehaviour;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.material.Material;
/*    */ import net.minecraft.world.level.storage.loot.LootContext;
/*    */ 
/*    */ public class ReinforcedpurpleconcreteBlock extends Block {
/*    */   public ReinforcedpurpleconcreteBlock() {
/* 24 */     super(BlockBehaviour.Properties.m_60939_(Material.f_76278_).m_60918_(SoundType.f_56742_).m_60913_(2.2F, 22.0F).m_60999_());
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_5871_(ItemStack itemstack, BlockGetter world, List<Component> list, TooltipFlag flag) {
/* 29 */     super.m_5871_(itemstack, world, list, flag);
/* 30 */     list.add(new TextComponent("Purple"));
/*    */   }
/*    */ 
/*    */   
/*    */   public int m_7753_(BlockState state, BlockGetter worldIn, BlockPos pos) {
/* 35 */     return 15;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
/* 40 */     Item item = player.m_150109_().m_36056_().m_41720_(); if (item instanceof TieredItem) { TieredItem tieredItem = (TieredItem)item;
/* 41 */       return (tieredItem.m_43314_().m_6604_() >= 2); }
/* 42 */      return false;
/*    */   }
/*    */ 
/*    */   
/*    */   public List<ItemStack> m_7381_(BlockState state, LootContext.Builder builder) {
/* 47 */     List<ItemStack> dropsOriginal = super.m_7381_(state, builder);
/* 48 */     if (!dropsOriginal.isEmpty())
/* 49 */       return dropsOriginal; 
/* 50 */     return Collections.singletonList(new ItemStack((ItemLike)this, 1));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\block\ReinforcedpurpleconcreteBlock.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */