/*    */ package net.mcreator.latexes.entity;
/*    */ 
/*    */ import java.util.Random;
/*    */ import net.mcreator.latexes.init.LatexModEntities;
/*    */ import net.minecraft.network.protocol.Packet;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.projectile.AbstractArrow;
/*    */ import net.minecraft.world.entity.projectile.ItemSupplier;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.api.distmarker.OnlyIn;
/*    */ import net.minecraftforge.network.NetworkHooks;
/*    */ import net.minecraftforge.network.PlayMessages;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ @OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
/*    */ public class DartrifleEntity
/*    */   extends AbstractArrow
/*    */   implements ItemSupplier {
/*    */   public DartrifleEntity(PlayMessages.SpawnEntity packet, Level world) {
/* 27 */     super((EntityType)LatexModEntities.DARTRIFLE.get(), world);
/*    */   }
/*    */   
/*    */   public DartrifleEntity(EntityType<? extends DartrifleEntity> type, Level world) {
/* 31 */     super(type, world);
/*    */   }
/*    */   
/*    */   public DartrifleEntity(EntityType<? extends DartrifleEntity> type, double x, double y, double z, Level world) {
/* 35 */     super(type, x, y, z, world);
/*    */   }
/*    */   
/*    */   public DartrifleEntity(EntityType<? extends DartrifleEntity> type, LivingEntity entity, Level world) {
/* 39 */     super(type, entity, world);
/*    */   }
/*    */ 
/*    */   
/*    */   public Packet<?> getAddEntityPacket() {
/* 44 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*    */   }
/*    */ 
/*    */   
/*    */   @OnlyIn(Dist.CLIENT)
/*    */   public ItemStack getItem() {
/* 50 */     return ItemStack.EMPTY;
/*    */   }
/*    */ 
/*    */   
/*    */   protected ItemStack getPickupItem() {
/* 55 */     return ItemStack.EMPTY;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void doPostHurtEffects(LivingEntity entity) {
/* 60 */     super.doPostHurtEffects(entity);
/* 61 */     entity.setArrowCount(entity.getArrowCount() - 1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void tick() {
/* 66 */     super.tick();
/* 67 */     if (this.inGround)
/* 68 */       discard(); 
/*    */   }
/*    */   
/*    */   public static DartrifleEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
/* 72 */     DartrifleEntity entityarrow = new DartrifleEntity((EntityType<? extends DartrifleEntity>)LatexModEntities.DARTRIFLE.get(), entity, world);
/* 73 */     entityarrow.shoot((entity.getViewVector(1.0F)).x, (entity.getViewVector(1.0F)).y, (entity.getViewVector(1.0F)).z, power * 2.0F, 0.0F);
/* 74 */     entityarrow.setSilent(true);
/* 75 */     entityarrow.setCritArrow(false);
/* 76 */     entityarrow.setBaseDamage(damage);
/* 77 */     entityarrow.setKnockback(knockback);
/* 78 */     world.addFreshEntity((Entity)entityarrow);
/* 79 */     world.playSound(null, entity.getX(), entity.getY(), entity.getZ(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 80 */         .getValue(new ResourceLocation("latex:dart_shot")), SoundSource.PLAYERS, 1.0F, 1.0F / (random
/* 81 */         .nextFloat() * 0.5F + 1.0F) + power / 2.0F);
/* 82 */     return entityarrow;
/*    */   }
/*    */   
/*    */   public static DartrifleEntity shoot(LivingEntity entity, LivingEntity target) {
/* 86 */     DartrifleEntity entityarrow = new DartrifleEntity((EntityType<? extends DartrifleEntity>)LatexModEntities.DARTRIFLE.get(), entity, entity.level);
/* 87 */     double dx = target.getX() - entity.getX();
/* 88 */     double dy = target.getY() + target.getEyeHeight() - 1.1D;
/* 89 */     double dz = target.getZ() - entity.getZ();
/* 90 */     entityarrow.shoot(dx, dy - entityarrow.getY() + Math.hypot(dx, dz) * 0.20000000298023224D, dz, 5.0F, 12.0F);
/* 91 */     entityarrow.setSilent(true);
/* 92 */     entityarrow.setBaseDamage(2.5D);
/* 93 */     entityarrow.setKnockback(0);
/* 94 */     entityarrow.setCritArrow(false);
/* 95 */     entity.level.addFreshEntity((Entity)entityarrow);
/* 96 */     entity.level.playSound(null, entity.getX(), entity.getY(), entity.getZ(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 97 */         .getValue(new ResourceLocation("latex:dart_shot")), SoundSource.PLAYERS, 1.0F, 1.0F / ((new Random())
/* 98 */         .nextFloat() * 0.5F + 1.0F));
/* 99 */     return entityarrow;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\DartrifleEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */