/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.effect.MobEffects;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EquipmentSlot;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ 
/*    */ public class HertxengineerBootsTickEventProcedure
/*    */ {
/*    */   public static void execute(Entity entity) {
/* 14 */     if (entity == null)
/*    */       return; 
/* 16 */     LivingEntity _entGetArmor = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
/* 17 */       .getItem() == LatexModItems.HERTXENGINEER_BOOTS.get()) {
/* 18 */       LivingEntity livingEntity = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
/* 19 */         .getItem() == LatexModItems.HERTXENGINEER_LEGGINGS.get()) {
/* 20 */         if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 21 */           _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 5, 1, false, false)); }
/* 22 */          if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 23 */           _entity.addEffect(new MobEffectInstance(MobEffects.JUMP, 5, 1, false, false)); }  return;
/*    */       } 
/* 25 */     }  if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 26 */       _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 5, 1, false, false)); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\HertxengineerBootsTickEventProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */