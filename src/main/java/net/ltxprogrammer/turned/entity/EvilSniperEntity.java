/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.ltxprogrammer.turned.entity.ai.TargetCheck;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.init.LatexModItems;
/*     */ import net.ltxprogrammer.turned.procedures.ScientistOnInitialEntitySpawnProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.DifficultyInstance;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.EquipmentSlot;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.SpawnGroupData;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.goal.FloatGoal;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.MoveBackToVillageGoal;
/*     */ import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.monster.RangedAttackMob;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class EvilSniperEntity
/*     */   extends PathfinderMob
/*     */   implements RangedAttackMob {
/*     */   public EvilSniperEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  53 */     this((EntityType<EvilSniperEntity>)LatexModEntities.EVIL_SNIPER.get(), world);
/*     */   }
/*     */   
/*     */   public EvilSniperEntity(EntityType<EvilSniperEntity> type, Level world) {
/*  57 */     super(type, world);
/*  58 */     this.f_21364_ = 0;
/*  59 */     m_21557_(false);
/*  60 */     m_21530_();
/*  61 */     m_8061_(EquipmentSlot.MAINHAND, new ItemStack((ItemLike)LatexModItems.DARTRIFLE.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  66 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  71 */     super.m_8099_();
/*  72 */     this.f_21346_.m_25352_(1, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false));
/*  73 */     this.f_21346_.m_25352_(2, (Goal)new NearestAttackableTargetGoal((Mob)this, Monster.class, 10, true, false, TargetCheck.IS_LATEX));
/*  74 */     this.f_21346_.m_25352_(3, (Goal)new NearestAttackableTargetGoal((Mob)this, PathfinderMob.class, 10, true, false, TargetCheck.IS_GOOD));
/*  75 */     this.f_21346_.m_25352_(4, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, 10, true, false, TargetCheck.IS_SLIMELING));
/*  76 */     this.f_21346_.m_25352_(5, (Goal)new NearestAttackableTargetGoal((Mob)this, MilitaryEntity.class, true, false));
/*  77 */     this.f_21346_.m_25352_(6, (Goal)new NearestAttackableTargetGoal((Mob)this, MilitaryflameunitEntity.class, true, false));
/*  78 */     this.f_21346_.m_25352_(7, (Goal)new NearestAttackableTargetGoal((Mob)this, MilitaryRiotEntity.class, true, false));
/*  79 */     this.f_21346_.m_25352_(8, (Goal)new NearestAttackableTargetGoal((Mob)this, CivlianMilitiaEntity.class, true, false));
/*  80 */     this.f_21346_.m_25352_(9, (Goal)new NearestAttackableTargetGoal((Mob)this, CivilianMilitiaMeleeEntity.class, true, false));
/*  81 */     this.f_21345_.m_25352_(10, (Goal)new MeleeAttackGoal(this, 0.9D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  84 */             return 4.0D + (entity.m_20205_() * entity.m_20205_());
/*     */           }
/*     */         });
/*  87 */     this.f_21346_.m_25352_(11, (Goal)(new HurtByTargetGoal(this, new Class[0])).m_26044_(new Class[0]));
/*  88 */     this.f_21345_.m_25352_(12, (Goal)new MoveBackToVillageGoal(this, 0.6D, false));
/*  89 */     this.f_21345_.m_25352_(13, (Goal)new RandomStrollGoal(this, 1.0D));
/*  90 */     this.f_21345_.m_25352_(14, (Goal)new LookAtPlayerGoal((Mob)this, EvilScientistEntity.class, 6.0F));
/*  91 */     this.f_21345_.m_25352_(15, (Goal)new LookAtPlayerGoal((Mob)this, EvilSniperEntity.class, 6.0F));
/*  92 */     this.f_21345_.m_25352_(16, (Goal)new LookAtPlayerGoal((Mob)this, EvilMilitaryEntity.class, 6.0F));
/*  93 */     this.f_21345_.m_25352_(17, (Goal)new LookAtPlayerGoal((Mob)this, TSCOutsiderGunnerEntity.class, 6.0F));
/*  94 */     this.f_21345_.m_25352_(18, (Goal)new LookAtPlayerGoal((Mob)this, TSCHunterEntity.class, 6.0F));
/*  95 */     this.f_21345_.m_25352_(19, (Goal)new OpenDoorGoal((Mob)this, true));
/*  96 */     this.f_21345_.m_25352_(20, (Goal)new OpenDoorGoal((Mob)this, false));
/*  97 */     this.f_21345_.m_25352_(21, (Goal)new RandomLookAroundGoal((Mob)this));
/*  98 */     this.f_21345_.m_25352_(22, (Goal)new FloatGoal((Mob)this));
/*  99 */     this.f_21345_.m_25352_(1, (Goal)new RangedAttackGoal(this, 1.25D, 20, 10.0F)
/*     */         {
/*     */           public boolean m_8045_() {
/* 102 */             return m_8036_();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/* 109 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/* 114 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/* 119 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.ambient")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 124 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 129 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.death"));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 135 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 136 */     ScientistOnInitialEntitySpawnProcedure.execute((Entity)this);
/* 137 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6504_(LivingEntity target, float flval) {
/* 142 */     DartrifleEntity.shoot((LivingEntity)this, target);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 149 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 150 */     builder = builder.m_22268_(Attributes.f_22279_, 0.25D);
/* 151 */     builder = builder.m_22268_(Attributes.f_22276_, 20.0D);
/* 152 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 153 */     builder = builder.m_22268_(Attributes.f_22281_, 3.0D);
/* 154 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 155 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\EvilSniperEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */