/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ 
/*    */ public class OverundershotgunCanUseRangedItemProcedure
/*    */ {
/*    */   public static boolean execute(Entity entity, ItemStack itemstack) {
/* 11 */     if (entity == null) {
/* 12 */       return false;
/*    */     }
/* 14 */     if (itemstack.getOrCreateTag().getDouble("ammo") > 0.0D) { LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.OVERUNDERSHOTGUN
/* 15 */         .get()); }
/*    */     
/*    */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\OverundershotgunCanUseRangedItemProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */