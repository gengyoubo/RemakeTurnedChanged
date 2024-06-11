/*     */ package net.ltxprogrammer.turned.entity.ai;
/*     */ import java.util.Random;
/*     */ import javax.annotation.Nullable;
/*     */ import net.minecraft.core.BlockPos;
/*     */ import net.minecraft.core.SectionPos;
/*     */ import net.minecraft.core.particles.ItemParticleOption;
/*     */ import net.minecraft.core.particles.ParticleOptions;
/*     */ import net.minecraft.core.particles.ParticleTypes;
/*     */ import net.minecraft.server.level.ServerLevel;
/*     */ import net.minecraft.world.entity.LivingEntity;
/*     */ import net.minecraft.world.entity.Mob;
/*     */ import net.minecraft.world.entity.PathfinderMob;
/*     */ import net.minecraft.world.entity.ai.goal.MoveToBlockGoal;
/*     */ import net.minecraft.world.item.ItemStack;
/*     */ import net.minecraft.world.item.Items;
/*     */ import net.minecraft.world.level.BlockGetter;
/*     */ import net.minecraft.world.level.ItemLike;
/*     */ import net.minecraft.world.level.Level;
/*     */ import net.minecraft.world.level.LevelAccessor;
/*     */ import net.minecraft.world.level.LevelReader;
/*     */ import net.minecraft.world.level.block.state.BlockState;
/*     */ import net.minecraft.world.level.block.state.properties.Property;
/*     */ import net.minecraft.world.level.chunk.ChunkAccess;
/*     */ import net.minecraft.world.level.chunk.ChunkStatus;
/*     */ import net.minecraft.world.phys.Vec3;
/*     */ import net.minecraftforge.common.ForgeHooks;
/*     */ 
/*     */ public class RevertBlockStateGoal<T extends Comparable<T>> extends MoveToBlockGoal {
/*     */   private final Property<T> property;
/*     */   private final T targetValue;
/*     */   private final T goalValue;
/*     */   
/*     */   public RevertBlockStateGoal(Property<T> property, T from, T to, PathfinderMob p_25841_, double p_25842_, int p_25843_) {
/*  34 */     super(p_25841_, p_25842_, 24, p_25843_);
/*  35 */     this.property = property;
/*  36 */     this.targetValue = from;
/*  37 */     this.goalValue = to;
/*  38 */     this.removerMob = (Mob)p_25841_;
/*     */   }
/*     */   private final Mob removerMob; private int ticksSinceReachedGoal; private static final int WAIT_AFTER_BLOCK_FOUND = 20;
/*     */   public boolean m_8036_() {
/*  42 */     if (!ForgeHooks.canEntityDestroy(this.removerMob.f_19853_, this.f_25602_, (LivingEntity)this.removerMob))
/*  43 */       return false; 
/*  44 */     if (this.f_25600_ > 0) {
/*  45 */       this.f_25600_--;
/*  46 */       return false;
/*  47 */     }  if (tryFindBlock()) {
/*  48 */       this.f_25600_ = m_186073_(20);
/*  49 */       return true;
/*     */     } 
/*  51 */     this.f_25600_ = m_6099_(this.f_25598_);
/*  52 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   private boolean tryFindBlock() {
/*  57 */     return (this.f_25602_ != null && m_6465_((LevelReader)this.f_25598_.f_19853_, this.f_25602_)) ? true : m_25626_();
/*     */   }
/*     */   
/*     */   public void m_8041_() {
/*  61 */     super.m_8041_();
/*  62 */     this.removerMob.f_19789_ = 1.0F;
/*     */   }
/*     */   
/*     */   public void m_8056_() {
/*  66 */     super.m_8056_();
/*  67 */     this.ticksSinceReachedGoal = 0;
/*     */   }
/*     */ 
/*     */   
/*     */   public void playDestroyProgressSound(LevelAccessor p_25847_, BlockPos p_25848_) {}
/*     */ 
/*     */   
/*     */   public void playBreakSound(Level p_25845_, BlockPos p_25846_) {}
/*     */   
/*     */   public void m_8037_() {
/*  77 */     super.m_8037_();
/*  78 */     Level level = this.removerMob.f_19853_;
/*  79 */     BlockPos blockpos = this.removerMob.m_142538_();
/*  80 */     BlockPos blockpos1 = getPosWithBlock(blockpos, (BlockGetter)level);
/*  81 */     Random random = this.removerMob.m_21187_();
/*  82 */     if (m_25625_() && blockpos1 != null) {
/*  83 */       if (this.ticksSinceReachedGoal > 0) {
/*  84 */         Vec3 vec3 = this.removerMob.m_20184_();
/*  85 */         this.removerMob.m_20334_(vec3.f_82479_, 0.3D, vec3.f_82481_);
/*  86 */         if (!level.f_46443_) {
/*  87 */           double d0 = 0.08D;
/*  88 */           ((ServerLevel)level).m_8767_((ParticleOptions)new ItemParticleOption(ParticleTypes.f_123752_, new ItemStack((ItemLike)Items.f_42521_)), blockpos1.m_123341_() + 0.5D, blockpos1.m_123342_() + 0.7D, blockpos1.m_123343_() + 0.5D, 3, (random.nextFloat() - 0.5D) * 0.08D, (random.nextFloat() - 0.5D) * 0.08D, (random.nextFloat() - 0.5D) * 0.08D, 0.15000000596046448D);
/*     */         } 
/*     */       } 
/*     */       
/*  92 */       if (this.ticksSinceReachedGoal % 2 == 0) {
/*  93 */         Vec3 vec31 = this.removerMob.m_20184_();
/*  94 */         this.removerMob.m_20334_(vec31.f_82479_, -0.3D, vec31.f_82481_);
/*  95 */         if (this.ticksSinceReachedGoal % 6 == 0) {
/*  96 */           playDestroyProgressSound((LevelAccessor)level, this.f_25602_);
/*     */         }
/*     */       } 
/*     */       
/* 100 */       if (this.ticksSinceReachedGoal > 60) {
/* 101 */         level.m_46597_(blockpos1, (BlockState)level.m_8055_(blockpos1).m_61124_(this.property, (Comparable)this.goalValue));
/* 102 */         if (!level.f_46443_) {
/* 103 */           for (int i = 0; i < 20; i++) {
/* 104 */             double d3 = random.nextGaussian() * 0.02D;
/* 105 */             double d1 = random.nextGaussian() * 0.02D;
/* 106 */             double d2 = random.nextGaussian() * 0.02D;
/* 107 */             ((ServerLevel)level).m_8767_((ParticleOptions)ParticleTypes.f_123759_, blockpos1.m_123341_() + 0.5D, blockpos1.m_123342_(), blockpos1.m_123343_() + 0.5D, 1, d3, d1, d2, 0.15000000596046448D);
/*     */           } 
/*     */           
/* 110 */           playBreakSound(level, blockpos1);
/*     */         } 
/*     */       } 
/*     */       
/* 114 */       this.ticksSinceReachedGoal++;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   private BlockPos getPosWithBlock(BlockPos p_25853_, BlockGetter p_25854_) {
/* 121 */     if (p_25854_.m_8055_(p_25853_).m_61147_().contains(this.property) && p_25854_
/* 122 */       .m_8055_(p_25853_).m_61143_(this.property).compareTo(this.targetValue) == 0) {
/* 123 */       return p_25853_;
/*     */     }
/* 125 */     BlockPos[] ablockpos = { p_25853_.m_7495_(), p_25853_.m_142125_(), p_25853_.m_142126_(), p_25853_.m_142127_(), p_25853_.m_142128_(), p_25853_.m_7495_().m_7495_() };
/*     */     
/* 127 */     for (BlockPos blockpos : ablockpos) {
/* 128 */       if (p_25854_.m_8055_(blockpos).m_61147_().contains(this.property) && p_25854_
/* 129 */         .m_8055_(blockpos).m_61143_(this.property).compareTo(this.targetValue) == 0) {
/* 130 */         return blockpos;
/*     */       }
/*     */     } 
/*     */     
/* 134 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   protected boolean m_6465_(LevelReader p_25850_, BlockPos p_25851_) {
/* 139 */     ChunkAccess chunkaccess = p_25850_.m_6522_(SectionPos.m_123171_(p_25851_.m_123341_()), SectionPos.m_123171_(p_25851_.m_123343_()), ChunkStatus.f_62326_, false);
/* 140 */     if (chunkaccess == null) {
/* 141 */       return false;
/*     */     }
/* 143 */     return (chunkaccess.m_8055_(p_25851_).m_61147_().contains(this.property) && chunkaccess.m_8055_(p_25851_).m_61143_(this.property).compareTo(this.targetValue) == 0 && chunkaccess
/* 144 */       .m_8055_(p_25851_.m_7494_()).m_60795_() && chunkaccess.m_8055_(p_25851_.m_6630_(2)).m_60795_());
/*     */   }
/*     */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\entity\ai\RevertBlockStateGoal.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */