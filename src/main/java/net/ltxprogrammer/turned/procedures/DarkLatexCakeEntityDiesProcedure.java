/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.changed.init.ChangedItems;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.item.ItemEntity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class DarkLatexCakeEntityDiesProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 12 */     if (Math.random() < 0.5D) {
/* 13 */       if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 14 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
/* 15 */           entityToSpawn.m_32010_(10);
/* 16 */           _level.m_7967_((Entity)entityToSpawn);
/*    */         }  }
/* 18 */        if (world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 19 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
/* 20 */           entityToSpawn.m_32010_(10);
/* 21 */           _level.m_7967_((Entity)entityToSpawn);
/*    */         }  }
/* 23 */        if (Math.random() < 0.5D && 
/* 24 */         world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 25 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Blocks.f_50685_));
/* 26 */           entityToSpawn.m_32010_(10);
/* 27 */           _level.m_7967_((Entity)entityToSpawn);
/*    */         }  }
/*    */       
/* 30 */       if (Math.random() < 0.2D && 
/* 31 */         world instanceof Level) { Level _level = (Level)world; if (!_level.m_5776_()) {
/* 32 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Blocks.f_50145_));
/* 33 */           entityToSpawn.m_32010_(10);
/* 34 */           _level.m_7967_((Entity)entityToSpawn);
/*    */         }  }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DarkLatexCakeEntityDiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */