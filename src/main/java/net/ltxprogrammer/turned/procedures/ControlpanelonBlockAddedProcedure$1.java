/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import com.google.common.collect.UnmodifiableIterator;
/*    */ import java.util.Map;
/*    */ import net.ltxprogrammer.turned.init.LatexModBlocks;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ import net.minecraftforge.common.MinecraftForge;
/*    */ import net.minecraftforge.event.TickEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ 
/*    */ 
/*    */ class null
/*    */ {
/* 18 */   private int ticks = 0;
/*    */   private float waitTicks;
/*    */   private LevelAccessor world;
/*    */   
/*    */   public void start(LevelAccessor world, int waitTicks) {
/* 23 */     this.waitTicks = waitTicks;
/* 24 */     MinecraftForge.EVENT_BUS.register(this);
/* 25 */     this.world = world;
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public void tick(TickEvent.ServerTickEvent event) {
/* 30 */     if (event.phase == TickEvent.Phase.END) {
/* 31 */       this.ticks++;
/* 32 */       if (this.ticks >= this.waitTicks) {
/* 33 */         run();
/*    */       }
/*    */     } 
/*    */   }
/*    */   
/*    */   private void run() {
/* 39 */     BlockPos _bp = new BlockPos(x, y, z);
/* 40 */     BlockState _bs = ((Block)LatexModBlocks.CONTROLPANELOFF.get()).m_49966_();
/* 41 */     BlockState _bso = this.world.m_8055_(_bp);
/* 42 */     for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 43 */       Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 44 */       if (_property != null && _bs.m_61143_(_property) != null) {
/*    */         try {
/* 46 */           _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 47 */         } catch (Exception exception) {}
/*    */       } }
/*    */     
/* 50 */     this.world.m_7731_(_bp, _bs, 3);
/*    */     
/* 52 */     MinecraftForge.EVENT_BUS.unregister(this);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\ControlpanelonBlockAddedProcedure$1.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */