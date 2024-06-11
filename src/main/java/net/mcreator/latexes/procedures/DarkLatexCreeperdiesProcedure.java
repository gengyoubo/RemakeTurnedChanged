/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.init.LatexModBlocks;
/*    */ import net.mcreator.latexes.init.LatexModGameRules;
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.item.ItemEntity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Items;
/*    */ import net.minecraft.world.level.Explosion;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class DarkLatexCreeperdiesProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 19 */     if (entity == null)
/*    */       return; 
/* 21 */     boolean found = false;
/* 22 */     double sx = 0.0D;
/* 23 */     double sy = 0.0D;
/* 24 */     double sz = 0.0D;
/* 25 */     if (entity.isOnFire() && Math.random() <= 0.75D) {
/* 26 */       if (!entity.level.isClientSide())
/* 27 */         entity.discard(); 
/* 28 */       if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide())
/* 29 */           _level.explode(null, x, y, z, 5.0F, Explosion.BlockInteraction.BREAK);  }
/* 30 */        sx = -3.0D;
/* 31 */       found = false;
/* 32 */       for (int index0 = 0; index0 < 6; index0++) {
/* 33 */         sy = -5.0D;
/* 34 */         for (int index1 = 0; index1 < 6; index1++) {
/* 35 */           sz = -3.0D;
/* 36 */           for (int index2 = 0; index2 < 6; index2++) {
/* 37 */             if (world.getBlockState(new BlockPos(x + sx, y + sy, z + sz)).getBlock() != Blocks.CAVE_AIR && world
/* 38 */               .getBlockState(new BlockPos(x + sx, y + sy, z + sz)).getBlock() != Blocks.VOID_AIR && world
/* 39 */               .getBlockState(new BlockPos(x + sx, y + sy, z + sz)).getBlock() != Blocks.AIR) {
/* 40 */               found = true;
/*    */             }
/* 42 */             sz++;
/*    */           } 
/* 44 */           sy++;
/*    */         } 
/* 46 */         sx++;
/*    */       } 
/* 48 */       if (found == true && (
/* 49 */         world.getBlockState(new BlockPos(x, y + 1.0D, z)).getBlock() == Blocks.AIR || world
/* 50 */         .getBlockState(new BlockPos(x, y + 1.0D, z)).getBlock() == Blocks.VOID_AIR || world
/* 51 */         .getBlockState(new BlockPos(x, y + 1.0D, z)).getBlock() == Blocks.CAVE_AIR)) {
/* 52 */         world.setBlock(new BlockPos(x, y + 1.0D, z), ((Block)LatexModBlocks.DARKLATEXCARPET.get()).defaultBlockState(), 3);
/*    */       }
/*    */     } else {
/*    */       
/* 56 */       if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 57 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
/* 58 */           entityToSpawn.setPickUpDelay(10);
/* 59 */           _level.addFreshEntity((Entity)entityToSpawn);
/*    */         }  }
/* 61 */        if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 62 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.GUNPOWDER));
/* 63 */           entityToSpawn.setPickUpDelay(10);
/* 64 */           _level.addFreshEntity((Entity)entityToSpawn);
/*    */         }  }
/* 66 */        if (Math.random() < 0.35D) {
/* 67 */         if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 68 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
/* 69 */             entityToSpawn.setPickUpDelay(10);
/* 70 */             _level.addFreshEntity((Entity)entityToSpawn);
/*    */           }  }
/* 72 */          if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 73 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.BONE));
/* 74 */             entityToSpawn.setPickUpDelay(10);
/* 75 */             _level.addFreshEntity((Entity)entityToSpawn);
/*    */           }  }
/*    */       
/* 78 */       }  if (Math.random() < 0.1D && 
/* 79 */         world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 80 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.GUNPOWDER));
/* 81 */           entityToSpawn.setPickUpDelay(10);
/* 82 */           _level.addFreshEntity((Entity)entityToSpawn);
/*    */         }  }
/*    */       
/* 85 */       if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXESLEAVEBLOCK) == true && (
/* 86 */         (world.getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.BEDROCK) ? true : false) != true && (
/* 87 */         world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.CAVE_AIR || world
/* 88 */         .getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.VOID_AIR || world
/* 89 */         .getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.AIR) && 
/* 90 */         Math.random() < 0.72D && 
/* 91 */         !entity.isOnFire())
/* 92 */         world.setBlock(new BlockPos(x, y, z), ((Block)LatexModBlocks.DARKLATEXCARPET.get()).defaultBlockState(), 3); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarkLatexCreeperdiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */