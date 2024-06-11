/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModMobEffects;
/*    */ import net.minecraft.core.Registry;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.tags.TagKey;
/*    */ import net.minecraft.world.effect.MobEffect;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.effect.MobEffects;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ 
/*    */ public class DarklatexblockEntityCollidesInTheBlockProcedure {
/*    */   public static void execute(Entity entity) {
/* 15 */     if (entity == null)
/*    */       return; 
/* 17 */     if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:darklatexes"))) != true && 
/* 18 */       TargetwearinghazmatProcedure.execute(entity) != true) {
/* 19 */       if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 20 */         _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 1, false, false)); }
/* 21 */        if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 22 */         _entity.addEffect(new MobEffectInstance(MobEffects.DIG_SLOWDOWN, 60, 1, false, false)); }
/* 23 */        if (Math.random() < 0.005D && 
/* 24 */         entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 25 */         _entity.addEffect(new MobEffectInstance((MobEffect)LatexModMobEffects.DARKLATEXDARTEFFECT.get(), 50, 1, false, false)); }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarklatexblockEntityCollidesInTheBlockProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */