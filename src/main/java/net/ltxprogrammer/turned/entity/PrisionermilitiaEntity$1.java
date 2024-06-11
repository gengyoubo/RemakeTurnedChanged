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
/*    */ 
/*    */ 
/*    */ 
/*    */ class null
/*    */   extends HurtByTargetGoal
/*    */ {
/*    */   null(PathfinderMob arg0, Class<?>... arg1) {
/* 82 */     super(arg0, arg1);
/*    */   }
/*    */   public boolean m_8036_() {
/* 85 */     double x = PrisionermilitiaEntity.this.m_20185_();
/* 86 */     double y = PrisionermilitiaEntity.this.m_20186_();
/* 87 */     double z = PrisionermilitiaEntity.this.m_20189_();
/* 88 */     PrisionermilitiaEntity prisionermilitiaEntity = PrisionermilitiaEntity.this;
/* 89 */     Level world = PrisionermilitiaEntity.this.f_19853_;
/* 90 */     return (super.m_8036_() && TargethasabatonProcedure.execute((Entity)prisionermilitiaEntity));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\PrisionermilitiaEntity$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */