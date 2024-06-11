/*    */ package net.ltxprogrammer.turned.entity;
/*    */ 
/*    */ import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
/*    */ import net.ltxprogrammer.changed.init.ChangedParticles;
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraftforge.network.PlayMessages;
/*    */ 
/*    */ public class DarkLatexFoxEntity
/*    */   extends AbstractDarkLatexEntity
/*    */ {
/*    */   public DarkLatexFoxEntity(PlayMessages.SpawnEntity packet, Level world) {
/* 15 */     this((EntityType<DarkLatexFoxEntity>)LatexModEntities.DARK_LATEX_FOX.get(), world);
/*    */   }
/*    */   
/*    */   public DarkLatexFoxEntity(EntityType<DarkLatexFoxEntity> type, Level world) {
/* 19 */     super(type, world);
/* 20 */     this.f_21364_ = 6;
/* 21 */     m_21557_(false);
/*    */   }
/*    */ 
/*    */   
/*    */   public MobType m_6336_() {
/* 26 */     return MobType.f_21642_;
/*    */   }
/*    */ 
/*    */   
/*    */   public static void init() {}
/*    */ 
/*    */   
/*    */   public ChangedParticles.Color3 getDripColor() {
/* 34 */     return ChangedParticles.Color3.DARK;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\DarkLatexFoxEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */