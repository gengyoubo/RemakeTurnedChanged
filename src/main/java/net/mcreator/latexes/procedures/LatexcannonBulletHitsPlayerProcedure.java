/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModMobEffects;
/*    */ import net.minecraft.world.effect.MobEffect;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.effect.MobEffects;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ 
/*    */ public class LatexcannonBulletHitsPlayerProcedure {
/*    */   public static void execute(Entity entity) {
/* 12 */     if (entity == null)
/*    */       return; 
/* 14 */     if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 15 */       _entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 80, 1, false, false)); }
/* 16 */      if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 17 */       _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 80, 1, false, false)); }
/* 18 */      if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 19 */       _entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 80, 1, false, false)); }
/* 20 */      if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 21 */       _entity.addEffect(new MobEffectInstance((MobEffect)LatexModMobEffects.DARKLATEXDARTEFFECT.get(), 80, 1, false, false)); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\LatexcannonBulletHitsPlayerProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */