/*    */ package net.mcreator.latexes.init;
/*    */ 
/*    */ import net.mcreator.latexes.LatexMod;
/*    */ import net.mcreator.latexes.network.ReloadkeyMessage;
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
/* 24 */   public static final KeyMapping RELOADKEY = new KeyMapping("key.latex.reloadkey", 82, "key.categories.gameplay");
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
/* 35 */       if ((Minecraft.getInstance()).screen == null && 
/* 36 */         event.getKey() == LatexModKeyMappings.RELOADKEY.getKey().getValue() && 
/* 37 */         event.getAction() == 1) {
/* 38 */         LatexMod.PACKET_HANDLER.sendToServer(new ReloadkeyMessage(0, 0));
/* 39 */         ReloadkeyMessage.pressAction((Player)(Minecraft.getInstance()).player, 0, 0);
/*    */       } 
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\init\LatexModKeyMappings.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */