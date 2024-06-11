/*     */ package net.mcreator.latexes.entity;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.CheckEvilProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckGoodProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckSlimelingProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckentityislatexProcedure;
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
/*     */ import net.minecraftforge.common.DungeonHooks;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class DarklatexEntity extends Monster {
/*     */   public DarklatexEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  61 */     this((EntityType<DarklatexEntity>)LatexModEntities.DARKLATEX.get(), world);
/*     */   }
/*     */   
/*     */   public DarklatexEntity(EntityType<DarklatexEntity> type, Level world) {
/*  65 */     super(type, world);
/*  66 */     this.xpReward = 5;
/*  67 */     setNoAi(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  72 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  77 */     super.registerGoals();
/*  78 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.1D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  81 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canUse() {
/*  86 */             double x = DarklatexEntity.this.getX();
/*  87 */             double y = DarklatexEntity.this.getY();
/*  88 */             double z = DarklatexEntity.this.getZ();
/*  89 */             DarklatexEntity darklatexEntity = DarklatexEntity.this;
/*  90 */             Level world = DarklatexEntity.this.level;
/*  91 */             return (super.canUse() && TargetwearingmaskProcedure.execute((Entity)darklatexEntity));
/*     */           }
/*     */         });
/*     */     
/*  95 */     this.targetSelector.addGoal(2, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).setAlertOthers(new Class[0]));
/*  96 */     this.targetSelector.addGoal(3, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, false, false)
/*     */         {
/*     */           public boolean canUse() {
/*  99 */             double x = DarklatexEntity.this.getX();
/* 100 */             double y = DarklatexEntity.this.getY();
/* 101 */             double z = DarklatexEntity.this.getZ();
/* 102 */             DarklatexEntity darklatexEntity = DarklatexEntity.this;
/* 103 */             Level world = DarklatexEntity.this.level;
/* 104 */             return (super.canUse() && CheckSlimelingProcedure.execute((Entity)darklatexEntity));
/*     */           }
/*     */         });
/* 107 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 110 */             double x = DarklatexEntity.this.getX();
/* 111 */             double y = DarklatexEntity.this.getY();
/* 112 */             double z = DarklatexEntity.this.getZ();
/* 113 */             DarklatexEntity darklatexEntity = DarklatexEntity.this;
/* 114 */             Level world = DarklatexEntity.this.level;
/* 115 */             return (super.canUse() && CheckGoodProcedure.execute((Entity)darklatexEntity));
/*     */           }
/*     */         });
/* 118 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 121 */             double x = DarklatexEntity.this.getX();
/* 122 */             double y = DarklatexEntity.this.getY();
/* 123 */             double z = DarklatexEntity.this.getZ();
/* 124 */             DarklatexEntity darklatexEntity = DarklatexEntity.this;
/* 125 */             Level world = DarklatexEntity.this.level;
/* 126 */             return (super.canUse() && CheckEvilProcedure.execute((Entity)darklatexEntity));
/*     */           }
/*     */         });
/* 129 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false));
/* 130 */     this.targetSelector.addGoal(7, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, true, false));
/* 131 */     this.targetSelector.addGoal(8, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, true, false));
/* 132 */     this.targetSelector.addGoal(9, (Goal)new NearestAttackableTargetGoal((Mob)this, IronGolem.class, true, false));
/* 133 */     this.targetSelector.addGoal(10, (Goal)new NearestAttackableTargetGoal((Mob)this, Witch.class, true, false));
/* 134 */     this.targetSelector.addGoal(11, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/* 135 */     this.targetSelector.addGoal(12, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/* 136 */     this.targetSelector.addGoal(13, (Goal)new NearestAttackableTargetGoal((Mob)this, Evoker.class, true, false));
/* 137 */     this.targetSelector.addGoal(14, (Goal)new NearestAttackableTargetGoal((Mob)this, Guardian.class, true, false));
/* 138 */     this.targetSelector.addGoal(15, (Goal)new NearestAttackableTargetGoal((Mob)this, Bee.class, true, false));
/* 139 */     this.targetSelector.addGoal(16, (Goal)new NearestAttackableTargetGoal((Mob)this, Fox.class, true, false));
/* 140 */     this.targetSelector.addGoal(17, (Goal)new NearestAttackableTargetGoal((Mob)this, Zombie.class, true, false));
/* 141 */     this.targetSelector.addGoal(18, (Goal)new NearestAttackableTargetGoal((Mob)this, ZombieVillager.class, true, false));
/* 142 */     this.targetSelector.addGoal(19, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/* 143 */     this.targetSelector.addGoal(20, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/* 144 */     this.goalSelector.addGoal(21, (Goal)new BreakDoorGoal((Mob)this, e -> true));
/* 145 */     this.goalSelector.addGoal(22, (Goal)new LookAtPlayerGoal((Mob)this, LivingEntity.class, 6.0F)
/*     */         {
/*     */           public boolean canUse() {
/* 148 */             double x = DarklatexEntity.this.getX();
/* 149 */             double y = DarklatexEntity.this.getY();
/* 150 */             double z = DarklatexEntity.this.getZ();
/* 151 */             DarklatexEntity darklatexEntity = DarklatexEntity.this;
/* 152 */             Level world = DarklatexEntity.this.level;
/* 153 */             return (super.canUse() && CheckentityislatexProcedure.execute((Entity)darklatexEntity));
/*     */           }
/*     */         });
/* 156 */     this.goalSelector.addGoal(23, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.8D));
/* 157 */     this.goalSelector.addGoal(24, (Goal)new RandomLookAroundGoal((Mob)this));
/* 158 */     this.goalSelector.addGoal(25, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 163 */     return MobType.ARTHROPOD;
/*     */   }
/*     */ 
/*     */   
/*     */   public double getPassengersRidingOffset() {
/* 168 */     return super.getPassengersRidingOffset() + 1.8D;
/*     */   }
/*     */   
/*     */   protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
/* 172 */     super.dropCustomDeathLoot(source, looting, recentlyHitIn);
/* 173 */     spawnAtLocation(new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 178 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 183 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 188 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 193 */     if (source == DamageSource.FALL)
/* 194 */       return false; 
/* 195 */     if (source == DamageSource.CACTUS)
/* 196 */       return false; 
/* 197 */     if (source == DamageSource.WITHER)
/* 198 */       return false; 
/* 199 */     if (source.getMsgId().equals("witherSkull"))
/* 200 */       return false; 
/* 201 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 206 */     super.die(source);
/* 207 */     DarklatexEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
/* 212 */     super.awardKillScore(entity, score, damageSource);
/* 213 */     DarklatexThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), entity, (Entity)this);
/*     */   }
/*     */   
/*     */   public static void init() {
/* 217 */     DungeonHooks.addDungeonMob((EntityType)LatexModEntities.DARKLATEX.get(), 180);
/*     */   }
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 221 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 222 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3D);
/* 223 */     builder = builder.add(Attributes.MAX_HEALTH, 16.0D);
/* 224 */     builder = builder.add(Attributes.ARMOR, 0.0D);
/* 225 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 2.0D);
/* 226 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 227 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\DarklatexEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */