/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.entity.DarkLatexCakeEntity;
/*    */ import net.mcreator.latexes.entity.DarklatexconeEntity;
/*    */ import net.mcreator.latexes.init.LatexModBlocks;
/*    */ import net.mcreator.latexes.init.LatexModEntities;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class DLSyringeRightclickedOnBlockProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 23 */     if (world.getBlockState(new BlockPos(x, y, z)).getBlock() == Blocks.CAKE) {
/* 24 */       world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
/* 25 */       if (world instanceof Level) { Level _level = (Level)world;
/* 26 */         if (!_level.isClientSide()) {
/* 27 */           _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */         } else {
/*    */           
/* 30 */           _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */         }  }
/*    */ 
/*    */       
/* 34 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 35 */         DarkLatexCakeEntity darkLatexCakeEntity = new DarkLatexCakeEntity((EntityType)LatexModEntities.DARK_LATEX_CAKE.get(), (Level)_level);
/* 36 */         darkLatexCakeEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 37 */         if (darkLatexCakeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexCakeEntity;
/* 38 */           _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darkLatexCakeEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 40 */         world.addFreshEntity((Entity)darkLatexCakeEntity); }
/*    */     
/* 42 */     } else if (world.getBlockState(new BlockPos(x, y, z)).getBlock() == LatexModBlocks.CONE.get()) {
/* 43 */       world.setBlock(new BlockPos(x, y, z), Blocks.AIR.defaultBlockState(), 3);
/* 44 */       if (world instanceof Level) { Level _level = (Level)world;
/* 45 */         if (!_level.isClientSide()) {
/* 46 */           _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */         } else {
/*    */           
/* 49 */           _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */         }  }
/*    */ 
/*    */       
/* 53 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 54 */         DarklatexconeEntity darklatexconeEntity = new DarklatexconeEntity((EntityType)LatexModEntities.DARKLATEXCONE.get(), (Level)_level);
/* 55 */         darklatexconeEntity.moveTo(x, y, z, world.getRandom().nextFloat() * 360.0F, 0.0F);
/* 56 */         if (darklatexconeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexconeEntity;
/* 57 */           _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darklatexconeEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 59 */         world.addFreshEntity((Entity)darklatexconeEntity); }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DLSyringeRightclickedOnBlockProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */