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
/*    */ public class HertxEntityDiesProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 13 */     if (Math.random() < 0.05D)
/* 14 */     { if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 15 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.HERTXVISOR.get()));
/* 16 */           entityToSpawn.setPickUpDelay(20);
/* 17 */           _level.addFreshEntity((Entity)entityToSpawn);
/*    */         }  }
/*    */        }
/* 20 */     else { if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 21 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.IRON_INGOT));
/* 22 */           entityToSpawn.setPickUpDelay(20);
/* 23 */           _level.addFreshEntity((Entity)entityToSpawn);
/*    */         }  }
/* 25 */        if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 26 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
/* 27 */           entityToSpawn.setPickUpDelay(20);
/* 28 */           _level.addFreshEntity((Entity)entityToSpawn);
/*    */         }  }
/* 30 */        if (Math.random() < 0.3D) {
/* 31 */         if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 32 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.IRON_INGOT));
/* 33 */             entityToSpawn.setPickUpDelay(20);
/* 34 */             _level.addFreshEntity((Entity)entityToSpawn);
/*    */           }  }
/* 36 */          if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 37 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
/* 38 */             entityToSpawn.setPickUpDelay(20);
/* 39 */             _level.addFreshEntity((Entity)entityToSpawn);
/*    */           }  }
/*    */       
/* 42 */       }  if (Math.random() < 0.2D && 
/* 43 */         world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 44 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.REDSTONE));
/* 45 */           entityToSpawn.setPickUpDelay(20);
/* 46 */           _level.addFreshEntity((Entity)entityToSpawn);
/*    */         }  }
/*    */        }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\HertxEntityDiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */