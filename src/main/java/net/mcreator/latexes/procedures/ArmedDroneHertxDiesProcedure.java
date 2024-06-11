/*     */ package net.mcreator.latexes.procedures;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.item.ItemEntity;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.level.Explosion;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ 
/*     */ public class ArmedDroneHertxDiesProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z) {
/*  14 */     if (Math.random() < 0.05D)
/*  15 */     { if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide())
/*  16 */           _level.explode(null, x, y, z, 3.0F, Explosion.BlockInteraction.BREAK);  }
/*     */        }
/*  18 */     else { if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/*  19 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.IRON_INGOT));
/*  20 */           entityToSpawn.setPickUpDelay(20);
/*  21 */           _level.addFreshEntity((Entity)entityToSpawn);
/*     */         }  }
/*  23 */        if (Math.random() < 0.3D) {
/*  24 */         if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/*  25 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.IRON_INGOT));
/*  26 */             entityToSpawn.setPickUpDelay(20);
/*  27 */             _level.addFreshEntity((Entity)entityToSpawn);
/*     */           }  }
/*  29 */          if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/*  30 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.IRON_NUGGET));
/*  31 */             entityToSpawn.setPickUpDelay(20);
/*  32 */             _level.addFreshEntity((Entity)entityToSpawn);
/*     */           }  }
/*  34 */          if (Math.random() < 0.2D) {
/*  35 */           if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/*  36 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.IRON_NUGGET));
/*  37 */               entityToSpawn.setPickUpDelay(20);
/*  38 */               _level.addFreshEntity((Entity)entityToSpawn);
/*     */             }  }
/*  40 */            if (Math.random() < 0.3D) {
/*  41 */             if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/*  42 */                 ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.IRON_INGOT));
/*  43 */                 entityToSpawn.setPickUpDelay(20);
/*  44 */                 _level.addFreshEntity((Entity)entityToSpawn);
/*     */               }  }
/*  46 */              if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/*  47 */                 ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.IRON_INGOT));
/*  48 */                 entityToSpawn.setPickUpDelay(20);
/*  49 */                 _level.addFreshEntity((Entity)entityToSpawn);
/*     */               }  }
/*  51 */              if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/*  52 */                 ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.IRON_NUGGET));
/*  53 */                 entityToSpawn.setPickUpDelay(20);
/*  54 */                 _level.addFreshEntity((Entity)entityToSpawn);
/*     */               }  }
/*  56 */              if (Math.random() < 0.2D && 
/*  57 */               world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/*  58 */                 ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.IRON_INGOT));
/*  59 */                 entityToSpawn.setPickUpDelay(20);
/*  60 */                 _level.addFreshEntity((Entity)entityToSpawn);
/*     */               }  }
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*  66 */       if (Math.random() < 0.2D) {
/*  67 */         if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/*  68 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.IRON_NUGGET));
/*  69 */             entityToSpawn.setPickUpDelay(20);
/*  70 */             _level.addFreshEntity((Entity)entityToSpawn);
/*     */           }  }
/*  72 */          if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/*  73 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.IRON_INGOT));
/*  74 */             entityToSpawn.setPickUpDelay(20);
/*  75 */             _level.addFreshEntity((Entity)entityToSpawn);
/*     */           }  }
/*  77 */          if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/*  78 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.IRON_NUGGET));
/*  79 */             entityToSpawn.setPickUpDelay(20);
/*  80 */             _level.addFreshEntity((Entity)entityToSpawn);
/*     */           }  }
/*  82 */          if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/*  83 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.REDSTONE));
/*  84 */             entityToSpawn.setPickUpDelay(20);
/*  85 */             _level.addFreshEntity((Entity)entityToSpawn);
/*     */           }  }
/*  87 */          if (Math.random() < 0.2D) {
/*  88 */           if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/*  89 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.REDSTONE));
/*  90 */               entityToSpawn.setPickUpDelay(20);
/*  91 */               _level.addFreshEntity((Entity)entityToSpawn);
/*     */             }  }
/*  93 */            if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/*  94 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.REDSTONE));
/*  95 */               entityToSpawn.setPickUpDelay(20);
/*  96 */               _level.addFreshEntity((Entity)entityToSpawn);
/*     */             }  }
/*  98 */            if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/*  99 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.REDSTONE));
/* 100 */               entityToSpawn.setPickUpDelay(20);
/* 101 */               _level.addFreshEntity((Entity)entityToSpawn);
/*     */             }  }
/*     */         
/*     */         } 
/* 105 */       }  if (Math.random() < 0.1D) {
/* 106 */         if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 107 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.M_4_ASSAULT_RIFLE.get()));
/* 108 */             entityToSpawn.setPickUpDelay(20);
/* 109 */             _level.addFreshEntity((Entity)entityToSpawn);
/*     */           }  }
/* 111 */          if (Math.random() < 0.6D)
/* 112 */           for (int index0 = 0; index0 < (int)(Math.random() * 10.0D); index0++) {
/* 113 */             if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 114 */                 ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.RIFLE_AMMO.get()));
/* 115 */                 entityToSpawn.setPickUpDelay(20);
/* 116 */                 _level.addFreshEntity((Entity)entityToSpawn);
/*     */               }  }
/*     */           
/*     */           }  
/*     */       } 
/* 121 */       if (Math.random() < 0.05D) {
/* 122 */         if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 123 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.HERTXVISOR.get()));
/* 124 */             entityToSpawn.setPickUpDelay(20);
/* 125 */             _level.addFreshEntity((Entity)entityToSpawn);
/*     */           }  }
/* 127 */          if (Math.random() < 0.35D) {
/* 128 */           if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 129 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.HERTXENGINEER_CHESTPLATE.get()));
/* 130 */               entityToSpawn.setPickUpDelay(20);
/* 131 */               _level.addFreshEntity((Entity)entityToSpawn);
/*     */             }  }
/* 133 */            if (Math.random() < 0.4D && 
/* 134 */             world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 135 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.HERTXENGINEER_LEGGINGS.get()));
/* 136 */               entityToSpawn.setPickUpDelay(20);
/* 137 */               _level.addFreshEntity((Entity)entityToSpawn);
/*     */             }  }
/*     */         
/*     */         } 
/*     */       }  }
/*     */   
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\ArmedDroneHertxDiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */