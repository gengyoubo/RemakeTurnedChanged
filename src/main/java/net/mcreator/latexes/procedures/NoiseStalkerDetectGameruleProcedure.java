/*   */ package net.mcreator.latexes.procedures;
/*   */ 
/*   */ import net.mcreator.latexes.init.LatexModGameRules;
/*   */ import net.minecraft.world.level.LevelAccessor;
/*   */ 
/*   */ public class NoiseStalkerDetectGameruleProcedure
/*   */ {
/*   */   public static boolean execute(LevelAccessor world) {
/* 9 */     return world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXBREAKBLOCKS);
/*   */   }
/*   */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\NoiseStalkerDetectGameruleProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */