/*    */ package net.ltxprogrammer.turned.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.minecraft.world.InteractionHand;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.LivingEntity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.item.ItemStack;
/*    */ import net.minecraft.world.level.ItemLike;
/*    */ import net.minecraftforge.event.entity.player.PlayerDestroyItemEvent;
/*    */ import net.minecraftforge.eventbus.api.Event;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class M16breaksProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onItemDestroyed(PlayerDestroyItemEvent event) {
/* 21 */     execute((Event)event, (Entity)event.getPlayer());
/*    */   }
/*    */   
/*    */   public static void execute(Entity entity) {
/* 25 */     execute(null, entity);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, Entity entity) {
/* 29 */     if (entity == null)
/*    */       return; 
/* 31 */     LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.m_21205_() : ItemStack.f_41583_).m_41720_() == LatexModItems.M_4_ASSAULT_RIFLE
/* 32 */       .get() && 
/* 33 */       entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 34 */       ItemStack _setstack = new ItemStack((ItemLike)LatexModItems.BROKENM_16.get());
/* 35 */       _setstack.m_41764_(1);
/* 36 */       _entity.m_21008_(InteractionHand.MAIN_HAND, _setstack);
/* 37 */       if (_entity instanceof Player) { Player _player = (Player)_entity;
/* 38 */         _player.m_150109_().m_6596_(); }
/*    */        }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\procedures\M16breaksProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */