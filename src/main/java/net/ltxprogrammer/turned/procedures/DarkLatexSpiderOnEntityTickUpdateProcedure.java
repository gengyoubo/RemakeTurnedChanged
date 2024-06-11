/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.ltxprogrammer.turned.init.LatexModBlocks;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.effect.MobEffects;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class DarkLatexSpiderOnEntityTickUpdateProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 14 */     if (entity == null)
/*    */       return; 
/* 16 */     if (((world.m_8055_(new BlockPos(x, y, z + 1.0D)).m_60734_() == Blocks.f_50626_ || world
/* 17 */       .m_8055_(new BlockPos(x, y, z + 1.0D)).m_60734_() == Blocks.f_50627_ || world
/* 18 */       .m_8055_(new BlockPos(x, y, z + 1.0D)).m_60734_() == Blocks.f_50033_ || world
/* 19 */       .m_8055_(new BlockPos(x, y, z + 1.0D)).m_60734_() == LatexModBlocks.DARKLATEXPUDDLEHARMLESS.get() || world
/* 20 */       .m_8055_(new BlockPos(x, y, z + 1.0D)).m_60734_() == Blocks.f_50016_) ? true : false) == true && ((world
/* 21 */       .m_8055_(new BlockPos(x, y, z - 1.0D)).m_60734_() == Blocks.f_50626_ || world
/* 22 */       .m_8055_(new BlockPos(x, y, z - 1.0D)).m_60734_() == Blocks.f_50627_ || world
/* 23 */       .m_8055_(new BlockPos(x, y, z - 1.0D)).m_60734_() == Blocks.f_50033_ || world
/* 24 */       .m_8055_(new BlockPos(x, y, z - 1.0D)).m_60734_() == LatexModBlocks.DARKLATEXPUDDLEHARMLESS.get() || world
/* 25 */       .m_8055_(new BlockPos(x, y, z - 1.0D)).m_60734_() == Blocks.f_50016_) ? true : false) == true) if (((world
/* 26 */         .m_8055_(new BlockPos(x + 1.0D, y, z)).m_60734_() == Blocks.f_50626_ || world
/* 27 */         .m_8055_(new BlockPos(x + 1.0D, y, z)).m_60734_() == Blocks.f_50627_ || world
/* 28 */         .m_8055_(new BlockPos(x + 1.0D, y, z)).m_60734_() == Blocks.f_50033_ || world
/* 29 */         .m_8055_(new BlockPos(x + 1.0D, y, z)).m_60734_() == LatexModBlocks.DARKLATEXPUDDLEHARMLESS.get() || world
/* 30 */         .m_8055_(new BlockPos(x + 1.0D, y, z)).m_60734_() == Blocks.f_50016_) ? true : false) == true) { if (((world
/* 31 */           .m_8055_(new BlockPos(x - 1.0D, y, z)).m_60734_() == Blocks.f_50626_ || world
/* 32 */           .m_8055_(new BlockPos(x - 1.0D, y, z)).m_60734_() == Blocks.f_50627_ || world
/* 33 */           .m_8055_(new BlockPos(x - 1.0D, y, z)).m_60734_() == Blocks.f_50033_ || world
/* 34 */           .m_8055_(new BlockPos(x - 1.0D, y, z)).m_60734_() == LatexModBlocks.DARKLATEXPUDDLEHARMLESS.get() || world
/* 35 */           .m_8055_(new BlockPos(x - 1.0D, y, z)).m_60734_() == Blocks.f_50016_) ? true : false) != true)
/* 36 */         { if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 37 */             _entity.m_7292_(new MobEffectInstance(MobEffects.f_19620_, 5, 2, false, false)); }  return; }  return; }   if (entity instanceof LivingEntity) { LivingEntity livingEntity = (LivingEntity)entity; livingEntity.m_7292_(new MobEffectInstance(MobEffects.f_19620_, 5, 2, false, false)); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DarkLatexSpiderOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */