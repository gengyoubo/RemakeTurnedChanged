/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.changed.init.ChangedBlocks;
/*    */ import net.ltxprogrammer.turned.init.LatexModBlocks;
/*    */ import net.ltxprogrammer.turned.init.LatexModGameRules;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.entity.animal.Bee;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ 
/*    */ public class DarkLatexQueenBeeEntityDiesProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 17 */     if (world.m_6106_().m_5470_().m_46207_(LatexModGameRules.DARKLATEXESLEAVEBLOCK))
/* 18 */       if (Math.random() < 0.8D)
/* 19 */       { world.m_7731_(new BlockPos(x, y + 1.0D, z), ((Block)LatexModBlocks.DARKLATEXHIVE.get()).m_49966_(), 3);
/* 20 */         world.m_7731_(new BlockPos(x, y, z), ((Block)ChangedBlocks.DARK_LATEX_BLOCK.get()).m_49966_(), 3); }
/*    */       
/* 22 */       else if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 23 */         Bee bee = new Bee(EntityType.f_20550_, (Level)_level);
/* 24 */         bee.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/* 25 */         if (bee instanceof Mob) { Mob _mobToSpawn = (Mob)bee;
/* 26 */           _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(bee.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 28 */         world.m_7967_((Entity)bee); }
/*    */        
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DarkLatexQueenBeeEntityDiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */