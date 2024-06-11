/*   */ package net.ltxprogrammer.turned.procedures;
/*   */ 
/*   */ import net.minecraft.world.item.ItemStack;
/*   */ 
/*   */ public class FlamethowerRangedItemUsedProcedure {
/*   */   public static void execute(ItemStack itemstack) {
/* 7 */     if (itemstack.m_41784_().m_128459_("ammo") >= 1.0D)
/* 8 */       itemstack.m_41784_().m_128347_("ammo", itemstack.m_41784_().m_128459_("ammo") - 1.0D); 
/*   */   }
/*   */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\FlamethowerRangedItemUsedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */