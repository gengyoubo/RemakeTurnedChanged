/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraftforge.items.ItemHandlerHelper;
/*    */ 
/*    */ public class DartrifleCanUseRangedItemProcedure {
/*    */   public static boolean execute(Entity entity, ItemStack itemstack) {
/* 13 */     if (entity == null)
/* 14 */       return false; 
/* 15 */     LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.m_21206_() : ItemStack.f_41583_).m_41720_() == LatexModItems.LATEXDART.get()) {
/* 16 */       if (entity instanceof Player) { Player _player = (Player)entity;
/* 17 */         ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.DARTRIFLE.get());
/* 18 */         _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_
/* 19 */             .m_39730_()); }
/*    */       
/* 21 */       if (entity instanceof Player) { Player _player = (Player)entity;
/* 22 */         ItemStack _setstack = new ItemStack((ItemLike)LatexModItems.LATEX_DART_RIFLE.get());
/* 23 */         _setstack.m_41764_(1);
/* 24 */         ItemHandlerHelper.giveItemToPlayer(_player, _setstack); }
/*    */     
/*    */     } 
/* 27 */     return (itemstack.m_41784_().m_128459_("ammo") > 0.0D);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\DartrifleCanUseRangedItemProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */