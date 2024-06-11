/*     */ package net.mcreator.latexes.entity;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.CheckGoodProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckSlimelingProcedure;
/*     */ import net.mcreator.latexes.procedures.DarkLatexCakeEntityIsHurtProcedure;
/*     */ import net.mcreator.latexes.procedures.DarkLatexCakePlayerCollidesWithThisEntityProcedure;
/*     */ import net.mcreator.latexes.procedures.DarkLatexCakeThisEntityKillsAnotherOneProcedure;
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
/*     */ public class DarkLatexCakeEntity extends Monster {
/*     */   public DarkLatexCakeEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  60 */     this((EntityType<DarkLatexCakeEntity>)LatexModEntities.DARK_LATEX_CAKE.get(), world);
/*     */   }
/*     */   
/*     */   public DarkLatexCakeEntity(EntityType<DarkLatexCakeEntity> type, Level world) {
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
/*  77 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.3D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  80 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canUse() {
/*  85 */             double x = DarkLatexCakeEntity.this.getX();
/*  86 */             double y = DarkLatexCakeEntity.this.getY();
/*  87 */             double z = DarkLatexCakeEntity.this.getZ();
/*  88 */             DarkLatexCakeEntity darkLatexCakeEntity = DarkLatexCakeEntity.this;
/*  89 */             Level world = DarkLatexCakeEntity.this.level;
/*  90 */             return (super.canUse() && TargetwearingmaskProcedure.execute((Entity)darkLatexCakeEntity));
/*     */           }
/*     */         });
/*     */     
/*  94 */     this.targetSelector.addGoal(2, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).setAlertOthers(new Class[0]));
/*  95 */     this.targetSelector.addGoal(3, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, false, false)
/*     */         {
/*     */           public boolean canUse() {
/*  98 */             double x = DarkLatexCakeEntity.this.getX();
/*  99 */             double y = DarkLatexCakeEntity.this.getY();
/* 100 */             double z = DarkLatexCakeEntity.this.getZ();
/* 101 */             DarkLatexCakeEntity darkLatexCakeEntity = DarkLatexCakeEntity.this;
/* 102 */             Level world = DarkLatexCakeEntity.this.level;
/* 103 */             return (super.canUse() && CheckSlimelingProcedure.execute((Entity)darkLatexCakeEntity));
/*     */           }
/*     */         });
/* 106 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 109 */             double x = DarkLatexCakeEntity.this.getX();
/* 110 */             double y = DarkLatexCakeEntity.this.getY();
/* 111 */             double z = DarkLatexCakeEntity.this.getZ();
/* 112 */             DarkLatexCakeEntity darkLatexCakeEntity = DarkLatexCakeEntity.this;
/* 113 */             Level world = DarkLatexCakeEntity.this.level;
/* 114 */             return (super.canUse() && CheckGoodProcedure.execute((Entity)darkLatexCakeEntity));
/*     */           }
/*     */         });
/* 117 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 120 */             double x = DarkLatexCakeEntity.this.getX();
/* 121 */             double y = DarkLatexCakeEntity.this.getY();
/* 122 */             double z = DarkLatexCakeEntity.this.getZ();
/* 123 */             DarkLatexCakeEntity darkLatexCakeEntity = DarkLatexCakeEntity.this;
/* 124 */             Level world = DarkLatexCakeEntity.this.level;
/* 125 */             return (super.canUse() && CheckSlimelingProcedure.execute((Entity)darkLatexCakeEntity));
/*     */           }
/*     */         });
/* 128 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false));
/* 129 */     this.targetSelector.addGoal(7, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, true, false));
/* 130 */     this.targetSelector.addGoal(8, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, true, false));
/* 131 */     this.targetSelector.addGoal(9, (Goal)new NearestAttackableTargetGoal((Mob)this, IronGolem.class, true, false));
/* 132 */     this.targetSelector.addGoal(10, (Goal)new NearestAttackableTargetGoal((Mob)this, Witch.class, true, false));
/* 133 */     this.targetSelector.addGoal(11, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/* 134 */     this.targetSelector.addGoal(12, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/* 135 */     this.targetSelector.addGoal(13, (Goal)new NearestAttackableTargetGoal((Mob)this, Evoker.class, true, false));
/* 136 */     this.targetSelector.addGoal(14, (Goal)new NearestAttackableTargetGoal((Mob)this, Guardian.class, true, false));
/* 137 */     this.targetSelector.addGoal(15, (Goal)new NearestAttackableTargetGoal((Mob)this, Bee.class, true, false));
/* 138 */     this.targetSelector.addGoal(16, (Goal)new NearestAttackableTargetGoal((Mob)this, Fox.class, true, false));
/* 139 */     this.targetSelector.addGoal(17, (Goal)new NearestAttackableTargetGoal((Mob)this, Zombie.class, true, false));
/* 140 */     this.targetSelector.addGoal(18, (Goal)new NearestAttackableTargetGoal((Mob)this, ZombieVillager.class, true, false));
/* 141 */     this.targetSelector.addGoal(19, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/* 142 */     this.targetSelector.addGoal(20, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/* 143 */     this.goalSelector.addGoal(21, (Goal)new BreakDoorGoal((Mob)this, e -> true));
/* 144 */     this.goalSelector.addGoal(22, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.8D));
/* 145 */     this.goalSelector.addGoal(23, (Goal)new RandomLookAroundGoal((Mob)this));
/* 146 */     this.goalSelector.addGoal(24, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 151 */     return MobType.ARTHROPOD;
/*     */   }
/*     */   
/*     */   protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
/* 155 */     super.dropCustomDeathLoot(source, looting, recentlyHitIn);
/* 156 */     spawnAtLocation(new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 161 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 166 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 171 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 176 */     DarkLatexCakeEntityIsHurtProcedure.execute((Entity)this);
/* 177 */     if (source == DamageSource.FALL)
/* 178 */       return false; 
/* 179 */     if (source == DamageSource.CACTUS)
/* 180 */       return false; 
/* 181 */     if (source == DamageSource.WITHER)
/* 182 */       return false; 
/* 183 */     if (source.getMsgId().equals("witherSkull"))
/* 184 */       return false; 
/* 185 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 190 */     super.die(source);
/* 191 */     DarklatexEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
/* 196 */     super.awardKillScore(entity, score, damageSource);
/* 197 */     DarkLatexCakeThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), entity, (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void playerTouch(Player sourceentity) {
/* 202 */     super.playerTouch(sourceentity);
/* 203 */     DarkLatexCakePlayerCollidesWithThisEntityProcedure.execute((Entity)this, (Entity)sourceentity);
/*     */   }
/*     */   
/*     */   public static void init() {
/* 207 */     DungeonHooks.addDungeonMob((EntityType)LatexModEntities.DARK_LATEX_CAKE.get(), 180);
/*     */   }
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 211 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 212 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.2D);
/* 213 */     builder = builder.add(Attributes.MAX_HEALTH, 25.0D);
/* 214 */     builder = builder.add(Attributes.ARMOR, 0.0D);
/* 215 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 2.0D);
/* 216 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 217 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.2D);
/* 218 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\DarkLatexCakeEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */