package net.mcreator.latexes.init;

import java.util.HashMap;
import java.util.Map;
import net.mcreator.latexes.LatexMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/init/LatexModSounds.class */
public class LatexModSounds {
    public static Map<ResourceLocation, SoundEvent> REGISTRY = new HashMap();

    static {
        REGISTRY.put(new ResourceLocation(LatexMod.MODID, "computer_on"), new SoundEvent(new ResourceLocation(LatexMod.MODID, "computer_on")));
        REGISTRY.put(new ResourceLocation(LatexMod.MODID, "dart_shot"), new SoundEvent(new ResourceLocation(LatexMod.MODID, "dart_shot")));
        REGISTRY.put(new ResourceLocation(LatexMod.MODID, "puro_the_block_music"), new SoundEvent(new ResourceLocation(LatexMod.MODID, "puro_the_block_music")));
        REGISTRY.put(new ResourceLocation(LatexMod.MODID, "burp"), new SoundEvent(new ResourceLocation(LatexMod.MODID, "burp")));
        REGISTRY.put(new ResourceLocation(LatexMod.MODID, "robot_burp"), new SoundEvent(new ResourceLocation(LatexMod.MODID, "robot_burp")));
        REGISTRY.put(new ResourceLocation(LatexMod.MODID, "death_beep"), new SoundEvent(new ResourceLocation(LatexMod.MODID, "death_beep")));
        REGISTRY.put(new ResourceLocation(LatexMod.MODID, "robot_beep"), new SoundEvent(new ResourceLocation(LatexMod.MODID, "robot_beep")));
        REGISTRY.put(new ResourceLocation(LatexMod.MODID, "gunshot"), new SoundEvent(new ResourceLocation(LatexMod.MODID, "gunshot")));
        REGISTRY.put(new ResourceLocation(LatexMod.MODID, "gas_mask_wear"), new SoundEvent(new ResourceLocation(LatexMod.MODID, "gas_mask_wear")));
        REGISTRY.put(new ResourceLocation(LatexMod.MODID, "transfur"), new SoundEvent(new ResourceLocation(LatexMod.MODID, "transfur")));
        REGISTRY.put(new ResourceLocation(LatexMod.MODID, "deny_beep"), new SoundEvent(new ResourceLocation(LatexMod.MODID, "deny_beep")));
        REGISTRY.put(new ResourceLocation(LatexMod.MODID, "approve_beep"), new SoundEvent(new ResourceLocation(LatexMod.MODID, "approve_beep")));
        REGISTRY.put(new ResourceLocation(LatexMod.MODID, "click_noise"), new SoundEvent(new ResourceLocation(LatexMod.MODID, "click_noise")));
        REGISTRY.put(new ResourceLocation(LatexMod.MODID, "rifle_shot"), new SoundEvent(new ResourceLocation(LatexMod.MODID, "rifle_shot")));
        REGISTRY.put(new ResourceLocation(LatexMod.MODID, "tank_shot"), new SoundEvent(new ResourceLocation(LatexMod.MODID, "tank_shot")));
        REGISTRY.put(new ResourceLocation(LatexMod.MODID, "silenced_shot"), new SoundEvent(new ResourceLocation(LatexMod.MODID, "silenced_shot")));
        REGISTRY.put(new ResourceLocation(LatexMod.MODID, "shotgun-blast"), new SoundEvent(new ResourceLocation(LatexMod.MODID, "shotgun-blast")));
        REGISTRY.put(new ResourceLocation(LatexMod.MODID, "latex_tune"), new SoundEvent(new ResourceLocation(LatexMod.MODID, "latex_tune")));
        REGISTRY.put(new ResourceLocation(LatexMod.MODID, "armageddon"), new SoundEvent(new ResourceLocation(LatexMod.MODID, "armageddon")));
        REGISTRY.put(new ResourceLocation(LatexMod.MODID, "the_only_thing_they_fear_is_you"), new SoundEvent(new ResourceLocation(LatexMod.MODID, "the_only_thing_they_fear_is_you")));
        REGISTRY.put(new ResourceLocation(LatexMod.MODID, "musket_fire"), new SoundEvent(new ResourceLocation(LatexMod.MODID, "musket_fire")));
    }

    @SubscribeEvent
    public static void registerSounds(RegistryEvent.Register<SoundEvent> event) {
        for (Map.Entry<ResourceLocation, SoundEvent> sound : REGISTRY.entrySet()) {
            event.getRegistry().register(sound.getValue().setRegistryName(sound.getKey()));
        }
    }
}
