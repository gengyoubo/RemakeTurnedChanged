package net.mcreator.latexes.init;

import net.mcreator.latexes.LatexMod;
import net.mcreator.latexes.network.ReloadkeyMessage;
import net.minecraft.client.KeyMapping;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.ClientRegistry;
import net.minecraftforge.client.event.InputEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/init/LatexModKeyMappings.class */
public class LatexModKeyMappings {
    public static final KeyMapping RELOADKEY = new KeyMapping("key.latex.reloadkey", 82, "key.categories.gameplay");

    @SubscribeEvent
    public static void registerKeyBindings(FMLClientSetupEvent event) {
        ClientRegistry.registerKeyBinding(RELOADKEY);
    }

    @Mod.EventBusSubscriber({Dist.CLIENT})
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/init/LatexModKeyMappings$KeyEventListener.class */
    public static class KeyEventListener {
        @SubscribeEvent
        public static void onKeyInput(InputEvent.KeyInputEvent event) {
            if (Minecraft.getInstance().screen == null && event.getKey() == LatexModKeyMappings.RELOADKEY.getKey().getValue() && event.getAction() == 1) {
                LatexMod.PACKET_HANDLER.sendToServer(new ReloadkeyMessage(0, 0));
                ReloadkeyMessage.pressAction(Minecraft.getInstance().player, 0, 0);
            }
        }
    }
}
