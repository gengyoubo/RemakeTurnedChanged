/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.ltxprogrammer.changed.init.ChangedSounds;
/*    */ import net.ltxprogrammer.turned.entity.SlimelingEntity;
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.particles.ParticleOptions;
/*    */ import net.minecraft.core.particles.ParticleTypes;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
/*    */ 
/*    */ public class SlimeessenceLivingEntityIsHitWithItemProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 22 */     if (entity == null)
/*    */       return; 
/* 24 */     if (entity instanceof net.minecraft.world.entity.monster.Slime) {
/* 25 */       if (world instanceof Level) { Level _level = (Level)world;
/* 26 */         if (!_level.m_5776_()) {
/* 27 */           _level.m_5594_(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */         } else {
/*    */           
/* 30 */           _level.m_7785_(x, y, z, ChangedSounds.POISON, SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */         }  }
/*    */ 
/*    */       
/* 34 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 35 */         _level.m_8767_((ParticleOptions)ParticleTypes.f_123753_, x, y, z, 5, 3.0D, 3.0D, 3.0D, 1.0D); }
/* 36 */        if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 37 */         SlimelingEntity slimelingEntity = new SlimelingEntity((EntityType)LatexModEntities.SLIMELING.get(), (Level)_level);
/* 38 */         slimelingEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 39 */         slimelingEntity.m_5618_(0.0F);
/* 40 */         slimelingEntity.m_5616_(0.0F);
/* 41 */         if (slimelingEntity instanceof Mob) { Mob _mobToSpawn = (Mob)slimelingEntity;
/* 42 */           _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(slimelingEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 44 */         world.m_7967_((Entity)slimelingEntity); }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\SlimeessenceLivingEntityIsHitWithItemProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */