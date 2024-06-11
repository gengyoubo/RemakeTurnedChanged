/*     */ package net.mcreator.latexes.entity;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ import javax.annotation.Nullable;
/*     */ import net.mcreator.latexes.init.LatexModBlocks;
/*     */ import net.mcreator.latexes.init.LatexModEntities;
/*     */ import net.mcreator.latexes.init.LatexModItems;
/*     */ import net.mcreator.latexes.procedures.DarklatexslugNaturalEntitySpawningConditionProcedure;
/*     */ import net.mcreator.latexes.procedures.DarklatexslugOnEntityTickUpdateProcedure;
/*     */ import net.mcreator.latexes.procedures.DarklatexslugOnInitialEntitySpawnProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.DifficultyInstance;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobCategory;
/*     */ import net.minecraft.world.entity.MobSpawnType;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.SpawnGroupData;
/*     */ import net.minecraft.world.entity.SpawnPlacements;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.goal.AvoidEntityGoal;
/*     */ import net.minecraft.world.entity.ai.goal.EatBlockGoal;
/*     */ import net.minecraft.world.entity.ai.goal.FloatGoal;
/*     */ import net.minecraft.world.entity.ai.goal.FollowMobGoal;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.MoveBackToVillageGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RemoveBlockGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RestrictSunGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.biome.MobSpawnSettings;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.Blocks;
/*     */ import net.minecraft.world.level.levelgen.Heightmap;
/*     */ import net.minecraftforge.event.world.BiomeLoadingEvent;
/*     */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*     */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ @EventBusSubscriber
/*     */ public class DarklatexslugEntity extends Monster {
/*  61 */   private static final Set<ResourceLocation> SPAWN_BIOMES = Set.of(new ResourceLocation[] { new ResourceLocation("savanna_plateau"), new ResourceLocation("forest"), new ResourceLocation("sunflower_plains"), new ResourceLocation("taiga"), new ResourceLocation("flower_forest"), new ResourceLocation("swamp"), new ResourceLocation("eroded_badlands"), new ResourceLocation("windswept_hills"), new ResourceLocation("latex:dark_latex_biome"), new ResourceLocation("plains"), new ResourceLocation("savanna"), new ResourceLocation("windswept_savanna"), new ResourceLocation("the_void"), new ResourceLocation("jungle"), new ResourceLocation("windswept_gravelly_hills"), new ResourceLocation("desert") });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
/*  70 */     if (SPAWN_BIOMES.contains(event.getName()))
/*  71 */       event.getSpawns().getSpawner(MobCategory.MONSTER).add(new MobSpawnSettings.SpawnerData((EntityType)LatexModEntities.DARKLATEXSLUG.get(), 5, 1, 3)); 
/*     */   }
/*     */   
/*     */   public DarklatexslugEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  75 */     this((EntityType<DarklatexslugEntity>)LatexModEntities.DARKLATEXSLUG.get(), world);
/*     */   }
/*     */   
/*     */   public DarklatexslugEntity(EntityType<DarklatexslugEntity> type, Level world) {
/*  79 */     super(type, world);
/*  80 */     this.xpReward = 1;
/*  81 */     setNoAi(false);
/*  82 */     setPersistenceRequired();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> getAddEntityPacket() {
/*  87 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void registerGoals() {
/*  92 */     super.registerGoals();
/*  93 */     this.goalSelector.addGoal(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double getAttackReachSqr(LivingEntity entity) {
/*  96 */             return 4.0D + (entity.getBbWidth() * entity.getBbWidth());
/*     */           }
/*     */         });
/*  99 */     this.goalSelector.addGoal(2, (Goal)new AvoidEntityGoal((PathfinderMob)this, Monster.class, 16.0F, 1.0D, 1.2D));
/* 100 */     this.goalSelector.addGoal(3, (Goal)new AvoidEntityGoal((PathfinderMob)this, PathfinderMob.class, 12.0F, 1.0D, 1.0D));
/* 101 */     this.goalSelector.addGoal(4, (Goal)new AvoidEntityGoal((PathfinderMob)this, Player.class, 16.0F, 1.0D, 1.25D));
/* 102 */     this.goalSelector.addGoal(5, (Goal)new FollowMobGoal((Mob)this, 0.800000011920929D, 10.0F, 5.0F));
/* 103 */     this.goalSelector.addGoal(6, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.6D));
/* 104 */     this.targetSelector.addGoal(7, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).setAlertOthers(new Class[0]));
/* 105 */     this.goalSelector.addGoal(8, (Goal)new RemoveBlockGoal(Blocks.CHEST, (PathfinderMob)this, 1.0D, 3));
/* 106 */     this.goalSelector.addGoal(9, (Goal)new RemoveBlockGoal((Block)LatexModBlocks.BOX.get(), (PathfinderMob)this, 1.0D, 3));
/* 107 */     this.goalSelector.addGoal(10, (Goal)new RemoveBlockGoal((Block)LatexModBlocks.BOX_INVENTORY.get(), (PathfinderMob)this, 1.0D, 3));
/* 108 */     this.goalSelector.addGoal(11, (Goal)new RestrictSunGoal((PathfinderMob)this));
/* 109 */     this.goalSelector.addGoal(12, (Goal)new MoveBackToVillageGoal((PathfinderMob)this, 0.6D, false));
/* 110 */     this.goalSelector.addGoal(13, (Goal)new EatBlockGoal((Mob)this));
/* 111 */     this.goalSelector.addGoal(14, (Goal)new RandomLookAroundGoal((Mob)this));
/* 112 */     this.goalSelector.addGoal(15, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType getMobType() {
/* 117 */     return MobType.UNDEFINED;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean removeWhenFarAway(double distanceToClosestPlayer) {
/* 122 */     return false;
/*     */   }
/*     */   
/*     */   protected void dropCustomDeathLoot(DamageSource source, int looting, boolean recentlyHitIn) {
/* 126 */     super.dropCustomDeathLoot(source, looting, recentlyHitIn);
/* 127 */     spawnAtLocation(new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getAmbientSound() {
/* 132 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.silverfish.ambient"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getHurtSound(DamageSource ds) {
/* 137 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent getDeathSound() {
/* 142 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean hurt(DamageSource source, float amount) {
/* 147 */     if (source == DamageSource.FALL)
/* 148 */       return false; 
/* 149 */     if (source == DamageSource.WITHER)
/* 150 */       return false; 
/* 151 */     if (source.getMsgId().equals("witherSkull"))
/* 152 */       return false; 
/* 153 */     return super.hurt(source, amount);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData finalizeSpawn(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 159 */     SpawnGroupData retval = super.finalizeSpawn(world, difficulty, reason, livingdata, tag);
/* 160 */     DarklatexslugOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, getX(), getY(), getZ(), (Entity)this);
/* 161 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void baseTick() {
/* 166 */     super.baseTick();
/* 167 */     DarklatexslugOnEntityTickUpdateProcedure.execute((LevelAccessor)this.level, getX(), getY(), getZ(), (Entity)this);
/*     */   }
/*     */   
/*     */   public static void init() {
/* 171 */     SpawnPlacements.register((EntityType)LatexModEntities.DARKLATEXSLUG.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
/*     */           int x = pos.getX();
/*     */           int y = pos.getY();
/*     */           int z = pos.getZ();
/*     */           return DarklatexslugNaturalEntitySpawningConditionProcedure.execute((LevelAccessor)world);
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 181 */     AttributeSupplier.Builder builder = Mob.createMobAttributes();
/* 182 */     builder = builder.add(Attributes.MOVEMENT_SPEED, 0.35D);
/* 183 */     builder = builder.add(Attributes.MAX_HEALTH, 4.0D);
/* 184 */     builder = builder.add(Attributes.ARMOR, 0.0D);
/* 185 */     builder = builder.add(Attributes.ATTACK_DAMAGE, 1.0D);
/* 186 */     builder = builder.add(Attributes.FOLLOW_RANGE, 9.0D);
/* 187 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\entity\DarklatexslugEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */