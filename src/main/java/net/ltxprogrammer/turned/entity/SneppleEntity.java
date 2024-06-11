/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import java.util.Random;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.init.LatexModItems;
/*     */ import net.ltxprogrammer.turned.procedures.SneppleBulletHitsBlockProcedure;
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
/*     */ import net.minecraft.world.phys.BlockHitResult;
/*     */ import net.minecraftforge.api.distmarker.Dist;
/*     */ import net.minecraftforge.api.distmarker.OnlyIn;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ @OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
/*     */ public class SneppleEntity extends AbstractArrow implements ItemSupplier {
/*     */   public SneppleEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  30 */     super((EntityType)LatexModEntities.SNEPPLE.get(), world);
/*     */   }
/*     */   
/*     */   public SneppleEntity(EntityType<? extends SneppleEntity> type, Level world) {
/*  34 */     super(type, world);
/*     */   }
/*     */   
/*     */   public SneppleEntity(EntityType<? extends SneppleEntity> type, double x, double y, double z, Level world) {
/*  38 */     super(type, x, y, z, world);
/*     */   }
/*     */   
/*     */   public SneppleEntity(EntityType<? extends SneppleEntity> type, LivingEntity entity, Level world) {
/*  42 */     super(type, entity, world);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  47 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public ItemStack m_7846_() {
/*  53 */     return new ItemStack((ItemLike)LatexModItems.SNEPPLE.get());
/*     */   }
/*     */ 
/*     */   
/*     */   protected ItemStack m_7941_() {
/*  58 */     return new ItemStack((ItemLike)LatexModItems.SNEPPLE.get());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_7761_(LivingEntity entity) {
/*  63 */     super.m_7761_(entity);
/*  64 */     entity.m_21317_(entity.m_21234_() - 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_8060_(BlockHitResult blockHitResult) {
/*  69 */     super.m_8060_(blockHitResult);
/*  70 */     SneppleBulletHitsBlockProcedure.execute((LevelAccessor)this.f_19853_, blockHitResult.m_82425_().m_123341_(), blockHitResult.m_82425_().m_123342_(), blockHitResult
/*  71 */         .m_82425_().m_123343_());
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_8119_() {
/*  76 */     super.m_8119_();
/*  77 */     if (this.f_36703_)
/*  78 */       m_146870_(); 
/*     */   }
/*     */   
/*     */   public static SneppleEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
/*  82 */     SneppleEntity entityarrow = new SneppleEntity((EntityType<? extends SneppleEntity>)LatexModEntities.SNEPPLE.get(), entity, world);
/*  83 */     entityarrow.m_6686_((entity.m_20252_(1.0F)).f_82479_, (entity.m_20252_(1.0F)).f_82480_, (entity.m_20252_(1.0F)).f_82481_, power * 2.0F, 0.0F);
/*  84 */     entityarrow.m_20225_(true);
/*  85 */     entityarrow.m_36762_(false);
/*  86 */     entityarrow.m_36781_(damage);
/*  87 */     entityarrow.m_36735_(knockback);
/*  88 */     world.m_7967_((Entity)entityarrow);
/*  89 */     world.m_6263_(null, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/*  90 */         .getValue(new ResourceLocation("entity.witch.throw")), SoundSource.PLAYERS, 1.0F, 1.0F / (random
/*  91 */         .nextFloat() * 0.5F + 1.0F) + power / 2.0F);
/*  92 */     return entityarrow;
/*     */   }
/*     */   
/*     */   public static SneppleEntity shoot(LivingEntity entity, LivingEntity target) {
/*  96 */     SneppleEntity entityarrow = new SneppleEntity((EntityType<? extends SneppleEntity>)LatexModEntities.SNEPPLE.get(), entity, entity.f_19853_);
/*  97 */     double dx = target.m_20185_() - entity.m_20185_();
/*  98 */     double dy = target.m_20186_() + target.m_20192_() - 1.1D;
/*  99 */     double dz = target.m_20189_() - entity.m_20189_();
/* 100 */     entityarrow.m_6686_(dx, dy - entityarrow.m_20186_() + Math.hypot(dx, dz) * 0.20000000298023224D, dz, 2.0F, 12.0F);
/* 101 */     entityarrow.m_20225_(true);
/* 102 */     entityarrow.m_36781_(2.0D);
/* 103 */     entityarrow.m_36735_(1);
/* 104 */     entityarrow.m_36762_(false);
/* 105 */     entity.f_19853_.m_7967_((Entity)entityarrow);
/* 106 */     entity.f_19853_.m_6263_(null, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 107 */         .getValue(new ResourceLocation("entity.witch.throw")), SoundSource.PLAYERS, 1.0F, 1.0F / ((new Random())
/* 108 */         .nextFloat() * 0.5F + 1.0F));
/* 109 */     return entityarrow;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\SneppleEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */