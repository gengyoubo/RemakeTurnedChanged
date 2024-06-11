/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.entity.HertxvarSolEntity;
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class HertxSolWaitEntityIsHurtProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 13 */     if (entity == null)
/*    */       return; 
/* 15 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 16 */       HertxvarSolEntity hertxvarSolEntity = new HertxvarSolEntity((EntityType)LatexModEntities.HERTXVAR_SOL.get(), (Level)_level);
/* 17 */       hertxvarSolEntity.m_7678_(x, y, z, entity.m_146908_(), entity.m_146909_());
/* 18 */       hertxvarSolEntity.m_5618_(entity.m_146908_());
/* 19 */       hertxvarSolEntity.m_5616_(entity.m_146908_());
/* 20 */       if (hertxvarSolEntity instanceof Mob) { Mob _mobToSpawn = (Mob)hertxvarSolEntity;
/* 21 */         _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(hertxvarSolEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/* 22 */        world.m_7967_((Entity)hertxvarSolEntity); }
/*    */     
/* 24 */     if (!entity.f_19853_.m_5776_())
/* 25 */       entity.m_146870_(); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\HertxSolWaitEntityIsHurtProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */