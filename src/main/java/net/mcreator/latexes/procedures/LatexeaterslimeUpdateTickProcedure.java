/*     */ package net.mcreator.latexes.procedures;
/*     */ 
/*     */ import com.google.common.collect.UnmodifiableIterator;
/*     */ import java.util.Map;
/*     */ import net.mcreator.latexes.init.LatexModBlocks;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.tags.BlockTags;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraft.world.level.block.state.properties.Property;
/*     */ 
/*     */ public class LatexeaterslimeUpdateTickProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z) {
/*  17 */     if (world.getBlockState(new BlockPos(x + 1.0D, y, z)).is(BlockTags.create(new ResourceLocation("latex:darklatexblocks")))) {
/*     */       
/*  19 */       BlockPos _bp = new BlockPos(x + 1.0D, y, z);
/*  20 */       BlockState _bs = ((Block)LatexModBlocks.LATEXEATERSLIME.get()).defaultBlockState();
/*  21 */       BlockState _bso = world.getBlockState(_bp);
/*  22 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  23 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  24 */         if (_property != null && _bs.getValue(_property) != null) {
/*     */           try {
/*  26 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  27 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/*  30 */       world.setBlock(_bp, _bs, 3);
/*     */     }
/*  32 */     else if (world.getBlockState(new BlockPos(x - 1.0D, y, z)).is(BlockTags.create(new ResourceLocation("latex:darklatexblocks")))) {
/*     */       
/*  34 */       BlockPos _bp = new BlockPos(x - 1.0D, y, z);
/*  35 */       BlockState _bs = ((Block)LatexModBlocks.LATEXEATERSLIME.get()).defaultBlockState();
/*  36 */       BlockState _bso = world.getBlockState(_bp);
/*  37 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  38 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  39 */         if (_property != null && _bs.getValue(_property) != null) {
/*     */           try {
/*  41 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  42 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/*  45 */       world.setBlock(_bp, _bs, 3);
/*     */     }
/*  47 */     else if (world.getBlockState(new BlockPos(x, y + 1.0D, z)).is(BlockTags.create(new ResourceLocation("latex:darklatexblocks")))) {
/*     */       
/*  49 */       BlockPos _bp = new BlockPos(x, y + 1.0D, z);
/*  50 */       BlockState _bs = ((Block)LatexModBlocks.LATEXEATERSLIME.get()).defaultBlockState();
/*  51 */       BlockState _bso = world.getBlockState(_bp);
/*  52 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  53 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  54 */         if (_property != null && _bs.getValue(_property) != null) {
/*     */           try {
/*  56 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  57 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/*  60 */       world.setBlock(_bp, _bs, 3);
/*     */     }
/*  62 */     else if (world.getBlockState(new BlockPos(x, y - 1.0D, z)).is(BlockTags.create(new ResourceLocation("latex:darklatexblocks")))) {
/*     */       
/*  64 */       BlockPos _bp = new BlockPos(x, y - 1.0D, z);
/*  65 */       BlockState _bs = ((Block)LatexModBlocks.LATEXEATERSLIME.get()).defaultBlockState();
/*  66 */       BlockState _bso = world.getBlockState(_bp);
/*  67 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  68 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  69 */         if (_property != null && _bs.getValue(_property) != null) {
/*     */           try {
/*  71 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  72 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/*  75 */       world.setBlock(_bp, _bs, 3);
/*     */     }
/*  77 */     else if (world.getBlockState(new BlockPos(x, y, z + 1.0D)).is(BlockTags.create(new ResourceLocation("latex:darklatexblocks")))) {
/*     */       
/*  79 */       BlockPos _bp = new BlockPos(x, y, z + 1.0D);
/*  80 */       BlockState _bs = ((Block)LatexModBlocks.LATEXEATERSLIME.get()).defaultBlockState();
/*  81 */       BlockState _bso = world.getBlockState(_bp);
/*  82 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  83 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  84 */         if (_property != null && _bs.getValue(_property) != null) {
/*     */           try {
/*  86 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  87 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/*  90 */       world.setBlock(_bp, _bs, 3);
/*     */     }
/*  92 */     else if (world.getBlockState(new BlockPos(x, y, z - 1.0D)).is(BlockTags.create(new ResourceLocation("latex:darklatexblocks")))) {
/*     */       
/*  94 */       BlockPos _bp = new BlockPos(x, y, z - 1.0D);
/*  95 */       BlockState _bs = ((Block)LatexModBlocks.LATEXEATERSLIME.get()).defaultBlockState();
/*  96 */       BlockState _bso = world.getBlockState(_bp);
/*  97 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  98 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  99 */         if (_property != null && _bs.getValue(_property) != null) {
/*     */           try {
/* 101 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 102 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/* 105 */       world.setBlock(_bp, _bs, 3);
/*     */     
/*     */     }
/* 108 */     else if (Math.random() < 0.3D) {
/* 109 */       world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\LatexeaterslimeUpdateTickProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */