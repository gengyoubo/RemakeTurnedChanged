/*    */ package net.ltxprogrammer.turned.init;
/*    */ 
/*    */ import net.ltxprogrammer.turned.LatexMod;
/*    */ import net.ltxprogrammer.turned.network.ReloadkeyMessage;
/*    */ import net.minecraft.client.KeyMapping;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.client.ClientRegistry;
/*    */ import net.minecraftforge.client.event.InputEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
/*    */ public class LatexModKeyMappings
/*    */ {
/* 24 */   public static final KeyMapping RELOADKEY = new KeyMapping("key.turned.reloadkey", 82, "key.categories.gameplay");
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void registerKeyBindings(FMLClientSetupEvent event) {
/* 28 */     ClientRegistry.registerKeyBinding(RELOADKEY);
/*    */   }
/*    */   
/*    */   @EventBusSubscriber({Dist.CLIENT})
/*    */   public static class KeyEventListener {
/*    */     @SubscribeEvent
/*    */     public static void onKeyInput(InputEvent.KeyInputEvent event) {
/* 35 */       if ((Minecraft.m_91087_()).f_91080_ == null && 
/* 36 */         event.getKey() == LatexModKeyMappings.RELOADKEY.getKey().m_84873_() && 
/* 37 */         event.getAction() == 1) {
/* 38 */         LatexMod.PACKET_HANDLER.sendToServer(new ReloadkeyMessage(0, 0));
/* 39 */         ReloadkeyMessage.pressAction((Player)(Minecraft.m_91087_()).f_91074_, 0, 0);
/*    */       } 
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\init\LatexModKeyMappings.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */