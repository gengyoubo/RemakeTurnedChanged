/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class LabDoorBlockDestroyedByExplosionProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/*  9 */     if (Blocks.BARRIER == world.getBlockState(new BlockPos(x - 1.0D, y, z)).getBlock()) {
/* 10 */       world.setBlock(new BlockPos(x - 1.0D, y, z), Blocks.AIR.defaultBlockState(), 3);
/*    */     }
/* 12 */     if (Blocks.BARRIER == world.getBlockState(new BlockPos(x + 1.0D, y, z)).getBlock()) {
/* 13 */       world.setBlock(new BlockPos(x + 1.0D, y, z), Blocks.AIR.defaultBlockState(), 3);
/*    */     }
/* 15 */     if (Blocks.BARRIER == world.getBlockState(new BlockPos(x + 1.0D, y + 1.0D, z)).getBlock()) {
/* 16 */       world.setBlock(new BlockPos(x + 1.0D, y + 1.0D, z), Blocks.AIR.defaultBlockState(), 3);
/*    */     }
/* 18 */     if (Blocks.BARRIER == world.getBlockState(new BlockPos(x - 1.0D, y + 1.0D, z)).getBlock()) {
/* 19 */       world.setBlock(new BlockPos(x - 1.0D, y + 1.0D, z), Blocks.AIR.defaultBlockState(), 3);
/*    */     }
/* 21 */     if (Blocks.BARRIER == world.getBlockState(new BlockPos(x, y + 1.0D, z)).getBlock()) {
/* 22 */       world.setBlock(new BlockPos(x, y + 1.0D, z), Blocks.AIR.defaultBlockState(), 3);
/*    */     }
/* 24 */     if (Blocks.BARRIER == world.getBlockState(new BlockPos(x, y + 1.0D, z - 1.0D)).getBlock()) {
/* 25 */       world.setBlock(new BlockPos(x, y + 1.0D, z - 1.0D), Blocks.AIR.defaultBlockState(), 3);
/*    */     }
/* 27 */     if (Blocks.BARRIER == world.getBlockState(new BlockPos(x, y + 1.0D, z + 1.0D)).getBlock()) {
/* 28 */       world.setBlock(new BlockPos(x, y + 1.0D, z + 1.0D), Blocks.AIR.defaultBlockState(), 3);
/*    */     }
/* 30 */     if (Blocks.BARRIER == world.getBlockState(new BlockPos(x, y, z - 1.0D)).getBlock()) {
/* 31 */       world.setBlock(new BlockPos(x, y, z - 1.0D), Blocks.AIR.defaultBlockState(), 3);
/*    */     }
/* 33 */     if (Blocks.BARRIER == world.getBlockState(new BlockPos(x, y, z + 1.0D)).getBlock())
/* 34 */       world.setBlock(new BlockPos(x, y, z + 1.0D), Blocks.AIR.defaultBlockState(), 3); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\LabDoorBlockDestroyedByExplosionProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */