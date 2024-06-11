/*     */ package net.ltxprogrammer.turned.procedures;
/*     */ import com.google.common.collect.UnmodifiableIterator;
/*     */ import java.util.Map;
/*     */ import net.ltxprogrammer.changed.init.ChangedBlocks;
/*     */ import net.ltxprogrammer.turned.init.LatexModBlocks;
/*     */ import net.ltxprogrammer.turned.init.LatexModGameRules;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraft.world.level.block.state.properties.Property;
/*     */ 
/*     */ public class InfesteddlcobblestoneUpdateTickProcedure {
/*     */   public static boolean execute(LevelAccessor world, double x, double y, double z) {
/*  16 */     if (world.m_6106_().m_5470_().m_46207_(LatexModGameRules.DARKLATEXSPREAD) == true) {
/*  17 */       if (world.m_6106_().m_5470_().m_46207_(LatexModGameRules.DARKLATEXSUNLIGHTONLY) == true && 
/*     */ 
/*     */ 
/*     */         
/*  21 */         !(((world.m_46861_(new BlockPos(x, y + 1.0D, z)) || world.m_46861_(new BlockPos(x, y - 1.0D, z)) || world.m_46861_(new BlockPos(x, y, z + 1.0D)) || world.m_46861_(new BlockPos(x, y, z - 1.0D)) || world.m_46861_(new BlockPos(x - 1.0D, y, z)) || world.m_46861_(new BlockPos(x + 1.0D, y, z))) && world.m_46803_(new BlockPos(x, y + 1.0D, z)) >= 5) ? 1 : 0)) {
/*  22 */         if (Math.random() * 100.0D <= world.m_6106_().m_5470_().m_46215_(LatexModGameRules.DARKLATEXSPREADSPEED)) {
/*  23 */           if (world.m_8055_(new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D)).m_60734_() == Blocks.f_50652_) {
/*  24 */             if (Math.random() < 0.25D) {
/*     */               
/*  26 */               BlockPos _bp = new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D);
/*  27 */               BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).m_49966_();
/*  28 */               BlockState _bso = world.m_8055_(_bp);
/*  29 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  30 */                 Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/*  31 */                 if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                   try {
/*  33 */                     _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/*  34 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/*  37 */               world.m_7731_(_bp, _bs, 3);
/*     */             } else {
/*     */               
/*  40 */               return true;
/*     */             } 
/*  42 */           } else if (world.m_6425_(new BlockPos(x + 1.0D, y, z)).m_76188_().m_60734_() == Blocks.f_49990_ || world
/*  43 */             .m_6425_(new BlockPos(x + 1.0D, y, z)).m_76188_().m_60734_() == Blocks.f_49990_) {
/*  44 */             if (world.m_6106_().m_5470_().m_46207_(LatexModGameRules.DARKLATEXFLUIDS)) {
/*     */               
/*  46 */               BlockPos _bp = new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D);
/*  47 */               BlockState _bs = ((Block)ChangedBlocks.DARK_LATEX_FLUID.get()).m_49966_();
/*  48 */               BlockState _bso = world.m_8055_(_bp);
/*  49 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  50 */                 Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/*  51 */                 if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                   try {
/*  53 */                     _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/*  54 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/*  57 */               world.m_7731_(_bp, _bs, 3);
/*     */             } else {
/*     */               
/*  60 */               return true;
/*     */             } 
/*  62 */           } else if (world.m_8055_(new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D)).m_60734_() == Blocks.f_50493_ || world
/*  63 */             .m_8055_(new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D)).m_60734_() == Blocks.f_49994_) {
/*  64 */             if (Math.random() < 0.25D) {
/*     */               
/*  66 */               BlockPos _bp = new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D);
/*  67 */               BlockState _bs = ((Block)ChangedBlocks.DARK_LATEX_BLOCK.get()).m_49966_();
/*  68 */               BlockState _bso = world.m_8055_(_bp);
/*  69 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  70 */                 Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/*  71 */                 if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                   try {
/*  73 */                     _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/*  74 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/*  77 */               world.m_7731_(_bp, _bs, 3);
/*     */             } else {
/*     */               
/*  80 */               return true;
/*     */             } 
/*     */           } 
/*  83 */           if (world.m_8055_(new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D)).m_60734_() == Blocks.f_50652_) {
/*  84 */             if (Math.random() < 0.25D) {
/*     */               
/*  86 */               BlockPos _bp = new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D);
/*  87 */               BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).m_49966_();
/*  88 */               BlockState _bso = world.m_8055_(_bp);
/*  89 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  90 */                 Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/*  91 */                 if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                   try {
/*  93 */                     _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/*  94 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/*  97 */               world.m_7731_(_bp, _bs, 3);
/*     */             } else {
/*     */               
/* 100 */               return true;
/*     */             } 
/* 102 */           } else if (world.m_8055_(new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D)).m_60734_() == Blocks.f_50493_ || world
/* 103 */             .m_8055_(new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D)).m_60734_() == Blocks.f_49994_) {
/* 104 */             if (Math.random() < 0.25D) {
/*     */               
/* 106 */               BlockPos _bp = new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D);
/* 107 */               BlockState _bs = ((Block)ChangedBlocks.DARK_LATEX_BLOCK.get()).m_49966_();
/* 108 */               BlockState _bso = world.m_8055_(_bp);
/* 109 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 110 */                 Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 111 */                 if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                   try {
/* 113 */                     _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 114 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/* 117 */               world.m_7731_(_bp, _bs, 3);
/*     */             } else {
/*     */               
/* 120 */               return true;
/*     */             } 
/* 122 */           } else if (world.m_6106_().m_5470_().m_46207_(LatexModGameRules.DARKLATEXFLUIDS)) {
/* 123 */             if (world.m_6425_(new BlockPos(x - 1.0D, y, z)).m_76188_().m_60734_() == Blocks.f_49990_ || world
/* 124 */               .m_6425_(new BlockPos(x - 1.0D, y, z)).m_76188_().m_60734_() == Blocks.f_49990_) {
/*     */               
/* 126 */               BlockPos _bp = new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D);
/* 127 */               BlockState _bs = ((Block)ChangedBlocks.DARK_LATEX_FLUID.get()).m_49966_();
/* 128 */               BlockState _bso = world.m_8055_(_bp);
/* 129 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 130 */                 Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 131 */                 if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                   try {
/* 133 */                     _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 134 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/* 137 */               world.m_7731_(_bp, _bs, 3);
/*     */             } else {
/*     */               
/* 140 */               return true;
/*     */             } 
/*     */           } 
/* 143 */           if (world.m_8055_(new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D)).m_60734_() == Blocks.f_50652_) {
/* 144 */             if (Math.random() < 0.25D) {
/*     */               
/* 146 */               BlockPos _bp = new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D);
/* 147 */               BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).m_49966_();
/* 148 */               BlockState _bso = world.m_8055_(_bp);
/* 149 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 150 */                 Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 151 */                 if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                   try {
/* 153 */                     _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 154 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/* 157 */               world.m_7731_(_bp, _bs, 3);
/*     */             } else {
/*     */               
/* 160 */               return true;
/*     */             } 
/* 162 */           } else if (world.m_6425_(new BlockPos(x, y + 1.0D, z)).m_76188_().m_60734_() == Blocks.f_49990_ || world
/* 163 */             .m_6425_(new BlockPos(x, y - 1.0D, z)).m_76188_().m_60734_() == Blocks.f_49990_) {
/* 164 */             if (world.m_6106_().m_5470_().m_46207_(LatexModGameRules.DARKLATEXFLUIDS)) {
/*     */               
/* 166 */               BlockPos _bp = new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D);
/* 167 */               BlockState _bs = ((Block)ChangedBlocks.DARK_LATEX_FLUID.get()).m_49966_();
/* 168 */               BlockState _bso = world.m_8055_(_bp);
/* 169 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 170 */                 Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 171 */                 if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                   try {
/* 173 */                     _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 174 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/* 177 */               world.m_7731_(_bp, _bs, 3);
/*     */             } else {
/*     */               
/* 180 */               return true;
/*     */             } 
/* 182 */           } else if (world.m_8055_(new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D)).m_60734_() == Blocks.f_50493_ || world
/* 183 */             .m_8055_(new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D)).m_60734_() == Blocks.f_49994_) {
/* 184 */             if (Math.random() < 0.25D) {
/*     */               
/* 186 */               BlockPos _bp = new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D);
/* 187 */               BlockState _bs = ((Block)ChangedBlocks.DARK_LATEX_BLOCK.get()).m_49966_();
/* 188 */               BlockState _bso = world.m_8055_(_bp);
/* 189 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 190 */                 Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 191 */                 if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                   try {
/* 193 */                     _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 194 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/* 197 */               world.m_7731_(_bp, _bs, 3);
/*     */             } else {
/*     */               
/* 200 */               return true;
/*     */             } 
/*     */           } 
/* 203 */           if (world.m_8055_(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).m_60734_() == Blocks.f_50652_) {
/* 204 */             if (Math.random() < 0.25D) {
/*     */               
/* 206 */               BlockPos _bp = new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D);
/* 207 */               BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).m_49966_();
/* 208 */               BlockState _bso = world.m_8055_(_bp);
/* 209 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 210 */                 Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 211 */                 if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                   try {
/* 213 */                     _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 214 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/* 217 */               world.m_7731_(_bp, _bs, 3);
/*     */             } else {
/*     */               
/* 220 */               return true;
/*     */             } 
/* 222 */           } else if (world.m_8055_(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).m_60734_() == Blocks.f_50493_ || world
/* 223 */             .m_8055_(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).m_60734_() == Blocks.f_49994_) {
/* 224 */             if (Math.random() < 0.25D) {
/*     */               
/* 226 */               BlockPos _bp = new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D);
/* 227 */               BlockState _bs = ((Block)ChangedBlocks.DARK_LATEX_BLOCK.get()).m_49966_();
/* 228 */               BlockState _bso = world.m_8055_(_bp);
/* 229 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 230 */                 Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 231 */                 if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                   try {
/* 233 */                     _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 234 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/* 237 */               world.m_7731_(_bp, _bs, 3);
/*     */             } else {
/*     */               
/* 240 */               return true;
/*     */             } 
/* 242 */           } else if (world.m_6425_(new BlockPos(x, y - 1.0D, z)).m_76188_().m_60734_() == Blocks.f_49990_ || world
/* 243 */             .m_6425_(new BlockPos(x, y - 1.0D, z)).m_76188_().m_60734_() == Blocks.f_49990_) {
/* 244 */             if (world.m_6106_().m_5470_().m_46207_(LatexModGameRules.DARKLATEXFLUIDS)) {
/*     */               
/* 246 */               BlockPos _bp = new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D);
/* 247 */               BlockState _bs = ((Block)ChangedBlocks.DARK_LATEX_FLUID.get()).m_49966_();
/* 248 */               BlockState _bso = world.m_8055_(_bp);
/* 249 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 250 */                 Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 251 */                 if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                   try {
/* 253 */                     _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 254 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/* 257 */               world.m_7731_(_bp, _bs, 3);
/*     */             } else {
/*     */               
/* 260 */               return true;
/*     */             } 
/*     */           } 
/* 263 */           if (world.m_8055_(new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D)).m_60734_() == Blocks.f_50652_) {
/* 264 */             if (Math.random() < 0.25D) {
/*     */               
/* 266 */               BlockPos _bp = new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D);
/* 267 */               BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).m_49966_();
/* 268 */               BlockState _bso = world.m_8055_(_bp);
/* 269 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 270 */                 Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 271 */                 if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                   try {
/* 273 */                     _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 274 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/* 277 */               world.m_7731_(_bp, _bs, 3);
/*     */             } else {
/*     */               
/* 280 */               return true;
/*     */             } 
/* 282 */           } else if (world.m_8055_(new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D)).m_60734_() == Blocks.f_50493_ || world
/* 283 */             .m_8055_(new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D)).m_60734_() == Blocks.f_49994_) {
/* 284 */             if (Math.random() < 0.25D) {
/*     */               
/* 286 */               BlockPos _bp = new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D);
/* 287 */               BlockState _bs = ((Block)ChangedBlocks.DARK_LATEX_BLOCK.get()).m_49966_();
/* 288 */               BlockState _bso = world.m_8055_(_bp);
/* 289 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 290 */                 Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 291 */                 if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                   try {
/* 293 */                     _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 294 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/* 297 */               world.m_7731_(_bp, _bs, 3);
/*     */             } else {
/*     */               
/* 300 */               return true;
/*     */             } 
/* 302 */           } else if (world.m_6106_().m_5470_().m_46207_(LatexModGameRules.DARKLATEXFLUIDS)) {
/* 303 */             if (world.m_6425_(new BlockPos(x, y, z + 1.0D)).m_76188_().m_60734_() == Blocks.f_49990_ || world
/* 304 */               .m_6425_(new BlockPos(x, y, z + 1.0D)).m_76188_().m_60734_() == Blocks.f_49990_) {
/*     */               
/* 306 */               BlockPos _bp = new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D);
/* 307 */               BlockState _bs = ((Block)ChangedBlocks.DARK_LATEX_FLUID.get()).m_49966_();
/* 308 */               BlockState _bso = world.m_8055_(_bp);
/* 309 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 310 */                 Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 311 */                 if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                   try {
/* 313 */                     _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 314 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/* 317 */               world.m_7731_(_bp, _bs, 3);
/*     */             } else {
/*     */               
/* 320 */               return true;
/*     */             } 
/*     */           } 
/* 323 */           if (world.m_8055_(new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D)).m_60734_() == Blocks.f_50652_) {
/* 324 */             if (world.m_8055_(new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D)).m_60734_() == Blocks.f_50652_) {
/* 325 */               if (Math.random() < 0.25D) {
/*     */                 
/* 327 */                 BlockPos _bp = new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D);
/* 328 */                 BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).m_49966_();
/* 329 */                 BlockState _bso = world.m_8055_(_bp);
/* 330 */                 for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 331 */                   Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 332 */                   if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                     try {
/* 334 */                       _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 335 */                     } catch (Exception exception) {}
/*     */                   } }
/*     */                 
/* 338 */                 world.m_7731_(_bp, _bs, 3);
/*     */               } else {
/*     */                 
/* 341 */                 return true;
/*     */               } 
/*     */             }
/* 344 */           } else if (world.m_8055_(new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D)).m_60734_() == Blocks.f_50493_ || world
/* 345 */             .m_8055_(new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D)).m_60734_() == Blocks.f_49994_) {
/* 346 */             if (Math.random() < 0.25D) {
/*     */               
/* 348 */               BlockPos _bp = new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D);
/* 349 */               BlockState _bs = ((Block)ChangedBlocks.DARK_LATEX_BLOCK.get()).m_49966_();
/* 350 */               BlockState _bso = world.m_8055_(_bp);
/* 351 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 352 */                 Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 353 */                 if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                   try {
/* 355 */                     _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 356 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/* 359 */               world.m_7731_(_bp, _bs, 3);
/*     */             } else {
/*     */               
/* 362 */               return true;
/*     */             } 
/* 364 */           } else if (world.m_6106_().m_5470_().m_46207_(LatexModGameRules.DARKLATEXFLUIDS)) {
/* 365 */             if (world.m_6425_(new BlockPos(x, y, z - 1.0D)).m_76188_().m_60734_() == Blocks.f_49990_ || world
/* 366 */               .m_6425_(new BlockPos(x, y, z - 1.0D)).m_76188_().m_60734_() == Blocks.f_49990_) {
/*     */               
/* 368 */               BlockPos _bp = new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D);
/* 369 */               BlockState _bs = ((Block)ChangedBlocks.DARK_LATEX_FLUID.get()).m_49966_();
/* 370 */               BlockState _bso = world.m_8055_(_bp);
/* 371 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 372 */                 Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 373 */                 if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                   try {
/* 375 */                     _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 376 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/* 379 */               world.m_7731_(_bp, _bs, 3);
/*     */             } else {
/*     */               
/* 382 */               return true;
/*     */             }
/*     */           
/*     */           } 
/*     */         } 
/* 387 */       } else if (Math.random() * 100.0D <= world.m_6106_().m_5470_().m_46215_(LatexModGameRules.DARKLATEXSPREADSPEED)) {
/* 388 */         if (world.m_8055_(new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D)).m_60734_() == Blocks.f_50652_) {
/* 389 */           if (Math.random() < 0.25D) {
/*     */             
/* 391 */             BlockPos _bp = new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D);
/* 392 */             BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).m_49966_();
/* 393 */             BlockState _bso = world.m_8055_(_bp);
/* 394 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 395 */               Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 396 */               if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                 try {
/* 398 */                   _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 399 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 402 */             world.m_7731_(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 405 */             return true;
/*     */           } 
/* 407 */         } else if (world.m_6425_(new BlockPos(x + 1.0D, y, z)).m_76188_().m_60734_() == Blocks.f_49990_ || world
/* 408 */           .m_6425_(new BlockPos(x + 1.0D, y, z)).m_76188_().m_60734_() == Blocks.f_49990_) {
/* 409 */           if (world.m_6106_().m_5470_().m_46207_(LatexModGameRules.DARKLATEXFLUIDS)) {
/*     */             
/* 411 */             BlockPos _bp = new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D);
/* 412 */             BlockState _bs = ((Block)ChangedBlocks.DARK_LATEX_FLUID.get()).m_49966_();
/* 413 */             BlockState _bso = world.m_8055_(_bp);
/* 414 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 415 */               Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 416 */               if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                 try {
/* 418 */                   _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 419 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 422 */             world.m_7731_(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 425 */             return true;
/*     */           } 
/* 427 */         } else if (world.m_8055_(new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D)).m_60734_() == Blocks.f_50493_ || world
/* 428 */           .m_8055_(new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D)).m_60734_() == Blocks.f_49994_) {
/* 429 */           if (Math.random() < 0.25D) {
/*     */             
/* 431 */             BlockPos _bp = new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D);
/* 432 */             BlockState _bs = ((Block)ChangedBlocks.DARK_LATEX_BLOCK.get()).m_49966_();
/* 433 */             BlockState _bso = world.m_8055_(_bp);
/* 434 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 435 */               Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 436 */               if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                 try {
/* 438 */                   _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 439 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 442 */             world.m_7731_(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 445 */             return true;
/*     */           } 
/*     */         } 
/* 448 */         if (world.m_8055_(new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D)).m_60734_() == Blocks.f_50652_) {
/* 449 */           if (Math.random() < 0.25D) {
/*     */             
/* 451 */             BlockPos _bp = new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D);
/* 452 */             BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).m_49966_();
/* 453 */             BlockState _bso = world.m_8055_(_bp);
/* 454 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 455 */               Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 456 */               if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                 try {
/* 458 */                   _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 459 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 462 */             world.m_7731_(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 465 */             return true;
/*     */           } 
/* 467 */         } else if (world.m_8055_(new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D)).m_60734_() == Blocks.f_50493_ || world
/* 468 */           .m_8055_(new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D)).m_60734_() == Blocks.f_49994_) {
/* 469 */           if (Math.random() < 0.25D) {
/*     */             
/* 471 */             BlockPos _bp = new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D);
/* 472 */             BlockState _bs = ((Block)ChangedBlocks.DARK_LATEX_BLOCK.get()).m_49966_();
/* 473 */             BlockState _bso = world.m_8055_(_bp);
/* 474 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 475 */               Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 476 */               if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                 try {
/* 478 */                   _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 479 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 482 */             world.m_7731_(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 485 */             return true;
/*     */           } 
/* 487 */         } else if (world.m_6106_().m_5470_().m_46207_(LatexModGameRules.DARKLATEXFLUIDS)) {
/* 488 */           if (world.m_6425_(new BlockPos(x - 1.0D, y, z)).m_76188_().m_60734_() == Blocks.f_49990_ || world
/* 489 */             .m_6425_(new BlockPos(x - 1.0D, y, z)).m_76188_().m_60734_() == Blocks.f_49990_) {
/*     */             
/* 491 */             BlockPos _bp = new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D);
/* 492 */             BlockState _bs = ((Block)ChangedBlocks.DARK_LATEX_FLUID.get()).m_49966_();
/* 493 */             BlockState _bso = world.m_8055_(_bp);
/* 494 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 495 */               Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 496 */               if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                 try {
/* 498 */                   _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 499 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 502 */             world.m_7731_(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 505 */             return true;
/*     */           } 
/*     */         } 
/* 508 */         if (world.m_8055_(new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D)).m_60734_() == Blocks.f_50652_) {
/* 509 */           if (Math.random() < 0.25D) {
/*     */             
/* 511 */             BlockPos _bp = new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D);
/* 512 */             BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).m_49966_();
/* 513 */             BlockState _bso = world.m_8055_(_bp);
/* 514 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 515 */               Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 516 */               if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                 try {
/* 518 */                   _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 519 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 522 */             world.m_7731_(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 525 */             return true;
/*     */           } 
/* 527 */         } else if (world.m_6425_(new BlockPos(x, y + 1.0D, z)).m_76188_().m_60734_() == Blocks.f_49990_ || world
/* 528 */           .m_6425_(new BlockPos(x, y - 1.0D, z)).m_76188_().m_60734_() == Blocks.f_49990_) {
/* 529 */           if (world.m_6106_().m_5470_().m_46207_(LatexModGameRules.DARKLATEXFLUIDS)) {
/*     */             
/* 531 */             BlockPos _bp = new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D);
/* 532 */             BlockState _bs = ((Block)ChangedBlocks.DARK_LATEX_FLUID.get()).m_49966_();
/* 533 */             BlockState _bso = world.m_8055_(_bp);
/* 534 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 535 */               Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 536 */               if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                 try {
/* 538 */                   _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 539 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 542 */             world.m_7731_(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 545 */             return true;
/*     */           } 
/* 547 */         } else if (world.m_8055_(new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D)).m_60734_() == Blocks.f_50493_ || world
/* 548 */           .m_8055_(new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D)).m_60734_() == Blocks.f_49994_) {
/* 549 */           if (Math.random() < 0.25D) {
/*     */             
/* 551 */             BlockPos _bp = new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D);
/* 552 */             BlockState _bs = ((Block)ChangedBlocks.DARK_LATEX_BLOCK.get()).m_49966_();
/* 553 */             BlockState _bso = world.m_8055_(_bp);
/* 554 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 555 */               Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 556 */               if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                 try {
/* 558 */                   _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 559 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 562 */             world.m_7731_(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 565 */             return true;
/*     */           } 
/*     */         } 
/* 568 */         if (world.m_8055_(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).m_60734_() == Blocks.f_50652_) {
/* 569 */           if (Math.random() < 0.25D) {
/*     */             
/* 571 */             BlockPos _bp = new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D);
/* 572 */             BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).m_49966_();
/* 573 */             BlockState _bso = world.m_8055_(_bp);
/* 574 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 575 */               Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 576 */               if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                 try {
/* 578 */                   _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 579 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 582 */             world.m_7731_(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 585 */             return true;
/*     */           } 
/* 587 */         } else if (world.m_8055_(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).m_60734_() == Blocks.f_50493_ || world
/* 588 */           .m_8055_(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).m_60734_() == Blocks.f_49994_) {
/* 589 */           if (Math.random() < 0.25D) {
/*     */             
/* 591 */             BlockPos _bp = new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D);
/* 592 */             BlockState _bs = ((Block)ChangedBlocks.DARK_LATEX_BLOCK.get()).m_49966_();
/* 593 */             BlockState _bso = world.m_8055_(_bp);
/* 594 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 595 */               Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 596 */               if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                 try {
/* 598 */                   _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 599 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 602 */             world.m_7731_(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 605 */             return true;
/*     */           } 
/* 607 */         } else if (world.m_6425_(new BlockPos(x, y - 1.0D, z)).m_76188_().m_60734_() == Blocks.f_49990_ || world
/* 608 */           .m_6425_(new BlockPos(x, y - 1.0D, z)).m_76188_().m_60734_() == Blocks.f_49990_) {
/* 609 */           if (world.m_6106_().m_5470_().m_46207_(LatexModGameRules.DARKLATEXFLUIDS)) {
/*     */             
/* 611 */             BlockPos _bp = new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D);
/* 612 */             BlockState _bs = ((Block)ChangedBlocks.DARK_LATEX_FLUID.get()).m_49966_();
/* 613 */             BlockState _bso = world.m_8055_(_bp);
/* 614 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 615 */               Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 616 */               if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                 try {
/* 618 */                   _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 619 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 622 */             world.m_7731_(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 625 */             return true;
/*     */           } 
/*     */         } 
/* 628 */         if (world.m_8055_(new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D)).m_60734_() == Blocks.f_50652_) {
/* 629 */           if (Math.random() < 0.25D) {
/*     */             
/* 631 */             BlockPos _bp = new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D);
/* 632 */             BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).m_49966_();
/* 633 */             BlockState _bso = world.m_8055_(_bp);
/* 634 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 635 */               Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 636 */               if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                 try {
/* 638 */                   _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 639 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 642 */             world.m_7731_(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 645 */             return true;
/*     */           } 
/* 647 */         } else if (world.m_8055_(new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D)).m_60734_() == Blocks.f_50493_ || world
/* 648 */           .m_8055_(new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D)).m_60734_() == Blocks.f_49994_) {
/* 649 */           if (Math.random() < 0.25D) {
/*     */             
/* 651 */             BlockPos _bp = new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D);
/* 652 */             BlockState _bs = ((Block)ChangedBlocks.DARK_LATEX_BLOCK.get()).m_49966_();
/* 653 */             BlockState _bso = world.m_8055_(_bp);
/* 654 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 655 */               Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 656 */               if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                 try {
/* 658 */                   _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 659 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 662 */             world.m_7731_(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 665 */             return true;
/*     */           } 
/* 667 */         } else if (world.m_6106_().m_5470_().m_46207_(LatexModGameRules.DARKLATEXFLUIDS)) {
/* 668 */           if (world.m_6425_(new BlockPos(x, y, z + 1.0D)).m_76188_().m_60734_() == Blocks.f_49990_ || world
/* 669 */             .m_6425_(new BlockPos(x, y, z + 1.0D)).m_76188_().m_60734_() == Blocks.f_49990_) {
/*     */             
/* 671 */             BlockPos _bp = new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D);
/* 672 */             BlockState _bs = ((Block)ChangedBlocks.DARK_LATEX_FLUID.get()).m_49966_();
/* 673 */             BlockState _bso = world.m_8055_(_bp);
/* 674 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 675 */               Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 676 */               if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                 try {
/* 678 */                   _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 679 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 682 */             world.m_7731_(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 685 */             return true;
/*     */           } 
/*     */         } 
/* 688 */         if (world.m_8055_(new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D)).m_60734_() == Blocks.f_50652_) {
/* 689 */           if (world.m_8055_(new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D)).m_60734_() == Blocks.f_50652_) {
/* 690 */             if (Math.random() < 0.25D) {
/*     */               
/* 692 */               BlockPos _bp = new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D);
/* 693 */               BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).m_49966_();
/* 694 */               BlockState _bso = world.m_8055_(_bp);
/* 695 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 696 */                 Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 697 */                 if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                   try {
/* 699 */                     _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 700 */                   } catch (Exception exception) {}
/*     */                 } }
/*     */               
/* 703 */               world.m_7731_(_bp, _bs, 3);
/*     */             } else {
/*     */               
/* 706 */               return true;
/*     */             } 
/*     */           }
/* 709 */         } else if (world.m_8055_(new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D)).m_60734_() == Blocks.f_50493_ || world
/* 710 */           .m_8055_(new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D)).m_60734_() == Blocks.f_49994_) {
/* 711 */           if (Math.random() < 0.25D) {
/*     */             
/* 713 */             BlockPos _bp = new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D);
/* 714 */             BlockState _bs = ((Block)ChangedBlocks.DARK_LATEX_BLOCK.get()).m_49966_();
/* 715 */             BlockState _bso = world.m_8055_(_bp);
/* 716 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 717 */               Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 718 */               if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                 try {
/* 720 */                   _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 721 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 724 */             world.m_7731_(_bp, _bs, 3);
/*     */           } else {
/*     */             
/* 727 */             return true;
/*     */           } 
/* 729 */         } else if (world.m_6106_().m_5470_().m_46207_(LatexModGameRules.DARKLATEXFLUIDS)) {
/* 730 */           if (world.m_6425_(new BlockPos(x, y, z - 1.0D)).m_76188_().m_60734_() == Blocks.f_49990_ || world
/* 731 */             .m_6425_(new BlockPos(x, y, z - 1.0D)).m_76188_().m_60734_() == Blocks.f_49990_) {
/*     */             
/* 733 */             BlockPos _bp = new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D);
/* 734 */             BlockState _bs = ((Block)ChangedBlocks.DARK_LATEX_FLUID.get()).m_49966_();
/* 735 */             BlockState _bso = world.m_8055_(_bp);
/* 736 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 737 */               Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 738 */               if (_property != null && _bs.m_61143_(_property) != null) {
/*     */                 try {
/* 740 */                   _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 741 */                 } catch (Exception exception) {}
/*     */               } }
/*     */             
/* 744 */             world.m_7731_(_bp, _bs, 3);
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


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\InfesteddlcobblestoneUpdateTickProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */