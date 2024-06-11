/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import java.util.Random;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.init.LatexModItems;
/*     */ import net.ltxprogrammer.turned.procedures.TSCPistolWhileBulletFlyingTickProcedure;
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
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraftforge.api.distmarker.Dist;
/*     */ import net.minecraftforge.api.distmarker.OnlyIn;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ @OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
/*     */ public class TSCPistolEntity extends AbstractArrow implements ItemSupplier {
/*     */   public TSCPistolEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  29 */     super((EntityType)LatexModEntities.TSC_PISTOL.get(), world);
/*     */   }
/*     */   
/*     */   public TSCPistolEntity(EntityType<? extends TSCPistolEntity> type, Level world) {
/*  33 */     super(type, world);
/*     */   }
/*     */   
/*     */   public TSCPistolEntity(EntityType<? extends TSCPistolEntity> type, double x, double y, double z, Level world) {
/*  37 */     super(type, x, y, z, world);
/*     */   }
/*     */   
/*     */   public TSCPistolEntity(EntityType<? extends TSCPistolEntity> type, LivingEntity entity, Level world) {
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
/*  52 */     return new ItemStack((ItemLike)LatexModItems.BULLETICON.get());
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
/*     */   public void m_8119_() {
/*  68 */     super.m_8119_();
/*  69 */     TSCPistolWhileBulletFlyingTickProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_());
/*  70 */     if (this.f_36703_)
/*  71 */       m_146870_(); 
/*     */   }
/*     */   
/*     */   public static TSCPistolEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
/*  75 */     TSCPistolEntity entityarrow = new TSCPistolEntity((EntityType<? extends TSCPistolEntity>)LatexModEntities.TSC_PISTOL.get(), entity, world);
/*  76 */     entityarrow.m_6686_((entity.m_20252_(1.0F)).f_82479_, (entity.m_20252_(1.0F)).f_82480_, (entity.m_20252_(1.0F)).f_82481_, power * 2.0F, 0.0F);
/*  77 */     entityarrow.m_20225_(true);
/*  78 */     entityarrow.m_36762_(false);
/*  79 */     entityarrow.m_36781_(damage);
/*  80 */     entityarrow.m_36735_(knockback);
/*  81 */     world.m_7967_((Entity)entityarrow);
/*  82 */     world.m_6263_(null, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/*  83 */         .getValue(new ResourceLocation("turned:gunshot")), SoundSource.PLAYERS, 1.0F, 1.0F / (random
/*  84 */         .nextFloat() * 0.5F + 1.0F) + power / 2.0F);
/*  85 */     return entityarrow;
/*     */   }
/*     */   
/*     */   public static TSCPistolEntity shoot(LivingEntity entity, LivingEntity target) {
/*  89 */     TSCPistolEntity entityarrow = new TSCPistolEntity((EntityType<? extends TSCPistolEntity>)LatexModEntities.TSC_PISTOL.get(), entity, entity.f_19853_);
/*  90 */     double dx = target.m_20185_() - entity.m_20185_();
/*  91 */     double dy = target.m_20186_() + target.m_20192_() - 1.1D;
/*  92 */     double dz = target.m_20189_() - entity.m_20189_();
/*  93 */     entityarrow.m_6686_(dx, dy - entityarrow.m_20186_() + Math.hypot(dx, dz) * 0.20000000298023224D, dz, 6.0F, 12.0F);
/*  94 */     entityarrow.m_20225_(true);
/*  95 */     entityarrow.m_36781_(3.0D);
/*  96 */     entityarrow.m_36735_(1);
/*  97 */     entityarrow.m_36762_(false);
/*  98 */     entity.f_19853_.m_7967_((Entity)entityarrow);
/*  99 */     entity.f_19853_.m_6263_(null, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 100 */         .getValue(new ResourceLocation("turned:gunshot")), SoundSource.PLAYERS, 1.0F, 1.0F / ((new Random())
/* 101 */         .nextFloat() * 0.5F + 1.0F));
/* 102 */     return entityarrow;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\TSCPistolEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */