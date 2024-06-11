/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.entity.DarklatexslugEntity;
/*    */ import net.mcreator.latexes.init.LatexModBlocks;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ 
/*    */ public class InfesteddlcobblestoneBlockDestroyedByPlayerProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 16 */     if (Math.random() < 0.1D) {
/* 17 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 18 */         DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/* 19 */         darklatexslugEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 20 */         darklatexslugEntity.setYBodyRot(0.0F);
/* 21 */         darklatexslugEntity.setYHeadRot(0.0F);
/* 22 */         darklatexslugEntity.setDeltaMovement(0.0D, 0.0D, 0.0D);
/* 23 */         if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/* 24 */           _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darklatexslugEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 26 */         world.addFreshEntity((Entity)darklatexslugEntity); }
/*    */     
/* 28 */     } else if (Math.random() < 0.001D) {
/* 29 */       world.setBlock(new BlockPos(x, y, z), ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState(), 3);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\InfesteddlcobblestoneBlockDestroyedByPlayerProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */