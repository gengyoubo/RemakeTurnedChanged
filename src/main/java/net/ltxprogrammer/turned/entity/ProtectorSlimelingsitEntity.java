/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import java.util.List;
/*     */ import javax.annotation.Nullable;
/*     */ import net.ltxprogrammer.changed.entity.LatexEntity;
/*     */ import net.ltxprogrammer.changed.init.ChangedItems;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.init.LatexModItems;
/*     */ import net.ltxprogrammer.turned.procedures.HertxOnInitialEntitySpawnProcedure;
/*     */ import net.ltxprogrammer.turned.procedures.ProtectorSlimelingsitRightClickedOnEntityProcedure;
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
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.animal.Animal;
/*     */ import net.minecraft.world.entity.player.Player;
/*     */ import net.minecraft.world.item.Item;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.ServerLevelAccessor;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.event.ForgeEventFactory;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class ProtectorSlimelingsitEntity
/*     */   extends TamableAnimal {
/*     */   public ProtectorSlimelingsitEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  57 */     this((EntityType<ProtectorSlimelingsitEntity>)LatexModEntities.PROTECTOR_SLIMELINGSIT.get(), world);
/*     */   }
/*     */   
/*     */   public ProtectorSlimelingsitEntity(EntityType<ProtectorSlimelingsitEntity> type, Level world) {
/*  61 */     super(type, world);
/*  62 */     this.f_21364_ = 6;
/*  63 */     m_21557_(false);
/*  64 */     m_6593_((Component)new TextComponent("§d[Idle]"));
/*  65 */     m_20340_(true);
/*  66 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  71 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  76 */     super.m_8099_();
/*  77 */     this.f_21345_.m_25352_(1, (Goal)new MeleeAttackGoal((PathfinderMob)this, 1.2D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  80 */             return 4.0D + (entity.m_20205_() * entity.m_20205_());
/*     */           }
/*     */         });
/*  83 */     this.f_21345_.m_25352_(2, (Goal)new LookAtPlayerGoal((Mob)this, LatexEntity.class, 3.0F));
/*  84 */     this.f_21345_.m_25352_(3, (Goal)new LookAtPlayerGoal((Mob)this, PathfinderMob.class, 3.0F));
/*  85 */     this.f_21346_.m_25352_(4, (Goal)new HurtByTargetGoal((PathfinderMob)this, new Class[0]));
/*  86 */     this.f_21345_.m_25352_(5, (Goal)new RandomLookAroundGoal((Mob)this));
/*  87 */     this.f_21345_.m_25352_(6, (Goal)new FloatGoal((Mob)this));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  92 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/*  97 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/* 102 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.squish")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 107 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 112 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/* 117 */     if (source == DamageSource.f_19315_)
/* 118 */       return false; 
/* 119 */     if (source == DamageSource.f_19314_)
/* 120 */       return false; 
/* 121 */     if (source == DamageSource.f_19312_)
/* 122 */       return false; 
/* 123 */     if (source == DamageSource.f_19320_)
/* 124 */       return false; 
/* 125 */     if (source.m_19385_().equals("witherSkull"))
/* 126 */       return false; 
/* 127 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public SpawnGroupData m_6518_(ServerLevelAccessor world, DifficultyInstance difficulty, MobSpawnType reason, @Nullable SpawnGroupData livingdata, @Nullable CompoundTag tag) {
/* 133 */     SpawnGroupData retval = super.m_6518_(world, difficulty, reason, livingdata, tag);
/* 134 */     HertxOnInitialEntitySpawnProcedure.execute((LevelAccessor)world, m_20185_(), m_20186_(), m_20189_(), (Entity)this);
/* 135 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public InteractionResult m_6071_(Player sourceentity, InteractionHand hand) {
/* 140 */     ItemStack itemstack = sourceentity.m_21120_(hand);
/* 141 */     InteractionResult retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 142 */     Item item = itemstack.m_41720_();
/* 143 */     if (itemstack.m_41720_() instanceof net.minecraft.world.item.SpawnEggItem) {
/* 144 */       retval = super.m_6071_(sourceentity, hand);
/* 145 */     } else if (this.f_19853_.m_5776_()) {
/*     */ 
/*     */       
/* 148 */       retval = ((m_21824_() && m_21830_((LivingEntity)sourceentity)) || m_6898_(itemstack)) ? InteractionResult.m_19078_(this.f_19853_.m_5776_()) : InteractionResult.PASS;
/*     */     }
/* 150 */     else if (m_21824_()) {
/* 151 */       if (m_21830_((LivingEntity)sourceentity)) {
/* 152 */         if (item.m_41472_() && m_6898_(itemstack) && m_21223_() < m_21233_()) {
/* 153 */           m_142075_(sourceentity, hand, itemstack);
/* 154 */           m_5634_(item.m_41473_().m_38744_());
/* 155 */           retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/* 156 */         } else if (m_6898_(itemstack) && m_21223_() < m_21233_()) {
/* 157 */           m_142075_(sourceentity, hand, itemstack);
/* 158 */           m_5634_(4.0F);
/* 159 */           retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/*     */         } else {
/* 161 */           retval = super.m_6071_(sourceentity, hand);
/*     */         } 
/*     */       }
/* 164 */     } else if (m_6898_(itemstack)) {
/* 165 */       m_142075_(sourceentity, hand, itemstack);
/* 166 */       if (this.f_19796_.nextInt(3) == 0 && !ForgeEventFactory.onAnimalTame((Animal)this, sourceentity)) {
/* 167 */         m_21828_(sourceentity);
/* 168 */         this.f_19853_.m_7605_((Entity)this, (byte)7);
/*     */       } else {
/* 170 */         this.f_19853_.m_7605_((Entity)this, (byte)6);
/*     */       } 
/* 172 */       m_21530_();
/* 173 */       retval = InteractionResult.m_19078_(this.f_19853_.m_5776_());
/*     */     } else {
/* 175 */       retval = super.m_6071_(sourceentity, hand);
/* 176 */       if (retval == InteractionResult.SUCCESS || retval == InteractionResult.CONSUME) {
/* 177 */         m_21530_();
/*     */       }
/*     */     } 
/* 180 */     double x = m_20185_();
/* 181 */     double y = m_20186_();
/* 182 */     double z = m_20189_();
/* 183 */     ProtectorSlimelingsitEntity protectorSlimelingsitEntity = this;
/* 184 */     Level world = this.f_19853_;
/*     */     
/* 186 */     ProtectorSlimelingsitRightClickedOnEntityProcedure.execute((LevelAccessor)world, x, y, z, (Entity)protectorSlimelingsitEntity, (Entity)sourceentity);
/* 187 */     return retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public AgeableMob m_142606_(ServerLevel serverWorld, AgeableMob ageable) {
/* 192 */     ProtectorSlimelingsitEntity retval = (ProtectorSlimelingsitEntity)((EntityType)LatexModEntities.PROTECTOR_SLIMELINGSIT.get()).m_20615_((Level)serverWorld);
/* 193 */     retval.m_6518_((ServerLevelAccessor)serverWorld, serverWorld.m_6436_(retval.m_142538_()), MobSpawnType.BREEDING, (SpawnGroupData)null, (CompoundTag)null);
/* 194 */     return (AgeableMob)retval;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6898_(ItemStack stack) {
/* 199 */     return List.<Item>of((Item)ChangedItems.DARK_LATEX_GOO.get(), (Item)LatexModItems.LATEX_SOUP.get()).contains(stack.m_41720_());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 206 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 207 */     builder = builder.m_22268_(Attributes.f_22279_, 0.0D);
/* 208 */     builder = builder.m_22268_(Attributes.f_22276_, 50.0D);
/* 209 */     builder = builder.m_22268_(Attributes.f_22284_, 5.5D);
/* 210 */     builder = builder.m_22268_(Attributes.f_22281_, 0.0D);
/* 211 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 212 */     builder = builder.m_22268_(Attributes.f_22278_, 0.6D);
/* 213 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\ProtectorSlimelingsitEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */