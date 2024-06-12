package net.ltxprogrammer.turned.network;

import java.util.function.Supplier;
import net.ltxprogrammer.turned.LatexMod;
import net.ltxprogrammer.turned.procedures.ReloadkeyOnKeyPressedProcedure;
import net.minecraft.network.FriendlyByteBuf;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.Level;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.network.NetworkEvent;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/network/ReloadkeyMessage.class */
public class ReloadkeyMessage {
    final int type;
    final int pressedms;

    public ReloadkeyMessage(int type, int pressedms) {
        this.type = type;
        this.pressedms = pressedms;
    }

    public ReloadkeyMessage(FriendlyByteBuf buffer) {
        this.type = buffer.readInt();
        this.pressedms = buffer.readInt();
    }

    public static void buffer(ReloadkeyMessage message, FriendlyByteBuf buffer) {
        buffer.writeInt(message.type);
        buffer.writeInt(message.pressedms);
    }

    public static void handler(ReloadkeyMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
        NetworkEvent.Context context = contextSupplier.get();
        context.enqueueWork(() -> pressAction(context.getSender(), message.type, message.pressedms));
        context.setPacketHandled(true);
    }

    public static void pressAction(Player entity, int type, int pressedms) {
        Level world = entity.level;
        entity.getX();
        entity.getY();
        entity.getZ();
        if (world.hasChunkAt(entity.blockPosition()) && type == 0) {
            ReloadkeyOnKeyPressedProcedure.execute(entity);
        }
    }

    @SubscribeEvent
    public static void registerMessage(FMLCommonSetupEvent event) {
        LatexMod.addNetworkMessage(ReloadkeyMessage.class, ReloadkeyMessage::buffer, ReloadkeyMessage::new, ReloadkeyMessage::handler);
    }
}
