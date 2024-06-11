/*    */ package net.ltxprogrammer.turned.entity.ai;
/*    */ 
/*    */ import java.util.function.Predicate;
/*    */ import net.ltxprogrammer.changed.process.ProcessTransfur;
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.minecraft.core.Registry;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.tags.TagKey;
/*    */ import net.minecraft.world.entity.EquipmentSlot;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ 
/*    */ public class TargetCheck {
/*    */   public static Predicate<LivingEntity> IS_SLIMELING;
/*    */   
/*    */   static {
/* 17 */     IS_SLIMELING = (entity -> (entity == null) ? false : entity.m_6095_().m_204039_(TagKey.m_203882_(Registry.f_122903_, new ResourceLocation("turned:slimeling"))));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 23 */     IS_LATEX = (entity -> {
/*    */         if (entity instanceof net.ltxprogrammer.changed.entity.LatexEntity)
/*    */           return true; 
/*    */         if (entity instanceof Player) {
/*    */           Player player = (Player)entity;
/*    */           return ProcessTransfur.isPlayerLatex(player);
/*    */         } 
/*    */         return false;
/*    */       });
/* 32 */     IS_HERTX = (entity -> (entity == null) ? false : entity.m_6095_().m_204039_(TagKey.m_203882_(Registry.f_122903_, new ResourceLocation("turned:hertx"))));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 38 */     IS_ROBOT = (entity -> (entity == null) ? false : entity.m_6095_().m_204039_(TagKey.m_203882_(Registry.f_122903_, new ResourceLocation("turned:robots"))));
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 44 */     IS_EVIL = (entity -> (entity == null) ? false : (
/*    */ 
/*    */       
/* 47 */       (entity.m_6095_().m_204039_(TagKey.m_203882_(Registry.f_122903_, new ResourceLocation("turned:evilfaction"))) || entity.m_6844_(EquipmentSlot.HEAD).m_41720_() == LatexModItems.EVIL_BERET_HELMET.get())));
/*    */ 
/*    */ 
/*    */     
/* 51 */     IS_GOOD = (entity -> (entity == null) ? false : (
/*    */ 
/*    */       
/* 54 */       (entity.m_6095_().m_204039_(TagKey.m_203882_(Registry.f_122903_, new ResourceLocation("turned:goodfaction"))) || entity.m_6844_(EquipmentSlot.HEAD).m_41720_() == LatexModItems.GOOD_BERET_HELMET.get())));
/*    */   }
/*    */   
/*    */   public static Predicate<LivingEntity> IS_LATEX;
/*    */   public static Predicate<LivingEntity> IS_HERTX;
/*    */   public static Predicate<LivingEntity> IS_ROBOT;
/*    */   public static Predicate<LivingEntity> IS_EVIL;
/*    */   public static Predicate<LivingEntity> IS_GOOD;
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\ai\TargetCheck.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */