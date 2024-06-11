/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import java.util.Random;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.TSCPistolWhileBulletFlyingTickProcedure;
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
/*     */   public Packet<?> getAddEntityPacket() {
/*  46 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public ItemStack getItem() {
/*  52 */     return new ItemStack((ItemLike)LatexModItems.BULLETICON.get());
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
/*     */   public void tick() {
/*  68 */     super.tick();
/*  69 */     TSCPistolWhileBulletFlyingTickProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ());
/*  70 */     if (this.inGround)
/*  71 */       discard(); 
/*     */   }
/*     */   
/*     */   public static TSCPistolEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
/*  75 */     TSCPistolEntity entityarrow = new TSCPistolEntity((EntityType<? extends TSCPistolEntity>)LatexModEntities.TSC_PISTOL.get(), entity, world);
/*  76 */     entityarrow.shoot((entity.getViewVector(1.0F)).x, (entity.getViewVector(1.0F)).y, (entity.getViewVector(1.0F)).z, power * 2.0F, 0.0F);
/*  77 */     entityarrow.setSilent(true);
/*  78 */     entityarrow.setCritArrow(false);
/*  79 */     entityarrow.setBaseDamage(damage);
/*  80 */     entityarrow.setKnockback(knockback);
/*  81 */     world.addFreshEntity((Entity)entityarrow);
/*  82 */     world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/*  83 */         .getValue(new ResourceLocation("latex:gunshot")), SoundSource.PLAYERS, 1.0F, 1.0F / (random
/*  84 */         .nextFloat() * 0.5F + 1.0F) + power / 2.0F);
/*  85 */     return entityarrow;
/*     */   }
/*     */   
/*     */   public static TSCPistolEntity shoot(LivingEntity entity, LivingEntity target) {
/*  89 */     TSCPistolEntity entityarrow = new TSCPistolEntity((EntityType<? extends TSCPistolEntity>)LatexModEntities.TSC_PISTOL.get(), entity, entity.level);
/*  90 */     double dx = target.getX() - entity.getX();
/*  91 */     double dy = target.getY() + target.getEyeHeight() - 1.1D;
/*  92 */     double dz = target.getZ() - entity.getZ();
/*  93 */     entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.20000000298023224D, dz, 6.0F, 12.0F);
/*  94 */     entityarrow.setSilent(true);
/*  95 */     entityarrow.setBaseDamage(3.0D);
/*  96 */     entityarrow.setKnockback(1);
/*  97 */     entityarrow.setCritArrow(false);
/*  98 */     entity.level.addFreshEntity((Entity)entityarrow);
/*  99 */     entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 100 */         .getValue(new ResourceLocation("latex:gunshot")), SoundSource.PLAYERS, 1.0F, 1.0F / ((new Random())
/* 101 */         .nextFloat() * 0.5F + 1.0F));
/* 102 */     return entityarrow;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\TSCPistolEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */