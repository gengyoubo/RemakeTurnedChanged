/*     */ package net.ltxprogrammer.turned.entity;
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
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.npc.Villager;
/*     */ import net.minecraft.world.entity.npc.WanderingTrader;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public abstract class AbstractTSCEntity extends Monster {
/*     */   protected AbstractTSCEntity(EntityType<? extends AbstractTSCEntity> p_33002_, Level p_33003_) {
/*  31 */     super(p_33002_, p_33003_);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  36 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  41 */     return MobType.f_21640_;
/*     */   }
/*     */   
/*     */   protected void m_7472_(DamageSource source, int looting, boolean recentlyHitIn) {
/*  45 */     super.m_7472_(source, looting, recentlyHitIn);
/*  46 */     m_19983_(new ItemStack((ItemLike)Items.f_42416_));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/*  51 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.step")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/*  56 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal.hit"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/*  61 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:death_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  66 */     super.m_8099_();
/*  67 */     this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.25D, true)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  70 */             return 4.0D + (entity.m_20205_() * entity.m_20205_());
/*     */           }
/*     */         });
/*  73 */     this.f_21346_.m_25352_(2, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false));
/*  74 */     this.f_21346_.m_25352_(3, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, 10, true, false, TargetCheck.IS_LATEX));
/*  75 */     this.f_21346_.m_25352_(5, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, true, false));
/*  76 */     this.f_21346_.m_25352_(6, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, true, false));
/*  77 */     this.f_21346_.m_25352_(7, (Goal)new NearestAttackableTargetGoal((Mob)this, IronGolem.class, true, false));
/*  78 */     this.f_21345_.m_25352_(8, (Goal)new OpenDoorGoal((Mob)this, true));
/*  79 */     this.f_21345_.m_25352_(9, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.75D));
/*  80 */     this.f_21345_.m_25352_(10, (Goal)new LookAtPlayerGoal((Mob)this, LivingEntity.class, 4.0F));
/*  81 */     this.f_21345_.m_25352_(11, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 9.0F));
/*  82 */     this.f_21345_.m_25352_(12, (Goal)new LookAtPlayerGoal((Mob)this, ScientistEntity.class, 6.0F));
/*  83 */     this.f_21346_.m_25352_(13, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).m_26044_(new Class[0]));
/*  84 */     this.f_21345_.m_25352_(14, (Goal)new OpenDoorGoal((Mob)this, false));
/*  85 */     this.f_21345_.m_25352_(15, (Goal)new RandomLookAroundGoal((Mob)this));
/*  86 */     this.f_21345_.m_25352_(16, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/*  91 */     if (source.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud)
/*  92 */       return false; 
/*  93 */     if (source == DamageSource.f_19314_)
/*  94 */       return false; 
/*  95 */     if (source == DamageSource.f_19312_)
/*  96 */       return false; 
/*  97 */     if (source == DamageSource.f_19323_)
/*  98 */       return false; 
/*  99 */     if (source == DamageSource.f_19320_)
/* 100 */       return false; 
/* 101 */     if (source.m_19385_().equals("witherSkull"))
/* 102 */       return false; 
/* 103 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/* 108 */     return false;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\AbstractTSCEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */