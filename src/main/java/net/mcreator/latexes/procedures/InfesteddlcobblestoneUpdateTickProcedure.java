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
/*     */ public class InfesteddlcobblestoneUpdateTickProcedure {
/*     */   public static boolean execute(LevelAccessor world, double x, double y, double z) {
/*  16 */     if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSPREAD) == true) {
/*  17 */       if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSUNLIGHTONLY) == true && 
/*     */ 
/*     */ 
/*     */         
/*  21 */         !(((world.canSeeSkyFromBelowWater(new BlockPos(x, y + 1.0D, z)) || world.canSeeSkyFromBelowWater(new BlockPos(x, y - 1.0D, z)) || world.canSeeSkyFromBelowWater(new BlockPos(x, y, z + 1.0D)) || world.canSeeSkyFromBelowWater(new BlockPos(x, y, z - 1.0D)) || world.canSeeSkyFromBelowWater(new BlockPos(x - 1.0D, y, z)) || world.canSeeSkyFromBelowWater(new BlockPos(x + 1.0D, y, z))) && world.getMaxLocalRawBrightness(new BlockPos(x, y + 1.0D, z)) >= 5) ? 1 : 0)) {
/*  22 */         if (Math.random() * 100.0D <= world.getLevelData().getGameRules().getInt(LatexModGameRules.DARKLATEXSPREADSPEED)) {
/*  23 */           if (world.getBlockState(new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D)).getBlock() == Blocks.COBBLESTONE) {
/*  24 */             if (Math.random() < 0.25D) {
/*     */               
/*  26 */               BlockPos _bp = new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D);
/*  27 */               BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).defaultBlockState();
/*  28 */               BlockState _bso = world.getBlockState(_bp);
/*  29 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  30 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  31 */                 if (_property != null && _bs.getValue(_property) != null) {
/*     */                   try {
/*  33 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  34 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/*  37 */               world.setBlock(_bp, _bs, 3);
/*     */             } else {
/*     */               
/*  40 */               return true;
/*     */             } 
/*  42 */           } else if (world.getFluidState(new BlockPos(x + 1.0D, y, z)).createLegacyBlock().getBlock() == Blocks.WATER || world
/*  43 */             .getFluidState(new BlockPos(x + 1.0D, y, z)).createLegacyBlock().getBlock() == Blocks.WATER) {
/*  44 */             if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXFLUIDS)) {
/*     */               
/*  46 */               BlockPos _bp = new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D);
/*  47 */               BlockState _bs = ((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
/*  48 */               BlockState _bso = world.getBlockState(_bp);
/*  49 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  50 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  51 */                 if (_property != null && _bs.getValue(_property) != null) {
/*     */                   try {
/*  53 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  54 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/*  57 */               world.setBlock(_bp, _bs, 3);
/*     */             } else {
/*     */               
/*  60 */               return true;
/*     */             } 
/*  62 */           } else if (world.getBlockState(new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D)).getBlock() == Blocks.DIRT || world
/*  63 */             .getBlockState(new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D)).getBlock() == Blocks.GRAVEL) {
/*  64 */             if (Math.random() < 0.25D) {
/*     */               
/*  66 */               BlockPos _bp = new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D);
/*  67 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
/*  68 */               BlockState _bso = world.getBlockState(_bp);
/*  69 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  70 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  71 */                 if (_property != null && _bs.getValue(_property) != null) {
/*     */                   try {
/*  73 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  74 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/*  77 */               world.setBlock(_bp, _bs, 3);
/*     */             } else {
/*     */               
/*  80 */               return true;
/*     */             } 
/*     */           } 
/*  83 */           if (world.getBlockState(new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D)).getBlock() == Blocks.COBBLESTONE) {
/*  84 */             if (Math.random() < 0.25D) {
/*     */               
/*  86 */               BlockPos _bp = new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D);
/*  87 */               BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).defaultBlockState();
/*  88 */               BlockState _bso = world.getBlockState(_bp);
/*  89 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  90 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  91 */                 if (_property != null && _bs.getValue(_property) != null) {
/*     */                   try {
/*  93 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  94 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/*  97 */               world.setBlock(_bp, _bs, 3);
/*     */             } else {
/*     */               
/* 100 */               return true;
/*     */             } 
/* 102 */           } else if (world.getBlockState(new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D)).getBlock() == Blocks.DIRT || world
/* 103 */             .getBlockState(new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D)).getBlock() == Blocks.GRAVEL) {
/* 104 */             if (Math.random() < 0.25D) {
/*     */               
/* 106 */               BlockPos _bp = new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D);
/* 107 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
/* 108 */               BlockState _bso = world.getBlockState(_bp);
/* 109 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 110 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 111 */                 if (_property != null && _bs.getValue(_property) != null) {
/*     */                   try {
/* 113 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 114 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/* 117 */               world.setBlock(_bp, _bs, 3);
/*     */             } else {
/*     */               
/* 120 */               return true;
/*     */             } 
/* 122 */           } else if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXFLUIDS)) {
/* 123 */             if (world.getFluidState(new BlockPos(x - 1.0D, y, z)).createLegacyBlock().getBlock() == Blocks.WATER || world
/* 124 */               .getFluidState(new BlockPos(x - 1.0D, y, z)).createLegacyBlock().getBlock() == Blocks.WATER) {
/*     */               
/* 126 */               BlockPos _bp = new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D);
/* 127 */               BlockState _bs = ((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
/* 128 */               BlockState _bso = world.getBlockState(_bp);
/* 129 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 130 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 131 */                 if (_property != null && _bs.getValue(_property) != null) {
/*     */                   try {
/* 133 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 134 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/* 137 */               world.setBlock(_bp, _bs, 3);
/*     */             } else {
/*     */               
/* 140 */               return true;
/*     */             } 
/*     */           } 
/* 143 */           if (world.getBlockState(new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D)).getBlock() == Blocks.COBBLESTONE) {
/* 144 */             if (Math.random() < 0.25D) {
/*     */               
/* 146 */               BlockPos _bp = new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D);
/* 147 */               BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).defaultBlockState();
/* 148 */               BlockState _bso = world.getBlockState(_bp);
/* 149 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 150 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 151 */                 if (_property != null && _bs.getValue(_property) != null) {
/*     */                   try {
/* 153 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 154 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/* 157 */               world.setBlock(_bp, _bs, 3);
/*     */             } else {
/*     */               
/* 160 */               return true;
/*     */             } 
/* 162 */           } else if (world.getFluidState(new BlockPos(x, y + 1.0D, z)).createLegacyBlock().getBlock() == Blocks.WATER || world
/* 163 */             .getFluidState(new BlockPos(x, y - 1.0D, z)).createLegacyBlock().getBlock() == Blocks.WATER) {
/* 164 */             if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXFLUIDS)) {
/*     */               
/* 166 */               BlockPos _bp = new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D);
/* 167 */               BlockState _bs = ((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
/* 168 */               BlockState _bso = world.getBlockState(_bp);
/* 169 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 170 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 171 */                 if (_property != null && _bs.getValue(_property) != null) {
/*     */                   try {
/* 173 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 174 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/* 177 */               world.setBlock(_bp, _bs, 3);
/*     */             } else {
/*     */               
/* 180 */               return true;
/*     */             } 
/* 182 */           } else if (world.getBlockState(new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D)).getBlock() == Blocks.DIRT || world
/* 183 */             .getBlockState(new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D)).getBlock() == Blocks.GRAVEL) {
/* 184 */             if (Math.random() < 0.25D) {
/*     */               
/* 186 */               BlockPos _bp = new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D);
/* 187 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
/* 188 */               BlockState _bso = world.getBlockState(_bp);
/* 189 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 190 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 191 */                 if (_property != null && _bs.getValue(_property) != null) {
/*     */                   try {
/* 193 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 194 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/* 197 */               world.setBlock(_bp, _bs, 3);
/*     */             } else {
/*     */               
/* 200 */               return true;
/*     */             } 
/*     */           } 
/* 203 */           if (world.getBlockState(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).getBlock() == Blocks.COBBLESTONE) {
/* 204 */             if (Math.random() < 0.25D) {
/*     */               
/* 206 */               BlockPos _bp = new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D);
/* 207 */               BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).defaultBlockState();
/* 208 */               BlockState _bso = world.getBlockState(_bp);
/* 209 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 210 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 211 */                 if (_property != null && _bs.getValue(_property) != null) {
/*     */                   try {
/* 213 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 214 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/* 217 */               world.setBlock(_bp, _bs, 3);
/*     */             } else {
/*     */               
/* 220 */               return true;
/*     */             } 
/* 222 */           } else if (world.getBlockState(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).getBlock() == Blocks.DIRT || world
/* 223 */             .getBlockState(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).getBlock() == Blocks.GRAVEL) {
/* 224 */             if (Math.random() < 0.25D) {
/*     */               
/* 226 */               BlockPos _bp = new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D);
/* 227 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
/* 228 */               BlockState _bso = world.getBlockState(_bp);
/* 229 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 230 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 231 */                 if (_property != null && _bs.getValue(_property) != null) {
/*     */                   try {
/* 233 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 234 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/* 237 */               world.setBlock(_bp, _bs, 3);
/*     */             } else {
/*     */               
/* 240 */               return true;
/*     */             } 
/* 242 */           } else if (world.getFluidState(new BlockPos(x, y - 1.0D, z)).createLegacyBlock().getBlock() == Blocks.WATER || world
/* 243 */             .getFluidState(new BlockPos(x, y - 1.0D, z)).createLegacyBlock().getBlock() == Blocks.WATER) {
/* 244 */             if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXFLUIDS)) {
/*     */               
/* 246 */               BlockPos _bp = new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D);
/* 247 */               BlockState _bs = ((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
/* 248 */               BlockState _bso = world.getBlockState(_bp);
/* 249 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 250 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 251 */                 if (_property != null && _bs.getValue(_property) != null) {
/*     */                   try {
/* 253 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 254 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/* 257 */               world.setBlock(_bp, _bs, 3);
/*     */             } else {
/*     */               
/* 260 */               return true;
/*     */             } 
/*     */           } 
/* 263 */           if (world.getBlockState(new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D)).getBlock() == Blocks.COBBLESTONE) {
/* 264 */             if (Math.random() < 0.25D) {
/*     */               
/* 266 */               BlockPos _bp = new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D);
/* 267 */               BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).defaultBlockState();
/* 268 */               BlockState _bso = world.getBlockState(_bp);
/* 269 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 270 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 271 */                 if (_property != null && _bs.getValue(_property) != null) {
/*     */                   try {
/* 273 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 274 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/* 277 */               world.setBlock(_bp, _bs, 3);
/*     */             } else {
/*     */               
/* 280 */               return true;
/*     */             } 
/* 282 */           } else if (world.getBlockState(new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D)).getBlock() == Blocks.DIRT || world
/* 283 */             .getBlockState(new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D)).getBlock() == Blocks.GRAVEL) {
/* 284 */             if (Math.random() < 0.25D) {
/*     */               
/* 286 */               BlockPos _bp = new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D);
/* 287 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
/* 288 */               BlockState _bso = world.getBlockState(_bp);
/* 289 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 290 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 291 */                 if (_property != null && _bs.getValue(_property) != null) {
/*     */                   try {
/* 293 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 294 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/* 297 */               world.setBlock(_bp, _bs, 3);
/*     */             } else {
/*     */               
/* 300 */               return true;
/*     */             } 
/* 302 */           } else if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXFLUIDS)) {
/* 303 */             if (world.getFluidState(new BlockPos(x, y, z + 1.0D)).createLegacyBlock().getBlock() == Blocks.WATER || world
/* 304 */               .getFluidState(new BlockPos(x, y, z + 1.0D)).createLegacyBlock().getBlock() == Blocks.WATER) {
/*     */               
/* 306 */               BlockPos _bp = new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D);
/* 307 */               BlockState _bs = ((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
/* 308 */               BlockState _bso = world.getBlockState(_bp);
/* 309 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 310 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 311 */                 if (_property != null && _bs.getValue(_property) != null) {
/*     */                   try {
/* 313 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 314 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/* 317 */               world.setBlock(_bp, _bs, 3);
/*     */             } else {
/*     */               
/* 320 */               return true;
/*     */             } 
/*     */           } 
/* 323 */           if (world.getBlockState(new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D)).getBlock() == Blocks.COBBLESTONE) {
/* 324 */             if (world.getBlockState(new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D)).getBlock() == Blocks.COBBLESTONE) {
/* 325 */               if (Math.random() < 0.25D) {
/*     */                 
/* 327 */                 BlockPos _bp = new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D);
/* 328 */                 BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).defaultBlockState();
/* 329 */                 BlockState _bso = world.getBlockState(_bp);
/* 330 */                 for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 331 */                   Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 332 */                   if (_property != null && _bs.getValue(_property) != null) {
/*     */                     try {
/* 334 */                       _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 335 */                     } catch (Exception exception) {}
/*     */                   } }
/*     */                 
/* 338 */                 world.setBlock(_bp, _bs, 3);
/*     */               } else {
/*     */                 
/* 341 */                 return true;
/*     */               } 
/*     */             }
/* 344 */           } else if (world.getBlockState(new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D)).getBlock() == Blocks.DIRT || world
/* 345 */             .getBlockState(new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D)).getBlock() == Blocks.GRAVEL) {
/* 346 */             if (Math.random() < 0.25D) {
/*     */               
/* 348 */               BlockPos _bp = new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D);
/* 349 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
/* 350 */               BlockState _bso = world.getBlockState(_bp);
/* 351 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 352 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 353 */                 if (_property != null && _bs.getValue(_property) != null) {
/*     */                   try {
/* 355 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 356 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/* 359 */               world.setBlock(_bp, _bs, 3);
/*     */             } else {
/*     */               
/* 362 */               return true;
/*     */             } 
/* 364 */           } else if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXFLUIDS)) {
/* 365 */             if (world.getFluidState(new BlockPos(x, y, z - 1.0D)).createLegacyBlock().getBlock() == Blocks.WATER || world
/* 366 */               .getFluidState(new BlockPos(x, y, z - 1.0D)).createLegacyBlock().getBlock() == Blocks.WATER) {
/*     */               
/* 368 */               BlockPos _bp = new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D);
/* 369 */               BlockState _bs = ((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
/* 370 */               BlockState _bso = world.getBlockState(_bp);
/* 371 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 372 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 373 */                 if (_property != null && _bs.getValue(_property) != null) {
/*     */                   try {
/* 375 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 376 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/* 379 */               world.setBlock(_bp, _bs, 3);
/*     */             } else {
/*     */               
/* 382 */               return true;
/*     */             }
/*     */           
/*     */           } 
/*     */         } 
/* 387 */       } else if (Math.random() * 100.0D <= world.getLevelData().getGameRules().getInt(LatexModGameRules.DARKLATEXSPREADSPEED)) {
/* 388 */         if (world.getBlockState(new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D)).getBlock() == Blocks.COBBLESTONE) {
/* 389 */           if (Math.random() < 0.25D) {
/*     */             
/* 391 */             BlockPos _bp = new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D);
/* 392 */             BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).defaultBlockState();
/* 393 */             BlockState _bso = world.getBlockState(_bp);
/* 394 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 395 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 396 */               if (_property != null && _bs.getValue(_property) != null) {
/*     */                 try {
/* 398 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 399 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 402 */             world.setBlock(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 405 */             return true;
/*     */           } 
/* 407 */         } else if (world.getFluidState(new BlockPos(x + 1.0D, y, z)).createLegacyBlock().getBlock() == Blocks.WATER || world
/* 408 */           .getFluidState(new BlockPos(x + 1.0D, y, z)).createLegacyBlock().getBlock() == Blocks.WATER) {
/* 409 */           if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXFLUIDS)) {
/*     */             
/* 411 */             BlockPos _bp = new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D);
/* 412 */             BlockState _bs = ((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
/* 413 */             BlockState _bso = world.getBlockState(_bp);
/* 414 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 415 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 416 */               if (_property != null && _bs.getValue(_property) != null) {
/*     */                 try {
/* 418 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 419 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 422 */             world.setBlock(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 425 */             return true;
/*     */           } 
/* 427 */         } else if (world.getBlockState(new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D)).getBlock() == Blocks.DIRT || world
/* 428 */           .getBlockState(new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D)).getBlock() == Blocks.GRAVEL) {
/* 429 */           if (Math.random() < 0.25D) {
/*     */             
/* 431 */             BlockPos _bp = new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D);
/* 432 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
/* 433 */             BlockState _bso = world.getBlockState(_bp);
/* 434 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 435 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 436 */               if (_property != null && _bs.getValue(_property) != null) {
/*     */                 try {
/* 438 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 439 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 442 */             world.setBlock(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 445 */             return true;
/*     */           } 
/*     */         } 
/* 448 */         if (world.getBlockState(new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D)).getBlock() == Blocks.COBBLESTONE) {
/* 449 */           if (Math.random() < 0.25D) {
/*     */             
/* 451 */             BlockPos _bp = new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D);
/* 452 */             BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).defaultBlockState();
/* 453 */             BlockState _bso = world.getBlockState(_bp);
/* 454 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 455 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 456 */               if (_property != null && _bs.getValue(_property) != null) {
/*     */                 try {
/* 458 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 459 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 462 */             world.setBlock(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 465 */             return true;
/*     */           } 
/* 467 */         } else if (world.getBlockState(new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D)).getBlock() == Blocks.DIRT || world
/* 468 */           .getBlockState(new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D)).getBlock() == Blocks.GRAVEL) {
/* 469 */           if (Math.random() < 0.25D) {
/*     */             
/* 471 */             BlockPos _bp = new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D);
/* 472 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
/* 473 */             BlockState _bso = world.getBlockState(_bp);
/* 474 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 475 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 476 */               if (_property != null && _bs.getValue(_property) != null) {
/*     */                 try {
/* 478 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 479 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 482 */             world.setBlock(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 485 */             return true;
/*     */           } 
/* 487 */         } else if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXFLUIDS)) {
/* 488 */           if (world.getFluidState(new BlockPos(x - 1.0D, y, z)).createLegacyBlock().getBlock() == Blocks.WATER || world
/* 489 */             .getFluidState(new BlockPos(x - 1.0D, y, z)).createLegacyBlock().getBlock() == Blocks.WATER) {
/*     */             
/* 491 */             BlockPos _bp = new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D);
/* 492 */             BlockState _bs = ((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
/* 493 */             BlockState _bso = world.getBlockState(_bp);
/* 494 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 495 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 496 */               if (_property != null && _bs.getValue(_property) != null) {
/*     */                 try {
/* 498 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 499 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 502 */             world.setBlock(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 505 */             return true;
/*     */           } 
/*     */         } 
/* 508 */         if (world.getBlockState(new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D)).getBlock() == Blocks.COBBLESTONE) {
/* 509 */           if (Math.random() < 0.25D) {
/*     */             
/* 511 */             BlockPos _bp = new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D);
/* 512 */             BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).defaultBlockState();
/* 513 */             BlockState _bso = world.getBlockState(_bp);
/* 514 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 515 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 516 */               if (_property != null && _bs.getValue(_property) != null) {
/*     */                 try {
/* 518 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 519 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 522 */             world.setBlock(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 525 */             return true;
/*     */           } 
/* 527 */         } else if (world.getFluidState(new BlockPos(x, y + 1.0D, z)).createLegacyBlock().getBlock() == Blocks.WATER || world
/* 528 */           .getFluidState(new BlockPos(x, y - 1.0D, z)).createLegacyBlock().getBlock() == Blocks.WATER) {
/* 529 */           if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXFLUIDS)) {
/*     */             
/* 531 */             BlockPos _bp = new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D);
/* 532 */             BlockState _bs = ((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
/* 533 */             BlockState _bso = world.getBlockState(_bp);
/* 534 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 535 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 536 */               if (_property != null && _bs.getValue(_property) != null) {
/*     */                 try {
/* 538 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 539 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 542 */             world.setBlock(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 545 */             return true;
/*     */           } 
/* 547 */         } else if (world.getBlockState(new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D)).getBlock() == Blocks.DIRT || world
/* 548 */           .getBlockState(new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D)).getBlock() == Blocks.GRAVEL) {
/* 549 */           if (Math.random() < 0.25D) {
/*     */             
/* 551 */             BlockPos _bp = new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D);
/* 552 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
/* 553 */             BlockState _bso = world.getBlockState(_bp);
/* 554 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 555 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 556 */               if (_property != null && _bs.getValue(_property) != null) {
/*     */                 try {
/* 558 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 559 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 562 */             world.setBlock(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 565 */             return true;
/*     */           } 
/*     */         } 
/* 568 */         if (world.getBlockState(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).getBlock() == Blocks.COBBLESTONE) {
/* 569 */           if (Math.random() < 0.25D) {
/*     */             
/* 571 */             BlockPos _bp = new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D);
/* 572 */             BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).defaultBlockState();
/* 573 */             BlockState _bso = world.getBlockState(_bp);
/* 574 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 575 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 576 */               if (_property != null && _bs.getValue(_property) != null) {
/*     */                 try {
/* 578 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 579 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 582 */             world.setBlock(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 585 */             return true;
/*     */           } 
/* 587 */         } else if (world.getBlockState(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).getBlock() == Blocks.DIRT || world
/* 588 */           .getBlockState(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).getBlock() == Blocks.GRAVEL) {
/* 589 */           if (Math.random() < 0.25D) {
/*     */             
/* 591 */             BlockPos _bp = new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D);
/* 592 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
/* 593 */             BlockState _bso = world.getBlockState(_bp);
/* 594 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 595 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 596 */               if (_property != null && _bs.getValue(_property) != null) {
/*     */                 try {
/* 598 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 599 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 602 */             world.setBlock(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 605 */             return true;
/*     */           } 
/* 607 */         } else if (world.getFluidState(new BlockPos(x, y - 1.0D, z)).createLegacyBlock().getBlock() == Blocks.WATER || world
/* 608 */           .getFluidState(new BlockPos(x, y - 1.0D, z)).createLegacyBlock().getBlock() == Blocks.WATER) {
/* 609 */           if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXFLUIDS)) {
/*     */             
/* 611 */             BlockPos _bp = new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D);
/* 612 */             BlockState _bs = ((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
/* 613 */             BlockState _bso = world.getBlockState(_bp);
/* 614 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 615 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 616 */               if (_property != null && _bs.getValue(_property) != null) {
/*     */                 try {
/* 618 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 619 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 622 */             world.setBlock(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 625 */             return true;
/*     */           } 
/*     */         } 
/* 628 */         if (world.getBlockState(new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D)).getBlock() == Blocks.COBBLESTONE) {
/* 629 */           if (Math.random() < 0.25D) {
/*     */             
/* 631 */             BlockPos _bp = new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D);
/* 632 */             BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).defaultBlockState();
/* 633 */             BlockState _bso = world.getBlockState(_bp);
/* 634 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 635 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 636 */               if (_property != null && _bs.getValue(_property) != null) {
/*     */                 try {
/* 638 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 639 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 642 */             world.setBlock(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 645 */             return true;
/*     */           } 
/* 647 */         } else if (world.getBlockState(new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D)).getBlock() == Blocks.DIRT || world
/* 648 */           .getBlockState(new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D)).getBlock() == Blocks.GRAVEL) {
/* 649 */           if (Math.random() < 0.25D) {
/*     */             
/* 651 */             BlockPos _bp = new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D);
/* 652 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
/* 653 */             BlockState _bso = world.getBlockState(_bp);
/* 654 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 655 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 656 */               if (_property != null && _bs.getValue(_property) != null) {
/*     */                 try {
/* 658 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 659 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 662 */             world.setBlock(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 665 */             return true;
/*     */           } 
/* 667 */         } else if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXFLUIDS)) {
/* 668 */           if (world.getFluidState(new BlockPos(x, y, z + 1.0D)).createLegacyBlock().getBlock() == Blocks.WATER || world
/* 669 */             .getFluidState(new BlockPos(x, y, z + 1.0D)).createLegacyBlock().getBlock() == Blocks.WATER) {
/*     */             
/* 671 */             BlockPos _bp = new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D);
/* 672 */             BlockState _bs = ((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
/* 673 */             BlockState _bso = world.getBlockState(_bp);
/* 674 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 675 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 676 */               if (_property != null && _bs.getValue(_property) != null) {
/*     */                 try {
/* 678 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 679 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 682 */             world.setBlock(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 685 */             return true;
/*     */           } 
/*     */         } 
/* 688 */         if (world.getBlockState(new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D)).getBlock() == Blocks.COBBLESTONE) {
/* 689 */           if (world.getBlockState(new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D)).getBlock() == Blocks.COBBLESTONE) {
/* 690 */             if (Math.random() < 0.25D) {
/*     */               
/* 692 */               BlockPos _bp = new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D);
/* 693 */               BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).defaultBlockState();
/* 694 */               BlockState _bso = world.getBlockState(_bp);
/* 695 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 696 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 697 */                 if (_property != null && _bs.getValue(_property) != null) {
/*     */                   try {
/* 699 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 700 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/* 703 */               world.setBlock(_bp, _bs, 3);
/*     */             } else {
/*     */               
/* 706 */               return true;
/*     */             } 
/*     */           }
/* 709 */         } else if (world.getBlockState(new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D)).getBlock() == Blocks.DIRT || world
/* 710 */           .getBlockState(new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D)).getBlock() == Blocks.GRAVEL) {
/* 711 */           if (Math.random() < 0.25D) {
/*     */             
/* 713 */             BlockPos _bp = new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D);
/* 714 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
/* 715 */             BlockState _bso = world.getBlockState(_bp);
/* 716 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 717 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 718 */               if (_property != null && _bs.getValue(_property) != null) {
/*     */                 try {
/* 720 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 721 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 724 */             world.setBlock(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 727 */             return true;
/*     */           } 
/* 729 */         } else if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXFLUIDS)) {
/* 730 */           if (world.getFluidState(new BlockPos(x, y, z - 1.0D)).createLegacyBlock().getBlock() == Blocks.WATER || world
/* 731 */             .getFluidState(new BlockPos(x, y, z - 1.0D)).createLegacyBlock().getBlock() == Blocks.WATER) {
/*     */             
/* 733 */             BlockPos _bp = new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D);
/* 734 */             BlockState _bs = ((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
/* 735 */             BlockState _bso = world.getBlockState(_bp);
/* 736 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 737 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 738 */               if (_property != null && _bs.getValue(_property) != null) {
/*     */                 try {
/* 740 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 741 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 744 */             world.setBlock(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 747 */             return true;
/*     */           } 
/*     */         } 
/*     */       } 
/*     */     }
/*     */     
/* 753 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\InfesteddlcobblestoneUpdateTickProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */