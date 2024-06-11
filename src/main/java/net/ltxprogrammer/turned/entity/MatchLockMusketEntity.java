/*    */ package net.ltxprogrammer.turned.entity;
/*    */ 
/*    */ import java.util.Random;
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
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
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.api.distmarker.OnlyIn;
/*    */ import net.minecraftforge.network.NetworkHooks;
/*    */ import net.minecraftforge.network.PlayMessages;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ @OnlyIn(value = Dist.CLIENT, _interface = ItemSupplier.class)
/*    */ public class MatchLockMusketEntity extends AbstractArrow implements ItemSupplier {
/*    */   public MatchLockMusketEntity(PlayMessages.SpawnEntity packet, Level world) {
/* 27 */     super((EntityType)LatexModEntities.MATCH_LOCK_MUSKET.get(), world);
/*    */   }
/*    */   
/*    */   public MatchLockMusketEntity(EntityType<? extends MatchLockMusketEntity> type, Level world) {
/* 31 */     super(type, world);
/*    */   }
/*    */   
/*    */   public MatchLockMusketEntity(EntityType<? extends MatchLockMusketEntity> type, double x, double y, double z, Level world) {
/* 35 */     super(type, x, y, z, world);
/*    */   }
/*    */   
/*    */   public MatchLockMusketEntity(EntityType<? extends MatchLockMusketEntity> type, LivingEntity entity, Level world) {
/* 39 */     super(type, entity, world);
/*    */   }
/*    */ 
/*    */   
/*    */   public Packet<?> m_5654_() {
/* 44 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*    */   }
/*    */ 
/*    */   
/*    */   @OnlyIn(Dist.CLIENT)
/*    */   public ItemStack m_7846_() {
/* 50 */     return new ItemStack((ItemLike)LatexModItems.BULLETICON.get());
/*    */   }
/*    */ 
/*    */   
/*    */   protected ItemStack m_7941_() {
/* 55 */     return ItemStack.f_41583_;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void m_7761_(LivingEntity entity) {
/* 60 */     super.m_7761_(entity);
/* 61 */     entity.m_21317_(entity.m_21234_() - 1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_8119_() {
/* 66 */     super.m_8119_();
/* 67 */     if (this.f_36703_)
/* 68 */       m_146870_(); 
/*    */   }
/*    */   
/*    */   public static MatchLockMusketEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
/* 72 */     MatchLockMusketEntity entityarrow = new MatchLockMusketEntity((EntityType<? extends MatchLockMusketEntity>)LatexModEntities.MATCH_LOCK_MUSKET.get(), entity, world);
/* 73 */     entityarrow.m_6686_((entity.m_20252_(1.0F)).f_82479_, (entity.m_20252_(1.0F)).f_82480_, (entity.m_20252_(1.0F)).f_82481_, power * 2.0F, 0.0F);
/* 74 */     entityarrow.m_20225_(true);
/* 75 */     entityarrow.m_36762_(true);
/* 76 */     entityarrow.m_36781_(damage);
/* 77 */     entityarrow.m_36735_(knockback);
/* 78 */     world.m_7967_((Entity)entityarrow);
/* 79 */     world.m_6263_(null, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 80 */         .getValue(new ResourceLocation("turned:musket_fire")), SoundSource.PLAYERS, 1.0F, 1.0F / (random
/* 81 */         .nextFloat() * 0.5F + 1.0F) + power / 2.0F);
/* 82 */     return entityarrow;
/*    */   }
/*    */   
/*    */   public static MatchLockMusketEntity shoot(LivingEntity entity, LivingEntity target) {
/* 86 */     MatchLockMusketEntity entityarrow = new MatchLockMusketEntity((EntityType<? extends MatchLockMusketEntity>)LatexModEntities.MATCH_LOCK_MUSKET.get(), entity, entity.f_19853_);
/* 87 */     double dx = target.m_20185_() - entity.m_20185_();
/* 88 */     double dy = target.m_20186_() + target.m_20192_() - 1.1D;
/* 89 */     double dz = target.m_20189_() - entity.m_20189_();
/* 90 */     entityarrow.m_6686_(dx, dy - entityarrow.m_20186_() + Math.hypot(dx, dz) * 0.20000000298023224D, dz, 4.0F, 12.0F);
/* 91 */     entityarrow.m_20225_(true);
/* 92 */     entityarrow.m_36781_(3.0D);
/* 93 */     entityarrow.m_36735_(1);
/* 94 */     entityarrow.m_36762_(true);
/* 95 */     entity.f_19853_.m_7967_((Entity)entityarrow);
/* 96 */     entity.f_19853_.m_6263_(null, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 97 */         .getValue(new ResourceLocation("turned:musket_fire")), SoundSource.PLAYERS, 1.0F, 1.0F / ((new Random())
/* 98 */         .nextFloat() * 0.5F + 1.0F));
/* 99 */     return entityarrow;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\MatchLockMusketEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */