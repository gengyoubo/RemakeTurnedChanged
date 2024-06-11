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
/*     */ public class DarkLatexDragonEntityDiesProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z) {
/*  16 */     if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXESLEAVEBLOCK)) {
/*     */       
/*  18 */       BlockPos _bp = new BlockPos(x, y, z);
/*  19 */       BlockState _bs = ((Block)LatexModBlocks.DARKLATEXCRYSTALEGG.get()).defaultBlockState();
/*  20 */       BlockState _bso = world.getBlockState(_bp); UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator;
/*  21 */       for (unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  22 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  23 */         if (_property != null && _bs.getValue(_property) != null) {
/*     */           try {
/*  25 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  26 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/*  29 */       world.setBlock(_bp, _bs, 3);
/*     */       
/*  31 */       if (((world.getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.BEDROCK) ? true : false) != true) {
/*     */         
/*  33 */         _bp = new BlockPos(x, y - 1.0D, z);
/*  34 */         _bs = ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
/*  35 */         _bso = world.getBlockState(_bp);
/*  36 */         for (unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  37 */           Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  38 */           if (_property != null && _bs.getValue(_property) != null) {
/*     */             try {
/*  40 */               _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  41 */             } catch (Exception exception) {}
/*     */           } }
/*     */         
/*  44 */         world.setBlock(_bp, _bs, 3);
/*     */ 
/*     */         
/*  47 */         _bp = new BlockPos(x + 1.0D, y - 1.0D, z);
/*  48 */         _bs = ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
/*  49 */         _bso = world.getBlockState(_bp);
/*  50 */         for (unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  51 */           Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  52 */           if (_property != null && _bs.getValue(_property) != null) {
/*     */             try {
/*  54 */               _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  55 */             } catch (Exception exception) {}
/*     */           } }
/*     */         
/*  58 */         world.setBlock(_bp, _bs, 3);
/*     */ 
/*     */         
/*  61 */         _bp = new BlockPos(x - 1.0D, y - 1.0D, z);
/*  62 */         _bs = ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
/*  63 */         _bso = world.getBlockState(_bp);
/*  64 */         for (unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  65 */           Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  66 */           if (_property != null && _bs.getValue(_property) != null) {
/*     */             try {
/*  68 */               _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  69 */             } catch (Exception exception) {}
/*     */           } }
/*     */         
/*  72 */         world.setBlock(_bp, _bs, 3);
/*     */ 
/*     */         
/*  75 */         _bp = new BlockPos(x, y - 1.0D, z + 1.0D);
/*  76 */         _bs = ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
/*  77 */         _bso = world.getBlockState(_bp);
/*  78 */         for (unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  79 */           Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  80 */           if (_property != null && _bs.getValue(_property) != null) {
/*     */             try {
/*  82 */               _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  83 */             } catch (Exception exception) {}
/*     */           } }
/*     */         
/*  86 */         world.setBlock(_bp, _bs, 3);
/*     */ 
/*     */         
/*  89 */         _bp = new BlockPos(x, y - 1.0D, z - 1.0D);
/*  90 */         _bs = ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
/*  91 */         _bso = world.getBlockState(_bp);
/*  92 */         for (unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  93 */           Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  94 */           if (_property != null && _bs.getValue(_property) != null) {
/*     */             try {
/*  96 */               _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  97 */             } catch (Exception exception) {}
/*     */           } }
/*     */         
/* 100 */         world.setBlock(_bp, _bs, 3);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarkLatexDragonEntityDiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */