/*   */ package net.mcreator.latexes.procedures;
/*   */ 
/*   */ import net.minecraft.core.BlockPos;
/*   */ import net.minecraft.world.level.LevelAccessor;
/*   */ 
/*   */ public class CheckforskyProcedure {
/*   */   public static boolean execute(LevelAccessor world, double x, double y, double z) {
/* 8 */     return (world.canSeeSkyFromBelowWater(new BlockPos(x, y, z)) == true);
/*   */   }
/*   */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\CheckforskyProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */