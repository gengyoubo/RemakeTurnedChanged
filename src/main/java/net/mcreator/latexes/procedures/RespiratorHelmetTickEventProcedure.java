/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.minecraft.world.effect.MobEffects;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ 
/*    */ public class RespiratorHelmetTickEventProcedure {
/*    */   public static void execute(Entity entity) {
/*  9 */     if (entity == null)
/*    */       return; 
/* 11 */     if (entity instanceof LivingEntity) { LivingEntity _livEnt = (LivingEntity)entity; if (_livEnt.hasEffect(MobEffects.CONFUSION))
/*    */       
/*    */       { 
/*    */         
/* 15 */         if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 16 */           _entity.removeEffect(MobEffects.CONFUSION); }
/* 17 */          if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 18 */           _entity.removeEffect(MobEffects.POISON); }
/* 19 */          if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 20 */           _entity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN); }
/* 21 */          if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 22 */           _entity.removeEffect(MobEffects.WEAKNESS); }  return; }  }  if (entity instanceof LivingEntity) { LivingEntity _livEnt = (LivingEntity)entity; if (_livEnt.hasEffect(MobEffects.POISON)) { if (entity instanceof LivingEntity) { LivingEntity livingEntity = (LivingEntity)entity; livingEntity.removeEffect(MobEffects.CONFUSION); }  if (entity instanceof LivingEntity) { LivingEntity livingEntity = (LivingEntity)entity; livingEntity.removeEffect(MobEffects.POISON); }  if (entity instanceof LivingEntity) { LivingEntity livingEntity = (LivingEntity)entity; livingEntity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN); }  if (entity instanceof LivingEntity) { LivingEntity livingEntity = (LivingEntity)entity; livingEntity.removeEffect(MobEffects.WEAKNESS); }  return; }  }  if (entity instanceof LivingEntity) { LivingEntity _livEnt = (LivingEntity)entity; if (_livEnt.hasEffect(MobEffects.MOVEMENT_SLOWDOWN)) { if (entity instanceof LivingEntity) { LivingEntity livingEntity = (LivingEntity)entity; livingEntity.removeEffect(MobEffects.CONFUSION); }  if (entity instanceof LivingEntity) { LivingEntity livingEntity = (LivingEntity)entity; livingEntity.removeEffect(MobEffects.POISON); }  if (entity instanceof LivingEntity) { LivingEntity livingEntity = (LivingEntity)entity; livingEntity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN); }  if (entity instanceof LivingEntity) { LivingEntity livingEntity = (LivingEntity)entity; livingEntity.removeEffect(MobEffects.WEAKNESS); }  return; }  }  if (entity instanceof LivingEntity) { LivingEntity _livEnt = (LivingEntity)entity; if (_livEnt.hasEffect(MobEffects.WEAKNESS)) { if (entity instanceof LivingEntity) { LivingEntity livingEntity = (LivingEntity)entity; livingEntity.removeEffect(MobEffects.CONFUSION); }  if (entity instanceof LivingEntity) { LivingEntity livingEntity = (LivingEntity)entity; livingEntity.removeEffect(MobEffects.POISON); }  if (entity instanceof LivingEntity) { LivingEntity livingEntity = (LivingEntity)entity; livingEntity.removeEffect(MobEffects.MOVEMENT_SLOWDOWN); }  if (entity instanceof LivingEntity) { LivingEntity livingEntity = (LivingEntity)entity; livingEntity.removeEffect(MobEffects.WEAKNESS); }
/*    */         
/*    */         return; }
/*    */        }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\RespiratorHelmetTickEventProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */