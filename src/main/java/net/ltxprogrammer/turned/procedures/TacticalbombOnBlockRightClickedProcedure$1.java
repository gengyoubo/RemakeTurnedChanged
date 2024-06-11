/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.minecraft.core.particles.ParticleOptions;
/*    */ import net.minecraft.core.particles.ParticleTypes;
/*    */ import net.minecraft.server.level.ServerLevel;
/*    */ import net.minecraft.world.level.Explosion;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
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
/* 49 */     for (int index0 = 0; index0 < 10; index0++) {
/* 50 */       LevelAccessor levelAccessor1 = this.world; if (levelAccessor1 instanceof ServerLevel) { ServerLevel _level = (ServerLevel)levelAccessor1;
/* 51 */         _level.m_8767_((ParticleOptions)ParticleTypes.f_123744_, x, y, z, 5, 3.0D, 3.0D, 3.0D, 1.0D); }
/*    */     
/* 53 */     }  LevelAccessor levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor; if (!_level.m_5776_())
/* 54 */         _level.m_46511_(null, x, y, z, 5.0F, Explosion.BlockInteraction.DESTROY);  }
/* 55 */      MinecraftForge.EVENT_BUS.unregister(this);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\TacticalbombOnBlockRightClickedProcedure$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */