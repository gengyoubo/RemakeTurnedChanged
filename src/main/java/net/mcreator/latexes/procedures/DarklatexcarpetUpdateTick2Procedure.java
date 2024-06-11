/*     */ package net.mcreator.latexes.procedures;
/*     */ import com.google.common.collect.UnmodifiableIterator;
/*     */ import java.util.Map;
/*     */ import net.mcreator.latexes.init.LatexModBlocks;
/*     */ import net.mcreator.latexes.init.LatexModGameRules;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.tags.BlockTags;
/*     */ import net.minecraft.world.level.BlockGetter;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraft.world.level.block.state.properties.Property;
/*     */ 
/*     */ public class DarklatexcarpetUpdateTick2Procedure {
/*     */   public static boolean execute(LevelAccessor world, double x, double y, double z) {
/*  18 */     double underblocktransform = 0.0D;
/*  19 */     if (world.getBlockState(new BlockPos(x, y - 1.0D, z)).is(BlockTags.create(new ResourceLocation("latex:invalidblockbelow"))) || world
/*  20 */       .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == LatexModBlocks.DARKLATEXCRYSTALEGG.get() || world
/*  21 */       .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == LatexModBlocks.DARKLATEXICE.get() || world
/*  22 */       .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get() || world
/*  23 */       .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == LatexModBlocks.DARKLATEXBLOCK.get()) {
/*  24 */       world.destroyBlock(new BlockPos(x, y, z), false);
/*  25 */       return true;
/*     */     } 
/*  27 */     if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSPREAD)) {
/*  28 */       if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSUNLIGHTONLY)) {
/*  29 */         if (world.getBlockState(new BlockPos(x, y, z)).getLightEmission((BlockGetter)world, new BlockPos(x, y, z)) >= 5 || world
/*  30 */           .canSeeSkyFromBelowWater(new BlockPos(x, y, z))) {
/*  31 */           DarklatexcarpetUpdateTickProcedure.execute(world, x, y, z);
/*     */         }
/*     */       } else {
/*  34 */         DarklatexcarpetUpdateTickProcedure.execute(world, x, y, z);
/*     */       } 
/*     */     }
/*  37 */     if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSPREAD) && 
/*  38 */       Math.random() < 0.0075D && 
/*  39 */       world.getBlockState(new BlockPos(x, y - 1.0D, z))
/*  40 */       .is(BlockTags.create(new ResourceLocation("latex:tag_immune_blocks"))) != true && 
/*     */ 
/*     */       
/*  43 */       !((!world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSTONESPREAD) && world.getBlockState(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).is(BlockTags.create(new ResourceLocation("latex:tag_stone_blocks"))) == true) ? 1 : 0)) {
/*  44 */       if (world.getBlockState(new BlockPos(x, y - 1.0D, z + 0.0D)).getBlock() == Blocks.OAK_LEAVES || world
/*  45 */         .getBlockState(new BlockPos(x, y + 1.0D, z - 0.0D)).getBlock() == Blocks.GRASS || world
/*  46 */         .getBlockState(new BlockPos(x, y - 1.0D, z + 0.0D)).getBlock() == Blocks.SWEET_BERRY_BUSH || world
/*  47 */         .getBlockState(new BlockPos(x, y + 1.0D, z - 0.0D)).getBlock() == Blocks.VINE) {
/*  48 */         world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
/*     */         
/*  50 */         BlockPos _bp = new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D);
/*  51 */         BlockState _bs = ((Block)LatexModBlocks.DARKLATEXLEAVES.get()).defaultBlockState();
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
/*  63 */       else if (world.getFluidState(new BlockPos(x, y - 1.0D, z)).createLegacyBlock().getBlock() == Blocks.WATER || world
/*  64 */         .getFluidState(new BlockPos(x, y - 1.0D, z)).createLegacyBlock().getBlock() == Blocks.WATER) {
/*  65 */         if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXFLUIDS)) {
/*  66 */           world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
/*     */           
/*  68 */           BlockPos _bp = new BlockPos(x + 0.0D, y - 1.0D, z + 0.0D);
/*  69 */           BlockState _bs = ((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
/*  70 */           BlockState _bso = world.getBlockState(_bp);
/*  71 */           for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  72 */             Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  73 */             if (_property != null && _bs.getValue(_property) != null) {
/*     */               try {
/*  75 */                 _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  76 */               } catch (Exception exception) {}
/*     */             } }
/*     */           
/*  79 */           world.setBlock(_bp, _bs, 3);
/*     */         } else {
/*     */           
/*  82 */           return true;
/*     */         } 
/*  84 */       } else if (world.getBlockState(new BlockPos(x + 0.0D, y - 1.0D, z + 0.0D))
/*  85 */         .is(BlockTags.create(new ResourceLocation("latex:cobblestone"))) && world
/*  86 */         .getLevelData().getGameRules().getBoolean(LatexModGameRules.CANCOBBLESTONEBEINFESTED)) {
/*  87 */         world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
/*     */         
/*  89 */         BlockPos _bp = new BlockPos(x + 0.0D, y - 1.0D, z + 0.0D);
/*  90 */         BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).defaultBlockState();
/*  91 */         BlockState _bso = world.getBlockState(_bp);
/*  92 */         for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  93 */           Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  94 */           if (_property != null && _bs.getValue(_property) != null) {
/*     */             try {
/*  96 */               _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  97 */             } catch (Exception exception) {}
/*     */           } }
/*     */         
/* 100 */         world.setBlock(_bp, _bs, 3);
/*     */       } else {
/*     */         
/* 103 */         world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
/*     */         
/* 105 */         BlockPos _bp = new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D);
/* 106 */         BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
/* 107 */         BlockState _bso = world.getBlockState(_bp);
/* 108 */         for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 109 */           Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 110 */           if (_property != null && _bs.getValue(_property) != null) {
/*     */             try {
/* 112 */               _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 113 */             } catch (Exception exception) {}
/*     */           } }
/*     */         
/* 116 */         world.setBlock(_bp, _bs, 3);
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 124 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarklatexcarpetUpdateTick2Procedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */