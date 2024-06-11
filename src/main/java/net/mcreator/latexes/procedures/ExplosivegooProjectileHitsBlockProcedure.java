/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModBlocks;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.Explosion;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class ExplosivegooProjectileHitsBlockProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 13 */     if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide())
/* 14 */         _level.explode(null, x, y, z, 1.0F, Explosion.BlockInteraction.NONE);  }
/* 15 */      if (world.getBlockState(new BlockPos(x, y + 1.0D, z)).getBlock() == Blocks.AIR || world
/* 16 */       .getBlockState(new BlockPos(x, y + 1.0D, z)).getBlock() == Blocks.VOID_AIR || world
/* 17 */       .getBlockState(new BlockPos(x, y + 1.0D, z)).getBlock() == Blocks.CAVE_AIR)
/* 18 */       world.setBlock(new BlockPos(x, y + 1.0D, z), ((Block)LatexModBlocks.DARKLATEXCARPET.get()).defaultBlockState(), 3); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\ExplosivegooProjectileHitsBlockProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */