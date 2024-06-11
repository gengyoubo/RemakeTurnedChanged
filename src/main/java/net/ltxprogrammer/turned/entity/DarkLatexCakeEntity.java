/*    */ package net.ltxprogrammer.turned.entity;
/*    */ 
/*    */ import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
/*    */ import net.ltxprogrammer.changed.init.ChangedParticles;
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*    */ import net.ltxprogrammer.turned.procedures.DarkLatexCakePlayerCollidesWithThisEntityProcedure;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobType;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraftforge.common.DungeonHooks;
/*    */ import net.minecraftforge.network.PlayMessages;
/*    */ 
/*    */ public class DarkLatexCakeEntity
/*    */   extends AbstractDarkLatexEntity
/*    */ {
/*    */   public DarkLatexCakeEntity(PlayMessages.SpawnEntity packet, Level world) {
/* 19 */     this((EntityType<DarkLatexCakeEntity>)LatexModEntities.DARK_LATEX_CAKE.get(), world);
/*    */   }
/*    */   
/*    */   public DarkLatexCakeEntity(EntityType<DarkLatexCakeEntity> type, Level world) {
/* 23 */     super(type, world);
/* 24 */     this.f_21364_ = 6;
/* 25 */     m_21557_(false);
/*    */   }
/*    */ 
/*    */   
/*    */   public ChangedParticles.Color3 getDripColor() {
/* 30 */     return ChangedParticles.Color3.DARK;
/*    */   }
/*    */ 
/*    */   
/*    */   public MobType m_6336_() {
/* 35 */     return MobType.f_21642_;
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_6123_(Player sourceentity) {
/* 40 */     super.m_6123_(sourceentity);
/* 41 */     DarkLatexCakePlayerCollidesWithThisEntityProcedure.execute((Entity)this, (Entity)sourceentity);
/*    */   }
/*    */   
/*    */   public static void init() {
/* 45 */     DungeonHooks.addDungeonMob((EntityType)LatexModEntities.DARK_LATEX_CAKE.get(), 180);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\DarkLatexCakeEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */