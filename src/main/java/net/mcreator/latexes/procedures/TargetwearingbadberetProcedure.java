/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EquipmentSlot;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ 
/*    */ public class TargetwearingbadberetProcedure
/*    */ {
/*    */   public static boolean execute(Entity entity) {
/* 13 */     if (entity == null)
/* 14 */       return false; 
/* 15 */     boolean maskisweared = false;
/* 16 */     Mob _mobEnt = (Mob)entity; LivingEntity livingEntity1 = (entity instanceof Mob) ? _mobEnt.getTarget() : null, _entGetArmor = livingEntity1;
/*    */     
/* 18 */     if (((((livingEntity1 instanceof LivingEntity) ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == LatexModItems.EVIL_BERET_HELMET.get()) ? true : false) != true) {
/* 19 */       return true;
/*    */     }
/* 21 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\TargetwearingbadberetProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */