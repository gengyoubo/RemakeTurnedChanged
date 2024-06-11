/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.changed.block.AbstractLatexBlock;
/*    */ import net.ltxprogrammer.changed.entity.LatexType;
/*    */ import net.ltxprogrammer.changed.init.ChangedBlocks;
/*    */ import net.ltxprogrammer.turned.entity.DarklatexslugEntity;
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.particles.ParticleOptions;
/*    */ import net.minecraft.core.particles.ParticleTypes;
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
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class DarkLatexSpiderQueenEntityIsHurtProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 26 */     if (entity == null)
/*    */       return; 
/* 28 */     if (Math.random() < 0.0025D) {
/* 29 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 30 */         _level.m_8767_((ParticleOptions)ParticleTypes.f_123753_, x, y, z, 5, 3.0D, 1.0D, 3.0D, 1.0D); }
/* 31 */        if (world instanceof Level) { Level _level = (Level)world;
/* 32 */         if (!_level.m_5776_()) {
/* 33 */           _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */         } else {
/*    */           
/* 36 */           _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */         }  }
/*    */ 
/*    */       
/* 40 */       world.m_7731_(new BlockPos(x, y, z), ((Block)ChangedBlocks.DARK_LATEX_BLOCK.get()).m_49966_(), 3);
/* 41 */       world.m_7731_(new BlockPos(x, y + 1.0D, z), (BlockState)Blocks.f_50033_.m_49966_().m_61124_((Property)AbstractLatexBlock.COVERED, (Comparable)LatexType.DARK_LATEX), 3);
/*    */     } 
/* 43 */     LivingEntity _livEnt = (LivingEntity)entity;
/*    */     
/* 45 */     LivingEntity livingEntity1 = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.m_21223_() : -1.0F) <= ((entity instanceof LivingEntity) ? livingEntity1.m_21233_() : -1.0F) / 2.0F && 
/* 46 */       Math.random() < 0.001D) {
/* 47 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 48 */         _level.m_8767_((ParticleOptions)ParticleTypes.f_123754_, x, y, z, 5, 3.0D, 3.0D, 3.0D, 1.0D); }
/* 49 */        if (world instanceof Level) { Level _level = (Level)world;
/* 50 */         if (!_level.m_5776_()) {
/* 51 */           _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 52 */               .getValue(new ResourceLocation("block.slime_block.place")), SoundSource.NEUTRAL, 1.0F, 2.0F);
/*    */         } else {
/* 54 */           _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.slime_block.place")), SoundSource.NEUTRAL, 1.0F, 2.0F, false);
/*    */         }  }
/*    */ 
/*    */       
/* 58 */       if (world instanceof Level) { Level _level = (Level)world;
/* 59 */         if (!_level.m_5776_()) {
/* 60 */           _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 61 */               .getValue(new ResourceLocation("turned:computer_on")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */         } else {
/* 63 */           _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:computer_on")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */         }  }
/*    */ 
/*    */       
/* 67 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 68 */         DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/* 69 */         darklatexslugEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 70 */         darklatexslugEntity.m_5618_(0.0F);
/* 71 */         darklatexslugEntity.m_5616_(0.0F);
/* 72 */         darklatexslugEntity.m_20334_(1.0D, 0.0D, 0.0D);
/* 73 */         if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/* 74 */           _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darklatexslugEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 76 */         world.m_7967_((Entity)darklatexslugEntity); }
/*    */       
/* 78 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 79 */         DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/* 80 */         darklatexslugEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 81 */         darklatexslugEntity.m_5618_(0.0F);
/* 82 */         darklatexslugEntity.m_5616_(0.0F);
/* 83 */         darklatexslugEntity.m_20334_(-1.0D, 0.0D, 0.0D);
/* 84 */         if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/* 85 */           _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darklatexslugEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 87 */         world.m_7967_((Entity)darklatexslugEntity); }
/*    */       
/* 89 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 90 */         DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/* 91 */         darklatexslugEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 92 */         darklatexslugEntity.m_5618_(0.0F);
/* 93 */         darklatexslugEntity.m_5616_(0.0F);
/* 94 */         darklatexslugEntity.m_20334_(0.0D, 0.0D, -1.0D);
/* 95 */         if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/* 96 */           _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darklatexslugEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 98 */         world.m_7967_((Entity)darklatexslugEntity); }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DarkLatexSpiderQueenEntityIsHurtProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */