/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import com.google.common.collect.UnmodifiableIterator;
/*    */ import java.util.Map;
/*    */ import net.ltxprogrammer.turned.init.LatexModBlocks;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ 
/*    */ public class DarklatexslugOnEntityTickUpdateProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 15 */     if (entity == null)
/*    */       return; 
/* 17 */     if (world.m_8055_(new BlockPos(x, y - 1.0D, z)).m_60734_() == Blocks.f_50087_) {
/* 18 */       if (!entity.f_19853_.m_5776_()) {
/* 19 */         entity.m_146870_();
/*    */       }
/* 21 */       BlockPos _bp = new BlockPos(x, y - 1.0D, z);
/* 22 */       BlockState _bs = ((Block)LatexModBlocks.CHES_TRAP.get()).m_49966_();
/* 23 */       BlockState _bso = world.m_8055_(_bp);
/* 24 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 25 */         Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 26 */         if (_property != null && _bs.m_61143_(_property) != null) {
/*    */           try {
/* 28 */             _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 29 */           } catch (Exception exception) {}
/*    */         } }
/*    */       
/* 32 */       world.m_7731_(_bp, _bs, 3);
/*    */     }
/* 34 */     else if (world.m_8055_(new BlockPos(x, y - 1.0D, z)).m_60734_() == LatexModBlocks.BOX.get() || world
/* 35 */       .m_8055_(new BlockPos(x, y - 1.0D, z)).m_60734_() == LatexModBlocks.BOX_INVENTORY.get()) {
/* 36 */       if (!entity.f_19853_.m_5776_()) {
/* 37 */         entity.m_146870_();
/*    */       }
/* 39 */       BlockPos _bp = new BlockPos(x, y - 1.0D, z);
/* 40 */       BlockState _bs = ((Block)LatexModBlocks.BOX_TRAP.get()).m_49966_();
/* 41 */       BlockState _bso = world.m_8055_(_bp);
/* 42 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 43 */         Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 44 */         if (_property != null && _bs.m_61143_(_property) != null) {
/*    */           try {
/* 46 */             _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 47 */           } catch (Exception exception) {}
/*    */         } }
/*    */       
/* 50 */       world.m_7731_(_bp, _bs, 3);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DarklatexslugOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */