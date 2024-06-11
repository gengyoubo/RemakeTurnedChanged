/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import com.google.common.collect.UnmodifiableIterator;
/*    */ import java.util.Map;
/*    */ import net.ltxprogrammer.turned.init.LatexModBlocks;
/*    */ import net.ltxprogrammer.turned.init.LatexModGameRules;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ 
/*    */ public class EvilBeaconOffUpdateTickProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 14 */     if (world.m_6106_().m_5470_().m_46207_(LatexModGameRules.DOEVILSRAID) == true) {
/*    */       
/* 16 */       BlockPos _bp = new BlockPos(x, y, z);
/* 17 */       BlockState _bs = ((Block)LatexModBlocks.EVILBEACONON.get()).m_49966_();
/* 18 */       BlockState _bso = world.m_8055_(_bp);
/* 19 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 20 */         Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 21 */         if (_property != null && _bs.m_61143_(_property) != null) {
/*    */           try {
/* 23 */             _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 24 */           } catch (Exception exception) {}
/*    */         } }
/*    */       
/* 27 */       world.m_7731_(_bp, _bs, 3);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\EvilBeaconOffUpdateTickProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */