/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ 
/*    */ public class TargethasabatonProcedure {
/*    */   public static boolean execute(Entity entity) {
/* 10 */     if (entity == null)
/* 11 */       return false; 
/* 12 */     boolean maskisweared = false;
/* 13 */     LivingEntity _livEnt = (LivingEntity)entity; return (((((entity instanceof LivingEntity) ? _livEnt.m_21205_() : ItemStack.f_41583_).m_41720_() == LatexModItems.BATON.get()) ? true : false) != true);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\TargethasabatonProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */