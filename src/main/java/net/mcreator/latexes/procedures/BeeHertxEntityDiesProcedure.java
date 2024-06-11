/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.init.LatexModItems;
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
/* 13 */     if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 14 */         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.IRON_INGOT));
/* 15 */         entityToSpawn.setPickUpDelay(10);
/* 16 */         _level.addFreshEntity((Entity)entityToSpawn);
/*    */       }  }
/* 18 */      if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 19 */         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
/* 20 */         entityToSpawn.setPickUpDelay(10);
/* 21 */         _level.addFreshEntity((Entity)entityToSpawn);
/*    */       }  }
/* 23 */      if (Math.random() < 0.3D && 
/* 24 */       world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 25 */         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.IRON_INGOT));
/* 26 */         entityToSpawn.setPickUpDelay(10);
/* 27 */         _level.addFreshEntity((Entity)entityToSpawn);
/*    */       }  }
/*    */     
/* 30 */     if (Math.random() < 0.2D && 
/* 31 */       world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 32 */         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
/* 33 */         entityToSpawn.setPickUpDelay(10);
/* 34 */         _level.addFreshEntity((Entity)entityToSpawn);
/*    */       }  }
/*    */     
/* 37 */     if (Math.random() < 0.4D && 
/* 38 */       world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 39 */         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.HONEYCOMB));
/* 40 */         entityToSpawn.setPickUpDelay(10);
/* 41 */         _level.addFreshEntity((Entity)entityToSpawn);
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\BeeHertxEntityDiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */