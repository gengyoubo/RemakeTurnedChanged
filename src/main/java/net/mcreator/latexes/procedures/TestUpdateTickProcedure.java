/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.core.particles.ParticleOptions;
/*    */ import net.minecraft.core.particles.ParticleTypes;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.tags.BlockTags;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class TestUpdateTickProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 12 */     if (world.getBlockState(new BlockPos(x, y - 1.0D, z)).is(BlockTags.create(new ResourceLocation("latex:tag_immune_blocks"))))
/* 13 */     { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 14 */         _level.sendParticles((ParticleOptions)ParticleTypes.HAPPY_VILLAGER, x, y, z, 6, 3.0D, 3.0D, 3.0D, 1.0D); }
/*    */        }
/* 16 */     else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 17 */       _level.sendParticles((ParticleOptions)ParticleTypes.ANGRY_VILLAGER, x, y, z, 6, 3.0D, 3.0D, 3.0D, 1.0D); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\TestUpdateTickProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */