/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class BunkerDoorBlockDestroyedByPlayerProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/*  9 */     if (world.getBlockState(new BlockPos(x, y, z + 1.0D)).getBlock() == Blocks.BARRIER && world
/* 10 */       .getBlockState(new BlockPos(x, y, z - 1.0D)).getBlock() == Blocks.BARRIER) {
/* 11 */       world.setBlock(new BlockPos(x, y, z + 1.0D), Blocks.AIR.defaultBlockState(), 3);
/* 12 */       world.setBlock(new BlockPos(x, y, z - 1.0D), Blocks.AIR.defaultBlockState(), 3);
/* 13 */       world.setBlock(new BlockPos(x, y + 1.0D, z), Blocks.AIR.defaultBlockState(), 3);
/* 14 */       world.setBlock(new BlockPos(x, y - 1.0D, z), Blocks.AIR.defaultBlockState(), 3);
/* 15 */       world.setBlock(new BlockPos(x, y + 1.0D, z + 1.0D), Blocks.AIR.defaultBlockState(), 3);
/* 16 */       world.setBlock(new BlockPos(x, y + 1.0D, z - 1.0D), Blocks.AIR.defaultBlockState(), 3);
/* 17 */       world.setBlock(new BlockPos(x, y - 1.0D, z + 1.0D), Blocks.AIR.defaultBlockState(), 3);
/* 18 */       world.setBlock(new BlockPos(x, y - 1.0D, z - 1.0D), Blocks.AIR.defaultBlockState(), 3);
/*    */     } else {
/* 20 */       world.setBlock(new BlockPos(x + 1.0D, y, z), Blocks.AIR.defaultBlockState(), 3);
/* 21 */       world.setBlock(new BlockPos(x - 1.0D, y, z), Blocks.AIR.defaultBlockState(), 3);
/* 22 */       world.setBlock(new BlockPos(x, y + 1.0D, z), Blocks.AIR.defaultBlockState(), 3);
/* 23 */       world.setBlock(new BlockPos(x, y - 1.0D, z), Blocks.AIR.defaultBlockState(), 3);
/* 24 */       world.setBlock(new BlockPos(x + 1.0D, y + 1.0D, z), Blocks.AIR.defaultBlockState(), 3);
/* 25 */       world.setBlock(new BlockPos(x - 1.0D, y + 1.0D, z), Blocks.AIR.defaultBlockState(), 3);
/* 26 */       world.setBlock(new BlockPos(x + 1.0D, y - 1.0D, z), Blocks.AIR.defaultBlockState(), 3);
/* 27 */       world.setBlock(new BlockPos(x - 1.0D, y - 1.0D, z), Blocks.AIR.defaultBlockState(), 3);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\BunkerDoorBlockDestroyedByPlayerProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */