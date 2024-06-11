/*     */ package net.mcreator.latexes.entity;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.init.LatexModParticleTypes;
/*     */ import net.mcreator.latexes.procedures.CheckEvilProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckGoodProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckSlimelingProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckentityislatexProcedure;
/*     */ import net.mcreator.latexes.procedures.DarkLatexCreeperEnhancedDiesProcedure;
/*     */ import net.mcreator.latexes.procedures.DarkLatexCreeperEnhancedEntityIsHurtProcedure;
/*     */ import net.mcreator.latexes.procedures.DarkLatexCreeperEnhancedThisEntityKillsAnotherOneProcedure;
/*     */ import net.mcreator.latexes.procedures.DarkLatexCreeperPlayerCollidesWithThisEntityProcedure;
/*     */ import net.mcreator.latexes.procedures.TargetwearingmaskProcedure;
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
/*     */ import net.minecraft.world.entity.monster.Monster;
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
/*     */ public class DarkLatexCreeperEnhancedEntity extends Monster {
/*     */   public DarkLatexCreeperEnhancedEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  64 */     this((EntityType<DarkLatexCreeperEnhancedEntity>)LatexModEntities.DARK_LATEX_CREEPER_ENHANCED.get(), world);
/*     */   }
/*     */   
/*     */   public DarkLatexCreeperEnhancedEntity(EntityType<DarkLatexCreeperEnhancedEntity> type, Level world) {
/*  68 */     super(type, world);
/*  69 */     this.xpReward = 6;
/*  70 */     setNoAi(false);
/*  71 */     setPersistenceRequired();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  76 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  81 */     super.registerGoals();
/*  82 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.5D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  85 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canUse() {
/*  90 */             double x = DarkLatexCreeperEnhancedEntity.this.getX();
/*  91 */             double y = DarkLatexCreeperEnhancedEntity.this.getY();
/*  92 */             double z = DarkLatexCreeperEnhancedEntity.this.getZ();
/*  93 */             DarkLatexCreeperEnhancedEntity darkLatexCreeperEnhancedEntity = DarkLatexCreeperEnhancedEntity.this;
/*  94 */             Level world = DarkLatexCreeperEnhancedEntity.this.level;
/*  95 */             return (super.canUse() && TargetwearingmaskProcedure.execute((Entity)darkLatexCreeperEnhancedEntity));
/*     */           }
/*     */         });
/*     */     
/*  99 */     this.targetSelector.addGoal(2, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).setAlertOthers(new Class[0]));
/* 100 */     this.targetSelector.addGoal(3, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, false, false)
/*     */         {
/*     */           public boolean canUse() {
/* 103 */             double x = DarkLatexCreeperEnhancedEntity.this.getX();
/* 104 */             double y = DarkLatexCreeperEnhancedEntity.this.getY();
/* 105 */             double z = DarkLatexCreeperEnhancedEntity.this.getZ();
/* 106 */             DarkLatexCreeperEnhancedEntity darkLatexCreeperEnhancedEntity = DarkLatexCreeperEnhancedEntity.this;
/* 107 */             Level world = DarkLatexCreeperEnhancedEntity.this.level;
/* 108 */             return (super.canUse() && CheckSlimelingProcedure.execute((Entity)darkLatexCreeperEnhancedEntity));
/*     */           }
/*     */         });
/* 111 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 114 */             double x = DarkLatexCreeperEnhancedEntity.this.getX();
/* 115 */             double y = DarkLatexCreeperEnhancedEntity.this.getY();
/* 116 */             double z = DarkLatexCreeperEnhancedEntity.this.getZ();
/* 117 */             DarkLatexCreeperEnhancedEntity darkLatexCreeperEnhancedEntity = DarkLatexCreeperEnhancedEntity.this;
/* 118 */             Level world = DarkLatexCreeperEnhancedEntity.this.level;
/* 119 */             return (super.canUse() && CheckGoodProcedure.execute((Entity)darkLatexCreeperEnhancedEntity));
/*     */           }
/*     */         });
/* 122 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 125 */             double x = DarkLatexCreeperEnhancedEntity.this.getX();
/* 126 */             double y = DarkLatexCreeperEnhancedEntity.this.getY();
/* 127 */             double z = DarkLatexCreeperEnhancedEntity.this.getZ();
/* 128 */             DarkLatexCreeperEnhancedEntity darkLatexCreeperEnhancedEntity = DarkLatexCreeperEnhancedEntity.this;
/* 129 */             Level world = DarkLatexCreeperEnhancedEntity.this.level;
/* 130 */             return (super.canUse() && CheckEvilProcedure.execute((Entity)darkLatexCreeperEnhancedEntity));
/*     */           }
/*     */         });
/* 133 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false));
/* 134 */     this.targetSelector.addGoal(7, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, true, false));
/* 135 */     this.targetSelector.addGoal(8, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, true, false));
/* 136 */     this.targetSelector.addGoal(9, (Goal)new NearestAttackableTargetGoal((Mob)this, IronGolem.class, true, false));
/* 137 */     this.targetSelector.addGoal(10, (Goal)new NearestAttackableTargetGoal((Mob)this, Witch.class, true, false));
/* 138 */     this.targetSelector.addGoal(11, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/* 139 */     this.targetSelector.addGoal(12, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/* 140 */     this.targetSelector.addGoal(13, (Goal)new NearestAttackableTargetGoal((Mob)this, Evoker.class, true, false));
/* 141 */     this.targetSelector.addGoal(14, (Goal)new NearestAttackableTargetGoal((Mob)this, Guardian.class, true, false));
/* 142 */     this.targetSelector.addGoal(15, (Goal)new NearestAttackableTargetGoal((Mob)this, Bee.class, true, false));
/* 143 */     this.targetSelector.addGoal(16, (Goal)new NearestAttackableTargetGoal((Mob)this, Fox.class, true, false));
/* 144 */     this.targetSelector.addGoal(17, (Goal)new NearestAttackableTargetGoal((Mob)this, Zombie.class, true, false));
/* 145 */     this.targetSelector.addGoal(18, (Goal)new NearestAttackableTargetGoal((Mob)this, ZombieVillager.class, true, false));
/* 146 */     this.targetSelector.addGoal(19, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/* 147 */     this.targetSelector.addGoal(20, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/* 148 */     this.goalSelector.addGoal(21, (Goal)new BreakDoorGoal((Mob)this, e -> true));
/* 149 */     this.goalSelector.addGoal(22, (Goal)new LookAtPlayerGoal((Mob)this, LivingEntity.class, 8.0F)
/*     */         {
/*     */           public boolean canUse() {
/* 152 */             double x = DarkLatexCreeperEnhancedEntity.this.getX();
/* 153 */             double y = DarkLatexCreeperEnhancedEntity.this.getY();
/* 154 */             double z = DarkLatexCreeperEnhancedEntity.this.getZ();
/* 155 */             DarkLatexCreeperEnhancedEntity darkLatexCreeperEnhancedEntity = DarkLatexCreeperEnhancedEntity.this;
/* 156 */             Level world = DarkLatexCreeperEnhancedEntity.this.level;
/* 157 */             return (super.canUse() && CheckentityislatexProcedure.execute((Entity)darkLatexCreeperEnhancedEntity));
/*     */           }
/*     */         });
/* 160 */     this.goalSelector.addGoal(23, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.7D));
/* 161 */     this.goalSelector.addGoal(24, (Goal)new RandomLookAroundGoal((Mob)this));
/* 162 */     this.goalSelector.addGoal(25, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 167 */     return MobType.ARTHROPOD;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/* 172 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public double getPassengersRidingOffset() {
/* 177 */     return super.getPassengersRidingOffset() + 1.5D;
/*     */   }
/*     */   
/*     */   protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
/* 181 */     super.dropCustomDeathLoot(source, looting, recentlyHitIn);
/* 182 */     spawnAtLocation(new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 187 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 192 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 197 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 202 */     DarkLatexCreeperEnhancedEntityIsHurtProcedure.execute((Entity)this);
/* 203 */     if (source == DamageSource.FALL)
/* 204 */       return false; 
/* 205 */     if (source == DamageSource.CACTUS)
/* 206 */       return false; 
/* 207 */     if (source == DamageSource.WITHER)
/* 208 */       return false; 
/* 209 */     if (source.getMsgId().equals("witherSkull"))
/* 210 */       return false; 
/* 211 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 216 */     super.die(source);
/* 217 */     DarkLatexCreeperEnhancedDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
/* 222 */     super.awardKillScore(entity, score, damageSource);
/* 223 */     DarkLatexCreeperEnhancedThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), entity, (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void playerTouch(Player sourceentity) {
/* 228 */     super.playerTouch(sourceentity);
/* 229 */     DarkLatexCreeperPlayerCollidesWithThisEntityProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), (Entity)this, (Entity)sourceentity);
/*     */   }
/*     */   
/*     */   public void aiStep() {
/* 233 */     super.aiStep();
/* 234 */     double x = getX();
/* 235 */     double y = getY();
/* 236 */     double z = getZ();
/* 237 */     DarkLatexCreeperEnhancedEntity darkLatexCreeperEnhancedEntity = this;
/* 238 */     Level world = this.level;
/* 239 */     for (int l = 0; l < 2; l++) {
/* 240 */       double x0 = x + this.random.nextFloat();
/* 241 */       double y0 = y + this.random.nextFloat();
/* 242 */       double z0 = z + this.random.nextFloat();
/* 243 */       double dx = (this.random.nextFloat() - 0.5D) * 0.3999999985098839D;
/* 244 */       double dy = (this.random.nextFloat() - 0.5D) * 0.3999999985098839D;
/* 245 */       double dz = (this.random.nextFloat() - 0.5D) * 0.3999999985098839D;
/* 246 */       world.addParticle((ParticleOptions)LatexModParticleTypes.DLEFFECTPARTICLES.get(), x0, y0, z0, dx, dy, dz);
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 254 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 255 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3D);
/* 256 */     builder = builder.add(Attributes.MAX_HEALTH, 56.0D);
/* 257 */     builder = builder.add(Attributes.ARMOR, 1.5D);
/* 258 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 5.0D);
/* 259 */     builder = builder.add(Attributes.FOLLOW_RANGE, 24.0D);
/* 260 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 1.0D);
/* 261 */     builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.5D);
/* 262 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\DarkLatexCreeperEnhancedEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */