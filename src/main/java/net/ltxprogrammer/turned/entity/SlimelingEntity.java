/*     */ package net.ltxprogrammer.turned.entity;
/*     */ import java.util.List;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
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
/*     */ import net.ltxprogrammer.turned.procedures.SlimelingRightClickedOnEntityProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.SlimelingThisEntityKillsAnotherOneProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.SlimelingattackconditionsProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.InteractionHand;
/*     */ import net.minecraft.world.InteractionResult;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.entity.AgeableMob;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobCategory;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.SpawnPlacements;
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
/*     */ import net.minecraft.world.item.crafting.Ingredient;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.biome.MobSpawnSettings;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraft.world.level.block.state.properties.Property;
/*     */ import net.minecraft.world.level.levelgen.Heightmap;
/*     */ import net.minecraft.world.level.material.Material;
/*     */ import net.minecraftforge.common.DungeonHooks;
/*     */ import net.minecraftforge.event.ForgeEventFactory;
/*     */ import net.minecraftforge.event.world.BiomeLoadingEvent;
/*     */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ @EventBusSubscriber
/*     */ public class SlimelingEntity extends TamableAnimal {
/*  87 */   private static final Set<ResourceLocation> SPAWN_BIOMES = Set.of(new ResourceLocation("windswept_hills"), new ResourceLocation("plains"), new ResourceLocation("swamp"));
/*     */ 
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
/*  92 */     if (SPAWN_BIOMES.contains(event.getName()))
/*  93 */       event.getSpawns().getSpawner(MobCategory.CREATURE).add(new MobSpawnSettings.SpawnerData((EntityType)LatexModEntities.SLIMELING.get(), 6, 1, 3)); 
/*     */   }
/*     */   
/*     */   public SlimelingEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  97 */     this((EntityType<SlimelingEntity>)LatexModEntities.SLIMELING.get(), world);
/*     */   }
/*     */   
/*     */   public SlimelingEntity(EntityType<SlimelingEntity> type, Level world) {
/* 101 */     super(type, world);
/* 102 */     this.f_21364_ = 4;
/* 103 */     m_21557_(false);
/* 104 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/* 109 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/* 114 */     super.m_8099_();
/* 115 */     this.f_21345_.m_25352_(1, (Goal)new FollowOwnerGoal(this, 1.0D, 9.0F, 2.0F, false));
/* 116 */     this.f_21346_.m_25352_(2, (Goal)new OwnerHurtTargetGoal(this));
/* 117 */     this.f_21345_.m_25352_(3, (Goal)new OwnerHurtByTargetGoal(this));
/* 118 */     this.f_21345_.m_25352_(4, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/* 121 */             return 4.0D + (entity.m_20205_() * entity.m_20205_());
/*     */           }
/*     */         });
/* 124 */     this.f_21346_.m_25352_(5, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, 10, false, false, TargetCheck.IS_LATEX));
/* 125 */     this.f_21346_.m_25352_(6, (Goal)new NearestAttackableTargetGoal((Mob)this, Player.class, true, false)
/*     */         {
/*     */           public boolean m_8036_() {
/* 128 */             double x = SlimelingEntity.this.m_20185_();
/* 129 */             double y = SlimelingEntity.this.m_20186_();
/* 130 */             double z = SlimelingEntity.this.m_20189_();
/* 131 */             SlimelingEntity slimelingEntity = SlimelingEntity.this;
/* 132 */             Level world = SlimelingEntity.this.f_19853_;
/* 133 */             return (super.m_8036_() && SlimelingattackconditionsProcedure.execute((LevelAccessor)world, x, y, z, (Entity)slimelingEntity));
/*     */           }
/*     */         });
/* 136 */     this.f_21346_.m_25352_(7, (Goal)new NearestAttackableTargetGoal((Mob)this, EvilScientistEntity.class, true, false)
/*     */         {
/*     */           public boolean m_8036_() {
/* 139 */             double x = SlimelingEntity.this.m_20185_();
/* 140 */             double y = SlimelingEntity.this.m_20186_();
/* 141 */             double z = SlimelingEntity.this.m_20189_();
/* 142 */             SlimelingEntity slimelingEntity = SlimelingEntity.this;
/* 143 */             Level world = SlimelingEntity.this.f_19853_;
/* 144 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)slimelingEntity));
/*     */           }
/*     */         });
/* 147 */     this.f_21346_.m_25352_(8, (Goal)new NearestAttackableTargetGoal((Mob)this, ScientistEntity.class, true, false)
/*     */         {
/*     */           public boolean m_8036_() {
/* 150 */             double x = SlimelingEntity.this.m_20185_();
/* 151 */             double y = SlimelingEntity.this.m_20186_();
/* 152 */             double z = SlimelingEntity.this.m_20189_();
/* 153 */             SlimelingEntity slimelingEntity = SlimelingEntity.this;
/* 154 */             Level world = SlimelingEntity.this.f_19853_;
/* 155 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)slimelingEntity));
/*     */           }
/*     */         });
/* 158 */     this.f_21346_.m_25352_(9, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false)
/*     */         {
/*     */           public boolean m_8036_() {
/* 161 */             double x = SlimelingEntity.this.m_20185_();
/* 162 */             double y = SlimelingEntity.this.m_20186_();
/* 163 */             double z = SlimelingEntity.this.m_20189_();
/* 164 */             SlimelingEntity slimelingEntity = SlimelingEntity.this;
/* 165 */             Level world = SlimelingEntity.this.f_19853_;
/* 166 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)slimelingEntity));
/*     */           }
/*     */         });
/* 169 */     this.f_21346_.m_25352_(10, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false)
/*     */         {
/*     */           public boolean m_8036_() {
/* 172 */             double x = SlimelingEntity.this.m_20185_();
/* 173 */             double y = SlimelingEntity.this.m_20186_();
/* 174 */             double z = SlimelingEntity.this.m_20189_();
/* 175 */             SlimelingEntity slimelingEntity = SlimelingEntity.this;
/* 176 */             Level world = SlimelingEntity.this.f_19853_;
/* 177 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)slimelingEntity));
/*     */           }
/*     */         });
/* 180 */     this.f_21346_.m_25352_(11, (Goal)new NearestAttackableTargetGoal((Mob)this, Illusioner.class, true, false)
/*     */         {
/*     */           public boolean m_8036_() {
/* 183 */             double x = SlimelingEntity.this.m_20185_();
/* 184 */             double y = SlimelingEntity.this.m_20186_();
/* 185 */             double z = SlimelingEntity.this.m_20189_();
/* 186 */             SlimelingEntity slimelingEntity = SlimelingEntity.this;
/* 187 */             Level world = SlimelingEntity.this.f_19853_;
/* 188 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)slimelingEntity));
/*     */           }
/*     */         });
/* 191 */     this.f_21346_.m_25352_(12, (Goal)new NearestAttackableTargetGoal((Mob)this, Evoker.class, true, false)
/*     */         {
/*     */           public boolean m_8036_() {
/* 194 */             double x = SlimelingEntity.this.m_20185_();
/* 195 */             double y = SlimelingEntity.this.m_20186_();
/* 196 */             double z = SlimelingEntity.this.m_20189_();
/* 197 */             SlimelingEntity slimelingEntity = SlimelingEntity.this;
/* 198 */             Level world = SlimelingEntity.this.f_19853_;
/* 199 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)slimelingEntity));
/*     */           }
/*     */         });
/* 202 */     this.f_21346_.m_25352_(13, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false)
/*     */         {
/*     */           public boolean m_8036_() {
/* 205 */             double x = SlimelingEntity.this.m_20185_();
/* 206 */             double y = SlimelingEntity.this.m_20186_();
/* 207 */             double z = SlimelingEntity.this.m_20189_();
/* 208 */             SlimelingEntity slimelingEntity = SlimelingEntity.this;
/* 209 */             Level world = SlimelingEntity.this.f_19853_;
/* 210 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)slimelingEntity));
/*     */           }
/*     */         });
/* 213 */     this.f_21346_.m_25352_(14, (Goal)new NearestAttackableTargetGoal((Mob)this, Villager.class, true, false)
/*     */         {
/*     */           public boolean m_8036_() {
/* 216 */             double x = SlimelingEntity.this.m_20185_();
/* 217 */             double y = SlimelingEntity.this.m_20186_();
/* 218 */             double z = SlimelingEntity.this.m_20189_();
/* 219 */             SlimelingEntity slimelingEntity = SlimelingEntity.this;
/* 220 */             Level world = SlimelingEntity.this.f_19853_;
/* 221 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)slimelingEntity));
/*     */           }
/*     */         });
/* 224 */     this.f_21346_.m_25352_(15, (Goal)new NearestAttackableTargetGoal((Mob)this, WanderingTrader.class, true, false)
/*     */         {
/*     */           public boolean m_8036_() {
/* 227 */             double x = SlimelingEntity.this.m_20185_();
/* 228 */             double y = SlimelingEntity.this.m_20186_();
/* 229 */             double z = SlimelingEntity.this.m_20189_();
/* 230 */             SlimelingEntity slimelingEntity = SlimelingEntity.this;
/* 231 */             Level world = SlimelingEntity.this.f_19853_;
/* 232 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)slimelingEntity));
/*     */           }
/*     */         });
/* 235 */     this.f_21346_.m_25352_(16, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false)
/*     */         {
/*     */           public boolean m_8036_() {
/* 238 */             double x = SlimelingEntity.this.m_20185_();
/* 239 */             double y = SlimelingEntity.this.m_20186_();
/* 240 */             double z = SlimelingEntity.this.m_20189_();
/* 241 */             SlimelingEntity slimelingEntity = SlimelingEntity.this;
/* 242 */             Level world = SlimelingEntity.this.f_19853_;
/* 243 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)slimelingEntity));
/*     */           }
/*     */         });
/* 246 */     this.f_21345_.m_25352_(12, (Goal)new RevertBlockStateGoal((Property)AbstractLatexBlock.COVERED, (Comparable)LatexType.DARK_LATEX, (Comparable)LatexType.NEUTRAL, (PathfinderMob)this, 1.0D, 3));
/* 247 */     this.f_21345_.m_25352_(12, (Goal)new RevertBlockStateGoal((Property)AbstractLatexBlock.COVERED, (Comparable)LatexType.WHITE_LATEX, (Comparable)LatexType.NEUTRAL, (PathfinderMob)this, 1.0D, 3));
/* 248 */     this.f_21345_.m_25352_(13, (Goal)new RemoveBlockGoal((Block)ChangedBlocks.DARK_LATEX_ICE.get(), (PathfinderMob)this, 1.0D, 3));
/* 249 */     this.f_21345_.m_25352_(14, (Goal)new RemoveBlockGoal((Block)ChangedBlocks.LATEX_CRYSTAL.get(), (PathfinderMob)this, 1.0D, 3));
/* 250 */     this.f_21345_.m_25352_(15, (Goal)new RemoveBlockGoal((Block)ChangedBlocks.DARK_LATEX_BLOCK.get(), (PathfinderMob)this, 1.0D, 3));
/* 251 */     this.f_21345_.m_25352_(20, (Goal)new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXHIVE.get(), (PathfinderMob)this, 1.0D, 3));
/* 252 */     this.f_21345_.m_25352_(24, (Goal)new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXHIVE.get(), (PathfinderMob)this, 1.0D, 3));
/* 253 */     this.f_21345_.m_25352_(25, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 9.0F)
/*     */         {
/*     */           public boolean m_8036_() {
/* 256 */             double x = SlimelingEntity.this.m_20185_();
/* 257 */             double y = SlimelingEntity.this.m_20186_();
/* 258 */             double z = SlimelingEntity.this.m_20189_();
/* 259 */             SlimelingEntity slimelingEntity = SlimelingEntity.this;
/* 260 */             Level world = SlimelingEntity.this.f_19853_;
/* 261 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)slimelingEntity));
/*     */           }
/*     */         });
/* 264 */     this.f_21345_.m_25352_(26, (Goal)new LookAtPlayerGoal((Mob)this, Villager.class, 9.0F)
/*     */         {
/*     */           public boolean m_8036_() {
/* 267 */             double x = SlimelingEntity.this.m_20185_();
/* 268 */             double y = SlimelingEntity.this.m_20186_();
/* 269 */             double z = SlimelingEntity.this.m_20189_();
/* 270 */             SlimelingEntity slimelingEntity = SlimelingEntity.this;
/* 271 */             Level world = SlimelingEntity.this.f_19853_;
/* 272 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)slimelingEntity));
/*     */           }
/*     */         });
/* 275 */     this.f_21345_.m_25352_(27, (Goal)new LookAtPlayerGoal((Mob)this, WanderingTrader.class, 9.0F)
/*     */         {
/*     */           public boolean m_8036_() {
/* 278 */             double x = SlimelingEntity.this.m_20185_();
/* 279 */             double y = SlimelingEntity.this.m_20186_();
/* 280 */             double z = SlimelingEntity.this.m_20189_();
/* 281 */             SlimelingEntity slimelingEntity = SlimelingEntity.this;
/* 282 */             Level world = SlimelingEntity.this.f_19853_;
/* 283 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)slimelingEntity));
/*     */           }
/*     */         });
/* 286 */     this.f_21345_.m_25352_(28, (Goal)new TemptGoal((PathfinderMob)this, 0.8D, Ingredient.m_43929_(new ItemLike[] { (ItemLike)ChangedItems.DARK_LATEX_GOO.get() }, ), true)
/*     */         {
/*     */           public boolean m_8036_() {
/* 289 */             double x = SlimelingEntity.this.m_20185_();
/* 290 */             double y = SlimelingEntity.this.m_20186_();
/* 291 */             double z = SlimelingEntity.this.m_20189_();
/* 292 */             SlimelingEntity slimelingEntity = SlimelingEntity.this;
/* 293 */             Level world = SlimelingEntity.this.f_19853_;
/* 294 */             return (super.m_8036_() && CheckiftamedProcedure.execute((LevelAccessor)world, x, y, z, (Entity)slimelingEntity));
/*     */           }
/*     */         });
/* 297 */     this.f_21345_.m_25352_(29, (Goal)new RandomStrollGoal((PathfinderMob)this, 1.0D));
/* 298 */     this.f_21345_.m_25352_(30, (Goal)new OpenDoorGoal((Mob)this, true));
/* 299 */     this.f_21345_.m_25352_(31, (Goal)new OpenDoorGoal((Mob)this, false));
/* 300 */     this.f_21346_.m_25352_(32, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).m_26044_(new Class[0]));
/* 301 */     this.f_21345_.m_25352_(33, (Goal)new RandomLookAroundGoal((Mob)this));
/* 302 */     this.f_21345_.m_25352_(34, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/* 307 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/* 312 */     return false;
/*     */   }
/*     */   
/*     */   protected void m_7472_(DamageSource source, int looting, boolean recentlyHitIn) {
/* 316 */     super.m_7472_(source, looting, recentlyHitIn);
/* 317 */     m_19983_(new ItemStack((ItemLike)LatexModItems.SLIMEESSENCE.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/* 322 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 327 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 332 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/* 337 */     if (source.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 338 */       return false; 
/* 339 */     if (source == DamageSource.f_19315_)
/* 340 */       return false; 
/* 341 */     if (source == DamageSource.f_19314_)
/* 342 */       return false; 
/* 343 */     if (source == DamageSource.f_19320_)
/* 344 */       return false; 
/* 345 */     if (source.m_19385_().equals("witherSkull"))
/* 346 */       return false; 
/* 347 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6667_(DamageSource source) {
/* 352 */     super.m_6667_(source);
/* 353 */     SlimelingEntityDiesProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_());
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult m_6071_(Player sourceentity, InteractionHand hand) {
/* 358 */     ItemStack itemstack = sourceentity.m_21120_(hand);
/* 359 */     InteractionResult retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 360 */     Item item = itemstack.m_41720_();
/* 361 */     if (itemstack.m_41720_() instanceof net.minecraft.world.item.SpawnEggItem) {
/* 362 */       retval = super.m_6071_(sourceentity, hand);
/* 363 */     } else if (this.f_19853_.m_5776_()) {
/*     */ 
/*     */       
/* 366 */       retval = ((m_21824_() && m_21830_((LivingEntity)sourceentity)) || m_6898_(itemstack)) ? InteractionResult.m_19078_(this.f_19853_.m_5776_()) : InteractionResult.PASS;
/*     */     }
/* 368 */     else if (m_21824_()) {
/* 369 */       if (m_21830_((LivingEntity)sourceentity)) {
/* 370 */         if (item.m_41472_() && m_6898_(itemstack) && m_21223_() < m_21233_()) {
/* 371 */           m_142075_(sourceentity, hand, itemstack);
/* 372 */           m_5634_(item.m_41473_().m_38744_());
/* 373 */           retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 374 */         } else if (m_6898_(itemstack) && m_21223_() < m_21233_()) {
/* 375 */           m_142075_(sourceentity, hand, itemstack);
/* 376 */           m_5634_(4.0F);
/* 377 */           retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/*     */         } else {
/* 379 */           retval = super.m_6071_(sourceentity, hand);
/*     */         } 
/*     */       }
/* 382 */     } else if (m_6898_(itemstack)) {
/* 383 */       m_142075_(sourceentity, hand, itemstack);
/* 384 */       if (this.f_19796_.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame((Animal)this, sourceentity)) {
/* 385 */         m_21828_(sourceentity);
/* 386 */         this.f_19853_.m_7605_((Entity)this, (byte)7);
/*     */       } else {
/* 388 */         this.f_19853_.m_7605_((Entity)this, (byte)6);
/*     */       } 
/* 390 */       m_21530_();
/* 391 */       retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/*     */     } else {
/* 393 */       retval = super.m_6071_(sourceentity, hand);
/* 394 */       if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
/* 395 */         m_21530_();
/*     */       }
/*     */     } 
/* 398 */     double x = m_20185_();
/* 399 */     double y = m_20186_();
/* 400 */     double z = m_20189_();
/* 401 */     SlimelingEntity slimelingEntity = this;
/* 402 */     Level world = this.f_19853_;
/*     */     
/* 404 */     SlimelingRightClickedOnEntityProcedure.execute((LevelAccessor)world, x, y, z, (Entity)slimelingEntity, (Entity)sourceentity);
/* 405 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_5993_(Entity entity, int score, DamageSource damageSource) {
/* 410 */     super.m_5993_(entity, score, damageSource);
/* 411 */     SlimelingThisEntityKillsAnotherOneProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), entity, (Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   public AgeableMob m_142606_(ServerLevel serverWorld, AgeableMob ageable) {
/* 416 */     SlimelingEntity retval = (SlimelingEntity)((EntityType)LatexModEntities.SLIMELING.get()).m_20615_((Level)serverWorld);
/* 417 */     retval.m_6518_((ServerLevelAccessor)serverWorld, serverWorld.m_6436_(retval.m_142538_()), MobSpawnType.BREEDING, null, null);
/* 418 */     return (AgeableMob)retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6898_(ItemStack stack) {
/* 423 */     return List.of().contains(stack.m_41720_());
/*     */   }
/*     */   
/*     */   public static void init() {
/* 427 */     SpawnPlacements.m_21754_((EntityType)LatexModEntities.SLIMELING.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> 
/*     */         
/* 429 */         (world.m_8055_(pos.m_7495_()).m_60767_() == Material.f_76315_ && world.m_45524_(pos, 0) > 8));
/* 430 */     DungeonHooks.addDungeonMob((EntityType)LatexModEntities.SLIMELING.get(), 180);
/*     */   }
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 434 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 435 */     builder = builder.m_22268_(Attributes.f_22279_, 0.3D);
/* 436 */     builder = builder.m_22268_(Attributes.f_22276_, 20.0D);
/* 437 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 438 */     builder = builder.m_22268_(Attributes.f_22281_, 2.0D);
/* 439 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 440 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\SlimelingEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */