/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.item.ItemEntity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Items;
/*    */ import net.minecraft.world.level.Explosion;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class DroneHertxDiesProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 14 */     if (Math.random() < 0.05D)
/* 15 */     { if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide())
/* 16 */           _level.explode(null, x, y, z, 3.0F, Explosion.BlockInteraction.BREAK);  }
/*    */        }
/* 18 */     else { if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 19 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.IRON_INGOT));
/* 20 */           entityToSpawn.setPickUpDelay(20);
/* 21 */           _level.addFreshEntity((Entity)entityToSpawn);
/*    */         }  }
/* 23 */        if (Math.random() < 0.3D) {
/* 24 */         if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 25 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.IRON_INGOT));
/* 26 */             entityToSpawn.setPickUpDelay(20);
/* 27 */             _level.addFreshEntity((Entity)entityToSpawn);
/*    */           }  }
/* 29 */          if (Math.random() < 0.2D) {
/* 30 */           if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 31 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.IRON_NUGGET));
/* 32 */               entityToSpawn.setPickUpDelay(20);
/* 33 */               _level.addFreshEntity((Entity)entityToSpawn);
/*    */             }  }
/* 35 */            if (Math.random() < 0.3D) {
/* 36 */             if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 37 */                 ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.IRON_INGOT));
/* 38 */                 entityToSpawn.setPickUpDelay(20);
/* 39 */                 _level.addFreshEntity((Entity)entityToSpawn);
/*    */               }  }
/* 41 */              if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 42 */                 ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.IRON_NUGGET));
/* 43 */                 entityToSpawn.setPickUpDelay(20);
/* 44 */                 _level.addFreshEntity((Entity)entityToSpawn);
/*    */               }  }
/* 46 */              if (Math.random() < 0.2D && 
/* 47 */               world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 48 */                 ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.IRON_INGOT));
/* 49 */                 entityToSpawn.setPickUpDelay(20);
/* 50 */                 _level.addFreshEntity((Entity)entityToSpawn);
/*    */               }  }
/*    */           
/*    */           } 
/*    */         } 
/*    */       } 
/* 56 */       if (Math.random() < 0.2D) {
/* 57 */         if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 58 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.IRON_INGOT));
/* 59 */             entityToSpawn.setPickUpDelay(20);
/* 60 */             _level.addFreshEntity((Entity)entityToSpawn);
/*    */           }  }
/* 62 */          if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 63 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.REDSTONE));
/* 64 */             entityToSpawn.setPickUpDelay(20);
/* 65 */             _level.addFreshEntity((Entity)entityToSpawn);
/*    */           }  }
/* 67 */          if (Math.random() < 0.2D && 
/* 68 */           world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 69 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.REDSTONE));
/* 70 */             entityToSpawn.setPickUpDelay(20);
/* 71 */             _level.addFreshEntity((Entity)entityToSpawn);
/*    */           }  }
/*    */         
/* 74 */         if (Math.random() < 0.05D) {
/* 75 */           if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 76 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.HERTXVISOR.get()));
/* 77 */               entityToSpawn.setPickUpDelay(20);
/* 78 */               _level.addFreshEntity((Entity)entityToSpawn);
/*    */             }  }
/* 80 */            if (Math.random() < 0.35D) {
/* 81 */             if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 82 */                 ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.HERTXENGINEER_CHESTPLATE.get()));
/* 83 */                 entityToSpawn.setPickUpDelay(20);
/* 84 */                 _level.addFreshEntity((Entity)entityToSpawn);
/*    */               }  }
/* 86 */              if (Math.random() < 0.4D && 
/* 87 */               world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 88 */                 ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.HERTXENGINEER_LEGGINGS.get()));
/* 89 */                 entityToSpawn.setPickUpDelay(20);
/* 90 */                 _level.addFreshEntity((Entity)entityToSpawn);
/*    */               }  }
/*    */           
/*    */           } 
/*    */         } 
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DroneHertxDiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */