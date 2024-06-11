/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.item.ItemEntity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Items;
/*    */ import net.minecraft.world.level.GameRules;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class TSCHunterEntityDiesProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 14 */     if (Math.random() < 0.1D && world.m_6106_().m_5470_().m_46207_(GameRules.f_46132_))
/* 15 */     { if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_())
/* 16 */           _level.m_46511_(null, x, y, z, 1.0F, Explosion.BlockInteraction.DESTROY);  }
/*    */        }
/* 18 */     else { if (Math.random() < 0.4D) {
/* 19 */         for (int index0 = 0; index0 < 4; index0++) {
/* 20 */           if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 21 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42416_));
/* 22 */               entityToSpawn.m_32010_(10);
/* 23 */               _level.m_7967_((Entity)entityToSpawn);
/*    */             }  }
/* 25 */            if (Math.random() < 0.4D && 
/* 26 */             world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 27 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42749_));
/* 28 */               entityToSpawn.m_32010_(10);
/* 29 */               _level.m_7967_((Entity)entityToSpawn);
/*    */             }  }
/*    */         
/*    */         } 
/* 33 */         if (Math.random() < 0.2D) {
/* 34 */           for (int index1 = 0; index1 < 3; index1++) {
/* 35 */             if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 36 */                 ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42416_));
/* 37 */                 entityToSpawn.m_32010_(10);
/* 38 */                 _level.m_7967_((Entity)entityToSpawn);
/*    */               }  }
/* 40 */              if (Math.random() < 0.1D && 
/* 41 */               world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 42 */                 ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42587_));
/* 43 */                 entityToSpawn.m_32010_(10);
/* 44 */                 _level.m_7967_((Entity)entityToSpawn);
/*    */               }  }
/*    */           
/*    */           } 
/* 48 */           if (Math.random() < 0.1D)
/* 49 */             for (int index2 = 0; index2 < 3; index2++) {
/* 50 */               if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 51 */                   ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42416_));
/* 52 */                   entityToSpawn.m_32010_(10);
/* 53 */                   _level.m_7967_((Entity)entityToSpawn);
/*    */                 }  }
/*    */             
/*    */             }  
/*    */         } 
/*    */       } 
/* 59 */       if (Math.random() < 0.4D) {
/* 60 */         for (int index3 = 0; index3 < 5; index3++) {
/* 61 */           if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 62 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42451_));
/* 63 */               entityToSpawn.m_32010_(10);
/* 64 */               _level.m_7967_((Entity)entityToSpawn);
/*    */             }  }
/* 66 */            if (Math.random() < 0.3D && 
/* 67 */             world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 68 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42451_));
/* 69 */               entityToSpawn.m_32010_(10);
/* 70 */               _level.m_7967_((Entity)entityToSpawn);
/*    */             }  }
/*    */         
/*    */         } 
/*    */       }
/* 75 */       if (Math.random() < 0.2D)
/* 76 */         for (int index4 = 0; index4 < 2; index4++) {
/* 77 */           if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 78 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.BATTERY.get()));
/* 79 */               entityToSpawn.m_32010_(10);
/* 80 */               _level.m_7967_((Entity)entityToSpawn);
/*    */             }  }
/*    */         
/*    */         }  
/* 84 */       if (Math.random() < 0.1D) {
/* 85 */         if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 86 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42417_));
/* 87 */             entityToSpawn.m_32010_(10);
/* 88 */             _level.m_7967_((Entity)entityToSpawn);
/*    */           }  }
/* 90 */          if (Math.random() < 0.3D && 
/* 91 */           world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 92 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42587_));
/* 93 */             entityToSpawn.m_32010_(10);
/* 94 */             _level.m_7967_((Entity)entityToSpawn);
/*    */           }  }
/*    */       
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\TSCHunterEntityDiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */