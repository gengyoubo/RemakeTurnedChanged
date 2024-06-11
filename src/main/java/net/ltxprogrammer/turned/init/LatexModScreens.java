/*    */ package net.ltxprogrammer.turned.init;
/*    */ 
/*    */ import net.minecraft.client.gui.screens.MenuScreens;
/*    */ import net.minecraftforge.api.distmarker.Dist;
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
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
/*    */ public class LatexModScreens
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void clientLoad(FMLClientSetupEvent event) {
/* 24 */     event.enqueueWork(() -> {
/*    */           MenuScreens.m_96206_(LatexModMenus.BOXGUI, net.ltxprogrammer.turned.client.gui.BoxguiScreen::new);
/*    */           MenuScreens.m_96206_(LatexModMenus.LOCKER_GUI, net.ltxprogrammer.turned.client.gui.LockerGUIScreen::new);
/*    */           MenuScreens.m_96206_(LatexModMenus.CRATEGUI, net.ltxprogrammer.turned.client.gui.CrateguiScreen::new);
/*    */           MenuScreens.m_96206_(LatexModMenus.SUPPLY_CRATE_GUI, net.ltxprogrammer.turned.client.gui.SupplyCrateGuiScreen::new);
/*    */           MenuScreens.m_96206_(LatexModMenus.SMALLBOXGUI, net.ltxprogrammer.turned.client.gui.SmallboxguiScreen::new);
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\init\LatexModScreens.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */