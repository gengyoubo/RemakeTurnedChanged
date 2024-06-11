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
/*     */ class null
/*     */   extends Goal
/*     */ {
/*     */   null() {
/*  66 */     m_7021_(EnumSet.of(Goal.Flag.MOVE));
/*     */   }
/*     */   
/*     */   public boolean m_8036_() {
/*  70 */     if (DLbeeEntity.this.m_5448_() != null && !DLbeeEntity.this.m_21566_().m_24995_()) {
/*  71 */       double x = DLbeeEntity.this.m_20185_();
/*  72 */       double y = DLbeeEntity.this.m_20186_();
/*  73 */       double z = DLbeeEntity.this.m_20189_();
/*  74 */       DLbeeEntity dLbeeEntity = DLbeeEntity.this;
/*  75 */       return true;
/*     */     } 
/*  77 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean m_8045_() {
/*  83 */     return (DLbeeEntity.this.m_21566_().m_24995_() && DLbeeEntity.this.m_5448_() != null && DLbeeEntity.this
/*  84 */       .m_5448_().m_6084_());
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_8056_() {
/*  89 */     LivingEntity livingentity = DLbeeEntity.this.m_5448_();
/*  90 */     Vec3 vec3d = livingentity.m_20299_(1.0F);
/*  91 */     DLbeeEntity.access$000(DLbeeEntity.this).m_6849_(vec3d.f_82479_, vec3d.f_82480_, vec3d.f_82481_, 1.0D);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_8037_() {
/*  96 */     LivingEntity livingentity = DLbeeEntity.this.m_5448_();
/*  97 */     if (DLbeeEntity.this.m_142469_().m_82381_(livingentity.m_142469_())) {
/*  98 */       DLbeeEntity.this.m_7327_((Entity)livingentity);
/*     */     } else {
/* 100 */       double d0 = DLbeeEntity.this.m_20280_((Entity)livingentity);
/* 101 */       if (d0 < 16.0D) {
/* 102 */         Vec3 vec3d = livingentity.m_20299_(1.0F);
/* 103 */         DLbeeEntity.access$100(DLbeeEntity.this).m_6849_(vec3d.f_82479_, vec3d.f_82480_, vec3d.f_82481_, 1.0D);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\DLbeeEntity$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */