/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import java.util.Random;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.procedures.FlamethowerBulletHitsBlockProcedure;
/*     */ import net.mcreator.latexes.procedures.FlamethowerWhileBulletFlyingTickProcedure;
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
/*     */   public Packet<?> getAddEntityPacket() {
/*  48 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public ItemStack getItem() {
/*  54 */     return new ItemStack((ItemLike)Blocks.FIRE);
/*     */   }
/*     */ 
/*     */   
/*     */   protected ItemStack getPickupItem() {
/*  59 */     return ItemStack.EMPTY;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void doPostHurtEffects(LivingEntity entity) {
/*  64 */     super.doPostHurtEffects(entity);
/*  65 */     entity.setArrowCount(entity.getArrowCount() - 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onHitBlock(BlockHitResult blockHitResult) {
/*  70 */     super.onHitBlock(blockHitResult);
/*  71 */     FlamethowerBulletHitsBlockProcedure.execute((LevelAccessor)this.level, blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(), blockHitResult
/*  72 */         .getBlockPos().getZ());
/*     */   }
/*     */ 
/*     */   
/*     */   public void tick() {
/*  77 */     super.tick();
/*  78 */     FlamethowerWhileBulletFlyingTickProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ());
/*  79 */     if (this.inGround)
/*  80 */       discard(); 
/*     */   }
/*     */   
/*     */   public static FlamethowerEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
/*  84 */     FlamethowerEntity entityarrow = new FlamethowerEntity((EntityType<? extends FlamethowerEntity>)LatexModEntities.FLAMETHOWER.get(), entity, world);
/*  85 */     entityarrow.shoot((entity.getViewVector(1.0F)).x, (entity.getViewVector(1.0F)).y, (entity.getViewVector(1.0F)).z, power * 2.0F, 0.0F);
/*  86 */     entityarrow.setSilent(true);
/*  87 */     entityarrow.setCritArrow(false);
/*  88 */     entityarrow.setBaseDamage(damage);
/*  89 */     entityarrow.setKnockback(knockback);
/*  90 */     entityarrow.setSecondsOnFire(100);
/*  91 */     world.addFreshEntity((Entity)entityarrow);
/*  92 */     world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/*  93 */         .getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.PLAYERS, 1.0F, 1.0F / (random
/*  94 */         .nextFloat() * 0.5F + 1.0F) + power / 2.0F);
/*  95 */     return entityarrow;
/*     */   }
/*     */   
/*     */   public static FlamethowerEntity shoot(LivingEntity entity, LivingEntity target) {
/*  99 */     FlamethowerEntity entityarrow = new FlamethowerEntity((EntityType<? extends FlamethowerEntity>)LatexModEntities.FLAMETHOWER.get(), entity, entity.level);
/* 100 */     double dx = target.getX() - entity.getX();
/* 101 */     double dy = target.getY() + target.getEyeHeight() - 1.1D;
/* 102 */     double dz = target.getZ() - entity.getZ();
/* 103 */     entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.20000000298023224D, dz, 3.0F, 12.0F);
/* 104 */     entityarrow.setSilent(true);
/* 105 */     entityarrow.setBaseDamage(5.0D);
/* 106 */     entityarrow.setKnockback(0);
/* 107 */     entityarrow.setCritArrow(false);
/* 108 */     entityarrow.setSecondsOnFire(100);
/* 109 */     entity.level.addFreshEntity((Entity)entityarrow);
/* 110 */     entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 111 */         .getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.PLAYERS, 1.0F, 1.0F / ((new Random())
/* 112 */         .nextFloat() * 0.5F + 1.0F));
/* 113 */     return entityarrow;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\FlamethowerEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */