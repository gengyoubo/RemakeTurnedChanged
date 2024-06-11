/*    */ package net.ltxprogrammer.turned.entity;
/*    */ 
/*    */ import net.ltxprogrammer.turned.procedures.CheckiftamedProcedure;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class null
/*    */   extends NearestAttackableTargetGoal
/*    */ {
/*    */   null(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
/* 87 */     super(arg0, arg1, arg2, arg3);
/*    */   }
/*    */   public boolean m_8036_() {
/* 90 */     double x = HertxFBSitEntity.this.m_20185_();
/* 91 */     double y = HertxFBSitEntity.this.m_20186_();
/* 92 */     double z = HertxFBSitEntity.this.m_20189_();
/* 93 */     HertxFBSitEntity hertxFBSitEntity = HertxFBSitEntity.this;
/* 94 */     Level world = HertxFBSitEntity.this.f_19853_;
/* 95 */     return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)hertxFBSitEntity));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\HertxFBSitEntity$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */