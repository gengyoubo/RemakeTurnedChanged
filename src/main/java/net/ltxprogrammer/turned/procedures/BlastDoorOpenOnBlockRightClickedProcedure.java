/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import com.google.common.collect.UnmodifiableIterator;
/*    */ import java.util.Map;
/*    */ import net.ltxprogrammer.turned.init.LatexModBlocks;
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
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
/*    */ public class BlastDoorOpenOnBlockRightClickedProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 22 */     if (entity == null)
/*    */       return; 
/* 24 */     LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.m_21205_() : ItemStack.f_41583_).m_41720_() == LatexModItems.KEYCARD.get())
/* 25 */     { if (world instanceof Level) { Level _level = (Level)world;
/* 26 */         if (!_level.m_5776_()) {
/* 27 */           _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:approve_beep")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */         } else {
/*    */           
/* 30 */           _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:approve_beep")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */         }  }
/*    */ 
/*    */       
/* 34 */       if (world instanceof Level) { Level _level = (Level)world;
/* 35 */         if (!_level.m_5776_()) {
/* 36 */           _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_door.open")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */         } else {
/*    */           
/* 39 */           _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_door.open")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */         }  }
/*    */ 
/*    */ 
/*    */       
/* 44 */       BlockPos _bp = new BlockPos(x, y, z);
/* 45 */       BlockState _bs = ((Block)LatexModBlocks.BLASTDOOR.get()).m_49966_();
/* 46 */       BlockState _bso = world.m_8055_(_bp);
/* 47 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 48 */         Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 49 */         if (_property != null && _bs.m_61143_(_property) != null) {
/*    */           try {
/* 51 */             _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 52 */           } catch (Exception exception) {}
/*    */         } }
/*    */       
/* 55 */       world.m_7731_(_bp, _bs, 3);
/*    */        }
/*    */     
/* 58 */     else if (world instanceof Level) { Level _level = (Level)world;
/* 59 */       if (!_level.m_5776_()) {
/* 60 */         _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:deny_beep")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */       } else {
/*    */         
/* 63 */         _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:deny_beep")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\BlastDoorOpenOnBlockRightClickedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */