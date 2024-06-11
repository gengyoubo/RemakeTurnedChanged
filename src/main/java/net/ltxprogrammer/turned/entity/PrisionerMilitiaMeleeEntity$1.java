/*    */ package net.ltxprogrammer.turned.entity;
/*    */ 
/*    */ import net.ltxprogrammer.turned.procedures.TargethasabatonProcedure;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.PathfinderMob;
/*    */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*    */ import net.minecraft.world.level.Level;
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
/*    */   extends HurtByTargetGoal
/*    */ {
/*    */   null(PathfinderMob arg0, Class<?>... arg1) {
/* 79 */     super(arg0, arg1);
/*    */   }
/*    */   public boolean m_8036_() {
/* 82 */     double x = PrisionerMilitiaMeleeEntity.this.m_20185_();
/* 83 */     double y = PrisionerMilitiaMeleeEntity.this.m_20186_();
/* 84 */     double z = PrisionerMilitiaMeleeEntity.this.m_20189_();
/* 85 */     PrisionerMilitiaMeleeEntity prisionerMilitiaMeleeEntity = PrisionerMilitiaMeleeEntity.this;
/* 86 */     Level world = PrisionerMilitiaMeleeEntity.this.f_19853_;
/* 87 */     return (super.m_8036_() && TargethasabatonProcedure.execute((Entity)prisionerMilitiaMeleeEntity));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\PrisionerMilitiaMeleeEntity$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */