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
/*     */ public class DarklatexlogUpdateTickProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z) {
/*  16 */     if (Math.random() * 100.0D <= world.getLevelData().getGameRules().getInt(LatexModGameRules.DARKLATEXSPREADSPEED)) {
/*  17 */       if (world.getBlockState(new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D)).getBlock() == Blocks.OAK_LEAVES) {
/*     */         
/*  19 */         BlockPos _bp = new BlockPos(x + 1.0D, y, z);
/*  20 */         BlockState _bs = ((Block)LatexModBlocks.DARKLATEXLEAVES.get()).defaultBlockState();
/*  21 */         BlockState _bso = world.getBlockState(_bp);
/*  22 */         for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  23 */           Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  24 */           if (_property != null && _bs.getValue(_property) != null) {
/*     */             try {
/*  26 */               _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  27 */             } catch (Exception exception) {}
/*     */           } }
/*     */         
/*  30 */         world.setBlock(_bp, _bs, 3);
/*     */       }
/*  32 */       else if (world.getBlockState(new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D)).getBlock() == Blocks.OAK_LEAVES) {
/*     */         
/*  34 */         BlockPos _bp = new BlockPos(x - 1.0D, y, z);
/*  35 */         BlockState _bs = ((Block)LatexModBlocks.DARKLATEXLEAVES.get()).defaultBlockState();
/*  36 */         BlockState _bso = world.getBlockState(_bp);
/*  37 */         for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  38 */           Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  39 */           if (_property != null && _bs.getValue(_property) != null) {
/*     */             try {
/*  41 */               _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  42 */             } catch (Exception exception) {}
/*     */           } }
/*     */         
/*  45 */         world.setBlock(_bp, _bs, 3);
/*     */       }
/*  47 */       else if (world.getBlockState(new BlockPos(x + 0.0D, y + 1.0D, z + 0.0D)).getBlock() == Blocks.OAK_LEAVES) {
/*     */         
/*  49 */         BlockPos _bp = new BlockPos(x, y + 1.0D, z);
/*  50 */         BlockState _bs = ((Block)LatexModBlocks.DARKLATEXLEAVES.get()).defaultBlockState();
/*  51 */         BlockState _bso = world.getBlockState(_bp);
/*  52 */         for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  53 */           Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  54 */           if (_property != null && _bs.getValue(_property) != null) {
/*     */             try {
/*  56 */               _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  57 */             } catch (Exception exception) {}
/*     */           } }
/*     */         
/*  60 */         world.setBlock(_bp, _bs, 3);
/*     */       }
/*  62 */       else if (world.getBlockState(new BlockPos(x + 0.0D, y + 0.0D, z + 1.0D)).getBlock() == Blocks.OAK_LEAVES) {
/*     */         
/*  64 */         BlockPos _bp = new BlockPos(x, y, z + 1.0D);
/*  65 */         BlockState _bs = ((Block)LatexModBlocks.DARKLATEXLEAVES.get()).defaultBlockState();
/*  66 */         BlockState _bso = world.getBlockState(_bp);
/*  67 */         for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  68 */           Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  69 */           if (_property != null && _bs.getValue(_property) != null) {
/*     */             try {
/*  71 */               _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  72 */             } catch (Exception exception) {}
/*     */           } }
/*     */         
/*  75 */         world.setBlock(_bp, _bs, 3);
/*     */       }
/*  77 */       else if (world.getBlockState(new BlockPos(x + 0.0D, y + 0.0D, z - 1.0D)).getBlock() == Blocks.OAK_LEAVES) {
/*     */         
/*  79 */         BlockPos _bp = new BlockPos(x, y, z - 1.0D);
/*  80 */         BlockState _bs = ((Block)LatexModBlocks.DARKLATEXLEAVES.get()).defaultBlockState();
/*  81 */         BlockState _bso = world.getBlockState(_bp);
/*  82 */         for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  83 */           Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  84 */           if (_property != null && _bs.getValue(_property) != null) {
/*     */             try {
/*  86 */               _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  87 */             } catch (Exception exception) {}
/*     */           } }
/*     */         
/*  90 */         world.setBlock(_bp, _bs, 3);
/*     */       } 
/*     */       
/*  93 */       if (world.getBlockState(new BlockPos(x + 0.0D, y + 1.0D, z + 0.0D)).getBlock() == Blocks.OAK_LOG) {
/*     */         
/*  95 */         BlockPos _bp = new BlockPos(x, y + 1.0D, z);
/*  96 */         BlockState _bs = ((Block)LatexModBlocks.DARKLATEXLOG.get()).defaultBlockState();
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
/* 108 */       else if (world.getBlockState(new BlockPos(x + 0.0D, y - 1.0D, z + 0.0D)).getBlock() == Blocks.OAK_LOG) {
/*     */         
/* 110 */         BlockPos _bp = new BlockPos(x, y - 1.0D, z);
/* 111 */         BlockState _bs = ((Block)LatexModBlocks.DARKLATEXLOG.get()).defaultBlockState();
/* 112 */         BlockState _bso = world.getBlockState(_bp);
/* 113 */         for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 114 */           Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 115 */           if (_property != null && _bs.getValue(_property) != null) {
/*     */             try {
/* 117 */               _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 118 */             } catch (Exception exception) {}
/*     */           } }
/*     */         
/* 121 */         world.setBlock(_bp, _bs, 3);
/*     */       } 
/*     */       
/* 124 */       if (world.getBlockState(new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D)).getBlock() == Blocks.BEE_NEST) {
/*     */         
/* 126 */         BlockPos _bp = new BlockPos(x + 1.0D, y, z);
/* 127 */         BlockState _bs = ((Block)LatexModBlocks.DARKLATEXHIVE.get()).defaultBlockState();
/* 128 */         BlockState _bso = world.getBlockState(_bp);
/* 129 */         for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 130 */           Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 131 */           if (_property != null && _bs.getValue(_property) != null) {
/*     */             try {
/* 133 */               _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 134 */             } catch (Exception exception) {}
/*     */           } }
/*     */         
/* 137 */         world.setBlock(_bp, _bs, 3);
/*     */       }
/* 139 */       else if (world.getBlockState(new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D)).getBlock() == Blocks.BEE_NEST) {
/*     */         
/* 141 */         BlockPos _bp = new BlockPos(x - 1.0D, y, z);
/* 142 */         BlockState _bs = ((Block)LatexModBlocks.DARKLATEXHIVE.get()).defaultBlockState();
/* 143 */         BlockState _bso = world.getBlockState(_bp);
/* 144 */         for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 145 */           Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 146 */           if (_property != null && _bs.getValue(_property) != null) {
/*     */             try {
/* 148 */               _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 149 */             } catch (Exception exception) {}
/*     */           } }
/*     */         
/* 152 */         world.setBlock(_bp, _bs, 3);
/*     */       }
/* 154 */       else if (world.getBlockState(new BlockPos(x + 0.0D, y + 0.0D, z + 1.0D)).getBlock() == Blocks.BEE_NEST) {
/*     */         
/* 156 */         BlockPos _bp = new BlockPos(x, y, z + 1.0D);
/* 157 */         BlockState _bs = ((Block)LatexModBlocks.DARKLATEXHIVE.get()).defaultBlockState();
/* 158 */         BlockState _bso = world.getBlockState(_bp);
/* 159 */         for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 160 */           Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 161 */           if (_property != null && _bs.getValue(_property) != null) {
/*     */             try {
/* 163 */               _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 164 */             } catch (Exception exception) {}
/*     */           } }
/*     */         
/* 167 */         world.setBlock(_bp, _bs, 3);
/*     */       }
/* 169 */       else if (world.getBlockState(new BlockPos(x + 0.0D, y + 0.0D, z - 1.0D)).getBlock() == Blocks.BEE_NEST) {
/*     */         
/* 171 */         BlockPos _bp = new BlockPos(x, y, z - 1.0D);
/* 172 */         BlockState _bs = ((Block)LatexModBlocks.DARKLATEXHIVE.get()).defaultBlockState();
/* 173 */         BlockState _bso = world.getBlockState(_bp);
/* 174 */         for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 175 */           Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 176 */           if (_property != null && _bs.getValue(_property) != null) {
/*     */             try {
/* 178 */               _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 179 */             } catch (Exception exception) {}
/*     */           } }
/*     */         
/* 182 */         world.setBlock(_bp, _bs, 3);
/*     */       } 
/*     */       
/* 185 */       if (world.getBlockState(new BlockPos(x + 0.0D, y - 1.0D, z + 0.0D)).getBlock() == Blocks.DIRT || world
/* 186 */         .getBlockState(new BlockPos(x + 0.0D, y - 1.0D, z + 0.0D)).getBlock() == Blocks.GRASS_BLOCK) {
/*     */         
/* 188 */         BlockPos _bp = new BlockPos(x, y - 1.0D, z);
/* 189 */         BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
/* 190 */         BlockState _bso = world.getBlockState(_bp);
/* 191 */         for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 192 */           Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 193 */           if (_property != null && _bs.getValue(_property) != null) {
/*     */             try {
/* 195 */               _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 196 */             } catch (Exception exception) {}
/*     */           } }
/*     */         
/* 199 */         world.setBlock(_bp, _bs, 3);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarklatexlogUpdateTickProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */