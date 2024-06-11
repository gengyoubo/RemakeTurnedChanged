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
/*     */ public class DarkLatexGooFluidUpdateTickProcedure {
/*     */   public static boolean execute(LevelAccessor world, double x, double y, double z) {
/*  16 */     if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXFLUIDS) == true && 
/*  17 */       world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSPREAD) == true) {
/*  18 */       if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSUNLIGHTONLY) == true && 
/*     */         
/*  20 */         !((world.canSeeSkyFromBelowWater(new BlockPos(x, y + 1.0D, z)) && world.getMaxLocalRawBrightness(new BlockPos(x, y + 1.0D, z)) >= 5) ? 1 : 0)) {
/*  21 */         return true;
/*     */       }
/*  23 */       if (Math.random() * 100.0D <= world.getLevelData().getGameRules().getInt(LatexModGameRules.DARKLATEXSPREADSPEED) && 
/*  24 */         Math.random() * 100.0D < world.getLevelData().getGameRules().getInt(LatexModGameRules.DARKLATEXSPREADSPEED)) {
/*  25 */         if (world.getFluidState(new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D)).createLegacyBlock().getBlock() == Blocks.WATER || world
/*  26 */           .getFluidState(new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D)).createLegacyBlock().getBlock() == Blocks.WATER || world
/*  27 */           .getFluidState(new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D)).createLegacyBlock().getBlock() == Blocks.BUBBLE_COLUMN || world
/*  28 */           .getBlockState(new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D)).getBlock() == Blocks.TALL_SEAGRASS || world
/*  29 */           .getBlockState(new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D)).getBlock() == Blocks.SEAGRASS) {
/*     */           
/*  31 */           BlockPos _bp = new BlockPos(x + 1.0D, y, z);
/*  32 */           BlockState _bs = ((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
/*  33 */           BlockState _bso = world.getBlockState(_bp);
/*  34 */           for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  35 */             Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  36 */             if (_property != null && _bs.getValue(_property) != null) {
/*     */               try {
/*  38 */                 _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  39 */               } catch (Exception exception) {}
/*     */             } }
/*     */           
/*  42 */           world.setBlock(_bp, _bs, 3);
/*     */         }
/*  44 */         else if (world.getFluidState(new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D)).createLegacyBlock().getBlock() == Blocks.WATER || world
/*  45 */           .getFluidState(new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D)).createLegacyBlock().getBlock() == Blocks.WATER || world
/*  46 */           .getFluidState(new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D)).createLegacyBlock().getBlock() == Blocks.BUBBLE_COLUMN || world
/*  47 */           .getBlockState(new BlockPos(x + 1.0D, y - 0.0D, z + 0.0D)).getBlock() == Blocks.TALL_SEAGRASS || world
/*  48 */           .getBlockState(new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D)).getBlock() == Blocks.SEAGRASS) {
/*     */           
/*  50 */           BlockPos _bp = new BlockPos(x - 1.0D, y, z);
/*  51 */           BlockState _bs = ((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
/*  52 */           BlockState _bso = world.getBlockState(_bp);
/*  53 */           for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  54 */             Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  55 */             if (_property != null && _bs.getValue(_property) != null) {
/*     */               try {
/*  57 */                 _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  58 */               } catch (Exception exception) {}
/*     */             } }
/*     */           
/*  61 */           world.setBlock(_bp, _bs, 3);
/*     */         }
/*  63 */         else if (world.getFluidState(new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D)).createLegacyBlock().getBlock() == Blocks.WATER || world
/*  64 */           .getFluidState(new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D)).createLegacyBlock().getBlock() == Blocks.WATER || world
/*  65 */           .getFluidState(new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D)).createLegacyBlock().getBlock() == Blocks.BUBBLE_COLUMN || world
/*  66 */           .getBlockState(new BlockPos(x + 0.0D, y + 1.0D, z + 0.0D)).getBlock() == Blocks.TALL_SEAGRASS || world
/*  67 */           .getBlockState(new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D)).getBlock() == Blocks.SEAGRASS) {
/*     */           
/*  69 */           BlockPos _bp = new BlockPos(x, y + 1.0D, z);
/*  70 */           BlockState _bs = ((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
/*  71 */           BlockState _bso = world.getBlockState(_bp);
/*  72 */           for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  73 */             Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  74 */             if (_property != null && _bs.getValue(_property) != null) {
/*     */               try {
/*  76 */                 _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  77 */               } catch (Exception exception) {}
/*     */             } }
/*     */           
/*  80 */           world.setBlock(_bp, _bs, 3);
/*     */         }
/*  82 */         else if (world.getFluidState(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).createLegacyBlock().getBlock() == Blocks.WATER || world
/*  83 */           .getFluidState(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).createLegacyBlock().getBlock() == Blocks.WATER || world
/*  84 */           .getFluidState(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).createLegacyBlock().getBlock() == Blocks.BUBBLE_COLUMN || world
/*  85 */           .getBlockState(new BlockPos(x + 0.0D, y - 1.0D, z + 0.0D)).getBlock() == Blocks.TALL_SEAGRASS || world
/*  86 */           .getBlockState(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).getBlock() == Blocks.SEAGRASS) {
/*     */           
/*  88 */           BlockPos _bp = new BlockPos(x, y - 1.0D, z);
/*  89 */           BlockState _bs = ((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
/*  90 */           BlockState _bso = world.getBlockState(_bp);
/*  91 */           for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  92 */             Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  93 */             if (_property != null && _bs.getValue(_property) != null) {
/*     */               try {
/*  95 */                 _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  96 */               } catch (Exception exception) {}
/*     */             } }
/*     */           
/*  99 */           world.setBlock(_bp, _bs, 3);
/*     */         }
/* 101 */         else if (world.getFluidState(new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D)).createLegacyBlock().getBlock() == Blocks.WATER || world
/* 102 */           .getFluidState(new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D)).createLegacyBlock().getBlock() == Blocks.WATER || world
/* 103 */           .getFluidState(new BlockPos(x - 0.0D, y + 0.0D, z + 1.0D)).createLegacyBlock().getBlock() == Blocks.BUBBLE_COLUMN || world
/* 104 */           .getBlockState(new BlockPos(x + 0.0D, y - 0.0D, z + 1.0D)).getBlock() == Blocks.TALL_SEAGRASS || world
/* 105 */           .getBlockState(new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D)).getBlock() == Blocks.SEAGRASS) {
/*     */           
/* 107 */           BlockPos _bp = new BlockPos(x, y, z + 1.0D);
/* 108 */           BlockState _bs = ((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
/* 109 */           BlockState _bso = world.getBlockState(_bp);
/* 110 */           for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 111 */             Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 112 */             if (_property != null && _bs.getValue(_property) != null) {
/*     */               try {
/* 114 */                 _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 115 */               } catch (Exception exception) {}
/*     */             } }
/*     */           
/* 118 */           world.setBlock(_bp, _bs, 3);
/*     */         }
/* 120 */         else if (world.getFluidState(new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D)).createLegacyBlock().getBlock() == Blocks.WATER || world
/* 121 */           .getFluidState(new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D)).createLegacyBlock().getBlock() == Blocks.WATER || world
/* 122 */           .getFluidState(new BlockPos(x - 0.0D, y + 0.0D, z - 1.0D)).createLegacyBlock().getBlock() == Blocks.BUBBLE_COLUMN || world
/* 123 */           .getBlockState(new BlockPos(x + 0.0D, y - 0.0D, z - 1.0D)).getBlock() == Blocks.TALL_SEAGRASS || world
/* 124 */           .getBlockState(new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D)).getBlock() == Blocks.SEAGRASS) {
/*     */           
/* 126 */           BlockPos _bp = new BlockPos(x, y, z - 1.0D);
/* 127 */           BlockState _bs = ((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
/* 128 */           BlockState _bso = world.getBlockState(_bp);
/* 129 */           for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 130 */             Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 131 */             if (_property != null && _bs.getValue(_property) != null) {
/*     */               try {
/* 133 */                 _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 134 */               } catch (Exception exception) {}
/*     */             } }
/*     */           
/* 137 */           world.setBlock(_bp, _bs, 3);
/*     */         } 
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 145 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarkLatexGooFluidUpdateTickProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */