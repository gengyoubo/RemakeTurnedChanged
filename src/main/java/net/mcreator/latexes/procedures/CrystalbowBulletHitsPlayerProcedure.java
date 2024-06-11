/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModMobEffects;
/*    */ import net.minecraft.world.effect.MobEffect;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ 
/*    */ public class CrystalbowBulletHitsPlayerProcedure {
/*    */   public static void execute(Entity entity) {
/* 11 */     if (entity == null)
/*    */       return; 
/* 13 */     if (Math.random() < 0.7D && 
/* 14 */       entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 15 */       _entity.addEffect(new MobEffectInstance((MobEffect)LatexModMobEffects.DARKLATEXDARTEFFECT.get(), 60, 1, false, false)); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\CrystalbowBulletHitsPlayerProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */