package net.ltxprogrammer.turned.init;

import net.ltxprogrammer.turned.LatexMod;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/init/LatexModParticleTypes.class */
public class LatexModParticleTypes {
    public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, LatexMod.MODID);
    public static final RegistryObject<ParticleType<?>> DLEFFECTPARTICLES = REGISTRY.register("dleffectparticles", () -> {
        return new SimpleParticleType(false);
    });
}
