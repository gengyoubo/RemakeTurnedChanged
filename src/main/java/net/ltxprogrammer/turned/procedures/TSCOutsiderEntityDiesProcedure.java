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
/*    */ public class TSCOutsiderEntityDiesProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 14 */     if (Math.random() < 0.1D && world.m_6106_().m_5470_().m_46207_(GameRules.f_46132_))
/* 15 */     { if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_())
/* 16 */           _level.m_46511_(null, x, y, z, 1.0F, Explosion.BlockInteraction.DESTROY);  }
/*    */        }
/* 18 */     else { if (Math.random() < 0.3D)
/* 19 */         for (int index0 = 0; index0 < 2; index0++) {
/* 20 */           if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 21 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42416_));
/* 22 */               entityToSpawn.m_32010_(10);
/* 23 */               _level.m_7967_((Entity)entityToSpawn);
/*    */             }  }
/*    */         
/*    */         }  
/* 27 */       if (Math.random() < 0.4D)
/* 28 */         for (int index1 = 0; index1 < 5; index1++) {
/* 29 */           if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 30 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42451_));
/* 31 */               entityToSpawn.m_32010_(10);
/* 32 */               _level.m_7967_((Entity)entityToSpawn);
/*    */             }  }
/*    */         
/*    */         }  
/* 36 */       if (Math.random() < 0.2D && 
/* 37 */         world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 38 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.BATTERY.get()));
/* 39 */           entityToSpawn.m_32010_(10);
/* 40 */           _level.m_7967_((Entity)entityToSpawn);
/*    */         }  }
/*    */        }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\TSCOutsiderEntityDiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */