/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.ltxprogrammer.changed.init.ChangedBlocks;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class FlamethowerBulletHitsBlockProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 10 */     if (((world.m_8055_(new BlockPos(x, y - 1.0D, z)).m_60734_() == Blocks.f_50016_ || world
/* 11 */       .m_8055_(new BlockPos(x, y - 1.0D, z)).m_60734_() == Blocks.f_50626_ || world
/* 12 */       .m_8055_(new BlockPos(x, y - 1.0D, z)).m_60734_() == Blocks.f_50627_) ? true : false) != true && ((world
/* 13 */       .m_8055_(new BlockPos(x, y, z)).m_60734_() == Blocks.f_50016_ || world
/* 14 */       .m_8055_(new BlockPos(x, y, z)).m_60734_() == ChangedBlocks.DARK_LATEX_BLOCK.get() || world
/* 15 */       .m_8055_(new BlockPos(x, y, z)).m_60734_() == Blocks.f_50626_ || world
/* 16 */       .m_8055_(new BlockPos(x, y, z)).m_60734_() == Blocks.f_50627_) ? true : false) == true) {
/* 17 */       world.m_7731_(new BlockPos(x, y, z), Blocks.f_50083_.m_49966_(), 3);
/* 18 */     } else if (((world.m_8055_(new BlockPos(x, y + 1.0D, z)).m_60734_() == Blocks.f_50016_ || world
/* 19 */       .m_8055_(new BlockPos(x, y + 1.0D, z)).m_60734_() == Blocks.f_50626_ || world
/* 20 */       .m_8055_(new BlockPos(x, y + 1.0D, z)).m_60734_() == Blocks.f_50627_) ? true : false) == true) {
/* 21 */       world.m_7731_(new BlockPos(x, y + 1.0D, z), Blocks.f_50083_.m_49966_(), 3);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\FlamethowerBulletHitsBlockProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */