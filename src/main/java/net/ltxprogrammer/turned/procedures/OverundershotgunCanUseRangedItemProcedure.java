/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ 
/*    */ public class OverundershotgunCanUseRangedItemProcedure {
/*    */   public static boolean execute(Entity entity, ItemStack itemstack) {
/* 10 */     if (entity == null) {
/* 11 */       return false;
/*    */     }
/* 13 */     if (itemstack.m_41784_().m_128459_("ammo") > 0.0D) { LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.m_21205_() : ItemStack.f_41583_).m_41720_() == LatexModItems.OVERUNDERSHOTGUN
/* 14 */         .get()); }
/*    */     
/*    */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\OverundershotgunCanUseRangedItemProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */