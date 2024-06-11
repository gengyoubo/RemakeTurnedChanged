/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import net.mcreator.latexes.init.LatexModBlocks;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.procedures.CheckEvilProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckentityislatexProcedure;
/*     */ import net.mcreator.latexes.procedures.TSCOutsiderGunnerEntityDiesProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.goal.FloatGoal;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RemoveBlockGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.animal.IronGolem;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.monster.RangedAttackMob;
/*     */ import net.minecraft.world.entity.npc.Villager;
/*     */ import net.minecraft.world.entity.npc.WanderingTrader;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class TSCOutsiderGunnerEntity
/*     */   extends Monster implements RangedAttackMob {
/*     */   public TSCOutsiderGunnerEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  51 */     this((EntityType<TSCOutsiderGunnerEntity>)LatexModEntities.TSC_OUTSIDER_GUNNER.get(), world);
/*     */   }
/*     */   
/*     */   public TSCOutsiderGunnerEntity(EntityType<TSCOutsiderGunnerEntity> type, Level world) {
/*  55 */     super(type, world);
/*  56 */     this.xpReward = 0;
/*  57 */     setNoAi(false);
/*  58 */     setPersistenceRequired();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  63 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  68 */     super.registerGoals();
/*  69 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  72 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */         });
/*  75 */     this.goalSelector.addGoal(2, (Goal)new OpenDoorGoal((Mob)this, true));
/*  76 */     this.targetSelector.addGoal(3, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false));
/*  77 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/*  80 */             double x = TSCOutsiderGunnerEntity.this.getX();
/*  81 */             double y = TSCOutsiderGunnerEntity.this.getY();
/*  82 */             double z = TSCOutsiderGunnerEntity.this.getZ();
/*  83 */             TSCOutsiderGunnerEntity tSCOutsiderGunnerEntity = TSCOutsiderGunnerEntity.this;
/*  84 */             Level world = TSCOutsiderGunnerEntity.this.level;
/*  85 */             return (super.canUse() && CheckentityislatexProcedure.execute((Entity)tSCOutsiderGunnerEntity));
/*     */           }
/*     */         });
/*  88 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/*  91 */             double x = TSCOutsiderGunnerEntity.this.getX();
/*  92 */             double y = TSCOutsiderGunnerEntity.this.getY();
/*  93 */             double z = TSCOutsiderGunnerEntity.this.getZ();
/*  94 */             TSCOutsiderGunnerEntity tSCOutsiderGunnerEntity = TSCOutsiderGunnerEntity.this;
/*  95 */             Level world = TSCOutsiderGunnerEntity.this.level;
/*  96 */             return (super.canUse() && CheckentityislatexProcedure.execute((Entity)tSCOutsiderGunnerEntity));
/*     */           }
/*     */         });
/*  99 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, true, false));
/* 100 */     this.targetSelector.addGoal(7, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, true, false));
/* 101 */     this.targetSelector.addGoal(8, (Goal)new NearestAttackableTargetGoal((Mob)this, IronGolem.class, true, false));
/* 102 */     this.goalSelector.addGoal(9, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/* 103 */     this.goalSelector.addGoal(10, (Goal)new LookAtPlayerGoal((Mob)this, LivingEntity.class, 4.0F)
/*     */         {
/*     */           public boolean canUse() {
/* 106 */             double x = TSCOutsiderGunnerEntity.this.getX();
/* 107 */             double y = TSCOutsiderGunnerEntity.this.getY();
/* 108 */             double z = TSCOutsiderGunnerEntity.this.getZ();
/* 109 */             TSCOutsiderGunnerEntity tSCOutsiderGunnerEntity = TSCOutsiderGunnerEntity.this;
/* 110 */             Level world = TSCOutsiderGunnerEntity.this.level;
/* 111 */             return (super.canUse() && CheckEvilProcedure.execute((Entity)tSCOutsiderGunnerEntity));
/*     */           }
/*     */         });
/* 114 */     this.goalSelector.addGoal(11, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 8.0F));
/* 115 */     this.targetSelector.addGoal(12, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).setAlertOthers(new Class[0]));
/* 116 */     this.goalSelector.addGoal(13, (Goal)new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXBLOCK.get(), (PathfinderMob)this, 1.0D, 3));
/* 117 */     this.goalSelector.addGoal(14, (Goal)new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXBLOCKHARMLESS.get(), (PathfinderMob)this, 1.0D, 3));
/* 118 */     this.goalSelector.addGoal(15, (Goal)new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get(), (PathfinderMob)this, 1.0D, 3));
/* 119 */     this.goalSelector.addGoal(16, (Goal)new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXHIVE.get(), (PathfinderMob)this, 1.0D, 3));
/* 120 */     this.goalSelector.addGoal(17, (Goal)new OpenDoorGoal((Mob)this, false));
/* 121 */     this.goalSelector.addGoal(18, (Goal)new RandomLookAroundGoal((Mob)this));
/* 122 */     this.goalSelector.addGoal(19, (Goal)new FloatGoal((Mob)this));
/* 123 */     this.goalSelector.addGoal(1, (Goal)new RangedAttackGoal(this, 1.25D, 20, 10.0F)
/*     */         {
/*     */           public boolean canContinueToUse() {
/* 126 */             return canUse();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 133 */     return MobType.UNDEFINED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/* 138 */     return false;
/*     */   }
/*     */   
/*     */   protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
/* 142 */     super.dropCustomDeathLoot(source, looting, recentlyHitIn);
/* 143 */     spawnAtLocation(new ItemStack((ItemLike)Items.IRON_INGOT));
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/* 148 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.iron_golem.step")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 153 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal.hit"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 158 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:death_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 163 */     if (source.getDirectEntity() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.getDirectEntity() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 164 */       return false; 
/* 165 */     if (source == DamageSource.DROWN)
/* 166 */       return false; 
/* 167 */     if (source == DamageSource.DRAGON_BREATH)
/* 168 */       return false; 
/* 169 */     if (source == DamageSource.WITHER)
/* 170 */       return false; 
/* 171 */     if (source.getMsgId().equals("witherSkull"))
/* 172 */       return false; 
/* 173 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void die(DamageSource source) {
/* 178 */     super.die(source);
/* 179 */     TSCOutsiderGunnerEntityDiesProcedure.execute();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void performRangedAttack(LivingEntity target, float flval) {
/* 186 */     TSCPistolEntity.shoot((LivingEntity)this, target);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 193 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 194 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.3D);
/* 195 */     builder = builder.add(Attributes.MAX_HEALTH, 30.0D);
/* 196 */     builder = builder.add(Attributes.ARMOR, 6.0D);
/* 197 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 3.0D);
/* 198 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 199 */     builder = builder.add(Attributes.KNOCKBACK_RESISTANCE, 0.5D);
/* 200 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\TSCOutsiderGunnerEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */