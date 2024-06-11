/*    */ package net.ltxprogrammer.turned.entity;
/*    */ import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
/*    */ import net.ltxprogrammer.changed.init.ChangedItems;
/*    */ import net.ltxprogrammer.changed.init.ChangedParticles;
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*    */ import net.minecraft.world.Difficulty;
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobType;
/*    */ import net.minecraft.world.entity.ai.goal.BreakDoorGoal;
/*    */ import net.minecraft.world.entity.ai.goal.Goal;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraftforge.network.PlayMessages;
/*    */ 
/*    */ public class DarkLatexSnepEntity extends AbstractDarkLatexEntity {
/*    */   public DarkLatexSnepEntity(PlayMessages.SpawnEntity packet, Level world) {
/* 19 */     this((EntityType<DarkLatexSnepEntity>)LatexModEntities.DARK_LATEX_SNEP.get(), world);
/*    */   }
/*    */   
/*    */   public DarkLatexSnepEntity(EntityType<DarkLatexSnepEntity> type, Level world) {
/* 23 */     super(type, world);
/* 24 */     this.f_21364_ = 6;
/* 25 */     m_21557_(false);
/*    */   }
/*    */ 
/*    */   
/*    */   protected void m_8099_() {
/* 30 */     super.m_8099_();
/* 31 */     this.f_21345_.m_25352_(19, (Goal)new BreakDoorGoal((Mob)this, e -> true));
/*    */   }
/*    */ 
/*    */   
/*    */   public MobType m_6336_() {
/* 36 */     return MobType.f_21642_;
/*    */   }
/*    */   
/*    */   protected void m_7472_(DamageSource source, int looting, boolean recentlyHitIn) {
/* 40 */     super.m_7472_(source, looting, recentlyHitIn);
/* 41 */     m_19983_(new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static void init() {}
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public ChangedParticles.Color3 getDripColor() {
/* 58 */     return ChangedParticles.Color3.DARK;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\DarkLatexSnepEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */