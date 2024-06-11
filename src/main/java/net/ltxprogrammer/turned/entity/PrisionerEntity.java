/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.init.LatexModItems;
/*     */ import net.ltxprogrammer.turned.procedures.TargethasabatonProcedure;
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
/*     */ import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
/*     */ import net.minecraft.world.entity.ai.goal.FloatGoal;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.MoveBackToVillageGoal;
/*     */ import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.TemptGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.crafting.Ingredient;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class PrisionerEntity
/*     */   extends PathfinderMob {
/*     */   public PrisionerEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  44 */     this((EntityType<PrisionerEntity>)LatexModEntities.PRISIONER.get(), world);
/*     */   }
/*     */   
/*     */   public PrisionerEntity(EntityType<PrisionerEntity> type, Level world) {
/*  48 */     super(type, world);
/*  49 */     this.f_21364_ = 0;
/*  50 */     m_21557_(false);
/*  51 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  56 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  61 */     super.m_8099_();
/*  62 */     this.f_21346_.m_25352_(1, (Goal)new HurtByTargetGoal(this, new Class[0])
/*     */         {
/*     */           public boolean m_8036_() {
/*  65 */             double x = PrisionerEntity.this.m_20185_();
/*  66 */             double y = PrisionerEntity.this.m_20186_();
/*  67 */             double z = PrisionerEntity.this.m_20189_();
/*  68 */             PrisionerEntity prisionerEntity = PrisionerEntity.this;
/*  69 */             Level world = PrisionerEntity.this.f_19853_;
/*  70 */             return (super.m_8036_() && TargethasabatonProcedure.execute((Entity)prisionerEntity));
/*     */           }
/*     */         });
/*  73 */     this.f_21345_.m_25352_(2, (Goal)new MeleeAttackGoal(this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  76 */             return 4.0D + (entity.m_20205_() * entity.m_20205_());
/*     */           }
/*     */         });
/*  79 */     this.f_21346_.m_25352_(3, (Goal)new NearestAttackableTargetGoal((Mob)this, Monster.class, true, true));
/*  80 */     this.f_21345_.m_25352_(4, (Goal)new OpenDoorGoal((Mob)this, true));
/*  81 */     this.f_21345_.m_25352_(5, (Goal)new MoveBackToVillageGoal(this, 0.6D, false));
/*  82 */     this.f_21345_.m_25352_(6, (Goal)new AvoidEntityGoal(this, Monster.class, 7.0F, 1.5D, 0.8D));
/*  83 */     this.f_21345_.m_25352_(7, (Goal)new TemptGoal(this, 0.8D, Ingredient.m_43929_(new ItemLike[] { (ItemLike)LatexModItems.BATON.get() }, ), false));
/*  84 */     this.f_21345_.m_25352_(8, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 5.0F));
/*  85 */     this.f_21345_.m_25352_(9, (Goal)new LookAtPlayerGoal((Mob)this, MilitaryEntity.class, 6.0F));
/*  86 */     this.f_21345_.m_25352_(10, (Goal)new LookAtPlayerGoal((Mob)this, MilitaryRiotEntity.class, 6.0F));
/*  87 */     this.f_21345_.m_25352_(11, (Goal)new LookAtPlayerGoal((Mob)this, ScientistEntity.class, 6.0F));
/*  88 */     this.f_21345_.m_25352_(12, (Goal)new LookAtPlayerGoal((Mob)this, EvilScientistEntity.class, 6.0F));
/*  89 */     this.f_21345_.m_25352_(13, (Goal)new LookAtPlayerGoal((Mob)this, EvilMilitaryEntity.class, 6.0F));
/*  90 */     this.f_21345_.m_25352_(14, (Goal)new LookAtPlayerGoal((Mob)this, LivingEntity.class, 4.0F));
/*  91 */     this.f_21345_.m_25352_(15, (Goal)new RandomStrollGoal(this, 0.6D));
/*  92 */     this.f_21345_.m_25352_(16, (Goal)new OpenDoorGoal((Mob)this, false));
/*  93 */     this.f_21345_.m_25352_(17, (Goal)new RandomLookAroundGoal((Mob)this));
/*  94 */     this.f_21345_.m_25352_(18, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  99 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/* 104 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/* 109 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.ambient")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 114 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 119 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.vindicator.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 126 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 127 */     builder = builder.m_22268_(Attributes.f_22279_, 0.25D);
/* 128 */     builder = builder.m_22268_(Attributes.f_22276_, 20.0D);
/* 129 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 130 */     builder = builder.m_22268_(Attributes.f_22281_, 1.0D);
/* 131 */     builder = builder.m_22268_(Attributes.f_22277_, 12.0D);
/* 132 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\PrisionerEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */