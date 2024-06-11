/*    */ package net.mcreator.latexes.potion;
/*    */ 
/*    */ import net.mcreator.latexes.procedures.DarklatexdarteffectPotionExpiresProcedure;
/*    */ import net.mcreator.latexes.procedures.DarklatexdarteffectPotionStartedappliedProcedure;
/*    */ import net.mcreator.latexes.procedures.DarklatexdarteffectonActiveTickConditionProcedure;
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
/*    */   public String getDescriptionId() {
/* 20 */     return "effect.latex.darklatexdarteffect";
/*    */   }
/*    */ 
/*    */   
/*    */   public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
/* 25 */     DarklatexdarteffectPotionStartedappliedProcedure.execute((Entity)entity);
/*    */   }
/*    */ 
/*    */   
/*    */   public void applyEffectTick(LivingEntity entity, int amplifier) {
/* 30 */     DarklatexdarteffectonActiveTickConditionProcedure.execute((LevelAccessor)entity.level, entity.getX(), entity.getY(), entity.getZ(), (Entity)entity);
/*    */   }
/*    */ 
/*    */   
/*    */   public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
/* 35 */     super.removeAttributeModifiers(entity, attributeMap, amplifier);
/* 36 */     DarklatexdarteffectPotionExpiresProcedure.execute((Entity)entity);
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isDurationEffectTick(int duration, int amplifier) {
/* 41 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\potion\DarklatexdarteffectMobEffect.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */