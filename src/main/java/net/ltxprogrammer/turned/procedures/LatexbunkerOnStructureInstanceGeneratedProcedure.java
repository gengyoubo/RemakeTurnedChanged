/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.entity.npc.Villager;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class LatexbunkerOnStructureInstanceGeneratedProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 13 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 14 */       Villager villager = new Villager(EntityType.f_20492_, (Level)_level);
/* 15 */       villager.m_7678_(x, y + 3.0D, z, world.m_5822_().nextFloat() * 360.0F, 0.0F);
/* 16 */       if (villager instanceof Mob) { Mob _mobToSpawn = (Mob)villager;
/* 17 */         _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(villager.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/* 18 */        world.m_7967_((Entity)villager); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\LatexbunkerOnStructureInstanceGeneratedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */