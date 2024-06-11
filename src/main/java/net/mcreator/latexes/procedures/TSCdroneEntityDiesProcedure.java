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
/*    */ public class TSCdroneEntityDiesProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 13 */     if (Math.random() < 0.3D)
/* 14 */       for (int index0 = 0; index0 < 2; index0++) {
/* 15 */         if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 16 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.IRON_INGOT));
/* 17 */             entityToSpawn.setPickUpDelay(10);
/* 18 */             _level.addFreshEntity((Entity)entityToSpawn);
/*    */           }  }
/*    */       
/*    */       }  
/* 22 */     if (Math.random() < 0.4D)
/* 23 */       for (int index1 = 0; index1 < 5; index1++) {
/* 24 */         if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 25 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.REDSTONE));
/* 26 */             entityToSpawn.setPickUpDelay(10);
/* 27 */             _level.addFreshEntity((Entity)entityToSpawn);
/*    */           }  }
/*    */       
/*    */       }  
/* 31 */     if (Math.random() < 0.2D && 
/* 32 */       world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 33 */         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.BATTERY.get()));
/* 34 */         entityToSpawn.setPickUpDelay(10);
/* 35 */         _level.addFreshEntity((Entity)entityToSpawn);
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\TSCdroneEntityDiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */