/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.entity.PrisionerEntity;
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
/*    */ 
/*    */ public class HandcuffsRightclickedProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 15 */     if (entity == null)
/*    */       return; 
/* 17 */     if (entity instanceof net.ltxprogrammer.turned.entity.EvilScientistEntity || entity instanceof net.ltxprogrammer.turned.entity.CivilianEntity) {
/* 18 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 19 */         PrisionerEntity prisionerEntity = new PrisionerEntity((EntityType)LatexModEntities.PRISIONER.get(), (Level)_level);
/* 20 */         prisionerEntity.m_7678_(x, y, z, entity.m_146908_(), entity.m_146909_());
/* 21 */         prisionerEntity.m_5618_(entity.m_146908_());
/* 22 */         prisionerEntity.m_5616_(entity.m_146908_());
/* 23 */         prisionerEntity.m_20334_(0.0D, 0.0D, 0.0D);
/* 24 */         if (prisionerEntity instanceof Mob) { Mob _mobToSpawn = (Mob)prisionerEntity;
/* 25 */           _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(prisionerEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 27 */         world.m_7967_((Entity)prisionerEntity); }
/*    */       
/* 29 */       if (!entity.f_19853_.m_5776_())
/* 30 */         entity.m_146870_(); 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\HandcuffsRightclickedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */