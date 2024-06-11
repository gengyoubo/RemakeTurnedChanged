/*    */ package net.ltxprogrammer.turned.item;
/*    */ 
/*    */ import net.ltxprogrammer.turned.init.LatexModTabs;
/*    */ import net.ltxprogrammer.turned.procedures.TabletRightClickedInAirProcedure;
/*    */ import net.minecraft.world.InteractionHand;
/*    */ import net.minecraft.world.InteractionResultHolder;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ import net.minecraft.world.item.UseAnim;
/*    */ import net.minecraft.world.level.Level;
/*    */ 
/*    */ public class TabletItem
/*    */   extends Item {
/*    */   public TabletItem() {
/* 18 */     super((new Item.Properties()).m_41491_(LatexModTabs.TAB_LATEXITEMS).m_41487_(1).m_41497_(Rarity.COMMON));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim m_6164_(ItemStack itemstack) {
/* 23 */     return UseAnim.EAT;
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResultHolder<ItemStack> m_7203_(Level world, Player entity, InteractionHand hand) {
/* 28 */     InteractionResultHolder<ItemStack> ar = super.m_7203_(world, entity, hand);
/* 29 */     ItemStack itemstack = (ItemStack)ar.m_19095_();
/* 30 */     double x = entity.m_20185_();
/* 31 */     double y = entity.m_20186_();
/* 32 */     double z = entity.m_20189_();
/*    */     
/* 34 */     TabletRightClickedInAirProcedure.execute((Entity)entity);
/* 35 */     return ar;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\item\TabletItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */