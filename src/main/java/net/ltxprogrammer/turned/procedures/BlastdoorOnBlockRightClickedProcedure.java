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
/*    */ import net.minecraft.world.level.block.Blocks;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class BlastdoorOnBlockRightClickedProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 23 */     if (entity == null)
/*    */       return; 
/* 25 */     LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.m_21205_() : ItemStack.f_41583_).m_41720_() == LatexModItems.KEYCARD.get())
/* 26 */     { if (Blocks.f_50375_ == world.m_8055_(new BlockPos(x - 1.0D, y, z)).m_60734_()) {
/* 27 */         world.m_7731_(new BlockPos(x - 1.0D, y, z), Blocks.f_50016_.m_49966_(), 3);
/*    */       }
/* 29 */       if (Blocks.f_50375_ == world.m_8055_(new BlockPos(x + 1.0D, y, z)).m_60734_()) {
/* 30 */         world.m_7731_(new BlockPos(x + 1.0D, y, z), Blocks.f_50016_.m_49966_(), 3);
/*    */       }
/* 32 */       if (Blocks.f_50375_ == world.m_8055_(new BlockPos(x + 1.0D, y + 1.0D, z)).m_60734_()) {
/* 33 */         world.m_7731_(new BlockPos(x + 1.0D, y + 1.0D, z), Blocks.f_50016_.m_49966_(), 3);
/*    */       }
/* 35 */       if (Blocks.f_50375_ == world.m_8055_(new BlockPos(x - 1.0D, y + 1.0D, z)).m_60734_()) {
/* 36 */         world.m_7731_(new BlockPos(x - 1.0D, y + 1.0D, z), Blocks.f_50016_.m_49966_(), 3);
/*    */       }
/* 38 */       if (Blocks.f_50375_ == world.m_8055_(new BlockPos(x, y + 1.0D, z)).m_60734_()) {
/* 39 */         world.m_7731_(new BlockPos(x, y + 1.0D, z), Blocks.f_50016_.m_49966_(), 3);
/*    */       }
/* 41 */       if (Blocks.f_50375_ == world.m_8055_(new BlockPos(x, y + 1.0D, z - 1.0D)).m_60734_()) {
/* 42 */         world.m_7731_(new BlockPos(x, y + 1.0D, z - 1.0D), Blocks.f_50016_.m_49966_(), 3);
/*    */       }
/* 44 */       if (Blocks.f_50375_ == world.m_8055_(new BlockPos(x, y + 1.0D, z + 1.0D)).m_60734_()) {
/* 45 */         world.m_7731_(new BlockPos(x, y + 1.0D, z + 1.0D), Blocks.f_50016_.m_49966_(), 3);
/*    */       }
/* 47 */       if (Blocks.f_50375_ == world.m_8055_(new BlockPos(x, y, z - 1.0D)).m_60734_()) {
/* 48 */         world.m_7731_(new BlockPos(x, y, z - 1.0D), Blocks.f_50016_.m_49966_(), 3);
/*    */       }
/* 50 */       if (Blocks.f_50375_ == world.m_8055_(new BlockPos(x, y, z + 1.0D)).m_60734_()) {
/* 51 */         world.m_7731_(new BlockPos(x, y, z + 1.0D), Blocks.f_50016_.m_49966_(), 3);
/*    */       }
/* 53 */       if (world instanceof Level) { Level _level = (Level)world;
/* 54 */         if (!_level.m_5776_()) {
/* 55 */           _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:approve_beep")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */         } else {
/*    */           
/* 58 */           _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:approve_beep")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */         }  }
/*    */ 
/*    */       
/* 62 */       if (world instanceof Level) { Level _level = (Level)world;
/* 63 */         if (!_level.m_5776_()) {
/* 64 */           _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_door.open")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */         } else {
/*    */           
/* 67 */           _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_door.open")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */         }  }
/*    */ 
/*    */ 
/*    */       
/* 72 */       BlockPos _bp = new BlockPos(x, y, z);
/* 73 */       BlockState _bs = ((Block)LatexModBlocks.BLAST_DOOR_OPEN.get()).m_49966_();
/* 74 */       BlockState _bso = world.m_8055_(_bp);
/* 75 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 76 */         Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 77 */         if (_property != null && _bs.m_61143_(_property) != null) {
/*    */           try {
/* 79 */             _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 80 */           } catch (Exception exception) {}
/*    */         } }
/*    */       
/* 83 */       world.m_7731_(_bp, _bs, 3);
/*    */        }
/*    */     
/* 86 */     else if (world instanceof Level) { Level _level = (Level)world;
/* 87 */       if (!_level.m_5776_()) {
/* 88 */         _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:deny_beep")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */       } else {
/*    */         
/* 91 */         _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:deny_beep")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\BlastdoorOnBlockRightClickedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */