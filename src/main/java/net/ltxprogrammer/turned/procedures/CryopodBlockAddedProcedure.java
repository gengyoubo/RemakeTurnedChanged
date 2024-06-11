/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class CryopodBlockAddedProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 10 */     if (((world.m_8055_(new BlockPos(x, y - 1.0D, z)).m_60734_() == Blocks.f_50016_ || world
/* 11 */       .m_8055_(new BlockPos(x, y - 1.0D, z)).m_60734_() == Blocks.f_50626_ || world
/* 12 */       .m_8055_(new BlockPos(x, y - 1.0D, z)).m_60734_() == Blocks.f_50627_) ? true : false) != true) {
/*    */       
/* 14 */       BlockPos _pos = new BlockPos(x, y, z);
/* 15 */       Block.m_49892_(world.m_8055_(_pos), world, new BlockPos(x, y - 1.0D, z), null);
/* 16 */       world.m_46961_(_pos, false);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\CryopodBlockAddedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */