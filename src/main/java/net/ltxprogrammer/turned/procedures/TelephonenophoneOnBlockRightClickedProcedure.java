/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import com.google.common.collect.UnmodifiableIterator;
/*    */ import java.util.Map;
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraft.world.level.block.Block;
/*    */ import net.minecraft.world.level.block.state.BlockState;
/*    */ import net.minecraft.world.level.block.state.properties.Property;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class TelephonenophoneOnBlockRightClickedProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 23 */     if (entity == null)
/*    */       return; 
/* 25 */     LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.m_21205_() : ItemStack.f_41583_).m_41720_() == LatexModItems.PHONE.get()) {
/* 26 */       if (entity instanceof Player) { Player _player = (Player)entity;
/* 27 */         ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.PHONE.get());
/* 28 */         _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_
/* 29 */             .m_39730_()); }
/*    */       
/* 31 */       if (world instanceof Level) { Level _level = (Level)world;
/* 32 */         if (!_level.m_5776_()) {
/* 33 */           _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:click_noise")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */         } else {
/*    */           
/* 36 */           _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:click_noise")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */         }  }
/*    */ 
/*    */ 
/*    */       
/* 41 */       BlockPos _bp = new BlockPos(x, y, z);
/* 42 */       BlockState _bs = ((Block)LatexModBlocks.TELEPHONE.get()).m_49966_();
/* 43 */       BlockState _bso = world.m_8055_(_bp);
/* 44 */       for (UnmodifiableIterator<Map.Entry<Property<?>, Comparable<?>>> unmodifiableIterator = _bso.m_61148_().entrySet().iterator(); unmodifiableIterator.hasNext(); ) { Map.Entry<Property<?>, Comparable<?>> entry = unmodifiableIterator.next();
/* 45 */         Property _property = _bs.m_60734_().m_49965_().m_61081_(((Property)entry.getKey()).m_61708_());
/* 46 */         if (_property != null && _bs.m_61143_(_property) != null) {
/*    */           try {
/* 48 */             _bs = (BlockState)_bs.m_61124_(_property, entry.getValue());
/* 49 */           } catch (Exception exception) {}
/*    */         } }
/*    */       
/* 52 */       world.m_7731_(_bp, _bs, 3);
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\TelephonenophoneOnBlockRightClickedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */