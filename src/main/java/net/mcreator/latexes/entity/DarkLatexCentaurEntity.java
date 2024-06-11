/*     */ package net.mcreator.latexes.entity;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.CheckEvilProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckGoodProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckSlimelingProcedure;
/*     */ import net.mcreator.latexes.procedures.DarkLatexCentaurThisEntityKillsAnotherOneProcedure;
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
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.common.DungeonHooks;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class DarkLatexCentaurEntity extends Monster {
/*     */   public DarkLatexCentaurEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  61 */     this((EntityType<DarkLatexCentaurEntity>)LatexModEntities.DARK_LATEX_CENTAUR.get(), world);
/*     */   }
/*     */   
/*     */   public DarkLatexCentaurEntity(EntityType<DarkLatexCentaurEntity> type, Level world) {
/*  65 */     super(type, world);
/*  66 */     this.xpReward = 8;
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
/*  78 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.5D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  81 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canUse() {
/*  86 */             double x = DarkLatexCentaurEntity.this.getX();
/*  87 */             double y = DarkLatexCentaurEntity.this.getY();
/*  88 */             double z = DarkLatexCentaurEntity.this.getZ();
/*  89 */             DarkLatexCentaurEntity darkLatexCentaurEntity = DarkLatexCentaurEntity.this;
/*  90 */             Level world = DarkLatexCentaurEntity.this.level;
/*  91 */             return (super.canUse() && TargetwearingmaskProcedure.execute((Entity)darkLatexCentaurEntity));
/*     */           }
/*     */         });
/*     */     
/*  95 */     this.targetSelector.addGoal(2, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).setAlertOthers(new Class[0]));
/*  96 */     this.goalSelector.addGoal(3, (Goal)new BreakDoorGoal((Mob)this, e -> true));
/*  97 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, PathfinderMob.class, false, false)
/*     */         {
/*     */           public boolean canUse() {
/* 100 */             double x = DarkLatexCentaurEntity.this.getX();
/* 101 */             double y = DarkLatexCentaurEntity.this.getY();
/* 102 */             double z = DarkLatexCentaurEntity.this.getZ();
/* 103 */             DarkLatexCentaurEntity darkLatexCentaurEntity = DarkLatexCentaurEntity.this;
/* 104 */             Level world = DarkLatexCentaurEntity.this.level;
/* 105 */             return (super.canUse() && CheckSlimelingProcedure.execute((Entity)darkLatexCentaurEntity));
/*     */           }
/*     */         });
/* 108 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 111 */             double x = DarkLatexCentaurEntity.this.getX();
/* 112 */             double y = DarkLatexCentaurEntity.this.getY();
/* 113 */             double z = DarkLatexCentaurEntity.this.getZ();
/* 114 */             DarkLatexCentaurEntity darkLatexCentaurEntity = DarkLatexCentaurEntity.this;
/* 115 */             Level world = DarkLatexCentaurEntity.this.level;
/* 116 */             return (super.canUse() && CheckGoodProcedure.execute((Entity)darkLatexCentaurEntity));
/*     */           }
/*     */         });
/* 119 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 122 */             double x = DarkLatexCentaurEntity.this.getX();
/* 123 */             double y = DarkLatexCentaurEntity.this.getY();
/* 124 */             double z = DarkLatexCentaurEntity.this.getZ();
/* 125 */             DarkLatexCentaurEntity darkLatexCentaurEntity = DarkLatexCentaurEntity.this;
/* 126 */             Level world = DarkLatexCentaurEntity.this.level;
/* 127 */             return (super.canUse() && CheckEvilProcedure.execute((Entity)darkLatexCentaurEntity));
/*     */           }
/*     */         });
/* 130 */     this.targetSelector.addGoal(7, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 133 */             double x = DarkLatexCentaurEntity.this.getX();
/* 134 */             double y = DarkLatexCentaurEntity.this.getY();
/* 135 */             double z = DarkLatexCentaurEntity.this.getZ();
/* 136 */             DarkLatexCentaurEntity darkLatexCentaurEntity = DarkLatexCentaurEntity.this;
/* 137 */             Level world = DarkLatexCentaurEntity.this.level;
/* 138 */             return (super.canUse() && CheckSlimelingProcedure.execute((Entity)darkLatexCentaurEntity));
/*     */           }
/*     */         });
/* 141 */     this.targetSelector.addGoal(8, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false));
/* 142 */     this.targetSelector.addGoal(9, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, true, false));
/* 143 */     this.targetSelector.addGoal(10, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, true, false));
/* 144 */     this.targetSelector.addGoal(11, (Goal)new NearestAttackableTargetGoal((Mob)this, IronGolem.class, true, false));
/* 145 */     this.targetSelector.addGoal(12, (Goal)new NearestAttackableTargetGoal((Mob)this, Witch.class, true, false));
/* 146 */     this.targetSelector.addGoal(13, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/* 147 */     this.targetSelector.addGoal(14, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/* 148 */     this.targetSelector.addGoal(15, (Goal)new NearestAttackableTargetGoal((Mob)this, Evoker.class, true, false));
/* 149 */     this.targetSelector.addGoal(16, (Goal)new NearestAttackableTargetGoal((Mob)this, Guardian.class, true, false));
/* 150 */     this.targetSelector.addGoal(17, (Goal)new NearestAttackableTargetGoal((Mob)this, Bee.class, true, false));
/* 151 */     this.targetSelector.addGoal(18, (Goal)new NearestAttackableTargetGoal((Mob)this, Fox.class, true, false));
/* 152 */     this.targetSelector.addGoal(19, (Goal)new NearestAttackableTargetGoal((Mob)this, Zombie.class, true, false));
/* 153 */     this.targetSelector.addGoal(20, (Goal)new NearestAttackableTargetGoal((Mob)this, ZombieVillager.class, true, false));
/* 154 */     this.targetSelector.addGoal(21, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/* 155 */     this.targetSelector.addGoal(22, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/* 156 */     this.goalSelector.addGoal(23, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.7D));
/* 157 */     this.goalSelector.addGoal(24, (Goal)new LookAtPlayerGoal((Mob)this, PathfinderMob.class, 12.0F));
/* 158 */     this.goalSelector.addGoal(25, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 6.0F));
/* 159 */     this.goalSelector.addGoal(26, (Goal)new RandomLookAroundGoal((Mob)this));
/* 160 */     this.goalSelector.addGoal(27, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 165 */     return MobType.ARTHROPOD;
/*     */   }
/*     */ 
/*     */   
/*     */   public double getPassengersRidingOffset() {
/* 170 */     return super.getPassengersRidingOffset() + 1.4000000000000001D;
/*     */   }
/*     */   
/*     */   protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
/* 174 */     super.dropCustomDeathLoot(source, looting, recentlyHitIn);
/* 175 */     spawnAtLocation(new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 180 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 185 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 190 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 195 */     if (source == DamageSource.FALL)
/* 196 */       return false; 
/* 197 */     if (source == DamageSource.CACTUS)
/* 198 */       return false; 
/* 199 */     if (source == DamageSource.WITHER)
/* 200 */       return false; 
/* 201 */     if (source.getMsgId().equals("witherSkull"))
/* 202 */       return false; 
/* 203 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 208 */     super.die(source);
/* 209 */     DarklatexEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
/* 214 */     super.awardKillScore(entity, score, damageSource);
/* 215 */     DarkLatexCentaurThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), entity, (Entity)this);
/*     */   }
/*     */   
/*     */   public static void init() {
/* 219 */     DungeonHooks.addDungeonMob((EntityType)LatexModEntities.DARK_LATEX_CENTAUR.get(), 180);
/*     */   }
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 223 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 224 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.32D);
/* 225 */     builder = builder.add(Attributes.MAX_HEALTH, 28.0D);
/* 226 */     builder = builder.add(Attributes.ARMOR, 1.0D);
/* 227 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 4.0D);
/* 228 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 229 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.5D);
/* 230 */     builder = builder.add(Attributes.ATTACK_KNOCKBACK, 0.2D);
/* 231 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\DarkLatexCentaurEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */