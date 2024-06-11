/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.item.ItemEntity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Items;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class DroneHertxDiesProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 13 */     if (Math.random() < 0.05D)
/* 14 */     { if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_())
/* 15 */           _level.m_46511_(null, x, y, z, 3.0F, Explosion.BlockInteraction.BREAK);  }
/*    */        }
/* 17 */     else { if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 18 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42416_));
/* 19 */           entityToSpawn.m_32010_(20);
/* 20 */           _level.m_7967_((Entity)entityToSpawn);
/*    */         }  }
/* 22 */        if (Math.random() < 0.3D) {
/* 23 */         if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 24 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42416_));
/* 25 */             entityToSpawn.m_32010_(20);
/* 26 */             _level.m_7967_((Entity)entityToSpawn);
/*    */           }  }
/* 28 */          if (Math.random() < 0.2D) {
/* 29 */           if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 30 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42749_));
/* 31 */               entityToSpawn.m_32010_(20);
/* 32 */               _level.m_7967_((Entity)entityToSpawn);
/*    */             }  }
/* 34 */            if (Math.random() < 0.3D) {
/* 35 */             if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 36 */                 ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42416_));
/* 37 */                 entityToSpawn.m_32010_(20);
/* 38 */                 _level.m_7967_((Entity)entityToSpawn);
/*    */               }  }
/* 40 */              if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 41 */                 ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42749_));
/* 42 */                 entityToSpawn.m_32010_(20);
/* 43 */                 _level.m_7967_((Entity)entityToSpawn);
/*    */               }  }
/* 45 */              if (Math.random() < 0.2D && 
/* 46 */               world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 47 */                 ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42416_));
/* 48 */                 entityToSpawn.m_32010_(20);
/* 49 */                 _level.m_7967_((Entity)entityToSpawn);
/*    */               }  }
/*    */           
/*    */           } 
/*    */         } 
/*    */       } 
/* 55 */       if (Math.random() < 0.2D) {
/* 56 */         if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 57 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42416_));
/* 58 */             entityToSpawn.m_32010_(20);
/* 59 */             _level.m_7967_((Entity)entityToSpawn);
/*    */           }  }
/* 61 */          if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 62 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42451_));
/* 63 */             entityToSpawn.m_32010_(20);
/* 64 */             _level.m_7967_((Entity)entityToSpawn);
/*    */           }  }
/* 66 */          if (Math.random() < 0.2D && 
/* 67 */           world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 68 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42451_));
/* 69 */             entityToSpawn.m_32010_(20);
/* 70 */             _level.m_7967_((Entity)entityToSpawn);
/*    */           }  }
/*    */         
/* 73 */         if (Math.random() < 0.05D) {
/* 74 */           if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 75 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.HERTXVISOR.get()));
/* 76 */               entityToSpawn.m_32010_(20);
/* 77 */               _level.m_7967_((Entity)entityToSpawn);
/*    */             }  }
/* 79 */            if (Math.random() < 0.35D) {
/* 80 */             if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 81 */                 ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.HERTXENGINEER_CHESTPLATE.get()));
/* 82 */                 entityToSpawn.m_32010_(20);
/* 83 */                 _level.m_7967_((Entity)entityToSpawn);
/*    */               }  }
/* 85 */              if (Math.random() < 0.4D && 
/* 86 */               world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 87 */                 ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.HERTXENGINEER_LEGGINGS.get()));
/* 88 */                 entityToSpawn.m_32010_(20);
/* 89 */                 _level.m_7967_((Entity)entityToSpawn);
/*    */               }  }
/*    */           
/*    */           } 
/*    */         } 
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DroneHertxDiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */