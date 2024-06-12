package net.ltxprogrammer.turned.init;

import net.ltxprogrammer.turned.client.gui.BoxguiScreen;
import net.ltxprogrammer.turned.client.gui.CrateguiScreen;
import net.ltxprogrammer.turned.client.gui.LockerGUIScreen;
import net.ltxprogrammer.turned.client.gui.SmallboxguiScreen;
import net.ltxprogrammer.turned.client.gui.SupplyCrateGuiScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/init/LatexModScreens.class */
public class LatexModScreens {
    @SubscribeEvent
    public static void clientLoad(FMLClientSetupEvent event) {
        event.enqueueWork(() -> {
            MenuScreens.register(LatexModMenus.BOXGUI, BoxguiScreen::new);
            MenuScreens.register(LatexModMenus.LOCKER_GUI, LockerGUIScreen::new);
            MenuScreens.register(LatexModMenus.CRATEGUI, CrateguiScreen::new);
            MenuScreens.register(LatexModMenus.SUPPLY_CRATE_GUI, SupplyCrateGuiScreen::new);
            MenuScreens.register(LatexModMenus.SMALLBOXGUI, SmallboxguiScreen::new);
        });
    }
}
