/*   */ package net.mcreator.latexes.procedures;
/*   */ 
/*   */ import net.minecraft.world.item.ItemStack;
/*   */ 
/*   */ public class RevolvingGooCannonCanUseRangedItemProcedure {
/*   */   public static boolean execute(ItemStack itemstack) {
/* 7 */     return (itemstack.getOrCreateTag().getDouble("ammo") > 0.0D);
/*   */   }
/*   */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\RevolvingGooCannonCanUseRangedItemProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */