package net.ltxprogrammer.turned.init;

import net.ltxprogrammer.turned.LatexMod;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/init/LatexModPotions.class */
public class LatexModPotions {
    public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, LatexMod.MODID);
    public static final RegistryObject<Potion> DARKLATEXDARTEFFECT = REGISTRY.register("darklatexdarteffect", () -> new Potion(new MobEffectInstance[]{new MobEffectInstance((MobEffect) LatexModMobEffects.DARKLATEXDARTEFFECT.get(), 3600, 0, false, true)}));
}
