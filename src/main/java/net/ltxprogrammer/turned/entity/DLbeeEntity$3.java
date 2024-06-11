/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import java.util.Random;
/*     */ import net.ltxprogrammer.turned.procedures.CheckforskyProcedure;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
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
/*     */   extends RandomStrollGoal
/*     */ {
/*     */   null(PathfinderMob arg0, double arg1, int arg2) {
/* 115 */     super(arg0, arg1, arg2);
/*     */   }
/*     */   protected Vec3 m_7037_() {
/* 118 */     Random random = DLbeeEntity.this.m_21187_();
/* 119 */     double dir_x = DLbeeEntity.this.m_20185_() + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 120 */     double dir_y = DLbeeEntity.this.m_20186_() + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 121 */     double dir_z = DLbeeEntity.this.m_20189_() + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 122 */     return new Vec3(dir_x, dir_y, dir_z);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_8036_() {
/* 127 */     double x = DLbeeEntity.this.m_20185_();
/* 128 */     double y = DLbeeEntity.this.m_20186_();
/* 129 */     double z = DLbeeEntity.this.m_20189_();
/* 130 */     DLbeeEntity dLbeeEntity = DLbeeEntity.this;
/* 131 */     Level world = DLbeeEntity.this.f_19853_;
/* 132 */     return (super.m_8036_() && CheckforskyProcedure.execute((LevelAccessor)world, x, y, z));
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\DLbeeEntity$3.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */