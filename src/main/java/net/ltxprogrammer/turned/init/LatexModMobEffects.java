/*    */ package net.ltxprogrammer.turned.init;
/*    */ 
/*    */ import net.ltxprogrammer.turned.potion.DarklatexdarteffectMobEffect;
/*    */ import net.ltxprogrammer.turned.potion.VaccineeffectMobEffect;
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
/* 18 */   public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, "turned");
/* 19 */   public static final RegistryObject<MobEffect> DARKLATEXDARTEFFECT = REGISTRY.register("darklatexdarteffect", () -> new DarklatexdarteffectMobEffect());
/*    */   
/* 21 */   public static final RegistryObject<MobEffect> VACCINEEFFECT = REGISTRY.register("vaccineeffect", () -> new VaccineeffectMobEffect());
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\init\LatexModMobEffects.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */