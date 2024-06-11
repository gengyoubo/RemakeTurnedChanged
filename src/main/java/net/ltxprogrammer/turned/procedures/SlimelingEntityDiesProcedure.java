/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.entity.monster.Slime;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class SlimelingEntityDiesProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 13 */     if (Math.random() < 0.25D && 
/* 14 */       world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 15 */       Slime slime = new Slime(EntityType.f_20526_, (Level)_level);
/* 16 */       slime.m_7678_(x, y, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/* 17 */       if (slime instanceof Mob) { Mob _mobToSpawn = (Mob)slime;
/* 18 */         _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(slime.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */       
/* 20 */       world.m_7967_((Entity)slime); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\SlimelingEntityDiesProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */