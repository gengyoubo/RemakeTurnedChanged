/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.init.LatexModGameRules;
/*    */ import net.ltxprogrammer.turned.init.LatexModMobEffects;
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.effect.MobEffect;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.effect.MobEffects;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class DarklatexdarteffectOnEffectActiveTickProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
/* 15 */     if (entity == null || sourceentity == null)
/*    */       return; 
/* 17 */     entity.m_6469_(DamageSource.f_19320_, 1.0F);
/* 18 */     if (entity instanceof Player) { Player _player = (Player)entity;
/* 19 */       _player.m_36399_(0.1F); }
/* 20 */      entity.m_20301_(entity.m_20146_() - 1);
/* 21 */     if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 22 */       _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 10, 1, false, false)); }
/* 23 */      if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 24 */       _entity.m_7292_(new MobEffectInstance(MobEffects.f_19613_, 10, 1, false, false)); }
/* 25 */      if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 26 */       _entity.m_7292_(new MobEffectInstance(MobEffects.f_19599_, 10, 1, false, false)); }
/* 27 */      LivingEntity _livEnt = (LivingEntity)entity;
/*    */     
/* 29 */     LivingEntity livingEntity1 = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.m_21223_() : -1.0F) <= ((entity instanceof LivingEntity) ? livingEntity1.m_21233_() : -1.0F) / 10.0F && entity instanceof LivingEntity) {
/* 30 */       LivingEntity livingEntity = (LivingEntity)entity; if (livingEntity.m_21023_((MobEffect)LatexModMobEffects.DARKLATEXDARTEFFECT.get()) && !(entity instanceof Player) && world
/* 31 */         .m_6106_().m_5470_().m_46207_(LatexModGameRules.DARKLATEXTRANSFUR) == true)
/* 32 */         DarklatexThisEntityKillsAnotherOneProcedure.execute(world, x, y, z, entity, sourceentity); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DarklatexdarteffectOnEffectActiveTickProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */