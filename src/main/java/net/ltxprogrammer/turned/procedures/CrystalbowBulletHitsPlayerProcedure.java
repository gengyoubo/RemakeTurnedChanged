/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.init.LatexModMobEffects;
/*    */ import net.minecraft.world.effect.MobEffect;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ 
/*    */ public class CrystalbowBulletHitsPlayerProcedure {
/*    */   public static void execute(Entity entity) {
/* 10 */     if (entity == null)
/*    */       return; 
/* 12 */     if (Math.random() < 0.7D && 
/* 13 */       entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 14 */       _entity.m_7292_(new MobEffectInstance((MobEffect)LatexModMobEffects.DARKLATEXDARTEFFECT.get(), 60, 1, false, false)); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\CrystalbowBulletHitsPlayerProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */