/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.Explosion;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class HighPressureCylinderUpdateTickProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 11 */     if ((world.getBlockState(new BlockPos(x + 1.0D, y, z)).getBlock() == Blocks.FIRE || world
/* 12 */       .getBlockState(new BlockPos(x - 1.0D, y, z)).getBlock() == Blocks.FIRE || world
/* 13 */       .getBlockState(new BlockPos(x, y, z + 1.0D)).getBlock() == Blocks.FIRE || world
/* 14 */       .getBlockState(new BlockPos(x, y, z - 1.0D)).getBlock() == Blocks.FIRE) && 
/* 15 */       Math.random() < 0.1D && 
/* 16 */       world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide())
/* 17 */         _level.explode(null, x, y, z, 4.0F, Explosion.BlockInteraction.BREAK);  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\HighPressureCylinderUpdateTickProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */