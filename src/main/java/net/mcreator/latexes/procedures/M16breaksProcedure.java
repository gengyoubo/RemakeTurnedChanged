/*    */ package net.mcreator.latexes.procedures;
/*    */ 
/*    */ import javax.annotation.Nullable;
/*    */ import net.mcreator.latexes.init.LatexModItems;
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
/*    */ 
/*    */ @EventBusSubscriber
/*    */ public class M16breaksProcedure
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void onItemDestroyed(PlayerDestroyItemEvent event) {
/* 22 */     execute((Event)event, (Entity)event.getPlayer());
/*    */   }
/*    */   
/*    */   public static void execute(Entity entity) {
/* 26 */     execute(null, entity);
/*    */   }
/*    */   
/*    */   private static void execute(@Nullable Event event, Entity entity) {
/* 30 */     if (entity == null)
/*    */       return; 
/* 32 */     LivingEntity _livEnt = (LivingEntity)entity; if (((entity instanceof LivingEntity) ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.M_4_ASSAULT_RIFLE
/* 33 */       .get() && 
/* 34 */       entity instanceof LivingEntity) { LivingEntity _entity = (LivingEntity)entity;
/* 35 */       ItemStack _setstack = new ItemStack((ItemLike)LatexModItems.BROKENM_16.get());
/* 36 */       _setstack.setCount(1);
/* 37 */       _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
/* 38 */       if (_entity instanceof Player) { Player _player = (Player)_entity;
/* 39 */         _player.getInventory().setChanged(); }
/*    */        }
/*    */   
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\procedures\M16breaksProcedure.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */