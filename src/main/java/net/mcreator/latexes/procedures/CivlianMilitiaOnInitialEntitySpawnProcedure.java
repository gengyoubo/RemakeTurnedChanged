/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.entity.CivilianMilitiaMeleeEntity;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
/*    */ 
/*    */ public class CivlianMilitiaOnInitialEntitySpawnProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 14 */     if (entity == null)
/*    */       return; 
/* 16 */     if (Math.random() < 0.5D) {
/* 17 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 18 */         CivilianMilitiaMeleeEntity civilianMilitiaMeleeEntity = new CivilianMilitiaMeleeEntity((EntityType)LatexModEntities.CIVILIAN_MILITIA_MELEE.get(), (Level)_level);
/* 19 */         civilianMilitiaMeleeEntity.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
/* 20 */         civilianMilitiaMeleeEntity.setYBodyRot(entity.getYRot());
/* 21 */         civilianMilitiaMeleeEntity.setYHeadRot(entity.getYRot());
/* 22 */         civilianMilitiaMeleeEntity.setDeltaMovement(0.0D, 0.0D, 0.0D);
/* 23 */         if (civilianMilitiaMeleeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)civilianMilitiaMeleeEntity;
/* 24 */           _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(civilianMilitiaMeleeEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 26 */         world.addFreshEntity((Entity)civilianMilitiaMeleeEntity); }
/*    */       
/* 28 */       if (!entity.level.isClientSide())
/* 29 */         entity.discard(); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\CivlianMilitiaOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */