/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.entity.DarkLatexSnepEntity;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
/*    */ 
/*    */ public class SneppleBulletHitsBlockProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 14 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 15 */       DarkLatexSnepEntity darkLatexSnepEntity = new DarkLatexSnepEntity((EntityType)LatexModEntities.DARK_LATEX_SNEP.get(), (Level)_level);
/* 16 */       darkLatexSnepEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 17 */       darkLatexSnepEntity.setYBodyRot(0.0F);
/* 18 */       darkLatexSnepEntity.setYHeadRot(0.0F);
/* 19 */       if (darkLatexSnepEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSnepEntity;
/* 20 */         _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexSnepEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/* 21 */        world.addFreshEntity((Entity)darkLatexSnepEntity); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\SneppleBulletHitsBlockProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */