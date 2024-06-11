/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.ltxprogrammer.turned.entity.ai.TargetCheck;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.init.LatexModItems;
/*     */ import net.ltxprogrammer.turned.procedures.MilitaryOnInitialEntitySpawnProcedure;
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
/*     */ import net.minecraft.world.entity.ai.goal.FollowMobGoal;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.TemptGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.monster.Illusioner;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.monster.Pillager;
/*     */ import net.minecraft.world.entity.monster.RangedAttackMob;
/*     */ import net.minecraft.world.entity.monster.Ravager;
/*     */ import net.minecraft.world.entity.monster.SpellcasterIllager;
/*     */ import net.minecraft.world.entity.monster.Vindicator;
/*     */ import net.minecraft.world.entity.monster.piglin.Piglin;
/*     */ import net.minecraft.world.entity.monster.piglin.PiglinBrute;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.crafting.Ingredient;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ 
/*     */ public class MilitaryEntity
/*     */   extends PathfinderMob
/*     */   implements RangedAttackMob
/*     */ {
/*     */   public MilitaryEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  62 */     this((EntityType<MilitaryEntity>)LatexModEntities.MILITARY.get(), world);
/*     */   }
/*     */   
/*     */   public MilitaryEntity(EntityType<MilitaryEntity> type, Level world) {
/*  66 */     super(type, world);
/*  67 */     this.f_21364_ = 0;
/*  68 */     m_21557_(false);
/*  69 */     m_21530_();
/*  70 */     m_8061_(EquipmentSlot.MAINHAND, new ItemStack((ItemLike)LatexModItems.M_4_ASSAULT_RIFLE.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  75 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  80 */     super.m_8099_();
/*  81 */     this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal(this, 1.0D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  84 */             return 4.0D + (entity.m_20205_() * entity.m_20205_());
/*     */           }
/*     */         });
/*  87 */     this.f_21346_.m_25352_(2, (Goal)new NearestAttackableTargetGoal((Mob)this, DROPPODEntity.class, true, false));
/*  88 */     this.f_21346_.m_25352_(1, (Goal)new NearestAttackableTargetGoal((Mob)this, PathfinderMob.class, 10, true, false, TargetCheck.IS_EVIL));
/*  89 */     this.f_21346_.m_25352_(2, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, 10, true, false, TargetCheck.IS_LATEX));
/*  90 */     this.f_21346_.m_25352_(5, (Goal)new NearestAttackableTargetGoal((Mob)this, EvilMilitaryEntity.class, true, false));
/*  91 */     this.f_21346_.m_25352_(6, (Goal)new NearestAttackableTargetGoal((Mob)this, EvilSniperEntity.class, true, false));
/*  92 */     this.f_21346_.m_25352_(7, (Goal)new NearestAttackableTargetGoal((Mob)this, PrisionermilitiaEntity.class, true, false));
/*  93 */     this.f_21346_.m_25352_(8, (Goal)new NearestAttackableTargetGoal((Mob)this, PrisionerMilitiaMeleeEntity.class, true, false));
/*  94 */     this.f_21346_.m_25352_(9, (Goal)new NearestAttackableTargetGoal((Mob)this, SlimelingEntity.class, true, false));
/*  95 */     this.f_21346_.m_25352_(10, (Goal)new NearestAttackableTargetGoal((Mob)this, Illusioner.class, true, false));
/*  96 */     this.f_21346_.m_25352_(11, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/*  97 */     this.f_21346_.m_25352_(12, (Goal)new NearestAttackableTargetGoal((Mob)this, Ravager.class, true, false));
/*  98 */     this.f_21346_.m_25352_(13, (Goal)new NearestAttackableTargetGoal((Mob)this, SpellcasterIllager.class, true, false));
/*  99 */     this.f_21346_.m_25352_(14, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/* 100 */     this.f_21346_.m_25352_(15, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/* 101 */     this.f_21346_.m_25352_(16, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/* 102 */     this.f_21346_.m_25352_(17, (Goal)new NearestAttackableTargetGoal((Mob)this, Monster.class, true, false));
/* 103 */     this.f_21345_.m_25352_(18, (Goal)new OpenDoorGoal((Mob)this, true));
/* 104 */     this.f_21345_.m_25352_(19, (Goal)new TemptGoal(this, 1.0D, Ingredient.m_43929_(new ItemLike[] { (ItemLike)LatexModItems.TABLET.get() }, ), false));
/* 105 */     this.f_21345_.m_25352_(20, (Goal)new FollowMobGoal((Mob)this, 0.800000011920929D, 12.0F, 6.0F));
/* 106 */     this.f_21345_.m_25352_(21, (Goal)new RandomStrollGoal(this, 0.6D));
/* 107 */     this.f_21345_.m_25352_(22, (Goal)new LookAtPlayerGoal((Mob)this, LivingEntity.class, 6.0F));
/* 108 */     this.f_21345_.m_25352_(23, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 6.0F));
/* 109 */     this.f_21345_.m_25352_(24, (Goal)new OpenDoorGoal((Mob)this, false));
/* 110 */     this.f_21346_.m_25352_(25, (Goal)(new HurtByTargetGoal(this, new Class[0])).m_26044_(new Class[0]));
/* 111 */     this.f_21345_.m_25352_(26, (Goal)new RandomLookAroundGoal((Mob)this));
/* 112 */     this.f_21345_.m_25352_(27, (Goal)new FloatGoal((Mob)this));
/* 113 */     this.f_21345_.m_25352_(1, (Goal)new RangedAttackGoal(this, 1.25D, 20, 10.0F)
/*     */         {
/*     */           public boolean m_8045_() {
/* 116 */             return m_8036_();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/* 123 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/* 128 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 133 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 138 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/* 143 */     if (source.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 144 */       return false; 
/* 145 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 151 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 152 */     MilitaryOnInitialEntitySpawnProcedure.execute((Entity)this);
/* 153 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6504_(LivingEntity target, float flval) {
/* 158 */     M4AssaultRifleEntity.shoot((LivingEntity)this, target);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 165 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 166 */     builder = builder.m_22268_(Attributes.f_22279_, 0.25D);
/* 167 */     builder = builder.m_22268_(Attributes.f_22276_, 20.0D);
/* 168 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 169 */     builder = builder.m_22268_(Attributes.f_22281_, 3.0D);
/* 170 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 171 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\MilitaryEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */