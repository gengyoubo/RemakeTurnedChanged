/*    */ package net.ltxprogrammer.turned.entity;
/*    */ 
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*    */ import net.ltxprogrammer.turned.procedures.TSCOutsiderEntityDiesProcedure;
/*    */ import net.minecraft.world.damagesource.DamageSource;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*    */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.network.PlayMessages;
/*    */ 
/*    */ public class TSCBerserkEntity
/*    */   extends AbstractTSCEntity {
/*    */   public TSCBerserkEntity(PlayMessages.SpawnEntity packet, Level world) {
/* 17 */     this((EntityType<TSCBerserkEntity>)LatexModEntities.TSC_BERSERK.get(), world);
/*    */   }
/*    */   
/*    */   public TSCBerserkEntity(EntityType<TSCBerserkEntity> type, Level world) {
/* 21 */     super((EntityType)type, world);
/* 22 */     this.f_21364_ = 16;
/* 23 */     m_21557_(false);
/* 24 */     m_21530_();
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_6667_(DamageSource source) {
/* 29 */     super.m_6667_(source);
/* 30 */     TSCOutsiderEntityDiesProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_());
/*    */   }
/*    */ 
/*    */   
/*    */   public static void init() {}
/*    */   
/*    */   public static AttributeSupplier.Builder createAttributes() {
/* 37 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 38 */     builder = builder.m_22268_(Attributes.f_22279_, 0.4D);
/* 39 */     builder = builder.m_22268_(Attributes.f_22276_, 72.0D);
/* 40 */     builder = builder.m_22268_(Attributes.f_22284_, 7.199999999999999D);
/* 41 */     builder = builder.m_22268_(Attributes.f_22281_, 8.0D);
/* 42 */     builder = builder.m_22268_(Attributes.f_22277_, 32.0D);
/* 43 */     builder = builder.m_22268_(Attributes.f_22278_, 1.0D);
/* 44 */     builder = builder.m_22268_(Attributes.f_22282_, 0.5D);
/* 45 */     return builder;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\TSCBerserkEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */