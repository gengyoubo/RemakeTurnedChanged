//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes;

import java.util.function.BiConsumer;
import java.util.function.Function;
import java.util.function.Supplier;
import net.mcreator.latexes.init.LatexModBiomes;
import net.mcreator.latexes.init.LatexModBlockEntities;
import net.mcreator.latexes.init.LatexModBlocks;
import net.mcreator.latexes.init.LatexModEntities;
import net.mcreator.latexes.init.LatexModFeatures;
import net.mcreator.latexes.init.LatexModFluids;
import net.mcreator.latexes.init.LatexModItems;
import net.mcreator.latexes.init.LatexModMobEffects;
import net.mcreator.latexes.init.LatexModParticleTypes;
import net.mcreator.latexes.init.LatexModPotions;
import net.mcreator.latexes.init.LatexModTabs;
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

@Mod("latex")
public class LatexMod {
    public static final Logger LOGGER = LogManager.getLogger(LatexMod.class);
    public static final String MODID = "latex";
    private static final String PROTOCOL_VERSION = "1";
    public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation("latex", "latex"), () -> {
        return "1";
    }, "1"::equals, "1"::equals);
    private static int messageID = 0;

    public LatexMod() {
        LatexModTabs.load();
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        LatexModBlocks.REGISTRY.register(bus);
        LatexModItems.REGISTRY.register(bus);
        LatexModEntities.REGISTRY.register(bus);
        LatexModBlockEntities.REGISTRY.register(bus);
        LatexModFeatures.REGISTRY.register(bus);
        LatexModFluids.REGISTRY.register(bus);
        LatexModMobEffects.REGISTRY.register(bus);
        LatexModPotions.REGISTRY.register(bus);
        LatexModBiomes.REGISTRY.register(bus);
        LatexModParticleTypes.REGISTRY.register(bus);
    }

    public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
        PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
        ++messageID;
    }
}
