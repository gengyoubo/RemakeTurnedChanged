/*    */ package net.ltxprogrammer.turned.init;
/*    */ 
/*    */ import net.minecraft.world.effect.MobEffect;
/*    */ import net.minecraft.world.effect.MobEffectInstance;
/*    */ import net.minecraft.world.item.alchemy.Potion;
/*    */ import net.minecraftforge.registries.DeferredRegister;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ import net.minecraftforge.registries.RegistryObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class LatexModPotions
/*    */ {
/* 16 */   public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, "turned");
/* 17 */   public static final RegistryObject<Potion> DARKLATEXDARTEFFECT = REGISTRY.register("darklatexdarteffect", () -> new Potion(new MobEffectInstance[] { new MobEffectInstance((MobEffect)LatexModMobEffects.DARKLATEXDARTEFFECT.get(), 3600, 0, false, true) }));
/*    */ }


/* Location:              C:\Users\Administrator\Desktop\TurnedPatch-m1.18.2-vPTBv5.jar!\net\ltxprogrammer\turned\init\LatexModPotions.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */