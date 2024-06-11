/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import java.util.Random;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.procedures.TankCannonBulletHitsBlockProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.TankCannonWhileBulletFlyingTickProcedure;
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
/*     */ import net.minecraft.world.phys.EntityHitResult;
/*     */ import net.minecraftforge.api.distmarker.Dist;
/*     */ import net.minecraftforge.api.distmarker.OnlyIn;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ @OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
/*     */ public class TankCannonEntity extends AbstractArrow implements ItemSupplier {
/*     */   public TankCannonEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  32 */     super((EntityType)LatexModEntities.TANK_CANNON.get(), world);
/*     */   }
/*     */   
/*     */   public TankCannonEntity(EntityType<? extends TankCannonEntity> type, Level world) {
/*  36 */     super(type, world);
/*     */   }
/*     */   
/*     */   public TankCannonEntity(EntityType<? extends TankCannonEntity> type, double x, double y, double z, Level world) {
/*  40 */     super(type, x, y, z, world);
/*     */   }
/*     */   
/*     */   public TankCannonEntity(EntityType<? extends TankCannonEntity> type, LivingEntity entity, Level world) {
/*  44 */     super(type, entity, world);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  49 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public ItemStack m_7846_() {
/*  55 */     return new ItemStack((ItemLike)Blocks.f_50077_);
/*     */   }
/*     */ 
/*     */   
/*     */   protected ItemStack m_7941_() {
/*  60 */     return new ItemStack((ItemLike)Blocks.f_50077_);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_7761_(LivingEntity entity) {
/*  65 */     super.m_7761_(entity);
/*  66 */     entity.m_21317_(entity.m_21234_() - 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_5790_(EntityHitResult entityHitResult) {
/*  71 */     super.m_5790_(entityHitResult);
/*  72 */     TankCannonBulletHitsBlockProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), entityHitResult.m_82443_());
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_8060_(BlockHitResult blockHitResult) {
/*  77 */     super.m_8060_(blockHitResult);
/*  78 */     TankCannonBulletHitsBlockProcedure.execute((LevelAccessor)this.f_19853_, blockHitResult.m_82425_().m_123341_(), blockHitResult.m_82425_().m_123342_(), blockHitResult
/*  79 */         .m_82425_().m_123343_(), m_37282_());
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_8119_() {
/*  84 */     super.m_8119_();
/*  85 */     TankCannonWhileBulletFlyingTickProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_());
/*  86 */     if (this.f_36703_)
/*  87 */       m_146870_(); 
/*     */   }
/*     */   
/*     */   public static TankCannonEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
/*  91 */     TankCannonEntity entityarrow = new TankCannonEntity((EntityType<? extends TankCannonEntity>)LatexModEntities.TANK_CANNON.get(), entity, world);
/*  92 */     entityarrow.m_6686_((entity.m_20252_(1.0F)).f_82479_, (entity.m_20252_(1.0F)).f_82480_, (entity.m_20252_(1.0F)).f_82481_, power * 2.0F, 0.0F);
/*  93 */     entityarrow.m_20225_(true);
/*  94 */     entityarrow.m_36762_(false);
/*  95 */     entityarrow.m_36781_(damage);
/*  96 */     entityarrow.m_36735_(knockback);
/*  97 */     world.m_7967_((Entity)entityarrow);
/*  98 */     world.m_6263_(null, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/*  99 */         .getValue(new ResourceLocation("turned:tank_shot")), SoundSource.PLAYERS, 1.0F, 1.0F / (random
/* 100 */         .nextFloat() * 0.5F + 1.0F) + power / 2.0F);
/* 101 */     return entityarrow;
/*     */   }
/*     */   
/*     */   public static TankCannonEntity shoot(LivingEntity entity, LivingEntity target) {
/* 105 */     TankCannonEntity entityarrow = new TankCannonEntity((EntityType<? extends TankCannonEntity>)LatexModEntities.TANK_CANNON.get(), entity, entity.f_19853_);
/* 106 */     double dx = target.m_20185_() - entity.m_20185_();
/* 107 */     double dy = target.m_20186_() + target.m_20192_() - 1.1D;
/* 108 */     double dz = target.m_20189_() - entity.m_20189_();
/* 109 */     entityarrow.m_6686_(dx, dy - entityarrow.m_20186_() + Math.hypot(dx, dz) * 0.20000000298023224D, dz, 20.0F, 12.0F);
/* 110 */     entityarrow.m_20225_(true);
/* 111 */     entityarrow.m_36781_(100.0D);
/* 112 */     entityarrow.m_36735_(5);
/* 113 */     entityarrow.m_36762_(false);
/* 114 */     entity.f_19853_.m_7967_((Entity)entityarrow);
/* 115 */     entity.f_19853_.m_6263_(null, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 116 */         .getValue(new ResourceLocation("turned:tank_shot")), SoundSource.PLAYERS, 1.0F, 1.0F / ((new Random())
/* 117 */         .nextFloat() * 0.5F + 1.0F));
/* 118 */     return entityarrow;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\TankCannonEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */