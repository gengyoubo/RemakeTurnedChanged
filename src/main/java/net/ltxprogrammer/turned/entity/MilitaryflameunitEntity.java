/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import net.ltxprogrammer.changed.block.AbstractLatexBlock;
/*     */ import net.ltxprogrammer.changed.entity.LatexType;
/*     */ import net.ltxprogrammer.changed.init.ChangedBlocks;
/*     */ import net.ltxprogrammer.turned.entity.ai.RevertBlockStateGoal;
/*     */ import net.ltxprogrammer.turned.entity.ai.TargetCheck;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.init.LatexModItems;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.EquipmentSlot;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.goal.FloatGoal;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.MeleeAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.OpenDoorGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomLookAroundGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RandomStrollGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RangedAttackGoal;
/*     */ import net.minecraft.world.entity.ai.goal.RemoveBlockGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.HurtByTargetGoal;
/*     */ import net.minecraft.world.entity.ai.goal.target.NearestAttackableTargetGoal;
/*     */ import net.minecraft.world.entity.monster.Illusioner;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.entity.monster.Pillager;
/*     */ import net.minecraft.world.entity.monster.RangedAttackMob;
/*     */ import net.minecraft.world.entity.monster.SpellcasterIllager;
/*     */ import net.minecraft.world.entity.monster.Vindicator;
/*     */ import net.minecraft.world.entity.monster.piglin.Piglin;
/*     */ import net.minecraft.world.entity.monster.piglin.PiglinBrute;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.state.properties.Property;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ public class MilitaryflameunitEntity
/*     */   extends PathfinderMob implements RangedAttackMob {
/*     */   public MilitaryflameunitEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  53 */     this((EntityType<MilitaryflameunitEntity>)LatexModEntities.MILITARYFLAMEUNIT.get(), world);
/*     */   }
/*     */   
/*     */   public MilitaryflameunitEntity(EntityType<MilitaryflameunitEntity> type, Level world) {
/*  57 */     super(type, world);
/*  58 */     this.f_21364_ = 0;
/*  59 */     m_21557_(false);
/*  60 */     m_21530_();
/*  61 */     m_8061_(EquipmentSlot.MAINHAND, new ItemStack((ItemLike)LatexModItems.FLAMETHOWER.get()));
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  66 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  71 */     super.m_8099_();
/*  72 */     this.f_21346_.m_25352_(1, (Goal)new NearestAttackableTargetGoal((Mob)this, PathfinderMob.class, 10, true, false, TargetCheck.IS_EVIL));
/*  73 */     this.f_21346_.m_25352_(2, (Goal)new NearestAttackableTargetGoal((Mob)this, LivingEntity.class, 10, true, false, TargetCheck.IS_LATEX));
/*  74 */     this.f_21346_.m_25352_(3, (Goal)new NearestAttackableTargetGoal((Mob)this, EvilMilitaryEntity.class, true, false));
/*  75 */     this.f_21346_.m_25352_(4, (Goal)new NearestAttackableTargetGoal((Mob)this, EvilSniperEntity.class, true, false));
/*  76 */     this.f_21346_.m_25352_(5, (Goal)new NearestAttackableTargetGoal((Mob)this, PrisionermilitiaEntity.class, true, false));
/*  77 */     this.f_21346_.m_25352_(6, (Goal)new NearestAttackableTargetGoal((Mob)this, PrisionerMilitiaMeleeEntity.class, true, false));
/*  78 */     this.f_21346_.m_25352_(7, (Goal)new NearestAttackableTargetGoal((Mob)this, Illusioner.class, true, false));
/*  79 */     this.f_21346_.m_25352_(8, (Goal)new NearestAttackableTargetGoal((Mob)this, Pillager.class, true, false));
/*  80 */     this.f_21346_.m_25352_(9, (Goal)new NearestAttackableTargetGoal((Mob)this, SpellcasterIllager.class, true, false));
/*  81 */     this.f_21346_.m_25352_(10, (Goal)new NearestAttackableTargetGoal((Mob)this, Vindicator.class, true, false));
/*  82 */     this.f_21346_.m_25352_(11, (Goal)new NearestAttackableTargetGoal((Mob)this, Piglin.class, true, false));
/*  83 */     this.f_21346_.m_25352_(12, (Goal)new NearestAttackableTargetGoal((Mob)this, PiglinBrute.class, true, false));
/*  84 */     this.f_21346_.m_25352_(13, (Goal)new NearestAttackableTargetGoal((Mob)this, Monster.class, true, false));
/*  85 */     this.f_21345_.m_25352_(14, (Goal)new MeleeAttackGoal(this, 1.0D, false)
/*     */         {
/*     */           protected double m_6639_(LivingEntity entity) {
/*  88 */             return 4.0D + (entity.m_20205_() * entity.m_20205_());
/*     */           }
/*     */         });
/*  91 */     this.f_21345_.m_25352_(15, (Goal)new RandomStrollGoal(this, 0.6D));
/*  92 */     this.f_21345_.m_25352_(16, (Goal)new OpenDoorGoal((Mob)this, true));
/*  93 */     this.f_21345_.m_25352_(17, (Goal)new OpenDoorGoal((Mob)this, false));
/*  94 */     this.f_21345_.m_25352_(18, (Goal)new RemoveBlockGoal((Block)ChangedBlocks.DARK_LATEX_BLOCK.get(), this, 1.0D, 3));
/*  95 */     this.f_21345_.m_25352_(18, (Goal)new RevertBlockStateGoal((Property)AbstractLatexBlock.COVERED, (Comparable)LatexType.DARK_LATEX, (Comparable)LatexType.NEUTRAL, this, 1.0D, 3));
/*  96 */     this.f_21345_.m_25352_(18, (Goal)new RevertBlockStateGoal((Property)AbstractLatexBlock.COVERED, (Comparable)LatexType.WHITE_LATEX, (Comparable)LatexType.NEUTRAL, this, 1.0D, 3));
/*  97 */     this.f_21345_.m_25352_(20, (Goal)new RemoveBlockGoal((Block)ChangedBlocks.LATEX_CRYSTAL.get(), this, 1.0D, 3));
/*  98 */     this.f_21346_.m_25352_(21, (Goal)(new HurtByTargetGoal(this, new Class[0])).m_26044_(new Class[0]));
/*  99 */     this.f_21345_.m_25352_(22, (Goal)new RandomLookAroundGoal((Mob)this));
/* 100 */     this.f_21345_.m_25352_(23, (Goal)new FloatGoal((Mob)this));
/* 101 */     this.f_21345_.m_25352_(1, (Goal)new RangedAttackGoal(this, 1.25D, 20, 10.0F)
/*     */         {
/*     */           public boolean m_8045_() {
/* 104 */             return m_8036_();
/*     */           }
/*     */         });
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/* 111 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/* 116 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/* 121 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/* 126 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.death"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/* 131 */     if (source.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 132 */       return false; 
/* 133 */     if (source == DamageSource.f_19323_)
/* 134 */       return false; 
/* 135 */     if (source == DamageSource.f_19320_)
/* 136 */       return false; 
/* 137 */     if (source.m_19385_().equals("witherSkull"))
/* 138 */       return false; 
/* 139 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6504_(LivingEntity target, float flval) {
/* 144 */     FlamethowerEntity.shoot((LivingEntity)this, target);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 151 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 152 */     builder = builder.m_22268_(Attributes.f_22279_, 0.25D);
/* 153 */     builder = builder.m_22268_(Attributes.f_22276_, 20.0D);
/* 154 */     builder = builder.m_22268_(Attributes.f_22284_, 0.0D);
/* 155 */     builder = builder.m_22268_(Attributes.f_22281_, 3.0D);
/* 156 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 157 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\MilitaryflameunitEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */