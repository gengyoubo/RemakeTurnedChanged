/*    */ package net.ltxprogrammer.turned.entity;
/*    */ 
/*    */ import net.ltxprogrammer.changed.entity.beast.AbstractAquaticEntity;
/*    */ import net.ltxprogrammer.changed.entity.beast.DarkLatexEntity;
/*    */ import net.ltxprogrammer.changed.init.ChangedItems;
/*    */ import net.ltxprogrammer.changed.init.ChangedParticles;
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobType;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraftforge.network.PlayMessages;
/*    */ 
/*    */ public class DlsharkEntity extends AbstractAquaticEntity implements DarkLatexEntity {
/*    */   public DlsharkEntity(PlayMessages.SpawnEntity packet, Level world) {
/* 18 */     this((EntityType<DlsharkEntity>)LatexModEntities.DLSHARK.get(), world);
/*    */   }
/*    */   
/*    */   public DlsharkEntity(EntityType<DlsharkEntity> type, Level world) {
/* 22 */     super(type, world);
/* 23 */     this.f_21364_ = 6;
/* 24 */     m_21557_(false);
/*    */   }
/*    */ 
/*    */   
/*    */   public MobType m_6336_() {
/* 29 */     return MobType.f_21642_;
/*    */   }
/*    */   
/*    */   protected void m_7472_(DamageSource source, int looting, boolean recentlyHitIn) {
/* 33 */     super.m_7472_(source, looting, recentlyHitIn);
/* 34 */     m_19983_(new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
/*    */   }
/*    */ 
/*    */   
/*    */   public static void init() {}
/*    */ 
/*    */   
/*    */   public ChangedParticles.Color3 getDripColor() {
/* 42 */     return ChangedParticles.Color3.DARK;
/*    */   }
/*    */ 
/*    */   
/*    */   public boolean isMaskless() {
/* 47 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\DlsharkEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */