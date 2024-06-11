/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModBlocks;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class FlamethowerBulletHitsBlockProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 11 */     if (((world.getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.AIR || world
/* 12 */       .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.VOID_AIR || world
/* 13 */       .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.CAVE_AIR) ? true : false) != true && ((world
/* 14 */       .getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.AIR || world
/* 15 */       .getBlockState(new BlockPos(x, y, z)).getBlock() == LatexModBlocks.DARKLATEXBLOCK.get() || world
/* 16 */       .getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.VOID_AIR || world
/* 17 */       .getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.CAVE_AIR) ? true : false) == true) {
/* 18 */       world.setBlock(new BlockPos(x, y, z), Blocks.FIRE.defaultBlockState(), 3);
/* 19 */     } else if (((world.getBlockState(new BlockPos(x, y + 1.0D, z)).getBlock() == Blocks.AIR || world
/* 20 */       .getBlockState(new BlockPos(x, y + 1.0D, z)).getBlock() == Blocks.VOID_AIR || world
/* 21 */       .getBlockState(new BlockPos(x, y + 1.0D, z)).getBlock() == Blocks.CAVE_AIR) ? true : false) == true) {
/* 22 */       world.setBlock(new BlockPos(x, y + 1.0D, z), Blocks.FIRE.defaultBlockState(), 3);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\FlamethowerBulletHitsBlockProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */