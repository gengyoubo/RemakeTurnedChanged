/*   */ package net.ltxprogrammer.turned.procedures;
/*   */ 
/*   */ import net.minecraft.core.BlockPos;
/*   */ import net.minecraft.world.level.LevelAccessor;
/*   */ 
/*   */ public class CheckforskyProcedure {
/*   */   public static boolean execute(LevelAccessor world, double x, double y, double z) {
/* 8 */     return (world.m_46861_(new BlockPos(x, y, z)) == true);
/*   */   }
/*   */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\CheckforskyProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */