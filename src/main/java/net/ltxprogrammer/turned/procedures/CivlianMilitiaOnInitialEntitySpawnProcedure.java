/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.entity.CivilianMilitiaMeleeEntity;
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class CivlianMilitiaOnInitialEntitySpawnProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 13 */     if (entity == null)
/*    */       return; 
/* 15 */     if (Math.random() < 0.5D) {
/* 16 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 17 */         CivilianMilitiaMeleeEntity civilianMilitiaMeleeEntity = new CivilianMilitiaMeleeEntity((EntityType)LatexModEntities.CIVILIAN_MILITIA_MELEE.get(), (Level)_level);
/* 18 */         civilianMilitiaMeleeEntity.m_7678_(x, y, z, entity.m_146908_(), entity.m_146909_());
/* 19 */         civilianMilitiaMeleeEntity.m_5618_(entity.m_146908_());
/* 20 */         civilianMilitiaMeleeEntity.m_5616_(entity.m_146908_());
/* 21 */         civilianMilitiaMeleeEntity.m_20334_(0.0D, 0.0D, 0.0D);
/* 22 */         if (civilianMilitiaMeleeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)civilianMilitiaMeleeEntity;
/* 23 */           _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(civilianMilitiaMeleeEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 25 */         world.m_7967_((Entity)civilianMilitiaMeleeEntity); }
/*    */       
/* 27 */       if (!entity.f_19853_.m_5776_())
/* 28 */         entity.m_146870_(); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\CivlianMilitiaOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */