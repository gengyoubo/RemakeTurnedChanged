/*     */ package net.mcreator.latexes.entity;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.CheckEvilProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckGoodProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckSlimelingProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckentityislatexProcedure;
/*     */ import net.mcreator.latexes.procedures.DarkLatexSnepThisEntityKillsAnotherOneProcedure;
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
/*     */ import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
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
/*     */ public class DarkLatexSnepEntity extends Monster {
/*     */   public DarkLatexSnepEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  58 */     this((EntityType<DarkLatexSnepEntity>)LatexModEntities.DARK_LATEX_SNEP.get(), world);
/*     */   }
/*     */   
/*     */   public DarkLatexSnepEntity(EntityType<DarkLatexSnepEntity> type, Level world) {
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
/*  83 */             double x = DarkLatexSnepEntity.this.getX();
/*  84 */             double y = DarkLatexSnepEntity.this.getY();
/*  85 */             double z = DarkLatexSnepEntity.this.getZ();
/*  86 */             DarkLatexSnepEntity darkLatexSnepEntity = DarkLatexSnepEntity.this;
/*  87 */             Level world = DarkLatexSnepEntity.this.level;
/*  88 */             return (super.canUse() && TargetwearingmaskProcedure.execute((Entity)darkLatexSnepEntity));
/*     */           }
/*     */         });
/*     */     
/*  92 */     this.targetSelector.addGoal(2, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).setAlertOthers(new Class[0]));
/*  93 */     this.targetSelector.addGoal(3, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, false, false)
/*     */         {
/*     */           public boolean canUse() {
/*  96 */             double x = DarkLatexSnepEntity.this.getX();
/*  97 */             double y = DarkLatexSnepEntity.this.getY();
/*  98 */             double z = DarkLatexSnepEntity.this.getZ();
/*  99 */             DarkLatexSnepEntity darkLatexSnepEntity = DarkLatexSnepEntity.this;
/* 100 */             Level world = DarkLatexSnepEntity.this.level;
/* 101 */             return (super.canUse() && CheckSlimelingProcedure.execute((Entity)darkLatexSnepEntity));
/*     */           }
/*     */         });
/* 104 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 107 */             double x = DarkLatexSnepEntity.this.getX();
/* 108 */             double y = DarkLatexSnepEntity.this.getY();
/* 109 */             double z = DarkLatexSnepEntity.this.getZ();
/* 110 */             DarkLatexSnepEntity darkLatexSnepEntity = DarkLatexSnepEntity.this;
/* 111 */             Level world = DarkLatexSnepEntity.this.level;
/* 112 */             return (super.canUse() && CheckGoodProcedure.execute((Entity)darkLatexSnepEntity));
/*     */           }
/*     */         });
/* 115 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 118 */             double x = DarkLatexSnepEntity.this.getX();
/* 119 */             double y = DarkLatexSnepEntity.this.getY();
/* 120 */             double z = DarkLatexSnepEntity.this.getZ();
/* 121 */             DarkLatexSnepEntity darkLatexSnepEntity = DarkLatexSnepEntity.this;
/* 122 */             Level world = DarkLatexSnepEntity.this.level;
/* 123 */             return (super.canUse() && CheckEvilProcedure.execute((Entity)darkLatexSnepEntity));
/*     */           }
/*     */         });
/* 126 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false));
/* 127 */     this.targetSelector.addGoal(7, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, true, false));
/* 128 */     this.targetSelector.addGoal(8, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, true, false));
/* 129 */     this.targetSelector.addGoal(9, (Goal)new NearestAttackableTargetGoal((Mob)this, IronGolem.class, false, false));
/* 130 */     this.targetSelector.addGoal(10, (Goal)new NearestAttackableTargetGoal((Mob)this, Witch.class, true, false));
/* 131 */     this.targetSelector.addGoal(11, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/* 132 */     this.targetSelector.addGoal(12, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/* 133 */     this.targetSelector.addGoal(13, (Goal)new NearestAttackableTargetGoal((Mob)this, Evoker.class, true, false));
/* 134 */     this.targetSelector.addGoal(14, (Goal)new NearestAttackableTargetGoal((Mob)this, Guardian.class, true, false));
/* 135 */     this.targetSelector.addGoal(15, (Goal)new NearestAttackableTargetGoal((Mob)this, Zombie.class, true, false));
/* 136 */     this.targetSelector.addGoal(16, (Goal)new NearestAttackableTargetGoal((Mob)this, ZombieVillager.class, true, false));
/* 137 */     this.targetSelector.addGoal(17, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/* 138 */     this.targetSelector.addGoal(18, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/* 139 */     this.goalSelector.addGoal(19, (Goal)new BreakDoorGoal((Mob)this, e -> true));
/* 140 */     this.goalSelector.addGoal(20, (Goal)new LookAtPlayerGoal((Mob)this, LivingEntity.class, 6.0F)
/*     */         {
/*     */           public boolean canUse() {
/* 143 */             double x = DarkLatexSnepEntity.this.getX();
/* 144 */             double y = DarkLatexSnepEntity.this.getY();
/* 145 */             double z = DarkLatexSnepEntity.this.getZ();
/* 146 */             DarkLatexSnepEntity darkLatexSnepEntity = DarkLatexSnepEntity.this;
/* 147 */             Level world = DarkLatexSnepEntity.this.level;
/* 148 */             return (super.canUse() && CheckentityislatexProcedure.execute((Entity)darkLatexSnepEntity));
/*     */           }
/*     */         });
/* 151 */     this.goalSelector.addGoal(21, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.8D));
/* 152 */     this.goalSelector.addGoal(22, (Goal)new RandomLookAroundGoal((Mob)this));
/* 153 */     this.goalSelector.addGoal(23, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 158 */     return MobType.ARTHROPOD;
/*     */   }
/*     */   
/*     */   protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
/* 162 */     super.dropCustomDeathLoot(source, looting, recentlyHitIn);
/* 163 */     spawnAtLocation(new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 168 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 173 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 178 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 183 */     if (source == DamageSource.FALL)
/* 184 */       return false; 
/* 185 */     if (source == DamageSource.CACTUS)
/* 186 */       return false; 
/* 187 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 192 */     super.die(source);
/* 193 */     DarklatexEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
/* 198 */     super.awardKillScore(entity, score, damageSource);
/* 199 */     DarkLatexSnepThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), entity, (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 206 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 207 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.4D);
/* 208 */     builder = builder.add(Attributes.MAX_HEALTH, 20.0D);
/* 209 */     builder = builder.add(Attributes.ARMOR, 0.0D);
/* 210 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 3.0D);
/* 211 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 212 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.3D);
/* 213 */     builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.5D);
/* 214 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\DarkLatexSnepEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */