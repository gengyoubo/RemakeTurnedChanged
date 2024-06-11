package net.mcreator.latexes.init;

import net.mcreator.latexes.LatexMod;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/init/LatexModPotions.class */
public class LatexModPotions {
    public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, LatexMod.MODID);
    public static final RegistryObject<Potion> DARKLATEXDARTEFFECT = REGISTRY.register("darklatexdarteffect", () -> {
        return new Potion(new MobEffectInstance[]{new MobEffectInstance((MobEffect) LatexModMobEffects.DARKLATEXDARTEFFECT.get(), 3600, 0, false, true)});
    });
}
