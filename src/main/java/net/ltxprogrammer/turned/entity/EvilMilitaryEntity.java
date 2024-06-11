/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.ltxprogrammer.turned.entity.ai.TargetCheck;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.init.LatexModItems;
/*     */ import net.ltxprogrammer.turned.procedures.EvilMilitaryOnInitialEntitySpawnProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.TargetwearingbadberetProcedure;
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
/*     */ import net.minecraft.world.entity.npc.Villager;
/*     */ import net.minecraft.world.entity.npc.WanderingTrader;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ 
/*     */ public class EvilMilitaryEntity
/*     */   extends PathfinderMob
/*     */   implements RangedAttackMob
/*     */ {
/*     */   public EvilMilitaryEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  56 */     this((EntityType<EvilMilitaryEntity>)LatexModEntities.EVIL_MILITARY.get(), world);
/*     */   }
/*     */   
/*     */   public EvilMilitaryEntity(EntityType<EvilMilitaryEntity> type, Level world) {
/*  60 */     super(type, world);
/*  61 */     this.f_21364_ = 0;
/*  62 */     m_21557_(false);
/*  63 */     m_21530_();
/*  64 */     m_8061_(EquipmentSlot.MAINHAND, new ItemStack((ItemLike)LatexModItems.AR_70_ASSAULT_RIFLE.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  69 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  74 */     super.m_8099_();
/*  75 */     this.f_21346_.m_25352_(1, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false)
/*     */         {
/*     */           public boolean m_8036_() {
/*  78 */             double x = EvilMilitaryEntity.this.m_20185_();
/*  79 */             double y = EvilMilitaryEntity.this.m_20186_();
/*  80 */             double z = EvilMilitaryEntity.this.m_20189_();
/*  81 */             EvilMilitaryEntity evilMilitaryEntity = EvilMilitaryEntity.this;
/*  82 */             Level world = EvilMilitaryEntity.this.f_19853_;
/*  83 */             return (super.m_8036_() && TargetwearingbadberetProcedure.execute((Entity)evilMilitaryEntity));
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean m_8045_() {
/*  88 */             double x = EvilMilitaryEntity.this.m_20185_();
/*  89 */             double y = EvilMilitaryEntity.this.m_20186_();
/*  90 */             double z = EvilMilitaryEntity.this.m_20189_();
/*  91 */             EvilMilitaryEntity evilMilitaryEntity = EvilMilitaryEntity.this;
/*  92 */             Level world = EvilMilitaryEntity.this.f_19853_;
/*  93 */             return (super.m_8045_() && TargetwearingbadberetProcedure.execute((Entity)evilMilitaryEntity));
/*     */           }
/*     */         });
/*  96 */     this.f_21346_.m_25352_(2, (Goal)new NearestAttackableTargetGoal((Mob)this, Monster.class, 10, true, false, TargetCheck.IS_LATEX));
/*  97 */     this.f_21346_.m_25352_(3, (Goal)new NearestAttackableTargetGoal((Mob)this, PathfinderMob.class, 10, true, false, TargetCheck.IS_GOOD));
/*  98 */     this.f_21346_.m_25352_(4, (Goal)new NearestAttackableTargetGoal((Mob)this, MilitaryEntity.class, true, false));
/*  99 */     this.f_21346_.m_25352_(5, (Goal)new NearestAttackableTargetGoal((Mob)this, MilitaryRiotEntity.class, true, false));
/* 100 */     this.f_21346_.m_25352_(6, (Goal)new NearestAttackableTargetGoal((Mob)this, MilitaryflameunitEntity.class, true, false));
/* 101 */     this.f_21346_.m_25352_(7, (Goal)new NearestAttackableTargetGoal((Mob)this, CivilianEntity.class, true, false));
/* 102 */     this.f_21346_.m_25352_(8, (Goal)new NearestAttackableTargetGoal((Mob)this, CivilianMilitiaMeleeEntity.class, true, false));
/* 103 */     this.f_21346_.m_25352_(9, (Goal)new NearestAttackableTargetGoal((Mob)this, CivlianMilitiaEntity.class, true, false));
/* 104 */     this.f_21346_.m_25352_(10, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, true, false));
/* 105 */     this.f_21346_.m_25352_(11, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, true, false));
/* 106 */     this.f_21345_.m_25352_(12, (Goal)new MeleeAttackGoal(this, 1.0D, false));
/* 107 */     this.f_21346_.m_25352_(13, (Goal)(new HurtByTargetGoal(this, new Class[0])).m_26044_(new Class[0]));
/* 108 */     this.f_21345_.m_25352_(14, (Goal)new MoveBackToVillageGoal(this, 0.6D, false));
/* 109 */     this.f_21345_.m_25352_(15, (Goal)new RandomStrollGoal(this, 1.0D));
/* 110 */     this.f_21345_.m_25352_(16, (Goal)new OpenDoorGoal((Mob)this, true));
/* 111 */     this.f_21345_.m_25352_(17, (Goal)new OpenDoorGoal((Mob)this, false));
/* 112 */     this.f_21345_.m_25352_(18, (Goal)new LookAtPlayerGoal((Mob)this, LivingEntity.class, 6.0F));
/* 113 */     this.f_21345_.m_25352_(19, (Goal)new LookAtPlayerGoal((Mob)this, PrisionerEntity.class, 5.0F));
/* 114 */     this.f_21345_.m_25352_(20, (Goal)new RandomLookAroundGoal((Mob)this));
/* 115 */     this.f_21345_.m_25352_(21, (Goal)new FloatGoal((Mob)this));
/* 116 */     this.f_21345_.m_25352_(1, (Goal)new RangedAttackGoal(this, 1.25D, 20, 10.0F)
/*     */         {
/*     */           public boolean m_8045_() {
/* 119 */             return m_8036_();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/* 126 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/* 131 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 136 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 141 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/* 146 */     if (source.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 147 */       return false; 
/* 148 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 154 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 155 */     EvilMilitaryOnInitialEntitySpawnProcedure.execute((Entity)this);
/* 156 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6504_(LivingEntity target, float flval) {
/* 161 */     AR70AssaultRifleEntity.shoot((LivingEntity)this, target);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 168 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 169 */     builder = builder.m_22268_(Attributes.f_22279_, 0.25D);
/* 170 */     builder = builder.m_22268_(Attributes.f_22276_, 20.0D);
/* 171 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 172 */     builder = builder.m_22268_(Attributes.f_22281_, 3.0D);
/* 173 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 174 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\EvilMilitaryEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */