/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModBlocks;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class DarklatexblockcrystalgrowUpdateTickProcedure {
/*    */   public static boolean execute(LevelAccessor world, double x, double y, double z) {
/* 11 */     if (Math.random() < 0.3D && (
/* 12 */       (world.getBlockState(new BlockPos(x, y + 1.0D, z)).getBlock() == Blocks.AIR || world
/* 13 */       .getBlockState(new BlockPos(x, y + 1.0D, z)).getBlock() == Blocks.VOID_AIR || world
/* 14 */       .getBlockState(new BlockPos(x, y + 1.0D, z)).getBlock() == Blocks.CAVE_AIR) ? true : false) == true) {
/* 15 */       if (world.getBlockState(new BlockPos(x, y + 1.0D, z)).getBlock() == LatexModBlocks.DARKLATEXCRYSTALEGG.get()) {
/* 16 */         return true;
/*    */       }
/* 18 */       world.setBlock(new BlockPos(x, y + 1.0D, z), ((Block)LatexModBlocks.DARKLATEXCRYSTALEGG.get()).defaultBlockState(), 3);
/*    */     } 
/*    */ 
/*    */     
/* 22 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarklatexblockcrystalgrowUpdateTickProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */