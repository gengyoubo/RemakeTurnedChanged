/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import java.util.Random;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.CrystalbowBulletHitsPlayerProcedure;
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
/*     */   public Packet<?> getAddEntityPacket() {
/*  47 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public ItemStack getItem() {
/*  53 */     return ItemStack.EMPTY;
/*     */   }
/*     */ 
/*     */   
/*     */   protected ItemStack getPickupItem() {
/*  58 */     return new ItemStack((ItemLike)LatexModItems.CRYSTALARROW.get());
/*     */   }
/*     */ 
/*     */   
/*     */   protected void doPostHurtEffects(LivingEntity entity) {
/*  63 */     super.doPostHurtEffects(entity);
/*  64 */     entity.setArrowCount(entity.getArrowCount() - 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void onHitEntity(EntityHitResult entityHitResult) {
/*  69 */     super.onHitEntity(entityHitResult);
/*  70 */     CrystalbowBulletHitsPlayerProcedure.execute(entityHitResult.getEntity());
/*     */   }
/*     */ 
/*     */   
/*     */   public void tick() {
/*  75 */     super.tick();
/*  76 */     if (this.inGround)
/*  77 */       discard(); 
/*     */   }
/*     */   
/*     */   public static CrystalbowEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
/*  81 */     CrystalbowEntity entityarrow = new CrystalbowEntity((EntityType<? extends CrystalbowEntity>)LatexModEntities.CRYSTALBOW.get(), entity, world);
/*  82 */     entityarrow.shoot((entity.getViewVector(1.0F)).x, (entity.getViewVector(1.0F)).y, (entity.getViewVector(1.0F)).z, power * 2.0F, 0.0F);
/*  83 */     entityarrow.setSilent(true);
/*  84 */     entityarrow.setCritArrow(false);
/*  85 */     entityarrow.setBaseDamage(damage);
/*  86 */     entityarrow.setKnockback(knockback);
/*  87 */     world.addFreshEntity((Entity)entityarrow);
/*  88 */     world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/*  89 */         .getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1.0F, 1.0F / (random
/*  90 */         .nextFloat() * 0.5F + 1.0F) + power / 2.0F);
/*  91 */     return entityarrow;
/*     */   }
/*     */   
/*     */   public static CrystalbowEntity shoot(LivingEntity entity, LivingEntity target) {
/*  95 */     CrystalbowEntity entityarrow = new CrystalbowEntity((EntityType<? extends CrystalbowEntity>)LatexModEntities.CRYSTALBOW.get(), entity, entity.level);
/*  96 */     double dx = target.getX() - entity.getX();
/*  97 */     double dy = target.getY() + target.getEyeHeight() - 1.1D;
/*  98 */     double dz = target.getZ() - entity.getZ();
/*  99 */     entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.20000000298023224D, dz, 3.0F, 12.0F);
/* 100 */     entityarrow.setSilent(true);
/* 101 */     entityarrow.setBaseDamage(1.5D);
/* 102 */     entityarrow.setKnockback(0);
/* 103 */     entityarrow.setCritArrow(false);
/* 104 */     entity.level.addFreshEntity((Entity)entityarrow);
/* 105 */     entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 106 */         .getValue(new ResourceLocation("entity.arrow.shoot")), SoundSource.PLAYERS, 1.0F, 1.0F / ((new Random())
/* 107 */         .nextFloat() * 0.5F + 1.0F));
/* 108 */     return entityarrow;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\CrystalbowEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */