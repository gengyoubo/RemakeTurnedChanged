/*     */ package net.mcreator.latexes.entity;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.init.LatexModParticleTypes;
/*     */ import net.mcreator.latexes.procedures.CheckEvilProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckGoodProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckSlimelingProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckentityislatexProcedure;
/*     */ import net.mcreator.latexes.procedures.DarkLatexCreeperEnhancedEntityIsHurtProcedure;
/*     */ import net.mcreator.latexes.procedures.DarkLatexCreeperPlayerCollidesWithThisEntityProcedure;
/*     */ import net.mcreator.latexes.procedures.DarkLatexCreeperRightClickedOnEntityProcedure;
/*     */ import net.mcreator.latexes.procedures.DarkLatexCreeperdiesProcedure;
/*     */ import net.mcreator.latexes.procedures.TargetwearingmaskProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.particles.ParticleOptions;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.Difficulty;
/*     */ import net.minecraft.world.InteractionHand;
/*     */ import net.minecraft.world.InteractionResult;
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
/*     */ import net.minecraftforge.common.DungeonHooks;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class DarkLatexCreeperEntity extends Monster {
/*     */   public DarkLatexCreeperEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  68 */     this((EntityType<DarkLatexCreeperEntity>)LatexModEntities.DARK_LATEX_CREEPER.get(), world);
/*     */   }
/*     */   
/*     */   public DarkLatexCreeperEntity(EntityType<DarkLatexCreeperEntity> type, Level world) {
/*  72 */     super(type, world);
/*  73 */     this.xpReward = 6;
/*  74 */     setNoAi(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  79 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  84 */     super.registerGoals();
/*  85 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.1D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  88 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canUse() {
/*  93 */             double x = DarkLatexCreeperEntity.this.getX();
/*  94 */             double y = DarkLatexCreeperEntity.this.getY();
/*  95 */             double z = DarkLatexCreeperEntity.this.getZ();
/*  96 */             DarkLatexCreeperEntity darkLatexCreeperEntity = DarkLatexCreeperEntity.this;
/*  97 */             Level world = DarkLatexCreeperEntity.this.level;
/*  98 */             return (super.canUse() && TargetwearingmaskProcedure.execute((Entity)darkLatexCreeperEntity));
/*     */           }
/*     */         });
/*     */     
/* 102 */     this.targetSelector.addGoal(2, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).setAlertOthers(new Class[0]));
/* 103 */     this.targetSelector.addGoal(3, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, false, false)
/*     */         {
/*     */           public boolean canUse() {
/* 106 */             double x = DarkLatexCreeperEntity.this.getX();
/* 107 */             double y = DarkLatexCreeperEntity.this.getY();
/* 108 */             double z = DarkLatexCreeperEntity.this.getZ();
/* 109 */             DarkLatexCreeperEntity darkLatexCreeperEntity = DarkLatexCreeperEntity.this;
/* 110 */             Level world = DarkLatexCreeperEntity.this.level;
/* 111 */             return (super.canUse() && CheckSlimelingProcedure.execute((Entity)darkLatexCreeperEntity));
/*     */           }
/*     */         });
/* 114 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 117 */             double x = DarkLatexCreeperEntity.this.getX();
/* 118 */             double y = DarkLatexCreeperEntity.this.getY();
/* 119 */             double z = DarkLatexCreeperEntity.this.getZ();
/* 120 */             DarkLatexCreeperEntity darkLatexCreeperEntity = DarkLatexCreeperEntity.this;
/* 121 */             Level world = DarkLatexCreeperEntity.this.level;
/* 122 */             return (super.canUse() && CheckGoodProcedure.execute((Entity)darkLatexCreeperEntity));
/*     */           }
/*     */         });
/* 125 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/* 128 */             double x = DarkLatexCreeperEntity.this.getX();
/* 129 */             double y = DarkLatexCreeperEntity.this.getY();
/* 130 */             double z = DarkLatexCreeperEntity.this.getZ();
/* 131 */             DarkLatexCreeperEntity darkLatexCreeperEntity = DarkLatexCreeperEntity.this;
/* 132 */             Level world = DarkLatexCreeperEntity.this.level;
/* 133 */             return (super.canUse() && CheckEvilProcedure.execute((Entity)darkLatexCreeperEntity));
/*     */           }
/*     */         });
/* 136 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false));
/* 137 */     this.targetSelector.addGoal(7, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, true, false));
/* 138 */     this.targetSelector.addGoal(8, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, true, false));
/* 139 */     this.targetSelector.addGoal(9, (Goal)new NearestAttackableTargetGoal((Mob)this, IronGolem.class, true, false));
/* 140 */     this.targetSelector.addGoal(10, (Goal)new NearestAttackableTargetGoal((Mob)this, Witch.class, true, false));
/* 141 */     this.targetSelector.addGoal(11, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/* 142 */     this.targetSelector.addGoal(12, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/* 143 */     this.targetSelector.addGoal(13, (Goal)new NearestAttackableTargetGoal((Mob)this, Evoker.class, true, false));
/* 144 */     this.targetSelector.addGoal(14, (Goal)new NearestAttackableTargetGoal((Mob)this, Guardian.class, true, false));
/* 145 */     this.targetSelector.addGoal(15, (Goal)new NearestAttackableTargetGoal((Mob)this, Bee.class, true, false));
/* 146 */     this.targetSelector.addGoal(16, (Goal)new NearestAttackableTargetGoal((Mob)this, Fox.class, true, false));
/* 147 */     this.targetSelector.addGoal(17, (Goal)new NearestAttackableTargetGoal((Mob)this, Zombie.class, true, false));
/* 148 */     this.targetSelector.addGoal(18, (Goal)new NearestAttackableTargetGoal((Mob)this, ZombieVillager.class, true, false));
/* 149 */     this.targetSelector.addGoal(19, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/* 150 */     this.targetSelector.addGoal(20, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/* 151 */     this.goalSelector.addGoal(21, (Goal)new BreakDoorGoal((Mob)this, e -> true));
/* 152 */     this.goalSelector.addGoal(22, (Goal)new LookAtPlayerGoal((Mob)this, DarkLatexCreeperEnhancedEntity.class, 8.0F));
/* 153 */     this.goalSelector.addGoal(23, (Goal)new LeapAtTargetGoal((Mob)this, 0.5F));
/* 154 */     this.goalSelector.addGoal(24, (Goal)new LookAtPlayerGoal((Mob)this, LivingEntity.class, 6.0F)
/*     */         {
/*     */           public boolean canUse() {
/* 157 */             double x = DarkLatexCreeperEntity.this.getX();
/* 158 */             double y = DarkLatexCreeperEntity.this.getY();
/* 159 */             double z = DarkLatexCreeperEntity.this.getZ();
/* 160 */             DarkLatexCreeperEntity darkLatexCreeperEntity = DarkLatexCreeperEntity.this;
/* 161 */             Level world = DarkLatexCreeperEntity.this.level;
/* 162 */             return (super.canUse() && CheckentityislatexProcedure.execute((Entity)darkLatexCreeperEntity));
/*     */           }
/*     */         });
/* 165 */     this.goalSelector.addGoal(25, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.8D));
/* 166 */     this.goalSelector.addGoal(26, (Goal)new RandomLookAroundGoal((Mob)this));
/* 167 */     this.goalSelector.addGoal(27, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 172 */     return MobType.ARTHROPOD;
/*     */   }
/*     */   
/*     */   protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
/* 176 */     super.dropCustomDeathLoot(source, looting, recentlyHitIn);
/* 177 */     spawnAtLocation(new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 182 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 187 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.creeper.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 192 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 197 */     DarkLatexCreeperEnhancedEntityIsHurtProcedure.execute((Entity)this);
/* 198 */     if (source == DamageSource.FALL)
/* 199 */       return false; 
/* 200 */     if (source == DamageSource.CACTUS)
/* 201 */       return false; 
/* 202 */     if (source == DamageSource.WITHER)
/* 203 */       return false; 
/* 204 */     if (source.getMsgId().equals("witherSkull"))
/* 205 */       return false; 
/* 206 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 211 */     super.die(source);
/* 212 */     DarkLatexCreeperdiesProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult mobInteract(Player sourceentity, InteractionHand hand) {
/* 217 */     ItemStack itemstack = sourceentity.getItemInHand(hand);
/* 218 */     InteractionResult retval = InteractionResult.sidedSuccess(this.level.isClientSide());
/* 219 */     super.mobInteract(sourceentity, hand);
/* 220 */     double x = getX();
/* 221 */     double y = getY();
/* 222 */     double z = getZ();
/* 223 */     DarkLatexCreeperEntity darkLatexCreeperEntity = this;
/* 224 */     Level world = this.level;
/*     */     
/* 226 */     DarkLatexCreeperRightClickedOnEntityProcedure.execute((LevelAccessor)world, x, y, z, (Entity)darkLatexCreeperEntity);
/* 227 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void playerTouch(Player sourceentity) {
/* 232 */     super.playerTouch(sourceentity);
/* 233 */     DarkLatexCreeperPlayerCollidesWithThisEntityProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), (Entity)this, (Entity)sourceentity);
/*     */   }
/*     */   
/*     */   public void aiStep() {
/* 237 */     super.aiStep();
/* 238 */     double x = getX();
/* 239 */     double y = getY();
/* 240 */     double z = getZ();
/* 241 */     DarkLatexCreeperEntity darkLatexCreeperEntity = this;
/* 242 */     Level world = this.level;
/* 243 */     for (int l = 0; l < 2; l++) {
/* 244 */       double x0 = x + this.random.nextFloat();
/* 245 */       double y0 = y + this.random.nextFloat();
/* 246 */       double z0 = z + this.random.nextFloat();
/* 247 */       double dx = (this.random.nextFloat() - 0.5D) * 0.3999999985098839D;
/* 248 */       double dy = (this.random.nextFloat() - 0.5D) * 0.3999999985098839D;
/* 249 */       double dz = (this.random.nextFloat() - 0.5D) * 0.3999999985098839D;
/* 250 */       world.addParticle((ParticleOptions)LatexModParticleTypes.DLEFFECTPARTICLES.get(), x0, y0, z0, dx, dy, dz);
/*     */     } 
/*     */   }
/*     */   
/*     */   public static void init() {
/* 255 */     DungeonHooks.addDungeonMob((EntityType)LatexModEntities.DARK_LATEX_CREEPER.get(), 180);
/*     */   }
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 259 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 260 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.2D);
/* 261 */     builder = builder.add(Attributes.MAX_HEALTH, 12.0D);
/* 262 */     builder = builder.add(Attributes.ARMOR, 0.0D);
/* 263 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 1.0D);
/* 264 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 265 */     builder = builder.add(Attributes.ATTACK_KNOCKBACK, 1.0D);
/* 266 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\DarkLatexCreeperEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */