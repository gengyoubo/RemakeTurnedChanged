/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.init.LatexModMobEffects;
/*    */ import net.minecraft.world.effect.MobEffect;
/*    */ import net.minecraft.world.effect.MobEffects;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ 
/*    */ public class DarklatexdarteffectPotionExpiresProcedure {
/*    */   public static void execute(Entity entity) {
/* 10 */     if (entity == null)
/*    */       return; 
/* 12 */     if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 13 */       _entity.m_21195_((MobEffect)LatexModMobEffects.DARKLATEXDARTEFFECT.get()); }
/* 14 */      if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 15 */       _entity.m_21195_(MobEffects.f_19597_); }
/* 16 */      if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 17 */       _entity.m_21195_(MobEffects.f_19599_); }
/* 18 */      if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 19 */       _entity.m_21195_(MobEffects.f_19613_); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DarklatexdarteffectPotionExpiresProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */