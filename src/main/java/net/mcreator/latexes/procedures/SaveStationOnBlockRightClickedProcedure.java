/*    */ package net.mcreator.latexes.procedures;
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
/* 20 */     if (entity instanceof Player) { Player _plr = (Player)entity; if ((_plr.getAbilities()).instabuild)
/* 21 */       { if (world instanceof Level) { Level _level = (Level)world;
/* 22 */           if (!_level.isClientSide()) {
/* 23 */             _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:computer_on")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */           } else {
/*    */             
/* 26 */             _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:computer_on")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */           }  }
/*    */ 
/*    */ 
/*    */         
/* 31 */         Entity _ent = entity;
/* 32 */         if (!_ent.level.isClientSide() && _ent.getServer() != null) {
/* 33 */           _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "spawnpoint");
/*    */         }
/*    */         
/* 36 */         if (entity instanceof Player) { Player _player = (Player)entity; if (!_player.level.isClientSide())
/* 37 */             _player.displayClientMessage((Component)new TextComponent("Spawnpoint Set"), true);  }  return; }  }
/* 38 */      Player _playerHasItem = (Player)entity; if (entity instanceof Player && _playerHasItem.getInventory().contains(new ItemStack((ItemLike)Items.REDSTONE)))
/* 39 */     { if (world instanceof Level) { Level _level = (Level)world;
/* 40 */         if (!_level.isClientSide()) {
/* 41 */           _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:computer_on")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */         } else {
/*    */           
/* 44 */           _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:computer_on")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */         }  }
/*    */ 
/*    */       
/* 48 */       if (entity instanceof Player) { Player _player = (Player)entity;
/* 49 */         ItemStack _stktoremove = new ItemStack((ItemLike)Items.REDSTONE);
/* 50 */         _player.getInventory().clearOrCountMatchingItems(p -> (_stktoremove.getItem() == p.getItem()), 1, (Container)_player.inventoryMenu
/* 51 */             .getCraftSlots()); }
/*    */ 
/*    */       
/* 54 */       Entity _ent = entity;
/* 55 */       if (!_ent.level.isClientSide() && _ent.getServer() != null) {
/* 56 */         _ent.getServer().getCommands().performCommand(_ent.createCommandSourceStack().withSuppressedOutput().withPermission(4), "spawnpoint");
/*    */       }
/*    */       
/* 59 */       if (entity instanceof Player) { Player _player = (Player)entity; if (!_player.level.isClientSide())
/* 60 */           _player.displayClientMessage((Component)new TextComponent("Spawnpoint Set"), true);  }
/*    */        }
/* 62 */     else { if (entity instanceof Player) { Player _player = (Player)entity; if (!_player.level.isClientSide())
/* 63 */           _player.displayClientMessage((Component)new TextComponent("Not Enough Redstone"), true);  }
/* 64 */        if (world instanceof Level) { Level _level = (Level)world;
/* 65 */         if (!_level.isClientSide()) {
/* 66 */           _level.playSound(null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:deny_beep")), SoundSource.NEUTRAL, 1.0F, 1.0F);
/*    */         } else {
/*    */           
/* 69 */           _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:deny_beep")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
/*    */         }  }
/*    */        }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\SaveStationOnBlockRightClickedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */