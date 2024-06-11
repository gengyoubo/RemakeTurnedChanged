/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import com.google.common.collect.UnmodifiableIterator;
/*    */ import java.util.Map;
/*    */ import net.mcreator.latexes.init.LatexModBlocks;
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class ControlpanelonOnBlockRightClickedProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 23 */     if (entity == null)
/*    */       return; 
/* 25 */     LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.KEYCARD.get())
/*    */     
/* 27 */     { BlockPos _bp = new BlockPos(x, y, z);
/* 28 */       BlockState _bs = ((Block)LatexModBlocks.CONTROLPANELOFF.get()).defaultBlockState();
/* 29 */       BlockState _bso = world.getBlockState(_bp);
/* 30 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 31 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 32 */         if (_property != null && _bs.getValue(_property) != null) {
/*    */           try {
/* 34 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 35 */           } catch (Exception exception) {}
/*    */         } }
/*    */       
/* 38 */       world.setBlock(_bp, _bs, 3);
/*    */       
/* 40 */       if (world instanceof Level) { Level _level = (Level)world;
/* 41 */         if (!_level.isClientSide()) {
/* 42 */           _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:approve_beep")), SoundSource.BLOCKS, 1.0F, 1.0F);
/*    */         } else {
/*    */           
/* 45 */           _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:approve_beep")), SoundSource.BLOCKS, 1.0F, 1.0F, false);
/*    */         }
/*    */          }
/*    */       
/*    */        }
/* 50 */     else if (world instanceof Level) { Level _level = (Level)world;
/* 51 */       if (!_level.isClientSide()) {
/* 52 */         _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:deny_beep")), SoundSource.BLOCKS, 1.0F, 1.0F);
/*    */       } else {
/*    */         
/* 55 */         _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:deny_beep")), SoundSource.BLOCKS, 1.0F, 1.0F, false);
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\ControlpanelonOnBlockRightClickedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */