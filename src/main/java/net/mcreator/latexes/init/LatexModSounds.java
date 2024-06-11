/*    */ package net.mcreator.latexes.init;
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
/* 21 */     REGISTRY.put(new ResourceLocation("latex", "computer_on"), new SoundEvent(new ResourceLocation("latex", "computer_on")));
/* 22 */     REGISTRY.put(new ResourceLocation("latex", "dart_shot"), new SoundEvent(new ResourceLocation("latex", "dart_shot")));
/* 23 */     REGISTRY.put(new ResourceLocation("latex", "puro_the_block_music"), new SoundEvent(new ResourceLocation("latex", "puro_the_block_music")));
/* 24 */     REGISTRY.put(new ResourceLocation("latex", "burp"), new SoundEvent(new ResourceLocation("latex", "burp")));
/* 25 */     REGISTRY.put(new ResourceLocation("latex", "robot_burp"), new SoundEvent(new ResourceLocation("latex", "robot_burp")));
/* 26 */     REGISTRY.put(new ResourceLocation("latex", "death_beep"), new SoundEvent(new ResourceLocation("latex", "death_beep")));
/* 27 */     REGISTRY.put(new ResourceLocation("latex", "robot_beep"), new SoundEvent(new ResourceLocation("latex", "robot_beep")));
/* 28 */     REGISTRY.put(new ResourceLocation("latex", "gunshot"), new SoundEvent(new ResourceLocation("latex", "gunshot")));
/* 29 */     REGISTRY.put(new ResourceLocation("latex", "gas_mask_wear"), new SoundEvent(new ResourceLocation("latex", "gas_mask_wear")));
/* 30 */     REGISTRY.put(new ResourceLocation("latex", "transfur"), new SoundEvent(new ResourceLocation("latex", "transfur")));
/* 31 */     REGISTRY.put(new ResourceLocation("latex", "deny_beep"), new SoundEvent(new ResourceLocation("latex", "deny_beep")));
/* 32 */     REGISTRY.put(new ResourceLocation("latex", "approve_beep"), new SoundEvent(new ResourceLocation("latex", "approve_beep")));
/* 33 */     REGISTRY.put(new ResourceLocation("latex", "click_noise"), new SoundEvent(new ResourceLocation("latex", "click_noise")));
/* 34 */     REGISTRY.put(new ResourceLocation("latex", "rifle_shot"), new SoundEvent(new ResourceLocation("latex", "rifle_shot")));
/* 35 */     REGISTRY.put(new ResourceLocation("latex", "tank_shot"), new SoundEvent(new ResourceLocation("latex", "tank_shot")));
/* 36 */     REGISTRY.put(new ResourceLocation("latex", "silenced_shot"), new SoundEvent(new ResourceLocation("latex", "silenced_shot")));
/* 37 */     REGISTRY.put(new ResourceLocation("latex", "shotgun-blast"), new SoundEvent(new ResourceLocation("latex", "shotgun-blast")));
/* 38 */     REGISTRY.put(new ResourceLocation("latex", "latex_tune"), new SoundEvent(new ResourceLocation("latex", "latex_tune")));
/* 39 */     REGISTRY.put(new ResourceLocation("latex", "armageddon"), new SoundEvent(new ResourceLocation("latex", "armageddon")));
/* 40 */     REGISTRY.put(new ResourceLocation("latex", "the_only_thing_they_fear_is_you"), new SoundEvent(new ResourceLocation("latex", "the_only_thing_they_fear_is_you")));
/*    */     
/* 42 */     REGISTRY.put(new ResourceLocation("latex", "musket_fire"), new SoundEvent(new ResourceLocation("latex", "musket_fire")));
/*    */   }
/*    */   
/*    */   @SubscribeEvent
/*    */   public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
/* 47 */     for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet())
/* 48 */       event.getRegistry().register(((SoundEvent)sound.getValue()).setRegistryName(sound.getKey())); 
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\init\LatexModSounds.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */