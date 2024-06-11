/*     */ package net.mcreator.latexes.procedures;
/*     */ import net.mcreator.latexes.init.LatexModBlocks;
/*     */ import net.mcreator.latexes.init.LatexModGameRules;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.item.ItemEntity;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.level.Explosion;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ 
/*     */ public class DarkLatexCreeperEnhancedDiesProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  19 */     if (entity == null)
/*     */       return; 
/*  21 */     boolean found = false;
/*  22 */     double sx = 0.0D;
/*  23 */     double sy = 0.0D;
/*  24 */     double sz = 0.0D;
/*  25 */     if (entity.isOnFire() && Math.random() <= 0.9D) {
/*  26 */       if (!entity.level.isClientSide())
/*  27 */         entity.discard(); 
/*  28 */       if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide())
/*  29 */           _level.explode(null, x, y, z, 8.0F, Explosion.BlockInteraction.BREAK);  }
/*  30 */        sx = -5.0D;
/*  31 */       found = false;
/*  32 */       for (int index0 = 0; index0 < 9; index0++) {
/*  33 */         sy = -9.0D;
/*  34 */         for (int index1 = 0; index1 < 9; index1++) {
/*  35 */           sz = -5.0D;
/*  36 */           for (int index2 = 0; index2 < 9; index2++) {
/*  37 */             if (world.getBlockState(new BlockPos(x + sx, y + sy, z + sz)).getBlock() != Blocks.CAVE_AIR && world
/*  38 */               .getBlockState(new BlockPos(x + sx, y + sy, z + sz)).getBlock() != Blocks.VOID_AIR && world
/*  39 */               .getBlockState(new BlockPos(x + sx, y + sy, z + sz)).getBlock() != Blocks.AIR) {
/*  40 */               found = true;
/*     */             }
/*  42 */             sz++;
/*     */           } 
/*  44 */           sy++;
/*     */         } 
/*  46 */         sx++;
/*     */       } 
/*  48 */       if (found == true && (
/*  49 */         world.getBlockState(new BlockPos(x, y + 1.0D, z)).getBlock() == Blocks.AIR || world
/*  50 */         .getBlockState(new BlockPos(x, y + 1.0D, z)).getBlock() == Blocks.VOID_AIR || world
/*  51 */         .getBlockState(new BlockPos(x, y + 1.0D, z)).getBlock() == Blocks.CAVE_AIR)) {
/*  52 */         world.setBlock(new BlockPos(x, y + 1.0D, z), ((Block)LatexModBlocks.DARKLATEXCARPET.get()).defaultBlockState(), 3);
/*     */       }
/*     */     } else {
/*     */       
/*  56 */       if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/*  57 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
/*  58 */           entityToSpawn.setPickUpDelay(10);
/*  59 */           _level.addFreshEntity((Entity)entityToSpawn);
/*     */         }  }
/*  61 */        if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/*  62 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
/*  63 */           entityToSpawn.setPickUpDelay(10);
/*  64 */           _level.addFreshEntity((Entity)entityToSpawn);
/*     */         }  }
/*  66 */        if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/*  67 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.DARKLATEXCRYSTAL.get()));
/*  68 */           entityToSpawn.setPickUpDelay(10);
/*  69 */           _level.addFreshEntity((Entity)entityToSpawn);
/*     */         }  }
/*  71 */        if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/*  72 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.BONE));
/*  73 */           entityToSpawn.setPickUpDelay(10);
/*  74 */           _level.addFreshEntity((Entity)entityToSpawn);
/*     */         }  }
/*  76 */        if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/*  77 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.GUNPOWDER));
/*  78 */           entityToSpawn.setPickUpDelay(10);
/*  79 */           _level.addFreshEntity((Entity)entityToSpawn);
/*     */         }  }
/*  81 */        if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/*  82 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.GUNPOWDER));
/*  83 */           entityToSpawn.setPickUpDelay(10);
/*  84 */           _level.addFreshEntity((Entity)entityToSpawn);
/*     */         }  }
/*  86 */        if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/*  87 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.GUNPOWDER));
/*  88 */           entityToSpawn.setPickUpDelay(10);
/*  89 */           _level.addFreshEntity((Entity)entityToSpawn);
/*     */         }  }
/*  91 */        if (Math.random() < 0.35D) {
/*  92 */         if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/*  93 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
/*  94 */             entityToSpawn.setPickUpDelay(10);
/*  95 */             _level.addFreshEntity((Entity)entityToSpawn);
/*     */           }  }
/*  97 */          if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/*  98 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.BONE));
/*  99 */             entityToSpawn.setPickUpDelay(10);
/* 100 */             _level.addFreshEntity((Entity)entityToSpawn);
/*     */           }  }
/* 102 */          if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 103 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.BONE));
/* 104 */             entityToSpawn.setPickUpDelay(10);
/* 105 */             _level.addFreshEntity((Entity)entityToSpawn);
/*     */           }  }
/* 107 */          if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 108 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.DARKLATEXCRYSTAL.get()));
/* 109 */             entityToSpawn.setPickUpDelay(10);
/* 110 */             _level.addFreshEntity((Entity)entityToSpawn);
/*     */           }  }
/* 112 */          if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 113 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.DARKLATEXCRYSTAL.get()));
/* 114 */             entityToSpawn.setPickUpDelay(10);
/* 115 */             _level.addFreshEntity((Entity)entityToSpawn);
/*     */           }  }
/*     */       
/* 118 */       }  if (Math.random() < 0.1D) {
/* 119 */         if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 120 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.DARKLATEXCRYSTAL.get()));
/* 121 */             entityToSpawn.setPickUpDelay(10);
/* 122 */             _level.addFreshEntity((Entity)entityToSpawn);
/*     */           }  }
/* 124 */          if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 125 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.GUNPOWDER));
/* 126 */             entityToSpawn.setPickUpDelay(10);
/* 127 */             _level.addFreshEntity((Entity)entityToSpawn);
/*     */           }  }
/* 129 */          if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 130 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.GUNPOWDER));
/* 131 */             entityToSpawn.setPickUpDelay(10);
/* 132 */             _level.addFreshEntity((Entity)entityToSpawn);
/*     */           }  }
/* 134 */          if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 135 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.GUNPOWDER));
/* 136 */             entityToSpawn.setPickUpDelay(10);
/* 137 */             _level.addFreshEntity((Entity)entityToSpawn);
/*     */           }  }
/* 139 */          if (Math.random() < 0.1D) {
/* 140 */           if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 141 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.DARKLATEXCRYSTAL.get()));
/* 142 */               entityToSpawn.setPickUpDelay(10);
/* 143 */               _level.addFreshEntity((Entity)entityToSpawn);
/*     */             }  }
/* 145 */            if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 146 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.GUNPOWDER));
/* 147 */               entityToSpawn.setPickUpDelay(10);
/* 148 */               _level.addFreshEntity((Entity)entityToSpawn);
/*     */             }  }
/* 150 */            if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 151 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.GUNPOWDER));
/* 152 */               entityToSpawn.setPickUpDelay(10);
/* 153 */               _level.addFreshEntity((Entity)entityToSpawn);
/*     */             }  }
/* 155 */            if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 156 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.GUNPOWDER));
/* 157 */               entityToSpawn.setPickUpDelay(10);
/* 158 */               _level.addFreshEntity((Entity)entityToSpawn);
/*     */             }  }
/*     */         
/*     */         } 
/* 162 */       }  if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXESLEAVEBLOCK) == true && (
/* 163 */         (world.getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.BEDROCK) ? true : false) != true && (
/* 164 */         world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.CAVE_AIR || world
/* 165 */         .getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.VOID_AIR || world
/* 166 */         .getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.AIR) && 
/* 167 */         Math.random() < 0.72D && 
/* 168 */         !entity.isOnFire())
/* 169 */         world.setBlock(new BlockPos(x, y, z), ((Block)LatexModBlocks.DARKLATEXCARPET.get()).defaultBlockState(), 3); 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarkLatexCreeperEnhancedDiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */