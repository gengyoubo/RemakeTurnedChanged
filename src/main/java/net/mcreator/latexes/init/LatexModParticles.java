/*    */ package net.mcreator.latexes.init;
/*    */ 
/*    */ import net.mcreator.latexes.client.particle.DleffectparticlesParticle;
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
/* 21 */     (Minecraft.getInstance()).particleEngine.register((ParticleType)LatexModParticleTypes.DLEFFECTPARTICLES.get(), DleffectparticlesParticle::provider);
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\init\LatexModParticles.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */