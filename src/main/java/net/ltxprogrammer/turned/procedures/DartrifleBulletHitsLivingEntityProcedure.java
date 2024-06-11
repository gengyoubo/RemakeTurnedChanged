/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.init.LatexModMobEffects;
/*    */ import net.minecraft.core.Registry;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.tags.TagKey;
/*    */ import net.minecraft.world.effect.MobEffect;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ 
/*    */ public class DartrifleBulletHitsLivingEntityProcedure {
/*    */   public static void execute(Entity entity) {
/* 13 */     if (entity == null)
/*    */       return; 
/* 15 */     if (((entity.m_6095_().m_204039_(TagKey.m_203882_(Registry.f_122903_, new ResourceLocation("turned:robots"))) || entity
/* 16 */       .m_6095_().m_204039_(TagKey.m_203882_(Registry.f_122903_, new ResourceLocation("turned:darklatexes")))) ? true : false) != true && 
/* 17 */       entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 18 */       _entity.m_7292_(new MobEffectInstance((MobEffect)LatexModMobEffects.DARKLATEXDARTEFFECT.get(), 82, 1, false, false)); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DartrifleBulletHitsLivingEntityProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */