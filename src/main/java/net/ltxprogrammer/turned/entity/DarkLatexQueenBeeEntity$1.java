/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import java.util.EnumSet;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class null
/*     */   extends Goal
/*     */ {
/*     */   null() {
/*  97 */     m_7021_(EnumSet.of(Goal.Flag.MOVE));
/*     */   }
/*     */   
/*     */   public boolean m_8036_() {
/* 101 */     return (DarkLatexQueenBeeEntity.this.m_5448_() != null && !DarkLatexQueenBeeEntity.this.m_21566_().m_24995_());
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_8045_() {
/* 106 */     return (DarkLatexQueenBeeEntity.this.m_21566_().m_24995_() && DarkLatexQueenBeeEntity.this.m_5448_() != null && DarkLatexQueenBeeEntity.this
/* 107 */       .m_5448_().m_6084_());
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_8056_() {
/* 112 */     LivingEntity livingentity = DarkLatexQueenBeeEntity.this.m_5448_();
/* 113 */     Vec3 vec3d = livingentity.m_20299_(1.0F);
/* 114 */     DarkLatexQueenBeeEntity.access$000(DarkLatexQueenBeeEntity.this).m_6849_(vec3d.f_82479_, vec3d.f_82480_, vec3d.f_82481_, 1.5D);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_8037_() {
/* 119 */     LivingEntity livingentity = DarkLatexQueenBeeEntity.this.m_5448_();
/* 120 */     if (DarkLatexQueenBeeEntity.this.m_142469_().m_82381_(livingentity.m_142469_())) {
/* 121 */       DarkLatexQueenBeeEntity.this.m_7327_((Entity)livingentity);
/*     */     } else {
/* 123 */       double d0 = DarkLatexQueenBeeEntity.this.m_20280_((Entity)livingentity);
/* 124 */       if (d0 < 12.0D) {
/* 125 */         Vec3 vec3d = livingentity.m_20299_(1.0F);
/* 126 */         DarkLatexQueenBeeEntity.access$100(DarkLatexQueenBeeEntity.this).m_6849_(vec3d.f_82479_, vec3d.f_82480_, vec3d.f_82481_, 1.5D);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\DarkLatexQueenBeeEntity$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */