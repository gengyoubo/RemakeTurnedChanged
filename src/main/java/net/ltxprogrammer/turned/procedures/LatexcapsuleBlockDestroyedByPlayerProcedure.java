/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.changed.init.ChangedBlocks;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ 
/*    */ public class LatexcapsuleBlockDestroyedByPlayerProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/*  9 */     if (Math.random() < 0.5D)
/* 10 */       world.m_7731_(new BlockPos(x, y, z), ((Block)ChangedBlocks.DARK_LATEX_BLOCK.get()).m_49966_(), 3); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\LatexcapsuleBlockDestroyedByPlayerProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */