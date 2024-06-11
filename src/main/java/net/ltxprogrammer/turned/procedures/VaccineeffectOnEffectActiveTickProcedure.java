/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.init.LatexModMobEffects;
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
/* 13 */     if (entity == null)
/*    */       return; 
/* 15 */     if (entity.m_6095_().m_204039_(TagKey.m_203882_(Registry.f_122903_, new ResourceLocation("turned:darklatexes"))) && 
/* 16 */       entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 17 */       _entity.m_6469_((new DamageSource("%1$s was cleansed from the dark latex parassite.")).m_19380_(), 1.0F); }
/*    */     
/* 19 */     if (entity instanceof LivingEntity) { LivingEntity _livEnt = (LivingEntity)entity; if (_livEnt.m_21023_((MobEffect)LatexModMobEffects.DARKLATEXDARTEFFECT.get()) && 
/* 20 */         entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 21 */         _entity.m_21195_((MobEffect)LatexModMobEffects.DARKLATEXDARTEFFECT.get()); }
/*    */        }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\VaccineeffectOnEffectActiveTickProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */