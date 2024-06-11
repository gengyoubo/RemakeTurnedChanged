/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.entity.DarkLatexSnepEntity;
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class SneppleBulletHitsBlockProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 13 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 14 */       DarkLatexSnepEntity darkLatexSnepEntity = new DarkLatexSnepEntity((EntityType)LatexModEntities.DARK_LATEX_SNEP.get(), (Level)_level);
/* 15 */       darkLatexSnepEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 16 */       darkLatexSnepEntity.m_5618_(0.0F);
/* 17 */       darkLatexSnepEntity.m_5616_(0.0F);
/* 18 */       if (darkLatexSnepEntity instanceof Mob) { Mob _mobToSpawn = (Mob)darkLatexSnepEntity;
/* 19 */         _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(darkLatexSnepEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/* 20 */        world.m_7967_((Entity)darkLatexSnepEntity); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\SneppleBulletHitsBlockProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */