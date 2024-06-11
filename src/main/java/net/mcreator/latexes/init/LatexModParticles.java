package net.mcreator.latexes.init;

import net.mcreator.latexes.client.particle.DleffectparticlesParticle;
import net.minecraft.client.Minecraft;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/init/LatexModParticles.class */
public class LatexModParticles {
    @SubscribeEvent
    public static void registerParticles(ParticleFactoryRegisterEvent event) {
        Minecraft.getInstance().particleEngine.register((SimpleParticleType) LatexModParticleTypes.DLEFFECTPARTICLES.get(), DleffectparticlesParticle::provider);
    }
}
