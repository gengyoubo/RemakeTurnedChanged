/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import com.google.common.collect.UnmodifiableIterator;
/*    */ import java.util.Map;
/*    */ import net.mcreator.latexes.init.LatexModBlocks;
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
/*    */ public class VentOpenOnBlockRightClickedProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 19 */     if (world instanceof Level) { Level _level = (Level)world;
/* 20 */       if (!_level.isClientSide()) {
/* 21 */         _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:click_noise")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */       } else {
/*    */         
/* 24 */         _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:click_noise")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */       }  }
/*    */ 
/*    */ 
/*    */     
/* 29 */     BlockPos _bp = new BlockPos(x, y, z);
/* 30 */     BlockState _bs = ((Block)LatexModBlocks.VENT.get()).defaultBlockState();
/* 31 */     BlockState _bso = world.getBlockState(_bp);
/* 32 */     for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 33 */       Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 34 */       if (_property != null && _bs.getValue(_property) != null) {
/*    */         try {
/* 36 */           _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 37 */         } catch (Exception exception) {}
/*    */       } }
/*    */     
/* 40 */     world.setBlock(_bp, _bs, 3);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\VentOpenOnBlockRightClickedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */