/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.ltxprogrammer.changed.entity.variant.LatexVariant;
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ 
/*    */ public class DarkLatexCakePlayerCollidesWithThisEntityProcedure
/*    */ {
/*    */   public static void execute(Entity entity, Entity sourceentity) {
/* 11 */     if (entity == null || sourceentity == null)
/*    */       return; 
/* 13 */     if (Math.random() < 0.4D) {
/* 14 */       if (sourceentity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)sourceentity;
/* 15 */         _entity.m_6469_((new DamageSource("%1$s was absorbed by Dark Latex Cake Monster")).m_19380_(), 2.0F); }
/* 16 */        if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 17 */         if (LatexVariant.getEntityVariant(_entity) == null && 
/* 18 */           LatexVariant.getEntityTransfur(_entity) == null) {
/* 19 */           LivingEntity _livEnt = (LivingEntity)entity; _entity.m_21153_(((entity instanceof LivingEntity) ? _livEnt.m_21223_() : -1.0F) + 2.0F);
/*    */         }  }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DarkLatexCakePlayerCollidesWithThisEntityProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */