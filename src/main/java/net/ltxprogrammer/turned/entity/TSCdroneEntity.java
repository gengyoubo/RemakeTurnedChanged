/*     */ package net.ltxprogrammer.turned.entity;
/*     */ 
/*     */ import net.ltxprogrammer.changed.init.ChangedBlocks;
/*     */ import net.ltxprogrammer.turned.init.LatexModBlocks;
/*     */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*     */ import net.ltxprogrammer.turned.procedures.TSCdroneEntityDiesProcedure;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.network.protocol.Packet;
/*     */ import net.minecraft.resources.ResourceLocation;
/*     */ import net.minecraft.sounds.SoundEvent;
/*     */ import net.minecraft.world.damagesource.DamageSource;
/*     */ import net.minecraft.world.entity.Entity;
/*     */ import net.minecraft.world.entity.EntityType;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.MobType;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
/*     */ import net.minecraft.world.entity.ai.attributes.Attributes;
/*     */ import net.minecraft.world.entity.ai.goal.Goal;
/*     */ import net.minecraft.world.entity.ai.goal.RemoveBlockGoal;
/*     */ import net.minecraft.world.entity.monster.Monster;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.block.Block;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraftforge.network.NetworkHooks;
/*     */ import net.minecraftforge.network.PlayMessages;
/*     */ import net.minecraftforge.registries.ForgeRegistries;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class TSCdroneEntity
/*     */   extends Monster
/*     */ {
/*     */   public TSCdroneEntity(PlayMessages.SpawnEntity packet, Level world) {
/*  48 */     this((EntityType<TSCdroneEntity>)LatexModEntities.TS_CDRONE.get(), world);
/*     */   }
/*     */   
/*     */   public TSCdroneEntity(EntityType<TSCdroneEntity> type, Level world) {
/*  52 */     super(type, world);
/*  53 */     this.f_21364_ = 0;
/*  54 */     m_21557_(false);
/*  55 */     m_21530_();
/*     */   }
/*     */ 
/*     */   
/*     */   public Packet<?> m_5654_() {
/*  60 */     return NetworkHooks.getEntitySpawningPacket((Entity)this);
/*     */   }
/*     */ 
/*     */   
/*     */   protected void m_8099_() {
/*  65 */     super.m_8099_();
/*  66 */     this.f_21345_.m_25352_(13, (Goal)new RemoveBlockGoal((Block)ChangedBlocks.DARK_LATEX_ICE.get(), (PathfinderMob)this, 1.0D, 3));
/*  67 */     this.f_21345_.m_25352_(14, (Goal)new RemoveBlockGoal((Block)ChangedBlocks.LATEX_CRYSTAL.get(), (PathfinderMob)this, 1.0D, 3));
/*  68 */     this.f_21345_.m_25352_(15, (Goal)new RemoveBlockGoal((Block)ChangedBlocks.DARK_LATEX_BLOCK.get(), (PathfinderMob)this, 1.0D, 3));
/*  69 */     this.f_21345_.m_25352_(20, (Goal)new RemoveBlockGoal((Block)LatexModBlocks.DARKLATEXHIVE.get(), (PathfinderMob)this, 1.0D, 3));
/*     */   }
/*     */ 
/*     */   
/*     */   public MobType m_6336_() {
/*  74 */     return MobType.f_21640_;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6785_(double distanceToClosestPlayer) {
/*  79 */     return false;
/*     */   }
/*     */   
/*     */   protected void m_7472_(DamageSource source, int looting, boolean recentlyHitIn) {
/*  83 */     super.m_7472_(source, looting, recentlyHitIn);
/*  84 */     m_19983_(new ItemStack((ItemLike)Items.f_42416_));
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_7355_(BlockPos pos, BlockState blockIn) {
/*  89 */     m_5496_((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.metal.step")), 0.15F, 1.0F);
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_7975_(DamageSource ds) {
/*  94 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.generic.hurt"));
/*     */   }
/*     */ 
/*     */   
/*     */   public SoundEvent m_5592_() {
/*  99 */     return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:death_beep"));
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean m_6469_(DamageSource source, float amount) {
/* 104 */     if (source.m_7640_() instanceof net.minecraft.world.entity.projectile.ThrownPotion || source.m_7640_() instanceof net.minecraft.world.entity.AreaEffectCloud)
/* 105 */       return false; 
/* 106 */     if (source == DamageSource.f_19312_)
/* 107 */       return false; 
/* 108 */     if (source == DamageSource.f_19323_)
/* 109 */       return false; 
/* 110 */     if (source == DamageSource.f_19320_)
/* 111 */       return false; 
/* 112 */     if (source.m_19385_().equals("witherSkull"))
/* 113 */       return false; 
/* 114 */     return super.m_6469_(source, amount);
/*     */   }
/*     */ 
/*     */   
/*     */   public void m_6667_(DamageSource source) {
/* 119 */     super.m_6667_(source);
/* 120 */     TSCdroneEntityDiesProcedure.execute((LevelAccessor)this.f_19853_, m_20185_(), m_20186_(), m_20189_());
/*     */   }
/*     */ 
/*     */   
/*     */   public static void init() {}
/*     */   
/*     */   public static AttributeSupplier.Builder createAttributes() {
/* 127 */     AttributeSupplier.Builder builder = Mob.m_21552_();
/* 128 */     builder = builder.m_22268_(Attributes.f_22279_, 0.31D);
/* 129 */     builder = builder.m_22268_(Attributes.f_22276_, 25.0D);
/* 130 */     builder = builder.m_22268_(Attributes.f_22284_, 2.5D);
/* 131 */     builder = builder.m_22268_(Attributes.f_22281_, 2.0D);
/* 132 */     builder = builder.m_22268_(Attributes.f_22277_, 16.0D);
/* 133 */     builder = builder.m_22268_(Attributes.f_22278_, 0.5D);
/* 134 */     return builder;
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\TSCdroneEntity.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */