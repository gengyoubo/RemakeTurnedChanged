/*     */ package net.ltxprogrammer.turned.entity;
/*     */ import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
/*     */ import net.ltxprogrammer.changed.init.ChangedItems;
/*     */ import net.ltxprogrammer.changed.init.ChangedParticles;
/*     */ import net.ltxprogrammer.turned.entity.ai.TargetCheck;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.procedures.DarkLatexFoxThisEntityKillsAnotherOneProcedure;
/*     */ import net.minecraft.core.BlockPos;
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
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.animal.IronGolem;
/*     */ import net.minecraft.world.entity.monster.Evoker;
/*     */ import net.minecraft.world.entity.monster.Guardian;
/*     */ import net.minecraft.world.entity.monster.Pillager;
/*     */ import net.minecraft.world.entity.monster.RangedAttackMob;
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
/*     */ public class DarkLatexFoxSniperEntity extends AbstractDarkLatexEntity implements RangedAttackMob {
/*     */   public DarkLatexFoxSniperEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  55 */     this((EntityType<DarkLatexFoxSniperEntity>)LatexModEntities.DARK_LATEX_FOX_SNIPER.get(), world);
/*     */   }
/*     */   
/*     */   public DarkLatexFoxSniperEntity(EntityType<DarkLatexFoxSniperEntity> type, Level world) {
/*  59 */     super(type, world);
/*  60 */     this.f_21364_ = 6;
/*  61 */     m_21557_(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  66 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  71 */     super.m_8099_();
/*  72 */     this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.1D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  75 */             return 4.0D + (entity.m_20205_() * entity.m_20205_());
/*     */           }
/*     */         });
/*  78 */     this.f_21346_.m_25352_(2, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, 10, false, true, TargetCheck.IS_SLIMELING));
/*  79 */     this.f_21346_.m_25352_(3, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, 10, false, true, TargetCheck.IS_GOOD));
/*  80 */     this.f_21346_.m_25352_(4, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, 10, false, true, TargetCheck.IS_EVIL));
/*  81 */     this.f_21346_.m_25352_(5, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false));
/*  82 */     this.f_21346_.m_25352_(6, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, true, false));
/*  83 */     this.f_21346_.m_25352_(7, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, true, false));
/*  84 */     this.f_21346_.m_25352_(8, (Goal)new NearestAttackableTargetGoal((Mob)this, IronGolem.class, true, false));
/*  85 */     this.f_21346_.m_25352_(9, (Goal)new NearestAttackableTargetGoal((Mob)this, Witch.class, true, false));
/*  86 */     this.f_21346_.m_25352_(10, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/*  87 */     this.f_21346_.m_25352_(11, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/*  88 */     this.f_21346_.m_25352_(12, (Goal)new NearestAttackableTargetGoal((Mob)this, Evoker.class, true, false));
/*  89 */     this.f_21346_.m_25352_(13, (Goal)new NearestAttackableTargetGoal((Mob)this, Guardian.class, true, false));
/*  90 */     this.f_21346_.m_25352_(14, (Goal)new NearestAttackableTargetGoal((Mob)this, Zombie.class, true, false));
/*  91 */     this.f_21346_.m_25352_(15, (Goal)new NearestAttackableTargetGoal((Mob)this, ZombieVillager.class, true, false));
/*  92 */     this.f_21346_.m_25352_(16, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/*  93 */     this.f_21346_.m_25352_(17, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/*  94 */     this.f_21345_.m_25352_(18, (Goal)new BreakDoorGoal((Mob)this, e -> true));
/*  95 */     this.f_21345_.m_25352_(19, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.8D));
/*  96 */     this.f_21346_.m_25352_(20, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).m_26044_(new Class[0]));
/*  97 */     this.f_21345_.m_25352_(21, (Goal)new RandomLookAroundGoal((Mob)this));
/*  98 */     this.f_21345_.m_25352_(22, (Goal)new FloatGoal((Mob)this));
/*  99 */     this.f_21345_.m_25352_(1, (Goal)new RangedAttackGoal(this, 1.25D, 20, 10.0F)
/*     */         {
/*     */           public boolean m_8045_() {
/* 102 */             return m_8036_();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/* 109 */     return MobType.f_21642_;
/*     */   }
/*     */   
/*     */   protected void m_7472_(DamageSource source, int looting, boolean recentlyHitIn) {
/* 113 */     super.m_7472_(source, looting, recentlyHitIn);
/* 114 */     m_19983_(new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/* 119 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 124 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 129 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/* 134 */     if (source == DamageSource.f_19315_)
/* 135 */       return false; 
/* 136 */     if (source == DamageSource.f_19314_)
/* 137 */       return false; 
/* 138 */     if (source == DamageSource.f_19320_)
/* 139 */       return false; 
/* 140 */     if (source.m_19385_().equals("witherSkull"))
/* 141 */       return false; 
/* 142 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_5993_(Entity entity, int score, DamageSource damageSource) {
/* 147 */     super.m_5993_(entity, score, damageSource);
/* 148 */     DarkLatexFoxThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6504_(LivingEntity target, float flval) {
/* 153 */     LatexDartRifleEntity.shoot((LivingEntity)this, target);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 160 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 161 */     builder = builder.m_22268_(Attributes.f_22279_, 0.4D);
/* 162 */     builder = builder.m_22268_(Attributes.f_22276_, 18.0D);
/* 163 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 164 */     builder = builder.m_22268_(Attributes.f_22281_, 4.0D);
/* 165 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 166 */     builder = builder.m_22268_(Attributes.f_22278_, 0.3D);
/* 167 */     return builder;
/*     */   }
/*     */ 
/*     */   
/*     */   public ChangedParticles.Color3 getDripColor() {
/* 172 */     return ChangedParticles.Color3.DARK;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\DarkLatexFoxSniperEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */