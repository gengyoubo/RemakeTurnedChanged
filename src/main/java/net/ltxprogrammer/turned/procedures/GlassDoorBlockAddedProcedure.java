/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import com.google.common.collect.UnmodifiableIterator;
/*    */ import java.util.Map;
/*    */ import net.ltxprogrammer.turned.init.LatexModBlocks;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ 
/*    */ public class GlassDoorBlockAddedProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 13 */     if (world.m_8055_(new BlockPos(x + 1.0D, y, z)).m_60734_() == LatexModBlocks.GLASS_DOOR.get()) {
/*    */       
/* 15 */       BlockPos _bp = new BlockPos(x + 1.0D, y, z);
/* 16 */       BlockState _bs = ((Block)LatexModBlocks.INVERTED_GLASS_DOOR.get()).m_49966_();
/* 17 */       BlockState _bso = world.m_8055_(_bp);
/* 18 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 19 */         Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 20 */         if (_property != null && _bs.m_61143_(_property) != null) {
/*    */           try {
/* 22 */             _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 23 */           } catch (Exception exception) {}
/*    */         } }
/*    */       
/* 26 */       world.m_7731_(_bp, _bs, 3);
/*    */     }
/* 28 */     else if (world.m_8055_(new BlockPos(x - 1.0D, y, z)).m_60734_() == LatexModBlocks.GLASS_DOOR.get()) {
/*    */       
/* 30 */       BlockPos _bp = new BlockPos(x, y, z);
/* 31 */       BlockState _bs = ((Block)LatexModBlocks.INVERTED_GLASS_DOOR.get()).m_49966_();
/* 32 */       BlockState _bso = world.m_8055_(_bp);
/* 33 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 34 */         Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 35 */         if (_property != null && _bs.m_61143_(_property) != null) {
/*    */           try {
/* 37 */             _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 38 */           } catch (Exception exception) {}
/*    */         } }
/*    */       
/* 41 */       world.m_7731_(_bp, _bs, 3);
/*    */     }
/* 43 */     else if (world.m_8055_(new BlockPos(x, y, z + 1.0D)).m_60734_() == LatexModBlocks.GLASS_DOOR.get()) {
/*    */       
/* 45 */       BlockPos _bp = new BlockPos(x, y, z);
/* 46 */       BlockState _bs = ((Block)LatexModBlocks.INVERTED_OPEN_GLASS_DOOR.get()).m_49966_();
/* 47 */       BlockState _bso = world.m_8055_(_bp);
/* 48 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 49 */         Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 50 */         if (_property != null && _bs.m_61143_(_property) != null) {
/*    */           try {
/* 52 */             _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 53 */           } catch (Exception exception) {}
/*    */         } }
/*    */       
/* 56 */       world.m_7731_(_bp, _bs, 3);
/*    */     }
/* 58 */     else if (world.m_8055_(new BlockPos(x, y, z - 1.0D)).m_60734_() == LatexModBlocks.GLASS_DOOR.get()) {
/*    */       
/* 60 */       BlockPos _bp = new BlockPos(x, y, z - 1.0D);
/* 61 */       BlockState _bs = ((Block)LatexModBlocks.INVERTED_GLASS_DOOR.get()).m_49966_();
/* 62 */       BlockState _bso = world.m_8055_(_bp);
/* 63 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 64 */         Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 65 */         if (_property != null && _bs.m_61143_(_property) != null) {
/*    */           try {
/* 67 */             _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 68 */           } catch (Exception exception) {}
/*    */         } }
/*    */       
/* 71 */       world.m_7731_(_bp, _bs, 3);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\GlassDoorBlockAddedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */