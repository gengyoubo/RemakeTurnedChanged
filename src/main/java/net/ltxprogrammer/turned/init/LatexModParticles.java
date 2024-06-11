/*    */ package net.ltxprogrammer.turned.init;
/*    */ 
/*    */ import net.ltxprogrammer.turned.client.particle.DleffectparticlesParticle;
/*    */ import net.minecraft.client.Minecraft;
/*    */ import net.minecraft.core.particles.ParticleType;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.client.event.ParticleFactoryRegisterEvent;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
/*    */ public class LatexModParticles
/*    */ {
/*    */   @SubscribeEvent
/*    */   public static void registerParticles(ParticleFactoryRegisterEvent event) {
/* 21 */     (Minecraft.m_91087_()).f_91061_.m_107378_((ParticleType)LatexModParticleTypes.DLEFFECTPARTICLES.get(), DleffectparticlesParticle::provider);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\init\LatexModParticles.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */