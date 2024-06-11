/*    */ package net.mcreator.latexes.procedures;
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
/* 16 */     if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:darklatexes")))) {
/* 17 */       entity.hurt(DamageSource.GENERIC, 4.0F);
/* 18 */       entity.hurt(DamageSource.MAGIC, 8.0F);
/* 19 */       if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 20 */         _entity.addEffect(new MobEffectInstance(MobEffects.MOVEMENT_SLOWDOWN, 60, 1, false, false)); }
/* 21 */        if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 22 */         _entity.addEffect(new MobEffectInstance(MobEffects.WEAKNESS, 60, 1, false, false)); }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\LatexeaterslimeEntityWalksOnTheBlockProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */