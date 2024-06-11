/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.entity.monster.Slime;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class SlimelingEntityDiesProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 13 */     if (Math.random() < 0.25D && 
/* 14 */       world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 15 */       Slime slime = new Slime(EntityType.SLIME, (Level)_level);
/* 16 */       slime.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 17 */       if (slime instanceof Mob) { Mob _mobToSpawn = (Mob)slime;
/* 18 */         _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(slime.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */       
/* 20 */       world.addFreshEntity((Entity)slime); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\SlimelingEntityDiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */