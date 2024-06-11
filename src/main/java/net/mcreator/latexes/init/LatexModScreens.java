package net.mcreator.latexes.init;

import net.mcreator.latexes.client.gui.BoxguiScreen;
import net.mcreator.latexes.client.gui.CrateguiScreen;
import net.mcreator.latexes.client.gui.LockerGUIScreen;
import net.mcreator.latexes.client.gui.SmallboxguiScreen;
import net.mcreator.latexes.client.gui.SupplyCrateGuiScreen;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/init/LatexModScreens.class */
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
