/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.init.LatexModMobEffects;
/*    */ import net.minecraft.world.effect.MobEffect;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.effect.MobEffects;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ 
/*    */ public class LatexcannonBulletHitsPlayerProcedure {
/*    */   public static void execute(Entity entity) {
/* 11 */     if (entity == null)
/*    */       return; 
/* 13 */     if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 14 */       _entity.m_7292_(new MobEffectInstance(MobEffects.f_19599_, 80, 1, false, false)); }
/* 15 */      if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 16 */       _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 80, 1, false, false)); }
/* 17 */      if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 18 */       _entity.m_7292_(new MobEffectInstance(MobEffects.f_19613_, 80, 1, false, false)); }
/* 19 */      if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 20 */       _entity.m_7292_(new MobEffectInstance((MobEffect)LatexModMobEffects.DARKLATEXDARTEFFECT.get(), 80, 1, false, false)); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\LatexcannonBulletHitsPlayerProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */