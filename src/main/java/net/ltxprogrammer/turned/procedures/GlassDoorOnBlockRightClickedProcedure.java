/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import com.google.common.collect.UnmodifiableIterator;
/*    */ import java.util.Map;
/*    */ import net.ltxprogrammer.turned.init.LatexModBlocks;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ 
/*    */ public class GlassDoorOnBlockRightClickedProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 14 */     BlockPos _bp = new BlockPos(x, y, z);
/* 15 */     BlockState _bs = ((Block)LatexModBlocks.OPEN_GLASS_DOOR.get()).m_49966_();
/* 16 */     BlockState _bso = world.m_8055_(_bp);
/* 17 */     for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 18 */       Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 19 */       if (_property != null && _bs.m_61143_(_property) != null) {
/*    */         try {
/* 21 */           _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 22 */         } catch (Exception exception) {}
/*    */       } }
/*    */     
/* 25 */     world.m_7731_(_bp, _bs, 3);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\GlassDoorOnBlockRightClickedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */