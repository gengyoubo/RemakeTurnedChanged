/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.CheckEvilProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckGoodProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckSlimelingProcedure;
/*     */ import net.mcreator.latexes.procedures.DarkLatexSpiderOnEntityTickUpdateProcedure;
/*     */ import net.mcreator.latexes.procedures.DarkLatexSpiderThisEntityKillsAnotherOneProcedure;
/*     */ import net.mcreator.latexes.procedures.DarklatexEntityDiesProcedure;
/*     */ import net.mcreator.latexes.procedures.TargetwearingmaskProcedure;
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
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.animal.Bee;
/*     */ import net.minecraft.world.entity.animal.Fox;
/*     */ import net.minecraft.world.entity.animal.IronGolem;
/*     */ import net.minecraft.world.entity.monster.Evoker;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.monster.Pillager;
/*     */ import net.minecraft.world.entity.monster.Vindicator;
/*     */ import net.minecraft.world.entity.monster.Witch;
/*     */ import net.minecraft.world.entity.monster.ZombieVillager;
/*     */ import net.minecraft.world.entity.monster.piglin.Piglin;
/*     */ import net.minecraft.world.entity.monster.piglin.PiglinBrute;
/*     */ import net.minecraft.world.entity.npc.Villager;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class DarkLatexSpiderEntity extends Monster {
/*     */   public DarkLatexSpiderEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  58 */     this((EntityType<DarkLatexSpiderEntity>)LatexModEntities.DARK_LATEX_SPIDER.get(), world);
/*     */   }
/*     */   
/*     */   public DarkLatexSpiderEntity(EntityType<DarkLatexSpiderEntity> type, Level world) {
/*  62 */     super(type, world);
/*  63 */     this.xpReward = 8;
/*  64 */     setNoAi(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  69 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  74 */     super.registerGoals();
/*  75 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.1D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  78 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canUse() {
/*  83 */             double x = DarkLatexSpiderEntity.this.getX();
/*  84 */             double y = DarkLatexSpiderEntity.this.getY();
/*  85 */             double z = DarkLatexSpiderEntity.this.getZ();
/*  86 */             DarkLatexSpiderEntity darkLatexSpiderEntity = DarkLatexSpiderEntity.this;
/*  87 */             Level world = DarkLatexSpiderEntity.this.level;
/*  88 */             return (super.canUse() && TargetwearingmaskProcedure.execute((Entity)darkLatexSpiderEntity));
/*     */           }
/*     */         });
/*     */     
/*  92 */     this.targetSelector.addGoal(2, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, false, false)
/*     */         {
/*     */           public boolean canUse() {
/*  95 */             double x = DarkLatexSpiderEntity.this.getX();
/*  96 */             double y = DarkLatexSpiderEntity.this.getY();
/*  97 */             double z = DarkLatexSpiderEntity.this.getZ();
/*  98 */             DarkLatexSpiderEntity darkLatexSpiderEntity = DarkLatexSpiderEntity.this;
/*  99 */             Level world = DarkLatexSpiderEntity.this.level;
/* 100 */             return (super.canUse() && CheckSlimelingProcedure.execute((Entity)darkLatexSpiderEntity));
/*     */           }
/*     */         });
/* 103 */     this.targetSelector.addGoal(3, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 106 */             double x = DarkLatexSpiderEntity.this.getX();
/* 107 */             double y = DarkLatexSpiderEntity.this.getY();
/* 108 */             double z = DarkLatexSpiderEntity.this.getZ();
/* 109 */             DarkLatexSpiderEntity darkLatexSpiderEntity = DarkLatexSpiderEntity.this;
/* 110 */             Level world = DarkLatexSpiderEntity.this.level;
/* 111 */             return (super.canUse() && CheckGoodProcedure.execute((Entity)darkLatexSpiderEntity));
/*     */           }
/*     */         });
/* 114 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 117 */             double x = DarkLatexSpiderEntity.this.getX();
/* 118 */             double y = DarkLatexSpiderEntity.this.getY();
/* 119 */             double z = DarkLatexSpiderEntity.this.getZ();
/* 120 */             DarkLatexSpiderEntity darkLatexSpiderEntity = DarkLatexSpiderEntity.this;
/* 121 */             Level world = DarkLatexSpiderEntity.this.level;
/* 122 */             return (super.canUse() && CheckEvilProcedure.execute((Entity)darkLatexSpiderEntity));
/*     */           }
/*     */         });
/* 125 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false));
/* 126 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, DarkLatexQueenBeeEntity.class, true, false));
/* 127 */     this.targetSelector.addGoal(7, (Goal)new NearestAttackableTargetGoal((Mob)this, DLbeeEntity.class, true, false));
/* 128 */     this.targetSelector.addGoal(8, (Goal)new NearestAttackableTargetGoal((Mob)this, Bee.class, true, false));
/* 129 */     this.targetSelector.addGoal(9, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, true, false));
/* 130 */     this.targetSelector.addGoal(10, (Goal)new NearestAttackableTargetGoal((Mob)this, IronGolem.class, true, false));
/* 131 */     this.targetSelector.addGoal(11, (Goal)new NearestAttackableTargetGoal((Mob)this, Witch.class, true, false));
/* 132 */     this.targetSelector.addGoal(12, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/* 133 */     this.targetSelector.addGoal(13, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/* 134 */     this.targetSelector.addGoal(14, (Goal)new NearestAttackableTargetGoal((Mob)this, Evoker.class, true, false));
/* 135 */     this.targetSelector.addGoal(15, (Goal)new NearestAttackableTargetGoal((Mob)this, Fox.class, true, false));
/* 136 */     this.targetSelector.addGoal(16, (Goal)new NearestAttackableTargetGoal((Mob)this, ZombieVillager.class, true, false));
/* 137 */     this.targetSelector.addGoal(17, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/* 138 */     this.targetSelector.addGoal(18, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/* 139 */     this.goalSelector.addGoal(19, (Goal)new BreakDoorGoal((Mob)this, e -> true));
/* 140 */     this.goalSelector.addGoal(20, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.8D));
/* 141 */     this.targetSelector.addGoal(21, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).setAlertOthers(new Class[0]));
/* 142 */     this.goalSelector.addGoal(22, (Goal)new RandomLookAroundGoal((Mob)this));
/* 143 */     this.goalSelector.addGoal(23, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 148 */     return MobType.ARTHROPOD;
/*     */   }
/*     */   
/*     */   protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
/* 152 */     super.dropCustomDeathLoot(source, looting, recentlyHitIn);
/* 153 */     spawnAtLocation(new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getAmbientSound() {
/* 158 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.spider.ambient"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 163 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.spider.step")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 168 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 173 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 178 */     if (source.getDirectEntity() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.getDirectEntity() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 179 */       return false; 
/* 180 */     if (source == DamageSource.FALL)
/* 181 */       return false; 
/* 182 */     if (source == DamageSource.CACTUS)
/* 183 */       return false; 
/* 184 */     if (source == DamageSource.WITHER)
/* 185 */       return false; 
/* 186 */     if (source.getMsgId().equals("witherSkull"))
/* 187 */       return false; 
/* 188 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 193 */     super.die(source);
/* 194 */     DarklatexEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
/* 199 */     super.awardKillScore(entity, score, damageSource);
/* 200 */     DarkLatexSpiderThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public void baseTick() {
/* 205 */     super.baseTick();
/* 206 */     DarkLatexSpiderOnEntityTickUpdateProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 213 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 214 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25D);
/* 215 */     builder = builder.add(Attributes.MAX_HEALTH, 25.0D);
/* 216 */     builder = builder.add(Attributes.ARMOR, 2.0D);
/* 217 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 5.0D);
/* 218 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 219 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.5D);
/* 220 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\DarkLatexSpiderEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */