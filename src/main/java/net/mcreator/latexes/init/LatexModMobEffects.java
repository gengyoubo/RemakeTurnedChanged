/*    */ package net.mcreator.latexes.init;
/*    */ 
/*    */ import net.mcreator.latexes.potion.DarklatexdarteffectMobEffect;
/*    */ import net.mcreator.latexes.potion.VaccineeffectMobEffect;
/*    */ import net.minecraft.world.effect.MobEffect;
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
/*    */ public class LatexModMobEffects
/*    */ {
/* 18 */   public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, "latex");
/* 19 */   public static final RegistryObject<MobEffect> DARKLATEXDARTEFFECT = REGISTRY.register("darklatexdarteffect", () -> new DarklatexdarteffectMobEffect());
/*    */   
/* 21 */   public static final RegistryObject<MobEffect> VACCINEEFFECT = REGISTRY.register("vaccineeffect", () -> new VaccineeffectMobEffect());
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\init\LatexModMobEffects.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */