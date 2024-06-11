/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import java.util.EnumSet;
/*     */ import java.util.Random;
/*     */ import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
/*     */ import net.ltxprogrammer.changed.init.ChangedItems;
/*     */ import net.ltxprogrammer.changed.init.ChangedParticles;
/*     */ import net.ltxprogrammer.turned.entity.ai.TargetCheck;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.procedures.DarkLatexQueenBeeEntityDiesProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.DarkLatexQueenBeeEntityIsHurtProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.DarkLatexQueenBeePlayerCollidesWithThisEntityProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.DarkLatexQueenBeeThisEntityKillsAnotherOneProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerBossEvent;
/*     */ import net.minecraft.server.level.ServerPlayer;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.BossEvent;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.control.FlyingMoveControl;
/*     */ import net.minecraft.world.entity.ai.control.MoveControl;
/*     */ import net.minecraft.world.entity.ai.goal.FloatGoal;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.ai.navigation.FlyingPathNavigation;
/*     */ import net.minecraft.world.entity.ai.navigation.PathNavigation;
/*     */ import net.minecraft.world.entity.animal.IronGolem;
/*     */ import net.minecraft.world.entity.monster.CaveSpider;
/*     */ import net.minecraft.world.entity.monster.Evoker;
/*     */ import net.minecraft.world.entity.monster.Pillager;
/*     */ import net.minecraft.world.entity.monster.Spider;
/*     */ import net.minecraft.world.entity.monster.Vindicator;
/*     */ import net.minecraft.world.entity.monster.Witch;
/*     */ import net.minecraft.world.entity.monster.Zombie;
/*     */ import net.minecraft.world.entity.monster.ZombieVillager;
/*     */ import net.minecraft.world.entity.monster.piglin.Piglin;
/*     */ import net.minecraft.world.entity.monster.piglin.PiglinBrute;
/*     */ import net.minecraft.world.entity.npc.Villager;
/*     */ import net.minecraft.world.entity.npc.WanderingTrader;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class DarkLatexQueenBeeEntity
/*     */   extends AbstractDarkLatexEntity {
/*  67 */   private final ServerBossEvent bossInfo = new ServerBossEvent(m_5446_(), BossEvent.BossBarColor.YELLOW, BossEvent.BossBarOverlay.PROGRESS);
/*     */ 
/*     */   
/*     */   public DarkLatexQueenBeeEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  71 */     this((EntityType<DarkLatexQueenBeeEntity>)LatexModEntities.DARK_LATEX_QUEEN_BEE.get(), world);
/*     */   }
/*     */   
/*     */   public DarkLatexQueenBeeEntity(EntityType<DarkLatexQueenBeeEntity> type, Level world) {
/*  75 */     super(type, world);
/*  76 */     this.f_21364_ = 15;
/*  77 */     m_21557_(false);
/*  78 */     m_21530_();
/*  79 */     this.f_21342_ = (MoveControl)new FlyingMoveControl((Mob)this, 10, true);
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  84 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected PathNavigation m_6037_(Level world) {
/*  89 */     return (PathNavigation)new FlyingPathNavigation((Mob)this, world);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  94 */     super.m_8099_();
/*  95 */     this.f_21345_.m_25352_(1, new Goal()
/*     */         {
/*     */ 
/*     */           
/*     */           public boolean m_8036_()
/*     */           {
/* 101 */             return (DarkLatexQueenBeeEntity.this.m_5448_() != null && !DarkLatexQueenBeeEntity.this.m_21566_().m_24995_());
/*     */           }
/*     */ 
/*     */           
/*     */           public boolean m_8045_() {
/* 106 */             return (DarkLatexQueenBeeEntity.this.m_21566_().m_24995_() && DarkLatexQueenBeeEntity.this.m_5448_() != null && DarkLatexQueenBeeEntity.this
/* 107 */               .m_5448_().m_6084_());
/*     */           }
/*     */ 
/*     */           
/*     */           public void m_8056_() {
/* 112 */             LivingEntity livingentity = DarkLatexQueenBeeEntity.this.m_5448_();
/* 113 */             Vec3 vec3d = livingentity.m_20299_(1.0F);
/* 114 */             DarkLatexQueenBeeEntity.this.f_21342_.m_6849_(vec3d.f_82479_, vec3d.f_82480_, vec3d.f_82481_, 1.5D);
/*     */           }
/*     */ 
/*     */           
/*     */           public void m_8037_() {
/* 119 */             LivingEntity livingentity = DarkLatexQueenBeeEntity.this.m_5448_();
/* 120 */             if (DarkLatexQueenBeeEntity.this.m_142469_().m_82381_(livingentity.m_142469_())) {
/* 121 */               DarkLatexQueenBeeEntity.this.m_7327_((Entity)livingentity);
/*     */             } else {
/* 123 */               double d0 = DarkLatexQueenBeeEntity.this.m_20280_((Entity)livingentity);
/* 124 */               if (d0 < 12.0D) {
/* 125 */                 Vec3 vec3d = livingentity.m_20299_(1.0F);
/* 126 */                 DarkLatexQueenBeeEntity.this.f_21342_.m_6849_(vec3d.f_82479_, vec3d.f_82480_, vec3d.f_82481_, 1.5D);
/*     */               } 
/*     */             } 
/*     */           }
/*     */         });
/* 131 */     this.f_21346_.m_25352_(2, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).m_26044_(new Class[0]));
/* 132 */     this.f_21345_.m_25352_(3, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.1D, true)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/* 135 */             return 4.0D + (entity.m_20205_() * entity.m_20205_());
/*     */           }
/*     */         });
/* 138 */     this.f_21346_.m_25352_(4, (Goal)new NearestAttackableTargetGoal((Mob)this, DarkLatexSpiderQueenEntity.class, true, false));
/* 139 */     this.f_21346_.m_25352_(5, (Goal)new NearestAttackableTargetGoal((Mob)this, DarkLatexSpiderEntity.class, true, false));
/* 140 */     this.f_21346_.m_25352_(6, (Goal)new NearestAttackableTargetGoal((Mob)this, CaveSpider.class, true, false));
/* 141 */     this.f_21346_.m_25352_(7, (Goal)new NearestAttackableTargetGoal((Mob)this, Spider.class, true, false));
/* 142 */     this.f_21346_.m_25352_(8, (Goal)new NearestAttackableTargetGoal((Mob)this, DarkLatexQueenBeeEntity.class, true, false));
/* 143 */     this.f_21346_.m_25352_(9, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, 10, false, true, TargetCheck.IS_SLIMELING));
/* 144 */     this.f_21346_.m_25352_(10, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, 10, true, false, TargetCheck.IS_GOOD));
/* 145 */     this.f_21346_.m_25352_(11, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, 10, true, false, TargetCheck.IS_EVIL));
/* 146 */     this.f_21346_.m_25352_(12, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false));
/* 147 */     this.f_21346_.m_25352_(13, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, true, false));
/* 148 */     this.f_21346_.m_25352_(14, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, true, false));
/* 149 */     this.f_21346_.m_25352_(15, (Goal)new NearestAttackableTargetGoal((Mob)this, IronGolem.class, true, false));
/* 150 */     this.f_21346_.m_25352_(16, (Goal)new NearestAttackableTargetGoal((Mob)this, Witch.class, true, false));
/* 151 */     this.f_21346_.m_25352_(17, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/* 152 */     this.f_21346_.m_25352_(18, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/* 153 */     this.f_21346_.m_25352_(19, (Goal)new NearestAttackableTargetGoal((Mob)this, Evoker.class, true, false));
/* 154 */     this.f_21346_.m_25352_(20, (Goal)new NearestAttackableTargetGoal((Mob)this, Zombie.class, true, false));
/* 155 */     this.f_21346_.m_25352_(21, (Goal)new NearestAttackableTargetGoal((Mob)this, ZombieVillager.class, true, false));
/* 156 */     this.f_21346_.m_25352_(22, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/* 157 */     this.f_21346_.m_25352_(23, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/* 158 */     this.f_21345_.m_25352_(24, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.2D, 20)
/*     */         {
/*     */           protected Vec3 m_7037_() {
/* 161 */             Random random = DarkLatexQueenBeeEntity.this.m_21187_();
/* 162 */             double dir_x = DarkLatexQueenBeeEntity.this.m_20185_() + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 163 */             double dir_y = DarkLatexQueenBeeEntity.this.m_20186_() + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 164 */             double dir_z = DarkLatexQueenBeeEntity.this.m_20189_() + ((random.nextFloat() * 2.0F - 1.0F) * 16.0F);
/* 165 */             return new Vec3(dir_x, dir_y, dir_z);
/*     */           }
/*     */         });
/* 168 */     this.f_21345_.m_25352_(25, (Goal)new RandomLookAroundGoal((Mob)this));
/* 169 */     this.f_21345_.m_25352_(26, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/* 174 */     return MobType.f_21642_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/* 179 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public double m_6048_() {
/* 184 */     return super.m_6048_() + 0.2D;
/*     */   }
/*     */   
/*     */   protected void m_7472_(DamageSource source, int looting, boolean recentlyHitIn) {
/* 188 */     super.m_7472_(source, looting, recentlyHitIn);
/* 189 */     m_19983_(new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7515_() {
/* 194 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.bee.loop"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/* 199 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 204 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 209 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.wither.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_142535_(float l, float d, DamageSource source) {
/* 214 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/* 219 */     DarkLatexQueenBeeEntityIsHurtProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/* 220 */     if (source.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 221 */       return false; 
/* 222 */     if (source == DamageSource.f_19315_)
/* 223 */       return false; 
/* 224 */     if (source == DamageSource.f_19314_)
/* 225 */       return false; 
/* 226 */     if (source == DamageSource.f_19306_)
/* 227 */       return false; 
/* 228 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6667_(DamageSource source) {
/* 233 */     super.m_6667_(source);
/* 234 */     DarkLatexQueenBeeEntityDiesProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_());
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_5993_(Entity entity, int score, DamageSource damageSource) {
/* 239 */     super.m_5993_(entity, score, damageSource);
/* 240 */     DarkLatexQueenBeeThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), entity);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6123_(Player sourceentity) {
/* 245 */     super.m_6123_(sourceentity);
/* 246 */     DarkLatexQueenBeePlayerCollidesWithThisEntityProcedure.execute((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6072_() {
/* 251 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6457_(ServerPlayer player) {
/* 256 */     super.m_6457_(player);
/* 257 */     this.bossInfo.m_6543_(player);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6452_(ServerPlayer player) {
/* 262 */     super.m_6452_(player);
/* 263 */     this.bossInfo.m_6539_(player);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_8024_() {
/* 268 */     super.m_8024_();
/* 269 */     this.bossInfo.m_142711_(m_21223_() / m_21233_());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected void m_7840_(double y, boolean onGroundIn, BlockState state, BlockPos pos) {}
/*     */ 
/*     */   
/*     */   public void m_20242_(boolean ignored) {
/* 278 */     super.m_20242_(true);
/*     */   }
/*     */   
/*     */   public void m_8107_() {
/* 282 */     super.m_8107_();
/* 283 */     m_20242_(true);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 290 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 291 */     builder = builder.m_22268_(Attributes.f_22279_, 0.4D);
/* 292 */     builder = builder.m_22268_(Attributes.f_22276_, 80.0D);
/* 293 */     builder = builder.m_22268_(Attributes.f_22284_, 5.0D);
/* 294 */     builder = builder.m_22268_(Attributes.f_22281_, 7.0D);
/* 295 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 296 */     builder = builder.m_22268_(Attributes.f_22278_, 0.2D);
/* 297 */     builder = builder.m_22268_(Attributes.f_22282_, 0.1D);
/* 298 */     builder = builder.m_22268_(Attributes.f_22280_, 0.4D);
/* 299 */     return builder;
/*     */   }
/*     */ 
/*     */   
/*     */   public ChangedParticles.Color3 getDripColor() {
/* 304 */     return ChangedParticles.Color3.DARK;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\DarkLatexQueenBeeEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */