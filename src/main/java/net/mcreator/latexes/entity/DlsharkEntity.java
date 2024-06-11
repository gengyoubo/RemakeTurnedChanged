/*     */ package net.mcreator.latexes.entity;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.CheckGoodProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckSlimelingProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckbordersharkProcedure;
/*     */ import net.mcreator.latexes.procedures.DlsharkEntityDiesProcedure;
/*     */ import net.mcreator.latexes.procedures.DlsharkThisEntityKillsAnotherOneProcedure;
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
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class DlsharkEntity extends Monster {
/*     */   public DlsharkEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  59 */     this((EntityType<DlsharkEntity>)LatexModEntities.DLSHARK.get(), world);
/*     */   }
/*     */   
/*     */   public DlsharkEntity(EntityType<DlsharkEntity> type, Level world) {
/*  63 */     super(type, world);
/*  64 */     this.xpReward = 6;
/*  65 */     setNoAi(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  70 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  75 */     super.registerGoals();
/*  76 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  79 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canUse() {
/*  84 */             double x = DlsharkEntity.this.getX();
/*  85 */             double y = DlsharkEntity.this.getY();
/*  86 */             double z = DlsharkEntity.this.getZ();
/*  87 */             DlsharkEntity dlsharkEntity = DlsharkEntity.this;
/*  88 */             Level world = DlsharkEntity.this.level;
/*  89 */             return (super.canUse() && TargetwearingmaskProcedure.execute((Entity)dlsharkEntity));
/*     */           }
/*     */         });
/*     */     
/*  93 */     this.targetSelector.addGoal(2, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).setAlertOthers(new Class[0]));
/*  94 */     this.targetSelector.addGoal(3, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, false, false)
/*     */         {
/*     */           public boolean canUse() {
/*  97 */             double x = DlsharkEntity.this.getX();
/*  98 */             double y = DlsharkEntity.this.getY();
/*  99 */             double z = DlsharkEntity.this.getZ();
/* 100 */             DlsharkEntity dlsharkEntity = DlsharkEntity.this;
/* 101 */             Level world = DlsharkEntity.this.level;
/* 102 */             return (super.canUse() && CheckSlimelingProcedure.execute((Entity)dlsharkEntity));
/*     */           }
/*     */         });
/* 105 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 108 */             double x = DlsharkEntity.this.getX();
/* 109 */             double y = DlsharkEntity.this.getY();
/* 110 */             double z = DlsharkEntity.this.getZ();
/* 111 */             DlsharkEntity dlsharkEntity = DlsharkEntity.this;
/* 112 */             Level world = DlsharkEntity.this.level;
/* 113 */             return (super.canUse() && CheckGoodProcedure.execute((Entity)dlsharkEntity));
/*     */           }
/*     */         });
/* 116 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 119 */             double x = DlsharkEntity.this.getX();
/* 120 */             double y = DlsharkEntity.this.getY();
/* 121 */             double z = DlsharkEntity.this.getZ();
/* 122 */             DlsharkEntity dlsharkEntity = DlsharkEntity.this;
/* 123 */             Level world = DlsharkEntity.this.level;
/* 124 */             return (super.canUse() && CheckSlimelingProcedure.execute((Entity)dlsharkEntity));
/*     */           }
/*     */         });
/* 127 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false));
/* 128 */     this.targetSelector.addGoal(7, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, true, false));
/* 129 */     this.targetSelector.addGoal(8, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, true, false));
/* 130 */     this.targetSelector.addGoal(9, (Goal)new NearestAttackableTargetGoal((Mob)this, IronGolem.class, true, false));
/* 131 */     this.targetSelector.addGoal(10, (Goal)new NearestAttackableTargetGoal((Mob)this, Witch.class, true, false));
/* 132 */     this.targetSelector.addGoal(11, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/* 133 */     this.targetSelector.addGoal(12, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/* 134 */     this.targetSelector.addGoal(13, (Goal)new NearestAttackableTargetGoal((Mob)this, Evoker.class, true, false));
/* 135 */     this.targetSelector.addGoal(14, (Goal)new NearestAttackableTargetGoal((Mob)this, Zombie.class, true, false));
/* 136 */     this.targetSelector.addGoal(15, (Goal)new NearestAttackableTargetGoal((Mob)this, ZombieVillager.class, true, false));
/* 137 */     this.targetSelector.addGoal(16, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/* 138 */     this.targetSelector.addGoal(17, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/* 139 */     this.targetSelector.addGoal(18, (Goal)new NearestAttackableTargetGoal((Mob)this, Cod.class, true, false));
/* 140 */     this.goalSelector.addGoal(19, (Goal)new LookAtPlayerGoal((Mob)this, DlSquidDogEntity.class, 6.0F));
/* 141 */     this.goalSelector.addGoal(20, (Goal)new LeapAtTargetGoal((Mob)this, 0.8F));
/* 142 */     this.goalSelector.addGoal(21, (Goal)new BreakDoorGoal((Mob)this, e -> true));
/* 143 */     this.goalSelector.addGoal(22, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.8D));
/* 144 */     this.goalSelector.addGoal(23, (Goal)new LookAtPlayerGoal((Mob)this, PathfinderMob.class, 3.0F));
/* 145 */     this.goalSelector.addGoal(24, (Goal)new RandomLookAroundGoal((Mob)this));
/* 146 */     this.goalSelector.addGoal(25, (Goal)new FloatGoal((Mob)this)
/*     */         {
/*     */           public boolean canUse() {
/* 149 */             double x = DlsharkEntity.this.getX();
/* 150 */             double y = DlsharkEntity.this.getY();
/* 151 */             double z = DlsharkEntity.this.getZ();
/* 152 */             DlsharkEntity dlsharkEntity = DlsharkEntity.this;
/* 153 */             Level world = DlsharkEntity.this.level;
/* 154 */             return (super.canUse() && CheckbordersharkProcedure.execute((LevelAccessor)world, x, y, z));
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 161 */     return MobType.ARTHROPOD;
/*     */   }
/*     */   
/*     */   protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
/* 165 */     super.dropCustomDeathLoot(source, looting, recentlyHitIn);
/* 166 */     spawnAtLocation(new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 171 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 176 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 181 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 186 */     if (source == DamageSource.FALL)
/* 187 */       return false; 
/* 188 */     if (source == DamageSource.CACTUS)
/* 189 */       return false; 
/* 190 */     if (source == DamageSource.DROWN)
/* 191 */       return false; 
/* 192 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 197 */     super.die(source);
/* 198 */     DlsharkEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ());
/*     */   }
/*     */ 
/*     */   
/*     */   public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
/* 203 */     super.awardKillScore(entity, score, damageSource);
/* 204 */     DlsharkThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 211 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 212 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3D);
/* 213 */     builder = builder.add(Attributes.MAX_HEALTH, 18.0D);
/* 214 */     builder = builder.add(Attributes.ARMOR, 0.0D);
/* 215 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 3.0D);
/* 216 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 217 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\DlsharkEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */