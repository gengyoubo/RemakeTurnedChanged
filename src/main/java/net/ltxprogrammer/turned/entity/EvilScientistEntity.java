/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.ltxprogrammer.turned.entity.ai.TargetCheck;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
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
/*     */ import net.minecraft.world.entity.ai.goal.MoveBackToVillageGoal;
/*     */ import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
/*     */ import net.minecraft.world.entity.ai.goal.PanicGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ 
/*     */ public class EvilScientistEntity
/*     */   extends PathfinderMob
/*     */ {
/*     */   public EvilScientistEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  47 */     this((EntityType<EvilScientistEntity>)LatexModEntities.EVIL_SCIENTIST.get(), world);
/*     */   }
/*     */   
/*     */   public EvilScientistEntity(EntityType<EvilScientistEntity> type, Level world) {
/*  51 */     super(type, world);
/*  52 */     this.f_21364_ = 0;
/*  53 */     m_21557_(false);
/*  54 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  59 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  64 */     super.m_8099_();
/*  65 */     this.f_21345_.m_25352_(1, (Goal)new AvoidEntityGoal(this, Monster.class, 6.0F, 1.2D, 0.9D));
/*  66 */     this.f_21345_.m_25352_(2, (Goal)new AvoidEntityGoal(this, PathfinderMob.class, 8.0F, 1.5D, 0.8D, TargetCheck.IS_GOOD));
/*  67 */     this.f_21345_.m_25352_(3, (Goal)new PanicGoal(this, 1.2D));
/*  68 */     this.f_21346_.m_25352_(4, (Goal)(new HurtByTargetGoal(this, new Class[0])).m_26044_(new Class[0]));
/*  69 */     this.f_21345_.m_25352_(5, (Goal)new MoveBackToVillageGoal(this, 0.6D, false));
/*  70 */     this.f_21345_.m_25352_(6, (Goal)new RandomStrollGoal(this, 1.0D));
/*  71 */     this.f_21345_.m_25352_(7, (Goal)new LookAtPlayerGoal((Mob)this, PathfinderMob.class, 6.0F));
/*  72 */     this.f_21345_.m_25352_(8, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 6.0F));
/*  73 */     this.f_21345_.m_25352_(9, (Goal)new OpenDoorGoal((Mob)this, true));
/*  74 */     this.f_21345_.m_25352_(10, (Goal)new OpenDoorGoal((Mob)this, false));
/*  75 */     this.f_21345_.m_25352_(11, (Goal)new RandomLookAroundGoal((Mob)this));
/*  76 */     this.f_21345_.m_25352_(12, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  81 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/*  86 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/*  91 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.ambient")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/*  96 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 101 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.death"));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 107 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 108 */     ScientistOnInitialEntitySpawnProcedure.execute((Entity)this);
/* 109 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 116 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 117 */     builder = builder.m_22268_(Attributes.f_22279_, 0.25D);
/* 118 */     builder = builder.m_22268_(Attributes.f_22276_, 20.0D);
/* 119 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 120 */     builder = builder.m_22268_(Attributes.f_22281_, 3.0D);
/* 121 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 122 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\EvilScientistEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */