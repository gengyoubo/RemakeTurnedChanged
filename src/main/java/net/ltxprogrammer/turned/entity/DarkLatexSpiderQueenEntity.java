/*     */ package net.ltxprogrammer.turned.entity;
/*     */ import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
/*     */ import net.ltxprogrammer.changed.init.ChangedItems;
/*     */ import net.ltxprogrammer.changed.init.ChangedParticles;
/*     */ import net.ltxprogrammer.turned.entity.ai.TargetCheck;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.procedures.DarkLatexSpiderOnEntityTickUpdateProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.DarkLatexSpiderQueenEntityIsHurtProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.DarkLatexSpiderQueenThisEntityKillsAnotherOneProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerBossEvent;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.BossEvent;
/*     */ import net.minecraft.world.Difficulty;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.goal.BreakDoorGoal;
/*     */ import net.minecraft.world.entity.ai.goal.FloatGoal;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.animal.Bee;
/*     */ import net.minecraft.world.entity.animal.Fox;
/*     */ import net.minecraft.world.entity.animal.IronGolem;
/*     */ import net.minecraft.world.entity.monster.Evoker;
/*     */ import net.minecraft.world.entity.monster.Guardian;
/*     */ import net.minecraft.world.entity.monster.Pillager;
/*     */ import net.minecraft.world.entity.monster.Vindicator;
/*     */ import net.minecraft.world.entity.monster.Witch;
/*     */ import net.minecraft.world.entity.monster.Zombie;
/*     */ import net.minecraft.world.entity.monster.ZombieVillager;
/*     */ import net.minecraft.world.entity.monster.piglin.Piglin;
/*     */ import net.minecraft.world.entity.monster.piglin.PiglinBrute;
/*     */ import net.minecraft.world.entity.npc.Villager;
/*     */ import net.minecraft.world.entity.npc.WanderingTrader;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class DarkLatexSpiderQueenEntity extends AbstractDarkLatexEntity {
/*  58 */   private final ServerBossEvent bossInfo = new ServerBossEvent(m_5446_(), BossEvent.BossBarColor.RED, BossEvent.BossBarOverlay.PROGRESS);
/*     */ 
/*     */   
/*     */   public DarkLatexSpiderQueenEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  62 */     this((EntityType<DarkLatexSpiderQueenEntity>)LatexModEntities.DARK_LATEX_SPIDER_QUEEN.get(), world);
/*     */   }
/*     */   
/*     */   public DarkLatexSpiderQueenEntity(EntityType<DarkLatexSpiderQueenEntity> type, Level world) {
/*  66 */     super(type, world);
/*  67 */     this.f_21364_ = 12;
/*  68 */     m_21557_(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  73 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  78 */     super.m_8099_();
/*  79 */     this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.1D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  82 */             return 4.0D + (entity.m_20205_() * entity.m_20205_());
/*     */           }
/*     */         });
/*  85 */     this.f_21346_.m_25352_(2, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, 10, false, true, TargetCheck.IS_SLIMELING));
/*  86 */     this.f_21346_.m_25352_(3, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, 10, false, true, TargetCheck.IS_GOOD));
/*  87 */     this.f_21346_.m_25352_(4, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, 10, false, true, TargetCheck.IS_EVIL));
/*  88 */     this.f_21346_.m_25352_(5, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false));
/*  89 */     this.f_21346_.m_25352_(6, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, true, false));
/*  90 */     this.f_21346_.m_25352_(7, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, true, false));
/*  91 */     this.f_21346_.m_25352_(8, (Goal)new NearestAttackableTargetGoal((Mob)this, IronGolem.class, true, false));
/*  92 */     this.f_21346_.m_25352_(9, (Goal)new NearestAttackableTargetGoal((Mob)this, Witch.class, true, false));
/*  93 */     this.f_21346_.m_25352_(10, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/*  94 */     this.f_21346_.m_25352_(11, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/*  95 */     this.f_21346_.m_25352_(12, (Goal)new NearestAttackableTargetGoal((Mob)this, Evoker.class, true, false));
/*  96 */     this.f_21346_.m_25352_(13, (Goal)new NearestAttackableTargetGoal((Mob)this, Guardian.class, true, false));
/*  97 */     this.f_21346_.m_25352_(14, (Goal)new NearestAttackableTargetGoal((Mob)this, Bee.class, true, false));
/*  98 */     this.f_21346_.m_25352_(15, (Goal)new NearestAttackableTargetGoal((Mob)this, DLbeeEntity.class, true, false));
/*  99 */     this.f_21346_.m_25352_(16, (Goal)new NearestAttackableTargetGoal((Mob)this, DarkLatexQueenBeeEntity.class, true, false));
/* 100 */     this.f_21346_.m_25352_(17, (Goal)new NearestAttackableTargetGoal((Mob)this, Fox.class, true, false));
/* 101 */     this.f_21346_.m_25352_(18, (Goal)new NearestAttackableTargetGoal((Mob)this, Zombie.class, true, false));
/* 102 */     this.f_21346_.m_25352_(19, (Goal)new NearestAttackableTargetGoal((Mob)this, ZombieVillager.class, true, false));
/* 103 */     this.f_21346_.m_25352_(20, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/* 104 */     this.f_21346_.m_25352_(21, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/* 105 */     this.f_21345_.m_25352_(22, (Goal)new BreakDoorGoal((Mob)this, e -> true));
/* 106 */     this.f_21345_.m_25352_(23, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.8D));
/* 107 */     this.f_21346_.m_25352_(24, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).m_26044_(new Class[0]));
/* 108 */     this.f_21345_.m_25352_(25, (Goal)new RandomLookAroundGoal((Mob)this));
/* 109 */     this.f_21345_.m_25352_(26, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/* 114 */     return MobType.f_21642_;
/*     */   }
/*     */   
/*     */   protected void m_7472_(DamageSource source, int looting, boolean recentlyHitIn) {
/* 118 */     super.m_7472_(source, looting, recentlyHitIn);
/* 119 */     m_19983_(new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7515_() {
/* 124 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.spider.ambient"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/* 129 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.spider.step")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 134 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 139 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/* 144 */     DarkLatexSpiderQueenEntityIsHurtProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/* 145 */     if (source.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 146 */       return false; 
/* 147 */     if (source == DamageSource.f_19315_)
/* 148 */       return false; 
/* 149 */     if (source == DamageSource.f_19314_)
/* 150 */       return false; 
/* 151 */     if (source == DamageSource.f_19320_)
/* 152 */       return false; 
/* 153 */     if (source.m_19385_().equals("witherSkull"))
/* 154 */       return false; 
/* 155 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_5993_(Entity entity, int score, DamageSource damageSource) {
/* 160 */     super.m_5993_(entity, score, damageSource);
/* 161 */     DarkLatexSpiderQueenThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6075_() {
/* 166 */     super.m_6075_();
/* 167 */     DarkLatexSpiderOnEntityTickUpdateProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6072_() {
/* 172 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6457_(ServerPlayer player) {
/* 177 */     super.m_6457_(player);
/* 178 */     this.bossInfo.m_6543_(player);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6452_(ServerPlayer player) {
/* 183 */     super.m_6452_(player);
/* 184 */     this.bossInfo.m_6539_(player);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_8024_() {
/* 189 */     super.m_8024_();
/* 190 */     this.bossInfo.m_142711_(m_21223_() / m_21233_());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 197 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 198 */     builder = builder.m_22268_(Attributes.f_22279_, 0.2D);
/* 199 */     builder = builder.m_22268_(Attributes.f_22276_, 150.0D);
/* 200 */     builder = builder.m_22268_(Attributes.f_22284_, 5.0D);
/* 201 */     builder = builder.m_22268_(Attributes.f_22281_, 8.0D);
/* 202 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 203 */     builder = builder.m_22268_(Attributes.f_22278_, 1.5D);
/* 204 */     builder = builder.m_22268_(Attributes.f_22282_, 1.0D);
/* 205 */     return builder;
/*     */   }
/*     */ 
/*     */   
/*     */   public ChangedParticles.Color3 getDripColor() {
/* 210 */     return ChangedParticles.Color3.DARK;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\DarkLatexSpiderQueenEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */