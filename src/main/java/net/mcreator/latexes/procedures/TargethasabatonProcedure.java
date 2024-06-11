/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ 
/*    */ public class TargethasabatonProcedure
/*    */ {
/*    */   public static boolean execute(Entity entity) {
/* 11 */     if (entity == null)
/* 12 */       return false; 
/* 13 */     boolean maskisweared = false;
/* 14 */     LivingEntity _livEnt = (LivingEntity)entity; if (((((entity instanceof LivingEntity) ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.BATON.get()) ? true : false) != true) {
/* 15 */       return true;
/*    */     }
/* 17 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\TargethasabatonProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */