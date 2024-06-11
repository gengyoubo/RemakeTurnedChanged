/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.init.LatexModMobEffects;
/*    */ import net.minecraft.core.Registry;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.tags.TagKey;
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.effect.MobEffect;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ 
/*    */ public class DarklatexdarteffectPotionStartedappliedProcedure {
/*    */   public static void execute(Entity entity) {
/* 14 */     if (entity == null)
/*    */       return; 
/* 16 */     if (entity.m_6095_().m_204039_(TagKey.m_203882_(Registry.f_122903_, new ResourceLocation("turned:robots"))) || entity
/* 17 */       .m_6095_().m_204039_(TagKey.m_203882_(Registry.f_122903_, new ResourceLocation("turned:darklatexes"))))
/* 18 */     { if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 19 */         _entity.m_21195_((MobEffect)LatexModMobEffects.DARKLATEXDARTEFFECT.get()); }
/*    */        }
/* 21 */     else { entity.m_6469_(DamageSource.f_19320_, 4.0F);
/* 22 */       if (entity instanceof Player) { Player _player = (Player)entity;
/* 23 */         _player.m_36399_(0.25F); }
/*    */        }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DarklatexdarteffectPotionStartedappliedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */