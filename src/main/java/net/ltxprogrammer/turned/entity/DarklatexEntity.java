/*    */ package net.ltxprogrammer.turned.entity;
/*    */ 
/*    */ import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
/*    */ import net.ltxprogrammer.changed.init.ChangedParticles;
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraftforge.common.DungeonHooks;
/*    */ import net.minecraftforge.network.PlayMessages;
/*    */ 
/*    */ public class DarklatexEntity
/*    */   extends AbstractDarkLatexEntity {
/*    */   public DarklatexEntity(PlayMessages.SpawnEntity packet, Level world) {
/* 15 */     this((EntityType<DarklatexEntity>)LatexModEntities.DARKLATEX.get(), world);
/*    */   }
/*    */   
/*    */   public DarklatexEntity(EntityType<DarklatexEntity> type, Level world) {
/* 19 */     super(type, world);
/* 20 */     this.f_21364_ = 5;
/* 21 */     m_21557_(false);
/*    */   }
/*    */ 
/*    */   
/*    */   public ChangedParticles.Color3 getDripColor() {
/* 26 */     return ChangedParticles.Color3.DARK;
/*    */   }
/*    */ 
/*    */   
/*    */   public MobType m_6336_() {
/* 31 */     return MobType.f_21642_;
/*    */   }
/*    */ 
/*    */   
/*    */   public double m_6048_() {
/* 36 */     return super.m_6048_() + 1.8D;
/*    */   }
/*    */   
/*    */   public static void init() {
/* 40 */     DungeonHooks.addDungeonMob((EntityType)LatexModEntities.DARKLATEX.get(), 180);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\DarklatexEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */