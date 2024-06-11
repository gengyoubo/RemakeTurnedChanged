/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModMobEffects;
/*    */ import net.minecraft.world.effect.MobEffect;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ 
/*    */ public class DarkLatexCakeEntityIsHurtProcedure {
/*    */   public static void execute(Entity entity) {
/* 12 */     if (entity == null)
/*    */       return; 
/* 14 */     LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == ItemStack.EMPTY.getItem())
/* 15 */       if (Math.random() < 0.8D)
/* 16 */       { if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 17 */           LivingEntity livingEntity1 = (LivingEntity)entity; _entity.setHealth(((entity instanceof LivingEntity) ? livingEntity1.getHealth() : -1.0F) + 1.0F); }  }
/* 18 */       else if (Math.random() < 0.05D && 
/* 19 */         entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 20 */         _entity.addEffect(new MobEffectInstance((MobEffect)LatexModMobEffects.DARKLATEXDARTEFFECT.get(), 50, 1, false, false)); }
/*    */        
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarkLatexCakeEntityIsHurtProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */