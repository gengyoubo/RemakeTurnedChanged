package net.ltxprogrammer.turned.init;

import net.ltxprogrammer.turned.client.particle.DleffectparticlesParticle;
import net.minecraft.client.Minecraft;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/init/LatexModParticles.class */
public class LatexModParticles {
    @SubscribeEvent
    public static void registerParticles(ParticleFactoryRegisterEvent event) {
        Minecraft.getInstance().particleEngine.register((SimpleParticleType) LatexModParticleTypes.DLEFFECTPARTICLES.get(), DleffectparticlesParticle::provider);
    }
}
