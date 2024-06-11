/*    */ package net.ltxprogrammer.turned.entity;
/*    */ 
/*    */ import net.ltxprogrammer.turned.procedures.TargetwearingbadberetProcedure;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
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
/*    */ class null
/*    */   extends NearestAttackableTargetGoal
/*    */ {
/*    */   null(Mob arg0, Class arg1, boolean arg2, boolean arg3) {
/* 75 */     super(arg0, arg1, arg2, arg3);
/*    */   }
/*    */   public boolean m_8036_() {
/* 78 */     double x = EvilMilitaryEntity.this.m_20185_();
/* 79 */     double y = EvilMilitaryEntity.this.m_20186_();
/* 80 */     double z = EvilMilitaryEntity.this.m_20189_();
/* 81 */     EvilMilitaryEntity evilMilitaryEntity = EvilMilitaryEntity.this;
/* 82 */     Level world = EvilMilitaryEntity.this.f_19853_;
/* 83 */     return (super.m_8036_() && TargetwearingbadberetProcedure.execute((Entity)evilMilitaryEntity));
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean m_8045_() {
/* 88 */     double x = EvilMilitaryEntity.this.m_20185_();
/* 89 */     double y = EvilMilitaryEntity.this.m_20186_();
/* 90 */     double z = EvilMilitaryEntity.this.m_20189_();
/* 91 */     EvilMilitaryEntity evilMilitaryEntity = EvilMilitaryEntity.this;
/* 92 */     Level world = EvilMilitaryEntity.this.f_19853_;
/* 93 */     return (super.m_8045_() && TargetwearingbadberetProcedure.execute((Entity)evilMilitaryEntity));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\EvilMilitaryEntity$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */