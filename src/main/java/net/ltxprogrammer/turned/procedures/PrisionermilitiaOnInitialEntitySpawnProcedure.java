/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.entity.PrisionerMilitiaMeleeEntity;
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class PrisionermilitiaOnInitialEntitySpawnProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 13 */     if (entity == null)
/*    */       return; 
/* 15 */     if (Math.random() < 0.5D) {
/* 16 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 17 */         PrisionerMilitiaMeleeEntity prisionerMilitiaMeleeEntity = new PrisionerMilitiaMeleeEntity((EntityType)LatexModEntities.PRISIONER_MILITIA_MELEE.get(), (Level)_level);
/* 18 */         prisionerMilitiaMeleeEntity.m_7678_(x, y, z, entity.m_146908_(), entity.m_146909_());
/* 19 */         prisionerMilitiaMeleeEntity.m_5618_(entity.m_146908_());
/* 20 */         prisionerMilitiaMeleeEntity.m_5616_(entity.m_146908_());
/* 21 */         prisionerMilitiaMeleeEntity.m_20334_(0.0D, 0.0D, 0.0D);
/* 22 */         if (prisionerMilitiaMeleeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)prisionerMilitiaMeleeEntity;
/* 23 */           _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(prisionerMilitiaMeleeEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 25 */         world.m_7967_((Entity)prisionerMilitiaMeleeEntity); }
/*    */       
/* 27 */       if (!entity.f_19853_.m_5776_())
/* 28 */         entity.m_146870_(); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\PrisionermilitiaOnInitialEntitySpawnProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */