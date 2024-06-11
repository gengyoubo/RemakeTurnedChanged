/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.ltxprogrammer.changed.process.ProcessTransfur;
/*    */ import net.ltxprogrammer.turned.init.LatexModVariants;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.effect.MobEffects;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class DarklatexdarteffectonActiveTickConditionProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 14 */     if (entity == null || !(entity instanceof LivingEntity))
/*    */       return; 
/* 16 */     LivingEntity livingEntity = (LivingEntity)entity;
/* 17 */     ProcessTransfur.progressTransfur(livingEntity, 1, LatexModVariants.DARK_LATEX.getFormId());
/* 18 */     if (entity instanceof Player) { Player _player = (Player)entity;
/* 19 */       _player.m_36399_(0.1F); }
/* 20 */      entity.m_20301_(entity.m_20146_() - 1);
/* 21 */     livingEntity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 10, 1, false, false));
/* 22 */     livingEntity.m_7292_(new MobEffectInstance(MobEffects.f_19613_, 10, 1, false, false));
/* 23 */     livingEntity.m_7292_(new MobEffectInstance(MobEffects.f_19599_, 10, 1, false, false));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DarklatexdarteffectonActiveTickConditionProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */