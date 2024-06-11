/*    */ package net.ltxprogrammer.turned.item;
/*    */ 
/*    */ import net.ltxprogrammer.turned.init.LatexModTabs;
/*    */ import net.ltxprogrammer.turned.procedures.RadioDroppodcallerRightClickedOnBlockProcedure;
/*    */ import net.minecraft.world.InteractionResult;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ import net.minecraft.world.item.UseAnim;
/*    */ import net.minecraft.world.item.context.UseOnContext;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class RadioDroppodcallerItem extends Item {
/*    */   public RadioDroppodcallerItem() {
/* 16 */     super((new Item.Properties()).m_41491_(LatexModTabs.TAB_LATEXITEMS).m_41487_(1).m_41497_(Rarity.UNCOMMON));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim m_6164_(ItemStack itemstack) {
/* 21 */     return UseAnim.EAT;
/*    */   }
/*    */ 
/*    */   
/*    */   public InteractionResult m_6225_(UseOnContext context) {
/* 26 */     InteractionResult retval = super.m_6225_(context);
/* 27 */     RadioDroppodcallerRightClickedOnBlockProcedure.execute((LevelAccessor)context.m_43725_(), context.m_8083_().m_123341_(), context.m_8083_().m_123342_(), context
/* 28 */         .m_8083_().m_123343_(), (Entity)context.m_43723_(), context.m_43722_());
/* 29 */     return retval;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\item\RadioDroppodcallerItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */