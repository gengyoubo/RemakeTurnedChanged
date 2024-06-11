/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import com.google.common.collect.UnmodifiableIterator;
/*    */ import java.util.Map;
/*    */ import net.ltxprogrammer.turned.init.LatexModBlocks;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class BunkerHatchOpenOnBlockRightClickedProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 18 */     if (world instanceof Level) { Level _level = (Level)world;
/* 19 */       if (!_level.m_5776_()) {
/* 20 */         _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 21 */             .getValue(new ResourceLocation("block.iron_trapdoor.close")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */       } else {
/* 23 */         _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_trapdoor.close")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */       }  }
/*    */ 
/*    */ 
/*    */     
/* 28 */     BlockPos _bp = new BlockPos(x, y, z);
/* 29 */     BlockState _bs = ((Block)LatexModBlocks.BUNKERHATCH.get()).m_49966_();
/* 30 */     BlockState _bso = world.m_8055_(_bp);
/* 31 */     for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 32 */       Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 33 */       if (_property != null && _bs.m_61143_(_property) != null) {
/*    */         try {
/* 35 */           _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 36 */         } catch (Exception exception) {}
/*    */       } }
/*    */     
/* 39 */     world.m_7731_(_bp, _bs, 3);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\BunkerHatchOpenOnBlockRightClickedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */