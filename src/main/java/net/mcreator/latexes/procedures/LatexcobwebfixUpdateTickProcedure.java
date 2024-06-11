/*     */ package net.mcreator.latexes.procedures;
/*     */ 
/*     */ import com.google.common.collect.UnmodifiableIterator;
/*     */ import java.util.Map;
/*     */ import net.mcreator.latexes.init.LatexModBlocks;
/*     */ import net.mcreator.latexes.init.LatexModGameRules;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraft.world.level.block.state.properties.Property;
/*     */ 
/*     */ public class LatexcobwebfixUpdateTickProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z) {
/*  16 */     if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSPREAD) && 
/*  17 */       Math.random() * 100.0D <= world.getLevelData().getGameRules().getInt(LatexModGameRules.DARKLATEXSPREADSPEED))
/*  18 */       if (world.getBlockState(new BlockPos(x + 1.0D, y, z)).getBlock() == Blocks.COBWEB) {
/*     */         
/*  20 */         BlockPos _bp = new BlockPos(x, y, z);
/*  21 */         BlockState _bs = ((Block)LatexModBlocks.LATEXCOBWEBFIX.get()).defaultBlockState();
/*  22 */         BlockState _bso = world.getBlockState(_bp);
/*  23 */         for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  24 */           Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  25 */           if (_property != null && _bs.getValue(_property) != null) {
/*     */             try {
/*  27 */               _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  28 */             } catch (Exception exception) {}
/*     */           } }
/*     */         
/*  31 */         world.setBlock(_bp, _bs, 3);
/*     */       }
/*  33 */       else if (world.getBlockState(new BlockPos(x - 1.0D, y, z)).getBlock() == Blocks.COBWEB) {
/*     */         
/*  35 */         BlockPos _bp = new BlockPos(x, y, z);
/*  36 */         BlockState _bs = ((Block)LatexModBlocks.LATEXCOBWEBFIX.get()).defaultBlockState();
/*  37 */         BlockState _bso = world.getBlockState(_bp);
/*  38 */         for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  39 */           Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  40 */           if (_property != null && _bs.getValue(_property) != null) {
/*     */             try {
/*  42 */               _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  43 */             } catch (Exception exception) {}
/*     */           } }
/*     */         
/*  46 */         world.setBlock(_bp, _bs, 3);
/*     */       }
/*  48 */       else if (world.getBlockState(new BlockPos(x, y + 1.0D, z)).getBlock() == Blocks.COBWEB) {
/*     */         
/*  50 */         BlockPos _bp = new BlockPos(x, y, z);
/*  51 */         BlockState _bs = ((Block)LatexModBlocks.LATEXCOBWEBFIX.get()).defaultBlockState();
/*  52 */         BlockState _bso = world.getBlockState(_bp);
/*  53 */         for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  54 */           Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  55 */           if (_property != null && _bs.getValue(_property) != null) {
/*     */             try {
/*  57 */               _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  58 */             } catch (Exception exception) {}
/*     */           } }
/*     */         
/*  61 */         world.setBlock(_bp, _bs, 3);
/*     */       }
/*  63 */       else if (world.getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.COBWEB) {
/*     */         
/*  65 */         BlockPos _bp = new BlockPos(x, y, z);
/*  66 */         BlockState _bs = ((Block)LatexModBlocks.LATEXCOBWEBFIX.get()).defaultBlockState();
/*  67 */         BlockState _bso = world.getBlockState(_bp);
/*  68 */         for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  69 */           Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  70 */           if (_property != null && _bs.getValue(_property) != null) {
/*     */             try {
/*  72 */               _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  73 */             } catch (Exception exception) {}
/*     */           } }
/*     */         
/*  76 */         world.setBlock(_bp, _bs, 3);
/*     */       }
/*  78 */       else if (world.getBlockState(new BlockPos(x, y, z + 1.0D)).getBlock() == Blocks.COBWEB) {
/*     */         
/*  80 */         BlockPos _bp = new BlockPos(x, y, z);
/*  81 */         BlockState _bs = ((Block)LatexModBlocks.LATEXCOBWEBFIX.get()).defaultBlockState();
/*  82 */         BlockState _bso = world.getBlockState(_bp);
/*  83 */         for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  84 */           Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  85 */           if (_property != null && _bs.getValue(_property) != null) {
/*     */             try {
/*  87 */               _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  88 */             } catch (Exception exception) {}
/*     */           } }
/*     */         
/*  91 */         world.setBlock(_bp, _bs, 3);
/*     */       }
/*  93 */       else if (world.getBlockState(new BlockPos(x, y, z - 1.0D)).getBlock() == Blocks.COBWEB) {
/*     */         
/*  95 */         BlockPos _bp = new BlockPos(x, y, z);
/*  96 */         BlockState _bs = ((Block)LatexModBlocks.LATEXCOBWEBFIX.get()).defaultBlockState();
/*  97 */         BlockState _bso = world.getBlockState(_bp);
/*  98 */         for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  99 */           Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 100 */           if (_property != null && _bs.getValue(_property) != null) {
/*     */             try {
/* 102 */               _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 103 */             } catch (Exception exception) {}
/*     */           } }
/*     */         
/* 106 */         world.setBlock(_bp, _bs, 3);
/*     */       }  
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\LatexcobwebfixUpdateTickProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */