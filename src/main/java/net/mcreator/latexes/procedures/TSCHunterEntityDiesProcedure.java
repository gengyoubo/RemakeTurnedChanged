/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.item.ItemEntity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Items;
/*    */ import net.minecraft.world.level.Explosion;
/*    */ import net.minecraft.world.level.GameRules;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class TSCHunterEntityDiesProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 15 */     if (Math.random() < 0.1D && world.getLevelData().getGameRules().getBoolean(GameRules.RULE_MOBGRIEFING))
/* 16 */     { if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide())
/* 17 */           _level.explode(null, x, y, z, 1.0F, Explosion.BlockInteraction.DESTROY);  }
/*    */        }
/* 19 */     else { if (Math.random() < 0.4D) {
/* 20 */         for (int index0 = 0; index0 < 4; index0++) {
/* 21 */           if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 22 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.IRON_INGOT));
/* 23 */               entityToSpawn.setPickUpDelay(10);
/* 24 */               _level.addFreshEntity((Entity)entityToSpawn);
/*    */             }  }
/* 26 */            if (Math.random() < 0.4D && 
/* 27 */             world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 28 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.IRON_NUGGET));
/* 29 */               entityToSpawn.setPickUpDelay(10);
/* 30 */               _level.addFreshEntity((Entity)entityToSpawn);
/*    */             }  }
/*    */         
/*    */         } 
/* 34 */         if (Math.random() < 0.2D) {
/* 35 */           for (int index1 = 0; index1 < 3; index1++) {
/* 36 */             if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 37 */                 ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.IRON_INGOT));
/* 38 */                 entityToSpawn.setPickUpDelay(10);
/* 39 */                 _level.addFreshEntity((Entity)entityToSpawn);
/*    */               }  }
/* 41 */              if (Math.random() < 0.1D && 
/* 42 */               world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 43 */                 ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.GOLD_NUGGET));
/* 44 */                 entityToSpawn.setPickUpDelay(10);
/* 45 */                 _level.addFreshEntity((Entity)entityToSpawn);
/*    */               }  }
/*    */           
/*    */           } 
/* 49 */           if (Math.random() < 0.1D)
/* 50 */             for (int index2 = 0; index2 < 3; index2++) {
/* 51 */               if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 52 */                   ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.IRON_INGOT));
/* 53 */                   entityToSpawn.setPickUpDelay(10);
/* 54 */                   _level.addFreshEntity((Entity)entityToSpawn);
/*    */                 }  }
/*    */             
/*    */             }  
/*    */         } 
/*    */       } 
/* 60 */       if (Math.random() < 0.4D) {
/* 61 */         for (int index3 = 0; index3 < 5; index3++) {
/* 62 */           if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 63 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.REDSTONE));
/* 64 */               entityToSpawn.setPickUpDelay(10);
/* 65 */               _level.addFreshEntity((Entity)entityToSpawn);
/*    */             }  }
/* 67 */            if (Math.random() < 0.3D && 
/* 68 */             world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 69 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.REDSTONE));
/* 70 */               entityToSpawn.setPickUpDelay(10);
/* 71 */               _level.addFreshEntity((Entity)entityToSpawn);
/*    */             }  }
/*    */         
/*    */         } 
/*    */       }
/* 76 */       if (Math.random() < 0.2D)
/* 77 */         for (int index4 = 0; index4 < 2; index4++) {
/* 78 */           if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 79 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.BATTERY.get()));
/* 80 */               entityToSpawn.setPickUpDelay(10);
/* 81 */               _level.addFreshEntity((Entity)entityToSpawn);
/*    */             }  }
/*    */         
/*    */         }  
/* 85 */       if (Math.random() < 0.1D) {
/* 86 */         if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 87 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.GOLD_INGOT));
/* 88 */             entityToSpawn.setPickUpDelay(10);
/* 89 */             _level.addFreshEntity((Entity)entityToSpawn);
/*    */           }  }
/* 91 */          if (Math.random() < 0.3D && 
/* 92 */           world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 93 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.GOLD_NUGGET));
/* 94 */             entityToSpawn.setPickUpDelay(10);
/* 95 */             _level.addFreshEntity((Entity)entityToSpawn);
/*    */           }  }
/*    */       
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\TSCHunterEntityDiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */