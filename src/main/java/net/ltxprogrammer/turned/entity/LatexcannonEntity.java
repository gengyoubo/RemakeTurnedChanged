/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import java.util.Random;
/*     */ import net.ltxprogrammer.changed.init.ChangedItems;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.procedures.LatexcannonBulletHitsBlockProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.LatexcannonBulletHitsPlayerProcedure;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.sounds.SoundSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.player.Player;
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
/*     */ public class LatexcannonEntity extends AbstractArrow implements ItemSupplier {
/*     */   public LatexcannonEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  33 */     super((EntityType)LatexModEntities.LATEXCANNON.get(), world);
/*     */   }
/*     */   
/*     */   public LatexcannonEntity(EntityType<? extends LatexcannonEntity> type, Level world) {
/*  37 */     super(type, world);
/*     */   }
/*     */   
/*     */   public LatexcannonEntity(EntityType<? extends LatexcannonEntity> type, double x, double y, double z, Level world) {
/*  41 */     super(type, x, y, z, world);
/*     */   }
/*     */   
/*     */   public LatexcannonEntity(EntityType<? extends LatexcannonEntity> type, LivingEntity entity, Level world) {
/*  45 */     super(type, entity, world);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  50 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public ItemStack m_7846_() {
/*  56 */     return new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get());
/*     */   }
/*     */ 
/*     */   
/*     */   protected ItemStack m_7941_() {
/*  61 */     return ItemStack.f_41583_;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_7761_(LivingEntity entity) {
/*  66 */     super.m_7761_(entity);
/*  67 */     entity.m_21317_(entity.m_21234_() - 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6123_(Player entity) {
/*  72 */     super.m_6123_(entity);
/*  73 */     LatexcannonBulletHitsPlayerProcedure.execute((Entity)entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_5790_(EntityHitResult entityHitResult) {
/*  78 */     super.m_5790_(entityHitResult);
/*  79 */     LatexcannonBulletHitsPlayerProcedure.execute(entityHitResult.m_82443_());
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_8060_(BlockHitResult blockHitResult) {
/*  84 */     super.m_8060_(blockHitResult);
/*  85 */     LatexcannonBulletHitsBlockProcedure.execute((LevelAccessor)this.f_19853_, blockHitResult.m_82425_().m_123341_(), blockHitResult.m_82425_().m_123342_(), blockHitResult
/*  86 */         .m_82425_().m_123343_());
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_8119_() {
/*  91 */     super.m_8119_();
/*  92 */     if (this.f_36703_)
/*  93 */       m_146870_(); 
/*     */   }
/*     */   
/*     */   public static LatexcannonEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
/*  97 */     LatexcannonEntity entityarrow = new LatexcannonEntity((EntityType<? extends LatexcannonEntity>)LatexModEntities.LATEXCANNON.get(), entity, world);
/*  98 */     entityarrow.m_6686_((entity.m_20252_(1.0F)).f_82479_, (entity.m_20252_(1.0F)).f_82480_, (entity.m_20252_(1.0F)).f_82481_, power * 2.0F, 0.0F);
/*  99 */     entityarrow.m_20225_(true);
/* 100 */     entityarrow.m_36762_(false);
/* 101 */     entityarrow.m_36781_(damage);
/* 102 */     entityarrow.m_36735_(knockback);
/* 103 */     world.m_7967_((Entity)entityarrow);
/* 104 */     world.m_6263_(null, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 105 */         .getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.PLAYERS, 1.0F, 1.0F / (random
/* 106 */         .nextFloat() * 0.5F + 1.0F) + power / 2.0F);
/* 107 */     return entityarrow;
/*     */   }
/*     */   
/*     */   public static LatexcannonEntity shoot(LivingEntity entity, LivingEntity target) {
/* 111 */     LatexcannonEntity entityarrow = new LatexcannonEntity((EntityType<? extends LatexcannonEntity>)LatexModEntities.LATEXCANNON.get(), entity, entity.f_19853_);
/* 112 */     double dx = target.m_20185_() - entity.m_20185_();
/* 113 */     double dy = target.m_20186_() + target.m_20192_() - 1.1D;
/* 114 */     double dz = target.m_20189_() - entity.m_20189_();
/* 115 */     entityarrow.m_6686_(dx, dy - entityarrow.m_20186_() + Math.hypot(dx, dz) * 0.20000000298023224D, dz, 2.0F, 12.0F);
/* 116 */     entityarrow.m_20225_(true);
/* 117 */     entityarrow.m_36781_(6.0D);
/* 118 */     entityarrow.m_36735_(2);
/* 119 */     entityarrow.m_36762_(false);
/* 120 */     entity.f_19853_.m_7967_((Entity)entityarrow);
/* 121 */     entity.f_19853_.m_6263_(null, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 122 */         .getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.PLAYERS, 1.0F, 1.0F / ((new Random())
/* 123 */         .nextFloat() * 0.5F + 1.0F));
/* 124 */     return entityarrow;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\LatexcannonEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */