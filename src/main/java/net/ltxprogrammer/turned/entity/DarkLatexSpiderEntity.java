/*    */ package net.ltxprogrammer.turned.entity;
/*    */ 
/*    */ import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
/*    */ import net.ltxprogrammer.changed.init.ChangedItems;
/*    */ import net.ltxprogrammer.changed.init.ChangedParticles;
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*    */ import net.ltxprogrammer.turned.procedures.DarkLatexSpiderOnEntityTickUpdateProcedure;
/*    */ import net.ltxprogrammer.turned.procedures.DarkLatexSpiderThisEntityKillsAnotherOneProcedure;
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobType;
/*    */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*    */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.network.PlayMessages;
/*    */ 
/*    */ public class DarkLatexSpiderEntity extends AbstractDarkLatexEntity {
/*    */   public DarkLatexSpiderEntity(PlayMessages.SpawnEntity packet, Level world) {
/* 24 */     this((EntityType<DarkLatexSpiderEntity>)LatexModEntities.DARK_LATEX_SPIDER.get(), world);
/*    */   }
/*    */   
/*    */   public DarkLatexSpiderEntity(EntityType<DarkLatexSpiderEntity> type, Level world) {
/* 28 */     super(type, world);
/* 29 */     this.f_21364_ = 8;
/* 30 */     m_21557_(false);
/*    */   }
/*    */ 
/*    */   
/*    */   public MobType m_6336_() {
/* 35 */     return MobType.f_21642_;
/*    */   }
/*    */   
/*    */   protected void m_7472_(DamageSource source, int looting, boolean recentlyHitIn) {
/* 39 */     super.m_7472_(source, looting, recentlyHitIn);
/* 40 */     m_19983_(new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_5993_(Entity entity, int score, DamageSource damageSource) {
/* 45 */     super.m_5993_(entity, score, damageSource);
/* 46 */     DarkLatexSpiderThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), entity);
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_6075_() {
/* 51 */     super.m_6075_();
/* 52 */     DarkLatexSpiderOnEntityTickUpdateProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/*    */   }
/*    */ 
/*    */   
/*    */   public static void init() {}
/*    */   
/*    */   public static AttributeSupplier.Builder createAttributes() {
/* 59 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 60 */     builder = builder.m_22268_(Attributes.f_22279_, 0.25D);
/* 61 */     builder = builder.m_22268_(Attributes.f_22276_, 25.0D);
/* 62 */     builder = builder.m_22268_(Attributes.f_22284_, 2.0D);
/* 63 */     builder = builder.m_22268_(Attributes.f_22281_, 5.0D);
/* 64 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 65 */     builder = builder.m_22268_(Attributes.f_22278_, 0.5D);
/* 66 */     return builder;
/*    */   }
/*    */ 
/*    */   
/*    */   public ChangedParticles.Color3 getDripColor() {
/* 71 */     return ChangedParticles.Color3.DARK;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\DarkLatexSpiderEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */