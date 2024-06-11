package net.mcreator.latexes.init;

import net.mcreator.latexes.LatexMod;
import net.minecraft.core.particles.ParticleType;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/init/LatexModParticleTypes.class */
public class LatexModParticleTypes {
    public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, LatexMod.MODID);
    public static final RegistryObject<ParticleType<?>> DLEFFECTPARTICLES = REGISTRY.register("dleffectparticles", () -> {
        return new SimpleParticleType(false);
    });
}
