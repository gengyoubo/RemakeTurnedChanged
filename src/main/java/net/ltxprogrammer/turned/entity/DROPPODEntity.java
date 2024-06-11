/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.procedures.DROPPODEntityDiesProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.DROPPODOnEntityTickUpdateProcedure;
/*     */ import net.minecraft.core.particles.ParticleOptions;
/*     */ import net.minecraft.core.particles.ParticleTypes;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ 
/*     */ 
/*     */ public class DROPPODEntity
/*     */   extends PathfinderMob
/*     */ {
/*     */   public DROPPODEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  31 */     this((EntityType<DROPPODEntity>)LatexModEntities.DROPPOD.get(), world);
/*     */   }
/*     */   
/*     */   public DROPPODEntity(EntityType<DROPPODEntity> type, Level world) {
/*  35 */     super(type, world);
/*  36 */     this.f_21364_ = 0;
/*  37 */     m_21557_(false);
/*  38 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  43 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  48 */     super.m_8099_();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  54 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/*  59 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/*  64 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/*  69 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.land"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/*  74 */     if (source.m_7640_() instanceof net.minecraft.world.entity.player.Player)
/*  75 */       return false; 
/*  76 */     if (source.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud)
/*  77 */       return false; 
/*  78 */     if (source == DamageSource.f_19315_)
/*  79 */       return false; 
/*  80 */     if (source == DamageSource.f_19314_)
/*  81 */       return false; 
/*  82 */     if (source == DamageSource.f_19312_)
/*  83 */       return false; 
/*  84 */     if (source == DamageSource.f_19306_)
/*  85 */       return false; 
/*  86 */     if (source.m_19385_().equals("trident"))
/*  87 */       return false; 
/*  88 */     if (source == DamageSource.f_19321_)
/*  89 */       return false; 
/*  90 */     if (source == DamageSource.f_19323_)
/*  91 */       return false; 
/*  92 */     if (source == DamageSource.f_19320_)
/*  93 */       return false; 
/*  94 */     if (source.m_19385_().equals("witherSkull"))
/*  95 */       return false; 
/*  96 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6667_(DamageSource source) {
/* 101 */     super.m_6667_(source);
/* 102 */     DROPPODEntityDiesProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_());
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6075_() {
/* 107 */     super.m_6075_();
/* 108 */     DROPPODOnEntityTickUpdateProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/*     */   }
/*     */   
/*     */   public void m_8107_() {
/* 112 */     super.m_8107_();
/* 113 */     double x = m_20185_();
/* 114 */     double y = m_20186_();
/* 115 */     double z = m_20189_();
/* 116 */     DROPPODEntity dROPPODEntity = this;
/* 117 */     Level world = this.f_19853_;
/* 118 */     for (int l = 0; l < 5; l++) {
/* 119 */       double x0 = x + this.f_19796_.nextFloat();
/* 120 */       double y0 = y + this.f_19796_.nextFloat();
/* 121 */       double z0 = z + this.f_19796_.nextFloat();
/* 122 */       double dx = (this.f_19796_.nextFloat() - 0.5D) * 0.25D;
/* 123 */       double dy = (this.f_19796_.nextFloat() - 0.5D) * 0.25D;
/* 124 */       double dz = (this.f_19796_.nextFloat() - 0.5D) * 0.25D;
/* 125 */       world.m_7106_((ParticleOptions)ParticleTypes.f_123755_, x0, y0, z0, dx, dy, dz);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 133 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 134 */     builder = builder.m_22268_(Attributes.f_22279_, 0.3D);
/* 135 */     builder = builder.m_22268_(Attributes.f_22276_, 75.0D);
/* 136 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 137 */     builder = builder.m_22268_(Attributes.f_22281_, 3.0D);
/* 138 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 139 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\DROPPODEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */