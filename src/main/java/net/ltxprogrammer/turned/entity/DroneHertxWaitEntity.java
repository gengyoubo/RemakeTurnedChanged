/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.procedures.DroneHertxDiesProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.DroneHertxWaitEntityIsHurtProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.DroneHertxWaitRightClickedOnEntityProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.HertxOnInitialEntitySpawnProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.nbt.CompoundTag;
/*     */ import net.minecraft.network.chat.Component;
/*     */ import net.minecraft.network.chat.TextComponent;
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
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.LookAtPlayerGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.animal.Animal;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.Item;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.event.ForgeEventFactory;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class DroneHertxWaitEntity
/*     */   extends TamableAnimal
/*     */ {
/*     */   public DroneHertxWaitEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  56 */     this((EntityType<DroneHertxWaitEntity>)LatexModEntities.DRONE_HERTX_WAIT.get(), world);
/*     */   }
/*     */   
/*     */   public DroneHertxWaitEntity(EntityType<DroneHertxWaitEntity> type, Level world) {
/*  60 */     super(type, world);
/*  61 */     this.f_21364_ = 16;
/*  62 */     m_21557_(false);
/*  63 */     m_6593_((Component)new TextComponent("§6[Idle]"));
/*  64 */     m_20340_(true);
/*  65 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  70 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  75 */     super.m_8099_();
/*  76 */     this.f_21345_.m_25352_(1, (Goal)new LookAtPlayerGoal((Mob)this, Player.class, 6.0F));
/*  77 */     this.f_21345_.m_25352_(2, (Goal)new LookAtPlayerGoal((Mob)this, PathfinderMob.class, 8.0F));
/*  78 */     this.f_21345_.m_25352_(3, (Goal)new RandomLookAroundGoal((Mob)this));
/*  79 */     this.f_21345_.m_25352_(4, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  84 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/*  89 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7515_() {
/*  94 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:robot_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/*  99 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 104 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 109 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:death_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/* 114 */     DroneHertxWaitEntityIsHurtProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/* 115 */     if (source.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 116 */       return false; 
/* 117 */     if (source == DamageSource.f_19314_)
/* 118 */       return false; 
/* 119 */     if (source == DamageSource.f_19312_)
/* 120 */       return false; 
/* 121 */     if (source == DamageSource.f_19320_)
/* 122 */       return false; 
/* 123 */     if (source.m_19385_().equals("witherSkull"))
/* 124 */       return false; 
/* 125 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6667_(DamageSource source) {
/* 130 */     super.m_6667_(source);
/* 131 */     DroneHertxDiesProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_());
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 137 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 138 */     HertxOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/* 139 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult m_6071_(Player sourceentity, InteractionHand hand) {
/* 144 */     ItemStack itemstack = sourceentity.m_21120_(hand);
/* 145 */     InteractionResult retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 146 */     Item item = itemstack.m_41720_();
/* 147 */     if (itemstack.m_41720_() instanceof net.minecraft.world.item.SpawnEggItem) {
/* 148 */       retval = super.m_6071_(sourceentity, hand);
/* 149 */     } else if (this.f_19853_.m_5776_()) {
/*     */ 
/*     */       
/* 152 */       retval = ((m_21824_() && m_21830_((LivingEntity)sourceentity)) || m_6898_(itemstack)) ? InteractionResult.m_19078_(this.f_19853_.m_5776_()) : InteractionResult.PASS;
/*     */     }
/* 154 */     else if (m_21824_()) {
/* 155 */       if (m_21830_((LivingEntity)sourceentity)) {
/* 156 */         if (item.m_41472_() && m_6898_(itemstack) && m_21223_() < m_21233_()) {
/* 157 */           m_142075_(sourceentity, hand, itemstack);
/* 158 */           m_5634_(item.m_41473_().m_38744_());
/* 159 */           retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 160 */         } else if (m_6898_(itemstack) && m_21223_() < m_21233_()) {
/* 161 */           m_142075_(sourceentity, hand, itemstack);
/* 162 */           m_5634_(4.0F);
/* 163 */           retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/*     */         } else {
/* 165 */           retval = super.m_6071_(sourceentity, hand);
/*     */         } 
/*     */       }
/* 168 */     } else if (m_6898_(itemstack)) {
/* 169 */       m_142075_(sourceentity, hand, itemstack);
/* 170 */       if (this.f_19796_.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame((Animal)this, sourceentity)) {
/* 171 */         m_21828_(sourceentity);
/* 172 */         this.f_19853_.m_7605_((Entity)this, (byte)7);
/*     */       } else {
/* 174 */         this.f_19853_.m_7605_((Entity)this, (byte)6);
/*     */       } 
/* 176 */       m_21530_();
/* 177 */       retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/*     */     } else {
/* 179 */       retval = super.m_6071_(sourceentity, hand);
/* 180 */       if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
/* 181 */         m_21530_();
/*     */       }
/*     */     } 
/* 184 */     double x = m_20185_();
/* 185 */     double y = m_20186_();
/* 186 */     double z = m_20189_();
/* 187 */     DroneHertxWaitEntity droneHertxWaitEntity = this;
/* 188 */     Level world = this.f_19853_;
/*     */     
/* 190 */     DroneHertxWaitRightClickedOnEntityProcedure.execute((LevelAccessor)world, x, y, z, (Entity)droneHertxWaitEntity, (Entity)sourceentity);
/* 191 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public AgeableMob m_142606_(ServerLevel serverWorld, AgeableMob ageable) {
/* 196 */     DroneHertxWaitEntity retval = (DroneHertxWaitEntity)((EntityType)LatexModEntities.DRONE_HERTX_WAIT.get()).m_20615_((Level)serverWorld);
/* 197 */     retval.m_6518_((ServerLevelAccessor)serverWorld, serverWorld.m_6436_(retval.m_142538_()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
/* 198 */     return (AgeableMob)retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6898_(ItemStack stack) {
/* 203 */     return List.<Item>of(Items.f_42749_, Items.f_42416_).contains(stack.m_41720_());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 210 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 211 */     builder = builder.m_22268_(Attributes.f_22279_, 0.0D);
/* 212 */     builder = builder.m_22268_(Attributes.f_22276_, 40.0D);
/* 213 */     builder = builder.m_22268_(Attributes.f_22284_, 7.5D);
/* 214 */     builder = builder.m_22268_(Attributes.f_22281_, 5.0D);
/* 215 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 216 */     builder = builder.m_22268_(Attributes.f_22278_, 0.4D);
/* 217 */     builder = builder.m_22268_(Attributes.f_22282_, 0.2D);
/* 218 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\DroneHertxWaitEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */