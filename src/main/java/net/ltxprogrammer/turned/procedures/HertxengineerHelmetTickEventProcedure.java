/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.effect.MobEffects;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EquipmentSlot;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ 
/*    */ public class HertxengineerHelmetTickEventProcedure {
/*    */   public static void execute(Entity entity) {
/* 13 */     if (entity == null)
/*    */       return; 
/* 15 */     LivingEntity _entGetArmor = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _entGetArmor.m_6844_(EquipmentSlot.HEAD) : ItemStack.f_41583_)
/* 16 */       .m_41720_() == LatexModItems.HERTXENGINEER_HELMET.get()) {
/* 17 */       LivingEntity livingEntity = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity.m_6844_(EquipmentSlot.LEGS) : ItemStack.f_41583_)
/* 18 */         .m_41720_() == LatexModItems.HERTXENGINEER_LEGGINGS.get()) {
/* 19 */         if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 20 */           _entity.m_7292_(new MobEffectInstance(MobEffects.f_19608_, 5, 1, false, false)); }
/* 21 */          if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 22 */           _entity.m_7292_(new MobEffectInstance(MobEffects.f_19611_, 5, 1, false, false)); }  return;
/*    */       } 
/* 24 */     }  if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 25 */       _entity.m_7292_(new MobEffectInstance(MobEffects.f_19610_, 5, 1, false, false)); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\HertxengineerHelmetTickEventProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */