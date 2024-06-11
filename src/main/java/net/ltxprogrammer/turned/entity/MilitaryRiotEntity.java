/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.ltxprogrammer.turned.entity.ai.TargetCheck;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.init.LatexModItems;
/*     */ import net.ltxprogrammer.turned.procedures.MilitaryRiotOnInitialEntitySpawnProcedure;
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
/*     */ import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.monster.Illusioner;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.monster.Pillager;
/*     */ import net.minecraft.world.entity.monster.Ravager;
/*     */ import net.minecraft.world.entity.monster.SpellcasterIllager;
/*     */ import net.minecraft.world.entity.monster.Vindicator;
/*     */ import net.minecraft.world.entity.monster.piglin.Piglin;
/*     */ import net.minecraft.world.entity.monster.piglin.PiglinBrute;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class MilitaryRiotEntity
/*     */   extends PathfinderMob
/*     */ {
/*     */   public MilitaryRiotEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  55 */     this((EntityType<MilitaryRiotEntity>)LatexModEntities.MILITARY_RIOT.get(), world);
/*     */   }
/*     */   
/*     */   public MilitaryRiotEntity(EntityType<MilitaryRiotEntity> type, Level world) {
/*  59 */     super(type, world);
/*  60 */     this.f_21364_ = 6;
/*  61 */     m_21557_(false);
/*  62 */     m_21530_();
/*  63 */     m_8061_(EquipmentSlot.MAINHAND, new ItemStack((ItemLike)LatexModItems.BATON.get()));
/*  64 */     m_8061_(EquipmentSlot.HEAD, new ItemStack((ItemLike)LatexModItems.RIOTARMOR_HELMET.get()));
/*  65 */     m_8061_(EquipmentSlot.CHEST, new ItemStack((ItemLike)LatexModItems.RIOTARMOR_CHESTPLATE.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  70 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  75 */     super.m_8099_();
/*  76 */     this.f_21346_.m_25352_(1, (Goal)(new HurtByTargetGoal(this, new Class[0])).m_26044_(new Class[0]));
/*  77 */     this.f_21345_.m_25352_(2, (Goal)new MeleeAttackGoal(this, 1.0D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  80 */             return 4.0D + (entity.m_20205_() * entity.m_20205_());
/*     */           }
/*     */         });
/*  83 */     this.f_21345_.m_25352_(3, (Goal)new OpenDoorGoal((Mob)this, true));
/*  84 */     this.f_21345_.m_25352_(4, (Goal)new RandomStrollGoal(this, 0.6D));
/*  85 */     this.f_21345_.m_25352_(5, (Goal)new LookAtPlayerGoal((Mob)this, LivingEntity.class, 6.0F));
/*  86 */     this.f_21345_.m_25352_(6, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 5.0F));
/*  87 */     this.f_21345_.m_25352_(7, (Goal)new OpenDoorGoal((Mob)this, false));
/*  88 */     this.f_21345_.m_25352_(8, (Goal)new RandomLookAroundGoal((Mob)this));
/*  89 */     this.f_21345_.m_25352_(9, (Goal)new FloatGoal((Mob)this));
/*  90 */     this.f_21346_.m_25352_(10, (Goal)new NearestAttackableTargetGoal((Mob)this, Monster.class, true, false));
/*  91 */     this.f_21346_.m_25352_(11, (Goal)new NearestAttackableTargetGoal((Mob)this, PathfinderMob.class, 10, true, false, TargetCheck.IS_EVIL));
/*  92 */     this.f_21346_.m_25352_(12, (Goal)new NearestAttackableTargetGoal((Mob)this, SlimelingEntity.class, true, false));
/*  93 */     this.f_21346_.m_25352_(13, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, 10, true, false, TargetCheck.IS_EVIL));
/*  94 */     this.f_21346_.m_25352_(14, (Goal)new NearestAttackableTargetGoal((Mob)this, Illusioner.class, true, false));
/*  95 */     this.f_21346_.m_25352_(15, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/*  96 */     this.f_21346_.m_25352_(16, (Goal)new NearestAttackableTargetGoal((Mob)this, Ravager.class, true, false));
/*  97 */     this.f_21346_.m_25352_(17, (Goal)new NearestAttackableTargetGoal((Mob)this, SpellcasterIllager.class, true, false));
/*  98 */     this.f_21346_.m_25352_(18, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/*  99 */     this.f_21346_.m_25352_(19, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/* 100 */     this.f_21346_.m_25352_(20, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/* 101 */     this.f_21346_.m_25352_(21, (Goal)new NearestAttackableTargetGoal((Mob)this, Monster.class, true, false));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/* 106 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/* 111 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 116 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 121 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 127 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 128 */     MilitaryRiotOnInitialEntitySpawnProcedure.execute((Entity)this);
/* 129 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 136 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 137 */     builder = builder.m_22268_(Attributes.f_22279_, 0.25D);
/* 138 */     builder = builder.m_22268_(Attributes.f_22276_, 20.0D);
/* 139 */     builder = builder.m_22268_(Attributes.f_22284_, 1.5D);
/* 140 */     builder = builder.m_22268_(Attributes.f_22281_, 3.0D);
/* 141 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 142 */     builder = builder.m_22268_(Attributes.f_22278_, 0.6D);
/* 143 */     builder = builder.m_22268_(Attributes.f_22282_, 0.2D);
/* 144 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\MilitaryRiotEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */