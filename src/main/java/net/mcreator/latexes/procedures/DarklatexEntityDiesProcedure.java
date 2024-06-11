/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModBlocks;
/*    */ import net.mcreator.latexes.init.LatexModGameRules;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class DarklatexEntityDiesProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 13 */     if (entity == null)
/*    */       return; 
/* 15 */     boolean found = false;
/* 16 */     double sx = 0.0D;
/* 17 */     double sy = 0.0D;
/* 18 */     double sz = 0.0D;
/* 19 */     if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXESLEAVEBLOCK) == true && (
/* 20 */       (world.getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.BEDROCK) ? true : false) != true && (
/* 21 */       world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.CAVE_AIR || world
/* 22 */       .getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.VOID_AIR || world
/* 23 */       .getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.AIR) && 
/* 24 */       Math.random() < 0.72D && 
/* 25 */       !entity.isOnFire())
/* 26 */       world.setBlock(new BlockPos(x, y, z), ((Block)LatexModBlocks.DARKLATEXCARPET.get()).defaultBlockState(), 3); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarklatexEntityDiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */