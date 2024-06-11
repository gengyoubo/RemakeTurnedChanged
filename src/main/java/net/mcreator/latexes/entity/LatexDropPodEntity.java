/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.procedures.DROPPODEntityDiesProcedure;
/*     */ import net.mcreator.latexes.procedures.LatexDropPodOnEntityTickUpdateProcedure;
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
/*     */ public class LatexDropPodEntity
/*     */   extends PathfinderMob
/*     */ {
/*     */   public LatexDropPodEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  31 */     this((EntityType<LatexDropPodEntity>)LatexModEntities.LATEX_DROP_POD.get(), world);
/*     */   }
/*     */   
/*     */   public LatexDropPodEntity(EntityType<LatexDropPodEntity> type, Level world) {
/*  35 */     super(type, world);
/*  36 */     this.xpReward = 0;
/*  37 */     setNoAi(false);
/*  38 */     setPersistenceRequired();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  43 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  48 */     super.registerGoals();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/*  54 */     return MobType.UNDEFINED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/*  59 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/*  64 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/*  69 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.anvil.land"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/*  74 */     if (source.getDirectEntity() instanceof net.minecraft.world.entity.player.Player)
/*  75 */       return false; 
/*  76 */     if (source.getDirectEntity() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.getDirectEntity() instanceof net.minecraft.world.entity.AreaEffectCloud)
/*  77 */       return false; 
/*  78 */     if (source == DamageSource.FALL)
/*  79 */       return false; 
/*  80 */     if (source == DamageSource.CACTUS)
/*  81 */       return false; 
/*  82 */     if (source == DamageSource.DROWN)
/*  83 */       return false; 
/*  84 */     if (source == DamageSource.LIGHTNING_BOLT)
/*  85 */       return false; 
/*  86 */     if (source.getMsgId().equals("trident"))
/*  87 */       return false; 
/*  88 */     if (source == DamageSource.ANVIL)
/*  89 */       return false; 
/*  90 */     if (source == DamageSource.DRAGON_BREATH)
/*  91 */       return false; 
/*  92 */     if (source == DamageSource.WITHER)
/*  93 */       return false; 
/*  94 */     if (source.getMsgId().equals("witherSkull"))
/*  95 */       return false; 
/*  96 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 101 */     super.die(source);
/* 102 */     DROPPODEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ());
/*     */   }
/*     */ 
/*     */   
/*     */   public void baseTick() {
/* 107 */     super.baseTick();
/* 108 */     LatexDropPodOnEntityTickUpdateProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), (Entity)this);
/*     */   }
/*     */   
/*     */   public void aiStep() {
/* 112 */     super.aiStep();
/* 113 */     double x = getX();
/* 114 */     double y = getY();
/* 115 */     double z = getZ();
/* 116 */     LatexDropPodEntity latexDropPodEntity = this;
/* 117 */     Level world = this.level;
/* 118 */     for (int l = 0; l < 5; l++) {
/* 119 */       double x0 = x + this.random.nextFloat();
/* 120 */       double y0 = y + this.random.nextFloat();
/* 121 */       double z0 = z + this.random.nextFloat();
/* 122 */       double dx = (this.random.nextFloat() - 0.5D) * 0.25D;
/* 123 */       double dy = (this.random.nextFloat() - 0.5D) * 0.25D;
/* 124 */       double dz = (this.random.nextFloat() - 0.5D) * 0.25D;
/* 125 */       world.addParticle((ParticleOptions)ParticleTypes.LARGE_SMOKE, x0, y0, z0, dx, dy, dz);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 133 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 134 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3D);
/* 135 */     builder = builder.add(Attributes.MAX_HEALTH, 25.0D);
/* 136 */     builder = builder.add(Attributes.ARMOR, 0.0D);
/* 137 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 3.0D);
/* 138 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 139 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\LatexDropPodEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */