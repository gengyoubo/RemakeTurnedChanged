/*    */ package net.ltxprogrammer.turned.potion;
/*    */ 
/*    */ import net.ltxprogrammer.turned.procedures.VaccineeffectOnEffectActiveTickProcedure;
/*    */ import net.minecraft.world.effect.MobEffect;
/*    */ import net.minecraft.world.effect.MobEffectCategory;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ 
/*    */ public class VaccineeffectMobEffect
/*    */   extends MobEffect {
/*    */   public VaccineeffectMobEffect() {
/* 12 */     super(MobEffectCategory.BENEFICIAL, -11211680);
/*    */   }
/*    */ 
/*    */   
/*    */   public String m_19481_() {
/* 17 */     return "effect.turned.vaccineeffect";
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_8093_() {
/* 22 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_6742_(LivingEntity entity, int amplifier) {
/* 27 */     VaccineeffectOnEffectActiveTickProcedure.execute((Entity)entity);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_6584_(int duration, int amplifier) {
/* 32 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\potion\VaccineeffectMobEffect.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */