/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModBlocks;
/*    */ import net.mcreator.latexes.init.LatexModGameRules;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class NoiseStalkerEntityDiesProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 12 */     if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXESLEAVEBLOCK) == true && (
/* 13 */       (world.getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.BEDROCK) ? true : false) != true)
/* 14 */       if (Math.random() < 0.5D) {
/* 15 */         world.setBlock(new BlockPos(x, y, z), ((Block)LatexModBlocks.DARKLATEXCARPET.get()).defaultBlockState(), 3);
/* 16 */       } else if (Math.random() < 0.2D && (
/* 17 */         (world.getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.AIR || world
/* 18 */         .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.CAVE_AIR || world
/* 19 */         .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.VOID_AIR) ? true : false) != true) {
/* 20 */         world.setBlock(new BlockPos(x, y - 1.0D, z), ((Block)LatexModBlocks.DARKLATEXCRYSTALEGG.get()).defaultBlockState(), 3);
/*    */       }  
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\NoiseStalkerEntityDiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */