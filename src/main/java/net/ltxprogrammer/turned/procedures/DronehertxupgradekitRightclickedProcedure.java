/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import java.util.Comparator;
/*    */ import net.ltxprogrammer.turned.entity.ArmedDroneHertxWaitEntity;
/*    */ import net.ltxprogrammer.turned.entity.DroneHertxEntity;
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class DronehertxupgradekitRightclickedProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 18 */     if (entity == null)
/*    */       return; 
/* 20 */     if (!world.m_6443_(DroneHertxEntity.class, AABB.m_165882_(new Vec3(x, y, z), 3.0D, 3.0D, 3.0D), e -> true).isEmpty()) {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 26 */       if (!((DroneHertxEntity)world.m_6443_(DroneHertxEntity.class, AABB.m_165882_(new Vec3(x, y, z), 3.0D, 3.0D, 3.0D), e -> true).stream().sorted((Comparator)(new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).f_19853_.m_5776_())
/* 27 */         ((DroneHertxEntity)world.m_6443_(DroneHertxEntity.class, AABB.m_165882_(new Vec3(x, y, z), 3.0D, 3.0D, 3.0D), e -> true).stream()
/* 28 */           .sorted((new Object() {
/*    */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 30 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.m_20275_(_x, _y, _z));
/*    */               }
/* 32 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).m_146870_(); 
/* 33 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 34 */         ArmedDroneHertxWaitEntity armedDroneHertxWaitEntity = new ArmedDroneHertxWaitEntity((EntityType)LatexModEntities.ARMED_DRONE_HERTX_WAIT.get(), (Level)_level);
/* 35 */         armedDroneHertxWaitEntity.m_7678_(x, y, z, entity.m_146908_(), entity.m_146909_());
/* 36 */         armedDroneHertxWaitEntity.m_5618_(entity.m_146908_());
/* 37 */         armedDroneHertxWaitEntity.m_5616_(entity.m_146908_());
/* 38 */         if (armedDroneHertxWaitEntity instanceof Mob) { Mob _mobToSpawn = (Mob)armedDroneHertxWaitEntity;
/* 39 */           _mobToSpawn.m_6518_((ServerLevelAccessor)_level, world.m_6436_(armedDroneHertxWaitEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 41 */         world.m_7967_((Entity)armedDroneHertxWaitEntity); }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DronehertxupgradekitRightclickedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */