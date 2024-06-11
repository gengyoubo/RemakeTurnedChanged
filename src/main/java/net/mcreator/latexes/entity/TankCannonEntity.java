/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import java.util.Random;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.procedures.TankCannonBulletHitsBlockProcedure;
/*     */ import net.mcreator.latexes.procedures.TankCannonWhileBulletFlyingTickProcedure;
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
/*     */   public Packet<?> getAddEntityPacket() {
/*  49 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public ItemStack getItem() {
/*  55 */     return new ItemStack((ItemLike)Blocks.TNT);
/*     */   }
/*     */ 
/*     */   
/*     */   protected ItemStack getPickupItem() {
/*  60 */     return new ItemStack((ItemLike)Blocks.TNT);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void doPostHurtEffects(LivingEntity entity) {
/*  65 */     super.doPostHurtEffects(entity);
/*  66 */     entity.setArrowCount(entity.getArrowCount() - 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onHitEntity(EntityHitResult entityHitResult) {
/*  71 */     super.onHitEntity(entityHitResult);
/*  72 */     TankCannonBulletHitsBlockProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), entityHitResult.getEntity());
/*     */   }
/*     */ 
/*     */   
/*     */   public void onHitBlock(BlockHitResult blockHitResult) {
/*  77 */     super.onHitBlock(blockHitResult);
/*  78 */     TankCannonBulletHitsBlockProcedure.execute((LevelAccessor)this.level, blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(), blockHitResult
/*  79 */         .getBlockPos().getZ(), getOwner());
/*     */   }
/*     */ 
/*     */   
/*     */   public void tick() {
/*  84 */     super.tick();
/*  85 */     TankCannonWhileBulletFlyingTickProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ());
/*  86 */     if (this.inGround)
/*  87 */       discard(); 
/*     */   }
/*     */   
/*     */   public static TankCannonEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
/*  91 */     TankCannonEntity entityarrow = new TankCannonEntity((EntityType<? extends TankCannonEntity>)LatexModEntities.TANK_CANNON.get(), entity, world);
/*  92 */     entityarrow.shoot((entity.getViewVector(1.0F)).x, (entity.getViewVector(1.0F)).y, (entity.getViewVector(1.0F)).z, power * 2.0F, 0.0F);
/*  93 */     entityarrow.setSilent(true);
/*  94 */     entityarrow.setCritArrow(false);
/*  95 */     entityarrow.setBaseDamage(damage);
/*  96 */     entityarrow.setKnockback(knockback);
/*  97 */     world.addFreshEntity((Entity)entityarrow);
/*  98 */     world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/*  99 */         .getValue(new ResourceLocation("latex:tank_shot")), SoundSource.PLAYERS, 1.0F, 1.0F / (random
/* 100 */         .nextFloat() * 0.5F + 1.0F) + power / 2.0F);
/* 101 */     return entityarrow;
/*     */   }
/*     */   
/*     */   public static TankCannonEntity shoot(LivingEntity entity, LivingEntity target) {
/* 105 */     TankCannonEntity entityarrow = new TankCannonEntity((EntityType<? extends TankCannonEntity>)LatexModEntities.TANK_CANNON.get(), entity, entity.level);
/* 106 */     double dx = target.getX() - entity.getX();
/* 107 */     double dy = target.getY() + target.getEyeHeight() - 1.1D;
/* 108 */     double dz = target.getZ() - entity.getZ();
/* 109 */     entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.20000000298023224D, dz, 20.0F, 12.0F);
/* 110 */     entityarrow.setSilent(true);
/* 111 */     entityarrow.setBaseDamage(100.0D);
/* 112 */     entityarrow.setKnockback(5);
/* 113 */     entityarrow.setCritArrow(false);
/* 114 */     entity.level.addFreshEntity((Entity)entityarrow);
/* 115 */     entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 116 */         .getValue(new ResourceLocation("latex:tank_shot")), SoundSource.PLAYERS, 1.0F, 1.0F / ((new Random())
/* 117 */         .nextFloat() * 0.5F + 1.0F));
/* 118 */     return entityarrow;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\TankCannonEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */