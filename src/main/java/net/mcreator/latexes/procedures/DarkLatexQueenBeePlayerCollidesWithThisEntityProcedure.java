/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.effect.MobEffects;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ 
/*    */ public class DarkLatexQueenBeePlayerCollidesWithThisEntityProcedure {
/*    */   public static void execute(Entity entity) {
/* 10 */     if (entity == null)
/*    */       return; 
/* 12 */     if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 13 */       _entity.addEffect(new MobEffectInstance(MobEffects.POISON, 80, 1, false, false)); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarkLatexQueenBeePlayerCollidesWithThisEntityProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */