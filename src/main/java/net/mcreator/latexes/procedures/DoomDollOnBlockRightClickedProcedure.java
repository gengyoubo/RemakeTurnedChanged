/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class DoomDollOnBlockRightClickedProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z) {
/* 14 */     if (world instanceof Level) { Level _level = (Level)world;
/* 15 */       if (!_level.isClientSide()) {
/* 16 */         _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS
/* 17 */             .getValue(new ResourceLocation("latex:the_only_thing_they_fear_is_you")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */       } else {
/*    */         
/* 20 */         _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:the_only_thing_they_fear_is_you")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */       }  }
/*    */ 
/*    */ 
/*    */     
/* 25 */     BlockPos _pos = new BlockPos(x, y, z);
/* 26 */     Block.dropResources(world.getBlockState(_pos), world, new BlockPos(x, y, z), null);
/* 27 */     world.destroyBlock(_pos, false);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\DoomDollOnBlockRightClickedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */