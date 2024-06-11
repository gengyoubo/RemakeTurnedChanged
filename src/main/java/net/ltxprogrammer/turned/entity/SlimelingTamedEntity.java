/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.ltxprogrammer.changed.block.AbstractLatexBlock;
/*     */ import net.ltxprogrammer.changed.entity.LatexType;
/*     */ import net.ltxprogrammer.changed.init.ChangedBlocks;
/*     */ import net.ltxprogrammer.changed.init.ChangedItems;
/*     */ import net.ltxprogrammer.turned.entity.ai.RevertBlockStateGoal;
/*     */ import net.ltxprogrammer.turned.entity.ai.TargetCheck;
/*     */ import net.ltxprogrammer.turned.init.LatexModBlocks;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.init.LatexModItems;
/*     */ import net.ltxprogrammer.turned.procedures.CheckiftamedProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.SlimelingEntityDiesProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.SlimelingTamedOnInitialEntitySpawnProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.SlimelingTamedRightClickedOnEntityProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.SlimelingThisEntityKillsAnotherOneProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.DifficultyInstance;
/*     */ import net.minecraft.world.InteractionHand;
/*     */ import net.minecraft.world.InteractionResult;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.entity.AgeableMob;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.SpawnGroupData;
/*     */ import net.minecraft.world.entity.TamableAnimal;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.goal.FloatGoal;
/*     */ import net.minecraft.world.entity.ai.goal.FollowOwnerGoal;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RemoveBlockGoal;
/*     */ import net.minecraft.world.entity.ai.goal.TemptGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.OwnerHurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.OwnerHurtTargetGoal;
/*     */ import net.minecraft.world.entity.animal.Animal;
/*     */ import net.minecraft.world.entity.monster.Evoker;
/*     */ import net.minecraft.world.entity.monster.Illusioner;
/*     */ import net.minecraft.world.entity.monster.Pillager;
/*     */ import net.minecraft.world.entity.monster.Vindicator;
/*     */ import net.minecraft.world.entity.monster.piglin.Piglin;
/*     */ import net.minecraft.world.entity.monster.piglin.PiglinBrute;
/*     */ import net.minecraft.world.entity.npc.Villager;
/*     */ import net.minecraft.world.entity.npc.WanderingTrader;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.Item;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.item.crafting.Ingredient;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraft.world.level.block.state.properties.Property;
/*     */ import net.minecraftforge.common.DungeonHooks;
/*     */ import net.minecraftforge.event.ForgeEventFactory;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class SlimelingTamedEntity
/*     */   extends TamableAnimal {
/*     */   public SlimelingTamedEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  85 */     this((EntityType<SlimelingTamedEntity>)LatexModEntities.SLIMELING_TAMED.get(), world);
/*     */   }
/*     */   
/*     */   public SlimelingTamedEntity(EntityType<SlimelingTamedEntity> type, Level world) {
/*  89 */     super(type, world);
/*  90 */     this.f_21364_ = 4;
/*  91 */     m_21557_(false);
/*  92 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  97 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/* 102 */     super.m_8099_();
/* 103 */     this.f_21345_.m_25352_(1, (Goal)new FollowOwnerGoal(this, 0.9D, 12.0F, 2.0F, false));
/* 104 */     this.f_21346_.m_25352_(2, (Goal)new OwnerHurtTargetGoal(this));
/* 105 */     this.f_21345_.m_25352_(3, (Goal)new OwnerHurtByTargetGoal(this));
/* 106 */     this.f_21345_.m_25352_(4, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/* 109 */             return 4.0D + (entity.m_20205_() * entity.m_20205_());
/*     */           }
/*     */         });
/* 112 */     this.f_21346_.m_25352_(5, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, 10, false, false, TargetCheck.IS_LATEX));
/* 113 */     this.f_21346_.m_25352_(6, (Goal)new NearestAttackableTargetGoal((Mob)this, Mob.class, 10, true, false, TargetCheck.IS_EVIL));
/* 114 */     this.f_21346_.m_25352_(7, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false)
/*     */         {
/*     */           public boolean m_8036_() {
/* 117 */             double x = SlimelingTamedEntity.this.m_20185_();
/* 118 */             double y = SlimelingTamedEntity.this.m_20186_();
/* 119 */             double z = SlimelingTamedEntity.this.m_20189_();
/* 120 */             SlimelingTamedEntity slimelingTamedEntity = SlimelingTamedEntity.this;
/* 121 */             Level world = SlimelingTamedEntity.this.f_19853_;
/* 122 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)slimelingTamedEntity));
/*     */           }
/*     */         });
/* 125 */     this.f_21346_.m_25352_(8, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false)
/*     */         {
/*     */           public boolean m_8036_() {
/* 128 */             double x = SlimelingTamedEntity.this.m_20185_();
/* 129 */             double y = SlimelingTamedEntity.this.m_20186_();
/* 130 */             double z = SlimelingTamedEntity.this.m_20189_();
/* 131 */             SlimelingTamedEntity slimelingTamedEntity = SlimelingTamedEntity.this;
/* 132 */             Level world = SlimelingTamedEntity.this.f_19853_;
/* 133 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)slimelingTamedEntity));
/*     */           }
/*     */         });
/* 136 */     this.f_21346_.m_25352_(9, (Goal)new NearestAttackableTargetGoal((Mob)this, Illusioner.class, true, false)
/*     */         {
/*     */           public boolean m_8036_() {
/* 139 */             double x = SlimelingTamedEntity.this.m_20185_();
/* 140 */             double y = SlimelingTamedEntity.this.m_20186_();
/* 141 */             double z = SlimelingTamedEntity.this.m_20189_();
/* 142 */             SlimelingTamedEntity slimelingTamedEntity = SlimelingTamedEntity.this;
/* 143 */             Level world = SlimelingTamedEntity.this.f_19853_;
/* 144 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)slimelingTamedEntity));
/*     */           }
/*     */         });
/* 147 */     this.f_21346_.m_25352_(10, (Goal)new NearestAttackableTargetGoal((Mob)this, Evoker.class, true, false)
/*     */         {
/*     */           public boolean m_8036_() {
/* 150 */             double x = SlimelingTamedEntity.this.m_20185_();
/* 151 */             double y = SlimelingTamedEntity.this.m_20186_();
/* 152 */             double z = SlimelingTamedEntity.this.m_20189_();
/* 153 */             SlimelingTamedEntity slimelingTamedEntity = SlimelingTamedEntity.this;
/* 154 */             Level world = SlimelingTamedEntity.this.f_19853_;
/* 155 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)slimelingTamedEntity));
/*     */           }
/*     */         });
/* 158 */     this.f_21346_.m_25352_(11, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false)
/*     */         {
/*     */           public boolean m_8036_() {
/* 161 */             double x = SlimelingTamedEntity.this.m_20185_();
/* 162 */             double y = SlimelingTamedEntity.this.m_20186_();
/* 163 */             double z = SlimelingTamedEntity.this.m_20189_();
/* 164 */             SlimelingTamedEntity slimelingTamedEntity = SlimelingTamedEntity.this;
/* 165 */             Level world = SlimelingTamedEntity.this.f_19853_;
/* 166 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)slimelingTamedEntity));
/*     */           }
/*     */         });
/* 169 */     this.f_21346_.m_25352_(12, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false)
/*     */         {
/*     */           public boolean m_8036_() {
/* 172 */             double x = SlimelingTamedEntity.this.m_20185_();
/* 173 */             double y = SlimelingTamedEntity.this.m_20186_();
/* 174 */             double z = SlimelingTamedEntity.this.m_20189_();
/* 175 */             SlimelingTamedEntity slimelingTamedEntity = SlimelingTamedEntity.this;
/* 176 */             Level world = SlimelingTamedEntity.this.f_19853_;
/* 177 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)slimelingTamedEntity));
/*     */           }
/*     */         });
/* 180 */     this.f_21345_.m_25352_(12, (Goal)new RevertBlockStateGoal((Property)AbstractLatexBlock.COVERED, (Comparable)LatexType.DARK_LATEX, (Comparable)LatexType.NEUTRAL, (PathfinderMob)this, 1.0D, 3));
/* 181 */     this.f_21345_.m_25352_(12, (Goal)new RevertBlockStateGoal((Property)AbstractLatexBlock.COVERED, (Comparable)LatexType.WHITE_LATEX, (Comparable)LatexType.NEUTRAL, (PathfinderMob)this, 1.0D, 3));
/* 182 */     this.f_21345_.m_25352_(13, (Goal)new RemoveBlockGoal((Block)ChangedBlocks.DARK_LATEX_ICE.get(), (PathfinderMob)this, 1.0D, 3));
/* 183 */     this.f_21345_.m_25352_(14, (Goal)new RemoveBlockGoal((Block)ChangedBlocks.LATEX_CRYSTAL.get(), (PathfinderMob)this, 1.0D, 3));
/* 184 */     this.f_21345_.m_25352_(15, (Goal)new RemoveBlockGoal((Block)ChangedBlocks.DARK_LATEX_BLOCK.get(), (PathfinderMob)this, 1.0D, 3));
/* 185 */     this.f_21345_.m_25352_(20, (Goal)new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXHIVE.get(), (PathfinderMob)this, 1.0D, 3));
/* 186 */     this.f_21345_.m_25352_(20, (Goal)new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXHIVE.get(), (PathfinderMob)this, 1.0D, 3));
/* 187 */     this.f_21345_.m_25352_(21, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 9.0F));
/* 188 */     this.f_21345_.m_25352_(22, (Goal)new LookAtPlayerGoal((Mob)this, ScientistEntity.class, 9.0F));
/* 189 */     this.f_21345_.m_25352_(23, (Goal)new LookAtPlayerGoal((Mob)this, Villager.class, 9.0F));
/* 190 */     this.f_21345_.m_25352_(24, (Goal)new LookAtPlayerGoal((Mob)this, WanderingTrader.class, 9.0F));
/* 191 */     this.f_21345_.m_25352_(25, (Goal)new TemptGoal((PathfinderMob)this, 0.6D, Ingredient.m_43929_(new ItemLike[] { (ItemLike)ChangedItems.DARK_LATEX_GOO.get() }, ), true)
/*     */         {
/*     */           public boolean m_8036_() {
/* 194 */             double x = SlimelingTamedEntity.this.m_20185_();
/* 195 */             double y = SlimelingTamedEntity.this.m_20186_();
/* 196 */             double z = SlimelingTamedEntity.this.m_20189_();
/* 197 */             SlimelingTamedEntity slimelingTamedEntity = SlimelingTamedEntity.this;
/* 198 */             Level world = SlimelingTamedEntity.this.f_19853_;
/* 199 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)slimelingTamedEntity));
/*     */           }
/*     */         });
/* 202 */     this.f_21345_.m_25352_(26, (Goal)new TemptGoal((PathfinderMob)this, 0.6D, Ingredient.m_43929_(new ItemLike[] { (ItemLike)Items.f_42518_ }, ), true)
/*     */         {
/*     */           public boolean m_8036_() {
/* 205 */             double x = SlimelingTamedEntity.this.m_20185_();
/* 206 */             double y = SlimelingTamedEntity.this.m_20186_();
/* 207 */             double z = SlimelingTamedEntity.this.m_20189_();
/* 208 */             SlimelingTamedEntity slimelingTamedEntity = SlimelingTamedEntity.this;
/* 209 */             Level world = SlimelingTamedEntity.this.f_19853_;
/* 210 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)slimelingTamedEntity));
/*     */           }
/*     */         });
/* 213 */     this.f_21345_.m_25352_(27, (Goal)new TemptGoal((PathfinderMob)this, 0.7D, Ingredient.m_43929_(new ItemLike[] { (ItemLike)LatexModItems.LATEX_SOUP.get() }, ), true)
/*     */         {
/*     */           public boolean m_8036_() {
/* 216 */             double x = SlimelingTamedEntity.this.m_20185_();
/* 217 */             double y = SlimelingTamedEntity.this.m_20186_();
/* 218 */             double z = SlimelingTamedEntity.this.m_20189_();
/* 219 */             SlimelingTamedEntity slimelingTamedEntity = SlimelingTamedEntity.this;
/* 220 */             Level world = SlimelingTamedEntity.this.f_19853_;
/* 221 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)slimelingTamedEntity));
/*     */           }
/*     */         });
/* 224 */     this.f_21345_.m_25352_(28, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/* 225 */     this.f_21345_.m_25352_(29, (Goal)new OpenDoorGoal((Mob)this, true));
/* 226 */     this.f_21345_.m_25352_(30, (Goal)new OpenDoorGoal((Mob)this, false));
/* 227 */     this.f_21346_.m_25352_(31, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).m_26044_(new Class[0]));
/* 228 */     this.f_21345_.m_25352_(32, (Goal)new RandomLookAroundGoal((Mob)this));
/* 229 */     this.f_21345_.m_25352_(33, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/* 234 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/* 239 */     return false;
/*     */   }
/*     */   
/*     */   protected void m_7472_(DamageSource source, int looting, boolean recentlyHitIn) {
/* 243 */     super.m_7472_(source, looting, recentlyHitIn);
/* 244 */     m_19983_(new ItemStack((ItemLike)LatexModItems.SLIMEESSENCE.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/* 249 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 254 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 259 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/* 264 */     if (source.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 265 */       return false; 
/* 266 */     if (source == DamageSource.f_19315_)
/* 267 */       return false; 
/* 268 */     if (source == DamageSource.f_19314_)
/* 269 */       return false; 
/* 270 */     if (source == DamageSource.f_19320_)
/* 271 */       return false; 
/* 272 */     if (source.m_19385_().equals("witherSkull"))
/* 273 */       return false; 
/* 274 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6667_(DamageSource source) {
/* 279 */     super.m_6667_(source);
/* 280 */     SlimelingEntityDiesProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 286 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 287 */     SlimelingTamedOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/* 288 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult m_6071_(Player sourceentity, InteractionHand hand) {
/* 293 */     ItemStack itemstack = sourceentity.m_21120_(hand);
/* 294 */     InteractionResult retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 295 */     Item item = itemstack.m_41720_();
/* 296 */     if (itemstack.m_41720_() instanceof net.minecraft.world.item.SpawnEggItem) {
/* 297 */       retval = super.m_6071_(sourceentity, hand);
/* 298 */     } else if (this.f_19853_.m_5776_()) {
/*     */ 
/*     */       
/* 301 */       retval = ((m_21824_() && m_21830_((LivingEntity)sourceentity)) || m_6898_(itemstack)) ? InteractionResult.m_19078_(this.f_19853_.m_5776_()) : InteractionResult.PASS;
/*     */     }
/* 303 */     else if (m_21824_()) {
/* 304 */       if (m_21830_((LivingEntity)sourceentity)) {
/* 305 */         if (item.m_41472_() && m_6898_(itemstack) && m_21223_() < m_21233_()) {
/* 306 */           m_142075_(sourceentity, hand, itemstack);
/* 307 */           m_5634_(item.m_41473_().m_38744_());
/* 308 */           retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 309 */         } else if (m_6898_(itemstack) && m_21223_() < m_21233_()) {
/* 310 */           m_142075_(sourceentity, hand, itemstack);
/* 311 */           m_5634_(4.0F);
/* 312 */           retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/*     */         } else {
/* 314 */           retval = super.m_6071_(sourceentity, hand);
/*     */         } 
/*     */       }
/* 317 */     } else if (m_6898_(itemstack)) {
/* 318 */       m_142075_(sourceentity, hand, itemstack);
/* 319 */       if (this.f_19796_.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame((Animal)this, sourceentity)) {
/* 320 */         m_21828_(sourceentity);
/* 321 */         this.f_19853_.m_7605_((Entity)this, (byte)7);
/*     */       } else {
/* 323 */         this.f_19853_.m_7605_((Entity)this, (byte)6);
/*     */       } 
/* 325 */       m_21530_();
/* 326 */       retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/*     */     } else {
/* 328 */       retval = super.m_6071_(sourceentity, hand);
/* 329 */       if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
/* 330 */         m_21530_();
/*     */       }
/*     */     } 
/* 333 */     double x = m_20185_();
/* 334 */     double y = m_20186_();
/* 335 */     double z = m_20189_();
/* 336 */     SlimelingTamedEntity slimelingTamedEntity = this;
/* 337 */     Level world = this.f_19853_;
/*     */     
/* 339 */     SlimelingTamedRightClickedOnEntityProcedure.execute((LevelAccessor)world, x, y, z, (Entity)slimelingTamedEntity, (Entity)sourceentity);
/* 340 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_5993_(Entity entity, int score, DamageSource damageSource) {
/* 345 */     super.m_5993_(entity, score, damageSource);
/* 346 */     SlimelingThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), entity, (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public AgeableMob m_142606_(ServerLevel serverWorld, AgeableMob ageable) {
/* 351 */     SlimelingTamedEntity retval = (SlimelingTamedEntity)((EntityType)LatexModEntities.SLIMELING_TAMED.get()).m_20615_((Level)serverWorld);
/* 352 */     retval.m_6518_((ServerLevelAccessor)serverWorld, serverWorld.m_6436_(retval.m_142538_()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
/* 353 */     return (AgeableMob)retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6898_(ItemStack stack) {
/* 358 */     return List.<Item>of((Item)ChangedItems.DARK_LATEX_GOO.get(), Items.f_42518_, (Item)LatexModItems.LATEX_SOUP.get()).contains(stack.m_41720_());
/*     */   }
/*     */   
/*     */   public static void init() {
/* 362 */     DungeonHooks.addDungeonMob((EntityType)LatexModEntities.SLIMELING_TAMED.get(), 180);
/*     */   }
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 366 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 367 */     builder = builder.m_22268_(Attributes.f_22279_, 0.3D);
/* 368 */     builder = builder.m_22268_(Attributes.f_22276_, 20.0D);
/* 369 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 370 */     builder = builder.m_22268_(Attributes.f_22281_, 2.0D);
/* 371 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 372 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\SlimelingTamedEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */