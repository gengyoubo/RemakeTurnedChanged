/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import java.util.Random;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
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
/*     */ import net.minecraftforge.api.distmarker.Dist;
/*     */ import net.minecraftforge.api.distmarker.OnlyIn;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ @OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
/*     */ public class OverundershotgunEntity
/*     */   extends AbstractArrow implements ItemSupplier {
/*     */   public OverundershotgunEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  28 */     super((EntityType)LatexModEntities.OVERUNDERSHOTGUN.get(), world);
/*     */   }
/*     */   
/*     */   public OverundershotgunEntity(EntityType<? extends OverundershotgunEntity> type, Level world) {
/*  32 */     super(type, world);
/*     */   }
/*     */   
/*     */   public OverundershotgunEntity(EntityType<? extends OverundershotgunEntity> type, double x, double y, double z, Level world) {
/*  36 */     super(type, x, y, z, world);
/*     */   }
/*     */   
/*     */   public OverundershotgunEntity(EntityType<? extends OverundershotgunEntity> type, LivingEntity entity, Level world) {
/*  40 */     super(type, entity, world);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  45 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   @OnlyIn(Dist.CLIENT)
/*     */   public ItemStack getItem() {
/*  51 */     return new ItemStack((ItemLike)LatexModItems.BULLETICON.get());
/*     */   }
/*     */ 
/*     */   
/*     */   protected ItemStack getPickupItem() {
/*  56 */     return ItemStack.EMPTY;
/*     */   }
/*     */ 
/*     */   
/*     */   protected void doPostHurtEffects(LivingEntity entity) {
/*  61 */     super.doPostHurtEffects(entity);
/*  62 */     entity.setArrowCount(entity.getArrowCount() - 1);
/*     */   }
/*     */ 
/*     */   
/*     */   public void tick() {
/*  67 */     super.tick();
/*  68 */     if (this.inGround)
/*  69 */       discard(); 
/*     */   }
/*     */   
/*     */   public static OverundershotgunEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
/*  73 */     OverundershotgunEntity entityarrow = new OverundershotgunEntity((EntityType<? extends OverundershotgunEntity>)LatexModEntities.OVERUNDERSHOTGUN.get(), entity, world);
/*  74 */     entityarrow.shoot((entity.getViewVector(1.0F)).x, (entity.getViewVector(1.0F)).y, (entity.getViewVector(1.0F)).z, power * 2.0F, 0.0F);
/*  75 */     entityarrow.setSilent(true);
/*  76 */     entityarrow.setCritArrow(false);
/*  77 */     entityarrow.setBaseDamage(damage);
/*  78 */     entityarrow.setKnockback(knockback);
/*  79 */     world.addFreshEntity((Entity)entityarrow);
/*  80 */     world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/*  81 */         .getValue(new ResourceLocation("latex:shotgun-blast")), SoundSource.PLAYERS, 1.0F, 1.0F / (random
/*  82 */         .nextFloat() * 0.5F + 1.0F) + power / 2.0F);
/*  83 */     return entityarrow;
/*     */   }
/*     */   
/*     */   public static OverundershotgunEntity shoot(LivingEntity entity, LivingEntity target) {
/*  87 */     OverundershotgunEntity entityarrow = new OverundershotgunEntity((EntityType<? extends OverundershotgunEntity>)LatexModEntities.OVERUNDERSHOTGUN.get(), entity, entity.level);
/*  88 */     double dx = target.getX() - entity.getX();
/*  89 */     double dy = target.getY() + target.getEyeHeight() - 1.1D;
/*  90 */     double dz = target.getZ() - entity.getZ();
/*  91 */     entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.20000000298023224D, dz, 2.0F, 12.0F);
/*  92 */     entityarrow.setSilent(true);
/*  93 */     entityarrow.setBaseDamage(3.0D);
/*  94 */     entityarrow.setKnockback(2);
/*  95 */     entityarrow.setCritArrow(false);
/*  96 */     entity.level.addFreshEntity((Entity)entityarrow);
/*  97 */     entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/*  98 */         .getValue(new ResourceLocation("latex:shotgun-blast")), SoundSource.PLAYERS, 1.0F, 1.0F / ((new Random())
/*  99 */         .nextFloat() * 0.5F + 1.0F));
/* 100 */     return entityarrow;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\OverundershotgunEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */