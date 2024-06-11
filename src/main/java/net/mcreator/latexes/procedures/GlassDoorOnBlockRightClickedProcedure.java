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
/*    */ public class GlassDoorOnBlockRightClickedProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 15 */     BlockPos _bp = new BlockPos(x, y, z);
/* 16 */     BlockState _bs = ((Block)LatexModBlocks.OPEN_GLASS_DOOR.get()).defaultBlockState();
/* 17 */     BlockState _bso = world.getBlockState(_bp);
/* 18 */     for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 19 */       Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 20 */       if (_property != null && _bs.getValue(_property) != null) {
/*    */         try {
/* 22 */           _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 23 */         } catch (Exception exception) {}
/*    */       } }
/*    */     
/* 26 */     world.setBlock(_bp, _bs, 3);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\GlassDoorOnBlockRightClickedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */