/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.entity.PrisionerEntity;
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
/*    */ public class HandcuffsRightclickedProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 16 */     if (entity == null)
/*    */       return; 
/* 18 */     if (entity instanceof net.mcreator.latexes.entity.EvilScientistEntity || entity instanceof net.mcreator.latexes.entity.CivilianEntity) {
/* 19 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 20 */         PrisionerEntity prisionerEntity = new PrisionerEntity((EntityType)LatexModEntities.PRISIONER.get(), (Level)_level);
/* 21 */         prisionerEntity.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
/* 22 */         prisionerEntity.setYBodyRot(entity.getYRot());
/* 23 */         prisionerEntity.setYHeadRot(entity.getYRot());
/* 24 */         prisionerEntity.setDeltaMovement(0.0D, 0.0D, 0.0D);
/* 25 */         if (prisionerEntity instanceof Mob) { Mob _mobToSpawn = (Mob)prisionerEntity;
/* 26 */           _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(prisionerEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 28 */         world.addFreshEntity((Entity)prisionerEntity); }
/*    */       
/* 30 */       if (!entity.level.isClientSide())
/* 31 */         entity.discard(); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\HandcuffsRightclickedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */