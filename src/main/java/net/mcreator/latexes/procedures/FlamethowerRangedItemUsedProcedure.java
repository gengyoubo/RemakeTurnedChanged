/*   */ package net.mcreator.latexes.procedures;
/*   */ 
/*   */ import net.minecraft.world.item.ItemStack;
/*   */ 
/*   */ public class FlamethowerRangedItemUsedProcedure {
/*   */   public static void execute(ItemStack itemstack) {
/* 7 */     if (itemstack.getOrCreateTag().getDouble("ammo") >= 1.0D)
/* 8 */       itemstack.getOrCreateTag().putDouble("ammo", itemstack.getOrCreateTag().getDouble("ammo") - 1.0D); 
/*   */   }
/*   */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\FlamethowerRangedItemUsedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */