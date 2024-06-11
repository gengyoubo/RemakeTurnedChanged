/*    */ package net.ltxprogrammer.turned.network;
/*    */ 
/*    */ import java.util.function.Function;
/*    */ import java.util.function.Supplier;
/*    */ import net.ltxprogrammer.turned.LatexMod;
/*    */ import net.ltxprogrammer.turned.procedures.ReloadkeyOnKeyPressedProcedure;
/*    */ import net.minecraft.network.FriendlyByteBuf;
/*    */ import net.minecraft.world.entity.Entity;
/*    */ import net.minecraft.world.entity.player.Player;
/*    */ import net.minecraft.world.level.Level;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
/*    */ import net.minecraftforge.network.NetworkEvent;
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/*    */ public class ReloadkeyMessage {
/*    */   int type;
/*    */   int pressedms;
/*    */   
/*    */   public ReloadkeyMessage(int type, int pressedms) {
/* 23 */     this.type = type;
/* 24 */     this.pressedms = pressedms;
/*    */   }
/*    */   
/*    */   public ReloadkeyMessage(FriendlyByteBuf buffer) {
/* 28 */     this.type = buffer.readInt();
/* 29 */     this.pressedms = buffer.readInt();
/*    */   }
/*    */   
/*    */   public static void buffer(ReloadkeyMessage message, FriendlyByteBuf buffer) {
/* 33 */     buffer.writeInt(message.type);
/* 34 */     buffer.writeInt(message.pressedms);
/*    */   }
/*    */   
/*    */   public static void handler(ReloadkeyMessage message, Supplier<NetworkEvent.Context> contextSupplier) {
/* 38 */     NetworkEvent.Context context = contextSupplier.get();
/* 39 */     context.enqueueWork(() -> pressAction((Player)context.getSender(), message.type, message.pressedms));
/*    */ 
/*    */     
/* 42 */     context.setPacketHandled(true);
/*    */   }
/*    */   
/*    */   public static void pressAction(Player entity, int type, int pressedms) {
/* 46 */     Level world = entity.f_19853_;
/* 47 */     double x = entity.m_20185_();
/* 48 */     double y = entity.m_20186_();
/* 49 */     double z = entity.m_20189_();
/*    */     
/* 51 */     if (!world.m_46805_(entity.m_142538_()))
/*    */       return; 
/* 53 */     if (type == 0)
/*    */     {
/* 55 */       ReloadkeyOnKeyPressedProcedure.execute((Entity)entity);
/*    */     }
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void registerMessage(FMLCommonSetupEvent event) {
/* 61 */     LatexMod.addNetworkMessage(ReloadkeyMessage.class, ReloadkeyMessage::buffer, ReloadkeyMessage::new, ReloadkeyMessage::handler);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\network\ReloadkeyMessage.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */