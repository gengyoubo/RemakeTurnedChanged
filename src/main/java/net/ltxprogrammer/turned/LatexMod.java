/*    */ package net.ltxprogrammer.turned;
/*    */ 
/*    */ import java.util.function.BiConsumer;
/*    */ import java.util.function.Function;
/*    */ import java.util.function.Supplier;
/*    */ import net.ltxprogrammer.turned.init.LatexModBlockEntities;
/*    */ import net.ltxprogrammer.turned.init.LatexModBlocks;
/*    */ import net.ltxprogrammer.turned.init.LatexModEntities;
/*    */ import net.ltxprogrammer.turned.init.LatexModFeatures;
/*    */ import net.ltxprogrammer.turned.init.LatexModItems;
/*    */ import net.ltxprogrammer.turned.init.LatexModMobEffects;
/*    */ import net.ltxprogrammer.turned.init.LatexModParticleTypes;
/*    */ import net.ltxprogrammer.turned.init.LatexModPotions;
/*    */ import net.ltxprogrammer.turned.init.LatexModTabs;
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraftforge.eventbus.api.IEventBus;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
/*    */ import net.minecraftforge.network.NetworkEvent;
/*    */ import net.minecraftforge.network.NetworkRegistry;
/*    */ import net.minecraftforge.network.simple.SimpleChannel;
/*    */ import org.apache.logging.log4j.LogManager;
/*    */ import org.apache.logging.log4j.Logger;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Mod("turned")
/*    */ public class LatexMod
/*    */ {
/* 37 */   public static final Logger LOGGER = LogManager.getLogger(LatexMod.class);
/*    */   public static final String MODID = "turned";
/*    */   private static final String PROTOCOL_VERSION = "1";
/* 40 */   public static final SimpleChannel PACKET_HANDLER = NetworkRegistry.newSimpleChannel(new ResourceLocation("turned", "turned"), () -> "1", "1"::equals, "1"::equals);
/*    */   
/* 42 */   private static int messageID = 0;
/*    */   
/*    */   public LatexMod() {
/* 45 */     LatexModTabs.load();
/* 46 */     IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
/* 47 */     LatexModBlocks.REGISTRY.register(bus);
/* 48 */     LatexModItems.REGISTRY.register(bus);
/* 49 */     LatexModEntities.REGISTRY.register(bus);
/* 50 */     LatexModBlockEntities.REGISTRY.register(bus);
/* 51 */     LatexModFeatures.REGISTRY.register(bus);
/*    */     
/* 53 */     LatexModMobEffects.REGISTRY.register(bus);
/* 54 */     LatexModPotions.REGISTRY.register(bus);
/* 55 */     LatexModParticleTypes.REGISTRY.register(bus);
/*    */   }
/*    */ 
/*    */   
/*    */   public static <T> void addNetworkMessage(Class<T> messageType, BiConsumer<T, FriendlyByteBuf> encoder, Function<FriendlyByteBuf, T> decoder, BiConsumer<T, Supplier<NetworkEvent.Context>> messageConsumer) {
/* 60 */     PACKET_HANDLER.registerMessage(messageID, messageType, encoder, decoder, messageConsumer);
/* 61 */     messageID++;
/*    */   }
/*    */   
/*    */   public static ResourceLocation modResource(String path) {
/* 65 */     return new ResourceLocation("turned", path);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\LatexMod.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */