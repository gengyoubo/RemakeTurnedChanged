/*    */ package net.mcreator.latexes.procedures;
/*    */ import java.util.Comparator;
/*    */ import net.mcreator.latexes.entity.ArmedDroneHertxWaitEntity;
/*    */ import net.mcreator.latexes.entity.DroneHertxEntity;
/*    */ import net.mcreator.latexes.init.LatexModEntities;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
/*    */ import net.minecraft.world.phys.AABB;
/*    */ import net.minecraft.world.phys.Vec3;
/*    */ 
/*    */ public class DronehertxupgradekitRightclickedProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 19 */     if (entity == null)
/*    */       return; 
/* 21 */     if (!world.getEntitiesOfClass(DroneHertxEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0D, 3.0D, 3.0D), e -> true).isEmpty()) {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 27 */       if (!((Entity)world.getEntitiesOfClass(DroneHertxEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0D, 3.0D, 3.0D), e -> true).stream().sorted((Comparator)(new Object() { Comparator<Entity> compareDistOf(double _x, double _y, double _z) { return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z)); } }).compareDistOf(x, y, z)).findFirst().orElse(null)).level.isClientSide())
/* 28 */         ((Entity)world.getEntitiesOfClass(DroneHertxEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0D, 3.0D, 3.0D), e -> true).stream()
/* 29 */           .sorted((new Object() {
/*    */               Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
/* 31 */                 return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
/*    */               }
/* 33 */             }).compareDistOf(x, y, z)).findFirst().orElse(null)).discard(); 
/* 34 */       if (world instanceof ServerLevel) { ServerLevel _level = (ServerLevel)world;
/* 35 */         ArmedDroneHertxWaitEntity armedDroneHertxWaitEntity = new ArmedDroneHertxWaitEntity((EntityType)LatexModEntities.ARMED_DRONE_HERTX_WAIT.get(), (Level)_level);
/* 36 */         armedDroneHertxWaitEntity.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
/* 37 */         armedDroneHertxWaitEntity.setYBodyRot(entity.getYRot());
/* 38 */         armedDroneHertxWaitEntity.setYHeadRot(entity.getYRot());
/* 39 */         if (armedDroneHertxWaitEntity instanceof Mob) { Mob _mobToSpawn = (Mob)armedDroneHertxWaitEntity;
/* 40 */           _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, world.getCurrentDifficultyAt(armedDroneHertxWaitEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */         
/* 42 */         world.addFreshEntity((Entity)armedDroneHertxWaitEntity); }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DronehertxupgradekitRightclickedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */