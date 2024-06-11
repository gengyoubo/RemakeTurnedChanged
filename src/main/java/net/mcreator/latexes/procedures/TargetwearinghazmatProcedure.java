/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EquipmentSlot;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ 
/*    */ public class TargetwearinghazmatProcedure
/*    */ {
/*    */   public static boolean execute(Entity entity) {
/* 12 */     if (entity == null)
/* 13 */       return false; 
/* 14 */     LivingEntity _entGetArmor = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY)
/* 15 */       .getItem() == LatexModItems.HAZMAT_HELMET.get()) {
/* 16 */       LivingEntity livingEntity = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY)
/* 17 */         .getItem() == LatexModItems.HAZMAT_CHESTPLATE.get()) {
/* 18 */         LivingEntity livingEntity1 = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity1.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY)
/* 19 */           .getItem() == LatexModItems.HAZMAT_LEGGINGS.get())
/* 20 */         { LivingEntity livingEntity2 = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? livingEntity2.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY)
/* 21 */             .getItem() == LatexModItems.HAZMAT_BOOTS.get())
/* 22 */             return true;  } 
/*    */       } 
/* 24 */     }  return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\TargetwearinghazmatProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */