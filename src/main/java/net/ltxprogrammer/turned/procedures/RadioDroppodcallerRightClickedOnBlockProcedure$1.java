/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.ltxprogrammer.turned.entity.DROPPODEntity;
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EntityType;
/*    */ import net.minecraft.world.entity.Mob;
/*    */ import net.minecraft.world.entity.MobSpawnType;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.ServerLevelAccessor;
/*    */ import net.minecraftforge.common.MinecraftForge;
/*    */ import net.minecraftforge.event.TickEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ class null
/*    */ {
/* 32 */   private int ticks = 0;
/*    */   private float waitTicks;
/*    */   private LevelAccessor world;
/*    */   
/*    */   public void start(LevelAccessor world, int waitTicks) {
/* 37 */     this.waitTicks = waitTicks;
/* 38 */     MinecraftForge.EVENT_BUS.register(this);
/* 39 */     this.world = world;
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public void tick(TickEvent.ServerTickEvent event) {
/* 44 */     if (event.phase == TickEvent.Phase.END) {
/* 45 */       this.ticks++;
/* 46 */       if (this.ticks >= this.waitTicks)
/* 47 */         run(); 
/*    */     } 
/*    */   }
/*    */   
/*    */   private void run() {
/* 52 */     LevelAccessor levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 53 */       DROPPODEntity dROPPODEntity = new DROPPODEntity((EntityType)LatexModEntities.DROPPOD.get(), (Level)_level);
/* 54 */       dROPPODEntity.m_7678_(x, y + 32.0D, z, 0.0F, 0.0F);
/* 55 */       dROPPODEntity.m_5618_(0.0F);
/* 56 */       dROPPODEntity.m_5616_(0.0F);
/* 57 */       if (dROPPODEntity instanceof Mob) { Mob _mobToSpawn = (Mob)dROPPODEntity;
/* 58 */         _mobToSpawn.m_6518_((ServerLevelAccessor)_level, this.world.m_6436_(dROPPODEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */       
/* 60 */       this.world.m_7967_((Entity)dROPPODEntity); }
/*    */     
/* 62 */     MinecraftForge.EVENT_BUS.unregister(this);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\RadioDroppodcallerRightClickedOnBlockProcedure$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */