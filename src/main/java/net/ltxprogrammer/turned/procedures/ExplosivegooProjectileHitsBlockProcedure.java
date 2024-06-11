/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.changed.block.AbstractLatexBlock;
/*    */ import net.ltxprogrammer.changed.entity.LatexType;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.Explosion;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ 
/*    */ public class ExplosivegooProjectileHitsBlockProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 14 */     if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_())
/* 15 */         _level.m_46511_(null, x, y, z, 1.0F, Explosion.BlockInteraction.NONE);  }
/* 16 */      if ((world.m_8055_(new BlockPos(x, y + 1.0D, z)).m_60734_() == Blocks.f_50016_ || world
/* 17 */       .m_8055_(new BlockPos(x, y + 1.0D, z)).m_60734_() == Blocks.f_50626_ || world
/* 18 */       .m_8055_(new BlockPos(x, y + 1.0D, z)).m_60734_() == Blocks.f_50627_) && 
/* 19 */       world.m_8055_(new BlockPos(x, y, z)).m_61147_().contains(AbstractLatexBlock.COVERED))
/* 20 */       world.m_7731_(new BlockPos(x, y, z), (BlockState)world.m_8055_(new BlockPos(x, y, z)).m_61124_((Property)AbstractLatexBlock.COVERED, (Comparable)LatexType.DARK_LATEX), 3); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\ExplosivegooProjectileHitsBlockProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */