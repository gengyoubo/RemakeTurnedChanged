/*    */ package net.ltxprogrammer.turned.entity;
/*    */ 
/*    */ import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
/*    */ import net.ltxprogrammer.changed.init.ChangedParticles;
/*    */ import net.ltxprogrammer.turned.entity.ai.TargetCheck;
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobType;
/*    */ import net.minecraft.world.entity.PathfinderMob;
/*    */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*    */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*    */ import net.minecraft.world.entity.ai.goal.Goal;
/*    */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*    */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraftforge.network.PlayMessages;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class DarkLatexSnakeEntity
/*    */   extends AbstractDarkLatexEntity
/*    */ {
/*    */   public DarkLatexSnakeEntity(PlayMessages.SpawnEntity packet, Level world) {
/* 55 */     this((EntityType<DarkLatexSnakeEntity>)LatexModEntities.DARK_LATEX_SNAKE.get(), world);
/*    */   }
/*    */   
/*    */   public DarkLatexSnakeEntity(EntityType<DarkLatexSnakeEntity> type, Level world) {
/* 59 */     super(type, world);
/* 60 */     this.f_21364_ = 6;
/* 61 */     m_21557_(false);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void m_8099_() {
/* 66 */     super.m_8099_();
/* 67 */     this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.25D, false)
/*    */         {
/*    */           protected double m_6639_(LivingEntity entity) {
/* 70 */             return 4.0D + (entity.m_20205_() * entity.m_20205_());
/*    */           }
/*    */         });
/* 73 */     this.f_21346_.m_25352_(2, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, 10, false, true, TargetCheck.IS_SLIMELING));
/* 74 */     this.f_21346_.m_25352_(3, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, 10, true, false, TargetCheck.IS_GOOD));
/* 75 */     this.f_21346_.m_25352_(4, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, 10, true, false, TargetCheck.IS_EVIL));
/*    */   }
/*    */ 
/*    */   
/*    */   public MobType m_6336_() {
/* 80 */     return MobType.f_21642_;
/*    */   }
/*    */ 
/*    */   
/*    */   public static void init() {}
/*    */   
/*    */   public static AttributeSupplier.Builder createAttributes() {
/* 87 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 88 */     builder = builder.m_22268_(Attributes.f_22279_, 0.25D);
/* 89 */     builder = builder.m_22268_(Attributes.f_22276_, 32.0D);
/* 90 */     builder = builder.m_22268_(Attributes.f_22284_, 2.0D);
/* 91 */     builder = builder.m_22268_(Attributes.f_22281_, 4.0D);
/* 92 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 93 */     builder = builder.m_22268_(Attributes.f_22278_, 0.2D);
/* 94 */     return builder;
/*    */   }
/*    */ 
/*    */   
/*    */   public ChangedParticles.Color3 getDripColor() {
/* 99 */     return ChangedParticles.Color3.DARK;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\DarkLatexSnakeEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */