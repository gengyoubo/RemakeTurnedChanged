/*    */ package net.ltxprogrammer.turned.potion;
/*    */ 
/*    */ import net.ltxprogrammer.turned.procedures.DarklatexdarteffectPotionExpiresProcedure;
/*    */ import net.ltxprogrammer.turned.procedures.DarklatexdarteffectPotionStartedappliedProcedure;
/*    */ import net.ltxprogrammer.turned.procedures.DarklatexdarteffectonActiveTickConditionProcedure;
/*    */ import net.minecraft.world.effect.MobEffect;
/*    */ import net.minecraft.world.effect.MobEffectCategory;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.ai.attributes.AttributeMap;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class DarklatexdarteffectMobEffect extends MobEffect {
/*    */   public DarklatexdarteffectMobEffect() {
/* 15 */     super(MobEffectCategory.HARMFUL, -14803426);
/*    */   }
/*    */ 
/*    */   
/*    */   public String m_19481_() {
/* 20 */     return "effect.turned.darklatexdarteffect";
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_6385_(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
/* 25 */     DarklatexdarteffectPotionStartedappliedProcedure.execute((Entity)entity);
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_6742_(LivingEntity entity, int amplifier) {
/* 30 */     DarklatexdarteffectonActiveTickConditionProcedure.execute((LevelAccessor)entity.f_19853_, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (Entity)entity);
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_6386_(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
/* 35 */     super.m_6386_(entity, attributeMap, amplifier);
/* 36 */     DarklatexdarteffectPotionExpiresProcedure.execute((Entity)entity);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_6584_(int duration, int amplifier) {
/* 41 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\potion\DarklatexdarteffectMobEffect.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */