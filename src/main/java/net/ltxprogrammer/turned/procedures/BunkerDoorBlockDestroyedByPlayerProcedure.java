/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class BunkerDoorBlockDestroyedByPlayerProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/*  9 */     if (world.m_8055_(new BlockPos(x, y, z + 1.0D)).m_60734_() == Blocks.f_50375_ && world
/* 10 */       .m_8055_(new BlockPos(x, y, z - 1.0D)).m_60734_() == Blocks.f_50375_) {
/* 11 */       world.m_7731_(new BlockPos(x, y, z + 1.0D), Blocks.f_50016_.m_49966_(), 3);
/* 12 */       world.m_7731_(new BlockPos(x, y, z - 1.0D), Blocks.f_50016_.m_49966_(), 3);
/* 13 */       world.m_7731_(new BlockPos(x, y + 1.0D, z), Blocks.f_50016_.m_49966_(), 3);
/* 14 */       world.m_7731_(new BlockPos(x, y - 1.0D, z), Blocks.f_50016_.m_49966_(), 3);
/* 15 */       world.m_7731_(new BlockPos(x, y + 1.0D, z + 1.0D), Blocks.f_50016_.m_49966_(), 3);
/* 16 */       world.m_7731_(new BlockPos(x, y + 1.0D, z - 1.0D), Blocks.f_50016_.m_49966_(), 3);
/* 17 */       world.m_7731_(new BlockPos(x, y - 1.0D, z + 1.0D), Blocks.f_50016_.m_49966_(), 3);
/* 18 */       world.m_7731_(new BlockPos(x, y - 1.0D, z - 1.0D), Blocks.f_50016_.m_49966_(), 3);
/*    */     } else {
/* 20 */       world.m_7731_(new BlockPos(x + 1.0D, y, z), Blocks.f_50016_.m_49966_(), 3);
/* 21 */       world.m_7731_(new BlockPos(x - 1.0D, y, z), Blocks.f_50016_.m_49966_(), 3);
/* 22 */       world.m_7731_(new BlockPos(x, y + 1.0D, z), Blocks.f_50016_.m_49966_(), 3);
/* 23 */       world.m_7731_(new BlockPos(x, y - 1.0D, z), Blocks.f_50016_.m_49966_(), 3);
/* 24 */       world.m_7731_(new BlockPos(x + 1.0D, y + 1.0D, z), Blocks.f_50016_.m_49966_(), 3);
/* 25 */       world.m_7731_(new BlockPos(x - 1.0D, y + 1.0D, z), Blocks.f_50016_.m_49966_(), 3);
/* 26 */       world.m_7731_(new BlockPos(x + 1.0D, y - 1.0D, z), Blocks.f_50016_.m_49966_(), 3);
/* 27 */       world.m_7731_(new BlockPos(x - 1.0D, y - 1.0D, z), Blocks.f_50016_.m_49966_(), 3);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\BunkerDoorBlockDestroyedByPlayerProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */