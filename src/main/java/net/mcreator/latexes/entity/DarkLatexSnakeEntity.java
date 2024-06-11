/*     */ package net.mcreator.latexes.entity;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.CheckEvilProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckGoodProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckSlimelingProcedure;
/*     */ import net.mcreator.latexes.procedures.DarklatexEntityDiesProcedure;
/*     */ import net.mcreator.latexes.procedures.DarklatexThisEntityKillsAnotherOneProcedure;
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
/*     */ import net.minecraft.world.entity.ai.goal.LeapAtTargetGoal;
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
/*     */ public class DarkLatexSnakeEntity extends Monster {
/*     */   public DarkLatexSnakeEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  60 */     this((EntityType<DarkLatexSnakeEntity>)LatexModEntities.DARK_LATEX_SNAKE.get(), world);
/*     */   }
/*     */   
/*     */   public DarkLatexSnakeEntity(EntityType<DarkLatexSnakeEntity> type, Level world) {
/*  64 */     super(type, world);
/*  65 */     this.xpReward = 6;
/*  66 */     setNoAi(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  71 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  76 */     super.registerGoals();
/*  77 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.25D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  80 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canUse() {
/*  85 */             double x = DarkLatexSnakeEntity.this.getX();
/*  86 */             double y = DarkLatexSnakeEntity.this.getY();
/*  87 */             double z = DarkLatexSnakeEntity.this.getZ();
/*  88 */             DarkLatexSnakeEntity darkLatexSnakeEntity = DarkLatexSnakeEntity.this;
/*  89 */             Level world = DarkLatexSnakeEntity.this.level;
/*  90 */             return (super.canUse() && TargetwearingmaskProcedure.execute((Entity)darkLatexSnakeEntity));
/*     */           }
/*     */         });
/*     */     
/*  94 */     this.targetSelector.addGoal(2, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, false, true)
/*     */         {
/*     */           public boolean canUse() {
/*  97 */             double x = DarkLatexSnakeEntity.this.getX();
/*  98 */             double y = DarkLatexSnakeEntity.this.getY();
/*  99 */             double z = DarkLatexSnakeEntity.this.getZ();
/* 100 */             DarkLatexSnakeEntity darkLatexSnakeEntity = DarkLatexSnakeEntity.this;
/* 101 */             Level world = DarkLatexSnakeEntity.this.level;
/* 102 */             return (super.canUse() && CheckSlimelingProcedure.execute((Entity)darkLatexSnakeEntity));
/*     */           }
/*     */         });
/* 105 */     this.targetSelector.addGoal(3, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 108 */             double x = DarkLatexSnakeEntity.this.getX();
/* 109 */             double y = DarkLatexSnakeEntity.this.getY();
/* 110 */             double z = DarkLatexSnakeEntity.this.getZ();
/* 111 */             DarkLatexSnakeEntity darkLatexSnakeEntity = DarkLatexSnakeEntity.this;
/* 112 */             Level world = DarkLatexSnakeEntity.this.level;
/* 113 */             return (super.canUse() && CheckGoodProcedure.execute((Entity)darkLatexSnakeEntity));
/*     */           }
/*     */         });
/* 116 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 119 */             double x = DarkLatexSnakeEntity.this.getX();
/* 120 */             double y = DarkLatexSnakeEntity.this.getY();
/* 121 */             double z = DarkLatexSnakeEntity.this.getZ();
/* 122 */             DarkLatexSnakeEntity darkLatexSnakeEntity = DarkLatexSnakeEntity.this;
/* 123 */             Level world = DarkLatexSnakeEntity.this.level;
/* 124 */             return (super.canUse() && CheckEvilProcedure.execute((Entity)darkLatexSnakeEntity));
/*     */           }
/*     */         });
/* 127 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false));
/* 128 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, true, false));
/* 129 */     this.targetSelector.addGoal(7, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, true, false));
/* 130 */     this.targetSelector.addGoal(8, (Goal)new NearestAttackableTargetGoal((Mob)this, IronGolem.class, true, false));
/* 131 */     this.targetSelector.addGoal(9, (Goal)new NearestAttackableTargetGoal((Mob)this, Witch.class, true, false));
/* 132 */     this.targetSelector.addGoal(10, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/* 133 */     this.targetSelector.addGoal(11, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/* 134 */     this.targetSelector.addGoal(12, (Goal)new NearestAttackableTargetGoal((Mob)this, Evoker.class, true, false));
/* 135 */     this.targetSelector.addGoal(13, (Goal)new NearestAttackableTargetGoal((Mob)this, Guardian.class, true, false));
/* 136 */     this.targetSelector.addGoal(14, (Goal)new NearestAttackableTargetGoal((Mob)this, Bee.class, true, false));
/* 137 */     this.targetSelector.addGoal(15, (Goal)new NearestAttackableTargetGoal((Mob)this, Fox.class, true, false));
/* 138 */     this.targetSelector.addGoal(16, (Goal)new NearestAttackableTargetGoal((Mob)this, Zombie.class, true, false));
/* 139 */     this.targetSelector.addGoal(17, (Goal)new NearestAttackableTargetGoal((Mob)this, ZombieVillager.class, true, false));
/* 140 */     this.targetSelector.addGoal(18, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/* 141 */     this.targetSelector.addGoal(19, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/* 142 */     this.goalSelector.addGoal(20, (Goal)new BreakDoorGoal((Mob)this, e -> true));
/* 143 */     this.goalSelector.addGoal(21, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.6D));
/* 144 */     this.targetSelector.addGoal(22, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).setAlertOthers(new Class[0]));
/* 145 */     this.goalSelector.addGoal(23, (Goal)new LookAtPlayerGoal((Mob)this, LivingEntity.class, 24.0F));
/* 146 */     this.goalSelector.addGoal(24, (Goal)new LeapAtTargetGoal((Mob)this, 0.25F));
/* 147 */     this.goalSelector.addGoal(25, (Goal)new RandomLookAroundGoal((Mob)this));
/* 148 */     this.goalSelector.addGoal(26, (Goal)new FloatGoal((Mob)this));
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
/* 198 */     DarklatexThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), entity, (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 205 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 206 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25D);
/* 207 */     builder = builder.add(Attributes.MAX_HEALTH, 32.0D);
/* 208 */     builder = builder.add(Attributes.ARMOR, 2.0D);
/* 209 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 4.0D);
/* 210 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 211 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.2D);
/* 212 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\DarkLatexSnakeEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */