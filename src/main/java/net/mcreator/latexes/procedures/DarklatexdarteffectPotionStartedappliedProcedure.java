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
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ 
/*    */ public class DarklatexdarteffectPotionStartedappliedProcedure {
/*    */   public static void execute(Entity entity) {
/* 15 */     if (entity == null)
/*    */       return; 
/* 17 */     if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:robots"))) || entity
/* 18 */       .getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:darklatexes"))))
/* 19 */     { if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 20 */         _entity.removeEffect((MobEffect)LatexModMobEffects.DARKLATEXDARTEFFECT.get()); }
/*    */        }
/* 22 */     else { entity.hurt(DamageSource.WITHER, 4.0F);
/* 23 */       if (entity instanceof Player) { Player _player = (Player)entity;
/* 24 */         _player.causeFoodExhaustion(0.25F); }
/*    */        }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarklatexdarteffectPotionStartedappliedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */