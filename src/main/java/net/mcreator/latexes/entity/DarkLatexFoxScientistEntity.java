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
/*     */ public class DarkLatexFoxScientistEntity extends Monster {
/*     */   public DarkLatexFoxScientistEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  56 */     this((EntityType<DarkLatexFoxScientistEntity>)LatexModEntities.DARK_LATEX_FOX_SCIENTIST.get(), world);
/*     */   }
/*     */   
/*     */   public DarkLatexFoxScientistEntity(EntityType<DarkLatexFoxScientistEntity> type, Level world) {
/*  60 */     super(type, world);
/*  61 */     this.xpReward = 6;
/*  62 */     setNoAi(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  67 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  72 */     super.registerGoals();
/*  73 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.1D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  76 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canUse() {
/*  81 */             double x = DarkLatexFoxScientistEntity.this.getX();
/*  82 */             double y = DarkLatexFoxScientistEntity.this.getY();
/*  83 */             double z = DarkLatexFoxScientistEntity.this.getZ();
/*  84 */             DarkLatexFoxScientistEntity darkLatexFoxScientistEntity = DarkLatexFoxScientistEntity.this;
/*  85 */             Level world = DarkLatexFoxScientistEntity.this.level;
/*  86 */             return (super.canUse() && TargetwearingmaskProcedure.execute((Entity)darkLatexFoxScientistEntity));
/*     */           }
/*     */         });
/*     */     
/*  90 */     this.targetSelector.addGoal(2, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, false, true)
/*     */         {
/*     */           public boolean canUse() {
/*  93 */             double x = DarkLatexFoxScientistEntity.this.getX();
/*  94 */             double y = DarkLatexFoxScientistEntity.this.getY();
/*  95 */             double z = DarkLatexFoxScientistEntity.this.getZ();
/*  96 */             DarkLatexFoxScientistEntity darkLatexFoxScientistEntity = DarkLatexFoxScientistEntity.this;
/*  97 */             Level world = DarkLatexFoxScientistEntity.this.level;
/*  98 */             return (super.canUse() && CheckSlimelingProcedure.execute((Entity)darkLatexFoxScientistEntity));
/*     */           }
/*     */         });
/* 101 */     this.targetSelector.addGoal(3, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, false, true)
/*     */         {
/*     */           public boolean canUse() {
/* 104 */             double x = DarkLatexFoxScientistEntity.this.getX();
/* 105 */             double y = DarkLatexFoxScientistEntity.this.getY();
/* 106 */             double z = DarkLatexFoxScientistEntity.this.getZ();
/* 107 */             DarkLatexFoxScientistEntity darkLatexFoxScientistEntity = DarkLatexFoxScientistEntity.this;
/* 108 */             Level world = DarkLatexFoxScientistEntity.this.level;
/* 109 */             return (super.canUse() && CheckGoodProcedure.execute((Entity)darkLatexFoxScientistEntity));
/*     */           }
/*     */         });
/* 112 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, false, true)
/*     */         {
/*     */           public boolean canUse() {
/* 115 */             double x = DarkLatexFoxScientistEntity.this.getX();
/* 116 */             double y = DarkLatexFoxScientistEntity.this.getY();
/* 117 */             double z = DarkLatexFoxScientistEntity.this.getZ();
/* 118 */             DarkLatexFoxScientistEntity darkLatexFoxScientistEntity = DarkLatexFoxScientistEntity.this;
/* 119 */             Level world = DarkLatexFoxScientistEntity.this.level;
/* 120 */             return (super.canUse() && CheckEvilProcedure.execute((Entity)darkLatexFoxScientistEntity));
/*     */           }
/*     */         });
/* 123 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false));
/* 124 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, true, false));
/* 125 */     this.targetSelector.addGoal(7, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, true, false));
/* 126 */     this.targetSelector.addGoal(8, (Goal)new NearestAttackableTargetGoal((Mob)this, IronGolem.class, false, false));
/* 127 */     this.targetSelector.addGoal(9, (Goal)new NearestAttackableTargetGoal((Mob)this, Witch.class, true, false));
/* 128 */     this.targetSelector.addGoal(10, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/* 129 */     this.targetSelector.addGoal(11, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/* 130 */     this.targetSelector.addGoal(12, (Goal)new NearestAttackableTargetGoal((Mob)this, Evoker.class, true, false));
/* 131 */     this.targetSelector.addGoal(13, (Goal)new NearestAttackableTargetGoal((Mob)this, Guardian.class, true, false));
/* 132 */     this.targetSelector.addGoal(14, (Goal)new NearestAttackableTargetGoal((Mob)this, Zombie.class, true, false));
/* 133 */     this.targetSelector.addGoal(15, (Goal)new NearestAttackableTargetGoal((Mob)this, ZombieVillager.class, true, false));
/* 134 */     this.targetSelector.addGoal(16, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/* 135 */     this.targetSelector.addGoal(17, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/* 136 */     this.goalSelector.addGoal(18, (Goal)new BreakDoorGoal((Mob)this, e -> true));
/* 137 */     this.goalSelector.addGoal(19, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.8D));
/* 138 */     this.targetSelector.addGoal(20, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).setAlertOthers(new Class[0]));
/* 139 */     this.goalSelector.addGoal(21, (Goal)new RandomLookAroundGoal((Mob)this));
/* 140 */     this.goalSelector.addGoal(22, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 145 */     return MobType.ARTHROPOD;
/*     */   }
/*     */   
/*     */   protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
/* 149 */     super.dropCustomDeathLoot(source, looting, recentlyHitIn);
/* 150 */     spawnAtLocation(new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 155 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 160 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 165 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 170 */     if (source == DamageSource.FALL)
/* 171 */       return false; 
/* 172 */     if (source == DamageSource.CACTUS)
/* 173 */       return false; 
/* 174 */     if (source == DamageSource.WITHER)
/* 175 */       return false; 
/* 176 */     if (source.getMsgId().equals("witherSkull"))
/* 177 */       return false; 
/* 178 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 183 */     super.die(source);
/* 184 */     DarklatexEntityDiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void awardKillScore(Entity entity, int score, DamageSource damageSource) {
/* 189 */     super.awardKillScore(entity, score, damageSource);
/* 190 */     DarkLatexFoxThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 197 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 198 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.4D);
/* 199 */     builder = builder.add(Attributes.MAX_HEALTH, 18.0D);
/* 200 */     builder = builder.add(Attributes.ARMOR, 0.0D);
/* 201 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 4.0D);
/* 202 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 203 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.3D);
/* 204 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\DarkLatexFoxScientistEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */