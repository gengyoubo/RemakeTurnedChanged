/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.item.ItemEntity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class EvilMilitaryEntityDiesProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 12 */     if (Math.random() < 0.6D) {
/* 13 */       for (int index0 = 0; index0 < (int)Math.round(Math.random() * 10.0D); index0++) {
/* 14 */         if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 15 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.RIFLE_AMMO.get()));
/* 16 */             entityToSpawn.m_32010_(10);
/* 17 */             _level.m_7967_((Entity)entityToSpawn);
/*    */           }  }
/*    */       
/* 20 */       }  if (Math.random() < 0.1D && 
/* 21 */         world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 22 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.AR_70_ASSAULT_RIFLE.get()));
/* 23 */           entityToSpawn.m_32010_(10);
/* 24 */           _level.m_7967_((Entity)entityToSpawn);
/*    */         }  }
/*    */       
/* 27 */       if (Math.random() < 0.3D)
/* 28 */         for (int index1 = 0; index1 < (int)Math.round(Math.random() * 10.0D); index1++) {
/* 29 */           if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 30 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.RIFLE_AMMO.get()));
/* 31 */               entityToSpawn.m_32010_(10);
/* 32 */               _level.m_7967_((Entity)entityToSpawn);
/*    */             }  }
/*    */         
/*    */         }  
/*    */     } 
/* 37 */     if (Math.random() < 0.3D && 
/* 38 */       world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 39 */         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.KEYCARD.get()));
/* 40 */         entityToSpawn.m_32010_(10);
/* 41 */         _level.m_7967_((Entity)entityToSpawn);
/*    */       }  }
/*    */     
/* 44 */     if (Math.random() < 0.1D && 
/* 45 */       world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 46 */         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.RADIO_DROPPODCALLER.get()));
/* 47 */         entityToSpawn.m_32010_(10);
/* 48 */         _level.m_7967_((Entity)entityToSpawn);
/*    */       }  }
/*    */     
/* 51 */     if (Math.random() < 0.4D) {
/* 52 */       for (int index2 = 0; index2 < 3; index2++) {
/* 53 */         if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 54 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42749_));
/* 55 */             entityToSpawn.m_32010_(10);
/* 56 */             _level.m_7967_((Entity)entityToSpawn);
/*    */           }  }
/*    */       
/* 59 */       }  for (int index3 = 0; index3 < 4; index3++) {
/* 60 */         if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 61 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42403_));
/* 62 */             entityToSpawn.m_32010_(10);
/* 63 */             _level.m_7967_((Entity)entityToSpawn);
/*    */           }  }
/*    */       
/*    */       } 
/* 67 */     }  if (Math.random() < 0.1D && 
/* 68 */       world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 69 */         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.KELVARVEST_CHESTPLATE.get()));
/* 70 */         entityToSpawn.m_32010_(10);
/* 71 */         _level.m_7967_((Entity)entityToSpawn);
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\EvilMilitaryEntityDiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */