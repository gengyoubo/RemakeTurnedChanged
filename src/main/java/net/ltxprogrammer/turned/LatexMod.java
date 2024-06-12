package net.ltxprogrammer.turned;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;
import net.ltxprogrammer.turned.init.LatexModBlockEntities;
import net.ltxprogrammer.turned.init.LatexModBlocks;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.ltxprogrammer.turned.init.LatexModFeatures;
import net.ltxprogrammer.turned.init.LatexModItems;
import net.ltxprogrammer.turned.init.LatexModMobEffects;
import net.ltxprogrammer.turned.init.LatexModParticleTypes;
import net.ltxprogrammer.turned.init.LatexModPotions;
import net.ltxprogrammer.turned.init.LatexModTabs;
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

@Mod(LatexMod.MODID)
/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/LatexMod.class */
public class LatexMod {
    public static final Logger LOGGER = LogManager.getLogger(LatexMod.class);
    public static final String MODID = "turned";
    private static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation(MODID, MODID), () -> {
        return PROTOCOL_VERSION;
    }, (v1) -> {
        return r2.equals(v1);
    }, (v1) -> {
        return r3.equals(v1);
    });
    private static int messageID = 0;

    public LatexMod() {
        LatexModTabs.load();
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        LatexModBlocks.REGISTRY.register(bus);
        LatexModItems.REGISTRY.register(bus);
        LatexModEntities.REGISTRY.register(bus);
        LatexModBlockEntities.REGISTRY.register(bus);
        LatexModFeatures.REGISTRY.register(bus);
        LatexModMobEffects.REGISTRY.register(bus);
        LatexModPotions.REGISTRY.register(bus);
        LatexModParticleTypes.REGISTRY.register(bus);
    }

    public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
        PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
        messageID++;
    }

    public static ResourceLocation modResource(String path) {
        return new ResourceLocation(MODID, path);
    }
}
