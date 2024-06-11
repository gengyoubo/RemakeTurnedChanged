/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.entity.npc.Villager;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class LatexbunkerOnStructureInstanceGeneratedProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 13 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 14 */       Villager villager = new Villager(EntityType.VILLAGER, (Level)_level);
/* 15 */       villager.moveTo(x, y + 3.0D, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 16 */       if (villager instanceof Mob) { Mob _mobToSpawn = (Mob)villager;
/* 17 */         _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(villager.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/* 18 */        world.addFreshEntity((Entity)villager); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\LatexbunkerOnStructureInstanceGeneratedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */