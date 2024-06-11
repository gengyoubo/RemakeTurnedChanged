/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.entity.DarkLatexSnakeEntity;
/*    */ import net.mcreator.latexes.entity.DarkLatexSnepEntity;
/*    */ import net.mcreator.latexes.entity.DarkLatexSpiderEntity;
/*    */ import net.mcreator.latexes.entity.DarklatexEntity;
/*    */ import net.mcreator.latexes.entity.DarklatexslugEntity;
/*    */ import net.mcreator.latexes.entity.YufengEntity;
/*    */ import net.mcreator.latexes.init.LatexModEntities;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
/*    */ 
/*    */ public class BoxTrapOnBlockRightClickedProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 20 */     world.destroyBlock(new BlockPos(x, y, z), false);
/* 21 */     if (Math.random() < 0.4D)
/* 22 */     { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 23 */         DarklatexEntity darklatexEntity = new DarklatexEntity((EntityType)LatexModEntities.DARKLATEX.get(), (Level)_level);
/* 24 */         darklatexEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 25 */         if (darklatexEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexEntity;
/* 26 */           _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darklatexEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 28 */         world.addFreshEntity((Entity)darklatexEntity); }
/*    */        }
/* 30 */     else if (Math.random() < 0.1D)
/* 31 */     { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 32 */         DarkLatexSnepEntity darkLatexSnepEntity = new DarkLatexSnepEntity((EntityType)LatexModEntities.DARK_LATEX_SNEP.get(), (Level)_level);
/* 33 */         darkLatexSnepEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 34 */         if (darkLatexSnepEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSnepEntity;
/* 35 */           _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexSnepEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 37 */         world.addFreshEntity((Entity)darkLatexSnepEntity); }
/*    */        }
/* 39 */     else if (Math.random() < 0.1D)
/* 40 */     { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 41 */         DarkLatexSnakeEntity darkLatexSnakeEntity = new DarkLatexSnakeEntity((EntityType)LatexModEntities.DARK_LATEX_SNAKE.get(), (Level)_level);
/* 42 */         darkLatexSnakeEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 43 */         if (darkLatexSnakeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSnakeEntity;
/* 44 */           _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexSnakeEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 46 */         world.addFreshEntity((Entity)darkLatexSnakeEntity); }
/*    */        }
/* 48 */     else if (Math.random() < 0.1D)
/* 49 */     { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 50 */         DarkLatexSpiderEntity darkLatexSpiderEntity = new DarkLatexSpiderEntity((EntityType)LatexModEntities.DARK_LATEX_SPIDER.get(), (Level)_level);
/* 51 */         darkLatexSpiderEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 52 */         if (darkLatexSpiderEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSpiderEntity;
/* 53 */           _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexSpiderEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 55 */         world.addFreshEntity((Entity)darkLatexSpiderEntity); }
/*    */        }
/* 57 */     else if (Math.random() < 0.1D)
/* 58 */     { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 59 */         YufengEntity yufengEntity = new YufengEntity((EntityType)LatexModEntities.YUFENG.get(), (Level)_level);
/* 60 */         yufengEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 61 */         if (yufengEntity instanceof Mob) { Mob _mobToSpawn = (Mob)yufengEntity;
/* 62 */           _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(yufengEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 64 */         world.addFreshEntity((Entity)yufengEntity); }
/*    */       
/*    */        }
/* 67 */     else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 68 */       DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/* 69 */       darklatexslugEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 70 */       if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/* 71 */         _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darklatexslugEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */       
/* 73 */       world.addFreshEntity((Entity)darklatexslugEntity); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\BoxTrapOnBlockRightClickedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */