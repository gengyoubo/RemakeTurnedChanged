package net.mcreator.latexes.init;

import net.minecraft.world.entity.decoration.Motive;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/init/LatexModPaintings.class */
public class LatexModPaintings {
    @SubscribeEvent
    public static void registerMotives(RegistryEvent.Register<Motive> event) {
        event.getRegistry().register(new Motive(32, 32).setRegistryName("easteregg"));
        event.getRegistry().register(new Motive(32, 32).setRegistryName("painting"));
        event.getRegistry().register(new Motive(32, 32).setRegistryName("painting_2"));
        event.getRegistry().register(new Motive(48, 32).setRegistryName("painting_3"));
        event.getRegistry().register(new Motive(16, 16).setRegistryName("painting_4"));
        event.getRegistry().register(new Motive(32, 32).setRegistryName("painting_5"));
        event.getRegistry().register(new Motive(32, 64).setRegistryName("painting_6"));
        event.getRegistry().register(new Motive(16, 16).setRegistryName("painting_7"));
        event.getRegistry().register(new Motive(16, 16).setRegistryName("painting_8"));
        event.getRegistry().register(new Motive(16, 16).setRegistryName("painting_9"));
        event.getRegistry().register(new Motive(32, 32).setRegistryName("painting_10"));
        event.getRegistry().register(new Motive(48, 32).setRegistryName("painting_11"));
    }
}
