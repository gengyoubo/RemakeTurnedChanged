/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import com.google.common.collect.UnmodifiableIterator;
/*    */ import java.util.Map;
/*    */ import net.mcreator.latexes.init.LatexModBlocks;
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
/* 16 */     if (entity == null)
/*    */       return; 
/* 18 */     if (world.getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.CHEST) {
/* 19 */       if (!entity.level.isClientSide()) {
/* 20 */         entity.discard();
/*    */       }
/* 22 */       BlockPos _bp = new BlockPos(x, y - 1.0D, z);
/* 23 */       BlockState _bs = ((Block)LatexModBlocks.CHES_TRAP.get()).defaultBlockState();
/* 24 */       BlockState _bso = world.getBlockState(_bp);
/* 25 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 26 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 27 */         if (_property != null && _bs.getValue(_property) != null) {
/*    */           try {
/* 29 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 30 */           } catch (Exception exception) {}
/*    */         } }
/*    */       
/* 33 */       world.setBlock(_bp, _bs, 3);
/*    */     }
/* 35 */     else if (world.getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == LatexModBlocks.BOX.get() || world
/* 36 */       .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == LatexModBlocks.BOX_INVENTORY.get()) {
/* 37 */       if (!entity.level.isClientSide()) {
/* 38 */         entity.discard();
/*    */       }
/* 40 */       BlockPos _bp = new BlockPos(x, y - 1.0D, z);
/* 41 */       BlockState _bs = ((Block)LatexModBlocks.BOX_TRAP.get()).defaultBlockState();
/* 42 */       BlockState _bso = world.getBlockState(_bp);
/* 43 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 44 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 45 */         if (_property != null && _bs.getValue(_property) != null) {
/*    */           try {
/* 47 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 48 */           } catch (Exception exception) {}
/*    */         } }
/*    */       
/* 51 */       world.setBlock(_bp, _bs, 3);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarklatexslugOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */