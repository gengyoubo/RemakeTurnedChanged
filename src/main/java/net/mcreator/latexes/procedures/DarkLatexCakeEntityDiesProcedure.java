/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.item.ItemEntity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class DarkLatexCakeEntityDiesProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 13 */     if (Math.random() < 0.5D) {
/* 14 */       if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 15 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
/* 16 */           entityToSpawn.setPickUpDelay(10);
/* 17 */           _level.addFreshEntity((Entity)entityToSpawn);
/*    */         }  }
/* 19 */        if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 20 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
/* 21 */           entityToSpawn.setPickUpDelay(10);
/* 22 */           _level.addFreshEntity((Entity)entityToSpawn);
/*    */         }  }
/* 24 */        if (Math.random() < 0.5D && 
/* 25 */         world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 26 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Blocks.SWEET_BERRY_BUSH));
/* 27 */           entityToSpawn.setPickUpDelay(10);
/* 28 */           _level.addFreshEntity((Entity)entityToSpawn);
/*    */         }  }
/*    */       
/* 31 */       if (Math.random() < 0.2D && 
/* 32 */         world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 33 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Blocks.CAKE));
/* 34 */           entityToSpawn.setPickUpDelay(10);
/* 35 */           _level.addFreshEntity((Entity)entityToSpawn);
/*    */         }  }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarkLatexCakeEntityDiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */