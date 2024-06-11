/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EquipmentSlot;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ 
/*    */ public class TargetwearinghazmatProcedure {
/*    */   public static boolean execute(Entity entity) {
/* 11 */     if (entity == null)
/* 12 */       return false; 
/* 13 */     LivingEntity _entGetArmor = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _entGetArmor.m_6844_(EquipmentSlot.HEAD) : ItemStack.f_41583_)
/* 14 */       .m_41720_() == LatexModItems.HAZMAT_HELMET.get()) {
/* 15 */       LivingEntity livingEntity = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity.m_6844_(EquipmentSlot.CHEST) : ItemStack.f_41583_)
/* 16 */         .m_41720_() == LatexModItems.HAZMAT_CHESTPLATE.get()) {
/* 17 */         LivingEntity livingEntity1 = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity1.m_6844_(EquipmentSlot.LEGS) : ItemStack.f_41583_)
/* 18 */           .m_41720_() == LatexModItems.HAZMAT_LEGGINGS.get()) {
/* 19 */           LivingEntity livingEntity2 = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity2.m_6844_(EquipmentSlot.FEET) : ItemStack.f_41583_)
/* 20 */             .m_41720_() == LatexModItems.HAZMAT_BOOTS.get());
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\TargetwearinghazmatProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */