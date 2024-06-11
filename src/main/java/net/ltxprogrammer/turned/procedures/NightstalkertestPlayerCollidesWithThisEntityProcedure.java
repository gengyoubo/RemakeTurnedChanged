/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.effect.MobEffects;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ 
/*    */ public class NightstalkertestPlayerCollidesWithThisEntityProcedure {
/*    */   public static void execute(Entity entity) {
/* 10 */     if (entity == null)
/*    */       return; 
/* 12 */     if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 13 */       _entity.m_7292_(new MobEffectInstance(MobEffects.f_19610_, 50, 1, false, false)); }
/* 14 */      if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 15 */       _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 80, 1, false, false)); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\NightstalkertestPlayerCollidesWithThisEntityProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */