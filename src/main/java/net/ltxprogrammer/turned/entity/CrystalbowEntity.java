/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import java.util.Random;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.init.LatexModItems;
/*     */ import net.ltxprogrammer.turned.procedures.CrystalbowBulletHitsPlayerProcedure;
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
/*     */ import net.minecraft.world.phys.EntityHitResult;
/*     */ import net.minecraftforge.api.distmarker.Dist;
/*     */ import net.minecraftforge.api.distmarker.OnlyIn;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ @OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
/*     */ public class CrystalbowEntity
/*     */   extends AbstractArrow implements ItemSupplier {
/*     */   public CrystalbowEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  30 */     super((EntityType)LatexModEntities.CRYSTALBOW.get(), world);
/*     */   }
/*     */   
/*     */   public CrystalbowEntity(EntityType<? extends CrystalbowEntity> type, Level world) {
/*  34 */     super(type, world);
/*     */   }
/*     */   
/*     */   public CrystalbowEntity(EntityType<? extends CrystalbowEntity> type, double x, double y, double z, Level world) {
/*  38 */     super(type, x, y, z, world);
/*     */   }
/*     */   
/*     */   public CrystalbowEntity(EntityType<? extends CrystalbowEntity> type, LivingEntity entity, Level world) {
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
/*  53 */     return ItemStack.f_41583_;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ItemStack m_7941_() {
/*  58 */     return new ItemStack((ItemLike)LatexModItems.CRYSTALARROW.get());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_7761_(LivingEntity entity) {
/*  63 */     super.m_7761_(entity);
/*  64 */     entity.m_21317_(entity.m_21234_() - 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_5790_(EntityHitResult entityHitResult) {
/*  69 */     super.m_5790_(entityHitResult);
/*  70 */     CrystalbowBulletHitsPlayerProcedure.execute(entityHitResult.m_82443_());
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_8119_() {
/*  75 */     super.m_8119_();
/*  76 */     if (this.f_36703_)
/*  77 */       m_146870_(); 
/*     */   }
/*     */   
/*     */   public static CrystalbowEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
/*  81 */     CrystalbowEntity entityarrow = new CrystalbowEntity((EntityType<? extends CrystalbowEntity>)LatexModEntities.CRYSTALBOW.get(), entity, world);
/*  82 */     entityarrow.m_6686_((entity.m_20252_(1.0F)).f_82479_, (entity.m_20252_(1.0F)).f_82480_, (entity.m_20252_(1.0F)).f_82481_, power * 2.0F, 0.0F);
/*  83 */     entityarrow.m_20225_(true);
/*  84 */     entityarrow.m_36762_(false);
/*  85 */     entityarrow.m_36781_(damage);
/*  86 */     entityarrow.m_36735_(knockback);
/*  87 */     world.m_7967_((Entity)entityarrow);
/*  88 */     world.m_6263_(null, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/*  89 */         .getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1.0F, 1.0F / (random
/*  90 */         .nextFloat() * 0.5F + 1.0F) + power / 2.0F);
/*  91 */     return entityarrow;
/*     */   }
/*     */   
/*     */   public static CrystalbowEntity shoot(LivingEntity entity, LivingEntity target) {
/*  95 */     CrystalbowEntity entityarrow = new CrystalbowEntity((EntityType<? extends CrystalbowEntity>)LatexModEntities.CRYSTALBOW.get(), entity, entity.f_19853_);
/*  96 */     double dx = target.m_20185_() - entity.m_20185_();
/*  97 */     double dy = target.m_20186_() + target.m_20192_() - 1.1D;
/*  98 */     double dz = target.m_20189_() - entity.m_20189_();
/*  99 */     entityarrow.m_6686_(dx, dy - entityarrow.m_20186_() + Math.hypot(dx, dz) * 0.20000000298023224D, dz, 3.0F, 12.0F);
/* 100 */     entityarrow.m_20225_(true);
/* 101 */     entityarrow.m_36781_(1.5D);
/* 102 */     entityarrow.m_36735_(0);
/* 103 */     entityarrow.m_36762_(false);
/* 104 */     entity.f_19853_.m_7967_((Entity)entityarrow);
/* 105 */     entity.f_19853_.m_6263_(null, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 106 */         .getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1.0F, 1.0F / ((new Random())
/* 107 */         .nextFloat() * 0.5F + 1.0F));
/* 108 */     return entityarrow;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\CrystalbowEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */