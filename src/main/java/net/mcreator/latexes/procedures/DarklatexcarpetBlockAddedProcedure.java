/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.mcreator.latexes.init.LatexModBlocks;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.tags.BlockTags;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class DarklatexcarpetBlockAddedProcedure
/*    */ {
/*    */   public static boolean execute(LevelAccessor world, double x, double y, double z) {
/* 12 */     if (world.getBlockState(new BlockPos(x, y - 1.0D, z)).is(BlockTags.create(new ResourceLocation("latex:invalidblockbelow"))) || world
/* 13 */       .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == LatexModBlocks.DARKLATEXCRYSTALEGG.get() || world
/* 14 */       .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == LatexModBlocks.DARKLATEXICE.get() || world
/* 15 */       .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get() || world
/* 16 */       .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == LatexModBlocks.DARKLATEXBLOCK.get() || world
/* 17 */       .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == LatexModBlocks.DARKLATEXPUDDLEHARMLESS.get() || world
/* 18 */       .getBlockState(new BlockPos(x, y - 1.0D, z)).getBlock() == LatexModBlocks.DARKLATEXCARPET.get()) {
/* 19 */       world.destroyBlock(new BlockPos(x, y, z), false);
/* 20 */       return true;
/*    */     } 
/* 22 */     return false;
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarklatexcarpetBlockAddedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */