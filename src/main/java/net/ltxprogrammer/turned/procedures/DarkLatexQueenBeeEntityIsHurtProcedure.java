/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.entity.DLbeeEntity;
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
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
/*    */ 
/*    */ public class DarkLatexQueenBeeEntityIsHurtProcedure {
/*    */   public static void execute(LevelAccessor world, final double x, final double y, final double z, final Entity entity) {
/* 18 */     if (entity == null)
/*    */       return; 
/* 20 */     (new Object() {
/* 21 */         private int ticks = 0;
/*    */         private float waitTicks;
/*    */         private LevelAccessor world;
/*    */         
/*    */         public void start(LevelAccessor world, int waitTicks) {
/* 26 */           this.waitTicks = waitTicks;
/* 27 */           MinecraftForge.EVENT_BUS.register(this);
/* 28 */           this.world = world;
/*    */         }
/*    */         
/*    */         @SubscribeEvent
/*    */         public void tick(TickEvent.ServerTickEvent event) {
/* 33 */           if (event.phase == TickEvent.Phase.END) {
/* 34 */             this.ticks++;
/* 35 */             if (this.ticks >= this.waitTicks)
/* 36 */               run(); 
/*    */           } 
/*    */         }
/*    */         
/*    */         private void run() {
/* 41 */           LivingEntity _livEnt = (LivingEntity)entity;
/*    */           
/* 43 */           LivingEntity livingEntity1 = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.m_21223_() : -1.0F) <= ((entity instanceof LivingEntity) ? livingEntity1.m_21233_() : -1.0F) / 2.0F && 
/* 44 */             Math.random() < 0.001D) {
/* 45 */             LevelAccessor levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 46 */               DLbeeEntity dLbeeEntity = new DLbeeEntity((EntityType)LatexModEntities.D_LBEE.get(), (Level)_level);
/* 47 */               dLbeeEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 48 */               dLbeeEntity.m_5618_(0.0F);
/* 49 */               dLbeeEntity.m_5616_(0.0F);
/* 50 */               if (dLbeeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dLbeeEntity;
/* 51 */                 _mobToSpawn.m_6518_((ServerLevelAccessor)_level, this.world.m_6436_(dLbeeEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */               
/* 53 */               this.world.m_7967_((Entity)dLbeeEntity); }
/*    */             
/* 55 */             if (Math.random() < 0.3D) {
/* 56 */               levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 57 */                 DLbeeEntity dLbeeEntity = new DLbeeEntity((EntityType)LatexModEntities.D_LBEE.get(), (Level)_level);
/* 58 */                 dLbeeEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 59 */                 dLbeeEntity.m_5618_(0.0F);
/* 60 */                 dLbeeEntity.m_5616_(0.0F);
/* 61 */                 if (dLbeeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dLbeeEntity;
/* 62 */                   _mobToSpawn.m_6518_((ServerLevelAccessor)_level, this.world.m_6436_(dLbeeEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */                 
/* 64 */                 this.world.m_7967_((Entity)dLbeeEntity); }
/*    */               
/* 66 */               if (Math.random() < 0.3D) {
/* 67 */                 levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 68 */                   DLbeeEntity dLbeeEntity = new DLbeeEntity((EntityType)LatexModEntities.D_LBEE.get(), (Level)_level);
/* 69 */                   dLbeeEntity.m_7678_(x, y, z, 0.0F, 0.0F);
/* 70 */                   dLbeeEntity.m_5618_(0.0F);
/* 71 */                   dLbeeEntity.m_5616_(0.0F);
/* 72 */                   if (dLbeeEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dLbeeEntity;
/* 73 */                     _mobToSpawn.m_6518_((ServerLevelAccessor)_level, this.world.m_6436_(dLbeeEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */                   
/* 75 */                   this.world.m_7967_((Entity)dLbeeEntity); }
/*    */               
/*    */               } 
/*    */             } 
/*    */           } 
/*    */           
/* 81 */           MinecraftForge.EVENT_BUS.unregister(this);
/*    */         }
/* 83 */       }).start(world, 300);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DarkLatexQueenBeeEntityIsHurtProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */