/*     */ package net.ltxprogrammer.turned.entity;
/*     */ import javax.annotation.Nullable;
/*     */ import net.ltxprogrammer.changed.init.ChangedItems;
/*     */ import net.ltxprogrammer.turned.entity.ai.TargetCheck;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.procedures.NightstalkertestPlayerCollidesWithThisEntityProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.NoiseStalkerDetectGameruleProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.NoiseStalkerOnInitialEntitySpawnProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.NoiseStalkerThisEntityKillsAnotherOneProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.Difficulty;
/*     */ import net.minecraft.world.DifficultyInstance;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.SpawnGroupData;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.goal.BreakDoorGoal;
/*     */ import net.minecraft.world.entity.ai.goal.FloatGoal;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RemoveBlockGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.animal.IronGolem;
/*     */ import net.minecraft.world.entity.monster.Evoker;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.monster.Pillager;
/*     */ import net.minecraft.world.entity.monster.Witch;
/*     */ import net.minecraft.world.entity.monster.Zoglin;
/*     */ import net.minecraft.world.entity.monster.Zombie;
/*     */ import net.minecraft.world.entity.monster.ZombieVillager;
/*     */ import net.minecraft.world.entity.monster.ZombifiedPiglin;
/*     */ import net.minecraft.world.entity.monster.piglin.Piglin;
/*     */ import net.minecraft.world.entity.monster.piglin.PiglinBrute;
/*     */ import net.minecraft.world.entity.npc.Villager;
/*     */ import net.minecraft.world.entity.npc.WanderingTrader;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class NoiseStalkerEntity extends Monster {
/*     */   public NoiseStalkerEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  63 */     this((EntityType<NoiseStalkerEntity>)LatexModEntities.NOISE_STALKER.get(), world);
/*     */   }
/*     */   
/*     */   public NoiseStalkerEntity(EntityType<NoiseStalkerEntity> type, Level world) {
/*  67 */     super(type, world);
/*  68 */     this.f_21364_ = 10;
/*  69 */     m_21557_(false);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  74 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  79 */     super.m_8099_();
/*  80 */     this.f_21345_.m_25352_(1, (Goal)new BreakDoorGoal((Mob)this, e -> true));
/*  81 */     this.f_21345_.m_25352_(2, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, true)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  84 */             return 4.0D + (entity.m_20205_() * entity.m_20205_());
/*     */           }
/*     */         });
/*  87 */     this.f_21346_.m_25352_(3, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).m_26044_(new Class[0]));
/*  88 */     this.f_21346_.m_25352_(4, (Goal)new NearestAttackableTargetGoal((Mob)this, PathfinderMob.class, 10, false, true, TargetCheck.IS_SLIMELING));
/*  89 */     this.f_21346_.m_25352_(5, (Goal)new NearestAttackableTargetGoal((Mob)this, MilitaryEntity.class, false, true));
/*  90 */     this.f_21346_.m_25352_(6, (Goal)new NearestAttackableTargetGoal((Mob)this, ScientistEntity.class, false, true));
/*  91 */     this.f_21346_.m_25352_(7, (Goal)new NearestAttackableTargetGoal((Mob)this, MilitaryflameunitEntity.class, false, true));
/*  92 */     this.f_21346_.m_25352_(8, (Goal)new NearestAttackableTargetGoal((Mob)this, EvilScientistEntity.class, false, true));
/*  93 */     this.f_21346_.m_25352_(9, (Goal)new NearestAttackableTargetGoal((Mob)this, EvilSniperEntity.class, false, true));
/*  94 */     this.f_21346_.m_25352_(10, (Goal)new NearestAttackableTargetGoal((Mob)this, EvilMilitaryEntity.class, false, true));
/*  95 */     this.f_21346_.m_25352_(11, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, false, true));
/*  96 */     this.f_21346_.m_25352_(12, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, false, true));
/*  97 */     this.f_21346_.m_25352_(13, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, false, true));
/*  98 */     this.f_21346_.m_25352_(14, (Goal)new NearestAttackableTargetGoal((Mob)this, IronGolem.class, false, true));
/*  99 */     this.f_21346_.m_25352_(15, (Goal)new NearestAttackableTargetGoal((Mob)this, Witch.class, false, true));
/* 100 */     this.f_21346_.m_25352_(16, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, false, true));
/* 101 */     this.f_21346_.m_25352_(17, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, false, true));
/* 102 */     this.f_21346_.m_25352_(18, (Goal)new NearestAttackableTargetGoal((Mob)this, Evoker.class, false, true));
/* 103 */     this.f_21346_.m_25352_(19, (Goal)new NearestAttackableTargetGoal((Mob)this, Zombie.class, false, true));
/* 104 */     this.f_21346_.m_25352_(20, (Goal)new NearestAttackableTargetGoal((Mob)this, ZombieVillager.class, false, true));
/* 105 */     this.f_21346_.m_25352_(21, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, false, true));
/* 106 */     this.f_21346_.m_25352_(22, (Goal)new NearestAttackableTargetGoal((Mob)this, ZombifiedPiglin.class, false, true));
/* 107 */     this.f_21346_.m_25352_(23, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, false, true));
/* 108 */     this.f_21346_.m_25352_(24, (Goal)new NearestAttackableTargetGoal((Mob)this, Zoglin.class, false, true));
/* 109 */     this.f_21345_.m_25352_(25, (Goal)new RemoveBlockGoal(Blocks.f_50470_, (PathfinderMob)this, 1.0D, 3)
/*     */         {
/*     */           public boolean m_8036_() {
/* 112 */             double x = NoiseStalkerEntity.this.m_20185_();
/* 113 */             double y = NoiseStalkerEntity.this.m_20186_();
/* 114 */             double z = NoiseStalkerEntity.this.m_20189_();
/* 115 */             NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
/* 116 */             Level world = NoiseStalkerEntity.this.f_19853_;
/* 117 */             return (super.m_8036_() && NoiseStalkerDetectGameruleProcedure.execute((LevelAccessor)world));
/*     */           }
/*     */         });
/* 120 */     this.f_21345_.m_25352_(26, (Goal)new RemoveBlockGoal(Blocks.f_50471_, (PathfinderMob)this, 1.0D, 3)
/*     */         {
/*     */           public boolean m_8036_() {
/* 123 */             double x = NoiseStalkerEntity.this.m_20185_();
/* 124 */             double y = NoiseStalkerEntity.this.m_20186_();
/* 125 */             double z = NoiseStalkerEntity.this.m_20189_();
/* 126 */             NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
/* 127 */             Level world = NoiseStalkerEntity.this.f_19853_;
/* 128 */             return (super.m_8036_() && NoiseStalkerDetectGameruleProcedure.execute((LevelAccessor)world));
/*     */           }
/*     */         });
/* 131 */     this.f_21345_.m_25352_(27, (Goal)new RemoveBlockGoal(Blocks.f_50473_, (PathfinderMob)this, 1.0D, 3)
/*     */         {
/*     */           public boolean m_8036_() {
/* 134 */             double x = NoiseStalkerEntity.this.m_20185_();
/* 135 */             double y = NoiseStalkerEntity.this.m_20186_();
/* 136 */             double z = NoiseStalkerEntity.this.m_20189_();
/* 137 */             NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
/* 138 */             Level world = NoiseStalkerEntity.this.f_19853_;
/* 139 */             return (super.m_8036_() && NoiseStalkerDetectGameruleProcedure.execute((LevelAccessor)world));
/*     */           }
/*     */         });
/* 142 */     this.f_21345_.m_25352_(28, (Goal)new RemoveBlockGoal(Blocks.f_50485_, (PathfinderMob)this, 1.0D, 3)
/*     */         {
/*     */           public boolean m_8036_() {
/* 145 */             double x = NoiseStalkerEntity.this.m_20185_();
/* 146 */             double y = NoiseStalkerEntity.this.m_20186_();
/* 147 */             double z = NoiseStalkerEntity.this.m_20189_();
/* 148 */             NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
/* 149 */             Level world = NoiseStalkerEntity.this.f_19853_;
/* 150 */             return (super.m_8036_() && NoiseStalkerDetectGameruleProcedure.execute((LevelAccessor)world));
/*     */           }
/*     */         });
/* 153 */     this.f_21345_.m_25352_(29, (Goal)new RemoveBlockGoal(Blocks.f_50484_, (PathfinderMob)this, 1.0D, 3)
/*     */         {
/*     */           public boolean m_8036_() {
/* 156 */             double x = NoiseStalkerEntity.this.m_20185_();
/* 157 */             double y = NoiseStalkerEntity.this.m_20186_();
/* 158 */             double z = NoiseStalkerEntity.this.m_20189_();
/* 159 */             NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
/* 160 */             Level world = NoiseStalkerEntity.this.f_19853_;
/* 161 */             return (super.m_8036_() && NoiseStalkerDetectGameruleProcedure.execute((LevelAccessor)world));
/*     */           }
/*     */         });
/* 164 */     this.f_21345_.m_25352_(30, (Goal)new RemoveBlockGoal(Blocks.f_50154_, (PathfinderMob)this, 1.0D, 3)
/*     */         {
/*     */           public boolean m_8036_() {
/* 167 */             double x = NoiseStalkerEntity.this.m_20185_();
/* 168 */             double y = NoiseStalkerEntity.this.m_20186_();
/* 169 */             double z = NoiseStalkerEntity.this.m_20189_();
/* 170 */             NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
/* 171 */             Level world = NoiseStalkerEntity.this.f_19853_;
/* 172 */             return (super.m_8036_() && NoiseStalkerDetectGameruleProcedure.execute((LevelAccessor)world));
/*     */           }
/*     */         });
/* 175 */     this.f_21345_.m_25352_(31, (Goal)new RemoveBlockGoal(Blocks.f_50486_, (PathfinderMob)this, 1.0D, 3)
/*     */         {
/*     */           public boolean m_8036_() {
/* 178 */             double x = NoiseStalkerEntity.this.m_20185_();
/* 179 */             double y = NoiseStalkerEntity.this.m_20186_();
/* 180 */             double z = NoiseStalkerEntity.this.m_20189_();
/* 181 */             NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
/* 182 */             Level world = NoiseStalkerEntity.this.f_19853_;
/* 183 */             return (super.m_8036_() && NoiseStalkerDetectGameruleProcedure.execute((LevelAccessor)world));
/*     */           }
/*     */         });
/* 186 */     this.f_21345_.m_25352_(32, (Goal)new RemoveBlockGoal(Blocks.f_50487_, (PathfinderMob)this, 1.0D, 3)
/*     */         {
/*     */           public boolean m_8036_() {
/* 189 */             double x = NoiseStalkerEntity.this.m_20185_();
/* 190 */             double y = NoiseStalkerEntity.this.m_20186_();
/* 191 */             double z = NoiseStalkerEntity.this.m_20189_();
/* 192 */             NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
/* 193 */             Level world = NoiseStalkerEntity.this.f_19853_;
/* 194 */             return (super.m_8036_() && NoiseStalkerDetectGameruleProcedure.execute((LevelAccessor)world));
/*     */           }
/*     */         });
/* 197 */     this.f_21345_.m_25352_(33, (Goal)new RemoveBlockGoal(Blocks.f_50488_, (PathfinderMob)this, 1.0D, 3)
/*     */         {
/*     */           public boolean m_8036_() {
/* 200 */             double x = NoiseStalkerEntity.this.m_20185_();
/* 201 */             double y = NoiseStalkerEntity.this.m_20186_();
/* 202 */             double z = NoiseStalkerEntity.this.m_20189_();
/* 203 */             NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
/* 204 */             Level world = NoiseStalkerEntity.this.f_19853_;
/* 205 */             return (super.m_8036_() && NoiseStalkerDetectGameruleProcedure.execute((LevelAccessor)world));
/*     */           }
/*     */         });
/* 208 */     this.f_21345_.m_25352_(34, (Goal)new RemoveBlockGoal(Blocks.f_50671_, (PathfinderMob)this, 1.0D, 3)
/*     */         {
/*     */           public boolean m_8036_() {
/* 211 */             double x = NoiseStalkerEntity.this.m_20185_();
/* 212 */             double y = NoiseStalkerEntity.this.m_20186_();
/* 213 */             double z = NoiseStalkerEntity.this.m_20189_();
/* 214 */             NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
/* 215 */             Level world = NoiseStalkerEntity.this.f_19853_;
/* 216 */             return (super.m_8036_() && NoiseStalkerDetectGameruleProcedure.execute((LevelAccessor)world));
/*     */           }
/*     */         });
/* 219 */     this.f_21345_.m_25352_(35, (Goal)new RemoveBlockGoal(Blocks.f_50672_, (PathfinderMob)this, 1.0D, 3)
/*     */         {
/*     */           public boolean m_8036_() {
/* 222 */             double x = NoiseStalkerEntity.this.m_20185_();
/* 223 */             double y = NoiseStalkerEntity.this.m_20186_();
/* 224 */             double z = NoiseStalkerEntity.this.m_20189_();
/* 225 */             NoiseStalkerEntity noiseStalkerEntity = NoiseStalkerEntity.this;
/* 226 */             Level world = NoiseStalkerEntity.this.f_19853_;
/* 227 */             return (super.m_8036_() && NoiseStalkerDetectGameruleProcedure.execute((LevelAccessor)world));
/*     */           }
/*     */         });
/* 230 */     this.f_21345_.m_25352_(36, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.8D));
/* 231 */     this.f_21345_.m_25352_(37, (Goal)new RandomLookAroundGoal((Mob)this));
/* 232 */     this.f_21345_.m_25352_(38, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/* 237 */     return MobType.f_21642_;
/*     */   }
/*     */   
/*     */   protected void m_7472_(DamageSource source, int looting, boolean recentlyHitIn) {
/* 241 */     super.m_7472_(source, looting, recentlyHitIn);
/* 242 */     m_19983_(new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7515_() {
/* 247 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ravager.ambient"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/* 252 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 257 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ravager.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 262 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/* 267 */     if (source == DamageSource.f_19315_)
/* 268 */       return false; 
/* 269 */     if (source == DamageSource.f_19314_)
/* 270 */       return false; 
/* 271 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 277 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 278 */     NoiseStalkerOnInitialEntitySpawnProcedure.execute((Entity)this);
/* 279 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_5993_(Entity entity, int score, DamageSource damageSource) {
/* 284 */     super.m_5993_(entity, score, damageSource);
/* 285 */     NoiseStalkerThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), entity, (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6123_(Player sourceentity) {
/* 290 */     super.m_6123_(sourceentity);
/* 291 */     NightstalkertestPlayerCollidesWithThisEntityProcedure.execute((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 298 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 299 */     builder = builder.m_22268_(Attributes.f_22279_, 0.28D);
/* 300 */     builder = builder.m_22268_(Attributes.f_22276_, 48.0D);
/* 301 */     builder = builder.m_22268_(Attributes.f_22284_, 4.0D);
/* 302 */     builder = builder.m_22268_(Attributes.f_22281_, 6.0D);
/* 303 */     builder = builder.m_22268_(Attributes.f_22277_, 24.0D);
/* 304 */     builder = builder.m_22268_(Attributes.f_22278_, 0.5D);
/* 305 */     builder = builder.m_22268_(Attributes.f_22282_, 0.2D);
/* 306 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\NoiseStalkerEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */