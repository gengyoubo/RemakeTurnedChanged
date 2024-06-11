/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModGameRules;
/*    */ import net.mcreator.latexes.init.LatexModMobEffects;
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.effect.MobEffect;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.effect.MobEffects;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class DarklatexdarteffectonActiveTickConditionProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 16 */     if (entity == null)
/*    */       return; 
/* 18 */     entity.hurt(DamageSource.WITHER, 1.0F);
/* 19 */     if (entity instanceof Player) { Player _player = (Player)entity;
/* 20 */       _player.causeFoodExhaustion(0.1F); }
/* 21 */      entity.setAirSupply(entity.getAirSupply() - 1);
/* 22 */     if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 23 */       _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 10, 1, false, false)); }
/* 24 */      if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 25 */       _entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 10, 1, false, false)); }
/* 26 */      if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 27 */       _entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 10, 1, false, false)); }
/* 28 */      LivingEntity _livEnt = (LivingEntity)entity;
/*    */     
/* 30 */     LivingEntity livingEntity1 = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.getHealth() : -1.0F) <= ((entity instanceof LivingEntity) ? livingEntity1.getMaxHealth() : -1.0F) / 10.0F && entity instanceof LivingEntity) {
/* 31 */       LivingEntity livingEntity = (LivingEntity)entity; if (livingEntity.hasEffect((MobEffect)LatexModMobEffects.DARKLATEXDARTEFFECT.get()) && !(entity instanceof Player) && world
/* 32 */         .getLevelData().getGameRules().getBoolean(LatexModGameRules.DARKLATEXTRANSFUR) == true)
/* 33 */         DleffecttransfurProcedure.execute(world, x, y, z, entity); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarklatexdarteffectonActiveTickConditionProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */