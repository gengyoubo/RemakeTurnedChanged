/*    */ package net.mcreator.latexes.procedures;
/*    */ import com.google.common.collect.UnmodifiableIterator;
/*    */ import java.util.Map;
/*    */ import net.mcreator.latexes.init.LatexModBlocks;
/*    */ import net.mcreator.latexes.init.LatexModGameRules;
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.item.ItemEntity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ 
/*    */ public class YufengEntityDiesProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 20 */     if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXESLEAVEBLOCK) == true && (
/* 21 */       (world.getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.BEDROCK) ? true : false) != true && (
/* 22 */       (world.getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.CAVE_AIR || world
/* 23 */       .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.AIR || world
/* 24 */       .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.VOID_AIR) ? true : false) != true) {
/*    */       
/* 26 */       BlockPos _bp = new BlockPos(x, y, z);
/* 27 */       BlockState _bs = ((Block)LatexModBlocks.DARKLATEXCARPET.get()).defaultBlockState();
/* 28 */       BlockState _bso = world.getBlockState(_bp);
/* 29 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 30 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 31 */         if (_property != null && _bs.getValue(_property) != null) {
/*    */           try {
/* 33 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 34 */           } catch (Exception exception) {}
/*    */         } }
/*    */       
/* 37 */       world.setBlock(_bp, _bs, 3);
/*    */     } 
/*    */ 
/*    */     
/* 41 */     if (Math.random() < 0.01D && 
/* 42 */       world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 43 */         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.YUFENGBODY_CHESTPLATE.get()));
/* 44 */         entityToSpawn.setPickUpDelay(10);
/* 45 */         _level.addFreshEntity((Entity)entityToSpawn);
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\YufengEntityDiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */