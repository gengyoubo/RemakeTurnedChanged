/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.entity.MilitaryEntity;
/*    */ import net.mcreator.latexes.entity.ScientistEntity;
/*    */ import net.mcreator.latexes.init.LatexModEntities;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.entity.npc.Villager;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
/*    */ 
/*    */ public class OperativefacilityOnStructureInstanceGeneratedProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 17 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 18 */       Villager villager = new Villager(EntityType.VILLAGER, (Level)_level);
/* 19 */       villager.moveTo(x, y + 1.0D, z, 0.0F, 0.0F);
/* 20 */       villager.setYBodyRot(0.0F);
/* 21 */       villager.setYHeadRot(0.0F);
/* 22 */       if (villager instanceof Mob) { Mob _mobToSpawn = (Mob)villager;
/* 23 */         _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(villager.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/* 24 */        world.addFreshEntity((Entity)villager); }
/*    */     
/* 26 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 27 */       Villager villager = new Villager(EntityType.VILLAGER, (Level)_level);
/* 28 */       villager.moveTo(x, y + 1.0D, z, 0.0F, 0.0F);
/* 29 */       villager.setYBodyRot(0.0F);
/* 30 */       villager.setYHeadRot(0.0F);
/* 31 */       if (villager instanceof Mob) { Mob _mobToSpawn = (Mob)villager;
/* 32 */         _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(villager.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/* 33 */        world.addFreshEntity((Entity)villager); }
/*    */     
/* 35 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 36 */       ScientistEntity scientistEntity = new ScientistEntity((EntityType)LatexModEntities.SCIENTIST.get(), (Level)_level);
/* 37 */       scientistEntity.moveTo(x, y + 1.0D, z, 0.0F, 0.0F);
/* 38 */       scientistEntity.setYBodyRot(0.0F);
/* 39 */       scientistEntity.setYHeadRot(0.0F);
/* 40 */       if (scientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)scientistEntity;
/* 41 */         _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(scientistEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/* 42 */        world.addFreshEntity((Entity)scientistEntity); }
/*    */     
/* 44 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 45 */       ScientistEntity scientistEntity = new ScientistEntity((EntityType)LatexModEntities.SCIENTIST.get(), (Level)_level);
/* 46 */       scientistEntity.moveTo(x, y + 1.0D, z, 0.0F, 0.0F);
/* 47 */       scientistEntity.setYBodyRot(0.0F);
/* 48 */       scientistEntity.setYHeadRot(0.0F);
/* 49 */       if (scientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)scientistEntity;
/* 50 */         _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(scientistEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/* 51 */        world.addFreshEntity((Entity)scientistEntity); }
/*    */     
/* 53 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 54 */       MilitaryEntity militaryEntity = new MilitaryEntity((EntityType)LatexModEntities.MILITARY.get(), (Level)_level);
/* 55 */       militaryEntity.moveTo(x, y + 1.0D, z, 0.0F, 0.0F);
/* 56 */       militaryEntity.setYBodyRot(0.0F);
/* 57 */       militaryEntity.setYHeadRot(0.0F);
/* 58 */       if (militaryEntity instanceof Mob) { Mob _mobToSpawn = (Mob)militaryEntity;
/* 59 */         _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(militaryEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/* 60 */        world.addFreshEntity((Entity)militaryEntity); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\OperativefacilityOnStructureInstanceGeneratedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */