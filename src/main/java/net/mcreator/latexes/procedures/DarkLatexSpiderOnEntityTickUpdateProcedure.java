/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModBlocks;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.effect.MobEffects;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ 
/*    */ public class DarkLatexSpiderOnEntityTickUpdateProcedure
/*    */ {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 15 */     if (entity == null)
/*    */       return; 
/* 17 */     if (((world.getBlockState(new BlockPos(x, y, z + 1.0D)).getBlock() == Blocks.VOID_AIR || world
/* 18 */       .getBlockState(new BlockPos(x, y, z + 1.0D)).getBlock() == Blocks.CAVE_AIR || world
/* 19 */       .getBlockState(new BlockPos(x, y, z + 1.0D)).getBlock() == LatexModBlocks.LATEXCOBWEBFIX.get() || world
/* 20 */       .getBlockState(new BlockPos(x, y, z + 1.0D)).getBlock() == Blocks.COBWEB || world
/* 21 */       .getBlockState(new BlockPos(x, y, z + 1.0D)).getBlock() == LatexModBlocks.DARKLATEXCARPET.get() || world
/* 22 */       .getBlockState(new BlockPos(x, y, z + 1.0D)).getBlock() == LatexModBlocks.DARKLATEXPUDDLEHARMLESS.get() || world
/* 23 */       .getBlockState(new BlockPos(x, y, z + 1.0D)).getBlock() == Blocks.AIR) ? true : false) == true && ((world
/* 24 */       .getBlockState(new BlockPos(x, y, z - 1.0D)).getBlock() == Blocks.VOID_AIR || world
/* 25 */       .getBlockState(new BlockPos(x, y, z - 1.0D)).getBlock() == Blocks.CAVE_AIR || world
/* 26 */       .getBlockState(new BlockPos(x, y, z - 1.0D)).getBlock() == LatexModBlocks.LATEXCOBWEBFIX.get() || world
/* 27 */       .getBlockState(new BlockPos(x, y, z - 1.0D)).getBlock() == Blocks.COBWEB || world
/* 28 */       .getBlockState(new BlockPos(x, y, z - 1.0D)).getBlock() == LatexModBlocks.DARKLATEXCARPET.get() || world
/* 29 */       .getBlockState(new BlockPos(x, y, z - 1.0D)).getBlock() == LatexModBlocks.DARKLATEXPUDDLEHARMLESS.get() || world
/* 30 */       .getBlockState(new BlockPos(x, y, z - 1.0D)).getBlock() == Blocks.AIR) ? true : false) == true) if (((world
/* 31 */         .getBlockState(new BlockPos(x + 1.0D, y, z)).getBlock() == Blocks.VOID_AIR || world
/* 32 */         .getBlockState(new BlockPos(x + 1.0D, y, z)).getBlock() == Blocks.CAVE_AIR || world
/* 33 */         .getBlockState(new BlockPos(x + 1.0D, y, z)).getBlock() == LatexModBlocks.LATEXCOBWEBFIX.get() || world
/* 34 */         .getBlockState(new BlockPos(x + 1.0D, y, z)).getBlock() == Blocks.COBWEB || world
/* 35 */         .getBlockState(new BlockPos(x + 1.0D, y, z)).getBlock() == LatexModBlocks.DARKLATEXCARPET.get() || world
/* 36 */         .getBlockState(new BlockPos(x + 1.0D, y, z)).getBlock() == LatexModBlocks.DARKLATEXPUDDLEHARMLESS.get() || world
/* 37 */         .getBlockState(new BlockPos(x + 1.0D, y, z)).getBlock() == Blocks.AIR) ? true : false) == true) { if (((world
/* 38 */           .getBlockState(new BlockPos(x - 1.0D, y, z)).getBlock() == Blocks.VOID_AIR || world
/* 39 */           .getBlockState(new BlockPos(x - 1.0D, y, z)).getBlock() == Blocks.CAVE_AIR || world
/* 40 */           .getBlockState(new BlockPos(x - 1.0D, y, z)).getBlock() == LatexModBlocks.LATEXCOBWEBFIX.get() || world
/* 41 */           .getBlockState(new BlockPos(x - 1.0D, y, z)).getBlock() == Blocks.COBWEB || world
/* 42 */           .getBlockState(new BlockPos(x - 1.0D, y, z)).getBlock() == LatexModBlocks.DARKLATEXCARPET.get() || world
/* 43 */           .getBlockState(new BlockPos(x - 1.0D, y, z)).getBlock() == LatexModBlocks.DARKLATEXPUDDLEHARMLESS.get() || world
/* 44 */           .getBlockState(new BlockPos(x - 1.0D, y, z)).getBlock() == Blocks.AIR) ? true : false) != true)
/* 45 */         { if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 46 */             _entity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 5, 2, false, false)); }  return; }  return; }   if (entity instanceof LivingEntity) { LivingEntity livingEntity = (LivingEntity)entity; livingEntity.addEffect(new MobEffectInstance(MobEffects.LEVITATION, 5, 2, false, false)); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarkLatexSpiderOnEntityTickUpdateProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */