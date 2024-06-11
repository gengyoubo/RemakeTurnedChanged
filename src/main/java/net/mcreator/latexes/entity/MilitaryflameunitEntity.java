/*     */ package net.mcreator.latexes.entity;
/*     */ 
/*     */ import net.mcreator.latexes.init.LatexModBlocks;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.CheckEvilProcedure;
/*     */ import net.mcreator.latexes.procedures.CheckentityislatexProcedure;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.EquipmentSlot;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.goal.FloatGoal;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RemoveBlockGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.monster.Illusioner;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.monster.Pillager;
/*     */ import net.minecraft.world.entity.monster.RangedAttackMob;
/*     */ import net.minecraft.world.entity.monster.SpellcasterIllager;
/*     */ import net.minecraft.world.entity.monster.Vindicator;
/*     */ import net.minecraft.world.entity.monster.piglin.Piglin;
/*     */ import net.minecraft.world.entity.monster.piglin.PiglinBrute;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class MilitaryflameunitEntity
/*     */   extends PathfinderMob
/*     */   implements RangedAttackMob {
/*     */   public MilitaryflameunitEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  51 */     this((EntityType<MilitaryflameunitEntity>)LatexModEntities.MILITARYFLAMEUNIT.get(), world);
/*     */   }
/*     */   
/*     */   public MilitaryflameunitEntity(EntityType<MilitaryflameunitEntity> type, Level world) {
/*  55 */     super(type, world);
/*  56 */     this.xpReward = 0;
/*  57 */     setNoAi(false);
/*  58 */     setPersistenceRequired();
/*  59 */     setItemSlot(EquipmentSlot.MAINHAND, new ItemStack((ItemLike)LatexModItems.FLAMETHOWER.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  64 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  69 */     super.registerGoals();
/*  70 */     this.targetSelector.addGoal(1, (Goal)new NearestAttackableTargetGoal((Mob)this, PathfinderMob.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/*  73 */             double x = MilitaryflameunitEntity.this.getX();
/*  74 */             double y = MilitaryflameunitEntity.this.getY();
/*  75 */             double z = MilitaryflameunitEntity.this.getZ();
/*  76 */             MilitaryflameunitEntity militaryflameunitEntity = MilitaryflameunitEntity.this;
/*  77 */             Level world = MilitaryflameunitEntity.this.level;
/*  78 */             return (super.canUse() && CheckEvilProcedure.execute((Entity)militaryflameunitEntity));
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canContinueToUse() {
/*  83 */             double x = MilitaryflameunitEntity.this.getX();
/*  84 */             double y = MilitaryflameunitEntity.this.getY();
/*  85 */             double z = MilitaryflameunitEntity.this.getZ();
/*  86 */             MilitaryflameunitEntity militaryflameunitEntity = MilitaryflameunitEntity.this;
/*  87 */             Level world = MilitaryflameunitEntity.this.level;
/*  88 */             return (super.canContinueToUse() && CheckEvilProcedure.execute((Entity)militaryflameunitEntity));
/*     */           }
/*     */         });
/*  91 */     this.targetSelector.addGoal(2, (Goal)new NearestAttackableTargetGoal((Mob)this, Monster.class, true, false)
/*     */         {
/*     */           public boolean canUse() {
/*  94 */             double x = MilitaryflameunitEntity.this.getX();
/*  95 */             double y = MilitaryflameunitEntity.this.getY();
/*  96 */             double z = MilitaryflameunitEntity.this.getZ();
/*  97 */             MilitaryflameunitEntity militaryflameunitEntity = MilitaryflameunitEntity.this;
/*  98 */             Level world = MilitaryflameunitEntity.this.level;
/*  99 */             return (super.canUse() && CheckentityislatexProcedure.execute((Entity)militaryflameunitEntity));
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean canContinueToUse() {
/* 104 */             double x = MilitaryflameunitEntity.this.getX();
/* 105 */             double y = MilitaryflameunitEntity.this.getY();
/* 106 */             double z = MilitaryflameunitEntity.this.getZ();
/* 107 */             MilitaryflameunitEntity militaryflameunitEntity = MilitaryflameunitEntity.this;
/* 108 */             Level world = MilitaryflameunitEntity.this.level;
/* 109 */             return (super.canContinueToUse() && CheckentityislatexProcedure.execute((Entity)militaryflameunitEntity));
/*     */           }
/*     */         });
/* 112 */     this.targetSelector.addGoal(3, (Goal)new NearestAttackableTargetGoal((Mob)this, EvilMilitaryEntity.class, true, false));
/* 113 */     this.targetSelector.addGoal(4, (Goal)new NearestAttackableTargetGoal((Mob)this, EvilSniperEntity.class, true, false));
/* 114 */     this.targetSelector.addGoal(5, (Goal)new NearestAttackableTargetGoal((Mob)this, PrisionermilitiaEntity.class, true, false));
/* 115 */     this.targetSelector.addGoal(6, (Goal)new NearestAttackableTargetGoal((Mob)this, PrisionerMilitiaMeleeEntity.class, true, false));
/* 116 */     this.targetSelector.addGoal(7, (Goal)new NearestAttackableTargetGoal((Mob)this, Illusioner.class, true, false));
/* 117 */     this.targetSelector.addGoal(8, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/* 118 */     this.targetSelector.addGoal(9, (Goal)new NearestAttackableTargetGoal((Mob)this, SpellcasterIllager.class, true, false));
/* 119 */     this.targetSelector.addGoal(10, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/* 120 */     this.targetSelector.addGoal(11, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/* 121 */     this.targetSelector.addGoal(12, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/* 122 */     this.targetSelector.addGoal(13, (Goal)new NearestAttackableTargetGoal((Mob)this, Monster.class, true, false));
/* 123 */     this.goalSelector.addGoal(14, (Goal)new MeleeAttackGoal(this, 1.0D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/* 126 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */         });
/* 129 */     this.goalSelector.addGoal(15, (Goal)new RandomStrollGoal(this, 0.6D));
/* 130 */     this.goalSelector.addGoal(16, (Goal)new OpenDoorGoal((Mob)this, true));
/* 131 */     this.goalSelector.addGoal(17, (Goal)new OpenDoorGoal((Mob)this, false));
/* 132 */     this.goalSelector.addGoal(18, (Goal)new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXBLOCK.get(), this, 1.0D, 3));
/* 133 */     this.goalSelector.addGoal(19, (Goal)new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXBLOCKHARMLESS.get(), this, 1.0D, 3));
/* 134 */     this.goalSelector.addGoal(20, (Goal)new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get(), this, 1.0D, 3));
/* 135 */     this.targetSelector.addGoal(21, (Goal)(new HurtByTargetGoal(this, new Class[0])).setAlertOthers(new Class[0]));
/* 136 */     this.goalSelector.addGoal(22, (Goal)new RandomLookAroundGoal((Mob)this));
/* 137 */     this.goalSelector.addGoal(23, (Goal)new FloatGoal((Mob)this));
/* 138 */     this.goalSelector.addGoal(1, (Goal)new RangedAttackGoal(this, 1.25D, 20, 10.0F)
/*     */         {
/*     */           public boolean canContinueToUse() {
/* 141 */             return canUse();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 148 */     return MobType.UNDEFINED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/* 153 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 158 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 163 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 168 */     if (source.getDirectEntity() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.getDirectEntity() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 169 */       return false; 
/* 170 */     if (source == DamageSource.DRAGON_BREATH)
/* 171 */       return false; 
/* 172 */     if (source == DamageSource.WITHER)
/* 173 */       return false; 
/* 174 */     if (source.getMsgId().equals("witherSkull"))
/* 175 */       return false; 
/* 176 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void performRangedAttack(LivingEntity target, float flval) {
/* 181 */     FlamethowerEntity.shoot((LivingEntity)this, target);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 188 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 189 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.25D);
/* 190 */     builder = builder.add(Attributes.MAX_HEALTH, 20.0D);
/* 191 */     builder = builder.add(Attributes.ARMOR, 0.0D);
/* 192 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 3.0D);
/* 193 */     builder = builder.add(Attributes.FOLLOW_RANGE, 16.0D);
/* 194 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\MilitaryflameunitEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */