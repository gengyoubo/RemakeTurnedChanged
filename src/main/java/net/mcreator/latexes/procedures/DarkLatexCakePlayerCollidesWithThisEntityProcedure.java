/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ 
/*    */ public class DarkLatexCakePlayerCollidesWithThisEntityProcedure {
/*    */   public static void execute(Entity entity, Entity sourceentity) {
/*  9 */     if (entity == null || sourceentity == null)
/*    */       return; 
/* 11 */     if (Math.random() < 0.4D) {
/* 12 */       if (sourceentity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)sourceentity;
/* 13 */         _entity.hurt((new DamageSource("%1$s was absorbed by Dark Latex Cake Monster")).bypassArmor(), 2.0F); }
/* 14 */        if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 15 */         LivingEntity _livEnt = (LivingEntity)entity; _entity.setHealth(((entity instanceof LivingEntity) ? _livEnt.getHealth() : -1.0F) + 2.0F); }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarkLatexCakePlayerCollidesWithThisEntityProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */