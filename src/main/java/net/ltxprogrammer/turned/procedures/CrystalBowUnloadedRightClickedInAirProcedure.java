/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.EquipmentSlot;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraftforge.items.ItemHandlerHelper;
/*    */ 
/*    */ public class CrystalBowUnloadedRightClickedInAirProcedure {
/*    */   public static void execute(Entity entity) {
/* 14 */     if (entity == null)
/*    */       return; 
/* 16 */     LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.m_21206_() : ItemStack.f_41583_).m_41720_() == LatexModItems.CRYSTALARROW.get())
/* 17 */     { if (entity instanceof Player) { Player _player = (Player)entity;
/* 18 */         ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.CRYSTAL_BOW_UNLOADED.get());
/* 19 */         _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_
/* 20 */             .m_39730_()); }
/*    */       
/* 22 */       if (entity instanceof Player) { Player _player = (Player)entity;
/* 23 */         ItemStack _setstack = new ItemStack((ItemLike)LatexModItems.CRYSTALBOW.get());
/* 24 */         _setstack.m_41764_(1);
/* 25 */         ItemHandlerHelper.giveItemToPlayer(_player, _setstack); }
/*    */        }
/* 27 */     else { LivingEntity _entGetArmor = (LivingEntity)entity;
/*    */       
/* 29 */       Player _playerHasItem = (Player)entity; if (((entity instanceof LivingEntity) ? _entGetArmor.m_6844_(EquipmentSlot.CHEST) : ItemStack.f_41583_).m_41720_() == LatexModItems.DARK_LATEX_QUIVER_CHESTPLATE.get() && entity instanceof Player && _playerHasItem.m_150109_().m_36063_(new ItemStack((ItemLike)LatexModItems.CRYSTALARROW.get()))) {
/* 30 */         if (entity instanceof Player) { Player _player = (Player)entity;
/* 31 */           ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.CRYSTAL_BOW_UNLOADED.get());
/* 32 */           _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_
/* 33 */               .m_39730_()); }
/*    */         
/* 35 */         if (entity instanceof Player) { Player _player = (Player)entity;
/* 36 */           ItemStack _setstack = new ItemStack((ItemLike)LatexModItems.CRYSTALBOW.get());
/* 37 */           _setstack.m_41764_(1);
/* 38 */           ItemHandlerHelper.giveItemToPlayer(_player, _setstack); }
/*    */       
/*    */       }  }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\CrystalBowUnloadedRightClickedInAirProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */