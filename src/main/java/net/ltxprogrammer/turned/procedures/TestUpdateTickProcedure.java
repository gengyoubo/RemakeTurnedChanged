/*    */ package net.ltxprogrammer.turned.procedures;
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
/* 12 */     if (world.m_8055_(new BlockPos(x, y - 1.0D, z)).m_204336_(BlockTags.create(new ResourceLocation("turned:tag_immune_blocks"))))
/* 13 */     { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 14 */         _level.m_8767_((ParticleOptions)ParticleTypes.f_123748_, x, y, z, 6, 3.0D, 3.0D, 3.0D, 1.0D); }
/*    */        }
/* 16 */     else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 17 */       _level.m_8767_((ParticleOptions)ParticleTypes.f_123792_, x, y, z, 6, 3.0D, 3.0D, 3.0D, 1.0D); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\TestUpdateTickProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */