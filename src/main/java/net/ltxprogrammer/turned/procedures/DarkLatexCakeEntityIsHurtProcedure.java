/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.init.LatexModMobEffects;
/*    */ import net.minecraft.world.effect.MobEffect;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ 
/*    */ public class DarkLatexCakeEntityIsHurtProcedure {
/*    */   public static void execute(Entity entity) {
/* 11 */     if (entity == null)
/*    */       return; 
/* 13 */     LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.m_21205_() : ItemStack.f_41583_).m_41720_() == ItemStack.f_41583_.m_41720_())
/* 14 */       if (Math.random() < 0.8D)
/* 15 */       { if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 16 */           LivingEntity livingEntity1 = (LivingEntity)entity; _entity.m_21153_(((entity instanceof LivingEntity) ? livingEntity1.m_21223_() : -1.0F) + 1.0F); }  }
/* 17 */       else if (Math.random() < 0.05D && 
/* 18 */         entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 19 */         _entity.m_7292_(new MobEffectInstance((MobEffect)LatexModMobEffects.DARKLATEXDARTEFFECT.get(), 50, 1, false, false)); }
/*    */        
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DarkLatexCakeEntityIsHurtProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */