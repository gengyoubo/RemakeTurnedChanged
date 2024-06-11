/*    */ package net.ltxprogrammer.turned.entity;
/*    */ 
/*    */ import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
/*    */ import net.ltxprogrammer.changed.init.ChangedItems;
/*    */ import net.ltxprogrammer.changed.init.ChangedParticles;
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*    */ import net.minecraft.network.protocol.Packet;
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.MobType;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraftforge.network.NetworkHooks;
/*    */ import net.minecraftforge.network.PlayMessages;
/*    */ 
/*    */ public class DarkLatexSkeletonEntity extends AbstractDarkLatexEntity {
/*    */   public DarkLatexSkeletonEntity(PlayMessages.SpawnEntity packet, Level world) {
/* 20 */     this((EntityType<DarkLatexSkeletonEntity>)LatexModEntities.DARK_LATEX_SKELETON.get(), world);
/*    */   }
/*    */   
/*    */   public DarkLatexSkeletonEntity(EntityType<DarkLatexSkeletonEntity> type, Level world) {
/* 24 */     super(type, world);
/* 25 */     this.f_21364_ = 8;
/* 26 */     m_21557_(false);
/*    */   }
/*    */ 
/*    */   
/*    */   public Packet<?> m_5654_() {
/* 31 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*    */   }
/*    */ 
/*    */   
/*    */   public MobType m_6336_() {
/* 36 */     return MobType.f_21641_;
/*    */   }
/*    */   
/*    */   protected void m_7472_(DamageSource source, int looting, boolean recentlyHitIn) {
/* 40 */     super.m_7472_(source, looting, recentlyHitIn);
/* 41 */     m_19983_(new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
/*    */   }
/*    */ 
/*    */   
/*    */   public static void init() {}
/*    */ 
/*    */   
/*    */   public ChangedParticles.Color3 getDripColor() {
/* 49 */     return ChangedParticles.Color3.DARK;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\DarkLatexSkeletonEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */