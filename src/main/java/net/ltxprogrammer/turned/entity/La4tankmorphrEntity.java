/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import net.ltxprogrammer.turned.entity.ai.TargetCheck;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.init.LatexModItems;
/*     */ import net.minecraft.core.BlockPos;
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
/*     */ import net.minecraft.world.entity.ai.goal.FloatGoal;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.LeapAtTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.monster.Illusioner;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.monster.Pillager;
/*     */ import net.minecraft.world.entity.monster.RangedAttackMob;
/*     */ import net.minecraft.world.entity.monster.SpellcasterIllager;
/*     */ import net.minecraft.world.entity.monster.Vindicator;
/*     */ import net.minecraft.world.entity.monster.piglin.Piglin;
/*     */ import net.minecraft.world.entity.monster.piglin.PiglinBrute;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class La4tankmorphrEntity
/*     */   extends PathfinderMob
/*     */   implements RangedAttackMob
/*     */ {
/*     */   public La4tankmorphrEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  51 */     this((EntityType<La4tankmorphrEntity>)LatexModEntities.LA_4TANKMORPHR.get(), world);
/*     */   }
/*     */   
/*     */   public La4tankmorphrEntity(EntityType<La4tankmorphrEntity> type, Level world) {
/*  55 */     super(type, world);
/*  56 */     this.f_21364_ = 0;
/*  57 */     m_21557_(false);
/*  58 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  63 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  68 */     super.m_8099_();
/*  69 */     this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal(this, 1.0D, true)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  72 */             return 4.0D + (entity.m_20205_() * entity.m_20205_());
/*     */           }
/*     */         });
/*  75 */     this.f_21346_.m_25352_(2, (Goal)(new HurtByTargetGoal(this, new Class[0])).m_26044_(new Class[0]));
/*  76 */     this.f_21346_.m_25352_(3, (Goal)new NearestAttackableTargetGoal((Mob)this, Monster.class, 10, true, false, TargetCheck.IS_LATEX));
/*  77 */     this.f_21346_.m_25352_(4, (Goal)new NearestAttackableTargetGoal((Mob)this, PathfinderMob.class, 10, true, false, TargetCheck.IS_EVIL));
/*  78 */     this.f_21346_.m_25352_(5, (Goal)new NearestAttackableTargetGoal((Mob)this, Illusioner.class, true, false));
/*  79 */     this.f_21346_.m_25352_(6, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/*  80 */     this.f_21346_.m_25352_(7, (Goal)new NearestAttackableTargetGoal((Mob)this, SpellcasterIllager.class, true, false));
/*  81 */     this.f_21346_.m_25352_(8, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/*  82 */     this.f_21346_.m_25352_(9, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/*  83 */     this.f_21346_.m_25352_(10, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/*  84 */     this.f_21346_.m_25352_(11, (Goal)new NearestAttackableTargetGoal((Mob)this, Monster.class, true, false));
/*  85 */     this.f_21345_.m_25352_(12, (Goal)new LeapAtTargetGoal((Mob)this, 0.5F));
/*  86 */     this.f_21345_.m_25352_(13, (Goal)new RandomLookAroundGoal((Mob)this));
/*  87 */     this.f_21345_.m_25352_(14, (Goal)new FloatGoal((Mob)this));
/*  88 */     this.f_21345_.m_25352_(15, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 6.0F));
/*  89 */     this.f_21345_.m_25352_(16, (Goal)new LookAtPlayerGoal((Mob)this, AHVHertxEntity.class, 6.0F));
/*  90 */     this.f_21345_.m_25352_(17, (Goal)new RandomStrollGoal(this, 1.0D));
/*  91 */     this.f_21345_.m_25352_(1, (Goal)new RangedAttackGoal(this, 1.25D, 20, 10.0F)
/*     */         {
/*     */           public boolean m_8045_() {
/*  94 */             return m_8036_();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/* 101 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/* 106 */     return false;
/*     */   }
/*     */   
/*     */   protected void m_7472_(DamageSource source, int looting, boolean recentlyHitIn) {
/* 110 */     super.m_7472_(source, looting, recentlyHitIn);
/* 111 */     m_19983_(new ItemStack((ItemLike)LatexModItems.TANK_CANNON.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7515_() {
/* 116 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:deny_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/* 121 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.step")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 126 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 131 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/* 136 */     if (source.m_7640_() instanceof net.minecraft.world.entity.projectile.AbstractArrow)
/* 137 */       return false; 
/* 138 */     if (source.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 139 */       return false; 
/* 140 */     if (source == DamageSource.f_19314_)
/* 141 */       return false; 
/* 142 */     if (source == DamageSource.f_19323_)
/* 143 */       return false; 
/* 144 */     if (source == DamageSource.f_19320_)
/* 145 */       return false; 
/* 146 */     if (source.m_19385_().equals("witherSkull"))
/* 147 */       return false; 
/* 148 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6504_(LivingEntity target, float flval) {
/* 153 */     TankCannonEntity.shoot((LivingEntity)this, target);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6094_() {
/* 158 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void m_7324_(Entity entityIn) {}
/*     */ 
/*     */   
/*     */   protected void m_6138_() {}
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */ 
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 173 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 174 */     builder = builder.m_22268_(Attributes.f_22279_, 0.15D);
/* 175 */     builder = builder.m_22268_(Attributes.f_22276_, 500.0D);
/* 176 */     builder = builder.m_22268_(Attributes.f_22284_, 15.0D);
/* 177 */     builder = builder.m_22268_(Attributes.f_22281_, 8.0D);
/* 178 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 179 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\La4tankmorphrEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */