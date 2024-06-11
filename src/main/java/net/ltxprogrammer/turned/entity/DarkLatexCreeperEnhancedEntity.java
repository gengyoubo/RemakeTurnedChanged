/*     */ package net.ltxprogrammer.turned.entity;
/*     */ import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
/*     */ import net.ltxprogrammer.changed.init.ChangedItems;
/*     */ import net.ltxprogrammer.changed.init.ChangedParticles;
/*     */ import net.ltxprogrammer.turned.entity.ai.TargetCheck;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.init.LatexModParticleTypes;
/*     */ import net.ltxprogrammer.turned.procedures.DarkLatexCreeperEnhancedDiesProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.DarkLatexCreeperEnhancedEntityIsHurtProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.DarkLatexCreeperEnhancedThisEntityKillsAnotherOneProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.DarkLatexCreeperPlayerCollidesWithThisEntityProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.particles.ParticleOptions;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
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
/*     */ import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
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
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class DarkLatexCreeperEnhancedEntity extends AbstractDarkLatexEntity {
/*     */   public DarkLatexCreeperEnhancedEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  61 */     this((EntityType<DarkLatexCreeperEnhancedEntity>)LatexModEntities.DARK_LATEX_CREEPER_ENHANCED.get(), world);
/*     */   }
/*     */   
/*     */   public DarkLatexCreeperEnhancedEntity(EntityType<DarkLatexCreeperEnhancedEntity> type, Level world) {
/*  65 */     super(type, world);
/*  66 */     this.f_21364_ = 6;
/*  67 */     m_21557_(false);
/*  68 */     m_21530_();
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
/*  79 */     this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.5D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  82 */             return 4.0D + (entity.m_20205_() * entity.m_20205_());
/*     */           }
/*     */         });
/*  85 */     this.f_21346_.m_25352_(2, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).m_26044_(new Class[0]));
/*  86 */     this.f_21346_.m_25352_(3, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, 10, false, false, TargetCheck.IS_SLIMELING));
/*  87 */     this.f_21346_.m_25352_(4, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, 10, true, false, TargetCheck.IS_GOOD));
/*  88 */     this.f_21346_.m_25352_(5, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, 10, true, false, TargetCheck.IS_EVIL));
/*  89 */     this.f_21346_.m_25352_(6, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false));
/*  90 */     this.f_21346_.m_25352_(7, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, true, false));
/*  91 */     this.f_21346_.m_25352_(8, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, true, false));
/*  92 */     this.f_21346_.m_25352_(9, (Goal)new NearestAttackableTargetGoal((Mob)this, IronGolem.class, true, false));
/*  93 */     this.f_21346_.m_25352_(10, (Goal)new NearestAttackableTargetGoal((Mob)this, Witch.class, true, false));
/*  94 */     this.f_21346_.m_25352_(11, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/*  95 */     this.f_21346_.m_25352_(12, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/*  96 */     this.f_21346_.m_25352_(13, (Goal)new NearestAttackableTargetGoal((Mob)this, Evoker.class, true, false));
/*  97 */     this.f_21346_.m_25352_(14, (Goal)new NearestAttackableTargetGoal((Mob)this, Guardian.class, true, false));
/*  98 */     this.f_21346_.m_25352_(15, (Goal)new NearestAttackableTargetGoal((Mob)this, Bee.class, true, false));
/*  99 */     this.f_21346_.m_25352_(16, (Goal)new NearestAttackableTargetGoal((Mob)this, Fox.class, true, false));
/* 100 */     this.f_21346_.m_25352_(17, (Goal)new NearestAttackableTargetGoal((Mob)this, Zombie.class, true, false));
/* 101 */     this.f_21346_.m_25352_(18, (Goal)new NearestAttackableTargetGoal((Mob)this, ZombieVillager.class, true, false));
/* 102 */     this.f_21346_.m_25352_(19, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/* 103 */     this.f_21346_.m_25352_(20, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/* 104 */     this.f_21345_.m_25352_(21, (Goal)new BreakDoorGoal((Mob)this, e -> true));
/* 105 */     this.f_21345_.m_25352_(22, (Goal)new LookAtPlayerGoal((Mob)this, LivingEntity.class, 8.0F));
/* 106 */     this.f_21345_.m_25352_(23, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.7D));
/* 107 */     this.f_21345_.m_25352_(24, (Goal)new RandomLookAroundGoal((Mob)this));
/* 108 */     this.f_21345_.m_25352_(25, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/* 113 */     return MobType.f_21642_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/* 118 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public double m_6048_() {
/* 123 */     return super.m_6048_() + 1.5D;
/*     */   }
/*     */   
/*     */   protected void m_7472_(DamageSource source, int looting, boolean recentlyHitIn) {
/* 127 */     super.m_7472_(source, looting, recentlyHitIn);
/* 128 */     m_19983_(new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/* 133 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 138 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 143 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/* 148 */     DarkLatexCreeperEnhancedEntityIsHurtProcedure.execute((Entity)this);
/* 149 */     if (source == DamageSource.f_19315_)
/* 150 */       return false; 
/* 151 */     if (source == DamageSource.f_19314_)
/* 152 */       return false; 
/* 153 */     if (source == DamageSource.f_19320_)
/* 154 */       return false; 
/* 155 */     if (source.m_19385_().equals("witherSkull"))
/* 156 */       return false; 
/* 157 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6667_(DamageSource source) {
/* 162 */     super.m_6667_(source);
/* 163 */     DarkLatexCreeperEnhancedDiesProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_5993_(Entity entity, int score, DamageSource damageSource) {
/* 168 */     super.m_5993_(entity, score, damageSource);
/* 169 */     DarkLatexCreeperEnhancedThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), entity, (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6123_(Player sourceentity) {
/* 174 */     super.m_6123_(sourceentity);
/* 175 */     DarkLatexCreeperPlayerCollidesWithThisEntityProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), (Entity)this, (Entity)sourceentity);
/*     */   }
/*     */   
/*     */   public void m_8107_() {
/* 179 */     super.m_8107_();
/* 180 */     double x = m_20185_();
/* 181 */     double y = m_20186_();
/* 182 */     double z = m_20189_();
/* 183 */     DarkLatexCreeperEnhancedEntity darkLatexCreeperEnhancedEntity = this;
/* 184 */     Level world = this.f_19853_;
/* 185 */     for (int l = 0; l < 2; l++) {
/* 186 */       double x0 = x + this.f_19796_.nextFloat();
/* 187 */       double y0 = y + this.f_19796_.nextFloat();
/* 188 */       double z0 = z + this.f_19796_.nextFloat();
/* 189 */       double dx = (this.f_19796_.nextFloat() - 0.5D) * 0.3999999985098839D;
/* 190 */       double dy = (this.f_19796_.nextFloat() - 0.5D) * 0.3999999985098839D;
/* 191 */       double dz = (this.f_19796_.nextFloat() - 0.5D) * 0.3999999985098839D;
/* 192 */       world.m_7106_((ParticleOptions)LatexModParticleTypes.DLEFFECTPARTICLES.get(), x0, y0, z0, dx, dy, dz);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 200 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 201 */     builder = builder.m_22268_(Attributes.f_22279_, 0.3D);
/* 202 */     builder = builder.m_22268_(Attributes.f_22276_, 56.0D);
/* 203 */     builder = builder.m_22268_(Attributes.f_22284_, 1.5D);
/* 204 */     builder = builder.m_22268_(Attributes.f_22281_, 5.0D);
/* 205 */     builder = builder.m_22268_(Attributes.f_22277_, 24.0D);
/* 206 */     builder = builder.m_22268_(Attributes.f_22278_, 1.0D);
/* 207 */     builder = builder.m_22268_(Attributes.f_22282_, 0.5D);
/* 208 */     return builder;
/*     */   }
/*     */ 
/*     */   
/*     */   public ChangedParticles.Color3 getDripColor() {
/* 213 */     return ChangedParticles.Color3.DARK;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\DarkLatexCreeperEnhancedEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */