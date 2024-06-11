/*    */ package net.ltxprogrammer.turned.init;
/*    */ 
/*    */ import net.minecraft.world.entity.decoration.Motive;
/*    */ import net.minecraftforge.event.RegistryEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/*    */ public class LatexModPaintings
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void registerMotives(RegistryEvent.Register<Motive> event) {
/* 17 */     event.getRegistry().register((new Motive(32, 32)).setRegistryName("easteregg"));
/* 18 */     event.getRegistry().register((new Motive(32, 32)).setRegistryName("painting"));
/* 19 */     event.getRegistry().register((new Motive(32, 32)).setRegistryName("painting_2"));
/* 20 */     event.getRegistry().register((new Motive(48, 32)).setRegistryName("painting_3"));
/* 21 */     event.getRegistry().register((new Motive(16, 16)).setRegistryName("painting_4"));
/* 22 */     event.getRegistry().register((new Motive(32, 32)).setRegistryName("painting_5"));
/* 23 */     event.getRegistry().register((new Motive(32, 64)).setRegistryName("painting_6"));
/* 24 */     event.getRegistry().register((new Motive(16, 16)).setRegistryName("painting_7"));
/* 25 */     event.getRegistry().register((new Motive(16, 16)).setRegistryName("painting_8"));
/* 26 */     event.getRegistry().register((new Motive(16, 16)).setRegistryName("painting_9"));
/* 27 */     event.getRegistry().register((new Motive(32, 32)).setRegistryName("painting_10"));
/* 28 */     event.getRegistry().register((new Motive(48, 32)).setRegistryName("painting_11"));
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\init\LatexModPaintings.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */