/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.ltxprogrammer.changed.init.ChangedSounds;
/*    */ import net.ltxprogrammer.turned.entity.DarkLatexCreeperEntity;
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
/*    */ 
/*    */ public class DarkLatexCreeperPlayerCollidesWithThisEntityProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
/* 22 */     if (entity == null || sourceentity == null)
/*    */       return; 
/* 24 */     entity.m_6469_(DamageSource.f_19320_, 3.0F);
/* 25 */     LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.m_21223_() : -1.0F) <= 4.0F && sourceentity.m_6084_()) {
/* 26 */       entity.m_6469_(DamageSource.f_19320_, 8.0F);
/* 27 */       entity.m_6469_(DamageSource.f_19318_, 8.0F);
/* 28 */       if (!entity.f_19853_.m_5776_())
/* 29 */         entity.m_146870_(); 
/* 30 */       if (world instanceof Level) { Level _level = (Level)world;
/* 31 */         if (!_level.m_5776_()) {
/* 32 */           _level.m_5594_(null, new BlockPos(x, y, z), ChangedSounds.POISON, SoundSource.HOSTILE, 2.0F, 1.0F);
/*    */         } else {
/*    */           
/* 35 */           _level.m_7785_(x, y, z, ChangedSounds.POISON, SoundSource.HOSTILE, 2.0F, 1.0F, false);
/*    */         }  }
/*    */ 
/*    */       
/* 39 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 40 */         DarkLatexCreeperEntity darkLatexCreeperEntity = new DarkLatexCreeperEntity((EntityType)LatexModEntities.DARK_LATEX_CREEPER.get(), (Level)_level);
/* 41 */         darkLatexCreeperEntity.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/* 42 */         if (darkLatexCreeperEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexCreeperEntity;
/* 43 */           _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexCreeperEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 45 */         world.m_7967_((Entity)darkLatexCreeperEntity); }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DarkLatexCreeperPlayerCollidesWithThisEntityProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */