/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import java.util.EnumSet;
/*     */ import java.util.Random;
/*     */ import javax.annotation.Nullable;
/*     */ import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
/*     */ import net.ltxprogrammer.changed.init.ChangedItems;
/*     */ import net.ltxprogrammer.changed.init.ChangedParticles;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.procedures.DarklatexOnInitialEntitySpawnProcedure;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.world.DifficultyInstance;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.SpawnGroupData;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.control.FlyingMoveControl;
/*     */ import net.minecraft.world.entity.ai.control.MoveControl;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.LeapAtTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
/*     */ import net.minecraft.world.entity.ai.navigation.PathNavigation;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import net.minecraftforge.common.DungeonHooks;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ 
/*     */ public class DarkLatexMothEntity
/*     */   extends AbstractDarkLatexEntity
/*     */ {
/*     */   public DarkLatexMothEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  45 */     this((EntityType<DarkLatexMothEntity>)LatexModEntities.DARK_LATEX_MOTH.get(), world);
/*     */   }
/*     */   
/*     */   public DarkLatexMothEntity(EntityType<DarkLatexMothEntity> type, Level world) {
/*  49 */     super(type, world);
/*  50 */     this.f_21364_ = 5;
/*  51 */     m_21557_(false);
/*  52 */     this.f_21342_ = (MoveControl)new FlyingMoveControl((Mob)this, 10, true);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  57 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected PathNavigation m_6037_(Level world) {
/*  62 */     return (PathNavigation)new FlyingPathNavigation((Mob)this, world);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  67 */     super.m_8099_();
/*  68 */     this.f_21345_.m_25352_(2, new Goal()
/*     */         {
/*     */ 
/*     */           
/*     */           public boolean m_8036_()
/*     */           {
/*  74 */             return (DarkLatexMothEntity.this.m_5448_() != null && !DarkLatexMothEntity.this.m_21566_().m_24995_());
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean m_8045_() {
/*  79 */             return (DarkLatexMothEntity.this.m_21566_().m_24995_() && DarkLatexMothEntity.this.m_5448_() != null && DarkLatexMothEntity.this
/*  80 */               .m_5448_().m_6084_());
/*     */           }
/*     */ 
/*     */           
/*     */           public void m_8056_() {
/*  85 */             LivingEntity livingentity = DarkLatexMothEntity.this.m_5448_();
/*  86 */             Vec3 vec3d = livingentity.m_20299_(1.0F);
/*  87 */             DarkLatexMothEntity.this.f_21342_.m_6849_(vec3d.f_82479_, vec3d.f_82480_, vec3d.f_82481_, 1.0D);
/*     */           }
/*     */ 
/*     */           
/*     */           public void m_8037_() {
/*  92 */             LivingEntity livingentity = DarkLatexMothEntity.this.m_5448_();
/*  93 */             if (DarkLatexMothEntity.this.m_142469_().m_82381_(livingentity.m_142469_())) {
/*  94 */               DarkLatexMothEntity.this.m_7327_((Entity)livingentity);
/*     */             } else {
/*  96 */               double d0 = DarkLatexMothEntity.this.m_20280_((Entity)livingentity);
/*  97 */               if (d0 < 9.0D) {
/*  98 */                 Vec3 vec3d = livingentity.m_20299_(1.0F);
/*  99 */                 DarkLatexMothEntity.this.f_21342_.m_6849_(vec3d.f_82479_, vec3d.f_82480_, vec3d.f_82481_, 1.0D);
/*     */               } 
/*     */             } 
/*     */           }
/*     */         });
/* 104 */     this.f_21345_.m_25352_(27, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.8D, 20)
/*     */         {
/*     */           protected Vec3 m_7037_() {
/* 107 */             Random random = DarkLatexMothEntity.this.m_21187_();
/* 108 */             double dir_x = DarkLatexMothEntity.this.m_20185_() + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 109 */             double dir_y = DarkLatexMothEntity.this.m_20186_() + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 110 */             double dir_z = DarkLatexMothEntity.this.m_20189_() + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 111 */             return new Vec3(dir_x, dir_y, dir_z);
/*     */           }
/*     */         });
/* 114 */     this.f_21345_.m_25352_(32, (Goal)new LeapAtTargetGoal((Mob)this, 0.5F));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/* 119 */     return MobType.f_21642_;
/*     */   }
/*     */   
/*     */   protected void m_7472_(DamageSource source, int looting, boolean recentlyHitIn) {
/* 123 */     super.m_7472_(source, looting, recentlyHitIn);
/* 124 */     m_19983_(new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 130 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 131 */     DarklatexOnInitialEntitySpawnProcedure.execute((Entity)this);
/* 132 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_20242_(boolean ignored) {
/* 137 */     super.m_20242_(true);
/*     */   }
/*     */   
/*     */   public void m_8107_() {
/* 141 */     super.m_8107_();
/* 142 */     m_20242_(true);
/*     */   }
/*     */   
/*     */   public static void init() {
/* 146 */     DungeonHooks.addDungeonMob((EntityType)LatexModEntities.DARK_LATEX_MOTH.get(), 180);
/*     */   }
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 150 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 151 */     builder = builder.m_22268_(Attributes.f_22279_, 0.225D);
/* 152 */     builder = builder.m_22268_(Attributes.f_22276_, 18.0D);
/* 153 */     builder = builder.m_22268_(Attributes.f_22284_, 1.5D);
/* 154 */     builder = builder.m_22268_(Attributes.f_22281_, 3.0D);
/* 155 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 156 */     builder = builder.m_22268_(Attributes.f_22278_, 0.3D);
/* 157 */     builder = builder.m_22268_(Attributes.f_22282_, 0.5D);
/* 158 */     builder = builder.m_22268_(Attributes.f_22280_, 0.225D);
/* 159 */     return builder;
/*     */   }
/*     */ 
/*     */   
/*     */   public ChangedParticles.Color3 getDripColor() {
/* 164 */     return ChangedParticles.Color3.DARK;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\DarkLatexMothEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */