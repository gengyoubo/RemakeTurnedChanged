/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.entity.DroneHertxEntity;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
/*    */ 
/*    */ public class DroneHertxWaitEntityIsHurtProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 14 */     if (entity == null)
/*    */       return; 
/* 16 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 17 */       DroneHertxEntity droneHertxEntity = new DroneHertxEntity((EntityType)LatexModEntities.DRONE_HERTX.get(), (Level)_level);
/* 18 */       droneHertxEntity.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
/* 19 */       droneHertxEntity.setYBodyRot(entity.getYRot());
/* 20 */       droneHertxEntity.setYHeadRot(entity.getYRot());
/* 21 */       if (droneHertxEntity instanceof Mob) { Mob _mobToSpawn = (Mob)droneHertxEntity;
/* 22 */         _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(droneHertxEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/* 23 */        world.addFreshEntity((Entity)droneHertxEntity); }
/*    */     
/* 25 */     if (!entity.level.isClientSide())
/* 26 */       entity.discard(); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DroneHertxWaitEntityIsHurtProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */