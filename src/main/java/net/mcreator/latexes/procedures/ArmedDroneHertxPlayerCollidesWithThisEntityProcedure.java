/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ 
/*    */ public class ArmedDroneHertxPlayerCollidesWithThisEntityProcedure {
/*    */   public static void execute(Entity entity) {
/*  9 */     if (entity == null)
/*    */       return; 
/* 11 */     if (Math.random() < 0.01D && 
/* 12 */       entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 13 */       _entity.hurt((new DamageSource("%1$s was killed by a Military Drone Hertx's rifle buttstock.")).bypassArmor(), 3.0F); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\ArmedDroneHertxPlayerCollidesWithThisEntityProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */