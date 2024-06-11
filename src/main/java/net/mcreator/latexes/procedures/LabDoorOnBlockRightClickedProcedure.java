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
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class LabDoorOnBlockRightClickedProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 24 */     if (entity == null)
/*    */       return; 
/* 26 */     LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.KEYCARD.get())
/* 27 */     { if (Blocks.BARRIER == world.getBlockState(new BlockPos(x - 1.0D, y, z)).getBlock()) {
/* 28 */         world.setBlock(new BlockPos(x - 1.0D, y, z), Blocks.AIR.defaultBlockState(), 3);
/*    */       }
/* 30 */       if (Blocks.BARRIER == world.getBlockState(new BlockPos(x + 1.0D, y, z)).getBlock()) {
/* 31 */         world.setBlock(new BlockPos(x + 1.0D, y, z), Blocks.AIR.defaultBlockState(), 3);
/*    */       }
/* 33 */       if (Blocks.BARRIER == world.getBlockState(new BlockPos(x + 1.0D, y + 1.0D, z)).getBlock()) {
/* 34 */         world.setBlock(new BlockPos(x + 1.0D, y + 1.0D, z), Blocks.AIR.defaultBlockState(), 3);
/*    */       }
/* 36 */       if (Blocks.BARRIER == world.getBlockState(new BlockPos(x - 1.0D, y + 1.0D, z)).getBlock()) {
/* 37 */         world.setBlock(new BlockPos(x - 1.0D, y + 1.0D, z), Blocks.AIR.defaultBlockState(), 3);
/*    */       }
/* 39 */       if (Blocks.BARRIER == world.getBlockState(new BlockPos(x, y + 1.0D, z)).getBlock()) {
/* 40 */         world.setBlock(new BlockPos(x, y + 1.0D, z), Blocks.AIR.defaultBlockState(), 3);
/*    */       }
/* 42 */       if (Blocks.BARRIER == world.getBlockState(new BlockPos(x, y + 1.0D, z - 1.0D)).getBlock()) {
/* 43 */         world.setBlock(new BlockPos(x, y + 1.0D, z - 1.0D), Blocks.AIR.defaultBlockState(), 3);
/*    */       }
/* 45 */       if (Blocks.BARRIER == world.getBlockState(new BlockPos(x, y + 1.0D, z + 1.0D)).getBlock()) {
/* 46 */         world.setBlock(new BlockPos(x, y + 1.0D, z + 1.0D), Blocks.AIR.defaultBlockState(), 3);
/*    */       }
/* 48 */       if (Blocks.BARRIER == world.getBlockState(new BlockPos(x, y, z - 1.0D)).getBlock()) {
/* 49 */         world.setBlock(new BlockPos(x, y, z - 1.0D), Blocks.AIR.defaultBlockState(), 3);
/*    */       }
/* 51 */       if (Blocks.BARRIER == world.getBlockState(new BlockPos(x, y, z + 1.0D)).getBlock()) {
/* 52 */         world.setBlock(new BlockPos(x, y, z + 1.0D), Blocks.AIR.defaultBlockState(), 3);
/*    */       }
/* 54 */       if (world instanceof Level) { Level _level = (Level)world;
/* 55 */         if (!_level.isClientSide()) {
/* 56 */           _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:approve_beep")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */         } else {
/*    */           
/* 59 */           _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:approve_beep")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */         }  }
/*    */ 
/*    */       
/* 63 */       if (world instanceof Level) { Level _level = (Level)world;
/* 64 */         if (!_level.isClientSide()) {
/* 65 */           _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_door.open")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */         } else {
/*    */           
/* 68 */           _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_door.open")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */         }  }
/*    */ 
/*    */ 
/*    */       
/* 73 */       BlockPos _bp = new BlockPos(x, y, z);
/* 74 */       BlockState _bs = ((Block)LatexModBlocks.LAB_DOOR_OPEN.get()).defaultBlockState();
/* 75 */       BlockState _bso = world.getBlockState(_bp);
/* 76 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 77 */         Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 78 */         if (_property != null && _bs.getValue(_property) != null) {
/*    */           try {
/* 80 */             _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 81 */           } catch (Exception exception) {}
/*    */         } }
/*    */       
/* 84 */       world.setBlock(_bp, _bs, 3);
/*    */        }
/*    */     
/* 87 */     else if (world instanceof Level) { Level _level = (Level)world;
/* 88 */       if (!_level.isClientSide()) {
/* 89 */         _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:deny_beep")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */       } else {
/*    */         
/* 92 */         _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:deny_beep")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\LabDoorOnBlockRightClickedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */