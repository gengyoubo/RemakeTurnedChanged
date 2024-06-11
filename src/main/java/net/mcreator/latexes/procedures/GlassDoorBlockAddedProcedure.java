/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import com.google.common.collect.UnmodifiableIterator;
/*    */ import java.util.Map;
/*    */ import net.mcreator.latexes.init.LatexModBlocks;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ 
/*    */ public class GlassDoorBlockAddedProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 14 */     if (world.getBlockState(new BlockPos(x + 1.0D, y, z)).getBlock() == LatexModBlocks.GLASS_DOOR.get()) {
/*    */       
/* 16 */       BlockPos _bp = new BlockPos(x + 1.0D, y, z);
/* 17 */       BlockState _bs = ((Block)LatexModBlocks.INVERTED_GLASS_DOOR.get()).defaultBlockState();
/* 18 */       BlockState _bso = world.getBlockState(_bp);
/* 19 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 20 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 21 */         if (_property != null && _bs.getValue(_property) != null) {
/*    */           try {
/* 23 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 24 */           } catch (Exception exception) {}
/*    */         } }
/*    */       
/* 27 */       world.setBlock(_bp, _bs, 3);
/*    */     }
/* 29 */     else if (world.getBlockState(new BlockPos(x - 1.0D, y, z)).getBlock() == LatexModBlocks.GLASS_DOOR.get()) {
/*    */       
/* 31 */       BlockPos _bp = new BlockPos(x, y, z);
/* 32 */       BlockState _bs = ((Block)LatexModBlocks.INVERTED_GLASS_DOOR.get()).defaultBlockState();
/* 33 */       BlockState _bso = world.getBlockState(_bp);
/* 34 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 35 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 36 */         if (_property != null && _bs.getValue(_property) != null) {
/*    */           try {
/* 38 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 39 */           } catch (Exception exception) {}
/*    */         } }
/*    */       
/* 42 */       world.setBlock(_bp, _bs, 3);
/*    */     }
/* 44 */     else if (world.getBlockState(new BlockPos(x, y, z + 1.0D)).getBlock() == LatexModBlocks.GLASS_DOOR.get()) {
/*    */       
/* 46 */       BlockPos _bp = new BlockPos(x, y, z);
/* 47 */       BlockState _bs = ((Block)LatexModBlocks.INVERTED_OPEN_GLASS_DOOR.get()).defaultBlockState();
/* 48 */       BlockState _bso = world.getBlockState(_bp);
/* 49 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 50 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 51 */         if (_property != null && _bs.getValue(_property) != null) {
/*    */           try {
/* 53 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 54 */           } catch (Exception exception) {}
/*    */         } }
/*    */       
/* 57 */       world.setBlock(_bp, _bs, 3);
/*    */     }
/* 59 */     else if (world.getBlockState(new BlockPos(x, y, z - 1.0D)).getBlock() == LatexModBlocks.GLASS_DOOR.get()) {
/*    */       
/* 61 */       BlockPos _bp = new BlockPos(x, y, z - 1.0D);
/* 62 */       BlockState _bs = ((Block)LatexModBlocks.INVERTED_GLASS_DOOR.get()).defaultBlockState();
/* 63 */       BlockState _bso = world.getBlockState(_bp);
/* 64 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 65 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 66 */         if (_property != null && _bs.getValue(_property) != null) {
/*    */           try {
/* 68 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 69 */           } catch (Exception exception) {}
/*    */         } }
/*    */       
/* 72 */       world.setBlock(_bp, _bs, 3);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\GlassDoorBlockAddedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */