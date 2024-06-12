package net.ltxprogrammer.turned.init;

import net.ltxprogrammer.turned.LatexMod;
import net.ltxprogrammer.turned.potion.DarklatexdarteffectMobEffect;
import net.ltxprogrammer.turned.potion.VaccineeffectMobEffect;
import net.minecraft.world.effect.MobEffect;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/init/LatexModMobEffects.class */
public class LatexModMobEffects {
    public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, LatexMod.MODID);
    public static final RegistryObject<MobEffect> DARKLATEXDARTEFFECT = REGISTRY.register("darklatexdarteffect", DarklatexdarteffectMobEffect::new);
    public static final RegistryObject<MobEffect> VACCINEEFFECT = REGISTRY.register("vaccineeffect", VaccineeffectMobEffect::new);
}
