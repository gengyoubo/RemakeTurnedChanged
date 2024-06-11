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
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.monster.Illusioner;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.monster.Pillager;
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
/*     */ 
/*     */ public class La4tankmorphmEntity
/*     */   extends PathfinderMob
/*     */ {
/*     */   public La4tankmorphmEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  49 */     this((EntityType<La4tankmorphmEntity>)LatexModEntities.LA_4TANKMORPHM.get(), world);
/*     */   }
/*     */   
/*     */   public La4tankmorphmEntity(EntityType<La4tankmorphmEntity> type, Level world) {
/*  53 */     super(type, world);
/*  54 */     this.f_21364_ = 0;
/*  55 */     m_21557_(false);
/*  56 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  61 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  66 */     super.m_8099_();
/*  67 */     this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal(this, 1.0D, true)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  70 */             return 4.0D + (entity.m_20205_() * entity.m_20205_());
/*     */           }
/*     */         });
/*  73 */     this.f_21346_.m_25352_(2, (Goal)(new HurtByTargetGoal(this, new Class[0])).m_26044_(new Class[0]));
/*  74 */     this.f_21346_.m_25352_(3, (Goal)new NearestAttackableTargetGoal((Mob)this, Monster.class, 10, true, false, TargetCheck.IS_LATEX));
/*  75 */     this.f_21346_.m_25352_(4, (Goal)new NearestAttackableTargetGoal((Mob)this, PathfinderMob.class, 10, true, false, TargetCheck.IS_EVIL));
/*  76 */     this.f_21346_.m_25352_(5, (Goal)new NearestAttackableTargetGoal((Mob)this, Illusioner.class, true, false));
/*  77 */     this.f_21346_.m_25352_(6, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/*  78 */     this.f_21346_.m_25352_(7, (Goal)new NearestAttackableTargetGoal((Mob)this, SpellcasterIllager.class, true, false));
/*  79 */     this.f_21346_.m_25352_(8, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/*  80 */     this.f_21346_.m_25352_(9, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/*  81 */     this.f_21346_.m_25352_(10, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/*  82 */     this.f_21346_.m_25352_(11, (Goal)new NearestAttackableTargetGoal((Mob)this, SlimelingEntity.class, true, false));
/*  83 */     this.f_21346_.m_25352_(12, (Goal)new NearestAttackableTargetGoal((Mob)this, Monster.class, true, false));
/*  84 */     this.f_21345_.m_25352_(13, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 6.0F));
/*  85 */     this.f_21345_.m_25352_(14, (Goal)new LeapAtTargetGoal((Mob)this, 0.5F));
/*  86 */     this.f_21345_.m_25352_(15, (Goal)new RandomLookAroundGoal((Mob)this));
/*  87 */     this.f_21345_.m_25352_(16, (Goal)new FloatGoal((Mob)this));
/*  88 */     this.f_21345_.m_25352_(17, (Goal)new RandomStrollGoal(this, 1.0D));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  93 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/*  98 */     return false;
/*     */   }
/*     */   
/*     */   protected void m_7472_(DamageSource source, int looting, boolean recentlyHitIn) {
/* 102 */     super.m_7472_(source, looting, recentlyHitIn);
/* 103 */     m_19983_(new ItemStack((ItemLike)LatexModItems.TANK_CANNON.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7515_() {
/* 108 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:deny_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/* 113 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.step")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 118 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 123 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/* 128 */     if (source.m_7640_() instanceof net.minecraft.world.entity.projectile.AbstractArrow)
/* 129 */       return false; 
/* 130 */     if (source.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 131 */       return false; 
/* 132 */     if (source == DamageSource.f_19314_)
/* 133 */       return false; 
/* 134 */     if (source == DamageSource.f_19323_)
/* 135 */       return false; 
/* 136 */     if (source == DamageSource.f_19320_)
/* 137 */       return false; 
/* 138 */     if (source.m_19385_().equals("witherSkull"))
/* 139 */       return false; 
/* 140 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 147 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 148 */     builder = builder.m_22268_(Attributes.f_22279_, 0.2D);
/* 149 */     builder = builder.m_22268_(Attributes.f_22276_, 500.0D);
/* 150 */     builder = builder.m_22268_(Attributes.f_22284_, 15.0D);
/* 151 */     builder = builder.m_22268_(Attributes.f_22281_, 16.0D);
/* 152 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 153 */     builder = builder.m_22268_(Attributes.f_22278_, 1.0D);
/* 154 */     builder = builder.m_22268_(Attributes.f_22282_, 2.0D);
/* 155 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\La4tankmorphmEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */