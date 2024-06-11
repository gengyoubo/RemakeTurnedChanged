/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ import net.ltxprogrammer.changed.init.ChangedItems;
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.minecraft.world.Container;
/*    */ import net.minecraft.world.effect.MobEffect;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraftforge.items.ItemHandlerHelper;
/*    */ 
/*    */ public class VaccineSyringeLivingEntityIsHitWithItemProcedure {
/*    */   public static void execute(Entity entity) {
/* 16 */     if (entity == null)
/*    */       return; 
/* 18 */     if (entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 19 */       _entity.m_7292_(new MobEffectInstance((MobEffect)LatexModMobEffects.VACCINEEFFECT.get(), 3750, 1)); }
/* 20 */      if (entity instanceof Player) { Player _player = (Player)entity;
/* 21 */       ItemStack _stktoremove = new ItemStack((ItemLike)LatexModItems.VACCINE_SYRINGE.get());
/* 22 */       _player.m_150109_().m_36022_(p -> (_stktoremove.m_41720_() == p.m_41720_()), 1, (Container)_player.f_36095_.m_39730_()); }
/*    */     
/* 24 */     if (entity instanceof Player) { Player _player = (Player)entity;
/* 25 */       ItemStack _setstack = new ItemStack((ItemLike)ChangedItems.SYRINGE.get());
/* 26 */       _setstack.m_41764_(1);
/* 27 */       ItemHandlerHelper.giveItemToPlayer(_player, _setstack); }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\VaccineSyringeLivingEntityIsHitWithItemProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */