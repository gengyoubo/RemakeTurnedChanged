/*    */ package net.ltxprogrammer.turned.init;
/*    */ 
/*    */ import java.util.HashMap;
/*    */ import java.util.Map;
/*    */ import net.minecraft.resources.ResourceLocation;
/*    */ import net.minecraft.sounds.SoundEvent;
/*    */ import net.minecraftforge.event.RegistryEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/*    */ public class LatexModSounds
/*    */ {
/* 19 */   public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap<>();
/*    */   static {
/* 21 */     REGISTRY.put(new ResourceLocation("turned", "computer_on"), new SoundEvent(new ResourceLocation("turned", "computer_on")));
/* 22 */     REGISTRY.put(new ResourceLocation("turned", "dart_shot"), new SoundEvent(new ResourceLocation("turned", "dart_shot")));
/* 23 */     REGISTRY.put(new ResourceLocation("turned", "puro_the_block_music"), new SoundEvent(new ResourceLocation("turned", "puro_the_block_music")));
/* 24 */     REGISTRY.put(new ResourceLocation("turned", "burp"), new SoundEvent(new ResourceLocation("turned", "burp")));
/* 25 */     REGISTRY.put(new ResourceLocation("turned", "robot_burp"), new SoundEvent(new ResourceLocation("turned", "robot_burp")));
/* 26 */     REGISTRY.put(new ResourceLocation("turned", "death_beep"), new SoundEvent(new ResourceLocation("turned", "death_beep")));
/* 27 */     REGISTRY.put(new ResourceLocation("turned", "robot_beep"), new SoundEvent(new ResourceLocation("turned", "robot_beep")));
/* 28 */     REGISTRY.put(new ResourceLocation("turned", "gunshot"), new SoundEvent(new ResourceLocation("turned", "gunshot")));
/* 29 */     REGISTRY.put(new ResourceLocation("turned", "gas_mask_wear"), new SoundEvent(new ResourceLocation("turned", "gas_mask_wear")));
/* 30 */     REGISTRY.put(new ResourceLocation("turned", "deny_beep"), new SoundEvent(new ResourceLocation("turned", "deny_beep")));
/* 31 */     REGISTRY.put(new ResourceLocation("turned", "approve_beep"), new SoundEvent(new ResourceLocation("turned", "approve_beep")));
/* 32 */     REGISTRY.put(new ResourceLocation("turned", "click_noise"), new SoundEvent(new ResourceLocation("turned", "click_noise")));
/* 33 */     REGISTRY.put(new ResourceLocation("turned", "rifle_shot"), new SoundEvent(new ResourceLocation("turned", "rifle_shot")));
/* 34 */     REGISTRY.put(new ResourceLocation("turned", "tank_shot"), new SoundEvent(new ResourceLocation("turned", "tank_shot")));
/* 35 */     REGISTRY.put(new ResourceLocation("turned", "silenced_shot"), new SoundEvent(new ResourceLocation("turned", "silenced_shot")));
/* 36 */     REGISTRY.put(new ResourceLocation("turned", "shotgun-blast"), new SoundEvent(new ResourceLocation("turned", "shotgun-blast")));
/* 37 */     REGISTRY.put(new ResourceLocation("turned", "latex_tune"), new SoundEvent(new ResourceLocation("turned", "latex_tune")));
/* 38 */     REGISTRY.put(new ResourceLocation("turned", "armageddon"), new SoundEvent(new ResourceLocation("turned", "armageddon")));
/* 39 */     REGISTRY.put(new ResourceLocation("turned", "the_only_thing_they_fear_is_you"), new SoundEvent(new ResourceLocation("turned", "the_only_thing_they_fear_is_you")));
/*    */     
/* 41 */     REGISTRY.put(new ResourceLocation("turned", "musket_fire"), new SoundEvent(new ResourceLocation("turned", "musket_fire")));
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
/* 46 */     for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
/* 47 */       event.getRegistry().register(((SoundEvent)sound.getValue()).setRegistryName(sound.getKey())); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\init\LatexModSounds.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */