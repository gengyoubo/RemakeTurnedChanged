/*    */ package net.ltxprogrammer.turned.init;
/*    */ 
/*    */ import net.minecraft.core.particles.ParticleType;
/*    */ import net.minecraft.core.particles.SimpleParticleType;
/*    */ import net.minecraftforge.registries.DeferredRegister;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ import net.minecraftforge.registries.RegistryObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class LatexModParticleTypes
/*    */ {
/* 16 */   public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, "turned");
/* 17 */   public static final RegistryObject<ParticleType<?>> DLEFFECTPARTICLES = REGISTRY.register("dleffectparticles", () -> new SimpleParticleType(false));
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\init\LatexModParticleTypes.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */