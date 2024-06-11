/*    */ package net.ltxprogrammer.turned.entity;
/*    */ 
/*    */ import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
/*    */ import net.ltxprogrammer.changed.init.ChangedItems;
/*    */ import net.ltxprogrammer.changed.init.ChangedParticles;
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobType;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraftforge.common.DungeonHooks;
/*    */ import net.minecraftforge.network.PlayMessages;
/*    */ 
/*    */ public class DarklatexconeEntity
/*    */   extends AbstractDarkLatexEntity {
/*    */   public DarklatexconeEntity(PlayMessages.SpawnEntity packet, Level world) {
/* 19 */     this((EntityType<DarklatexconeEntity>)LatexModEntities.DARKLATEXCONE.get(), world);
/*    */   }
/*    */   
/*    */   public DarklatexconeEntity(EntityType<DarklatexconeEntity> type, Level world) {
/* 23 */     super(type, world);
/* 24 */     this.f_21364_ = 6;
/* 25 */     m_21557_(false);
/*    */   }
/*    */ 
/*    */   
/*    */   public MobType m_6336_() {
/* 30 */     return MobType.f_21642_;
/*    */   }
/*    */ 
/*    */   
/*    */   public double m_6048_() {
/* 35 */     return super.m_6048_() + 1.8D;
/*    */   }
/*    */   
/*    */   protected void m_7472_(DamageSource source, int looting, boolean recentlyHitIn) {
/* 39 */     super.m_7472_(source, looting, recentlyHitIn);
/* 40 */     m_19983_(new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
/*    */   }
/*    */   
/*    */   public static void init() {
/* 44 */     DungeonHooks.addDungeonMob((EntityType)LatexModEntities.DARKLATEXCONE.get(), 180);
/*    */   }
/*    */ 
/*    */   
/*    */   public ChangedParticles.Color3 getDripColor() {
/* 49 */     return ChangedParticles.Color3.DARK;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\DarklatexconeEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */