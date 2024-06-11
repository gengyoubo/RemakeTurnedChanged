/*    */ package net.ltxprogrammer.turned.procedures;
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
/* 13 */       _entity.m_6469_((new DamageSource("%1$s was killed by a Military Drone Hertx's rifle buttstock.")).m_19380_(), 3.0F); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\ArmedDroneHertxPlayerCollidesWithThisEntityProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */