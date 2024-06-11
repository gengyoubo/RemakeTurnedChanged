/*    */ package net.ltxprogrammer.turned.item;
/*    */ 
/*    */ import net.ltxprogrammer.turned.init.LatexModTabs;
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ import net.minecraft.world.item.UseAnim;
/*    */ 
/*    */ public class TSCpistolmagItem
/*    */   extends Item {
/*    */   public TSCpistolmagItem() {
/* 12 */     super((new Item.Properties()).m_41491_(LatexModTabs.TAB_LATEXITEMS).m_41487_(12).m_41497_(Rarity.COMMON));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim m_6164_(ItemStack itemstack) {
/* 17 */     return UseAnim.EAT;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\item\TSCpistolmagItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */