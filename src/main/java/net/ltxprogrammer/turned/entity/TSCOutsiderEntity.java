/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import net.ltxprogrammer.turned.entity.ai.TargetCheck;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.procedures.TSCOutsiderEntityDiesProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TSCOutsiderEntity
/*     */   extends Monster
/*     */ {
/*     */   public TSCOutsiderEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  46 */     this((EntityType<TSCOutsiderEntity>)LatexModEntities.TSC_OUTSIDER.get(), world);
/*     */   }
/*     */   
/*     */   public TSCOutsiderEntity(EntityType<TSCOutsiderEntity> type, Level world) {
/*  50 */     super(type, world);
/*  51 */     this.f_21364_ = 8;
/*  52 */     m_21557_(false);
/*  53 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  58 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  63 */     super.m_8099_();
/*  64 */     this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  67 */             return 4.0D + (entity.m_20205_() * entity.m_20205_());
/*     */           }
/*     */         });
/*  70 */     this.f_21345_.m_25352_(2, (Goal)new OpenDoorGoal((Mob)this, true));
/*  71 */     this.f_21346_.m_25352_(3, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).m_26044_(new Class[0]));
/*  72 */     this.f_21346_.m_25352_(6, (Goal)new NearestAttackableTargetGoal((Mob)this, Mob.class, 10, true, false, TargetCheck.IS_GOOD));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  77 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/*  82 */     return false;
/*     */   }
/*     */   
/*     */   protected void m_7472_(DamageSource source, int looting, boolean recentlyHitIn) {
/*  86 */     super.m_7472_(source, looting, recentlyHitIn);
/*  87 */     m_19983_(new ItemStack((ItemLike)Items.f_42416_));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/*  92 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.step")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/*  97 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal.hit"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 102 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:death_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/* 107 */     if (source.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 108 */       return false; 
/* 109 */     if (source == DamageSource.f_19314_)
/* 110 */       return false; 
/* 111 */     if (source == DamageSource.f_19312_)
/* 112 */       return false; 
/* 113 */     if (source == DamageSource.f_19323_)
/* 114 */       return false; 
/* 115 */     if (source == DamageSource.f_19320_)
/* 116 */       return false; 
/* 117 */     if (source.m_19385_().equals("witherSkull"))
/* 118 */       return false; 
/* 119 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6667_(DamageSource source) {
/* 124 */     super.m_6667_(source);
/* 125 */     TSCOutsiderEntityDiesProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 132 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 133 */     builder = builder.m_22268_(Attributes.f_22279_, 0.3D);
/* 134 */     builder = builder.m_22268_(Attributes.f_22276_, 32.0D);
/* 135 */     builder = builder.m_22268_(Attributes.f_22284_, 6.0D);
/* 136 */     builder = builder.m_22268_(Attributes.f_22281_, 4.0D);
/* 137 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 138 */     builder = builder.m_22268_(Attributes.f_22278_, 0.5D);
/* 139 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\TSCOutsiderEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */