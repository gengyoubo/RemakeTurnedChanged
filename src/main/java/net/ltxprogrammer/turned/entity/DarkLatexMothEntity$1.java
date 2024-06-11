/*    */ package net.ltxprogrammer.turned.entity;
/*    */ 
/*    */ import java.util.EnumSet;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.ai.goal.Goal;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class null
/*    */   extends Goal
/*    */ {
/*    */   null() {
/* 70 */     m_7021_(EnumSet.of(Goal.Flag.MOVE));
/*    */   }
/*    */   
/*    */   public boolean m_8036_() {
/* 74 */     return (DarkLatexMothEntity.this.m_5448_() != null && !DarkLatexMothEntity.this.m_21566_().m_24995_());
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_8045_() {
/* 79 */     return (DarkLatexMothEntity.this.m_21566_().m_24995_() && DarkLatexMothEntity.this.m_5448_() != null && DarkLatexMothEntity.this
/* 80 */       .m_5448_().m_6084_());
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_8056_() {
/* 85 */     LivingEntity livingentity = DarkLatexMothEntity.this.m_5448_();
/* 86 */     Vec3 vec3d = livingentity.m_20299_(1.0F);
/* 87 */     DarkLatexMothEntity.access$000(DarkLatexMothEntity.this).m_6849_(vec3d.f_82479_, vec3d.f_82480_, vec3d.f_82481_, 1.0D);
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_8037_() {
/* 92 */     LivingEntity livingentity = DarkLatexMothEntity.this.m_5448_();
/* 93 */     if (DarkLatexMothEntity.this.m_142469_().m_82381_(livingentity.m_142469_())) {
/* 94 */       DarkLatexMothEntity.this.m_7327_((Entity)livingentity);
/*    */     } else {
/* 96 */       double d0 = DarkLatexMothEntity.this.m_20280_((Entity)livingentity);
/* 97 */       if (d0 < 9.0D) {
/* 98 */         Vec3 vec3d = livingentity.m_20299_(1.0F);
/* 99 */         DarkLatexMothEntity.access$100(DarkLatexMothEntity.this).m_6849_(vec3d.f_82479_, vec3d.f_82480_, vec3d.f_82481_, 1.0D);
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\DarkLatexMothEntity$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */