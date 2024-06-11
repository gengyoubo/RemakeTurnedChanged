/*    */ package net.ltxprogrammer.turned.entity;
/*    */ 
/*    */ import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
/*    */ import net.ltxprogrammer.changed.entity.beast.AquaticEntity;
/*    */ import net.ltxprogrammer.changed.init.ChangedParticles;
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobType;
/*    */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*    */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraftforge.network.PlayMessages;
/*    */ 
/*    */ public class DlSquidDogEntity
/*    */   extends AbstractDarkLatexEntity
/*    */   implements AquaticEntity {
/*    */   public DlSquidDogEntity(PlayMessages.SpawnEntity packet, Level world) {
/* 19 */     this((EntityType<DlSquidDogEntity>)LatexModEntities.DL_SQUID_DOG.get(), world);
/*    */   }
/*    */   
/*    */   public DlSquidDogEntity(EntityType<DlSquidDogEntity> type, Level world) {
/* 23 */     super(type, world);
/* 24 */     this.f_21364_ = 9;
/* 25 */     m_21557_(false);
/*    */   }
/*    */ 
/*    */   
/*    */   public MobType m_6336_() {
/* 30 */     return MobType.f_21642_;
/*    */   }
/*    */ 
/*    */   
/*    */   public static void init() {}
/*    */   
/*    */   public static AttributeSupplier.Builder createAttributes() {
/* 37 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 38 */     builder = builder.m_22268_(Attributes.f_22279_, 0.2D);
/* 39 */     builder = builder.m_22268_(Attributes.f_22276_, 42.0D);
/* 40 */     builder = builder.m_22268_(Attributes.f_22284_, 0.7999999999999999D);
/* 41 */     builder = builder.m_22268_(Attributes.f_22281_, 4.0D);
/* 42 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 43 */     builder = builder.m_22268_(Attributes.f_22278_, 0.4D);
/* 44 */     return builder;
/*    */   }
/*    */ 
/*    */   
/*    */   public ChangedParticles.Color3 getDripColor() {
/* 49 */     return ChangedParticles.Color3.DARK;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\DlSquidDogEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */