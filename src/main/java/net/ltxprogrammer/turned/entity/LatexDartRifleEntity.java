/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import java.util.Random;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.procedures.DartrifleBulletHitsLivingEntityProcedure;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.projectile.AbstractArrow;
/*     */ import net.minecraft.world.entity.projectile.ItemSupplier;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.phys.EntityHitResult;
/*     */ import net.minecraftforge.api.distmarker.Dist;
/*     */ import net.minecraftforge.api.distmarker.OnlyIn;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ @OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
/*     */ public class LatexDartRifleEntity
/*     */   extends AbstractArrow
/*     */   implements ItemSupplier {
/*     */   public LatexDartRifleEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  29 */     super((EntityType)LatexModEntities.LATEX_DART_RIFLE.get(), world);
/*     */   }
/*     */   
/*     */   public LatexDartRifleEntity(EntityType<? extends LatexDartRifleEntity> type, Level world) {
/*  33 */     super(type, world);
/*     */   }
/*     */   
/*     */   public LatexDartRifleEntity(EntityType<? extends LatexDartRifleEntity> type, double x, double y, double z, Level world) {
/*  37 */     super(type, x, y, z, world);
/*     */   }
/*     */   
/*     */   public LatexDartRifleEntity(EntityType<? extends LatexDartRifleEntity> type, LivingEntity entity, Level world) {
/*  41 */     super(type, entity, world);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  46 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public ItemStack m_7846_() {
/*  52 */     return ItemStack.f_41583_;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ItemStack m_7941_() {
/*  57 */     return ItemStack.f_41583_;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_7761_(LivingEntity entity) {
/*  62 */     super.m_7761_(entity);
/*  63 */     entity.m_21317_(entity.m_21234_() - 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_5790_(EntityHitResult entityHitResult) {
/*  68 */     super.m_5790_(entityHitResult);
/*  69 */     DartrifleBulletHitsLivingEntityProcedure.execute(entityHitResult.m_82443_());
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_8119_() {
/*  74 */     super.m_8119_();
/*  75 */     if (this.f_36703_)
/*  76 */       m_146870_(); 
/*     */   }
/*     */   
/*     */   public static LatexDartRifleEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
/*  80 */     LatexDartRifleEntity entityarrow = new LatexDartRifleEntity((EntityType<? extends LatexDartRifleEntity>)LatexModEntities.LATEX_DART_RIFLE.get(), entity, world);
/*  81 */     entityarrow.m_6686_((entity.m_20252_(1.0F)).f_82479_, (entity.m_20252_(1.0F)).f_82480_, (entity.m_20252_(1.0F)).f_82481_, power * 2.0F, 0.0F);
/*  82 */     entityarrow.m_20225_(true);
/*  83 */     entityarrow.m_36762_(false);
/*  84 */     entityarrow.m_36781_(damage);
/*  85 */     entityarrow.m_36735_(knockback);
/*  86 */     world.m_7967_((Entity)entityarrow);
/*  87 */     world.m_6263_(null, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/*  88 */         .getValue(new ResourceLocation("turned:dart_shot")), SoundSource.PLAYERS, 1.0F, 1.0F / (random
/*  89 */         .nextFloat() * 0.5F + 1.0F) + power / 2.0F);
/*  90 */     return entityarrow;
/*     */   }
/*     */   
/*     */   public static LatexDartRifleEntity shoot(LivingEntity entity, LivingEntity target) {
/*  94 */     LatexDartRifleEntity entityarrow = new LatexDartRifleEntity((EntityType<? extends LatexDartRifleEntity>)LatexModEntities.LATEX_DART_RIFLE.get(), entity, entity.f_19853_);
/*  95 */     double dx = target.m_20185_() - entity.m_20185_();
/*  96 */     double dy = target.m_20186_() + target.m_20192_() - 1.1D;
/*  97 */     double dz = target.m_20189_() - entity.m_20189_();
/*  98 */     entityarrow.m_6686_(dx, dy - entityarrow.m_20186_() + Math.hypot(dx, dz) * 0.20000000298023224D, dz, 5.0F, 12.0F);
/*  99 */     entityarrow.m_20225_(true);
/* 100 */     entityarrow.m_36781_(1.5D);
/* 101 */     entityarrow.m_36735_(0);
/* 102 */     entityarrow.m_36762_(false);
/* 103 */     entity.f_19853_.m_7967_((Entity)entityarrow);
/* 104 */     entity.f_19853_.m_6263_(null, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 105 */         .getValue(new ResourceLocation("turned:dart_shot")), SoundSource.PLAYERS, 1.0F, 1.0F / ((new Random())
/* 106 */         .nextFloat() * 0.5F + 1.0F));
/* 107 */     return entityarrow;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\LatexDartRifleEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */