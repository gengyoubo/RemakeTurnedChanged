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
/*    */ public class TSCOutsiderEntityDiesProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 15 */     if (Math.random() < 0.1D && world.getLevelData().getGameRules().getBoolean(GameRules.RULE_MOBGRIEFING))
/* 16 */     { if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide())
/* 17 */           _level.explode(null, x, y, z, 1.0F, Explosion.BlockInteraction.DESTROY);  }
/*    */        }
/* 19 */     else { if (Math.random() < 0.3D)
/* 20 */         for (int index0 = 0; index0 < 2; index0++) {
/* 21 */           if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 22 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.IRON_INGOT));
/* 23 */               entityToSpawn.setPickUpDelay(10);
/* 24 */               _level.addFreshEntity((Entity)entityToSpawn);
/*    */             }  }
/*    */         
/*    */         }  
/* 28 */       if (Math.random() < 0.4D)
/* 29 */         for (int index1 = 0; index1 < 5; index1++) {
/* 30 */           if (world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 31 */               ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)Items.REDSTONE));
/* 32 */               entityToSpawn.setPickUpDelay(10);
/* 33 */               _level.addFreshEntity((Entity)entityToSpawn);
/*    */             }  }
/*    */         
/*    */         }  
/* 37 */       if (Math.random() < 0.2D && 
/* 38 */         world instanceof Level) { Level _level = (Level)world; if (!_level.isClientSide()) {
/* 39 */           ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack((ItemLike)LatexModItems.BATTERY.get()));
/* 40 */           entityToSpawn.setPickUpDelay(10);
/* 41 */           _level.addFreshEntity((Entity)entityToSpawn);
/*    */         }  }
/*    */        }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\TSCOutsiderEntityDiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */