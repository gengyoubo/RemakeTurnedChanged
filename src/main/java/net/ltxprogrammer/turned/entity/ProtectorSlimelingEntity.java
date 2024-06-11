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
/*     */ import net.ltxprogrammer.turned.procedures.ProtectorSlimelingRightClickedOnEntityProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.ProtectorSlimelingThisEntityKillsAnotherOneProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.SlimelingTamedOnInitialEntitySpawnProcedure;
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
/*     */ public class ProtectorSlimelingEntity
/*     */   extends TamableAnimal {
/*     */   public ProtectorSlimelingEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  84 */     this((EntityType<ProtectorSlimelingEntity>)LatexModEntities.PROTECTOR_SLIMELING.get(), world);
/*     */   }
/*     */   
/*     */   public ProtectorSlimelingEntity(EntityType<ProtectorSlimelingEntity> type, Level world) {
/*  88 */     super(type, world);
/*  89 */     this.f_21364_ = 6;
/*  90 */     m_21557_(false);
/*  91 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  96 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/* 101 */     super.m_8099_();
/* 102 */     this.f_21345_.m_25352_(1, (Goal)new FollowOwnerGoal(this, 0.9D, 12.0F, 2.0F, false));
/* 103 */     this.f_21346_.m_25352_(2, (Goal)new OwnerHurtTargetGoal(this));
/* 104 */     this.f_21345_.m_25352_(3, (Goal)new OwnerHurtByTargetGoal(this));
/* 105 */     this.f_21345_.m_25352_(4, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/* 108 */             return 4.0D + (entity.m_20205_() * entity.m_20205_());
/*     */           }
/*     */         });
/* 111 */     this.f_21346_.m_25352_(5, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, 10, false, false, TargetCheck.IS_LATEX));
/* 112 */     this.f_21346_.m_25352_(5, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, 10, true, false, TargetCheck.IS_EVIL));
/* 113 */     this.f_21346_.m_25352_(7, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false)
/*     */         {
/*     */           public boolean m_8036_() {
/* 116 */             double x = ProtectorSlimelingEntity.this.m_20185_();
/* 117 */             double y = ProtectorSlimelingEntity.this.m_20186_();
/* 118 */             double z = ProtectorSlimelingEntity.this.m_20189_();
/* 119 */             ProtectorSlimelingEntity protectorSlimelingEntity = ProtectorSlimelingEntity.this;
/* 120 */             Level world = ProtectorSlimelingEntity.this.f_19853_;
/* 121 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)protectorSlimelingEntity));
/*     */           }
/*     */         });
/* 124 */     this.f_21346_.m_25352_(8, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false)
/*     */         {
/*     */           public boolean m_8036_() {
/* 127 */             double x = ProtectorSlimelingEntity.this.m_20185_();
/* 128 */             double y = ProtectorSlimelingEntity.this.m_20186_();
/* 129 */             double z = ProtectorSlimelingEntity.this.m_20189_();
/* 130 */             ProtectorSlimelingEntity protectorSlimelingEntity = ProtectorSlimelingEntity.this;
/* 131 */             Level world = ProtectorSlimelingEntity.this.f_19853_;
/* 132 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)protectorSlimelingEntity));
/*     */           }
/*     */         });
/* 135 */     this.f_21346_.m_25352_(9, (Goal)new NearestAttackableTargetGoal((Mob)this, Illusioner.class, true, false)
/*     */         {
/*     */           public boolean m_8036_() {
/* 138 */             double x = ProtectorSlimelingEntity.this.m_20185_();
/* 139 */             double y = ProtectorSlimelingEntity.this.m_20186_();
/* 140 */             double z = ProtectorSlimelingEntity.this.m_20189_();
/* 141 */             ProtectorSlimelingEntity protectorSlimelingEntity = ProtectorSlimelingEntity.this;
/* 142 */             Level world = ProtectorSlimelingEntity.this.f_19853_;
/* 143 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)protectorSlimelingEntity));
/*     */           }
/*     */         });
/* 146 */     this.f_21346_.m_25352_(10, (Goal)new NearestAttackableTargetGoal((Mob)this, Evoker.class, true, false)
/*     */         {
/*     */           public boolean m_8036_() {
/* 149 */             double x = ProtectorSlimelingEntity.this.m_20185_();
/* 150 */             double y = ProtectorSlimelingEntity.this.m_20186_();
/* 151 */             double z = ProtectorSlimelingEntity.this.m_20189_();
/* 152 */             ProtectorSlimelingEntity protectorSlimelingEntity = ProtectorSlimelingEntity.this;
/* 153 */             Level world = ProtectorSlimelingEntity.this.f_19853_;
/* 154 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)protectorSlimelingEntity));
/*     */           }
/*     */         });
/* 157 */     this.f_21346_.m_25352_(11, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false)
/*     */         {
/*     */           public boolean m_8036_() {
/* 160 */             double x = ProtectorSlimelingEntity.this.m_20185_();
/* 161 */             double y = ProtectorSlimelingEntity.this.m_20186_();
/* 162 */             double z = ProtectorSlimelingEntity.this.m_20189_();
/* 163 */             ProtectorSlimelingEntity protectorSlimelingEntity = ProtectorSlimelingEntity.this;
/* 164 */             Level world = ProtectorSlimelingEntity.this.f_19853_;
/* 165 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)protectorSlimelingEntity));
/*     */           }
/*     */         });
/* 168 */     this.f_21346_.m_25352_(12, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false)
/*     */         {
/*     */           public boolean m_8036_() {
/* 171 */             double x = ProtectorSlimelingEntity.this.m_20185_();
/* 172 */             double y = ProtectorSlimelingEntity.this.m_20186_();
/* 173 */             double z = ProtectorSlimelingEntity.this.m_20189_();
/* 174 */             ProtectorSlimelingEntity protectorSlimelingEntity = ProtectorSlimelingEntity.this;
/* 175 */             Level world = ProtectorSlimelingEntity.this.f_19853_;
/* 176 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)protectorSlimelingEntity));
/*     */           }
/*     */         });
/* 179 */     this.f_21345_.m_25352_(12, (Goal)new RevertBlockStateGoal((Property)AbstractLatexBlock.COVERED, (Comparable)LatexType.DARK_LATEX, (Comparable)LatexType.NEUTRAL, (PathfinderMob)this, 1.0D, 3));
/* 180 */     this.f_21345_.m_25352_(12, (Goal)new RevertBlockStateGoal((Property)AbstractLatexBlock.COVERED, (Comparable)LatexType.WHITE_LATEX, (Comparable)LatexType.NEUTRAL, (PathfinderMob)this, 1.0D, 3));
/* 181 */     this.f_21345_.m_25352_(13, (Goal)new RemoveBlockGoal((Block)ChangedBlocks.DARK_LATEX_ICE.get(), (PathfinderMob)this, 1.0D, 3));
/* 182 */     this.f_21345_.m_25352_(14, (Goal)new RemoveBlockGoal((Block)ChangedBlocks.LATEX_CRYSTAL.get(), (PathfinderMob)this, 1.0D, 3));
/* 183 */     this.f_21345_.m_25352_(15, (Goal)new RemoveBlockGoal((Block)ChangedBlocks.DARK_LATEX_BLOCK.get(), (PathfinderMob)this, 1.0D, 3));
/* 184 */     this.f_21345_.m_25352_(20, (Goal)new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXHIVE.get(), (PathfinderMob)this, 1.0D, 3));
/* 185 */     this.f_21345_.m_25352_(21, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 9.0F));
/* 186 */     this.f_21345_.m_25352_(22, (Goal)new LookAtPlayerGoal((Mob)this, ScientistEntity.class, 9.0F));
/* 187 */     this.f_21345_.m_25352_(23, (Goal)new LookAtPlayerGoal((Mob)this, Villager.class, 9.0F));
/* 188 */     this.f_21345_.m_25352_(24, (Goal)new LookAtPlayerGoal((Mob)this, WanderingTrader.class, 9.0F));
/* 189 */     this.f_21345_.m_25352_(25, (Goal)new TemptGoal((PathfinderMob)this, 0.6D, Ingredient.m_43929_(new ItemLike[] { (ItemLike)ChangedItems.DARK_LATEX_GOO.get() }, ), true)
/*     */         {
/*     */           public boolean m_8036_() {
/* 192 */             double x = ProtectorSlimelingEntity.this.m_20185_();
/* 193 */             double y = ProtectorSlimelingEntity.this.m_20186_();
/* 194 */             double z = ProtectorSlimelingEntity.this.m_20189_();
/* 195 */             ProtectorSlimelingEntity protectorSlimelingEntity = ProtectorSlimelingEntity.this;
/* 196 */             Level world = ProtectorSlimelingEntity.this.f_19853_;
/* 197 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)protectorSlimelingEntity));
/*     */           }
/*     */         });
/* 200 */     this.f_21345_.m_25352_(26, (Goal)new TemptGoal((PathfinderMob)this, 0.6D, Ingredient.m_43929_(new ItemLike[] { (ItemLike)Items.f_42518_ }, ), true)
/*     */         {
/*     */           public boolean m_8036_() {
/* 203 */             double x = ProtectorSlimelingEntity.this.m_20185_();
/* 204 */             double y = ProtectorSlimelingEntity.this.m_20186_();
/* 205 */             double z = ProtectorSlimelingEntity.this.m_20189_();
/* 206 */             ProtectorSlimelingEntity protectorSlimelingEntity = ProtectorSlimelingEntity.this;
/* 207 */             Level world = ProtectorSlimelingEntity.this.f_19853_;
/* 208 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)protectorSlimelingEntity));
/*     */           }
/*     */         });
/* 211 */     this.f_21345_.m_25352_(27, (Goal)new TemptGoal((PathfinderMob)this, 0.7D, Ingredient.m_43929_(new ItemLike[] { (ItemLike)LatexModItems.LATEX_SOUP.get() }, ), true)
/*     */         {
/*     */           public boolean m_8036_() {
/* 214 */             double x = ProtectorSlimelingEntity.this.m_20185_();
/* 215 */             double y = ProtectorSlimelingEntity.this.m_20186_();
/* 216 */             double z = ProtectorSlimelingEntity.this.m_20189_();
/* 217 */             ProtectorSlimelingEntity protectorSlimelingEntity = ProtectorSlimelingEntity.this;
/* 218 */             Level world = ProtectorSlimelingEntity.this.f_19853_;
/* 219 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)protectorSlimelingEntity));
/*     */           }
/*     */         });
/* 222 */     this.f_21345_.m_25352_(28, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/* 223 */     this.f_21345_.m_25352_(29, (Goal)new OpenDoorGoal((Mob)this, true));
/* 224 */     this.f_21345_.m_25352_(30, (Goal)new OpenDoorGoal((Mob)this, false));
/* 225 */     this.f_21346_.m_25352_(31, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).m_26044_(new Class[0]));
/* 226 */     this.f_21345_.m_25352_(32, (Goal)new RandomLookAroundGoal((Mob)this));
/* 227 */     this.f_21345_.m_25352_(33, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/* 232 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/* 237 */     return false;
/*     */   }
/*     */   
/*     */   protected void m_7472_(DamageSource source, int looting, boolean recentlyHitIn) {
/* 241 */     super.m_7472_(source, looting, recentlyHitIn);
/* 242 */     m_19983_(new ItemStack((ItemLike)LatexModItems.SLIMEESSENCE.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/* 247 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 252 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 257 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/* 262 */     if (source.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 263 */       return false; 
/* 264 */     if (source == DamageSource.f_19315_)
/* 265 */       return false; 
/* 266 */     if (source == DamageSource.f_19314_)
/* 267 */       return false; 
/* 268 */     if (source == DamageSource.f_19320_)
/* 269 */       return false; 
/* 270 */     if (source.m_19385_().equals("witherSkull"))
/* 271 */       return false; 
/* 272 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 278 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 279 */     SlimelingTamedOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/* 280 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult m_6071_(Player sourceentity, InteractionHand hand) {
/* 285 */     ItemStack itemstack = sourceentity.m_21120_(hand);
/* 286 */     InteractionResult retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 287 */     Item item = itemstack.m_41720_();
/* 288 */     if (itemstack.m_41720_() instanceof net.minecraft.world.item.SpawnEggItem) {
/* 289 */       retval = super.m_6071_(sourceentity, hand);
/* 290 */     } else if (this.f_19853_.m_5776_()) {
/*     */ 
/*     */       
/* 293 */       retval = ((m_21824_() && m_21830_((LivingEntity)sourceentity)) || m_6898_(itemstack)) ? InteractionResult.m_19078_(this.f_19853_.m_5776_()) : InteractionResult.PASS;
/*     */     }
/* 295 */     else if (m_21824_()) {
/* 296 */       if (m_21830_((LivingEntity)sourceentity)) {
/* 297 */         if (item.m_41472_() && m_6898_(itemstack) && m_21223_() < m_21233_()) {
/* 298 */           m_142075_(sourceentity, hand, itemstack);
/* 299 */           m_5634_(item.m_41473_().m_38744_());
/* 300 */           retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 301 */         } else if (m_6898_(itemstack) && m_21223_() < m_21233_()) {
/* 302 */           m_142075_(sourceentity, hand, itemstack);
/* 303 */           m_5634_(4.0F);
/* 304 */           retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/*     */         } else {
/* 306 */           retval = super.m_6071_(sourceentity, hand);
/*     */         } 
/*     */       }
/* 309 */     } else if (m_6898_(itemstack)) {
/* 310 */       m_142075_(sourceentity, hand, itemstack);
/* 311 */       if (this.f_19796_.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame((Animal)this, sourceentity)) {
/* 312 */         m_21828_(sourceentity);
/* 313 */         this.f_19853_.m_7605_((Entity)this, (byte)7);
/*     */       } else {
/* 315 */         this.f_19853_.m_7605_((Entity)this, (byte)6);
/*     */       } 
/* 317 */       m_21530_();
/* 318 */       retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/*     */     } else {
/* 320 */       retval = super.m_6071_(sourceentity, hand);
/* 321 */       if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
/* 322 */         m_21530_();
/*     */       }
/*     */     } 
/* 325 */     double x = m_20185_();
/* 326 */     double y = m_20186_();
/* 327 */     double z = m_20189_();
/* 328 */     ProtectorSlimelingEntity protectorSlimelingEntity = this;
/* 329 */     Level world = this.f_19853_;
/*     */     
/* 331 */     ProtectorSlimelingRightClickedOnEntityProcedure.execute((LevelAccessor)world, x, y, z, (Entity)protectorSlimelingEntity, (Entity)sourceentity);
/* 332 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_5993_(Entity entity, int score, DamageSource damageSource) {
/* 337 */     super.m_5993_(entity, score, damageSource);
/* 338 */     ProtectorSlimelingThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), entity, (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public AgeableMob m_142606_(ServerLevel serverWorld, AgeableMob ageable) {
/* 343 */     ProtectorSlimelingEntity retval = (ProtectorSlimelingEntity)((EntityType)LatexModEntities.PROTECTOR_SLIMELING.get()).m_20615_((Level)serverWorld);
/* 344 */     retval.m_6518_((ServerLevelAccessor)serverWorld, serverWorld.m_6436_(retval.m_142538_()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
/* 345 */     return (AgeableMob)retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6898_(ItemStack stack) {
/* 350 */     return List.<Item>of((Item)ChangedItems.DARK_LATEX_GOO.get(), Items.f_42518_, (Item)LatexModItems.LATEX_SOUP.get()).contains(stack.m_41720_());
/*     */   }
/*     */   
/*     */   public static void init() {
/* 354 */     DungeonHooks.addDungeonMob((EntityType)LatexModEntities.PROTECTOR_SLIMELING.get(), 180);
/*     */   }
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 358 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 359 */     builder = builder.m_22268_(Attributes.f_22279_, 0.3D);
/* 360 */     builder = builder.m_22268_(Attributes.f_22276_, 32.0D);
/* 361 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 362 */     builder = builder.m_22268_(Attributes.f_22281_, 3.0D);
/* 363 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 364 */     builder = builder.m_22268_(Attributes.f_22278_, 0.1D);
/* 365 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\ProtectorSlimelingEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */