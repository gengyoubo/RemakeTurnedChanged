/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import java.util.EnumSet;
/*     */ import java.util.Random;
/*     */ import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
/*     */ import net.ltxprogrammer.changed.init.ChangedItems;
/*     */ import net.ltxprogrammer.changed.init.ChangedParticles;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.procedures.CheckforskyProcedure;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.control.FlyingMoveControl;
/*     */ import net.minecraft.world.entity.ai.control.MoveControl;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.WaterAvoidingRandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
/*     */ import net.minecraft.world.entity.ai.navigation.PathNavigation;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class DLbeeEntity extends AbstractDarkLatexEntity {
/*     */   public DLbeeEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  41 */     this((EntityType<DLbeeEntity>)LatexModEntities.D_LBEE.get(), world);
/*     */   }
/*     */   
/*     */   public DLbeeEntity(EntityType<DLbeeEntity> type, Level world) {
/*  45 */     super(type, world);
/*  46 */     this.f_21364_ = 6;
/*  47 */     m_21557_(false);
/*  48 */     this.f_21342_ = (MoveControl)new FlyingMoveControl((Mob)this, 10, true);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  53 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected PathNavigation m_6037_(Level world) {
/*  58 */     return (PathNavigation)new FlyingPathNavigation((Mob)this, world);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  63 */     super.m_8099_();
/*  64 */     this.f_21345_.m_25352_(1, new Goal()
/*     */         {
/*     */ 
/*     */           
/*     */           public boolean m_8036_()
/*     */           {
/*  70 */             if (DLbeeEntity.this.m_5448_() != null && !DLbeeEntity.this.m_21566_().m_24995_()) {
/*  71 */               double x = DLbeeEntity.this.m_20185_();
/*  72 */               double y = DLbeeEntity.this.m_20186_();
/*  73 */               double z = DLbeeEntity.this.m_20189_();
/*  74 */               DLbeeEntity dLbeeEntity = DLbeeEntity.this;
/*  75 */               return true;
/*     */             } 
/*  77 */             return false;
/*     */           }
/*     */ 
/*     */ 
/*     */           
/*     */           public boolean m_8045_() {
/*  83 */             return (DLbeeEntity.this.m_21566_().m_24995_() && DLbeeEntity.this.m_5448_() != null && DLbeeEntity.this
/*  84 */               .m_5448_().m_6084_());
/*     */           }
/*     */ 
/*     */           
/*     */           public void m_8056_() {
/*  89 */             LivingEntity livingentity = DLbeeEntity.this.m_5448_();
/*  90 */             Vec3 vec3d = livingentity.m_20299_(1.0F);
/*  91 */             DLbeeEntity.this.f_21342_.m_6849_(vec3d.f_82479_, vec3d.f_82480_, vec3d.f_82481_, 1.0D);
/*     */           }
/*     */ 
/*     */           
/*     */           public void m_8037_() {
/*  96 */             LivingEntity livingentity = DLbeeEntity.this.m_5448_();
/*  97 */             if (DLbeeEntity.this.m_142469_().m_82381_(livingentity.m_142469_())) {
/*  98 */               DLbeeEntity.this.m_7327_((Entity)livingentity);
/*     */             } else {
/* 100 */               double d0 = DLbeeEntity.this.m_20280_((Entity)livingentity);
/* 101 */               if (d0 < 16.0D) {
/* 102 */                 Vec3 vec3d = livingentity.m_20299_(1.0F);
/* 103 */                 DLbeeEntity.this.f_21342_.m_6849_(vec3d.f_82479_, vec3d.f_82480_, vec3d.f_82481_, 1.0D);
/*     */               } 
/*     */             } 
/*     */           }
/*     */         });
/* 108 */     this.f_21345_.m_25352_(2, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.0D, true)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/* 111 */             return 4.0D + (entity.m_20205_() * entity.m_20205_());
/*     */           }
/*     */         });
/* 114 */     this.f_21345_.m_25352_(24, (Goal)new WaterAvoidingRandomStrollGoal((PathfinderMob)this, 0.8D));
/* 115 */     this.f_21345_.m_25352_(25, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.8D, 20)
/*     */         {
/*     */           protected Vec3 m_7037_() {
/* 118 */             Random random = DLbeeEntity.this.m_21187_();
/* 119 */             double dir_x = DLbeeEntity.this.m_20185_() + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 120 */             double dir_y = DLbeeEntity.this.m_20186_() + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 121 */             double dir_z = DLbeeEntity.this.m_20189_() + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 122 */             return new Vec3(dir_x, dir_y, dir_z);
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean m_8036_() {
/* 127 */             double x = DLbeeEntity.this.m_20185_();
/* 128 */             double y = DLbeeEntity.this.m_20186_();
/* 129 */             double z = DLbeeEntity.this.m_20189_();
/* 130 */             DLbeeEntity dLbeeEntity = DLbeeEntity.this;
/* 131 */             Level world = DLbeeEntity.this.f_19853_;
/* 132 */             return (super.m_8036_() && CheckforskyProcedure.execute((LevelAccessor)world, x, y, z));
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/* 140 */     return MobType.f_21642_;
/*     */   }
/*     */   
/*     */   protected void m_7472_(DamageSource source, int looting, boolean recentlyHitIn) {
/* 144 */     super.m_7472_(source, looting, recentlyHitIn);
/* 145 */     m_19983_(new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7515_() {
/* 150 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.bee.loop"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_20242_(boolean ignored) {
/* 155 */     super.m_20242_(true);
/*     */   }
/*     */   
/*     */   public void m_8107_() {
/* 159 */     super.m_8107_();
/* 160 */     m_20242_(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 167 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 168 */     builder = builder.m_22268_(Attributes.f_22279_, 0.5D);
/* 169 */     builder = builder.m_22268_(Attributes.f_22276_, 20.0D);
/* 170 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 171 */     builder = builder.m_22268_(Attributes.f_22281_, 4.0D);
/* 172 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 173 */     builder = builder.m_22268_(Attributes.f_22280_, 0.5D);
/* 174 */     return builder;
/*     */   }
/*     */ 
/*     */   
/*     */   public ChangedParticles.Color3 getDripColor() {
/* 179 */     return ChangedParticles.Color3.DARK;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\DLbeeEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */