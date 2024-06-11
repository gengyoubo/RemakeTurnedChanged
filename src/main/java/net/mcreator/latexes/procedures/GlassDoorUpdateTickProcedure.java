/*     */ package net.mcreator.latexes.procedures;
/*     */ 
/*     */ import com.google.common.collect.UnmodifiableIterator;
/*     */ import java.util.Map;
/*     */ import net.mcreator.latexes.init.LatexModBlocks;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraft.world.level.block.state.properties.Property;
/*     */ 
/*     */ public class GlassDoorUpdateTickProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z) {
/*  14 */     if (world.getBlockState(new BlockPos(x + 1.0D, y, z)).getBlock() == LatexModBlocks.OPEN_GLASS_DOOR.get()) {
/*     */       
/*  16 */       BlockPos _bp = new BlockPos(x, y, z);
/*  17 */       BlockState _bs = ((Block)LatexModBlocks.INVERTED_OPEN_GLASS_DOOR.get()).defaultBlockState();
/*  18 */       BlockState _bso = world.getBlockState(_bp);
/*  19 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  20 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  21 */         if (_property != null && _bs.getValue(_property) != null) {
/*     */           try {
/*  23 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  24 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/*  27 */       world.setBlock(_bp, _bs, 3);
/*     */     }
/*  29 */     else if (world.getBlockState(new BlockPos(x + 1.0D, y, z)).getBlock() == LatexModBlocks.GLASS_DOOR.get()) {
/*     */       
/*  31 */       BlockPos _bp = new BlockPos(x, y, z);
/*  32 */       BlockState _bs = ((Block)LatexModBlocks.INVERTED_GLASS_DOOR.get()).defaultBlockState();
/*  33 */       BlockState _bso = world.getBlockState(_bp);
/*  34 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  35 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  36 */         if (_property != null && _bs.getValue(_property) != null) {
/*     */           try {
/*  38 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  39 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/*  42 */       world.setBlock(_bp, _bs, 3);
/*     */     }
/*  44 */     else if (world.getBlockState(new BlockPos(x + 1.0D, y, z)).getBlock() == LatexModBlocks.INVERTED_OPEN_GLASS_DOOR.get()) {
/*     */       
/*  46 */       BlockPos _bp = new BlockPos(x, y, z);
/*  47 */       BlockState _bs = ((Block)LatexModBlocks.OPEN_GLASS_DOOR.get()).defaultBlockState();
/*  48 */       BlockState _bso = world.getBlockState(_bp);
/*  49 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  50 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  51 */         if (_property != null && _bs.getValue(_property) != null) {
/*     */           try {
/*  53 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  54 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/*  57 */       world.setBlock(_bp, _bs, 3);
/*     */     }
/*  59 */     else if (world.getBlockState(new BlockPos(x + 1.0D, y, z)).getBlock() == LatexModBlocks.INVERTED_GLASS_DOOR.get()) {
/*     */       
/*  61 */       BlockPos _bp = new BlockPos(x, y, z);
/*  62 */       BlockState _bs = ((Block)LatexModBlocks.GLASS_DOOR.get()).defaultBlockState();
/*  63 */       BlockState _bso = world.getBlockState(_bp);
/*  64 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  65 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  66 */         if (_property != null && _bs.getValue(_property) != null) {
/*     */           try {
/*  68 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  69 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/*  72 */       world.setBlock(_bp, _bs, 3);
/*     */     }
/*  74 */     else if (world.getBlockState(new BlockPos(x - 1.0D, y, z)).getBlock() == LatexModBlocks.OPEN_GLASS_DOOR.get()) {
/*     */       
/*  76 */       BlockPos _bp = new BlockPos(x, y, z);
/*  77 */       BlockState _bs = ((Block)LatexModBlocks.INVERTED_OPEN_GLASS_DOOR.get()).defaultBlockState();
/*  78 */       BlockState _bso = world.getBlockState(_bp);
/*  79 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  80 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  81 */         if (_property != null && _bs.getValue(_property) != null) {
/*     */           try {
/*  83 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  84 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/*  87 */       world.setBlock(_bp, _bs, 3);
/*     */     }
/*  89 */     else if (world.getBlockState(new BlockPos(x - 1.0D, y, z)).getBlock() == LatexModBlocks.GLASS_DOOR.get()) {
/*     */       
/*  91 */       BlockPos _bp = new BlockPos(x, y, z);
/*  92 */       BlockState _bs = ((Block)LatexModBlocks.INVERTED_GLASS_DOOR.get()).defaultBlockState();
/*  93 */       BlockState _bso = world.getBlockState(_bp);
/*  94 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  95 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  96 */         if (_property != null && _bs.getValue(_property) != null) {
/*     */           try {
/*  98 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  99 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/* 102 */       world.setBlock(_bp, _bs, 3);
/*     */     }
/* 104 */     else if (world.getBlockState(new BlockPos(x - 1.0D, y, z)).getBlock() == LatexModBlocks.INVERTED_OPEN_GLASS_DOOR.get()) {
/*     */       
/* 106 */       BlockPos _bp = new BlockPos(x, y, z);
/* 107 */       BlockState _bs = ((Block)LatexModBlocks.OPEN_GLASS_DOOR.get()).defaultBlockState();
/* 108 */       BlockState _bso = world.getBlockState(_bp);
/* 109 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 110 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 111 */         if (_property != null && _bs.getValue(_property) != null) {
/*     */           try {
/* 113 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 114 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/* 117 */       world.setBlock(_bp, _bs, 3);
/*     */     }
/* 119 */     else if (world.getBlockState(new BlockPos(x - 1.0D, y, z)).getBlock() == LatexModBlocks.INVERTED_GLASS_DOOR.get()) {
/*     */       
/* 121 */       BlockPos _bp = new BlockPos(x, y, z);
/* 122 */       BlockState _bs = ((Block)LatexModBlocks.GLASS_DOOR.get()).defaultBlockState();
/* 123 */       BlockState _bso = world.getBlockState(_bp);
/* 124 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 125 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 126 */         if (_property != null && _bs.getValue(_property) != null) {
/*     */           try {
/* 128 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 129 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/* 132 */       world.setBlock(_bp, _bs, 3);
/*     */     }
/* 134 */     else if (world.getBlockState(new BlockPos(x, y, z + 1.0D)).getBlock() == LatexModBlocks.OPEN_GLASS_DOOR.get()) {
/*     */       
/* 136 */       BlockPos _bp = new BlockPos(x, y, z);
/* 137 */       BlockState _bs = ((Block)LatexModBlocks.INVERTED_OPEN_GLASS_DOOR.get()).defaultBlockState();
/* 138 */       BlockState _bso = world.getBlockState(_bp);
/* 139 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 140 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 141 */         if (_property != null && _bs.getValue(_property) != null) {
/*     */           try {
/* 143 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 144 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/* 147 */       world.setBlock(_bp, _bs, 3);
/*     */     }
/* 149 */     else if (world.getBlockState(new BlockPos(x, y, z + 1.0D)).getBlock() == LatexModBlocks.GLASS_DOOR.get()) {
/*     */       
/* 151 */       BlockPos _bp = new BlockPos(x, y, z);
/* 152 */       BlockState _bs = ((Block)LatexModBlocks.INVERTED_GLASS_DOOR.get()).defaultBlockState();
/* 153 */       BlockState _bso = world.getBlockState(_bp);
/* 154 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 155 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 156 */         if (_property != null && _bs.getValue(_property) != null) {
/*     */           try {
/* 158 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 159 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/* 162 */       world.setBlock(_bp, _bs, 3);
/*     */     }
/* 164 */     else if (world.getBlockState(new BlockPos(x, y, z + 1.0D)).getBlock() == LatexModBlocks.INVERTED_OPEN_GLASS_DOOR.get()) {
/*     */       
/* 166 */       BlockPos _bp = new BlockPos(x, y, z);
/* 167 */       BlockState _bs = ((Block)LatexModBlocks.OPEN_GLASS_DOOR.get()).defaultBlockState();
/* 168 */       BlockState _bso = world.getBlockState(_bp);
/* 169 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 170 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 171 */         if (_property != null && _bs.getValue(_property) != null) {
/*     */           try {
/* 173 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 174 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/* 177 */       world.setBlock(_bp, _bs, 3);
/*     */     }
/* 179 */     else if (world.getBlockState(new BlockPos(x, y, z + 1.0D)).getBlock() == LatexModBlocks.INVERTED_GLASS_DOOR.get()) {
/*     */       
/* 181 */       BlockPos _bp = new BlockPos(x, y, z);
/* 182 */       BlockState _bs = ((Block)LatexModBlocks.GLASS_DOOR.get()).defaultBlockState();
/* 183 */       BlockState _bso = world.getBlockState(_bp);
/* 184 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 185 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 186 */         if (_property != null && _bs.getValue(_property) != null) {
/*     */           try {
/* 188 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 189 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/* 192 */       world.setBlock(_bp, _bs, 3);
/*     */     }
/* 194 */     else if (world.getBlockState(new BlockPos(x, y, z - 1.0D)).getBlock() == LatexModBlocks.OPEN_GLASS_DOOR.get()) {
/*     */       
/* 196 */       BlockPos _bp = new BlockPos(x, y, z);
/* 197 */       BlockState _bs = ((Block)LatexModBlocks.INVERTED_OPEN_GLASS_DOOR.get()).defaultBlockState();
/* 198 */       BlockState _bso = world.getBlockState(_bp);
/* 199 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 200 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 201 */         if (_property != null && _bs.getValue(_property) != null) {
/*     */           try {
/* 203 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 204 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/* 207 */       world.setBlock(_bp, _bs, 3);
/*     */     }
/* 209 */     else if (world.getBlockState(new BlockPos(x, y, z - 1.0D)).getBlock() == LatexModBlocks.GLASS_DOOR.get()) {
/*     */       
/* 211 */       BlockPos _bp = new BlockPos(x, y, z);
/* 212 */       BlockState _bs = ((Block)LatexModBlocks.INVERTED_GLASS_DOOR.get()).defaultBlockState();
/* 213 */       BlockState _bso = world.getBlockState(_bp);
/* 214 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 215 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 216 */         if (_property != null && _bs.getValue(_property) != null) {
/*     */           try {
/* 218 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 219 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/* 222 */       world.setBlock(_bp, _bs, 3);
/*     */     }
/* 224 */     else if (world.getBlockState(new BlockPos(x, y, z - 1.0D)).getBlock() == LatexModBlocks.INVERTED_OPEN_GLASS_DOOR.get()) {
/*     */       
/* 226 */       BlockPos _bp = new BlockPos(x, y, z);
/* 227 */       BlockState _bs = ((Block)LatexModBlocks.OPEN_GLASS_DOOR.get()).defaultBlockState();
/* 228 */       BlockState _bso = world.getBlockState(_bp);
/* 229 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 230 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 231 */         if (_property != null && _bs.getValue(_property) != null) {
/*     */           try {
/* 233 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 234 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/* 237 */       world.setBlock(_bp, _bs, 3);
/*     */     }
/* 239 */     else if (world.getBlockState(new BlockPos(x, y, z - 1.0D)).getBlock() == LatexModBlocks.INVERTED_GLASS_DOOR.get()) {
/*     */       
/* 241 */       BlockPos _bp = new BlockPos(x, y, z);
/* 242 */       BlockState _bs = ((Block)LatexModBlocks.GLASS_DOOR.get()).defaultBlockState();
/* 243 */       BlockState _bso = world.getBlockState(_bp);
/* 244 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 245 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 246 */         if (_property != null && _bs.getValue(_property) != null) {
/*     */           try {
/* 248 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 249 */           } catch (Exception exception) {}
/*     */         } }
/*     */       
/* 252 */       world.setBlock(_bp, _bs, 3);
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\GlassDoorUpdateTickProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */