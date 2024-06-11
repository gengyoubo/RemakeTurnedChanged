/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.item.ItemEntity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class DarklatexleavesBlockDestroyedByPlayerProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 12 */     if (Math.random() < 0.2D) {
/* 13 */       if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 14 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.ORANGE.get()));
/* 15 */           entityToSpawn.setPickUpDelay(10);
/* 16 */           _level.addFreshEntity((Entity)entityToSpawn);
/*    */         }  }
/* 18 */        if (Math.random() < 0.1D && 
/* 19 */         world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 20 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.ORANGE.get()));
/* 21 */           entityToSpawn.setPickUpDelay(10);
/* 22 */           _level.addFreshEntity((Entity)entityToSpawn);
/*    */         }  }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarklatexleavesBlockDestroyedByPlayerProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */