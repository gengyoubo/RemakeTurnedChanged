/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import javax.annotation.Nullable;
/*     */ import net.ltxprogrammer.turned.entity.ai.TargetCheck;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.init.LatexModItems;
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
/*     */ import net.minecraft.world.entity.ai.goal.TemptGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.crafting.Ingredient;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class ScientistEntity
/*     */   extends PathfinderMob
/*     */ {
/*     */   public ScientistEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  50 */     this((EntityType<ScientistEntity>)LatexModEntities.SCIENTIST.get(), world);
/*     */   }
/*     */   
/*     */   public ScientistEntity(EntityType<ScientistEntity> type, Level world) {
/*  54 */     super(type, world);
/*  55 */     this.f_21364_ = 0;
/*  56 */     m_21557_(false);
/*  57 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  62 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  67 */     super.m_8099_();
/*  68 */     this.f_21345_.m_25352_(1, (Goal)new OpenDoorGoal((Mob)this, true));
/*  69 */     this.f_21346_.m_25352_(2, (Goal)(new HurtByTargetGoal(this, new Class[0])).m_26044_(new Class[0]));
/*  70 */     this.f_21345_.m_25352_(3, (Goal)new PanicGoal(this, 1.2D));
/*  71 */     this.f_21345_.m_25352_(4, (Goal)new AvoidEntityGoal(this, Monster.class, 8.0F, 1.6D, 0.9D));
/*  72 */     this.f_21345_.m_25352_(5, (Goal)new AvoidEntityGoal(this, PathfinderMob.class, 6.0F, 1.2D, 0.9D, TargetCheck.IS_GOOD));
/*  73 */     this.f_21345_.m_25352_(6, (Goal)new MoveBackToVillageGoal(this, 0.6D, false));
/*  74 */     this.f_21345_.m_25352_(7, (Goal)new TemptGoal(this, 1.0D, Ingredient.m_43929_(new ItemLike[] { (ItemLike)LatexModItems.TABLET.get() }, ), false));
/*  75 */     this.f_21345_.m_25352_(8, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 6.0F));
/*  76 */     this.f_21345_.m_25352_(9, (Goal)new LookAtPlayerGoal((Mob)this, PathfinderMob.class, 8.0F));
/*  77 */     this.f_21345_.m_25352_(10, (Goal)new LookAtPlayerGoal((Mob)this, Monster.class, 9.0F));
/*  78 */     this.f_21345_.m_25352_(11, (Goal)new RandomStrollGoal(this, 1.0D));
/*  79 */     this.f_21345_.m_25352_(12, (Goal)new OpenDoorGoal((Mob)this, false));
/*  80 */     this.f_21345_.m_25352_(13, (Goal)new RandomLookAroundGoal((Mob)this));
/*  81 */     this.f_21345_.m_25352_(14, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  86 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/*  91 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/*  96 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.ambient")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 101 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 106 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.villager.death"));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 112 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 113 */     ScientistOnInitialEntitySpawnProcedure.execute((Entity)this);
/* 114 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 121 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 122 */     builder = builder.m_22268_(Attributes.f_22279_, 0.25D);
/* 123 */     builder = builder.m_22268_(Attributes.f_22276_, 20.0D);
/* 124 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 125 */     builder = builder.m_22268_(Attributes.f_22281_, 3.0D);
/* 126 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 127 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\ScientistEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */