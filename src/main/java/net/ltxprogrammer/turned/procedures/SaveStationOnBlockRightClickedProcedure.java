/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.minecraft.core.BlockPos;
/*    */ import net.minecraft.network.chat.Component;
/*    */ import net.minecraft.network.chat.TextComponent;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraft.sounds.SoundSource;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.item.Items;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraft.world.level.LevelAccessor;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ 
/*    */ public class SaveStationOnBlockRightClickedProcedure {
/*    */   public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
/* 18 */     if (entity == null)
/*    */       return; 
/* 20 */     if (entity instanceof Player) { Player _plr = (Player)entity; if ((_plr.m_150110_()).f_35937_)
/* 21 */       { if (world instanceof Level) { Level _level = (Level)world;
/* 22 */           if (!_level.m_5776_()) {
/* 23 */             _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:computer_on")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */           } else {
/*    */             
/* 26 */             _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:computer_on")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */           }  }
/*    */ 
/*    */ 
/*    */         
/* 31 */         Entity _ent = entity;
/* 32 */         if (!_ent.f_19853_.m_5776_() && _ent.m_20194_() != null) {
/* 33 */           _ent.m_20194_().m_129892_().m_82117_(_ent.m_20203_().m_81324_().m_81325_(4), "spawnpoint");
/*    */         }
/*    */         
/* 36 */         if (entity instanceof Player) { Player _player = (Player)entity; if (!_player.f_19853_.m_5776_())
/* 37 */             _player.m_5661_((Component)new TextComponent("Spawnpoint Set"), true);  }  return; }  }
/* 38 */      Player _playerHasItem = (Player)entity; if (entity instanceof Player && _playerHasItem.m_150109_().m_36063_(new ItemStack((ItemLike)Items.f_42451_)))
/* 39 */     { if (world instanceof Level) { Level _level = (Level)world;
/* 40 */         if (!_level.m_5776_()) {
/* 41 */           _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:computer_on")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */         } else {
/*    */           
/* 44 */           _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:computer_on")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */         }  }
/*    */ 
/*    */       
/* 48 */       if (entity instanceof Player) { Player _player = (Player)entity;
/* 49 */         ItemStack _stktoremove = new ItemStack((ItemLike)Items.f_42451_);
/* 50 */         _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_
/* 51 */             .m_39730_()); }
/*    */ 
/*    */       
/* 54 */       Entity _ent = entity;
/* 55 */       if (!_ent.f_19853_.m_5776_() && _ent.m_20194_() != null) {
/* 56 */         _ent.m_20194_().m_129892_().m_82117_(_ent.m_20203_().m_81324_().m_81325_(4), "spawnpoint");
/*    */       }
/*    */       
/* 59 */       if (entity instanceof Player) { Player _player = (Player)entity; if (!_player.f_19853_.m_5776_())
/* 60 */           _player.m_5661_((Component)new TextComponent("Spawnpoint Set"), true);  }
/*    */        }
/* 62 */     else { if (entity instanceof Player) { Player _player = (Player)entity; if (!_player.f_19853_.m_5776_())
/* 63 */           _player.m_5661_((Component)new TextComponent("Not Enough Redstone"), true);  }
/* 64 */        if (world instanceof Level) { Level _level = (Level)world;
/* 65 */         if (!_level.m_5776_()) {
/* 66 */           _level.m_5594_(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:deny_beep")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */         } else {
/*    */           
/* 69 */           _level.m_7785_(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:deny_beep")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */         }  }
/*    */        }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\SaveStationOnBlockRightClickedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */