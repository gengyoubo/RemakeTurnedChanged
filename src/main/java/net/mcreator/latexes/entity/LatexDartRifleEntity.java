/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import java.util.Random;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.procedures.DartrifleBulletHitsLivingEntityProcedure;
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
/*     */   public Packet<?> getAddEntityPacket() {
/*  46 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public ItemStack getItem() {
/*  52 */     return ItemStack.EMPTY;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ItemStack getPickupItem() {
/*  57 */     return ItemStack.EMPTY;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void doPostHurtEffects(LivingEntity entity) {
/*  62 */     super.doPostHurtEffects(entity);
/*  63 */     entity.setArrowCount(entity.getArrowCount() - 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onHitEntity(EntityHitResult entityHitResult) {
/*  68 */     super.onHitEntity(entityHitResult);
/*  69 */     DartrifleBulletHitsLivingEntityProcedure.execute(entityHitResult.getEntity());
/*     */   }
/*     */ 
/*     */   
/*     */   public void tick() {
/*  74 */     super.tick();
/*  75 */     if (this.inGround)
/*  76 */       discard(); 
/*     */   }
/*     */   
/*     */   public static LatexDartRifleEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
/*  80 */     LatexDartRifleEntity entityarrow = new LatexDartRifleEntity((EntityType<? extends LatexDartRifleEntity>)LatexModEntities.LATEX_DART_RIFLE.get(), entity, world);
/*  81 */     entityarrow.shoot((entity.getViewVector(1.0F)).x, (entity.getViewVector(1.0F)).y, (entity.getViewVector(1.0F)).z, power * 2.0F, 0.0F);
/*  82 */     entityarrow.setSilent(true);
/*  83 */     entityarrow.setCritArrow(false);
/*  84 */     entityarrow.setBaseDamage(damage);
/*  85 */     entityarrow.setKnockback(knockback);
/*  86 */     world.addFreshEntity((Entity)entityarrow);
/*  87 */     world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/*  88 */         .getValue(new ResourceLocation("latex:dart_shot")), SoundSource.PLAYERS, 1.0F, 1.0F / (random
/*  89 */         .nextFloat() * 0.5F + 1.0F) + power / 2.0F);
/*  90 */     return entityarrow;
/*     */   }
/*     */   
/*     */   public static LatexDartRifleEntity shoot(LivingEntity entity, LivingEntity target) {
/*  94 */     LatexDartRifleEntity entityarrow = new LatexDartRifleEntity((EntityType<? extends LatexDartRifleEntity>)LatexModEntities.LATEX_DART_RIFLE.get(), entity, entity.level);
/*  95 */     double dx = target.getX() - entity.getX();
/*  96 */     double dy = target.getY() + target.getEyeHeight() - 1.1D;
/*  97 */     double dz = target.getZ() - entity.getZ();
/*  98 */     entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.20000000298023224D, dz, 5.0F, 12.0F);
/*  99 */     entityarrow.setSilent(true);
/* 100 */     entityarrow.setBaseDamage(1.5D);
/* 101 */     entityarrow.setKnockback(0);
/* 102 */     entityarrow.setCritArrow(false);
/* 103 */     entity.level.addFreshEntity((Entity)entityarrow);
/* 104 */     entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 105 */         .getValue(new ResourceLocation("latex:dart_shot")), SoundSource.PLAYERS, 1.0F, 1.0F / ((new Random())
/* 106 */         .nextFloat() * 0.5F + 1.0F));
/* 107 */     return entityarrow;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\LatexDartRifleEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */