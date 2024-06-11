/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModMobEffects;
/*    */ import net.minecraft.world.effect.MobEffect;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class LatexcobwebEntityCollidesInTheBlockProcedure
/*    */ {
/*    */   public static void execute(Entity entity) {
/* 17 */     if (entity == null)
/*    */       return; 
/* 19 */     if (!((entity instanceof net.mcreator.latexes.entity.DarkLatexSpiderEntity || entity instanceof net.mcreator.latexes.entity.DarkLatexSpiderQueenEntity || entity instanceof net.minecraft.world.entity.monster.Spider || entity instanceof net.minecraft.world.entity.monster.CaveSpider) ? 1 : 0)) {
/*    */       
/* 21 */       entity.makeStuckInBlock(Blocks.AIR.defaultBlockState(), new Vec3(0.25D, 0.05D, 0.25D));
/* 22 */       if (Math.random() < 0.01D && 
/* 23 */         entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 24 */         _entity.addEffect(new MobEffectInstance((MobEffect)LatexModMobEffects.DARKLATEXDARTEFFECT.get(), 20, 1, false, false)); }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\LatexcobwebEntityCollidesInTheBlockProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */