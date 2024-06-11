/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.ltxprogrammer.turned.entity.LatexDropPodEntity;
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
/*    */ class null
/*    */ {
/* 29 */   private int ticks = 0;
/*    */   private float waitTicks;
/*    */   private LevelAccessor world;
/*    */   
/*    */   public void start(LevelAccessor world, int waitTicks) {
/* 34 */     this.waitTicks = waitTicks;
/* 35 */     MinecraftForge.EVENT_BUS.register(this);
/* 36 */     this.world = world;
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public void tick(TickEvent.ServerTickEvent event) {
/* 41 */     if (event.phase == TickEvent.Phase.END) {
/* 42 */       this.ticks++;
/* 43 */       if (this.ticks >= this.waitTicks)
/* 44 */         run(); 
/*    */     } 
/*    */   }
/*    */   
/*    */   private void run() {
/* 49 */     LevelAccessor levelAccessor = this.world; if (levelAccessor instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor;
/* 50 */       LatexDropPodEntity latexDropPodEntity = new LatexDropPodEntity((EntityType)LatexModEntities.LATEX_DROP_POD.get(), (Level)_level);
/* 51 */       latexDropPodEntity.m_7678_(x, y + 32.0D, z, 0.0F, 0.0F);
/* 52 */       latexDropPodEntity.m_5618_(0.0F);
/* 53 */       latexDropPodEntity.m_5616_(0.0F);
/* 54 */       if (latexDropPodEntity instanceof Mob) { Mob _mobToSpawn = (Mob)latexDropPodEntity;
/* 55 */         _mobToSpawn.m_6518_((ServerLevelAccessor)_level, this.world.m_6436_(latexDropPodEntity.m_142538_()), MobSpawnType.MOB_SUMMONED, null, null); }
/*    */       
/* 57 */       this.world.m_7967_((Entity)latexDropPodEntity); }
/*    */     
/* 59 */     MinecraftForge.EVENT_BUS.unregister(this);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\LatexRadioDropPodCallerProcedure$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */