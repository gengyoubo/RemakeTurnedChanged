/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import java.util.Random;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.procedures.FlamethowerBulletHitsBlockProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.FlamethowerWhileBulletFlyingTickProcedure;
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
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.phys.BlockHitResult;
/*     */ import net.minecraftforge.api.distmarker.Dist;
/*     */ import net.minecraftforge.api.distmarker.OnlyIn;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ @OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
/*     */ public class FlamethowerEntity extends AbstractArrow implements ItemSupplier {
/*     */   public FlamethowerEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  31 */     super((EntityType)LatexModEntities.FLAMETHOWER.get(), world);
/*     */   }
/*     */   
/*     */   public FlamethowerEntity(EntityType<? extends FlamethowerEntity> type, Level world) {
/*  35 */     super(type, world);
/*     */   }
/*     */   
/*     */   public FlamethowerEntity(EntityType<? extends FlamethowerEntity> type, double x, double y, double z, Level world) {
/*  39 */     super(type, x, y, z, world);
/*     */   }
/*     */   
/*     */   public FlamethowerEntity(EntityType<? extends FlamethowerEntity> type, LivingEntity entity, Level world) {
/*  43 */     super(type, entity, world);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  48 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public ItemStack m_7846_() {
/*  54 */     return new ItemStack((ItemLike)Blocks.f_50083_);
/*     */   }
/*     */ 
/*     */   
/*     */   protected ItemStack m_7941_() {
/*  59 */     return ItemStack.f_41583_;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_7761_(LivingEntity entity) {
/*  64 */     super.m_7761_(entity);
/*  65 */     entity.m_21317_(entity.m_21234_() - 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_8060_(BlockHitResult blockHitResult) {
/*  70 */     super.m_8060_(blockHitResult);
/*  71 */     FlamethowerBulletHitsBlockProcedure.execute((LevelAccessor)this.f_19853_, blockHitResult.m_82425_().m_123341_(), blockHitResult.m_82425_().m_123342_(), blockHitResult
/*  72 */         .m_82425_().m_123343_());
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_8119_() {
/*  77 */     super.m_8119_();
/*  78 */     FlamethowerWhileBulletFlyingTickProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_());
/*  79 */     if (this.f_36703_)
/*  80 */       m_146870_(); 
/*     */   }
/*     */   
/*     */   public static FlamethowerEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
/*  84 */     FlamethowerEntity entityarrow = new FlamethowerEntity((EntityType<? extends FlamethowerEntity>)LatexModEntities.FLAMETHOWER.get(), entity, world);
/*  85 */     entityarrow.m_6686_((entity.m_20252_(1.0F)).f_82479_, (entity.m_20252_(1.0F)).f_82480_, (entity.m_20252_(1.0F)).f_82481_, power * 2.0F, 0.0F);
/*  86 */     entityarrow.m_20225_(true);
/*  87 */     entityarrow.m_36762_(false);
/*  88 */     entityarrow.m_36781_(damage);
/*  89 */     entityarrow.m_36735_(knockback);
/*  90 */     entityarrow.m_20254_(100);
/*  91 */     world.m_7967_((Entity)entityarrow);
/*  92 */     world.m_6263_(null, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/*  93 */         .getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.PLAYERS, 1.0F, 1.0F / (random
/*  94 */         .nextFloat() * 0.5F + 1.0F) + power / 2.0F);
/*  95 */     return entityarrow;
/*     */   }
/*     */   
/*     */   public static FlamethowerEntity shoot(LivingEntity entity, LivingEntity target) {
/*  99 */     FlamethowerEntity entityarrow = new FlamethowerEntity((EntityType<? extends FlamethowerEntity>)LatexModEntities.FLAMETHOWER.get(), entity, entity.f_19853_);
/* 100 */     double dx = target.m_20185_() - entity.m_20185_();
/* 101 */     double dy = target.m_20186_() + target.m_20192_() - 1.1D;
/* 102 */     double dz = target.m_20189_() - entity.m_20189_();
/* 103 */     entityarrow.m_6686_(dx, dy - entityarrow.m_20186_() + Math.hypot(dx, dz) * 0.20000000298023224D, dz, 3.0F, 12.0F);
/* 104 */     entityarrow.m_20225_(true);
/* 105 */     entityarrow.m_36781_(5.0D);
/* 106 */     entityarrow.m_36735_(0);
/* 107 */     entityarrow.m_36762_(false);
/* 108 */     entityarrow.m_20254_(100);
/* 109 */     entity.f_19853_.m_7967_((Entity)entityarrow);
/* 110 */     entity.f_19853_.m_6263_(null, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 111 */         .getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.PLAYERS, 1.0F, 1.0F / ((new Random())
/* 112 */         .nextFloat() * 0.5F + 1.0F));
/* 113 */     return entityarrow;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\FlamethowerEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */