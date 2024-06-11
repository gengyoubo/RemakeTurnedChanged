/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.entity.DLbeeEntity;
/*    */ import net.mcreator.latexes.entity.DarkLatexQueenBeeEntity;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
/*    */ 
/*    */ public class DarklatexhiveBlockDestroyedByExplosionProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 15 */     if (Math.random() < 0.6D)
/* 16 */     { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 17 */         DLbeeEntity dLbeeEntity = new DLbeeEntity((EntityType)LatexModEntities.D_LBEE.get(), (Level)_level);
/* 18 */         dLbeeEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 19 */         dLbeeEntity.setYBodyRot(0.0F);
/* 20 */         dLbeeEntity.setYHeadRot(0.0F);
/* 21 */         if (dLbeeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dLbeeEntity;
/* 22 */           _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(dLbeeEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 24 */         world.addFreshEntity((Entity)dLbeeEntity); }
/*    */        }
/* 26 */     else if (Math.random() < 0.2D && 
/* 27 */       world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 28 */       DarkLatexQueenBeeEntity darkLatexQueenBeeEntity = new DarkLatexQueenBeeEntity((EntityType)LatexModEntities.DARK_LATEX_QUEEN_BEE.get(), (Level)_level);
/* 29 */       darkLatexQueenBeeEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 30 */       darkLatexQueenBeeEntity.setYBodyRot(0.0F);
/* 31 */       darkLatexQueenBeeEntity.setYHeadRot(0.0F);
/* 32 */       if (darkLatexQueenBeeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexQueenBeeEntity;
/* 33 */         _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexQueenBeeEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */       
/* 35 */       world.addFreshEntity((Entity)darkLatexQueenBeeEntity); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarklatexhiveBlockDestroyedByExplosionProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */