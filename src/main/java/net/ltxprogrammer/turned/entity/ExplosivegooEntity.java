/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import java.util.Random;
/*     */ import net.ltxprogrammer.changed.init.ChangedItems;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.init.LatexModItems;
/*     */ import net.ltxprogrammer.turned.procedures.ExplosivegooProjectileHitsBlockProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.ExplosivegooProjectileHitsPlayerProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.ExplosivegooWhileProjectileFlyingTickProcedure;
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
/*     */ import net.minecraft.world.phys.EntityHitResult;
/*     */ import net.minecraftforge.api.distmarker.Dist;
/*     */ import net.minecraftforge.api.distmarker.OnlyIn;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ @OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
/*     */ public class ExplosivegooEntity extends AbstractArrow implements ItemSupplier {
/*     */   public ExplosivegooEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  34 */     super((EntityType)LatexModEntities.EXPLOSIVEGOO.get(), world);
/*     */   }
/*     */   
/*     */   public ExplosivegooEntity(EntityType<? extends ExplosivegooEntity> type, Level world) {
/*  38 */     super(type, world);
/*     */   }
/*     */   
/*     */   public ExplosivegooEntity(EntityType<? extends ExplosivegooEntity> type, double x, double y, double z, Level world) {
/*  42 */     super(type, x, y, z, world);
/*     */   }
/*     */   
/*     */   public ExplosivegooEntity(EntityType<? extends ExplosivegooEntity> type, LivingEntity entity, Level world) {
/*  46 */     super(type, entity, world);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  51 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public ItemStack m_7846_() {
/*  57 */     return new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get());
/*     */   }
/*     */ 
/*     */   
/*     */   protected ItemStack m_7941_() {
/*  62 */     return new ItemStack((ItemLike)LatexModItems.EXPLOSIVEGOO.get());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_7761_(LivingEntity entity) {
/*  67 */     super.m_7761_(entity);
/*  68 */     entity.m_21317_(entity.m_21234_() - 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_5790_(EntityHitResult entityHitResult) {
/*  73 */     super.m_5790_(entityHitResult);
/*  74 */     ExplosivegooProjectileHitsPlayerProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), entityHitResult.m_82443_());
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_8060_(BlockHitResult blockHitResult) {
/*  79 */     super.m_8060_(blockHitResult);
/*  80 */     ExplosivegooProjectileHitsBlockProcedure.execute((LevelAccessor)this.f_19853_, blockHitResult.m_82425_().m_123341_(), blockHitResult.m_82425_().m_123342_(), blockHitResult
/*  81 */         .m_82425_().m_123343_());
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_8119_() {
/*  86 */     super.m_8119_();
/*  87 */     ExplosivegooWhileProjectileFlyingTickProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_());
/*  88 */     if (this.f_36703_)
/*  89 */       m_146870_(); 
/*     */   }
/*     */   
/*     */   public static ExplosivegooEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
/*  93 */     ExplosivegooEntity entityarrow = new ExplosivegooEntity((EntityType<? extends ExplosivegooEntity>)LatexModEntities.EXPLOSIVEGOO.get(), entity, world);
/*  94 */     entityarrow.m_6686_((entity.m_20252_(1.0F)).f_82479_, (entity.m_20252_(1.0F)).f_82480_, (entity.m_20252_(1.0F)).f_82481_, power * 2.0F, 0.0F);
/*  95 */     entityarrow.m_20225_(true);
/*  96 */     entityarrow.m_36762_(false);
/*  97 */     entityarrow.m_36781_(damage);
/*  98 */     entityarrow.m_36735_(knockback);
/*  99 */     world.m_7967_((Entity)entityarrow);
/* 100 */     world.m_6263_(null, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 101 */         .getValue(new ResourceLocation("entity.slime.squish")), SoundSource.PLAYERS, 1.0F, 1.0F / (random
/* 102 */         .nextFloat() * 0.5F + 1.0F) + power / 2.0F);
/* 103 */     return entityarrow;
/*     */   }
/*     */   
/*     */   public static ExplosivegooEntity shoot(LivingEntity entity, LivingEntity target) {
/* 107 */     ExplosivegooEntity entityarrow = new ExplosivegooEntity((EntityType<? extends ExplosivegooEntity>)LatexModEntities.EXPLOSIVEGOO.get(), entity, entity.f_19853_);
/* 108 */     double dx = target.m_20185_() - entity.m_20185_();
/* 109 */     double dy = target.m_20186_() + target.m_20192_() - 1.1D;
/* 110 */     double dz = target.m_20189_() - entity.m_20189_();
/* 111 */     entityarrow.m_6686_(dx, dy - entityarrow.m_20186_() + Math.hypot(dx, dz) * 0.20000000298023224D, dz, 1.0F, 12.0F);
/* 112 */     entityarrow.m_20225_(true);
/* 113 */     entityarrow.m_36781_(0.5D);
/* 114 */     entityarrow.m_36735_(2);
/* 115 */     entityarrow.m_36762_(false);
/* 116 */     entity.f_19853_.m_7967_((Entity)entityarrow);
/* 117 */     entity.f_19853_.m_6263_(null, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 118 */         .getValue(new ResourceLocation("entity.slime.squish")), SoundSource.PLAYERS, 1.0F, 1.0F / ((new Random())
/* 119 */         .nextFloat() * 0.5F + 1.0F));
/* 120 */     return entityarrow;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\ExplosivegooEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */