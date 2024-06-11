/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.entity.DLbeeEntity;
/*    */ import net.ltxprogrammer.turned.entity.DarkLatexQueenBeeEntity;
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class DarklatexhiveBlockDestroyedByExplosionProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 14 */     if (Math.random() < 0.6D)
/* 15 */     { if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 16 */         DLbeeEntity dLbeeEntity = new DLbeeEntity((EntityType)LatexModEntities.D_LBEE.get(), (Level)_level);
/* 17 */         dLbeeEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 18 */         dLbeeEntity.m_5618_(0.0F);
/* 19 */         dLbeeEntity.m_5616_(0.0F);
/* 20 */         if (dLbeeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dLbeeEntity;
/* 21 */           _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(dLbeeEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 23 */         world.m_7967_((Entity)dLbeeEntity); }
/*    */        }
/* 25 */     else if (Math.random() < 0.2D && 
/* 26 */       world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 27 */       DarkLatexQueenBeeEntity darkLatexQueenBeeEntity = new DarkLatexQueenBeeEntity((EntityType)LatexModEntities.DARK_LATEX_QUEEN_BEE.get(), (Level)_level);
/* 28 */       darkLatexQueenBeeEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 29 */       darkLatexQueenBeeEntity.m_5618_(0.0F);
/* 30 */       darkLatexQueenBeeEntity.m_5616_(0.0F);
/* 31 */       if (darkLatexQueenBeeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexQueenBeeEntity;
/* 32 */         _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexQueenBeeEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */       
/* 34 */       world.m_7967_((Entity)darkLatexQueenBeeEntity); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DarklatexhiveBlockDestroyedByExplosionProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */