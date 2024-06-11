/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.item.ItemEntity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Items;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class TSCdroneEntityDiesProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 12 */     if (Math.random() < 0.3D)
/* 13 */       for (int index0 = 0; index0 < 2; index0++) {
/* 14 */         if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 15 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42416_));
/* 16 */             entityToSpawn.m_32010_(10);
/* 17 */             _level.m_7967_((Entity)entityToSpawn);
/*    */           }  }
/*    */       
/*    */       }  
/* 21 */     if (Math.random() < 0.4D)
/* 22 */       for (int index1 = 0; index1 < 5; index1++) {
/* 23 */         if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 24 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42451_));
/* 25 */             entityToSpawn.m_32010_(10);
/* 26 */             _level.m_7967_((Entity)entityToSpawn);
/*    */           }  }
/*    */       
/*    */       }  
/* 30 */     if (Math.random() < 0.2D && 
/* 31 */       world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 32 */         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.BATTERY.get()));
/* 33 */         entityToSpawn.m_32010_(10);
/* 34 */         _level.m_7967_((Entity)entityToSpawn);
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\TSCdroneEntityDiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */