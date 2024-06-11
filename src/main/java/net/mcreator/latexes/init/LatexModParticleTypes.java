/*    */ package net.mcreator.latexes.init;
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
/*    */ 
/*    */ public class LatexModParticleTypes
/*    */ {
/* 17 */   public static final DeferredRegister<ParticleType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.PARTICLE_TYPES, "latex");
/* 18 */   public static final RegistryObject<ParticleType<?>> DLEFFECTPARTICLES = REGISTRY.register("dleffectparticles", () -> new SimpleParticleType(false));
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\init\LatexModParticleTypes.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */