/*      */ package net.mcreator.latexes.procedures;
/*      */ 
/*      */ import com.google.common.collect.UnmodifiableIterator;
/*      */ import java.util.Map;
/*      */ import net.mcreator.latexes.init.LatexModBlocks;
/*      */ import net.mcreator.latexes.init.LatexModGameRules;
/*      */ import net.minecraft.core.BlockPos;
/*      */ import net.minecraft.resources.ResourceLocation;
/*      */ import net.minecraft.tags.BlockTags;
/*      */ import net.minecraft.world.level.LevelAccessor;
/*      */ import net.minecraft.world.level.block.Block;
/*      */ import net.minecraft.world.level.block.Blocks;
/*      */ import net.minecraft.world.level.block.state.BlockState;
/*      */ import net.minecraft.world.level.block.state.properties.Property;
/*      */ 
/*      */ public class DarklatexblockUpdateTickProcedure {
/*      */   public static boolean execute(LevelAccessor world, double x, double y, double z) {
/*   18 */     boolean found = false;
/*   19 */     double sx = 0.0D;
/*   20 */     double sy = 0.0D;
/*   21 */     double sz = 0.0D;
/*   22 */     if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSPREAD) == true) {
/*   23 */       if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSUNLIGHTONLY) == true && 
/*      */ 
/*      */ 
/*      */         
/*   27 */         !(((world.canSeeSkyFromBelowWater(new BlockPos(x, y + 1.0D, z)) || world.canSeeSkyFromBelowWater(new BlockPos(x, y - 1.0D, z)) || world.canSeeSkyFromBelowWater(new BlockPos(x, y, z + 1.0D)) || world.canSeeSkyFromBelowWater(new BlockPos(x, y, z - 1.0D)) || world.canSeeSkyFromBelowWater(new BlockPos(x - 1.0D, y, z)) || world.canSeeSkyFromBelowWater(new BlockPos(x + 1.0D, y, z))) && world.getMaxLocalRawBrightness(new BlockPos(x, y + 1.0D, z)) >= 5) ? 1 : 0)) {
/*   28 */         if (Math.random() * 100.0D <= world.getLevelData().getGameRules().getInt(LatexModGameRules.DARKLATEXSPREADSPEED))
/*      */         {
/*   30 */           if (!world.getBlockState(new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D)).is(BlockTags.create(new ResourceLocation("latex:tag_immune_blocks"))) && 
/*      */ 
/*      */             
/*   33 */             !((!world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSTONESPREAD) && world.getBlockState(new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D)).is(BlockTags.create(new ResourceLocation("latex:tag_stone_blocks"))) == true) ? 1 : 0)) {
/*   34 */             if (world.getBlockState(new BlockPos(x + 1.0D, y, z)).getBlock() == Blocks.BEEHIVE || world
/*   35 */               .getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.BEE_NEST) {
/*      */               
/*   37 */               BlockPos _bp = new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D);
/*   38 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXHIVE.get()).defaultBlockState();
/*   39 */               BlockState _bso = world.getBlockState(_bp);
/*   40 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*   41 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*   42 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*   44 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*   45 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*   48 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*   50 */             else if (world.getBlockState(new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D))
/*   51 */               .is(BlockTags.create(new ResourceLocation("latex:cobblestone"))) && world
/*   52 */               .getLevelData().getGameRules().getBoolean(LatexModGameRules.CANCOBBLESTONEBEINFESTED)) {
/*      */               
/*   54 */               BlockPos _bp = new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D);
/*   55 */               BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).defaultBlockState();
/*   56 */               BlockState _bso = world.getBlockState(_bp);
/*   57 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*   58 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*   59 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*   61 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*   62 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*   65 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*   67 */             else if (world.getBlockState(new BlockPos(x + 1.0D, y, z)).getBlock() == LatexModBlocks.INFESTEDDLCOBBLESTONE.get() && world
/*   68 */               .getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSTONESPREAD)) {
/*      */               
/*   70 */               BlockPos _bp = new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D);
/*   71 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get()).defaultBlockState();
/*   72 */               BlockState _bso = world.getBlockState(_bp);
/*   73 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*   74 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*   75 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*   77 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*   78 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*   81 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*   83 */             else if (world.getBlockState(new BlockPos(x + 1.0D, y, z)).getBlock() == Blocks.COBWEB) {
/*      */               
/*   85 */               BlockPos _bp = new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D);
/*   86 */               BlockState _bs = ((Block)LatexModBlocks.LATEXCOBWEBFIX.get()).defaultBlockState();
/*   87 */               BlockState _bso = world.getBlockState(_bp);
/*   88 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*   89 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*   90 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*   92 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*   93 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*   96 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*   98 */             else if (world.getBlockState(new BlockPos(x + 1.0D, y, z)).getBlock() == Blocks.OAK_LOG) {
/*      */               
/*  100 */               BlockPos _bp = new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D);
/*  101 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXLOG.get()).defaultBlockState();
/*  102 */               BlockState _bso = world.getBlockState(_bp);
/*  103 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  104 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  105 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  107 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  108 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  111 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*  113 */             else if (world.getBlockState(new BlockPos(x + 1.0D, y, z)).getBlock() == Blocks.OAK_LEAVES) {
/*      */               
/*  115 */               BlockPos _bp = new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D);
/*  116 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXLEAVES.get()).defaultBlockState();
/*  117 */               BlockState _bso = world.getBlockState(_bp);
/*  118 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  119 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  120 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  122 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  123 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  126 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*  128 */             else if (world.getFluidState(new BlockPos(x + 1.0D, y, z)).createLegacyBlock().getBlock() == Blocks.WATER || world
/*  129 */               .getFluidState(new BlockPos(x + 1.0D, y, z)).createLegacyBlock().getBlock() == Blocks.WATER) {
/*  130 */               if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXFLUIDS)) {
/*      */                 
/*  132 */                 BlockPos _bp = new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D);
/*  133 */                 BlockState _bs = ((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
/*  134 */                 BlockState _bso = world.getBlockState(_bp);
/*  135 */                 for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  136 */                   Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  137 */                   if (_property != null && _bs.getValue(_property) != null) {
/*      */                     try {
/*  139 */                       _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  140 */                     } catch (Exception exception) {}
/*      */                   } }
/*      */                 
/*  143 */                 world.setBlock(_bp, _bs, 3);
/*      */               } else {
/*      */                 
/*  146 */                 return true;
/*      */               }
/*      */             
/*  149 */             } else if (Math.random() < 0.025D) {
/*      */               
/*  151 */               BlockPos _bp = new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D);
/*  152 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXICE.get()).defaultBlockState();
/*  153 */               BlockState _bso = world.getBlockState(_bp);
/*  154 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  155 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  156 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  158 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  159 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  162 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*  164 */             else if (Math.random() < 0.01D) {
/*      */               
/*  166 */               BlockPos _bp = new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D);
/*  167 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get()).defaultBlockState();
/*  168 */               BlockState _bso = world.getBlockState(_bp);
/*  169 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  170 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  171 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  173 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  174 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  177 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*      */             else {
/*      */               
/*  181 */               BlockPos _bp = new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D);
/*  182 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
/*  183 */               BlockState _bso = world.getBlockState(_bp);
/*  184 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  185 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  186 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  188 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  189 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  192 */               world.setBlock(_bp, _bs, 3);
/*      */             } 
/*      */           }
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  199 */           if (!world.getBlockState(new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D)).is(BlockTags.create(new ResourceLocation("latex:tag_immune_blocks"))) && 
/*      */ 
/*      */             
/*  202 */             !((!world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSTONESPREAD) && world.getBlockState(new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D)).is(BlockTags.create(new ResourceLocation("latex:tag_stone_blocks"))) == true) ? 1 : 0)) {
/*  203 */             if (world.getBlockState(new BlockPos(x - 1.0D, y, z)).getBlock() == Blocks.BEEHIVE || world
/*  204 */               .getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.BEE_NEST) {
/*      */               
/*  206 */               BlockPos _bp = new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D);
/*  207 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXHIVE.get()).defaultBlockState();
/*  208 */               BlockState _bso = world.getBlockState(_bp);
/*  209 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  210 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  211 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  213 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  214 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  217 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*  219 */             else if (world.getBlockState(new BlockPos(x - 1.0D, y, z)).getBlock() == Blocks.COBWEB) {
/*      */               
/*  221 */               BlockPos _bp = new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D);
/*  222 */               BlockState _bs = ((Block)LatexModBlocks.LATEXCOBWEBFIX.get()).defaultBlockState();
/*  223 */               BlockState _bso = world.getBlockState(_bp);
/*  224 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  225 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  226 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  228 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  229 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  232 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*  234 */             else if (world.getBlockState(new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D))
/*  235 */               .is(BlockTags.create(new ResourceLocation("latex:cobblestone"))) && world
/*  236 */               .getLevelData().getGameRules().getBoolean(LatexModGameRules.CANCOBBLESTONEBEINFESTED)) {
/*      */               
/*  238 */               BlockPos _bp = new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D);
/*  239 */               BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).defaultBlockState();
/*  240 */               BlockState _bso = world.getBlockState(_bp);
/*  241 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  242 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  243 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  245 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  246 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  249 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*  251 */             else if (world.getBlockState(new BlockPos(x - 1.0D, y, z)).getBlock() == LatexModBlocks.INFESTEDDLCOBBLESTONE.get() && world
/*  252 */               .getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSTONESPREAD)) {
/*      */               
/*  254 */               BlockPos _bp = new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D);
/*  255 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get()).defaultBlockState();
/*  256 */               BlockState _bso = world.getBlockState(_bp);
/*  257 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  258 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  259 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  261 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  262 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  265 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*  267 */             else if (world.getBlockState(new BlockPos(x - 1.0D, y, z)).getBlock() == Blocks.OAK_LEAVES) {
/*      */               
/*  269 */               BlockPos _bp = new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D);
/*  270 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXLEAVES.get()).defaultBlockState();
/*  271 */               BlockState _bso = world.getBlockState(_bp);
/*  272 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  273 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  274 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  276 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  277 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  280 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*  282 */             else if (world.getBlockState(new BlockPos(x - 1.0D, y, z)).getBlock() == Blocks.OAK_LOG) {
/*      */               
/*  284 */               BlockPos _bp = new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D);
/*  285 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXLOG.get()).defaultBlockState();
/*  286 */               BlockState _bso = world.getBlockState(_bp);
/*  287 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  288 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  289 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  291 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  292 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  295 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*  297 */             else if (world.getFluidState(new BlockPos(x - 1.0D, y, z)).createLegacyBlock().getBlock() == Blocks.WATER || world
/*  298 */               .getFluidState(new BlockPos(x - 1.0D, y, z)).createLegacyBlock().getBlock() == Blocks.WATER) {
/*  299 */               if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXFLUIDS)) {
/*      */                 
/*  301 */                 BlockPos _bp = new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D);
/*  302 */                 BlockState _bs = ((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
/*  303 */                 BlockState _bso = world.getBlockState(_bp);
/*  304 */                 for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  305 */                   Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  306 */                   if (_property != null && _bs.getValue(_property) != null) {
/*      */                     try {
/*  308 */                       _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  309 */                     } catch (Exception exception) {}
/*      */                   } }
/*      */                 
/*  312 */                 world.setBlock(_bp, _bs, 3);
/*      */               } else {
/*      */                 
/*  315 */                 return true;
/*      */               }
/*      */             
/*  318 */             } else if (Math.random() < 0.025D) {
/*      */               
/*  320 */               BlockPos _bp = new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D);
/*  321 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXICE.get()).defaultBlockState();
/*  322 */               BlockState _bso = world.getBlockState(_bp);
/*  323 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  324 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  325 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  327 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  328 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  331 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*  333 */             else if (Math.random() < 0.01D) {
/*      */               
/*  335 */               BlockPos _bp = new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D);
/*  336 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get()).defaultBlockState();
/*  337 */               BlockState _bso = world.getBlockState(_bp);
/*  338 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  339 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  340 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  342 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  343 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  346 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*      */             else {
/*      */               
/*  350 */               BlockPos _bp = new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D);
/*  351 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
/*  352 */               BlockState _bso = world.getBlockState(_bp);
/*  353 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  354 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  355 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  357 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  358 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  361 */               world.setBlock(_bp, _bs, 3);
/*      */             } 
/*      */           }
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  368 */           if (!world.getBlockState(new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D)).is(BlockTags.create(new ResourceLocation("latex:tag_immune_blocks"))) && 
/*      */ 
/*      */             
/*  371 */             !((!world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSTONESPREAD) && world.getBlockState(new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D)).is(BlockTags.create(new ResourceLocation("latex:tag_stone_blocks"))) == true) ? 1 : 0)) {
/*  372 */             if (world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.BEEHIVE || world
/*  373 */               .getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.BEE_NEST) {
/*      */               
/*  375 */               BlockPos _bp = new BlockPos(x + 0.0D, y + 1.0D, z + 0.0D);
/*  376 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXHIVE.get()).defaultBlockState();
/*  377 */               BlockState _bso = world.getBlockState(_bp);
/*  378 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  379 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  380 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  382 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  383 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  386 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*  388 */             else if (world.getBlockState(new BlockPos(x, y + 1.0D, z + 0.0D)).getBlock() == Blocks.COBWEB) {
/*      */               
/*  390 */               BlockPos _bp = new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D);
/*  391 */               BlockState _bs = ((Block)LatexModBlocks.LATEXCOBWEBFIX.get()).defaultBlockState();
/*  392 */               BlockState _bso = world.getBlockState(_bp);
/*  393 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  394 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  395 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  397 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  398 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  401 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*  403 */             else if (world.getBlockState(new BlockPos(x + 0.0D, y + 1.0D, z + 0.0D))
/*  404 */               .is(BlockTags.create(new ResourceLocation("latex:cobblestone"))) && world
/*  405 */               .getLevelData().getGameRules().getBoolean(LatexModGameRules.CANCOBBLESTONEBEINFESTED)) {
/*      */               
/*  407 */               BlockPos _bp = new BlockPos(x + 0.0D, y + 1.0D, z + 0.0D);
/*  408 */               BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).defaultBlockState();
/*  409 */               BlockState _bso = world.getBlockState(_bp);
/*  410 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  411 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  412 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  414 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  415 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  418 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*  420 */             else if (world.getBlockState(new BlockPos(x, y + 1.0D, z)).getBlock() == LatexModBlocks.INFESTEDDLCOBBLESTONE.get() && world
/*  421 */               .getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSTONESPREAD)) {
/*      */               
/*  423 */               BlockPos _bp = new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D);
/*  424 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get()).defaultBlockState();
/*  425 */               BlockState _bso = world.getBlockState(_bp);
/*  426 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  427 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  428 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  430 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  431 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  434 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*  436 */             else if (world.getBlockState(new BlockPos(x, y + 1.0D, z + 0.0D)).getBlock() == Blocks.OAK_LEAVES || world
/*  437 */               .getBlockState(new BlockPos(x, y + 1.0D, z + 0.0D)).getBlock() == Blocks.GRASS || world
/*  438 */               .getBlockState(new BlockPos(x, y + 1.0D, z + 0.0D)).getBlock() == Blocks.SWEET_BERRY_BUSH || world
/*  439 */               .getBlockState(new BlockPos(x, y + 1.0D, z + 0.0D)).getBlock() == Blocks.VINE) {
/*      */               
/*  441 */               BlockPos _bp = new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D);
/*  442 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXLEAVES.get()).defaultBlockState();
/*  443 */               BlockState _bso = world.getBlockState(_bp);
/*  444 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  445 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  446 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  448 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  449 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  452 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*  454 */             else if (world.getBlockState(new BlockPos(x, y + 1.0D, z + 0.0D)).getBlock() == Blocks.OAK_LOG) {
/*      */               
/*  456 */               BlockPos _bp = new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D);
/*  457 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXLOG.get()).defaultBlockState();
/*  458 */               BlockState _bso = world.getBlockState(_bp);
/*  459 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  460 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  461 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  463 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  464 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  467 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*  469 */             else if (world.getFluidState(new BlockPos(x, y + 1.0D, z)).createLegacyBlock().getBlock() == Blocks.WATER || world
/*  470 */               .getFluidState(new BlockPos(x, y + 1.0D, z)).createLegacyBlock().getBlock() == Blocks.WATER) {
/*  471 */               if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXFLUIDS)) {
/*      */                 
/*  473 */                 BlockPos _bp = new BlockPos(x + 0.0D, y + 1.0D, z + 0.0D);
/*  474 */                 BlockState _bs = ((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
/*  475 */                 BlockState _bso = world.getBlockState(_bp);
/*  476 */                 for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  477 */                   Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  478 */                   if (_property != null && _bs.getValue(_property) != null) {
/*      */                     try {
/*  480 */                       _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  481 */                     } catch (Exception exception) {}
/*      */                   } }
/*      */                 
/*  484 */                 world.setBlock(_bp, _bs, 3);
/*      */               } else {
/*      */                 
/*  487 */                 return true;
/*      */               } 
/*      */             } else {
/*      */               
/*  491 */               BlockPos _bp = new BlockPos(x + 0.0D, y + 1.0D, z + 0.0D);
/*  492 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
/*  493 */               BlockState _bso = world.getBlockState(_bp);
/*  494 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  495 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  496 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  498 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  499 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  502 */               world.setBlock(_bp, _bs, 3);
/*      */             } 
/*      */           }
/*      */ 
/*      */           
/*  507 */           if ((world.getBlockState(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).getBlock() == LatexModBlocks.DARKLATEXHIVE.get() || world
/*  508 */             .getBlockState(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).getBlock() == LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get() || world
/*  509 */             .getBlockState(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).getBlock() == LatexModBlocks.LATEXCOBWEBFIX.get() || world
/*  510 */             .getBlockState(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).getBlock() == LatexModBlocks.DARKLATEXLEAVES.get() || world
/*  511 */             .getBlockState(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).getBlock() == LatexModBlocks.DARKLATEXCRYSTALEGG.get() || world
/*  512 */             .getBlockState(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).getBlock() == LatexModBlocks.DARKLATEXICE.get() || 
/*      */             
/*  514 */             !world.getBlockState(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).is(BlockTags.create(new ResourceLocation("latex:tag_immune_blocks")))) && 
/*      */ 
/*      */             
/*  517 */             !((!world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSTONESPREAD) && world.getBlockState(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).is(BlockTags.create(new ResourceLocation("latex:tag_stone_blocks"))) == true) ? 1 : 0)) {
/*  518 */             if (world.getBlockState(new BlockPos(x, y - 1.0D, z + 0.0D)).getBlock() == Blocks.OAK_LEAVES || world
/*  519 */               .getBlockState(new BlockPos(x, y + 1.0D, z - 0.0D)).getBlock() == Blocks.GRASS || world
/*  520 */               .getBlockState(new BlockPos(x, y - 1.0D, z + 0.0D)).getBlock() == Blocks.SWEET_BERRY_BUSH || world
/*  521 */               .getBlockState(new BlockPos(x, y + 1.0D, z - 0.0D)).getBlock() == Blocks.VINE) {
/*      */               
/*  523 */               BlockPos _bp = new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D);
/*  524 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXLEAVES.get()).defaultBlockState();
/*  525 */               BlockState _bso = world.getBlockState(_bp);
/*  526 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  527 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  528 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  530 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  531 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  534 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*  536 */             else if (world.getFluidState(new BlockPos(x, y - 1.0D, z)).createLegacyBlock().getBlock() == Blocks.WATER || world
/*  537 */               .getFluidState(new BlockPos(x, y - 1.0D, z)).createLegacyBlock().getBlock() == Blocks.WATER) {
/*  538 */               if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXFLUIDS)) {
/*      */                 
/*  540 */                 BlockPos _bp = new BlockPos(x + 0.0D, y - 1.0D, z + 0.0D);
/*  541 */                 BlockState _bs = ((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
/*  542 */                 BlockState _bso = world.getBlockState(_bp);
/*  543 */                 for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  544 */                   Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  545 */                   if (_property != null && _bs.getValue(_property) != null) {
/*      */                     try {
/*  547 */                       _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  548 */                     } catch (Exception exception) {}
/*      */                   } }
/*      */                 
/*  551 */                 world.setBlock(_bp, _bs, 3);
/*      */               } else {
/*      */                 
/*  554 */                 return true;
/*      */               } 
/*  556 */             } else if (world.getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == LatexModBlocks.INFESTEDDLCOBBLESTONE.get() && world
/*  557 */               .getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSTONESPREAD)) {
/*      */               
/*  559 */               BlockPos _bp = new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D);
/*  560 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get()).defaultBlockState();
/*  561 */               BlockState _bso = world.getBlockState(_bp);
/*  562 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  563 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  564 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  566 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  567 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  570 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*  572 */             else if (world.getBlockState(new BlockPos(x + 0.0D, y - 1.0D, z + 0.0D))
/*  573 */               .is(BlockTags.create(new ResourceLocation("latex:cobblestone"))) && world
/*  574 */               .getLevelData().getGameRules().getBoolean(LatexModGameRules.CANCOBBLESTONEBEINFESTED)) {
/*      */               
/*  576 */               BlockPos _bp = new BlockPos(x + 0.0D, y - 1.0D, z + 0.0D);
/*  577 */               BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).defaultBlockState();
/*  578 */               BlockState _bso = world.getBlockState(_bp);
/*  579 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  580 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  581 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  583 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  584 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  587 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*      */             else {
/*      */               
/*  591 */               BlockPos _bp = new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D);
/*  592 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
/*  593 */               BlockState _bso = world.getBlockState(_bp);
/*  594 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  595 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  596 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  598 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  599 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  602 */               world.setBlock(_bp, _bs, 3);
/*      */             } 
/*      */           }
/*      */ 
/*      */ 
/*      */           
/*  608 */           if (!world.getBlockState(new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D)).is(BlockTags.create(new ResourceLocation("latex:tag_immune_blocks"))) && 
/*      */ 
/*      */             
/*  611 */             !((!world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSTONESPREAD) && world.getBlockState(new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D)).is(BlockTags.create(new ResourceLocation("latex:tag_stone_blocks"))) == true) ? 1 : 0)) {
/*  612 */             if (world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.BEEHIVE || world
/*  613 */               .getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.BEE_NEST) {
/*      */               
/*  615 */               BlockPos _bp = new BlockPos(x + 0.0D, y + 0.0D, z + 1.0D);
/*  616 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXHIVE.get()).defaultBlockState();
/*  617 */               BlockState _bso = world.getBlockState(_bp);
/*  618 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  619 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  620 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  622 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  623 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  626 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*  628 */             else if (world.getBlockState(new BlockPos(x, y + 0.0D, z + 1.0D)).getBlock() == Blocks.COBWEB) {
/*      */               
/*  630 */               BlockPos _bp = new BlockPos(x - 0.0D, y + 0.0D, z + 1.0D);
/*  631 */               BlockState _bs = ((Block)LatexModBlocks.LATEXCOBWEBFIX.get()).defaultBlockState();
/*  632 */               BlockState _bso = world.getBlockState(_bp);
/*  633 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  634 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  635 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  637 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  638 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  641 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*  643 */             else if (world.getBlockState(new BlockPos(x + 0.0D, y + 0.0D, z + 1.0D))
/*  644 */               .is(BlockTags.create(new ResourceLocation("latex:cobblestone"))) && world
/*  645 */               .getLevelData().getGameRules().getBoolean(LatexModGameRules.CANCOBBLESTONEBEINFESTED)) {
/*      */               
/*  647 */               BlockPos _bp = new BlockPos(x + 0.0D, y + 0.0D, z + 1.0D);
/*  648 */               BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).defaultBlockState();
/*  649 */               BlockState _bso = world.getBlockState(_bp);
/*  650 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  651 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  652 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  654 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  655 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  658 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*  660 */             else if (world.getBlockState(new BlockPos(x, y, z + 1.0D)).getBlock() == LatexModBlocks.INFESTEDDLCOBBLESTONE.get() && world
/*  661 */               .getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSTONESPREAD)) {
/*      */               
/*  663 */               BlockPos _bp = new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D);
/*  664 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get()).defaultBlockState();
/*  665 */               BlockState _bso = world.getBlockState(_bp);
/*  666 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  667 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  668 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  670 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  671 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  674 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*  676 */             else if (world.getBlockState(new BlockPos(x, y + 0.0D, z + 1.0D)).getBlock() == Blocks.OAK_LEAVES) {
/*      */               
/*  678 */               BlockPos _bp = new BlockPos(x - 0.0D, y + 0.0D, z + 1.0D);
/*  679 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXLEAVES.get()).defaultBlockState();
/*  680 */               BlockState _bso = world.getBlockState(_bp);
/*  681 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  682 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  683 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  685 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  686 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  689 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*  691 */             else if (world.getBlockState(new BlockPos(x, y + 0.0D, z + 1.0D)).getBlock() == Blocks.OAK_LOG) {
/*      */               
/*  693 */               BlockPos _bp = new BlockPos(x - 0.0D, y + 0.0D, z + 1.0D);
/*  694 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXLOG.get()).defaultBlockState();
/*  695 */               BlockState _bso = world.getBlockState(_bp);
/*  696 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  697 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  698 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  700 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  701 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  704 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*  706 */             else if (world.getFluidState(new BlockPos(x, y, z + 1.0D)).createLegacyBlock().getBlock() == Blocks.WATER || world
/*  707 */               .getFluidState(new BlockPos(x, y, z + 1.0D)).createLegacyBlock().getBlock() == Blocks.WATER) {
/*  708 */               if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXFLUIDS)) {
/*      */                 
/*  710 */                 BlockPos _bp = new BlockPos(x + 0.0D, y - 0.0D, z + 1.0D);
/*  711 */                 BlockState _bs = ((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
/*  712 */                 BlockState _bso = world.getBlockState(_bp);
/*  713 */                 for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  714 */                   Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  715 */                   if (_property != null && _bs.getValue(_property) != null) {
/*      */                     try {
/*  717 */                       _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  718 */                     } catch (Exception exception) {}
/*      */                   } }
/*      */                 
/*  721 */                 world.setBlock(_bp, _bs, 3);
/*      */               } else {
/*      */                 
/*  724 */                 return true;
/*      */               }
/*      */             
/*  727 */             } else if (Math.random() < 0.025D) {
/*      */               
/*  729 */               BlockPos _bp = new BlockPos(x + 0.0D, y + 0.0D, z + 1.0D);
/*  730 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXICE.get()).defaultBlockState();
/*  731 */               BlockState _bso = world.getBlockState(_bp);
/*  732 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  733 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  734 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  736 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  737 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  740 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*  742 */             else if (Math.random() < 0.01D) {
/*      */               
/*  744 */               BlockPos _bp = new BlockPos(x + 0.0D, y + 0.0D, z + 1.0D);
/*  745 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXCRYSTALEGG.get()).defaultBlockState();
/*  746 */               BlockState _bso = world.getBlockState(_bp);
/*  747 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  748 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  749 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  751 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  752 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  755 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*      */             else {
/*      */               
/*  759 */               BlockPos _bp = new BlockPos(x + 0.0D, y + 0.0D, z + 1.0D);
/*  760 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
/*  761 */               BlockState _bso = world.getBlockState(_bp);
/*  762 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  763 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  764 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  766 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  767 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  770 */               world.setBlock(_bp, _bs, 3);
/*      */             } 
/*      */           }
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  777 */           if (!world.getBlockState(new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D)).is(BlockTags.create(new ResourceLocation("latex:tag_immune_blocks"))) && 
/*      */ 
/*      */             
/*  780 */             !((!world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSTONESPREAD) && world.getBlockState(new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D)).is(BlockTags.create(new ResourceLocation("latex:tag_stone_blocks"))) == true) ? 1 : 0)) {
/*  781 */             if (world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.BEEHIVE || world
/*  782 */               .getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.BEE_NEST) {
/*      */               
/*  784 */               BlockPos _bp = new BlockPos(x + 0.0D, y + 0.0D, z - 1.0D);
/*  785 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXHIVE.get()).defaultBlockState();
/*  786 */               BlockState _bso = world.getBlockState(_bp);
/*  787 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  788 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  789 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  791 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  792 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  795 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*  797 */             else if (world.getBlockState(new BlockPos(x, y + 0.0D, z - 1.0D)).getBlock() == Blocks.COBWEB) {
/*      */               
/*  799 */               BlockPos _bp = new BlockPos(x - 0.0D, y + 0.0D, z - 1.0D);
/*  800 */               BlockState _bs = ((Block)LatexModBlocks.LATEXCOBWEBFIX.get()).defaultBlockState();
/*  801 */               BlockState _bso = world.getBlockState(_bp);
/*  802 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  803 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  804 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  806 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  807 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  810 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*  812 */             else if (world.getBlockState(new BlockPos(x + 0.0D, y + 0.0D, z - 1.0D))
/*  813 */               .is(BlockTags.create(new ResourceLocation("latex:cobblestone"))) && world
/*  814 */               .getLevelData().getGameRules().getBoolean(LatexModGameRules.CANCOBBLESTONEBEINFESTED)) {
/*      */               
/*  816 */               BlockPos _bp = new BlockPos(x + 0.0D, y + 0.0D, z - 1.0D);
/*  817 */               BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).defaultBlockState();
/*  818 */               BlockState _bso = world.getBlockState(_bp);
/*  819 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  820 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  821 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  823 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  824 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  827 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*  829 */             else if (world.getBlockState(new BlockPos(x, y, z - 1.0D)).getBlock() == LatexModBlocks.INFESTEDDLCOBBLESTONE.get() && world
/*  830 */               .getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSTONESPREAD)) {
/*      */               
/*  832 */               BlockPos _bp = new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D);
/*  833 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get()).defaultBlockState();
/*  834 */               BlockState _bso = world.getBlockState(_bp);
/*  835 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  836 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  837 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  839 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  840 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  843 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*  845 */             else if (world.getBlockState(new BlockPos(x, y + 0.0D, z - 1.0D)).getBlock() == Blocks.OAK_LEAVES) {
/*      */               
/*  847 */               BlockPos _bp = new BlockPos(x - 0.0D, y + 0.0D, z - 1.0D);
/*  848 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXLEAVES.get()).defaultBlockState();
/*  849 */               BlockState _bso = world.getBlockState(_bp);
/*  850 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  851 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  852 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  854 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  855 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  858 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*  860 */             else if (world.getBlockState(new BlockPos(x, y + 0.0D, z - 1.0D)).getBlock() == Blocks.OAK_LOG) {
/*      */               
/*  862 */               BlockPos _bp = new BlockPos(x - 0.0D, y + 0.0D, z - 1.0D);
/*  863 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXLOG.get()).defaultBlockState();
/*  864 */               BlockState _bso = world.getBlockState(_bp);
/*  865 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  866 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  867 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  869 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  870 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  873 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*  875 */             else if (world.getFluidState(new BlockPos(x, y, z - 1.0D)).createLegacyBlock().getBlock() == Blocks.WATER || world
/*  876 */               .getFluidState(new BlockPos(x, y, z - 1.0D)).createLegacyBlock().getBlock() == Blocks.WATER) {
/*  877 */               if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXFLUIDS)) {
/*      */                 
/*  879 */                 BlockPos _bp = new BlockPos(x + 0.0D, y - 0.0D, z - 1.0D);
/*  880 */                 BlockState _bs = ((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
/*  881 */                 BlockState _bso = world.getBlockState(_bp);
/*  882 */                 for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  883 */                   Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  884 */                   if (_property != null && _bs.getValue(_property) != null) {
/*      */                     try {
/*  886 */                       _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  887 */                     } catch (Exception exception) {}
/*      */                   } }
/*      */                 
/*  890 */                 world.setBlock(_bp, _bs, 3);
/*      */               } else {
/*      */                 
/*  893 */                 return true;
/*      */               }
/*      */             
/*  896 */             } else if (Math.random() < 0.025D) {
/*      */               
/*  898 */               BlockPos _bp = new BlockPos(x + 0.0D, y + 0.0D, z - 1.0D);
/*  899 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXICE.get()).defaultBlockState();
/*  900 */               BlockState _bso = world.getBlockState(_bp);
/*  901 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  902 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  903 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  905 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  906 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  909 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*  911 */             else if (Math.random() < 0.01D) {
/*      */               
/*  913 */               BlockPos _bp = new BlockPos(x + 0.0D, y + 0.0D, z - 1.0D);
/*  914 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXCRYSTALEGG.get()).defaultBlockState();
/*  915 */               BlockState _bso = world.getBlockState(_bp);
/*  916 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  917 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  918 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  920 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  921 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  924 */               world.setBlock(_bp, _bs, 3);
/*      */             }
/*      */             else {
/*      */               
/*  928 */               BlockPos _bp = new BlockPos(x + 0.0D, y + 0.0D, z - 1.0D);
/*  929 */               BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
/*  930 */               BlockState _bso = world.getBlockState(_bp);
/*  931 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  932 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  933 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/*  935 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  936 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/*  939 */               world.setBlock(_bp, _bs, 3);
/*      */             
/*      */             }
/*      */           
/*      */           }
/*      */         }
/*      */       
/*      */       }
/*  947 */       else if (Math.random() * 100.0D <= world.getLevelData().getGameRules().getInt(LatexModGameRules.DARKLATEXSPREADSPEED)) {
/*      */         
/*  949 */         if (!world.getBlockState(new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D)).is(BlockTags.create(new ResourceLocation("latex:tag_immune_blocks"))) && 
/*      */ 
/*      */           
/*  952 */           !((!world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSTONESPREAD) && world.getBlockState(new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D)).is(BlockTags.create(new ResourceLocation("latex:tag_stone_blocks"))) == true) ? 1 : 0)) {
/*  953 */           if (world.getBlockState(new BlockPos(x + 1.0D, y, z)).getBlock() == Blocks.BEEHIVE || world
/*  954 */             .getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.BEE_NEST) {
/*      */             
/*  956 */             BlockPos _bp = new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D);
/*  957 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXHIVE.get()).defaultBlockState();
/*  958 */             BlockState _bso = world.getBlockState(_bp);
/*  959 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  960 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  961 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/*  963 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  964 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/*  967 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/*  969 */           else if (world.getBlockState(new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D))
/*  970 */             .is(BlockTags.create(new ResourceLocation("latex:cobblestone"))) && world
/*  971 */             .getLevelData().getGameRules().getBoolean(LatexModGameRules.CANCOBBLESTONEBEINFESTED)) {
/*      */             
/*  973 */             BlockPos _bp = new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D);
/*  974 */             BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).defaultBlockState();
/*  975 */             BlockState _bso = world.getBlockState(_bp);
/*  976 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  977 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  978 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/*  980 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  981 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/*  984 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/*  986 */           else if (world.getBlockState(new BlockPos(x + 1.0D, y, z)).getBlock() == LatexModBlocks.INFESTEDDLCOBBLESTONE.get() && world
/*  987 */             .getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSTONESPREAD)) {
/*      */             
/*  989 */             BlockPos _bp = new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D);
/*  990 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get()).defaultBlockState();
/*  991 */             BlockState _bso = world.getBlockState(_bp);
/*  992 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/*  993 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/*  994 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/*  996 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/*  997 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1000 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1002 */           else if (world.getBlockState(new BlockPos(x + 1.0D, y, z)).getBlock() == Blocks.COBWEB) {
/*      */             
/* 1004 */             BlockPos _bp = new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D);
/* 1005 */             BlockState _bs = ((Block)LatexModBlocks.LATEXCOBWEBFIX.get()).defaultBlockState();
/* 1006 */             BlockState _bso = world.getBlockState(_bp);
/* 1007 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1008 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1009 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1011 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1012 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1015 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1017 */           else if (world.getBlockState(new BlockPos(x + 1.0D, y, z)).getBlock() == Blocks.OAK_LOG) {
/*      */             
/* 1019 */             BlockPos _bp = new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D);
/* 1020 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXLOG.get()).defaultBlockState();
/* 1021 */             BlockState _bso = world.getBlockState(_bp);
/* 1022 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1023 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1024 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1026 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1027 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1030 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1032 */           else if (world.getBlockState(new BlockPos(x + 1.0D, y, z)).getBlock() == Blocks.OAK_LEAVES) {
/*      */             
/* 1034 */             BlockPos _bp = new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D);
/* 1035 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXLEAVES.get()).defaultBlockState();
/* 1036 */             BlockState _bso = world.getBlockState(_bp);
/* 1037 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1038 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1039 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1041 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1042 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1045 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1047 */           else if (world.getFluidState(new BlockPos(x + 1.0D, y, z)).createLegacyBlock().getBlock() == Blocks.WATER || world
/* 1048 */             .getFluidState(new BlockPos(x + 1.0D, y, z)).createLegacyBlock().getBlock() == Blocks.WATER) {
/* 1049 */             if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXFLUIDS)) {
/*      */               
/* 1051 */               BlockPos _bp = new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D);
/* 1052 */               BlockState _bs = ((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
/* 1053 */               BlockState _bso = world.getBlockState(_bp);
/* 1054 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1055 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1056 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/* 1058 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1059 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/* 1062 */               world.setBlock(_bp, _bs, 3);
/*      */             } else {
/*      */               
/* 1065 */               return true;
/*      */             }
/*      */           
/* 1068 */           } else if (Math.random() < 0.025D) {
/*      */             
/* 1070 */             BlockPos _bp = new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D);
/* 1071 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXICE.get()).defaultBlockState();
/* 1072 */             BlockState _bso = world.getBlockState(_bp);
/* 1073 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1074 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1075 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1077 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1078 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1081 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1083 */           else if (Math.random() < 0.01D) {
/*      */             
/* 1085 */             BlockPos _bp = new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D);
/* 1086 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get()).defaultBlockState();
/* 1087 */             BlockState _bso = world.getBlockState(_bp);
/* 1088 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1089 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1090 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1092 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1093 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1096 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/*      */           else {
/*      */             
/* 1100 */             BlockPos _bp = new BlockPos(x + 1.0D, y + 0.0D, z + 0.0D);
/* 1101 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
/* 1102 */             BlockState _bso = world.getBlockState(_bp);
/* 1103 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1104 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1105 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1107 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1108 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1111 */             world.setBlock(_bp, _bs, 3);
/*      */           } 
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1118 */         if (!world.getBlockState(new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D)).is(BlockTags.create(new ResourceLocation("latex:tag_immune_blocks"))) && 
/*      */ 
/*      */           
/* 1121 */           !((!world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSTONESPREAD) && world.getBlockState(new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D)).is(BlockTags.create(new ResourceLocation("latex:tag_stone_blocks"))) == true) ? 1 : 0)) {
/* 1122 */           if (world.getBlockState(new BlockPos(x - 1.0D, y, z)).getBlock() == Blocks.BEEHIVE || world
/* 1123 */             .getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.BEE_NEST) {
/*      */             
/* 1125 */             BlockPos _bp = new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D);
/* 1126 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXHIVE.get()).defaultBlockState();
/* 1127 */             BlockState _bso = world.getBlockState(_bp);
/* 1128 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1129 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1130 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1132 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1133 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1136 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1138 */           else if (world.getBlockState(new BlockPos(x - 1.0D, y, z)).getBlock() == Blocks.COBWEB) {
/*      */             
/* 1140 */             BlockPos _bp = new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D);
/* 1141 */             BlockState _bs = ((Block)LatexModBlocks.LATEXCOBWEBFIX.get()).defaultBlockState();
/* 1142 */             BlockState _bso = world.getBlockState(_bp);
/* 1143 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1144 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1145 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1147 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1148 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1151 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1153 */           else if (world.getBlockState(new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D))
/* 1154 */             .is(BlockTags.create(new ResourceLocation("latex:cobblestone"))) && world
/* 1155 */             .getLevelData().getGameRules().getBoolean(LatexModGameRules.CANCOBBLESTONEBEINFESTED)) {
/*      */             
/* 1157 */             BlockPos _bp = new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D);
/* 1158 */             BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).defaultBlockState();
/* 1159 */             BlockState _bso = world.getBlockState(_bp);
/* 1160 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1161 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1162 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1164 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1165 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1168 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1170 */           else if (world.getBlockState(new BlockPos(x - 1.0D, y, z)).getBlock() == LatexModBlocks.INFESTEDDLCOBBLESTONE.get() && world
/* 1171 */             .getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSTONESPREAD)) {
/*      */             
/* 1173 */             BlockPos _bp = new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D);
/* 1174 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get()).defaultBlockState();
/* 1175 */             BlockState _bso = world.getBlockState(_bp);
/* 1176 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1177 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1178 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1180 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1181 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1184 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1186 */           else if (world.getBlockState(new BlockPos(x - 1.0D, y, z)).getBlock() == Blocks.OAK_LEAVES) {
/*      */             
/* 1188 */             BlockPos _bp = new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D);
/* 1189 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXLEAVES.get()).defaultBlockState();
/* 1190 */             BlockState _bso = world.getBlockState(_bp);
/* 1191 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1192 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1193 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1195 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1196 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1199 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1201 */           else if (world.getBlockState(new BlockPos(x - 1.0D, y, z)).getBlock() == Blocks.OAK_LOG) {
/*      */             
/* 1203 */             BlockPos _bp = new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D);
/* 1204 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXLOG.get()).defaultBlockState();
/* 1205 */             BlockState _bso = world.getBlockState(_bp);
/* 1206 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1207 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1208 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1210 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1211 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1214 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1216 */           else if (world.getFluidState(new BlockPos(x - 1.0D, y, z)).createLegacyBlock().getBlock() == Blocks.WATER || world
/* 1217 */             .getFluidState(new BlockPos(x - 1.0D, y, z)).createLegacyBlock().getBlock() == Blocks.WATER) {
/* 1218 */             if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXFLUIDS)) {
/*      */               
/* 1220 */               BlockPos _bp = new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D);
/* 1221 */               BlockState _bs = ((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
/* 1222 */               BlockState _bso = world.getBlockState(_bp);
/* 1223 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1224 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1225 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/* 1227 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1228 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/* 1231 */               world.setBlock(_bp, _bs, 3);
/*      */             } else {
/*      */               
/* 1234 */               return true;
/*      */             }
/*      */           
/* 1237 */           } else if (Math.random() < 0.025D) {
/*      */             
/* 1239 */             BlockPos _bp = new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D);
/* 1240 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXICE.get()).defaultBlockState();
/* 1241 */             BlockState _bso = world.getBlockState(_bp);
/* 1242 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1243 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1244 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1246 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1247 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1250 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1252 */           else if (Math.random() < 0.01D) {
/*      */             
/* 1254 */             BlockPos _bp = new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D);
/* 1255 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get()).defaultBlockState();
/* 1256 */             BlockState _bso = world.getBlockState(_bp);
/* 1257 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1258 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1259 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1261 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1262 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1265 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/*      */           else {
/*      */             
/* 1269 */             BlockPos _bp = new BlockPos(x - 1.0D, y + 0.0D, z + 0.0D);
/* 1270 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
/* 1271 */             BlockState _bso = world.getBlockState(_bp);
/* 1272 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1273 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1274 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1276 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1277 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1280 */             world.setBlock(_bp, _bs, 3);
/*      */           } 
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1287 */         if (!world.getBlockState(new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D)).is(BlockTags.create(new ResourceLocation("latex:tag_immune_blocks"))) && 
/*      */ 
/*      */           
/* 1290 */           !((!world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSTONESPREAD) && world.getBlockState(new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D)).is(BlockTags.create(new ResourceLocation("latex:tag_stone_blocks"))) == true) ? 1 : 0)) {
/* 1291 */           if (world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.BEEHIVE || world
/* 1292 */             .getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.BEE_NEST) {
/*      */             
/* 1294 */             BlockPos _bp = new BlockPos(x + 0.0D, y + 1.0D, z + 0.0D);
/* 1295 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXHIVE.get()).defaultBlockState();
/* 1296 */             BlockState _bso = world.getBlockState(_bp);
/* 1297 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1298 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1299 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1301 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1302 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1305 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1307 */           else if (world.getBlockState(new BlockPos(x, y + 1.0D, z + 0.0D)).getBlock() == Blocks.COBWEB) {
/*      */             
/* 1309 */             BlockPos _bp = new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D);
/* 1310 */             BlockState _bs = ((Block)LatexModBlocks.LATEXCOBWEBFIX.get()).defaultBlockState();
/* 1311 */             BlockState _bso = world.getBlockState(_bp);
/* 1312 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1313 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1314 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1316 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1317 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1320 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1322 */           else if (world.getBlockState(new BlockPos(x + 0.0D, y + 1.0D, z + 0.0D))
/* 1323 */             .is(BlockTags.create(new ResourceLocation("latex:cobblestone"))) && world
/* 1324 */             .getLevelData().getGameRules().getBoolean(LatexModGameRules.CANCOBBLESTONEBEINFESTED)) {
/*      */             
/* 1326 */             BlockPos _bp = new BlockPos(x + 0.0D, y + 1.0D, z + 0.0D);
/* 1327 */             BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).defaultBlockState();
/* 1328 */             BlockState _bso = world.getBlockState(_bp);
/* 1329 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1330 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1331 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1333 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1334 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1337 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1339 */           else if (world.getBlockState(new BlockPos(x, y + 1.0D, z)).getBlock() == LatexModBlocks.INFESTEDDLCOBBLESTONE.get() && world
/* 1340 */             .getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSTONESPREAD)) {
/*      */             
/* 1342 */             BlockPos _bp = new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D);
/* 1343 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get()).defaultBlockState();
/* 1344 */             BlockState _bso = world.getBlockState(_bp);
/* 1345 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1346 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1347 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1349 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1350 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1353 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1355 */           else if (world.getBlockState(new BlockPos(x, y + 1.0D, z + 0.0D)).getBlock() == Blocks.OAK_LEAVES || world
/* 1356 */             .getBlockState(new BlockPos(x, y + 1.0D, z + 0.0D)).getBlock() == Blocks.GRASS || world
/* 1357 */             .getBlockState(new BlockPos(x, y + 1.0D, z + 0.0D)).getBlock() == Blocks.SWEET_BERRY_BUSH || world
/* 1358 */             .getBlockState(new BlockPos(x, y + 1.0D, z + 0.0D)).getBlock() == Blocks.VINE) {
/*      */             
/* 1360 */             BlockPos _bp = new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D);
/* 1361 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXLEAVES.get()).defaultBlockState();
/* 1362 */             BlockState _bso = world.getBlockState(_bp);
/* 1363 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1364 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1365 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1367 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1368 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1371 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1373 */           else if (world.getBlockState(new BlockPos(x, y + 1.0D, z + 0.0D)).getBlock() == Blocks.OAK_LOG) {
/*      */             
/* 1375 */             BlockPos _bp = new BlockPos(x - 0.0D, y + 1.0D, z + 0.0D);
/* 1376 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXLOG.get()).defaultBlockState();
/* 1377 */             BlockState _bso = world.getBlockState(_bp);
/* 1378 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1379 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1380 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1382 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1383 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1386 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1388 */           else if (world.getFluidState(new BlockPos(x, y + 1.0D, z)).createLegacyBlock().getBlock() == Blocks.WATER || world
/* 1389 */             .getFluidState(new BlockPos(x, y + 1.0D, z)).createLegacyBlock().getBlock() == Blocks.WATER) {
/* 1390 */             if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXFLUIDS)) {
/*      */               
/* 1392 */               BlockPos _bp = new BlockPos(x + 0.0D, y + 1.0D, z + 0.0D);
/* 1393 */               BlockState _bs = ((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
/* 1394 */               BlockState _bso = world.getBlockState(_bp);
/* 1395 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1396 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1397 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/* 1399 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1400 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/* 1403 */               world.setBlock(_bp, _bs, 3);
/*      */             } else {
/*      */               
/* 1406 */               return true;
/*      */             } 
/*      */           } else {
/*      */             
/* 1410 */             BlockPos _bp = new BlockPos(x + 0.0D, y + 1.0D, z + 0.0D);
/* 1411 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
/* 1412 */             BlockState _bso = world.getBlockState(_bp);
/* 1413 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1414 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1415 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1417 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1418 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1421 */             world.setBlock(_bp, _bs, 3);
/*      */           } 
/*      */         }
/*      */ 
/*      */         
/* 1426 */         if ((world.getBlockState(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).getBlock() == LatexModBlocks.DARKLATEXHIVE.get() || world
/* 1427 */           .getBlockState(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).getBlock() == LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get() || world
/* 1428 */           .getBlockState(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).getBlock() == LatexModBlocks.LATEXCOBWEBFIX.get() || world
/* 1429 */           .getBlockState(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).getBlock() == LatexModBlocks.DARKLATEXLEAVES.get() || world
/* 1430 */           .getBlockState(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).getBlock() == LatexModBlocks.DARKLATEXCRYSTALEGG.get() || world
/* 1431 */           .getBlockState(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).getBlock() == LatexModBlocks.DARKLATEXICE.get() || 
/*      */           
/* 1433 */           !world.getBlockState(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).is(BlockTags.create(new ResourceLocation("latex:tag_immune_blocks")))) && 
/*      */ 
/*      */           
/* 1436 */           !((!world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSTONESPREAD) && world.getBlockState(new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D)).is(BlockTags.create(new ResourceLocation("latex:tag_stone_blocks"))) == true) ? 1 : 0)) {
/* 1437 */           if (world.getBlockState(new BlockPos(x, y - 1.0D, z + 0.0D)).getBlock() == Blocks.OAK_LEAVES || world
/* 1438 */             .getBlockState(new BlockPos(x, y + 1.0D, z - 0.0D)).getBlock() == Blocks.GRASS || world
/* 1439 */             .getBlockState(new BlockPos(x, y - 1.0D, z + 0.0D)).getBlock() == Blocks.SWEET_BERRY_BUSH || world
/* 1440 */             .getBlockState(new BlockPos(x, y + 1.0D, z - 0.0D)).getBlock() == Blocks.VINE) {
/*      */             
/* 1442 */             BlockPos _bp = new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D);
/* 1443 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXLEAVES.get()).defaultBlockState();
/* 1444 */             BlockState _bso = world.getBlockState(_bp);
/* 1445 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1446 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1447 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1449 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1450 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1453 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1455 */           else if (world.getFluidState(new BlockPos(x, y - 1.0D, z)).createLegacyBlock().getBlock() == Blocks.WATER || world
/* 1456 */             .getFluidState(new BlockPos(x, y - 1.0D, z)).createLegacyBlock().getBlock() == Blocks.WATER) {
/* 1457 */             if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXFLUIDS)) {
/*      */               
/* 1459 */               BlockPos _bp = new BlockPos(x + 0.0D, y - 1.0D, z + 0.0D);
/* 1460 */               BlockState _bs = ((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
/* 1461 */               BlockState _bso = world.getBlockState(_bp);
/* 1462 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1463 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1464 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/* 1466 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1467 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/* 1470 */               world.setBlock(_bp, _bs, 3);
/*      */             } else {
/*      */               
/* 1473 */               return true;
/*      */             } 
/* 1475 */           } else if (world.getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == LatexModBlocks.INFESTEDDLCOBBLESTONE.get() && world
/* 1476 */             .getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSTONESPREAD)) {
/*      */             
/* 1478 */             BlockPos _bp = new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D);
/* 1479 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get()).defaultBlockState();
/* 1480 */             BlockState _bso = world.getBlockState(_bp);
/* 1481 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1482 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1483 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1485 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1486 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1489 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1491 */           else if (world.getBlockState(new BlockPos(x + 0.0D, y - 1.0D, z + 0.0D))
/* 1492 */             .is(BlockTags.create(new ResourceLocation("latex:cobblestone"))) && world
/* 1493 */             .getLevelData().getGameRules().getBoolean(LatexModGameRules.CANCOBBLESTONEBEINFESTED)) {
/*      */             
/* 1495 */             BlockPos _bp = new BlockPos(x + 0.0D, y - 1.0D, z + 0.0D);
/* 1496 */             BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).defaultBlockState();
/* 1497 */             BlockState _bso = world.getBlockState(_bp);
/* 1498 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1499 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1500 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1502 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1503 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1506 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/*      */           else {
/*      */             
/* 1510 */             BlockPos _bp = new BlockPos(x - 0.0D, y - 1.0D, z + 0.0D);
/* 1511 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
/* 1512 */             BlockState _bso = world.getBlockState(_bp);
/* 1513 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1514 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1515 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1517 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1518 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1521 */             world.setBlock(_bp, _bs, 3);
/*      */           } 
/*      */         }
/*      */ 
/*      */ 
/*      */         
/* 1527 */         if (!world.getBlockState(new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D)).is(BlockTags.create(new ResourceLocation("latex:tag_immune_blocks"))) && 
/*      */ 
/*      */           
/* 1530 */           !((!world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSTONESPREAD) && world.getBlockState(new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D)).is(BlockTags.create(new ResourceLocation("latex:tag_stone_blocks"))) == true) ? 1 : 0)) {
/* 1531 */           if (world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.BEEHIVE || world
/* 1532 */             .getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.BEE_NEST) {
/*      */             
/* 1534 */             BlockPos _bp = new BlockPos(x + 0.0D, y + 0.0D, z + 1.0D);
/* 1535 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXHIVE.get()).defaultBlockState();
/* 1536 */             BlockState _bso = world.getBlockState(_bp);
/* 1537 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1538 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1539 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1541 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1542 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1545 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1547 */           else if (world.getBlockState(new BlockPos(x, y + 0.0D, z + 1.0D)).getBlock() == Blocks.COBWEB) {
/*      */             
/* 1549 */             BlockPos _bp = new BlockPos(x - 0.0D, y + 0.0D, z + 1.0D);
/* 1550 */             BlockState _bs = ((Block)LatexModBlocks.LATEXCOBWEBFIX.get()).defaultBlockState();
/* 1551 */             BlockState _bso = world.getBlockState(_bp);
/* 1552 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1553 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1554 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1556 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1557 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1560 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1562 */           else if (world.getBlockState(new BlockPos(x + 0.0D, y + 0.0D, z + 1.0D))
/* 1563 */             .is(BlockTags.create(new ResourceLocation("latex:cobblestone"))) && world
/* 1564 */             .getLevelData().getGameRules().getBoolean(LatexModGameRules.CANCOBBLESTONEBEINFESTED)) {
/*      */             
/* 1566 */             BlockPos _bp = new BlockPos(x + 0.0D, y + 0.0D, z + 1.0D);
/* 1567 */             BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).defaultBlockState();
/* 1568 */             BlockState _bso = world.getBlockState(_bp);
/* 1569 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1570 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1571 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1573 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1574 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1577 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1579 */           else if (world.getBlockState(new BlockPos(x, y, z + 1.0D)).getBlock() == LatexModBlocks.INFESTEDDLCOBBLESTONE.get() && world
/* 1580 */             .getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSTONESPREAD)) {
/*      */             
/* 1582 */             BlockPos _bp = new BlockPos(x - 0.0D, y - 0.0D, z + 1.0D);
/* 1583 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get()).defaultBlockState();
/* 1584 */             BlockState _bso = world.getBlockState(_bp);
/* 1585 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1586 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1587 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1589 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1590 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1593 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1595 */           else if (world.getBlockState(new BlockPos(x, y + 0.0D, z + 1.0D)).getBlock() == Blocks.OAK_LEAVES) {
/*      */             
/* 1597 */             BlockPos _bp = new BlockPos(x - 0.0D, y + 0.0D, z + 1.0D);
/* 1598 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXLEAVES.get()).defaultBlockState();
/* 1599 */             BlockState _bso = world.getBlockState(_bp);
/* 1600 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1601 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1602 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1604 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1605 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1608 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1610 */           else if (world.getBlockState(new BlockPos(x, y + 0.0D, z + 1.0D)).getBlock() == Blocks.OAK_LOG) {
/*      */             
/* 1612 */             BlockPos _bp = new BlockPos(x - 0.0D, y + 0.0D, z + 1.0D);
/* 1613 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXLOG.get()).defaultBlockState();
/* 1614 */             BlockState _bso = world.getBlockState(_bp);
/* 1615 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1616 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1617 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1619 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1620 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1623 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1625 */           else if (world.getFluidState(new BlockPos(x, y, z + 1.0D)).createLegacyBlock().getBlock() == Blocks.WATER || world
/* 1626 */             .getFluidState(new BlockPos(x, y, z + 1.0D)).createLegacyBlock().getBlock() == Blocks.WATER) {
/* 1627 */             if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXFLUIDS)) {
/*      */               
/* 1629 */               BlockPos _bp = new BlockPos(x + 0.0D, y - 0.0D, z + 1.0D);
/* 1630 */               BlockState _bs = ((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
/* 1631 */               BlockState _bso = world.getBlockState(_bp);
/* 1632 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1633 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1634 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/* 1636 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1637 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/* 1640 */               world.setBlock(_bp, _bs, 3);
/*      */             } else {
/*      */               
/* 1643 */               return true;
/*      */             }
/*      */           
/* 1646 */           } else if (Math.random() < 0.025D) {
/*      */             
/* 1648 */             BlockPos _bp = new BlockPos(x + 0.0D, y + 0.0D, z + 1.0D);
/* 1649 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXICE.get()).defaultBlockState();
/* 1650 */             BlockState _bso = world.getBlockState(_bp);
/* 1651 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1652 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1653 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1655 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1656 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1659 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1661 */           else if (Math.random() < 0.01D) {
/*      */             
/* 1663 */             BlockPos _bp = new BlockPos(x + 0.0D, y + 0.0D, z + 1.0D);
/* 1664 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXCRYSTALEGG.get()).defaultBlockState();
/* 1665 */             BlockState _bso = world.getBlockState(_bp);
/* 1666 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1667 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1668 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1670 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1671 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1674 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/*      */           else {
/*      */             
/* 1678 */             BlockPos _bp = new BlockPos(x + 0.0D, y + 0.0D, z + 1.0D);
/* 1679 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
/* 1680 */             BlockState _bso = world.getBlockState(_bp);
/* 1681 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1682 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1683 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1685 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1686 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1689 */             world.setBlock(_bp, _bs, 3);
/*      */           } 
/*      */         }
/*      */ 
/*      */ 
/*      */ 
/*      */         
/* 1696 */         if (!world.getBlockState(new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D)).is(BlockTags.create(new ResourceLocation("latex:tag_immune_blocks"))) && 
/*      */ 
/*      */           
/* 1699 */           !((!world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSTONESPREAD) && world.getBlockState(new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D)).is(BlockTags.create(new ResourceLocation("latex:tag_stone_blocks"))) == true) ? 1 : 0)) {
/* 1700 */           if (world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.BEEHIVE || world
/* 1701 */             .getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.BEE_NEST) {
/*      */             
/* 1703 */             BlockPos _bp = new BlockPos(x + 0.0D, y + 0.0D, z - 1.0D);
/* 1704 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXHIVE.get()).defaultBlockState();
/* 1705 */             BlockState _bso = world.getBlockState(_bp);
/* 1706 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1707 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1708 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1710 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1711 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1714 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1716 */           else if (world.getBlockState(new BlockPos(x, y + 0.0D, z - 1.0D)).getBlock() == Blocks.COBWEB) {
/*      */             
/* 1718 */             BlockPos _bp = new BlockPos(x - 0.0D, y + 0.0D, z - 1.0D);
/* 1719 */             BlockState _bs = ((Block)LatexModBlocks.LATEXCOBWEBFIX.get()).defaultBlockState();
/* 1720 */             BlockState _bso = world.getBlockState(_bp);
/* 1721 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1722 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1723 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1725 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1726 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1729 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1731 */           else if (world.getBlockState(new BlockPos(x + 0.0D, y + 0.0D, z - 1.0D))
/* 1732 */             .is(BlockTags.create(new ResourceLocation("latex:cobblestone"))) && world
/* 1733 */             .getLevelData().getGameRules().getBoolean(LatexModGameRules.CANCOBBLESTONEBEINFESTED)) {
/*      */             
/* 1735 */             BlockPos _bp = new BlockPos(x + 0.0D, y + 0.0D, z - 1.0D);
/* 1736 */             BlockState _bs = ((Block)LatexModBlocks.INFESTEDDLCOBBLESTONE.get()).defaultBlockState();
/* 1737 */             BlockState _bso = world.getBlockState(_bp);
/* 1738 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1739 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1740 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1742 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1743 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1746 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1748 */           else if (world.getBlockState(new BlockPos(x, y, z - 1.0D)).getBlock() == LatexModBlocks.INFESTEDDLCOBBLESTONE.get() && world
/* 1749 */             .getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXSTONESPREAD)) {
/*      */             
/* 1751 */             BlockPos _bp = new BlockPos(x - 0.0D, y - 0.0D, z - 1.0D);
/* 1752 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get()).defaultBlockState();
/* 1753 */             BlockState _bso = world.getBlockState(_bp);
/* 1754 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1755 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1756 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1758 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1759 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1762 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1764 */           else if (world.getBlockState(new BlockPos(x, y + 0.0D, z - 1.0D)).getBlock() == Blocks.OAK_LEAVES) {
/*      */             
/* 1766 */             BlockPos _bp = new BlockPos(x - 0.0D, y + 0.0D, z - 1.0D);
/* 1767 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXLEAVES.get()).defaultBlockState();
/* 1768 */             BlockState _bso = world.getBlockState(_bp);
/* 1769 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1770 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1771 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1773 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1774 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1777 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1779 */           else if (world.getBlockState(new BlockPos(x, y + 0.0D, z - 1.0D)).getBlock() == Blocks.OAK_LOG) {
/*      */             
/* 1781 */             BlockPos _bp = new BlockPos(x - 0.0D, y + 0.0D, z - 1.0D);
/* 1782 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXLOG.get()).defaultBlockState();
/* 1783 */             BlockState _bso = world.getBlockState(_bp);
/* 1784 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1785 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1786 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1788 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1789 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1792 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1794 */           else if (world.getFluidState(new BlockPos(x, y, z - 1.0D)).createLegacyBlock().getBlock() == Blocks.WATER || world
/* 1795 */             .getFluidState(new BlockPos(x, y, z - 1.0D)).createLegacyBlock().getBlock() == Blocks.WATER) {
/* 1796 */             if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXFLUIDS)) {
/*      */               
/* 1798 */               BlockPos _bp = new BlockPos(x + 0.0D, y - 0.0D, z - 1.0D);
/* 1799 */               BlockState _bs = ((Block)LatexModBlocks.DARK_LATEX_GOO_FLUID.get()).defaultBlockState();
/* 1800 */               BlockState _bso = world.getBlockState(_bp);
/* 1801 */               for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1802 */                 Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1803 */                 if (_property != null && _bs.getValue(_property) != null) {
/*      */                   try {
/* 1805 */                     _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1806 */                   } catch (Exception exception) {}
/*      */                 } }
/*      */               
/* 1809 */               world.setBlock(_bp, _bs, 3);
/*      */             } else {
/*      */               
/* 1812 */               return true;
/*      */             }
/*      */           
/* 1815 */           } else if (Math.random() < 0.025D) {
/*      */             
/* 1817 */             BlockPos _bp = new BlockPos(x + 0.0D, y + 0.0D, z - 1.0D);
/* 1818 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXICE.get()).defaultBlockState();
/* 1819 */             BlockState _bso = world.getBlockState(_bp);
/* 1820 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1821 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1822 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1824 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1825 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1828 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/* 1830 */           else if (Math.random() < 0.01D) {
/*      */             
/* 1832 */             BlockPos _bp = new BlockPos(x + 0.0D, y + 0.0D, z - 1.0D);
/* 1833 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXCRYSTALEGG.get()).defaultBlockState();
/* 1834 */             BlockState _bso = world.getBlockState(_bp);
/* 1835 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1836 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1837 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1839 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1840 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1843 */             world.setBlock(_bp, _bs, 3);
/*      */           }
/*      */           else {
/*      */             
/* 1847 */             BlockPos _bp = new BlockPos(x + 0.0D, y + 0.0D, z - 1.0D);
/* 1848 */             BlockState _bs = ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState();
/* 1849 */             BlockState _bso = world.getBlockState(_bp);
/* 1850 */             for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 1851 */               Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 1852 */               if (_property != null && _bs.getValue(_property) != null) {
/*      */                 try {
/* 1854 */                   _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 1855 */                 } catch (Exception exception) {}
/*      */               } }
/*      */             
/* 1858 */             world.setBlock(_bp, _bs, 3);
/*      */           } 
/*      */         }
/*      */       } 
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1867 */     return false;
/*      */   }
/*      */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarklatexblockUpdateTickProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */