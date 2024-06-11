/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.common.MinecraftForge;
/*    */ import net.minecraftforge.event.TickEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
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
/* 27 */   private int ticks = 0;
/*    */   private float waitTicks;
/*    */   private LevelAccessor world;
/*    */   
/*    */   public void start(LevelAccessor world, int waitTicks) {
/* 32 */     this.waitTicks = waitTicks;
/* 33 */     MinecraftForge.EVENT_BUS.register(this);
/* 34 */     this.world = world;
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public void tick(TickEvent.ServerTickEvent event) {
/* 39 */     if (event.phase == TickEvent.Phase.END) {
/* 40 */       this.ticks++;
/* 41 */       if (this.ticks >= this.waitTicks)
/* 42 */         run(); 
/*    */     } 
/*    */   }
/*    */   
/*    */   private void run() {
/* 47 */     LevelAccessor levelAccessor = this.world; if (levelAccessor instanceof Level) { Level _level = (Level)levelAccessor;
/* 48 */       if (!_level.m_5776_()) {
/* 49 */         _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 50 */             .getValue(new ResourceLocation("block.lever.click")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */       } else {
/* 52 */         _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lever.click")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */       }  }
/*    */ 
/*    */     
/* 56 */     MinecraftForge.EVENT_BUS.unregister(this);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DartrifleRangedItemUsedProcedure$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */