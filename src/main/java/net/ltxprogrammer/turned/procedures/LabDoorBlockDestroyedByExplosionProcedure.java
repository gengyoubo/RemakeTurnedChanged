/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class LabDoorBlockDestroyedByExplosionProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/*  9 */     if (Blocks.f_50375_ == world.m_8055_(new BlockPos(x - 1.0D, y, z)).m_60734_()) {
/* 10 */       world.m_7731_(new BlockPos(x - 1.0D, y, z), Blocks.f_50016_.m_49966_(), 3);
/*    */     }
/* 12 */     if (Blocks.f_50375_ == world.m_8055_(new BlockPos(x + 1.0D, y, z)).m_60734_()) {
/* 13 */       world.m_7731_(new BlockPos(x + 1.0D, y, z), Blocks.f_50016_.m_49966_(), 3);
/*    */     }
/* 15 */     if (Blocks.f_50375_ == world.m_8055_(new BlockPos(x + 1.0D, y + 1.0D, z)).m_60734_()) {
/* 16 */       world.m_7731_(new BlockPos(x + 1.0D, y + 1.0D, z), Blocks.f_50016_.m_49966_(), 3);
/*    */     }
/* 18 */     if (Blocks.f_50375_ == world.m_8055_(new BlockPos(x - 1.0D, y + 1.0D, z)).m_60734_()) {
/* 19 */       world.m_7731_(new BlockPos(x - 1.0D, y + 1.0D, z), Blocks.f_50016_.m_49966_(), 3);
/*    */     }
/* 21 */     if (Blocks.f_50375_ == world.m_8055_(new BlockPos(x, y + 1.0D, z)).m_60734_()) {
/* 22 */       world.m_7731_(new BlockPos(x, y + 1.0D, z), Blocks.f_50016_.m_49966_(), 3);
/*    */     }
/* 24 */     if (Blocks.f_50375_ == world.m_8055_(new BlockPos(x, y + 1.0D, z - 1.0D)).m_60734_()) {
/* 25 */       world.m_7731_(new BlockPos(x, y + 1.0D, z - 1.0D), Blocks.f_50016_.m_49966_(), 3);
/*    */     }
/* 27 */     if (Blocks.f_50375_ == world.m_8055_(new BlockPos(x, y + 1.0D, z + 1.0D)).m_60734_()) {
/* 28 */       world.m_7731_(new BlockPos(x, y + 1.0D, z + 1.0D), Blocks.f_50016_.m_49966_(), 3);
/*    */     }
/* 30 */     if (Blocks.f_50375_ == world.m_8055_(new BlockPos(x, y, z - 1.0D)).m_60734_()) {
/* 31 */       world.m_7731_(new BlockPos(x, y, z - 1.0D), Blocks.f_50016_.m_49966_(), 3);
/*    */     }
/* 33 */     if (Blocks.f_50375_ == world.m_8055_(new BlockPos(x, y, z + 1.0D)).m_60734_())
/* 34 */       world.m_7731_(new BlockPos(x, y, z + 1.0D), Blocks.f_50016_.m_49966_(), 3); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\LabDoorBlockDestroyedByExplosionProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */