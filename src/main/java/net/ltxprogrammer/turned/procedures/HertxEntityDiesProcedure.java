/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.changed.init.ChangedItems;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.item.ItemEntity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Items;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class HertxEntityDiesProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 13 */     if (Math.random() < 0.05D)
/* 14 */     { if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 15 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.HERTXVISOR.get()));
/* 16 */           entityToSpawn.m_32010_(20);
/* 17 */           _level.m_7967_((Entity)entityToSpawn);
/*    */         }  }
/*    */        }
/* 20 */     else { if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 21 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42416_));
/* 22 */           entityToSpawn.m_32010_(20);
/* 23 */           _level.m_7967_((Entity)entityToSpawn);
/*    */         }  }
/* 25 */        if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 26 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
/* 27 */           entityToSpawn.m_32010_(20);
/* 28 */           _level.m_7967_((Entity)entityToSpawn);
/*    */         }  }
/* 30 */        if (Math.random() < 0.3D) {
/* 31 */         if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 32 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42416_));
/* 33 */             entityToSpawn.m_32010_(20);
/* 34 */             _level.m_7967_((Entity)entityToSpawn);
/*    */           }  }
/* 36 */          if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 37 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
/* 38 */             entityToSpawn.m_32010_(20);
/* 39 */             _level.m_7967_((Entity)entityToSpawn);
/*    */           }  }
/*    */       
/* 42 */       }  if (Math.random() < 0.2D && 
/* 43 */         world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 44 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42451_));
/* 45 */           entityToSpawn.m_32010_(20);
/* 46 */           _level.m_7967_((Entity)entityToSpawn);
/*    */         }  }
/*    */        }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\HertxEntityDiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */