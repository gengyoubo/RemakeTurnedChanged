/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.entity.DarklatexslugEntity;
/*    */ import net.mcreator.latexes.init.LatexModEntities;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.particles.ParticleOptions;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class DarkLatexSpiderQueenEntityIsHurtProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 23 */     if (entity == null)
/*    */       return; 
/* 25 */     if (Math.random() < 0.0025D) {
/* 26 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 27 */         _level.sendParticles((ParticleOptions)ParticleTypes.ITEM_SLIME, x, y, z, 5, 3.0D, 1.0D, 3.0D, 1.0D); }
/* 28 */        if (world instanceof Level) { Level _level = (Level)world;
/* 29 */         if (!_level.isClientSide()) {
/* 30 */           _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */         } else {
/*    */           
/* 33 */           _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */         }  }
/*    */ 
/*    */       
/* 37 */       world.setBlock(new BlockPos(x, y, z), ((Block)LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState(), 3);
/* 38 */       world.setBlock(new BlockPos(x, y + 1.0D, z), ((Block)LatexModBlocks.LATEXCOBWEBFIX.get()).defaultBlockState(), 3);
/*    */     } 
/* 40 */     LivingEntity _livEnt = (LivingEntity)entity;
/*    */     
/* 42 */     LivingEntity livingEntity1 = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.getHealth() : -1.0F) <= ((entity instanceof LivingEntity) ? livingEntity1.getMaxHealth() : -1.0F) / 2.0F && 
/* 43 */       Math.random() < 0.001D) {
/* 44 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 45 */         _level.sendParticles((ParticleOptions)ParticleTypes.ITEM_SNOWBALL, x, y, z, 5, 3.0D, 3.0D, 3.0D, 1.0D); }
/* 46 */        if (world instanceof Level) { Level _level = (Level)world;
/* 47 */         if (!_level.isClientSide()) {
/* 48 */           _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 49 */               .getValue(new ResourceLocation("block.slime_block.place")), SoundSource.NEUTRAL, 1.0F, 2.0F);
/*    */         } else {
/* 51 */           _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.slime_block.place")), SoundSource.NEUTRAL, 1.0F, 2.0F, false);
/*    */         }  }
/*    */ 
/*    */       
/* 55 */       if (world instanceof Level) { Level _level = (Level)world;
/* 56 */         if (!_level.isClientSide()) {
/* 57 */           _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 58 */               .getValue(new ResourceLocation("latex:computer_on")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */         } else {
/* 60 */           _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:computer_on")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */         }  }
/*    */ 
/*    */       
/* 64 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 65 */         DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/* 66 */         darklatexslugEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 67 */         darklatexslugEntity.setYBodyRot(0.0F);
/* 68 */         darklatexslugEntity.setYHeadRot(0.0F);
/* 69 */         darklatexslugEntity.setDeltaMovement(1.0D, 0.0D, 0.0D);
/* 70 */         if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/* 71 */           _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darklatexslugEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 73 */         world.addFreshEntity((Entity)darklatexslugEntity); }
/*    */       
/* 75 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 76 */         DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/* 77 */         darklatexslugEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 78 */         darklatexslugEntity.setYBodyRot(0.0F);
/* 79 */         darklatexslugEntity.setYHeadRot(0.0F);
/* 80 */         darklatexslugEntity.setDeltaMovement(-1.0D, 0.0D, 0.0D);
/* 81 */         if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/* 82 */           _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darklatexslugEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 84 */         world.addFreshEntity((Entity)darklatexslugEntity); }
/*    */       
/* 86 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 87 */         DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/* 88 */         darklatexslugEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 89 */         darklatexslugEntity.setYBodyRot(0.0F);
/* 90 */         darklatexslugEntity.setYHeadRot(0.0F);
/* 91 */         darklatexslugEntity.setDeltaMovement(0.0D, 0.0D, -1.0D);
/* 92 */         if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/* 93 */           _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(darklatexslugEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 95 */         world.addFreshEntity((Entity)darklatexslugEntity); }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarkLatexSpiderQueenEntityIsHurtProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */