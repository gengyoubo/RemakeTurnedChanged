/*     */ package net.mcreator.latexes.entity;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.CheckEvilProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckGoodProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckSlimelingProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckbordersharkProcedure;
/*     */ import net.mcreator.latexes.procedures.DlSquidDogThisEntityKillsAnotherOneProcedure;
/*     */ import net.mcreator.latexes.procedures.DlsharkEntityDiesProcedure;
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
/*     */ import net.minecraft.world.entity.animal.Cod;
/*     */ import net.minecraft.world.entity.animal.IronGolem;
/*     */ import net.minecraft.world.entity.monster.Evoker;
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
/*     */ public class DlSquidDogEntity extends Monster {
/*     */   public DlSquidDogEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  57 */     this((EntityType<DlSquidDogEntity>)LatexModEntities.DL_SQUID_DOG.get(), world);
/*     */   }
/*     */   
/*     */   public DlSquidDogEntity(EntityType<DlSquidDogEntity> type, Level world) {
/*  61 */     super(type, world);
/*  62 */     this.xpReward = 9;
/*  63 */     setNoAi(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  68 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  73 */     super.registerGoals();
/*  74 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  77 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canUse() {
/*  82 */             double x = DlSquidDogEntity.this.getX();
/*  83 */             double y = DlSquidDogEntity.this.getY();
/*  84 */             double z = DlSquidDogEntity.this.getZ();
/*  85 */             DlSquidDogEntity dlSquidDogEntity = DlSquidDogEntity.this;
/*  86 */             Level world = DlSquidDogEntity.this.level;
/*  87 */             return (super.canUse() && TargetwearingmaskProcedure.execute((Entity)dlSquidDogEntity));
/*     */           }
/*     */         });
/*     */     
/*  91 */     this.targetSelector.addGoal(2, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).setAlertOthers(new Class[0]));
/*  92 */     this.targetSelector.addGoal(3, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, false, false)
/*     */         {
/*     */           public boolean canUse() {
/*  95 */             double x = DlSquidDogEntity.this.getX();
/*  96 */             double y = DlSquidDogEntity.this.getY();
/*  97 */             double z = DlSquidDogEntity.this.getZ();
/*  98 */             DlSquidDogEntity dlSquidDogEntity = DlSquidDogEntity.this;
/*  99 */             Level world = DlSquidDogEntity.this.level;
/* 100 */             return (super.canUse() && CheckSlimelingProcedure.execute((Entity)dlSquidDogEntity));
/*     */           }
/*     */         });
/* 103 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 106 */             double x = DlSquidDogEntity.this.getX();
/* 107 */             double y = DlSquidDogEntity.this.getY();
/* 108 */             double z = DlSquidDogEntity.this.getZ();
/* 109 */             DlSquidDogEntity dlSquidDogEntity = DlSquidDogEntity.this;
/* 110 */             Level world = DlSquidDogEntity.this.level;
/* 111 */             return (super.canUse() && CheckGoodProcedure.execute((Entity)dlSquidDogEntity));
/*     */           }
/*     */         });
/* 114 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 117 */             double x = DlSquidDogEntity.this.getX();
/* 118 */             double y = DlSquidDogEntity.this.getY();
/* 119 */             double z = DlSquidDogEntity.this.getZ();
/* 120 */             DlSquidDogEntity dlSquidDogEntity = DlSquidDogEntity.this;
/* 121 */             Level world = DlSquidDogEntity.this.level;
/* 122 */             return (super.canUse() && CheckEvilProcedure.execute((Entity)dlSquidDogEntity));
/*     */           }
/*     */         });
/* 125 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false));
/* 126 */     this.targetSelector.addGoal(7, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, true, false));
/* 127 */     this.targetSelector.addGoal(8, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, true, false));
/* 128 */     this.targetSelector.addGoal(9, (Goal)new NearestAttackableTargetGoal((Mob)this, IronGolem.class, true, false));
/* 129 */     this.targetSelector.addGoal(10, (Goal)new NearestAttackableTargetGoal((Mob)this, Witch.class, true, false));
/* 130 */     this.targetSelector.addGoal(11, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/* 131 */     this.targetSelector.addGoal(12, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/* 132 */     this.targetSelector.addGoal(13, (Goal)new NearestAttackableTargetGoal((Mob)this, Evoker.class, true, false));
/* 133 */     this.targetSelector.addGoal(14, (Goal)new NearestAttackableTargetGoal((Mob)this, Zombie.class, true, false));
/* 134 */     this.targetSelector.addGoal(15, (Goal)new NearestAttackableTargetGoal((Mob)this, ZombieVillager.class, true, false));
/* 135 */     this.targetSelector.addGoal(16, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/* 136 */     this.targetSelector.addGoal(17, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/* 137 */     this.targetSelector.addGoal(18, (Goal)new NearestAttackableTargetGoal((Mob)this, Cod.class, true, false));
/* 138 */     this.goalSelector.addGoal(19, (Goal)new BreakDoorGoal((Mob)this, e -> true));
/* 139 */     this.goalSelector.addGoal(20, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.8D));
/* 140 */     this.goalSelector.addGoal(21, (Goal)new RandomLookAroundGoal((Mob)this));
/* 141 */     this.goalSelector.addGoal(22, (Goal)new FloatGoal((Mob)this)
/*     */         {
/*     */           public boolean canUse() {
/* 144 */             double x = DlSquidDogEntity.this.getX();
/* 145 */             double y = DlSquidDogEntity.this.getY();
/* 146 */             double z = DlSquidDogEntity.this.getZ();
/* 147 */             DlSquidDogEntity dlSquidDogEntity = DlSquidDogEntity.this;
/* 148 */             Level world = DlSquidDogEntity.this.level;
/* 149 */             return (super.canUse() && CheckbordersharkProcedure.execute((LevelAccessor)world, x, y, z));
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 156 */     return MobType.ARTHROPOD;
/*     */   }
/*     */   
/*     */   protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
/* 160 */     super.dropCustomDeathLoot(source, looting, recentlyHitIn);
/* 161 */     spawnAtLocation(new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 166 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 171 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 176 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 181 */     if (source == DamageSource.FALL)
/* 182 */       return false; 
/* 183 */     if (source == DamageSource.CACTUS)
/* 184 */       return false; 
/* 185 */     if (source == DamageSource.DROWN)
/* 186 */       return false; 
/* 187 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 192 */     super.die(source);
/* 193 */     DlsharkEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ());
/*     */   }
/*     */ 
/*     */   
/*     */   public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
/* 198 */     super.awardKillScore(entity, score, damageSource);
/* 199 */     DlSquidDogThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 206 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 207 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.2D);
/* 208 */     builder = builder.add(Attributes.MAX_HEALTH, 42.0D);
/* 209 */     builder = builder.add(Attributes.ARMOR, 0.7999999999999999D);
/* 210 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 4.0D);
/* 211 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 212 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.4D);
/* 213 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\DlSquidDogEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */