/*     */ package net.ltxprogrammer.turned.entity;
/*     */ import java.util.Random;
/*     */ import java.util.Set;
/*     */ import javax.annotation.Nullable;
/*     */ import net.ltxprogrammer.changed.entity.beast.AbstractDarkLatexEntity;
/*     */ import net.ltxprogrammer.changed.init.ChangedItems;
/*     */ import net.ltxprogrammer.changed.init.ChangedParticles;
/*     */ import net.ltxprogrammer.turned.init.LatexModBlocks;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.procedures.DarklatexslugNaturalEntitySpawningConditionProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.DarklatexslugOnEntityTickUpdateProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.DarklatexslugOnInitialEntitySpawnProcedure;
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
/*     */ public class DarklatexslugEntity extends AbstractDarkLatexEntity {
/*  63 */   private static final Set<ResourceLocation> SPAWN_BIOMES = Set.of(new ResourceLocation[] { new ResourceLocation("savanna_plateau"), new ResourceLocation("forest"), new ResourceLocation("sunflower_plains"), new ResourceLocation("taiga"), new ResourceLocation("flower_forest"), new ResourceLocation("swamp"), new ResourceLocation("eroded_badlands"), new ResourceLocation("windswept_hills"), new ResourceLocation("changed:dark_latex_plains"), new ResourceLocation("plains"), new ResourceLocation("savanna"), new ResourceLocation("windswept_savanna"), new ResourceLocation("the_void"), new ResourceLocation("jungle"), new ResourceLocation("windswept_gravelly_hills"), new ResourceLocation("desert") });
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @SubscribeEvent
/*     */   public static void addLivingEntityToBiomes(BiomeLoadingEvent event) {
/*  72 */     if (SPAWN_BIOMES.contains(event.getName()))
/*  73 */       event.getSpawns().getSpawner(MobCategory.MONSTER).add(new MobSpawnSettings.SpawnerData((EntityType)LatexModEntities.DARKLATEXSLUG.get(), 5, 1, 3)); 
/*     */   }
/*     */   
/*     */   public DarklatexslugEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  77 */     this((EntityType<DarklatexslugEntity>)LatexModEntities.DARKLATEXSLUG.get(), world);
/*     */   }
/*     */   
/*     */   public DarklatexslugEntity(EntityType<DarklatexslugEntity> type, Level world) {
/*  81 */     super(type, world);
/*  82 */     this.f_21364_ = 1;
/*  83 */     m_21557_(false);
/*  84 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  89 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  94 */     super.m_8099_();
/*  95 */     this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  98 */             return 4.0D + (entity.m_20205_() * entity.m_20205_());
/*     */           }
/*     */         });
/* 101 */     this.f_21345_.m_25352_(2, (Goal)new AvoidEntityGoal((PathfinderMob)this, Monster.class, 16.0F, 1.0D, 1.2D));
/* 102 */     this.f_21345_.m_25352_(3, (Goal)new AvoidEntityGoal((PathfinderMob)this, PathfinderMob.class, 12.0F, 1.0D, 1.0D));
/* 103 */     this.f_21345_.m_25352_(4, (Goal)new AvoidEntityGoal((PathfinderMob)this, Player.class, 16.0F, 1.0D, 1.25D));
/* 104 */     this.f_21345_.m_25352_(5, (Goal)new FollowMobGoal((Mob)this, 0.800000011920929D, 10.0F, 5.0F));
/* 105 */     this.f_21345_.m_25352_(6, (Goal)new RandomStrollGoal((PathfinderMob)this, 0.6D));
/* 106 */     this.f_21346_.m_25352_(7, (Goal)(new HurtByTargetGoal((PathfinderMob)this, new Class[0])).m_26044_(new Class[0]));
/* 107 */     this.f_21345_.m_25352_(8, (Goal)new RemoveBlockGoal(Blocks.f_50087_, (PathfinderMob)this, 1.0D, 3));
/* 108 */     this.f_21345_.m_25352_(9, (Goal)new RemoveBlockGoal((Block)LatexModBlocks.BOX.get(), (PathfinderMob)this, 1.0D, 3));
/* 109 */     this.f_21345_.m_25352_(10, (Goal)new RemoveBlockGoal((Block)LatexModBlocks.BOX_INVENTORY.get(), (PathfinderMob)this, 1.0D, 3));
/* 110 */     this.f_21345_.m_25352_(11, (Goal)new RestrictSunGoal((PathfinderMob)this));
/* 111 */     this.f_21345_.m_25352_(12, (Goal)new MoveBackToVillageGoal((PathfinderMob)this, 0.6D, false));
/* 112 */     this.f_21345_.m_25352_(13, (Goal)new EatBlockGoal((Mob)this));
/* 113 */     this.f_21345_.m_25352_(14, (Goal)new RandomLookAroundGoal((Mob)this));
/* 114 */     this.f_21345_.m_25352_(15, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/* 119 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/* 124 */     return false;
/*     */   }
/*     */   
/*     */   protected void m_7472_(DamageSource source, int looting, boolean recentlyHitIn) {
/* 128 */     super.m_7472_(source, looting, recentlyHitIn);
/* 129 */     m_19983_(new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7515_() {
/* 134 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.silverfish.ambient"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 139 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 144 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/* 149 */     if (source == DamageSource.f_19315_)
/* 150 */       return false; 
/* 151 */     if (source == DamageSource.f_19320_)
/* 152 */       return false; 
/* 153 */     if (source.m_19385_().equals("witherSkull"))
/* 154 */       return false; 
/* 155 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 161 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 162 */     DarklatexslugOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/* 163 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6075_() {
/* 168 */     super.m_6075_();
/* 169 */     DarklatexslugOnEntityTickUpdateProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/*     */   }
/*     */   
/*     */   public static void init() {
/* 173 */     SpawnPlacements.m_21754_((EntityType)LatexModEntities.DARKLATEXSLUG.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, (entityType, world, reason, pos, random) -> {
/*     */           int x = pos.m_123341_();
/*     */           int y = pos.m_123342_();
/*     */           int z = pos.m_123343_();
/*     */           return DarklatexslugNaturalEntitySpawningConditionProcedure.execute((LevelAccessor)world);
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 183 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 184 */     builder = builder.m_22268_(Attributes.f_22279_, 0.35D);
/* 185 */     builder = builder.m_22268_(Attributes.f_22276_, 4.0D);
/* 186 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 187 */     builder = builder.m_22268_(Attributes.f_22281_, 1.0D);
/* 188 */     builder = builder.m_22268_(Attributes.f_22277_, 9.0D);
/* 189 */     return builder;
/*     */   }
/*     */ 
/*     */   
/*     */   public ChangedParticles.Color3 getDripColor() {
/* 194 */     return ChangedParticles.Color3.DARK;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\DarklatexslugEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */