package net.mcreator.latexes.init;

import net.mcreator.latexes.LatexMod;
import net.mcreator.latexes.potion.DarklatexdarteffectMobEffect;
import net.mcreator.latexes.potion.VaccineeffectMobEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/init/LatexModMobEffects.class */
public class LatexModMobEffects {
    public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, LatexMod.MODID);
    public static final RegistryObject<MobEffect> DARKLATEXDARTEFFECT = REGISTRY.register("darklatexdarteffect", () -> {
        return new DarklatexdarteffectMobEffect();
    });
    public static final RegistryObject<MobEffect> VACCINEEFFECT = REGISTRY.register("vaccineeffect", () -> {
        return new VaccineeffectMobEffect();
    });
}
