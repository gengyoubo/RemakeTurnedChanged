/*    */ package net.mcreator.latexes.init;
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
/*    */           MenuScreens.register(LatexModMenus.BOXGUI, net.mcreator.latexes.client.gui.BoxguiScreen::new);
/*    */           MenuScreens.register(LatexModMenus.LOCKER_GUI, net.mcreator.latexes.client.gui.LockerGUIScreen::new);
/*    */           MenuScreens.register(LatexModMenus.CRATEGUI, net.mcreator.latexes.client.gui.CrateguiScreen::new);
/*    */           MenuScreens.register(LatexModMenus.SUPPLY_CRATE_GUI, net.mcreator.latexes.client.gui.SupplyCrateGuiScreen::new);
/*    */           MenuScreens.register(LatexModMenus.SMALLBOXGUI, net.mcreator.latexes.client.gui.SmallboxguiScreen::new);
/*    */         });
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\init\LatexModScreens.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */