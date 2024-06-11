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
/*    */ public class EvilMilitaryEntityDiesProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 13 */     if (Math.random() < 0.6D) {
/* 14 */       for (int index0 = 0; index0 < (int)Math.round(Math.random() * 10.0D); index0++) {
/* 15 */         if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 16 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.RIFLE_AMMO.get()));
/* 17 */             entityToSpawn.setPickUpDelay(10);
/* 18 */             _level.addFreshEntity((Entity)entityToSpawn);
/*    */           }  }
/*    */       
/* 21 */       }  if (Math.random() < 0.1D && 
/* 22 */         world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 23 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.AR_70_ASSAULT_RIFLE.get()));
/* 24 */           entityToSpawn.setPickUpDelay(10);
/* 25 */           _level.addFreshEntity((Entity)entityToSpawn);
/*    */         }  }
/*    */       
/* 28 */       if (Math.random() < 0.3D)
/* 29 */         for (int index1 = 0; index1 < (int)Math.round(Math.random() * 10.0D); index1++) {
/* 30 */           if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 31 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.RIFLE_AMMO.get()));
/* 32 */               entityToSpawn.setPickUpDelay(10);
/* 33 */               _level.addFreshEntity((Entity)entityToSpawn);
/*    */             }  }
/*    */         
/*    */         }  
/*    */     } 
/* 38 */     if (Math.random() < 0.3D && 
/* 39 */       world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 40 */         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.KEYCARD.get()));
/* 41 */         entityToSpawn.setPickUpDelay(10);
/* 42 */         _level.addFreshEntity((Entity)entityToSpawn);
/*    */       }  }
/*    */     
/* 45 */     if (Math.random() < 0.1D && 
/* 46 */       world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 47 */         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.RADIO_DROPPODCALLER.get()));
/* 48 */         entityToSpawn.setPickUpDelay(10);
/* 49 */         _level.addFreshEntity((Entity)entityToSpawn);
/*    */       }  }
/*    */     
/* 52 */     if (Math.random() < 0.4D) {
/* 53 */       for (int index2 = 0; index2 < 3; index2++) {
/* 54 */         if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 55 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.IRON_NUGGET));
/* 56 */             entityToSpawn.setPickUpDelay(10);
/* 57 */             _level.addFreshEntity((Entity)entityToSpawn);
/*    */           }  }
/*    */       
/* 60 */       }  for (int index3 = 0; index3 < 4; index3++) {
/* 61 */         if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 62 */             ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.GUNPOWDER));
/* 63 */             entityToSpawn.setPickUpDelay(10);
/* 64 */             _level.addFreshEntity((Entity)entityToSpawn);
/*    */           }  }
/*    */       
/*    */       } 
/* 68 */     }  if (Math.random() < 0.1D && 
/* 69 */       world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 70 */         ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.KELVARVEST_CHESTPLATE.get()));
/* 71 */         entityToSpawn.setPickUpDelay(10);
/* 72 */         _level.addFreshEntity((Entity)entityToSpawn);
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\EvilMilitaryEntityDiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */