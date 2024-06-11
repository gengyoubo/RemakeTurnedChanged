/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import java.util.Random;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.SneppleBulletHitsBlockProcedure;
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
/*     */   public Packet<?> getAddEntityPacket() {
/*  47 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public ItemStack getItem() {
/*  53 */     return new ItemStack((ItemLike)LatexModItems.SNEPPLE.get());
/*     */   }
/*     */ 
/*     */   
/*     */   protected ItemStack getPickupItem() {
/*  58 */     return new ItemStack((ItemLike)LatexModItems.SNEPPLE.get());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void doPostHurtEffects(LivingEntity entity) {
/*  63 */     super.doPostHurtEffects(entity);
/*  64 */     entity.setArrowCount(entity.getArrowCount() - 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onHitBlock(BlockHitResult blockHitResult) {
/*  69 */     super.onHitBlock(blockHitResult);
/*  70 */     SneppleBulletHitsBlockProcedure.execute((LevelAccessor)this.level, blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(), blockHitResult
/*  71 */         .getBlockPos().getZ());
/*     */   }
/*     */ 
/*     */   
/*     */   public void tick() {
/*  76 */     super.tick();
/*  77 */     if (this.inGround)
/*  78 */       discard(); 
/*     */   }
/*     */   
/*     */   public static SneppleEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
/*  82 */     SneppleEntity entityarrow = new SneppleEntity((EntityType<? extends SneppleEntity>)LatexModEntities.SNEPPLE.get(), entity, world);
/*  83 */     entityarrow.shoot((entity.getViewVector(1.0F)).x, (entity.getViewVector(1.0F)).y, (entity.getViewVector(1.0F)).z, power * 2.0F, 0.0F);
/*  84 */     entityarrow.setSilent(true);
/*  85 */     entityarrow.setCritArrow(false);
/*  86 */     entityarrow.setBaseDamage(damage);
/*  87 */     entityarrow.setKnockback(knockback);
/*  88 */     world.addFreshEntity((Entity)entityarrow);
/*  89 */     world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/*  90 */         .getValue(new ResourceLocation("entity.witch.throw")), SoundSource.PLAYERS, 1.0F, 1.0F / (random
/*  91 */         .nextFloat() * 0.5F + 1.0F) + power / 2.0F);
/*  92 */     return entityarrow;
/*     */   }
/*     */   
/*     */   public static SneppleEntity shoot(LivingEntity entity, LivingEntity target) {
/*  96 */     SneppleEntity entityarrow = new SneppleEntity((EntityType<? extends SneppleEntity>)LatexModEntities.SNEPPLE.get(), entity, entity.level);
/*  97 */     double dx = target.getX() - entity.getX();
/*  98 */     double dy = target.getY() + target.getEyeHeight() - 1.1D;
/*  99 */     double dz = target.getZ() - entity.getZ();
/* 100 */     entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.20000000298023224D, dz, 2.0F, 12.0F);
/* 101 */     entityarrow.setSilent(true);
/* 102 */     entityarrow.setBaseDamage(2.0D);
/* 103 */     entityarrow.setKnockback(1);
/* 104 */     entityarrow.setCritArrow(false);
/* 105 */     entity.level.addFreshEntity((Entity)entityarrow);
/* 106 */     entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 107 */         .getValue(new ResourceLocation("entity.witch.throw")), SoundSource.PLAYERS, 1.0F, 1.0F / ((new Random())
/* 108 */         .nextFloat() * 0.5F + 1.0F));
/* 109 */     return entityarrow;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\SneppleEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */