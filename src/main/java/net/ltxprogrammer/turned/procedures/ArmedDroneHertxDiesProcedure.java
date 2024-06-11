/*     */ package net.ltxprogrammer.turned.procedures;
/*     */ import net.ltxprogrammer.turned.init.LatexModItems;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.item.ItemEntity;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ 
/*     */ public class ArmedDroneHertxDiesProcedure {
/*     */   public static void execute(LevelAccessor world, double x, double y, double z) {
/*  13 */     if (Math.random() < 0.05D)
/*  14 */     { if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_())
/*  15 */           _level.m_46511_(null, x, y, z, 3.0F, Explosion.BlockInteraction.BREAK);  }
/*     */        }
/*  17 */     else { if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/*  18 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42416_));
/*  19 */           entityToSpawn.m_32010_(20);
/*  20 */           _level.m_7967_((Entity)entityToSpawn);
/*     */         }  }
/*  22 */        if (Math.random() < 0.3D) {
/*  23 */         if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/*  24 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42416_));
/*  25 */             entityToSpawn.m_32010_(20);
/*  26 */             _level.m_7967_((Entity)entityToSpawn);
/*     */           }  }
/*  28 */          if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/*  29 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42749_));
/*  30 */             entityToSpawn.m_32010_(20);
/*  31 */             _level.m_7967_((Entity)entityToSpawn);
/*     */           }  }
/*  33 */          if (Math.random() < 0.2D) {
/*  34 */           if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/*  35 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42749_));
/*  36 */               entityToSpawn.m_32010_(20);
/*  37 */               _level.m_7967_((Entity)entityToSpawn);
/*     */             }  }
/*  39 */            if (Math.random() < 0.3D) {
/*  40 */             if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/*  41 */                 ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42416_));
/*  42 */                 entityToSpawn.m_32010_(20);
/*  43 */                 _level.m_7967_((Entity)entityToSpawn);
/*     */               }  }
/*  45 */              if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/*  46 */                 ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42416_));
/*  47 */                 entityToSpawn.m_32010_(20);
/*  48 */                 _level.m_7967_((Entity)entityToSpawn);
/*     */               }  }
/*  50 */              if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/*  51 */                 ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42749_));
/*  52 */                 entityToSpawn.m_32010_(20);
/*  53 */                 _level.m_7967_((Entity)entityToSpawn);
/*     */               }  }
/*  55 */              if (Math.random() < 0.2D && 
/*  56 */               world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/*  57 */                 ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42416_));
/*  58 */                 entityToSpawn.m_32010_(20);
/*  59 */                 _level.m_7967_((Entity)entityToSpawn);
/*     */               }  }
/*     */           
/*     */           } 
/*     */         } 
/*     */       } 
/*  65 */       if (Math.random() < 0.2D) {
/*  66 */         if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/*  67 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42749_));
/*  68 */             entityToSpawn.m_32010_(20);
/*  69 */             _level.m_7967_((Entity)entityToSpawn);
/*     */           }  }
/*  71 */          if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/*  72 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42416_));
/*  73 */             entityToSpawn.m_32010_(20);
/*  74 */             _level.m_7967_((Entity)entityToSpawn);
/*     */           }  }
/*  76 */          if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/*  77 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42749_));
/*  78 */             entityToSpawn.m_32010_(20);
/*  79 */             _level.m_7967_((Entity)entityToSpawn);
/*     */           }  }
/*  81 */          if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/*  82 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42451_));
/*  83 */             entityToSpawn.m_32010_(20);
/*  84 */             _level.m_7967_((Entity)entityToSpawn);
/*     */           }  }
/*  86 */          if (Math.random() < 0.2D) {
/*  87 */           if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/*  88 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42451_));
/*  89 */               entityToSpawn.m_32010_(20);
/*  90 */               _level.m_7967_((Entity)entityToSpawn);
/*     */             }  }
/*  92 */            if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/*  93 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42451_));
/*  94 */               entityToSpawn.m_32010_(20);
/*  95 */               _level.m_7967_((Entity)entityToSpawn);
/*     */             }  }
/*  97 */            if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/*  98 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42451_));
/*  99 */               entityToSpawn.m_32010_(20);
/* 100 */               _level.m_7967_((Entity)entityToSpawn);
/*     */             }  }
/*     */         
/*     */         } 
/* 104 */       }  if (Math.random() < 0.1D) {
/* 105 */         if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 106 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.M_4_ASSAULT_RIFLE.get()));
/* 107 */             entityToSpawn.m_32010_(20);
/* 108 */             _level.m_7967_((Entity)entityToSpawn);
/*     */           }  }
/* 110 */          if (Math.random() < 0.6D)
/* 111 */           for (int index0 = 0; index0 < (int)(Math.random() * 10.0D); index0++) {
/* 112 */             if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 113 */                 ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.RIFLE_AMMO.get()));
/* 114 */                 entityToSpawn.m_32010_(20);
/* 115 */                 _level.m_7967_((Entity)entityToSpawn);
/*     */               }  }
/*     */           
/*     */           }  
/*     */       } 
/* 120 */       if (Math.random() < 0.05D) {
/* 121 */         if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 122 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.HERTXVISOR.get()));
/* 123 */             entityToSpawn.m_32010_(20);
/* 124 */             _level.m_7967_((Entity)entityToSpawn);
/*     */           }  }
/* 126 */          if (Math.random() < 0.35D) {
/* 127 */           if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 128 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.HERTXENGINEER_CHESTPLATE.get()));
/* 129 */               entityToSpawn.m_32010_(20);
/* 130 */               _level.m_7967_((Entity)entityToSpawn);
/*     */             }  }
/* 132 */            if (Math.random() < 0.4D && 
/* 133 */             world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 134 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.HERTXENGINEER_LEGGINGS.get()));
/* 135 */               entityToSpawn.m_32010_(20);
/* 136 */               _level.m_7967_((Entity)entityToSpawn);
/*     */             }  }
/*     */         
/*     */         } 
/*     */       }  }
/*     */   
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\ArmedDroneHertxDiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */