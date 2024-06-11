/*     */ package net.ltxprogrammer.turned.procedures;
/*     */ import net.ltxprogrammer.changed.init.ChangedItems;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.item.ItemEntity;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.level.Explosion;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ 
/*     */ public class DarkLatexCreeperEnhancedDiesProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/*  16 */     if (entity == null)
/*     */       return; 
/*  18 */     boolean found = false;
/*  19 */     double sx = 0.0D;
/*  20 */     double sy = 0.0D;
/*  21 */     double sz = 0.0D;
/*  22 */     if (entity.m_6060_() && Math.random() <= 0.9D) {
/*  23 */       if (!entity.f_19853_.m_5776_())
/*  24 */         entity.m_146870_(); 
/*  25 */       if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_())
/*  26 */           _level.m_46511_(null, x, y, z, 8.0F, Explosion.BlockInteraction.BREAK);  }
/*  27 */        sx = -5.0D;
/*  28 */       found = false;
/*  29 */       for (int index0 = 0; index0 < 9; index0++) {
/*  30 */         sy = -9.0D;
/*  31 */         for (int index1 = 0; index1 < 9; index1++) {
/*  32 */           sz = -5.0D;
/*  33 */           for (int index2 = 0; index2 < 9; index2++) {
/*  34 */             if (world.m_8055_(new BlockPos(x + sx, y + sy, z + sz)).m_60734_() != Blocks.f_50627_ && world
/*  35 */               .m_8055_(new BlockPos(x + sx, y + sy, z + sz)).m_60734_() != Blocks.f_50626_ && world
/*  36 */               .m_8055_(new BlockPos(x + sx, y + sy, z + sz)).m_60734_() != Blocks.f_50016_) {
/*  37 */               found = true;
/*     */             }
/*  39 */             sz++;
/*     */           } 
/*  41 */           sy++;
/*     */         } 
/*  43 */         sx++;
/*     */       } 
/*     */     } else {
/*  46 */       if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/*  47 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
/*  48 */           entityToSpawn.m_32010_(10);
/*  49 */           _level.m_7967_((Entity)entityToSpawn);
/*     */         }  }
/*  51 */        if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/*  52 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
/*  53 */           entityToSpawn.m_32010_(10);
/*  54 */           _level.m_7967_((Entity)entityToSpawn);
/*     */         }  }
/*  56 */        if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/*  57 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)ChangedItems.DARK_LATEX_CRYSTAL_FRAGMENT.get()));
/*  58 */           entityToSpawn.m_32010_(10);
/*  59 */           _level.m_7967_((Entity)entityToSpawn);
/*     */         }  }
/*  61 */        if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/*  62 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42500_));
/*  63 */           entityToSpawn.m_32010_(10);
/*  64 */           _level.m_7967_((Entity)entityToSpawn);
/*     */         }  }
/*  66 */        if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/*  67 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42403_));
/*  68 */           entityToSpawn.m_32010_(10);
/*  69 */           _level.m_7967_((Entity)entityToSpawn);
/*     */         }  }
/*  71 */        if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/*  72 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42403_));
/*  73 */           entityToSpawn.m_32010_(10);
/*  74 */           _level.m_7967_((Entity)entityToSpawn);
/*     */         }  }
/*  76 */        if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/*  77 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42403_));
/*  78 */           entityToSpawn.m_32010_(10);
/*  79 */           _level.m_7967_((Entity)entityToSpawn);
/*     */         }  }
/*  81 */        if (Math.random() < 0.35D) {
/*  82 */         if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/*  83 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
/*  84 */             entityToSpawn.m_32010_(10);
/*  85 */             _level.m_7967_((Entity)entityToSpawn);
/*     */           }  }
/*  87 */          if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/*  88 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42500_));
/*  89 */             entityToSpawn.m_32010_(10);
/*  90 */             _level.m_7967_((Entity)entityToSpawn);
/*     */           }  }
/*  92 */          if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/*  93 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42500_));
/*  94 */             entityToSpawn.m_32010_(10);
/*  95 */             _level.m_7967_((Entity)entityToSpawn);
/*     */           }  }
/*  97 */          if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/*  98 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)ChangedItems.DARK_LATEX_CRYSTAL_FRAGMENT.get()));
/*  99 */             entityToSpawn.m_32010_(10);
/* 100 */             _level.m_7967_((Entity)entityToSpawn);
/*     */           }  }
/* 102 */          if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 103 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)ChangedItems.DARK_LATEX_CRYSTAL_FRAGMENT.get()));
/* 104 */             entityToSpawn.m_32010_(10);
/* 105 */             _level.m_7967_((Entity)entityToSpawn);
/*     */           }  }
/*     */       
/* 108 */       }  if (Math.random() < 0.1D) {
/* 109 */         if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 110 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)ChangedItems.DARK_LATEX_CRYSTAL_FRAGMENT.get()));
/* 111 */             entityToSpawn.m_32010_(10);
/* 112 */             _level.m_7967_((Entity)entityToSpawn);
/*     */           }  }
/* 114 */          if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 115 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42403_));
/* 116 */             entityToSpawn.m_32010_(10);
/* 117 */             _level.m_7967_((Entity)entityToSpawn);
/*     */           }  }
/* 119 */          if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 120 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42403_));
/* 121 */             entityToSpawn.m_32010_(10);
/* 122 */             _level.m_7967_((Entity)entityToSpawn);
/*     */           }  }
/* 124 */          if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 125 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42403_));
/* 126 */             entityToSpawn.m_32010_(10);
/* 127 */             _level.m_7967_((Entity)entityToSpawn);
/*     */           }  }
/* 129 */          if (Math.random() < 0.1D) {
/* 130 */           if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 131 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)ChangedItems.DARK_LATEX_CRYSTAL_FRAGMENT.get()));
/* 132 */               entityToSpawn.m_32010_(10);
/* 133 */               _level.m_7967_((Entity)entityToSpawn);
/*     */             }  }
/* 135 */            if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 136 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42403_));
/* 137 */               entityToSpawn.m_32010_(10);
/* 138 */               _level.m_7967_((Entity)entityToSpawn);
/*     */             }  }
/* 140 */            if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 141 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42403_));
/* 142 */               entityToSpawn.m_32010_(10);
/* 143 */               _level.m_7967_((Entity)entityToSpawn);
/*     */             }  }
/* 145 */            if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 146 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42403_));
/* 147 */               entityToSpawn.m_32010_(10);
/* 148 */               _level.m_7967_((Entity)entityToSpawn);
/*     */             }  }
/*     */         
/*     */         } 
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DarkLatexCreeperEnhancedDiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */