/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.minecraft.world.level.Explosion;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class DROPPODEntityDiesProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/*  9 */     if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide())
/* 10 */         _level.explode(null, x, y, z, 5.0F, Explosion.BlockInteraction.BREAK);  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DROPPODEntityDiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */