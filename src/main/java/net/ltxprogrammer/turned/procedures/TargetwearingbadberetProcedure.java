/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EquipmentSlot;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ 
/*    */ public class TargetwearingbadberetProcedure {
/*    */   public static boolean execute(Entity entity) {
/* 12 */     if (entity == null)
/* 13 */       return false; 
/* 14 */     boolean maskisweared = false;
/* 15 */     Mob _mobEnt = (Mob)entity; LivingEntity livingEntity1 = (entity instanceof Mob) ? _mobEnt.m_5448_() : null, _entGetArmor = livingEntity1; return 
/*    */       
/* 17 */       (((((livingEntity1 instanceof LivingEntity) ? _entGetArmor.m_6844_(EquipmentSlot.HEAD) : ItemStack.f_41583_).m_41720_() == LatexModItems.EVIL_BERET_HELMET.get()) ? true : false) != true);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\TargetwearingbadberetProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */