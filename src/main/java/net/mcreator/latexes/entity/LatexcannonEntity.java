/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import java.util.Random;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.LatexcannonBulletHitsBlockProcedure;
/*     */ import net.mcreator.latexes.procedures.LatexcannonBulletHitsPlayerProcedure;
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
/*     */   public Packet<?> getAddEntityPacket() {
/*  50 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public ItemStack getItem() {
/*  56 */     return new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get());
/*     */   }
/*     */ 
/*     */   
/*     */   protected ItemStack getPickupItem() {
/*  61 */     return ItemStack.EMPTY;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void doPostHurtEffects(LivingEntity entity) {
/*  66 */     super.doPostHurtEffects(entity);
/*  67 */     entity.setArrowCount(entity.getArrowCount() - 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void playerTouch(Player entity) {
/*  72 */     super.playerTouch(entity);
/*  73 */     LatexcannonBulletHitsPlayerProcedure.execute((Entity)entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onHitEntity(EntityHitResult entityHitResult) {
/*  78 */     super.onHitEntity(entityHitResult);
/*  79 */     LatexcannonBulletHitsPlayerProcedure.execute(entityHitResult.getEntity());
/*     */   }
/*     */ 
/*     */   
/*     */   public void onHitBlock(BlockHitResult blockHitResult) {
/*  84 */     super.onHitBlock(blockHitResult);
/*  85 */     LatexcannonBulletHitsBlockProcedure.execute((LevelAccessor)this.level, blockHitResult.getBlockPos().getX(), blockHitResult.getBlockPos().getY(), blockHitResult
/*  86 */         .getBlockPos().getZ());
/*     */   }
/*     */ 
/*     */   
/*     */   public void tick() {
/*  91 */     super.tick();
/*  92 */     if (this.inGround)
/*  93 */       discard(); 
/*     */   }
/*     */   
/*     */   public static LatexcannonEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
/*  97 */     LatexcannonEntity entityarrow = new LatexcannonEntity((EntityType<? extends LatexcannonEntity>)LatexModEntities.LATEXCANNON.get(), entity, world);
/*  98 */     entityarrow.shoot((entity.getViewVector(1.0F)).x, (entity.getViewVector(1.0F)).y, (entity.getViewVector(1.0F)).z, power * 2.0F, 0.0F);
/*  99 */     entityarrow.setSilent(true);
/* 100 */     entityarrow.setCritArrow(false);
/* 101 */     entityarrow.setBaseDamage(damage);
/* 102 */     entityarrow.setKnockback(knockback);
/* 103 */     world.addFreshEntity((Entity)entityarrow);
/* 104 */     world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 105 */         .getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.PLAYERS, 1.0F, 1.0F / (random
/* 106 */         .nextFloat() * 0.5F + 1.0F) + power / 2.0F);
/* 107 */     return entityarrow;
/*     */   }
/*     */   
/*     */   public static LatexcannonEntity shoot(LivingEntity entity, LivingEntity target) {
/* 111 */     LatexcannonEntity entityarrow = new LatexcannonEntity((EntityType<? extends LatexcannonEntity>)LatexModEntities.LATEXCANNON.get(), entity, entity.level);
/* 112 */     double dx = target.getX() - entity.getX();
/* 113 */     double dy = target.getY() + target.getEyeHeight() - 1.1D;
/* 114 */     double dz = target.getZ() - entity.getZ();
/* 115 */     entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.20000000298023224D, dz, 2.0F, 12.0F);
/* 116 */     entityarrow.setSilent(true);
/* 117 */     entityarrow.setBaseDamage(6.0D);
/* 118 */     entityarrow.setKnockback(2);
/* 119 */     entityarrow.setCritArrow(false);
/* 120 */     entity.level.addFreshEntity((Entity)entityarrow);
/* 121 */     entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 122 */         .getValue(new ResourceLocation("entity.blaze.shoot")), SoundSource.PLAYERS, 1.0F, 1.0F / ((new Random())
/* 123 */         .nextFloat() * 0.5F + 1.0F));
/* 124 */     return entityarrow;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\LatexcannonEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */