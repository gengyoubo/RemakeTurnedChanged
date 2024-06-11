/*    */ package net.ltxprogrammer.turned.entity;
/*    */ 
/*    */ import java.util.Random;
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
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
/*    */   extends AbstractArrow implements ItemSupplier {
/*    */   public DartrifleEntity(PlayMessages.SpawnEntity packet, Level world) {
/* 26 */     super((EntityType)LatexModEntities.DARTRIFLE.get(), world);
/*    */   }
/*    */   
/*    */   public DartrifleEntity(EntityType<? extends DartrifleEntity> type, Level world) {
/* 30 */     super(type, world);
/*    */   }
/*    */   
/*    */   public DartrifleEntity(EntityType<? extends DartrifleEntity> type, double x, double y, double z, Level world) {
/* 34 */     super(type, x, y, z, world);
/*    */   }
/*    */   
/*    */   public DartrifleEntity(EntityType<? extends DartrifleEntity> type, LivingEntity entity, Level world) {
/* 38 */     super(type, entity, world);
/*    */   }
/*    */ 
/*    */   
/*    */   public Packet<?> m_5654_() {
/* 43 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*    */   }
/*    */ 
/*    */   
/*    */   @OnlyIn(Dist.CLIENT)
/*    */   public ItemStack m_7846_() {
/* 49 */     return ItemStack.f_41583_;
/*    */   }
/*    */ 
/*    */   
/*    */   protected ItemStack m_7941_() {
/* 54 */     return ItemStack.f_41583_;
/*    */   }
/*    */ 
/*    */   
/*    */   protected void m_7761_(LivingEntity entity) {
/* 59 */     super.m_7761_(entity);
/* 60 */     entity.m_21317_(entity.m_21234_() - 1);
/*    */   }
/*    */ 
/*    */   
/*    */   public void m_8119_() {
/* 65 */     super.m_8119_();
/* 66 */     if (this.f_36703_)
/* 67 */       m_146870_(); 
/*    */   }
/*    */   
/*    */   public static DartrifleEntity shoot(Level world, LivingEntity entity, Random random, float power, double damage, int knockback) {
/* 71 */     DartrifleEntity entityarrow = new DartrifleEntity((EntityType<? extends DartrifleEntity>)LatexModEntities.DARTRIFLE.get(), entity, world);
/* 72 */     entityarrow.m_6686_((entity.m_20252_(1.0F)).f_82479_, (entity.m_20252_(1.0F)).f_82480_, (entity.m_20252_(1.0F)).f_82481_, power * 2.0F, 0.0F);
/* 73 */     entityarrow.m_20225_(true);
/* 74 */     entityarrow.m_36762_(false);
/* 75 */     entityarrow.m_36781_(damage);
/* 76 */     entityarrow.m_36735_(knockback);
/* 77 */     world.m_7967_((Entity)entityarrow);
/* 78 */     world.m_6263_(null, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 79 */         .getValue(new ResourceLocation("turned:dart_shot")), SoundSource.PLAYERS, 1.0F, 1.0F / (random
/* 80 */         .nextFloat() * 0.5F + 1.0F) + power / 2.0F);
/* 81 */     return entityarrow;
/*    */   }
/*    */   
/*    */   public static DartrifleEntity shoot(LivingEntity entity, LivingEntity target) {
/* 85 */     DartrifleEntity entityarrow = new DartrifleEntity((EntityType<? extends DartrifleEntity>)LatexModEntities.DARTRIFLE.get(), entity, entity.f_19853_);
/* 86 */     double dx = target.m_20185_() - entity.m_20185_();
/* 87 */     double dy = target.m_20186_() + target.m_20192_() - 1.1D;
/* 88 */     double dz = target.m_20189_() - entity.m_20189_();
/* 89 */     entityarrow.m_6686_(dx, dy - entityarrow.m_20186_() + Math.hypot(dx, dz) * 0.20000000298023224D, dz, 5.0F, 12.0F);
/* 90 */     entityarrow.m_20225_(true);
/* 91 */     entityarrow.m_36781_(2.5D);
/* 92 */     entityarrow.m_36735_(0);
/* 93 */     entityarrow.m_36762_(false);
/* 94 */     entity.f_19853_.m_7967_((Entity)entityarrow);
/* 95 */     entity.f_19853_.m_6263_(null, entity.m_20185_(), entity.m_20186_(), entity.m_20189_(), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 96 */         .getValue(new ResourceLocation("turned:dart_shot")), SoundSource.PLAYERS, 1.0F, 1.0F / ((new Random())
/* 97 */         .nextFloat() * 0.5F + 1.0F));
/* 98 */     return entityarrow;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\DartrifleEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */