/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.entity.EvilMilitaryEntity;
/*    */ import net.ltxprogrammer.turned.entity.EvilScientistEntity;
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ 
/*    */ public class EmergencyeviloutpostOnStructureInstanceGeneratedProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 14 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 15 */       EvilScientistEntity evilScientistEntity = new EvilScientistEntity((EntityType)LatexModEntities.EVIL_SCIENTIST.get(), (Level)_level);
/* 16 */       evilScientistEntity.m_7678_(x, y + 4.0D, z, 0.0F, 0.0F);
/* 17 */       evilScientistEntity.m_5618_(0.0F);
/* 18 */       evilScientistEntity.m_5616_(0.0F);
/* 19 */       if (evilScientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)evilScientistEntity;
/* 20 */         _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(evilScientistEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/* 21 */        world.m_7967_((Entity)evilScientistEntity); }
/*    */     
/* 23 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 24 */       EvilScientistEntity evilScientistEntity = new EvilScientistEntity((EntityType)LatexModEntities.EVIL_SCIENTIST.get(), (Level)_level);
/* 25 */       evilScientistEntity.m_7678_(x, y + 4.0D, z, 0.0F, 0.0F);
/* 26 */       evilScientistEntity.m_5618_(0.0F);
/* 27 */       evilScientistEntity.m_5616_(0.0F);
/* 28 */       if (evilScientistEntity instanceof Mob) { Mob _mobToSpawn = (Mob)evilScientistEntity;
/* 29 */         _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(evilScientistEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/* 30 */        world.m_7967_((Entity)evilScientistEntity); }
/*    */     
/* 32 */     if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 33 */       EvilMilitaryEntity evilMilitaryEntity = new EvilMilitaryEntity((EntityType)LatexModEntities.EVIL_MILITARY.get(), (Level)_level);
/* 34 */       evilMilitaryEntity.m_7678_(x, y + 4.0D, z, 0.0F, 0.0F);
/* 35 */       evilMilitaryEntity.m_5618_(0.0F);
/* 36 */       evilMilitaryEntity.m_5616_(0.0F);
/* 37 */       if (evilMilitaryEntity instanceof Mob) { Mob _mobToSpawn = (Mob)evilMilitaryEntity;
/* 38 */         _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(evilMilitaryEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/* 39 */        world.m_7967_((Entity)evilMilitaryEntity); }
/*    */     
/* 41 */     if (Math.random() < 0.2D && 
/* 42 */       world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 43 */       EvilMilitaryEntity evilMilitaryEntity = new EvilMilitaryEntity((EntityType)LatexModEntities.EVIL_MILITARY.get(), (Level)_level);
/* 44 */       evilMilitaryEntity.m_7678_(x, y + 4.0D, z, 0.0F, 0.0F);
/* 45 */       evilMilitaryEntity.m_5618_(0.0F);
/* 46 */       evilMilitaryEntity.m_5616_(0.0F);
/* 47 */       if (evilMilitaryEntity instanceof Mob) { Mob _mobToSpawn = (Mob)evilMilitaryEntity;
/* 48 */         _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(evilMilitaryEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */       
/* 50 */       world.m_7967_((Entity)evilMilitaryEntity); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\EmergencyeviloutpostOnStructureInstanceGeneratedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */