/*    */ package net.ltxprogrammer.turned.item;
/*    */ 
/*    */ import net.minecraft.world.item.Item;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Rarity;
/*    */ import net.minecraft.world.item.UseAnim;
/*    */ 
/*    */ public class PhoneItem
/*    */   extends Item {
/*    */   public PhoneItem() {
/* 11 */     super((new Item.Properties()).m_41491_(null).m_41487_(1).m_41497_(Rarity.COMMON));
/*    */   }
/*    */ 
/*    */   
/*    */   public UseAnim m_6164_(ItemStack itemstack) {
/* 16 */     return UseAnim.EAT;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\item\PhoneItem.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */