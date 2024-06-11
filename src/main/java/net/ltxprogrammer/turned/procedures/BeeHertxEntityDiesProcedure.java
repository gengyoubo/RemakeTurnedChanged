/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.item.ItemEntity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Items;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class BeeHertxEntityDiesProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 12 */     if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 13 */         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42416_));
/* 14 */         entityToSpawn.m_32010_(10);
/* 15 */         _level.m_7967_((Entity)entityToSpawn);
/*    */       }  }
/* 17 */      if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 18 */         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
/* 19 */         entityToSpawn.m_32010_(10);
/* 20 */         _level.m_7967_((Entity)entityToSpawn);
/*    */       }  }
/* 22 */      if (Math.random() < 0.3D && 
/* 23 */       world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 24 */         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42416_));
/* 25 */         entityToSpawn.m_32010_(10);
/* 26 */         _level.m_7967_((Entity)entityToSpawn);
/*    */       }  }
/*    */     
/* 29 */     if (Math.random() < 0.2D && 
/* 30 */       world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 31 */         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
/* 32 */         entityToSpawn.m_32010_(10);
/* 33 */         _level.m_7967_((Entity)entityToSpawn);
/*    */       }  }
/*    */     
/* 36 */     if (Math.random() < 0.4D && 
/* 37 */       world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 38 */         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.f_42784_));
/* 39 */         entityToSpawn.m_32010_(10);
/* 40 */         _level.m_7967_((Entity)entityToSpawn);
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\BeeHertxEntityDiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */