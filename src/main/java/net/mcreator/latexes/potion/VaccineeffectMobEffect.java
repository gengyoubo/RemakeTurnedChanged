/*    */ package net.mcreator.latexes.potion;
/*    */ 
/*    */ import net.mcreator.latexes.procedures.VaccineeffectOnEffectActiveTickProcedure;
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
/*    */   public String getDescriptionId() {
/* 17 */     return "effect.latex.vaccineeffect";
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isInstantenous() {
/* 22 */     return true;
/*    */   }
/*    */ 
/*    */   
/*    */   public void applyEffectTick(LivingEntity entity, int amplifier) {
/* 27 */     VaccineeffectOnEffectActiveTickProcedure.execute((Entity)entity);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isDurationEffectTick(int duration, int amplifier) {
/* 32 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\potion\VaccineeffectMobEffect.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */