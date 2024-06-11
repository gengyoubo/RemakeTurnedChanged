/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import com.google.common.collect.UnmodifiableIterator;
/*    */ import java.util.Map;
/*    */ import net.mcreator.latexes.init.LatexModBlocks;
/*    */ import net.mcreator.latexes.init.LatexModGameRules;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ 
/*    */ public class DlsharkEntityDiesProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 16 */     if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXESLEAVEBLOCK) == true && (
/* 17 */       (world.getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.BEDROCK) ? true : false) != true)
/* 18 */       if (((world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.WATER || world
/* 19 */         .getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.BUBBLE_COLUMN || world
/* 20 */         .getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.WATER || world
/* 21 */         .getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.AIR || world
/* 22 */         .getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.CAVE_AIR || world
/* 23 */         .getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.VOID_AIR) ? true : false) != true) {
/*    */         
/* 25 */         BlockPos _bp = new BlockPos(x, y, z);
/* 26 */         BlockState _bs = ((Block)LatexModBlocks.DARKLATEXCARPET.get()).defaultBlockState();
/* 27 */         BlockState _bso = world.getBlockState(_bp);
/* 28 */         for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 29 */           Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 30 */           if (_property != null && _bs.getValue(_property) != null) {
/*    */             try {
/* 32 */               _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 33 */             } catch (Exception exception) {}
/*    */           } }
/*    */         
/* 36 */         world.setBlock(_bp, _bs, 3);
/*    */       }
/* 38 */       else if (world.getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.WATER || world
/* 39 */         .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.BUBBLE_COLUMN || world
/* 40 */         .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.WATER || world
/* 41 */         .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.AIR || world
/* 42 */         .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.CAVE_AIR || world
/* 43 */         .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.VOID_AIR) {
/*    */         
/* 45 */         BlockPos _bp = new BlockPos(x, y, z);
/* 46 */         BlockState _bs = ((Block)LatexModBlocks.DARKLATEXCARPET.get()).defaultBlockState();
/* 47 */         BlockState _bso = world.getBlockState(_bp);
/* 48 */         for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 49 */           Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 50 */           if (_property != null && _bs.getValue(_property) != null) {
/*    */             try {
/* 52 */               _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 53 */             } catch (Exception exception) {}
/*    */           } }
/*    */         
/* 56 */         world.setBlock(_bp, _bs, 3);
/*    */       }  
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DlsharkEntityDiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */