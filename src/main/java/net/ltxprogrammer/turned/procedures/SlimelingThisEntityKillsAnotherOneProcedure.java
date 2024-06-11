/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.ltxprogrammer.changed.init.ChangedSounds;
/*    */ import net.ltxprogrammer.turned.entity.SlimelingEntity;
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*    */ import net.ltxprogrammer.turned.init.LatexModGameRules;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.particles.ParticleOptions;
/*    */ import net.minecraft.core.particles.ParticleTypes;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class SlimelingThisEntityKillsAnotherOneProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
/* 35 */     if (entity == null || sourceentity == null)
/*    */       return; 
/* 37 */     if (Math.random() < 0.7D) {
/* 38 */       if (!entity.f_19853_.m_5776_())
/* 39 */         entity.m_146870_(); 
/* 40 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 41 */         _level.m_8767_((ParticleOptions)ParticleTypes.f_123750_, x, y, z, 3, 3.0D, 3.0D, 3.0D, 1.0D); }
/* 42 */        if (world instanceof Level) { Level _level = (Level)world;
/* 43 */         if (!_level.m_5776_()) {
/* 44 */           _level.m_5594_(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 2.0F);
/*    */         } else {
/*    */           
/* 47 */           _level.m_7785_(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 2.0F, false);
/*    */         }  }
/*    */ 
/*    */       
/* 51 */       if (sourceentity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)sourceentity;
/* 52 */         LivingEntity _livEnt = (LivingEntity)sourceentity;
/* 53 */         LivingEntity livingEntity1 = (LivingEntity)sourceentity; _entity.m_21153_(((sourceentity instanceof LivingEntity) ? _livEnt.m_21223_() : -1.0F) + ((sourceentity instanceof LivingEntity) ? livingEntity1.m_21233_() : -1.0F) / 4.0F); } 
/* 54 */     } else if (world.m_6106_().m_5470_().m_46207_(LatexModGameRules.DARKLATEXTRANSFUR) && Math.random() < 0.6D && (
/* 55 */       entity instanceof net.minecraft.world.entity.monster.Pillager || entity instanceof net.minecraft.world.entity.player.Player || entity instanceof net.ltxprogrammer.turned.entity.DarklatexEntity || entity instanceof net.minecraft.world.entity.monster.ZombifiedPiglin || entity instanceof net.minecraft.world.entity.monster.piglin.PiglinBrute || entity instanceof net.minecraft.world.entity.monster.ZombieVillager || entity instanceof net.minecraft.world.entity.monster.Vindicator || entity instanceof net.minecraft.world.entity.npc.Villager || entity instanceof net.minecraft.world.entity.npc.WanderingTrader || entity instanceof net.minecraft.world.entity.monster.Husk || entity instanceof net.minecraft.world.entity.monster.Evoker || entity instanceof net.minecraft.world.entity.monster.Illusioner || entity instanceof net.minecraft.world.entity.monster.Drowned)) {
/*    */ 
/*    */ 
/*    */       
/* 59 */       if (world instanceof Level) { Level _level = (Level)world;
/* 60 */         if (!_level.m_5776_()) {
/* 61 */           _level.m_5594_(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */         } else {
/*    */           
/* 64 */           _level.m_7785_(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */         }  }
/*    */ 
/*    */       
/* 68 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 69 */         _level.m_8767_((ParticleOptions)ParticleTypes.f_123753_, x, y, z, 5, 3.0D, 3.0D, 3.0D, 1.0D); }
/* 70 */        if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 71 */         SlimelingEntity slimelingEntity = new SlimelingEntity((EntityType)LatexModEntities.SLIMELING.get(), (Level)_level);
/* 72 */         slimelingEntity.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/* 73 */         if (slimelingEntity instanceof Mob) { Mob _mobToSpawn = (Mob)slimelingEntity;
/* 74 */           _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(slimelingEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 76 */         world.m_7967_((Entity)slimelingEntity); }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\SlimelingThisEntityKillsAnotherOneProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */