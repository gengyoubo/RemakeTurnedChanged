/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.entity.DarklatexslugEntity;
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ 
/*    */ public class InfesteddlcobblestoneBlockDestroyedByPlayerProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 15 */     if (Math.random() < 0.1D) {
/* 16 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 17 */         DarklatexslugEntity darklatexslugEntity = new DarklatexslugEntity((EntityType)LatexModEntities.DARKLATEXSLUG.get(), (Level)_level);
/* 18 */         darklatexslugEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 19 */         darklatexslugEntity.m_5618_(0.0F);
/* 20 */         darklatexslugEntity.m_5616_(0.0F);
/* 21 */         darklatexslugEntity.m_20334_(0.0D, 0.0D, 0.0D);
/* 22 */         if (darklatexslugEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darklatexslugEntity;
/* 23 */           _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darklatexslugEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 25 */         world.m_7967_((Entity)darklatexslugEntity); }
/*    */     
/* 27 */     } else if (Math.random() < 0.001D) {
/* 28 */       world.m_7731_(new BlockPos(x, y, z), ((Block)ChangedBlocks.DARK_LATEX_BLOCK.get()).m_49966_(), 3);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\InfesteddlcobblestoneBlockDestroyedByPlayerProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */