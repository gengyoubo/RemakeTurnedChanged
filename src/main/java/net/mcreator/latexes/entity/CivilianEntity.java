/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
/*     */ import net.minecraft.world.entity.ai.goal.FloatGoal;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
/*     */ import net.minecraft.world.entity.ai.goal.MoveBackToVillageGoal;
/*     */ import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
/*     */ import net.minecraft.world.entity.ai.goal.PanicGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class CivilianEntity
/*     */   extends PathfinderMob {
/*     */   public CivilianEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  38 */     this((EntityType<CivilianEntity>)LatexModEntities.CIVILIAN.get(), world);
/*     */   }
/*     */   
/*     */   public CivilianEntity(EntityType<CivilianEntity> type, Level world) {
/*  42 */     super(type, world);
/*  43 */     this.xpReward = 0;
/*  44 */     setNoAi(false);
/*  45 */     setPersistenceRequired();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  50 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  55 */     super.registerGoals();
/*  56 */     this.targetSelector.addGoal(1, (Goal)(new HurtByTargetGoal(this, new Class[0])).setAlertOthers(new Class[0]));
/*  57 */     this.goalSelector.addGoal(2, (Goal)new PanicGoal(this, 1.2D));
/*  58 */     this.targetSelector.addGoal(3, (Goal)new NearestAttackableTargetGoal((Mob)this, Monster.class, true, false));
/*  59 */     this.goalSelector.addGoal(4, (Goal)new OpenDoorGoal((Mob)this, true));
/*  60 */     this.goalSelector.addGoal(5, (Goal)new AvoidEntityGoal(this, Monster.class, 9.0F, 1.2D, 0.8D));
/*  61 */     this.goalSelector.addGoal(6, (Goal)new AvoidEntityGoal(this, EvilMilitaryEntity.class, 8.0F, 1.2D, 0.8D));
/*  62 */     this.goalSelector.addGoal(7, (Goal)new AvoidEntityGoal(this, EvilSniperEntity.class, 8.0F, 1.2D, 0.8D));
/*  63 */     this.goalSelector.addGoal(8, (Goal)new AvoidEntityGoal(this, SlimelingEntity.class, 9.0F, 1.2D, 0.8D));
/*  64 */     this.goalSelector.addGoal(9, (Goal)new MoveBackToVillageGoal(this, 0.6D, false));
/*  65 */     this.goalSelector.addGoal(10, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 6.0F));
/*  66 */     this.goalSelector.addGoal(11, (Goal)new LookAtPlayerGoal((Mob)this, MilitaryEntity.class, 6.0F));
/*  67 */     this.goalSelector.addGoal(12, (Goal)new LookAtPlayerGoal((Mob)this, ScientistEntity.class, 6.0F));
/*  68 */     this.goalSelector.addGoal(13, (Goal)new LookAtPlayerGoal((Mob)this, EvilScientistEntity.class, 6.0F));
/*  69 */     this.goalSelector.addGoal(14, (Goal)new RandomStrollGoal(this, 0.6D));
/*  70 */     this.goalSelector.addGoal(15, (Goal)new OpenDoorGoal((Mob)this, false));
/*  71 */     this.goalSelector.addGoal(16, (Goal)new RandomLookAroundGoal((Mob)this));
/*  72 */     this.goalSelector.addGoal(17, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/*  77 */     return MobType.UNDEFINED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/*  82 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void playStepSound(BlockPos pos, BlockState blockIn) {
/*  87 */     playSound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/*  92 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/*  97 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 104 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 105 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25D);
/* 106 */     builder = builder.add(Attributes.MAX_HEALTH, 20.0D);
/* 107 */     builder = builder.add(Attributes.ARMOR, 0.0D);
/* 108 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 1.0D);
/* 109 */     builder = builder.add(Attributes.FOLLOW_RANGE, 12.0D);
/* 110 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\CivilianEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */