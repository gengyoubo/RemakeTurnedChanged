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
/*    */ class null
/*    */   extends HurtByTargetGoal
/*    */ {
/*    */   null(PathfinderMob arg0, Class<?>... arg1) {
/* 62 */     super(arg0, arg1);
/*    */   }
/*    */   public boolean m_8036_() {
/* 65 */     double x = PrisionerEntity.this.m_20185_();
/* 66 */     double y = PrisionerEntity.this.m_20186_();
/* 67 */     double z = PrisionerEntity.this.m_20189_();
/* 68 */     PrisionerEntity prisionerEntity = PrisionerEntity.this;
/* 69 */     Level world = PrisionerEntity.this.f_19853_;
/* 70 */     return (super.m_8036_() && TargethasabatonProcedure.execute((Entity)prisionerEntity));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\PrisionerEntity$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */