/*    */ package net.mcreator.latexes.procedures;
/*    */ import com.google.common.collect.UnmodifiableIterator;
/*    */ import java.util.Map;
/*    */ import net.mcreator.latexes.init.LatexModBlocks;
/*    */ import net.mcreator.latexes.init.LatexModItems;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ import net.minecraftforge.items.ItemHandlerHelper;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class TelephoneOnBlockRightClickedProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 24 */     if (entity == null)
/*    */       return; 
/* 26 */     if (entity instanceof Player) { Player _player = (Player)entity;
/* 27 */       ItemStack _setstack = new ItemStack((ItemLike)LatexModItems.PHONE.get());
/* 28 */       _setstack.setCount(1);
/* 29 */       ItemHandlerHelper.giveItemToPlayer(_player, _setstack); }
/*    */     
/* 31 */     if (world instanceof Level) { Level _level = (Level)world;
/* 32 */       if (!_level.isClientSide()) {
/* 33 */         _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:click_noise")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */       } else {
/*    */         
/* 36 */         _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:click_noise")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */       }  }
/*    */ 
/*    */ 
/*    */     
/* 41 */     BlockPos _bp = new BlockPos(x, y, z);
/* 42 */     BlockState _bs = ((Block)LatexModBlocks.TELEPHONENOPHONE.get()).defaultBlockState();
/* 43 */     BlockState _bso = world.getBlockState(_bp);
/* 44 */     for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.getValues().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 45 */       Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
/* 46 */       if (_property != null && _bs.getValue(_property) != null) {
/*    */         try {
/* 48 */           _bs = (BlockState)_bs.setValue(_property, entry.getValue());
/* 49 */         } catch (Exception exception) {}
/*    */       } }
/*    */     
/* 52 */     world.setBlock(_bp, _bs, 3);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\TelephoneOnBlockRightClickedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */