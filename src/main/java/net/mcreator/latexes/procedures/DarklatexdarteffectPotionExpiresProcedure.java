/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModMobEffects;
/*    */ import net.minecraft.world.effect.MobEffect;
/*    */ import net.minecraft.world.effect.MobEffects;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ 
/*    */ public class DarklatexdarteffectPotionExpiresProcedure {
/*    */   public static void execute(Entity entity) {
/* 11 */     if (entity == null)
/*    */       return; 
/* 13 */     if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 14 */       _entity.removeEffect((MobEffect)LatexModMobEffects.DARKLATEXDARTEFFECT.get()); }
/* 15 */      if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 16 */       _entity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN); }
/* 17 */      if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 18 */       _entity.removeEffect(MobEffects.DIG_SLOWDOWN); }
/* 19 */      if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 20 */       _entity.removeEffect(MobEffects.WEAKNESS); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarklatexdarteffectPotionExpiresProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */