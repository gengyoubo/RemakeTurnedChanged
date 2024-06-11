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
/*    */ 
/*    */ 
/*    */ 
/*    */ class null
/*    */   extends NearestAttackableTargetGoal
/*    */ {
/*    */   null(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
/* 90 */     super(arg0, arg1, arg2, arg3);
/*    */   }
/*    */   public boolean m_8036_() {
/* 93 */     double x = NXTHertxEntity.this.m_20185_();
/* 94 */     double y = NXTHertxEntity.this.m_20186_();
/* 95 */     double z = NXTHertxEntity.this.m_20189_();
/* 96 */     NXTHertxEntity nXTHertxEntity = NXTHertxEntity.this;
/* 97 */     Level world = NXTHertxEntity.this.f_19853_;
/* 98 */     return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)nXTHertxEntity));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\NXTHertxEntity$2.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */