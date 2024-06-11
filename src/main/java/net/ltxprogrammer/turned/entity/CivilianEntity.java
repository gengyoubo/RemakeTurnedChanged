/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
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
/*     */ public class CivilianEntity extends PathfinderMob {
/*     */   public CivilianEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  37 */     this((EntityType<CivilianEntity>)LatexModEntities.CIVILIAN.get(), world);
/*     */   }
/*     */   
/*     */   public CivilianEntity(EntityType<CivilianEntity> type, Level world) {
/*  41 */     super(type, world);
/*  42 */     this.f_21364_ = 0;
/*  43 */     m_21557_(false);
/*  44 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  49 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  54 */     super.m_8099_();
/*  55 */     this.f_21346_.m_25352_(1, (Goal)(new HurtByTargetGoal(this, new Class[0])).m_26044_(new Class[0]));
/*  56 */     this.f_21345_.m_25352_(2, (Goal)new PanicGoal(this, 1.2D));
/*  57 */     this.f_21346_.m_25352_(3, (Goal)new NearestAttackableTargetGoal((Mob)this, Monster.class, true, false));
/*  58 */     this.f_21345_.m_25352_(4, (Goal)new OpenDoorGoal((Mob)this, true));
/*  59 */     this.f_21345_.m_25352_(5, (Goal)new AvoidEntityGoal(this, Monster.class, 9.0F, 1.2D, 0.8D));
/*  60 */     this.f_21345_.m_25352_(6, (Goal)new AvoidEntityGoal(this, EvilMilitaryEntity.class, 8.0F, 1.2D, 0.8D));
/*  61 */     this.f_21345_.m_25352_(7, (Goal)new AvoidEntityGoal(this, EvilSniperEntity.class, 8.0F, 1.2D, 0.8D));
/*  62 */     this.f_21345_.m_25352_(8, (Goal)new AvoidEntityGoal(this, SlimelingEntity.class, 9.0F, 1.2D, 0.8D));
/*  63 */     this.f_21345_.m_25352_(9, (Goal)new MoveBackToVillageGoal(this, 0.6D, false));
/*  64 */     this.f_21345_.m_25352_(10, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 6.0F));
/*  65 */     this.f_21345_.m_25352_(11, (Goal)new LookAtPlayerGoal((Mob)this, MilitaryEntity.class, 6.0F));
/*  66 */     this.f_21345_.m_25352_(12, (Goal)new LookAtPlayerGoal((Mob)this, ScientistEntity.class, 6.0F));
/*  67 */     this.f_21345_.m_25352_(13, (Goal)new LookAtPlayerGoal((Mob)this, EvilScientistEntity.class, 6.0F));
/*  68 */     this.f_21345_.m_25352_(14, (Goal)new RandomStrollGoal(this, 0.6D));
/*  69 */     this.f_21345_.m_25352_(15, (Goal)new OpenDoorGoal((Mob)this, false));
/*  70 */     this.f_21345_.m_25352_(16, (Goal)new RandomLookAroundGoal((Mob)this));
/*  71 */     this.f_21345_.m_25352_(17, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  76 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/*  81 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/*  86 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/*  91 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/*  96 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 103 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 104 */     builder = builder.m_22268_(Attributes.f_22279_, 0.25D);
/* 105 */     builder = builder.m_22268_(Attributes.f_22276_, 20.0D);
/* 106 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 107 */     builder = builder.m_22268_(Attributes.f_22281_, 1.0D);
/* 108 */     builder = builder.m_22268_(Attributes.f_22277_, 12.0D);
/* 109 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\CivilianEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */