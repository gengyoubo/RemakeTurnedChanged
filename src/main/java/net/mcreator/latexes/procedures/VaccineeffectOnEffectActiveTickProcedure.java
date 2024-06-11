/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModMobEffects;
/*    */ import net.minecraft.core.Registry;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.tags.TagKey;
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.effect.MobEffect;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ 
/*    */ public class VaccineeffectOnEffectActiveTickProcedure {
/*    */   public static void execute(Entity entity) {
/* 14 */     if (entity == null)
/*    */       return; 
/* 16 */     if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:darklatexes"))) && 
/* 17 */       entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 18 */       _entity.hurt((new DamageSource("%1$s was cleansed from the dark latex parassite.")).bypassArmor(), 1.0F); }
/*    */     
/* 20 */     if (entity instanceof LivingEntity) { LivingEntity _livEnt = (LivingEntity)entity; if (_livEnt.hasEffect((MobEffect)LatexModMobEffects.DARKLATEXDARTEFFECT.get()) && 
/* 21 */         entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 22 */         _entity.removeEffect((MobEffect)LatexModMobEffects.DARKLATEXDARTEFFECT.get()); }
/*    */        }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\VaccineeffectOnEffectActiveTickProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */