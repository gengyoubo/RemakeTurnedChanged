/*     */ package net.ltxprogrammer.turned.procedures;
/*     */ import com.google.common.collect.UnmodifiableIterator;
/*     */ import java.util.Map;
/*     */ import net.ltxprogrammer.turned.init.LatexModBlocks;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraft.world.level.block.state.properties.Property;
/*     */ 
/*     */ public class GlassDoorUpdateTickProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z) {
/*  13 */     if (world.m_8055_(new BlockPos(x + 1.0D, y, z)).m_60734_() == LatexModBlocks.OPEN_GLASS_DOOR.get()) {
/*     */       
/*  15 */       BlockPos _bp = new BlockPos(x, y, z);
/*  16 */       BlockState _bs = ((Block)LatexModBlocks.INVERTED_OPEN_GLASS_DOOR.get()).m_49966_();
/*  17 */       BlockState _bso = world.m_8055_(_bp);
/*  18 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  19 */         Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/*  20 */         if (_property != null && _bs.m_61143_(_property) != null) {
/*     */           try {
/*  22 */             _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/*  23 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/*  26 */       world.m_7731_(_bp, _bs, 3);
/*     */     }
/*  28 */     else if (world.m_8055_(new BlockPos(x + 1.0D, y, z)).m_60734_() == LatexModBlocks.GLASS_DOOR.get()) {
/*     */       
/*  30 */       BlockPos _bp = new BlockPos(x, y, z);
/*  31 */       BlockState _bs = ((Block)LatexModBlocks.INVERTED_GLASS_DOOR.get()).m_49966_();
/*  32 */       BlockState _bso = world.m_8055_(_bp);
/*  33 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  34 */         Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/*  35 */         if (_property != null && _bs.m_61143_(_property) != null) {
/*     */           try {
/*  37 */             _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/*  38 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/*  41 */       world.m_7731_(_bp, _bs, 3);
/*     */     }
/*  43 */     else if (world.m_8055_(new BlockPos(x + 1.0D, y, z)).m_60734_() == LatexModBlocks.INVERTED_OPEN_GLASS_DOOR.get()) {
/*     */       
/*  45 */       BlockPos _bp = new BlockPos(x, y, z);
/*  46 */       BlockState _bs = ((Block)LatexModBlocks.OPEN_GLASS_DOOR.get()).m_49966_();
/*  47 */       BlockState _bso = world.m_8055_(_bp);
/*  48 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  49 */         Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/*  50 */         if (_property != null && _bs.m_61143_(_property) != null) {
/*     */           try {
/*  52 */             _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/*  53 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/*  56 */       world.m_7731_(_bp, _bs, 3);
/*     */     }
/*  58 */     else if (world.m_8055_(new BlockPos(x + 1.0D, y, z)).m_60734_() == LatexModBlocks.INVERTED_GLASS_DOOR.get()) {
/*     */       
/*  60 */       BlockPos _bp = new BlockPos(x, y, z);
/*  61 */       BlockState _bs = ((Block)LatexModBlocks.GLASS_DOOR.get()).m_49966_();
/*  62 */       BlockState _bso = world.m_8055_(_bp);
/*  63 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  64 */         Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/*  65 */         if (_property != null && _bs.m_61143_(_property) != null) {
/*     */           try {
/*  67 */             _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/*  68 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/*  71 */       world.m_7731_(_bp, _bs, 3);
/*     */     }
/*  73 */     else if (world.m_8055_(new BlockPos(x - 1.0D, y, z)).m_60734_() == LatexModBlocks.OPEN_GLASS_DOOR.get()) {
/*     */       
/*  75 */       BlockPos _bp = new BlockPos(x, y, z);
/*  76 */       BlockState _bs = ((Block)LatexModBlocks.INVERTED_OPEN_GLASS_DOOR.get()).m_49966_();
/*  77 */       BlockState _bso = world.m_8055_(_bp);
/*  78 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  79 */         Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/*  80 */         if (_property != null && _bs.m_61143_(_property) != null) {
/*     */           try {
/*  82 */             _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/*  83 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/*  86 */       world.m_7731_(_bp, _bs, 3);
/*     */     }
/*  88 */     else if (world.m_8055_(new BlockPos(x - 1.0D, y, z)).m_60734_() == LatexModBlocks.GLASS_DOOR.get()) {
/*     */       
/*  90 */       BlockPos _bp = new BlockPos(x, y, z);
/*  91 */       BlockState _bs = ((Block)LatexModBlocks.INVERTED_GLASS_DOOR.get()).m_49966_();
/*  92 */       BlockState _bso = world.m_8055_(_bp);
/*  93 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  94 */         Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/*  95 */         if (_property != null && _bs.m_61143_(_property) != null) {
/*     */           try {
/*  97 */             _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/*  98 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/* 101 */       world.m_7731_(_bp, _bs, 3);
/*     */     }
/* 103 */     else if (world.m_8055_(new BlockPos(x - 1.0D, y, z)).m_60734_() == LatexModBlocks.INVERTED_OPEN_GLASS_DOOR.get()) {
/*     */       
/* 105 */       BlockPos _bp = new BlockPos(x, y, z);
/* 106 */       BlockState _bs = ((Block)LatexModBlocks.OPEN_GLASS_DOOR.get()).m_49966_();
/* 107 */       BlockState _bso = world.m_8055_(_bp);
/* 108 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 109 */         Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 110 */         if (_property != null && _bs.m_61143_(_property) != null) {
/*     */           try {
/* 112 */             _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 113 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/* 116 */       world.m_7731_(_bp, _bs, 3);
/*     */     }
/* 118 */     else if (world.m_8055_(new BlockPos(x - 1.0D, y, z)).m_60734_() == LatexModBlocks.INVERTED_GLASS_DOOR.get()) {
/*     */       
/* 120 */       BlockPos _bp = new BlockPos(x, y, z);
/* 121 */       BlockState _bs = ((Block)LatexModBlocks.GLASS_DOOR.get()).m_49966_();
/* 122 */       BlockState _bso = world.m_8055_(_bp);
/* 123 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 124 */         Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 125 */         if (_property != null && _bs.m_61143_(_property) != null) {
/*     */           try {
/* 127 */             _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 128 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/* 131 */       world.m_7731_(_bp, _bs, 3);
/*     */     }
/* 133 */     else if (world.m_8055_(new BlockPos(x, y, z + 1.0D)).m_60734_() == LatexModBlocks.OPEN_GLASS_DOOR.get()) {
/*     */       
/* 135 */       BlockPos _bp = new BlockPos(x, y, z);
/* 136 */       BlockState _bs = ((Block)LatexModBlocks.INVERTED_OPEN_GLASS_DOOR.get()).m_49966_();
/* 137 */       BlockState _bso = world.m_8055_(_bp);
/* 138 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 139 */         Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 140 */         if (_property != null && _bs.m_61143_(_property) != null) {
/*     */           try {
/* 142 */             _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 143 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/* 146 */       world.m_7731_(_bp, _bs, 3);
/*     */     }
/* 148 */     else if (world.m_8055_(new BlockPos(x, y, z + 1.0D)).m_60734_() == LatexModBlocks.GLASS_DOOR.get()) {
/*     */       
/* 150 */       BlockPos _bp = new BlockPos(x, y, z);
/* 151 */       BlockState _bs = ((Block)LatexModBlocks.INVERTED_GLASS_DOOR.get()).m_49966_();
/* 152 */       BlockState _bso = world.m_8055_(_bp);
/* 153 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 154 */         Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 155 */         if (_property != null && _bs.m_61143_(_property) != null) {
/*     */           try {
/* 157 */             _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 158 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/* 161 */       world.m_7731_(_bp, _bs, 3);
/*     */     }
/* 163 */     else if (world.m_8055_(new BlockPos(x, y, z + 1.0D)).m_60734_() == LatexModBlocks.INVERTED_OPEN_GLASS_DOOR.get()) {
/*     */       
/* 165 */       BlockPos _bp = new BlockPos(x, y, z);
/* 166 */       BlockState _bs = ((Block)LatexModBlocks.OPEN_GLASS_DOOR.get()).m_49966_();
/* 167 */       BlockState _bso = world.m_8055_(_bp);
/* 168 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 169 */         Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 170 */         if (_property != null && _bs.m_61143_(_property) != null) {
/*     */           try {
/* 172 */             _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 173 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/* 176 */       world.m_7731_(_bp, _bs, 3);
/*     */     }
/* 178 */     else if (world.m_8055_(new BlockPos(x, y, z + 1.0D)).m_60734_() == LatexModBlocks.INVERTED_GLASS_DOOR.get()) {
/*     */       
/* 180 */       BlockPos _bp = new BlockPos(x, y, z);
/* 181 */       BlockState _bs = ((Block)LatexModBlocks.GLASS_DOOR.get()).m_49966_();
/* 182 */       BlockState _bso = world.m_8055_(_bp);
/* 183 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 184 */         Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 185 */         if (_property != null && _bs.m_61143_(_property) != null) {
/*     */           try {
/* 187 */             _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 188 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/* 191 */       world.m_7731_(_bp, _bs, 3);
/*     */     }
/* 193 */     else if (world.m_8055_(new BlockPos(x, y, z - 1.0D)).m_60734_() == LatexModBlocks.OPEN_GLASS_DOOR.get()) {
/*     */       
/* 195 */       BlockPos _bp = new BlockPos(x, y, z);
/* 196 */       BlockState _bs = ((Block)LatexModBlocks.INVERTED_OPEN_GLASS_DOOR.get()).m_49966_();
/* 197 */       BlockState _bso = world.m_8055_(_bp);
/* 198 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 199 */         Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 200 */         if (_property != null && _bs.m_61143_(_property) != null) {
/*     */           try {
/* 202 */             _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 203 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/* 206 */       world.m_7731_(_bp, _bs, 3);
/*     */     }
/* 208 */     else if (world.m_8055_(new BlockPos(x, y, z - 1.0D)).m_60734_() == LatexModBlocks.GLASS_DOOR.get()) {
/*     */       
/* 210 */       BlockPos _bp = new BlockPos(x, y, z);
/* 211 */       BlockState _bs = ((Block)LatexModBlocks.INVERTED_GLASS_DOOR.get()).m_49966_();
/* 212 */       BlockState _bso = world.m_8055_(_bp);
/* 213 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 214 */         Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 215 */         if (_property != null && _bs.m_61143_(_property) != null) {
/*     */           try {
/* 217 */             _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 218 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/* 221 */       world.m_7731_(_bp, _bs, 3);
/*     */     }
/* 223 */     else if (world.m_8055_(new BlockPos(x, y, z - 1.0D)).m_60734_() == LatexModBlocks.INVERTED_OPEN_GLASS_DOOR.get()) {
/*     */       
/* 225 */       BlockPos _bp = new BlockPos(x, y, z);
/* 226 */       BlockState _bs = ((Block)LatexModBlocks.OPEN_GLASS_DOOR.get()).m_49966_();
/* 227 */       BlockState _bso = world.m_8055_(_bp);
/* 228 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 229 */         Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 230 */         if (_property != null && _bs.m_61143_(_property) != null) {
/*     */           try {
/* 232 */             _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 233 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/* 236 */       world.m_7731_(_bp, _bs, 3);
/*     */     }
/* 238 */     else if (world.m_8055_(new BlockPos(x, y, z - 1.0D)).m_60734_() == LatexModBlocks.INVERTED_GLASS_DOOR.get()) {
/*     */       
/* 240 */       BlockPos _bp = new BlockPos(x, y, z);
/* 241 */       BlockState _bs = ((Block)LatexModBlocks.GLASS_DOOR.get()).m_49966_();
/* 242 */       BlockState _bso = world.m_8055_(_bp);
/* 243 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 244 */         Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 245 */         if (_property != null && _bs.m_61143_(_property) != null) {
/*     */           try {
/* 247 */             _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 248 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/* 251 */       world.m_7731_(_bp, _bs, 3);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\GlassDoorUpdateTickProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */