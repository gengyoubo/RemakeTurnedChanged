/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import java.util.Random;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.ExplosivegooProjectileHitsBlockProcedure;
/*     */ import net.mcreator.latexes.procedures.ExplosivegooProjectileHitsPlayerProcedure;
/*     */ import net.mcreator.latexes.procedures.ExplosivegooWhileProjectileFlyingTickProcedure;
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
/*     */ public class RevolvingGooCannonEntity extends AbstractArrow implements ItemSupplier {
/*     */   public RevolvingGooCannonEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  33 */     super((EntityType)LatexModEntities.REVOLVING_GOO_CANNON.get(), world);
/*     */   }
/*     */   
/*     */   public RevolvingGooCannonEntity(EntityType<? extends RevolvingGooCannonEntity> type, Level world) {
/*  37 */     super(type, world);
/*     */   }
/*     */   
/*     */   public RevolvingGooCannonEntity(EntityType<? extends RevolvingGooCannonEntity> type, double x, double y, double z, Level world) {
/*  41 */     super(type, x, y, z, world);
/*     */   }
/*     */   
/*     */   public RevolvingGooCannonEntity(EntityType<? extends RevolvingGooCannonEntity> type, LivingEntity entity, Level world) {
/*  45 */     super(type, entity, world);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  50 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public ItemStack getItem() {
/*  56 */     return new ItemStack((ItemLike)LatexModItems.BULLETICON.get());
/*     */   }
/*     */ 
/*     */   
/*     */   protected ItemStack getPickupItem() {
/*  61 */     return new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void doPostHurtEffects(LivingEntity entity) {
/*  66 */     super.doPostHurtEffects(entity);
/*  67 */     entity.setArrowCount(entity.getArrowCount() - 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onHitEntity(EntityHitResult entityHitResult) {
/*  72 */     super.onHitEntity(entityHitResult);
/*  73 */     ExplosivegooProjectileHitsPlayerProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), entityHitResult.getEntity());
/*     */   }
/*     */ 
/*     */   
/*     */   public void onHitBlock(BlockHitResult blockHitResult) {
/*  78 */     super.onHitBlock(blockHitResult);
/*  79 */     ExplosivegooProjectileHitsBlockProcedure.execute((LevelAccessor)this.level, blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(), blockHitResult
/*  80 */         .getBlockPos().getZ());
/*     */   }
/*     */ 
/*     */   
/*     */   public void tick() {
/*  85 */     super.tick();
/*  86 */     ExplosivegooWhileProjectileFlyingTickProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ());
/*  87 */     if (this.inGround)
/*  88 */       discard(); 
/*     */   }
/*     */   
/*     */   public static RevolvingGooCannonEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
/*  92 */     RevolvingGooCannonEntity entityarrow = new RevolvingGooCannonEntity((EntityType<? extends RevolvingGooCannonEntity>)LatexModEntities.REVOLVING_GOO_CANNON.get(), entity, world);
/*  93 */     entityarrow.shoot((entity.getViewVector(1.0F)).x, (entity.getViewVector(1.0F)).y, (entity.getViewVector(1.0F)).z, power * 2.0F, 0.0F);
/*  94 */     entityarrow.setSilent(true);
/*  95 */     entityarrow.setCritArrow(false);
/*  96 */     entityarrow.setBaseDamage(damage);
/*  97 */     entityarrow.setKnockback(knockback);
/*  98 */     world.addFreshEntity((Entity)entityarrow);
/*  99 */     world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 100 */         .getValue(new ResourceLocation("block.slime_block.hit")), SoundSource.PLAYERS, 1.0F, 1.0F / (random
/* 101 */         .nextFloat() * 0.5F + 1.0F) + power / 2.0F);
/* 102 */     return entityarrow;
/*     */   }
/*     */   
/*     */   public static RevolvingGooCannonEntity shoot(LivingEntity entity, LivingEntity target) {
/* 106 */     RevolvingGooCannonEntity entityarrow = new RevolvingGooCannonEntity((EntityType<? extends RevolvingGooCannonEntity>)LatexModEntities.REVOLVING_GOO_CANNON.get(), entity, entity.level);
/* 107 */     double dx = target.getX() - entity.getX();
/* 108 */     double dy = target.getY() + target.getEyeHeight() - 1.1D;
/* 109 */     double dz = target.getZ() - entity.getZ();
/* 110 */     entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.20000000298023224D, dz, 2.4F, 12.0F);
/* 111 */     entityarrow.setSilent(true);
/* 112 */     entityarrow.setBaseDamage(0.6D);
/* 113 */     entityarrow.setKnockback(1);
/* 114 */     entityarrow.setCritArrow(false);
/* 115 */     entity.level.addFreshEntity((Entity)entityarrow);
/* 116 */     entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 117 */         .getValue(new ResourceLocation("block.slime_block.hit")), SoundSource.PLAYERS, 1.0F, 1.0F / ((new Random())
/* 118 */         .nextFloat() * 0.5F + 1.0F));
/* 119 */     return entityarrow;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\RevolvingGooCannonEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */