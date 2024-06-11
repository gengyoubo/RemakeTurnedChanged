/*    */ package net.mcreator.latexes.procedures;
/*    */ import net.mcreator.latexes.entity.DLbeeEntity;
/*    */ import net.mcreator.latexes.init.LatexModEntities;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
/*    */ import net.minecraftforge.common.MinecraftForge;
/*    */ import net.minecraftforge.event.TickEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ 
/*    */ public class DarkLatexQueenBeeEntityIsHurtProcedure {
/*    */   public static void execute(LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
/* 19 */     if (entity == null)
/*    */       return; 
/* 21 */     (new Object() {
/* 22 */         private int ticks = 0;
/*    */         private float waitTicks;
/*    */         private LevelAccessor world;
/*    */         
/*    */         public void start(LevelAccessor world, int waitTicks) {
/* 27 */           this.waitTicks = waitTicks;
/* 28 */           MinecraftForge.EVENT_BUS.register(this);
/* 29 */           this.world = world;
/*    */         }
/*    */         
/*    */         @SubscribeEvent
/*    */         public void tick(TickEvent.ServerTickEvent event) {
/* 34 */           if (event.phase == TickEvent.Phase.END) {
/* 35 */             this.ticks++;
/* 36 */             if (this.ticks >= this.waitTicks)
/* 37 */               run(); 
/*    */           } 
/*    */         }
/*    */         
/*    */         private void run() {
/* 42 */           LivingEntity _livEnt = (LivingEntity)entity;
/*    */           
/* 44 */           LivingEntity livingEntity1 = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.getHealth() : -1.0F) <= ((entity instanceof LivingEntity) ? livingEntity1.getMaxHealth() : -1.0F) / 2.0F && 
/* 45 */             Math.random() < 0.001D) {
/* 46 */             LevelAccessor levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 47 */               DLbeeEntity dLbeeEntity = new DLbeeEntity((EntityType)LatexModEntities.D_LBEE.get(), (Level)_level);
/* 48 */               dLbeeEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 49 */               dLbeeEntity.setYBodyRot(0.0F);
/* 50 */               dLbeeEntity.setYHeadRot(0.0F);
/* 51 */               if (dLbeeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dLbeeEntity;
/* 52 */                 _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, this.world.getCurrentDifficultyAt(dLbeeEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */               
/* 54 */               this.world.addFreshEntity((Entity)dLbeeEntity); }
/*    */             
/* 56 */             if (Math.random() < 0.3D) {
/* 57 */               levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 58 */                 DLbeeEntity dLbeeEntity = new DLbeeEntity((EntityType)LatexModEntities.D_LBEE.get(), (Level)_level);
/* 59 */                 dLbeeEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 60 */                 dLbeeEntity.setYBodyRot(0.0F);
/* 61 */                 dLbeeEntity.setYHeadRot(0.0F);
/* 62 */                 if (dLbeeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dLbeeEntity;
/* 63 */                   _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, this.world.getCurrentDifficultyAt(dLbeeEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */                 
/* 65 */                 this.world.addFreshEntity((Entity)dLbeeEntity); }
/*    */               
/* 67 */               if (Math.random() < 0.3D) {
/* 68 */                 levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 69 */                   DLbeeEntity dLbeeEntity = new DLbeeEntity((EntityType)LatexModEntities.D_LBEE.get(), (Level)_level);
/* 70 */                   dLbeeEntity.moveTo(x, y, z, 0.0F, 0.0F);
/* 71 */                   dLbeeEntity.setYBodyRot(0.0F);
/* 72 */                   dLbeeEntity.setYHeadRot(0.0F);
/* 73 */                   if (dLbeeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dLbeeEntity;
/* 74 */                     _mobToSpawn.finalizeSpawn((ServerLevelAccessor)_level, this.world.getCurrentDifficultyAt(dLbeeEntity.blockPosition()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */                   
/* 76 */                   this.world.addFreshEntity((Entity)dLbeeEntity); }
/*    */               
/*    */               } 
/*    */             } 
/*    */           } 
/*    */           
/* 82 */           MinecraftForge.EVENT_BUS.unregister(this);
/*    */         }
/* 84 */       }).start(world, 300);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DarkLatexQueenBeeEntityIsHurtProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */