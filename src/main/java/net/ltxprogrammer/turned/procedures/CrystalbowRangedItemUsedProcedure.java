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
/*    */ public class CrystalbowRangedItemUsedProcedure {
/*    */   public static void execute(Entity entity, ItemStack itemstack) {
/* 14 */     if (entity == null)
/*    */       return; 
/* 16 */     if (entity instanceof Player) { Player _player = (Player)entity;
/* 17 */       _player.m_36335_().m_41524_(itemstack.m_41720_(), 25); }
/* 18 */      LivingEntity _entGetArmor = (LivingEntity)entity;
/*    */     
/* 20 */     Player _playerHasItem = (Player)entity; if (((((entity instanceof LivingEntity) ? _entGetArmor.m_6844_(EquipmentSlot.CHEST) : ItemStack.f_41583_).m_41720_() == LatexModItems.DARK_LATEX_QUIVER_CHESTPLATE.get() && entity instanceof Player && _playerHasItem.m_150109_().m_36063_(new ItemStack((ItemLike)LatexModItems.CRYSTALARROW.get()))) ? true : false) != true) {
/* 21 */       if (entity instanceof Player) { Player _player = (Player)entity;
/* 22 */         _player.m_36335_().m_41524_(itemstack.m_41720_(), 25); }
/* 23 */        if (entity instanceof Player) { Player _player = (Player)entity;
/* 24 */         ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.CRYSTALBOW.get());
/* 25 */         _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_
/* 26 */             .m_39730_()); }
/*    */       
/* 28 */       if (entity instanceof Player) { Player _player = (Player)entity;
/* 29 */         ItemStack _setstack = new ItemStack((ItemLike)LatexModItems.CRYSTAL_BOW_UNLOADED.get());
/* 30 */         _setstack.m_41764_(1);
/* 31 */         ItemHandlerHelper.giveItemToPlayer(_player, _setstack); }
/*    */     
/*    */     } 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\CrystalbowRangedItemUsedProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */