/*     */ package net.mcreator.latexes.entity;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.CheckEvilProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckGoodProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckSlimelingProcedure;
/*     */ import net.mcreator.latexes.procedures.DarkLatexFoxThisEntityKillsAnotherOneProcedure;
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
/*     */ import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.animal.IronGolem;
/*     */ import net.minecraft.world.entity.monster.Evoker;
/*     */ import net.minecraft.world.entity.monster.Guardian;
/*     */ import net.minecraft.world.entity.monster.Monster;
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
/*     */ public class DarkLatexFoxSniperEntity extends Monster implements RangedAttackMob {
/*     */   public DarkLatexFoxSniperEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  58 */     this((EntityType<DarkLatexFoxSniperEntity>)LatexModEntities.DARK_LATEX_FOX_SNIPER.get(), world);
/*     */   }
/*     */   
/*     */   public DarkLatexFoxSniperEntity(EntityType<DarkLatexFoxSniperEntity> type, Level world) {
/*  62 */     super(type, world);
/*  63 */     this.xpReward = 6;
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
/*  83 */             double x = DarkLatexFoxSniperEntity.this.getX();
/*  84 */             double y = DarkLatexFoxSniperEntity.this.getY();
/*  85 */             double z = DarkLatexFoxSniperEntity.this.getZ();
/*  86 */             DarkLatexFoxSniperEntity darkLatexFoxSniperEntity = DarkLatexFoxSniperEntity.this;
/*  87 */             Level world = DarkLatexFoxSniperEntity.this.level;
/*  88 */             return (super.canUse() && TargetwearingmaskProcedure.execute((Entity)darkLatexFoxSniperEntity));
/*     */           }
/*     */         });
/*     */     
/*  92 */     this.targetSelector.addGoal(2, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, false, true)
/*     */         {
/*     */           public boolean canUse() {
/*  95 */             double x = DarkLatexFoxSniperEntity.this.getX();
/*  96 */             double y = DarkLatexFoxSniperEntity.this.getY();
/*  97 */             double z = DarkLatexFoxSniperEntity.this.getZ();
/*  98 */             DarkLatexFoxSniperEntity darkLatexFoxSniperEntity = DarkLatexFoxSniperEntity.this;
/*  99 */             Level world = DarkLatexFoxSniperEntity.this.level;
/* 100 */             return (super.canUse() && CheckSlimelingProcedure.execute((Entity)darkLatexFoxSniperEntity));
/*     */           }
/*     */         });
/* 103 */     this.targetSelector.addGoal(3, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 106 */             double x = DarkLatexFoxSniperEntity.this.getX();
/* 107 */             double y = DarkLatexFoxSniperEntity.this.getY();
/* 108 */             double z = DarkLatexFoxSniperEntity.this.getZ();
/* 109 */             DarkLatexFoxSniperEntity darkLatexFoxSniperEntity = DarkLatexFoxSniperEntity.this;
/* 110 */             Level world = DarkLatexFoxSniperEntity.this.level;
/* 111 */             return (super.canUse() && CheckGoodProcedure.execute((Entity)darkLatexFoxSniperEntity));
/*     */           }
/*     */         });
/* 114 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 117 */             double x = DarkLatexFoxSniperEntity.this.getX();
/* 118 */             double y = DarkLatexFoxSniperEntity.this.getY();
/* 119 */             double z = DarkLatexFoxSniperEntity.this.getZ();
/* 120 */             DarkLatexFoxSniperEntity darkLatexFoxSniperEntity = DarkLatexFoxSniperEntity.this;
/* 121 */             Level world = DarkLatexFoxSniperEntity.this.level;
/* 122 */             return (super.canUse() && CheckEvilProcedure.execute((Entity)darkLatexFoxSniperEntity));
/*     */           }
/*     */         });
/* 125 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false));
/* 126 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, true, false));
/* 127 */     this.targetSelector.addGoal(7, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, true, false));
/* 128 */     this.targetSelector.addGoal(8, (Goal)new NearestAttackableTargetGoal((Mob)this, IronGolem.class, true, false));
/* 129 */     this.targetSelector.addGoal(9, (Goal)new NearestAttackableTargetGoal((Mob)this, Witch.class, true, false));
/* 130 */     this.targetSelector.addGoal(10, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/* 131 */     this.targetSelector.addGoal(11, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/* 132 */     this.targetSelector.addGoal(12, (Goal)new NearestAttackableTargetGoal((Mob)this, Evoker.class, true, false));
/* 133 */     this.targetSelector.addGoal(13, (Goal)new NearestAttackableTargetGoal((Mob)this, Guardian.class, true, false));
/* 134 */     this.targetSelector.addGoal(14, (Goal)new NearestAttackableTargetGoal((Mob)this, Zombie.class, true, false));
/* 135 */     this.targetSelector.addGoal(15, (Goal)new NearestAttackableTargetGoal((Mob)this, ZombieVillager.class, true, false));
/* 136 */     this.targetSelector.addGoal(16, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/* 137 */     this.targetSelector.addGoal(17, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/* 138 */     this.goalSelector.addGoal(18, (Goal)new BreakDoorGoal((Mob)this, e -> true));
/* 139 */     this.goalSelector.addGoal(19, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.8D));
/* 140 */     this.targetSelector.addGoal(20, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).setAlertOthers(new Class[0]));
/* 141 */     this.goalSelector.addGoal(21, (Goal)new RandomLookAroundGoal((Mob)this));
/* 142 */     this.goalSelector.addGoal(22, (Goal)new FloatGoal((Mob)this));
/* 143 */     this.goalSelector.addGoal(1, (Goal)new RangedAttackGoal(this, 1.25D, 20, 10.0F)
/*     */         {
/*     */           public boolean canContinueToUse() {
/* 146 */             return canUse();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 153 */     return MobType.ARTHROPOD;
/*     */   }
/*     */   
/*     */   protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
/* 157 */     super.dropCustomDeathLoot(source, looting, recentlyHitIn);
/* 158 */     spawnAtLocation(new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 163 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
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
/* 178 */     if (source == DamageSource.FALL)
/* 179 */       return false; 
/* 180 */     if (source == DamageSource.CACTUS)
/* 181 */       return false; 
/* 182 */     if (source == DamageSource.WITHER)
/* 183 */       return false; 
/* 184 */     if (source.getMsgId().equals("witherSkull"))
/* 185 */       return false; 
/* 186 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 191 */     super.die(source);
/* 192 */     DarklatexEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
/* 197 */     super.awardKillScore(entity, score, damageSource);
/* 198 */     DarkLatexFoxThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public void performRangedAttack(LivingEntity target, float flval) {
/* 203 */     LatexDartRifleEntity.shoot((LivingEntity)this, target);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 210 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 211 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.4D);
/* 212 */     builder = builder.add(Attributes.MAX_HEALTH, 18.0D);
/* 213 */     builder = builder.add(Attributes.ARMOR, 0.0D);
/* 214 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 4.0D);
/* 215 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 216 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.3D);
/* 217 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\DarkLatexFoxSniperEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */