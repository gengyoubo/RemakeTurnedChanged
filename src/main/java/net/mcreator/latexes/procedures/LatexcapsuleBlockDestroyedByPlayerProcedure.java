/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModBlocks;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ 
/*    */ public class LatexcapsuleBlockDestroyedByPlayerProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 10 */     if (Math.random() < 0.5D)
/* 11 */       world.setBlock(new BlockPos(x, y, z), ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState(), 3); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\LatexcapsuleBlockDestroyedByPlayerProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */