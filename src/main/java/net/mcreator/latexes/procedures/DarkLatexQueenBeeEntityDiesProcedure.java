/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.init.LatexModBlocks;
/*    */ import net.mcreator.latexes.init.LatexModGameRules;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.entity.animal.Bee;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class DarkLatexQueenBeeEntityDiesProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 18 */     if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXESLEAVEBLOCK))
/* 19 */       if (Math.random() < 0.8D)
/* 20 */       { world.setBlock(new BlockPos(x, y + 1.0D, z), ((Block)LatexModBlocks.DARKLATEXHIVE.get()).defaultBlockState(), 3);
/* 21 */         world.setBlock(new BlockPos(x, y, z), ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState(), 3);
/* 22 */         if (world.getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXESLEAVEBLOCK) == true && (
/* 23 */           (world.getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == Blocks.BEDROCK) ? true : false) != true) {
/* 24 */           world.setBlock(new BlockPos(x, y, z), ((Block)LatexModBlocks.DARKLATEXCARPET.get()).defaultBlockState(), 3);
/*    */         } }
/*    */       
/* 27 */       else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 28 */         Bee bee = new Bee(EntityType.BEE, (Level)_level);
/* 29 */         bee.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 30 */         if (bee instanceof Mob) { Mob _mobToSpawn = (Mob)bee;
/* 31 */           _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(bee.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 33 */         world.addFreshEntity((Entity)bee); }
/*    */        
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarkLatexQueenBeeEntityDiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */