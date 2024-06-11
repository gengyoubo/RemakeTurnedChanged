/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.Explosion;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class HighPressureCylinderUpdateTickProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 11 */     if ((world.m_8055_(new BlockPos(x + 1.0D, y, z)).m_60734_() == Blocks.f_50083_ || world
/* 12 */       .m_8055_(new BlockPos(x - 1.0D, y, z)).m_60734_() == Blocks.f_50083_ || world
/* 13 */       .m_8055_(new BlockPos(x, y, z + 1.0D)).m_60734_() == Blocks.f_50083_ || world
/* 14 */       .m_8055_(new BlockPos(x, y, z - 1.0D)).m_60734_() == Blocks.f_50083_) && 
/* 15 */       Math.random() < 0.1D && 
/* 16 */       world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_())
/* 17 */         _level.m_46511_(null, x, y, z, 4.0F, Explosion.BlockInteraction.BREAK);  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\HighPressureCylinderUpdateTickProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */