/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.minecraft.core.Registry;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.tags.TagKey;
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.effect.MobEffects;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ 
/*    */ public class LatexeaterslimeEntityWalksOnTheBlockProcedure {
/*    */   public static void execute(Entity entity) {
/* 14 */     if (entity == null)
/*    */       return; 
/* 16 */     if (entity.m_6095_().m_204039_(TagKey.m_203882_(Registry.f_122903_, new ResourceLocation("turned:darklatexes")))) {
/* 17 */       entity.m_6469_(DamageSource.f_19318_, 4.0F);
/* 18 */       entity.m_6469_(DamageSource.f_19319_, 8.0F);
/* 19 */       if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 20 */         _entity.m_7292_(new MobEffectInstance(MobEffects.f_19597_, 60, 1, false, false)); }
/* 21 */        if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 22 */         _entity.m_7292_(new MobEffectInstance(MobEffects.f_19613_, 60, 1, false, false)); }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\LatexeaterslimeEntityWalksOnTheBlockProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */