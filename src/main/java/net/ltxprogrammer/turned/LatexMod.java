//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;

import net.ltxprogrammer.turned.init.*;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.network.NetworkEvent;
import net.minecraftforge.network.NetworkRegistry;
import net.minecraftforge.network.simple.SimpleChannel;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("turned")
public class LatexMod {
    public static final Logger LOGGER = LogManager.getLogger(LatexMod.class);
    public static final String MODID = "turned";
    private static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation("turned", "turned"), () -> "1", "1"::equals, "1"::equals);
    private static int messageID = 0;

    public LatexMod() {
        LatexModTabs.load();
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        LatexModBlocks.REGISTRY.register(bus);
        LatexModItems.REGISTRY.register(bus);
        LatexModEntitiesCREATURES.REGISTRY.register(bus);
        LatexModEntitiesMISC.REGISTRY.register(bus);
        LatexModEntitiesMONSTER.REGISTRY.register(bus);
        LatexModBlockEntities.REGISTRY.register(bus);
        LatexModFeatures.REGISTRY.register(bus);
        LatexModMobEffects.REGISTRY.register(bus);
        LatexModPotions.REGISTRY.register(bus);
        LatexModParticleTypes.REGISTRY.register(bus);
    }

    public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
        PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
        ++messageID;
    }

    public static ResourceLocation modResource(String path) {
        return new ResourceLocation("turned", path);
    }
}
