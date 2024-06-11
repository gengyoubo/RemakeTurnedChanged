/*     */ package net.ltxprogrammer.turned.entity;
/*     */ import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
/*     */ import net.ltxprogrammer.changed.init.ChangedItems;
/*     */ import net.ltxprogrammer.changed.init.ChangedParticles;
/*     */ import net.ltxprogrammer.turned.entity.ai.TargetCheck;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.init.LatexModParticleTypes;
/*     */ import net.ltxprogrammer.turned.procedures.DarkLatexCreeperEnhancedEntityIsHurtProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.DarkLatexCreeperPlayerCollidesWithThisEntityProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.DarkLatexCreeperRightClickedOnEntityProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.DarkLatexCreeperdiesProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.particles.ParticleOptions;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.Difficulty;
/*     */ import net.minecraft.world.InteractionHand;
/*     */ import net.minecraft.world.InteractionResult;
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
/*     */ import net.minecraft.world.entity.ai.goal.LeapAtTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
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
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.common.DungeonHooks;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class DarkLatexCreeperEntity extends AbstractDarkLatexEntity {
/*     */   public DarkLatexCreeperEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  65 */     this((EntityType<DarkLatexCreeperEntity>)LatexModEntities.DARK_LATEX_CREEPER.get(), world);
/*     */   }
/*     */   
/*     */   public DarkLatexCreeperEntity(EntityType<DarkLatexCreeperEntity> type, Level world) {
/*  69 */     super(type, world);
/*  70 */     this.f_21364_ = 6;
/*  71 */     m_21557_(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  76 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  81 */     super.m_8099_();
/*  82 */     this.f_21346_.m_25352_(2, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).m_26044_(new Class[0]));
/*  83 */     this.f_21346_.m_25352_(3, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, 10, false, false, TargetCheck.IS_SLIMELING));
/*  84 */     this.f_21346_.m_25352_(4, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, 10, true, false, TargetCheck.IS_GOOD));
/*  85 */     this.f_21346_.m_25352_(5, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, 10, true, false, TargetCheck.IS_EVIL));
/*  86 */     this.f_21346_.m_25352_(6, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false));
/*  87 */     this.f_21346_.m_25352_(7, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, true, false));
/*  88 */     this.f_21346_.m_25352_(8, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, true, false));
/*  89 */     this.f_21346_.m_25352_(9, (Goal)new NearestAttackableTargetGoal((Mob)this, IronGolem.class, true, false));
/*  90 */     this.f_21346_.m_25352_(10, (Goal)new NearestAttackableTargetGoal((Mob)this, Witch.class, true, false));
/*  91 */     this.f_21346_.m_25352_(11, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/*  92 */     this.f_21346_.m_25352_(12, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/*  93 */     this.f_21346_.m_25352_(13, (Goal)new NearestAttackableTargetGoal((Mob)this, Evoker.class, true, false));
/*  94 */     this.f_21346_.m_25352_(14, (Goal)new NearestAttackableTargetGoal((Mob)this, Guardian.class, true, false));
/*  95 */     this.f_21346_.m_25352_(15, (Goal)new NearestAttackableTargetGoal((Mob)this, Bee.class, true, false));
/*  96 */     this.f_21346_.m_25352_(16, (Goal)new NearestAttackableTargetGoal((Mob)this, Fox.class, true, false));
/*  97 */     this.f_21346_.m_25352_(17, (Goal)new NearestAttackableTargetGoal((Mob)this, Zombie.class, true, false));
/*  98 */     this.f_21346_.m_25352_(18, (Goal)new NearestAttackableTargetGoal((Mob)this, ZombieVillager.class, true, false));
/*  99 */     this.f_21346_.m_25352_(19, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/* 100 */     this.f_21346_.m_25352_(20, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/* 101 */     this.f_21345_.m_25352_(21, (Goal)new BreakDoorGoal((Mob)this, e -> true));
/* 102 */     this.f_21345_.m_25352_(22, (Goal)new LookAtPlayerGoal((Mob)this, DarkLatexCreeperEnhancedEntity.class, 8.0F));
/* 103 */     this.f_21345_.m_25352_(23, (Goal)new LeapAtTargetGoal((Mob)this, 0.5F));
/* 104 */     this.f_21345_.m_25352_(24, (Goal)new LookAtPlayerGoal((Mob)this, LivingEntity.class, 6.0F));
/* 105 */     this.f_21345_.m_25352_(25, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.8D));
/* 106 */     this.f_21345_.m_25352_(26, (Goal)new RandomLookAroundGoal((Mob)this));
/* 107 */     this.f_21345_.m_25352_(27, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/* 112 */     return MobType.f_21642_;
/*     */   }
/*     */   
/*     */   protected void m_7472_(DamageSource source, int looting, boolean recentlyHitIn) {
/* 116 */     super.m_7472_(source, looting, recentlyHitIn);
/* 117 */     m_19983_(new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/* 122 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 127 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 132 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/* 137 */     DarkLatexCreeperEnhancedEntityIsHurtProcedure.execute((Entity)this);
/* 138 */     if (source == DamageSource.f_19315_)
/* 139 */       return false; 
/* 140 */     if (source == DamageSource.f_19314_)
/* 141 */       return false; 
/* 142 */     if (source == DamageSource.f_19320_)
/* 143 */       return false; 
/* 144 */     if (source.m_19385_().equals("witherSkull"))
/* 145 */       return false; 
/* 146 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6667_(DamageSource source) {
/* 151 */     super.m_6667_(source);
/* 152 */     DarkLatexCreeperdiesProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult m_6071_(Player sourceentity, InteractionHand hand) {
/* 157 */     ItemStack itemstack = sourceentity.m_21120_(hand);
/* 158 */     InteractionResult retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 159 */     super.m_6071_(sourceentity, hand);
/* 160 */     double x = m_20185_();
/* 161 */     double y = m_20186_();
/* 162 */     double z = m_20189_();
/* 163 */     DarkLatexCreeperEntity darkLatexCreeperEntity = this;
/* 164 */     Level world = this.f_19853_;
/*     */     
/* 166 */     DarkLatexCreeperRightClickedOnEntityProcedure.execute((LevelAccessor)world, x, y, z, (Entity)darkLatexCreeperEntity);
/* 167 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6123_(Player sourceentity) {
/* 172 */     super.m_6123_(sourceentity);
/* 173 */     DarkLatexCreeperPlayerCollidesWithThisEntityProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), (Entity)this, (Entity)sourceentity);
/*     */   }
/*     */   
/*     */   public void m_8107_() {
/* 177 */     super.m_8107_();
/* 178 */     double x = m_20185_();
/* 179 */     double y = m_20186_();
/* 180 */     double z = m_20189_();
/* 181 */     DarkLatexCreeperEntity darkLatexCreeperEntity = this;
/* 182 */     Level world = this.f_19853_;
/* 183 */     for (int l = 0; l < 2; l++) {
/* 184 */       double x0 = x + this.f_19796_.nextFloat();
/* 185 */       double y0 = y + this.f_19796_.nextFloat();
/* 186 */       double z0 = z + this.f_19796_.nextFloat();
/* 187 */       double dx = (this.f_19796_.nextFloat() - 0.5D) * 0.3999999985098839D;
/* 188 */       double dy = (this.f_19796_.nextFloat() - 0.5D) * 0.3999999985098839D;
/* 189 */       double dz = (this.f_19796_.nextFloat() - 0.5D) * 0.3999999985098839D;
/* 190 */       world.m_7106_((ParticleOptions)LatexModParticleTypes.DLEFFECTPARTICLES.get(), x0, y0, z0, dx, dy, dz);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void init() {
/* 195 */     DungeonHooks.addDungeonMob((EntityType)LatexModEntities.DARK_LATEX_CREEPER.get(), 180);
/*     */   }
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 199 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 200 */     builder = builder.m_22268_(Attributes.f_22279_, 0.2D);
/* 201 */     builder = builder.m_22268_(Attributes.f_22276_, 12.0D);
/* 202 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 203 */     builder = builder.m_22268_(Attributes.f_22281_, 1.0D);
/* 204 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 205 */     builder = builder.m_22268_(Attributes.f_22282_, 1.0D);
/* 206 */     return builder;
/*     */   }
/*     */ 
/*     */   
/*     */   public ChangedParticles.Color3 getDripColor() {
/* 211 */     return ChangedParticles.Color3.DARK;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\DarkLatexCreeperEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */