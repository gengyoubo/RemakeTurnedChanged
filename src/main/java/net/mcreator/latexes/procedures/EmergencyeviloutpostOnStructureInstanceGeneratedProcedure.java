/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.entity.EvilMilitaryEntity;
/*    */ import net.mcreator.latexes.entity.EvilScientistEntity;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
/*    */ 
/*    */ public class EmergencyeviloutpostOnStructureInstanceGeneratedProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 15 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 16 */       EvilScientistEntity evilScientistEntity = new EvilScientistEntity((EntityType)LatexModEntities.EVIL_SCIENTIST.get(), (Level)_level);
/* 17 */       evilScientistEntity.moveTo(x, y + 4.0D, z, 0.0F, 0.0F);
/* 18 */       evilScientistEntity.setYBodyRot(0.0F);
/* 19 */       evilScientistEntity.setYHeadRot(0.0F);
/* 20 */       if (evilScientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)evilScientistEntity;
/* 21 */         _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(evilScientistEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/* 22 */        world.addFreshEntity((Entity)evilScientistEntity); }
/*    */     
/* 24 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 25 */       EvilScientistEntity evilScientistEntity = new EvilScientistEntity((EntityType)LatexModEntities.EVIL_SCIENTIST.get(), (Level)_level);
/* 26 */       evilScientistEntity.moveTo(x, y + 4.0D, z, 0.0F, 0.0F);
/* 27 */       evilScientistEntity.setYBodyRot(0.0F);
/* 28 */       evilScientistEntity.setYHeadRot(0.0F);
/* 29 */       if (evilScientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)evilScientistEntity;
/* 30 */         _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(evilScientistEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/* 31 */        world.addFreshEntity((Entity)evilScientistEntity); }
/*    */     
/* 33 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 34 */       EvilMilitaryEntity evilMilitaryEntity = new EvilMilitaryEntity((EntityType)LatexModEntities.EVIL_MILITARY.get(), (Level)_level);
/* 35 */       evilMilitaryEntity.moveTo(x, y + 4.0D, z, 0.0F, 0.0F);
/* 36 */       evilMilitaryEntity.setYBodyRot(0.0F);
/* 37 */       evilMilitaryEntity.setYHeadRot(0.0F);
/* 38 */       if (evilMilitaryEntity instanceof Mob) { Mob _mobToSpawn = (Mob)evilMilitaryEntity;
/* 39 */         _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(evilMilitaryEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/* 40 */        world.addFreshEntity((Entity)evilMilitaryEntity); }
/*    */     
/* 42 */     if (Math.random() < 0.2D && 
/* 43 */       world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 44 */       EvilMilitaryEntity evilMilitaryEntity = new EvilMilitaryEntity((EntityType)LatexModEntities.EVIL_MILITARY.get(), (Level)_level);
/* 45 */       evilMilitaryEntity.moveTo(x, y + 4.0D, z, 0.0F, 0.0F);
/* 46 */       evilMilitaryEntity.setYBodyRot(0.0F);
/* 47 */       evilMilitaryEntity.setYHeadRot(0.0F);
/* 48 */       if (evilMilitaryEntity instanceof Mob) { Mob _mobToSpawn = (Mob)evilMilitaryEntity;
/* 49 */         _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(evilMilitaryEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */       
/* 51 */       world.addFreshEntity((Entity)evilMilitaryEntity); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\EmergencyeviloutpostOnStructureInstanceGeneratedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */