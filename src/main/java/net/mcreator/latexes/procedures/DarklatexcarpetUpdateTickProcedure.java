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
/*     */ public class DarklatexcarpetUpdateTickProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z) {
/*  16 */     if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSPREAD) && 
/*  17 */       Math.random() * 100.0D <= world.getLevelData().getGameRules().getInt(LatexModGameRules.DARKLATEXSPREADSPEED)) {
/*  18 */       if (Math.random() * 100.0D <= Math.ceil(1.5D / world.getLevelData().getGameRules().getInt(LatexModGameRules.DARKLATEXSPREADSPEED))) {
/*  19 */         if (world.getBlockState(new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D)).getBlock() == LatexModBlocks.DARKLATEXPUDDLEHARMLESS.get() || world
/*  20 */           .getBlockState(new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D)).getBlock() == Blocks.AIR || world
/*  21 */           .getBlockState(new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D)).getBlock() == Blocks.CAVE_AIR || world
/*  22 */           .getBlockState(new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D)).getBlock() == Blocks.VOID_AIR) {
/*  23 */           if (Math.random() < 0.8D)
/*     */           {
/*  25 */             BlockPos _bp = new BlockPos(x + 1.0D, y, z);
/*  26 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXCARPET.get()).defaultBlockState();
/*  27 */             BlockState _bso = world.getBlockState(_bp);
/*  28 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  29 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  30 */               if (_property != null && _bs.getValue(_property) != null) {
/*     */                 try {
/*  32 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  33 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/*  36 */             world.setBlock(_bp, _bs, 3);
/*     */           }
/*     */         
/*     */         }
/*  40 */         else if (Math.random() < 0.1D) {
/*     */           
/*  42 */           BlockPos _bp = new BlockPos(x, y, z);
/*  43 */           BlockState _bs = ((Block)LatexModBlocks.DARKLATEXPUDDLEHARMLESS.get()).defaultBlockState();
/*  44 */           BlockState _bso = world.getBlockState(_bp);
/*  45 */           for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  46 */             Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  47 */             if (_property != null && _bs.getValue(_property) != null) {
/*     */               try {
/*  49 */                 _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  50 */               } catch (Exception exception) {}
/*     */             } }
/*     */           
/*  53 */           world.setBlock(_bp, _bs, 3);
/*     */         } 
/*     */       }
/*     */ 
/*     */       
/*  58 */       if (Math.random() * 100.0D <= Math.ceil(1.5D / world.getLevelData().getGameRules().getInt(LatexModGameRules.DARKLATEXSPREADSPEED))) {
/*  59 */         if (world.getBlockState(new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D)).getBlock() == LatexModBlocks.DARKLATEXPUDDLEHARMLESS.get() || world
/*  60 */           .getBlockState(new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D)).getBlock() == Blocks.AIR || world
/*  61 */           .getBlockState(new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D)).getBlock() == Blocks.CAVE_AIR || world
/*  62 */           .getBlockState(new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D)).getBlock() == Blocks.VOID_AIR) {
/*  63 */           if (Math.random() < 0.8D)
/*     */           {
/*  65 */             BlockPos _bp = new BlockPos(x - 1.0D, y, z);
/*  66 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXCARPET.get()).defaultBlockState();
/*  67 */             BlockState _bso = world.getBlockState(_bp);
/*  68 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  69 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  70 */               if (_property != null && _bs.getValue(_property) != null) {
/*     */                 try {
/*  72 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  73 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/*  76 */             world.setBlock(_bp, _bs, 3);
/*     */           }
/*     */         
/*     */         }
/*  80 */         else if (Math.random() < 0.1D) {
/*     */           
/*  82 */           BlockPos _bp = new BlockPos(x, y, z);
/*  83 */           BlockState _bs = ((Block)LatexModBlocks.DARKLATEXPUDDLEHARMLESS.get()).defaultBlockState();
/*  84 */           BlockState _bso = world.getBlockState(_bp);
/*  85 */           for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  86 */             Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  87 */             if (_property != null && _bs.getValue(_property) != null) {
/*     */               try {
/*  89 */                 _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  90 */               } catch (Exception exception) {}
/*     */             } }
/*     */           
/*  93 */           world.setBlock(_bp, _bs, 3);
/*     */         } 
/*     */       }
/*     */ 
/*     */       
/*  98 */       if (Math.random() * 100.0D <= Math.ceil(1.5D / world.getLevelData().getGameRules().getInt(LatexModGameRules.DARKLATEXSPREADSPEED))) {
/*  99 */         if (world.getBlockState(new BlockPos(x - 0.0D, y + 0.0D, z + 1.0D)).getBlock() == LatexModBlocks.DARKLATEXPUDDLEHARMLESS.get() || world
/* 100 */           .getBlockState(new BlockPos(x - 0.0D, y + 0.0D, z + 1.0D)).getBlock() == Blocks.AIR || world
/* 101 */           .getBlockState(new BlockPos(x - 0.0D, y + 0.0D, z + 1.0D)).getBlock() == Blocks.CAVE_AIR || world
/* 102 */           .getBlockState(new BlockPos(x - 0.0D, y + 0.0D, z + 1.0D)).getBlock() == Blocks.VOID_AIR) {
/* 103 */           if (Math.random() < 0.8D)
/*     */           {
/* 105 */             BlockPos _bp = new BlockPos(x, y, z + 1.0D);
/* 106 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXCARPET.get()).defaultBlockState();
/* 107 */             BlockState _bso = world.getBlockState(_bp);
/* 108 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 109 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 110 */               if (_property != null && _bs.getValue(_property) != null) {
/*     */                 try {
/* 112 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 113 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 116 */             world.setBlock(_bp, _bs, 3);
/*     */           }
/*     */         
/*     */         }
/* 120 */         else if (Math.random() < 0.1D) {
/*     */           
/* 122 */           BlockPos _bp = new BlockPos(x, y, z);
/* 123 */           BlockState _bs = ((Block)LatexModBlocks.DARKLATEXPUDDLEHARMLESS.get()).defaultBlockState();
/* 124 */           BlockState _bso = world.getBlockState(_bp);
/* 125 */           for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 126 */             Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 127 */             if (_property != null && _bs.getValue(_property) != null) {
/*     */               try {
/* 129 */                 _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 130 */               } catch (Exception exception) {}
/*     */             } }
/*     */           
/* 133 */           world.setBlock(_bp, _bs, 3);
/*     */         } 
/*     */       }
/*     */ 
/*     */       
/* 138 */       if (Math.random() * 100.0D <= Math.ceil(1.5D / world.getLevelData().getGameRules().getInt(LatexModGameRules.DARKLATEXSPREADSPEED))) {
/* 139 */         if (world.getBlockState(new BlockPos(x - 0.0D, y + 0.0D, z - 1.0D)).getBlock() == LatexModBlocks.DARKLATEXPUDDLEHARMLESS.get() || world
/* 140 */           .getBlockState(new BlockPos(x - 0.0D, y + 0.0D, z - 1.0D)).getBlock() == Blocks.AIR || world
/* 141 */           .getBlockState(new BlockPos(x - 0.0D, y + 0.0D, z - 1.0D)).getBlock() == Blocks.CAVE_AIR || world
/* 142 */           .getBlockState(new BlockPos(x - 0.0D, y + 0.0D, z - 1.0D)).getBlock() == Blocks.VOID_AIR) {
/* 143 */           if (Math.random() < 0.8D)
/*     */           {
/* 145 */             BlockPos _bp = new BlockPos(x, y, z - 1.0D);
/* 146 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXCARPET.get()).defaultBlockState();
/* 147 */             BlockState _bso = world.getBlockState(_bp);
/* 148 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 149 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 150 */               if (_property != null && _bs.getValue(_property) != null) {
/*     */                 try {
/* 152 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 153 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 156 */             world.setBlock(_bp, _bs, 3);
/*     */           }
/*     */         
/*     */         }
/* 160 */         else if (Math.random() < 0.1D) {
/*     */           
/* 162 */           BlockPos _bp = new BlockPos(x, y, z);
/* 163 */           BlockState _bs = ((Block)LatexModBlocks.DARKLATEXPUDDLEHARMLESS.get()).defaultBlockState();
/* 164 */           BlockState _bso = world.getBlockState(_bp);
/* 165 */           for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 166 */             Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 167 */             if (_property != null && _bs.getValue(_property) != null) {
/*     */               try {
/* 169 */                 _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 170 */               } catch (Exception exception) {}
/*     */             } }
/*     */           
/* 173 */           world.setBlock(_bp, _bs, 3);
/*     */         }
/*     */       
/*     */       }
/*     */     }
/* 178 */     else if (Math.random() < 0.05D) {
/*     */       
/* 180 */       BlockPos _bp = new BlockPos(x + 1.0D, y, z);
/* 181 */       BlockState _bs = ((Block)LatexModBlocks.DARKLATEXCARPET.get()).defaultBlockState();
/* 182 */       BlockState _bso = world.getBlockState(_bp);
/* 183 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 184 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 185 */         if (_property != null && _bs.getValue(_property) != null) {
/*     */           try {
/* 187 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 188 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/* 191 */       world.setBlock(_bp, _bs, 3);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarklatexcarpetUpdateTickProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */