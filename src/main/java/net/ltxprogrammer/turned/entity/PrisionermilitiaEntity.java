/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.ltxprogrammer.turned.entity.ai.TargetCheck;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.init.LatexModItems;
/*     */ import net.ltxprogrammer.turned.procedures.PrisionermilitiaOnInitialEntitySpawnProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.TargethasabatonProcedure;
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
/*     */ import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
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
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class PrisionermilitiaEntity
/*     */   extends PathfinderMob implements RangedAttackMob {
/*     */   public PrisionermilitiaEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  55 */     this((EntityType<PrisionermilitiaEntity>)LatexModEntities.PRISIONERMILITIA.get(), world);
/*     */   }
/*     */   
/*     */   public PrisionermilitiaEntity(EntityType<PrisionermilitiaEntity> type, Level world) {
/*  59 */     super(type, world);
/*  60 */     this.f_21364_ = 0;
/*  61 */     m_21557_(false);
/*  62 */     m_21530_();
/*  63 */     m_8061_(EquipmentSlot.MAINHAND, new ItemStack((ItemLike)LatexModItems.SCRAP_M_16_RIFLE.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  68 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  73 */     super.m_8099_();
/*  74 */     this.f_21346_.m_25352_(1, (Goal)new NearestAttackableTargetGoal((Mob)this, Monster.class, true, false));
/*  75 */     this.f_21346_.m_25352_(2, (Goal)new NearestAttackableTargetGoal((Mob)this, PathfinderMob.class, 10, true, false, TargetCheck.IS_GOOD));
/*  76 */     this.f_21346_.m_25352_(3, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, 10, true, false, TargetCheck.IS_GOOD));
/*  77 */     this.f_21346_.m_25352_(4, (Goal)new NearestAttackableTargetGoal((Mob)this, MilitaryEntity.class, true, false));
/*  78 */     this.f_21346_.m_25352_(5, (Goal)new NearestAttackableTargetGoal((Mob)this, MilitaryflameunitEntity.class, true, false));
/*  79 */     this.f_21346_.m_25352_(6, (Goal)new NearestAttackableTargetGoal((Mob)this, MilitaryRiotEntity.class, true, false));
/*  80 */     this.f_21346_.m_25352_(7, (Goal)new NearestAttackableTargetGoal((Mob)this, CivilianMilitiaMeleeEntity.class, true, false));
/*  81 */     this.f_21346_.m_25352_(8, (Goal)new NearestAttackableTargetGoal((Mob)this, CivlianMilitiaEntity.class, true, false));
/*  82 */     this.f_21346_.m_25352_(9, (Goal)new HurtByTargetGoal(this, new Class[0])
/*     */         {
/*     */           public boolean m_8036_() {
/*  85 */             double x = PrisionermilitiaEntity.this.m_20185_();
/*  86 */             double y = PrisionermilitiaEntity.this.m_20186_();
/*  87 */             double z = PrisionermilitiaEntity.this.m_20189_();
/*  88 */             PrisionermilitiaEntity prisionermilitiaEntity = PrisionermilitiaEntity.this;
/*  89 */             Level world = PrisionermilitiaEntity.this.f_19853_;
/*  90 */             return (super.m_8036_() && TargethasabatonProcedure.execute((Entity)prisionermilitiaEntity));
/*     */           }
/*     */         });
/*  93 */     this.f_21345_.m_25352_(10, (Goal)new MeleeAttackGoal(this, 1.0D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  96 */             return 4.0D + (entity.m_20205_() * entity.m_20205_());
/*     */           }
/*     */         });
/*  99 */     this.f_21345_.m_25352_(11, (Goal)new OpenDoorGoal((Mob)this, true));
/* 100 */     this.f_21345_.m_25352_(12, (Goal)new MoveBackToVillageGoal(this, 0.6D, false));
/* 101 */     this.f_21345_.m_25352_(13, (Goal)new AvoidEntityGoal(this, Monster.class, 7.0F, 1.5D, 0.8D));
/* 102 */     this.f_21345_.m_25352_(14, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 5.0F));
/* 103 */     this.f_21345_.m_25352_(15, (Goal)new LookAtPlayerGoal((Mob)this, EvilScientistEntity.class, 6.0F));
/* 104 */     this.f_21345_.m_25352_(16, (Goal)new LookAtPlayerGoal((Mob)this, EvilMilitaryEntity.class, 6.0F));
/* 105 */     this.f_21345_.m_25352_(17, (Goal)new LookAtPlayerGoal((Mob)this, LivingEntity.class, 4.0F));
/* 106 */     this.f_21345_.m_25352_(18, (Goal)new RandomStrollGoal(this, 0.6D));
/* 107 */     this.f_21345_.m_25352_(19, (Goal)new OpenDoorGoal((Mob)this, false));
/* 108 */     this.f_21345_.m_25352_(20, (Goal)new RandomLookAroundGoal((Mob)this));
/* 109 */     this.f_21345_.m_25352_(21, (Goal)new FloatGoal((Mob)this));
/* 110 */     this.f_21345_.m_25352_(1, (Goal)new RangedAttackGoal(this, 1.25D, 20, 10.0F)
/*     */         {
/*     */           public boolean m_8045_() {
/* 113 */             return m_8036_();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/* 120 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/* 125 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/* 130 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.ambient")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 135 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 140 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.death"));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 146 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 147 */     PrisionermilitiaOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/* 148 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6504_(LivingEntity target, float flval) {
/* 153 */     ScrapM16RifleEntity.shoot((LivingEntity)this, target);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 160 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 161 */     builder = builder.m_22268_(Attributes.f_22279_, 0.25D);
/* 162 */     builder = builder.m_22268_(Attributes.f_22276_, 20.0D);
/* 163 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 164 */     builder = builder.m_22268_(Attributes.f_22281_, 1.0D);
/* 165 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 166 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\PrisionermilitiaEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */