/*    */ package net.mcreator.latexes.init;
/*    */ 
/*    */ import net.mcreator.latexes.fluid.DarkLatexGooFluidFluid;
/*    */ import net.minecraft.client.renderer.ItemBlockRenderTypes;
/*    */ import net.minecraft.client.renderer.RenderType;
/*    */ import net.minecraft.world.level.material.Fluid;
/*    */ import net.minecraftforge.api.distmarker.Dist;
/*    */ import net.minecraftforge.eventbus.api.SubscribeEvent;
/*    */ import net.minecraftforge.fml.common.Mod;
/*    */ import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
/*    */ import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
/*    */ import net.minecraftforge.registries.DeferredRegister;
/*    */ import net.minecraftforge.registries.ForgeRegistries;
/*    */ import net.minecraftforge.registries.RegistryObject;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class LatexModFluids
/*    */ {
/* 23 */   public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, "latex");
/* 24 */   public static final RegistryObject<Fluid> DARK_LATEX_GOO_FLUID = REGISTRY.register("dark_latex_goo_fluid", () -> new DarkLatexGooFluidFluid.Source());
/*    */   
/* 26 */   public static final RegistryObject<Fluid> FLOWING_DARK_LATEX_GOO_FLUID = REGISTRY.register("flowing_dark_latex_goo_fluid", () -> new DarkLatexGooFluidFluid.Flowing());
/*    */   
/*    */   @EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
/*    */   public static class ClientSideHandler
/*    */   {
/*    */     @SubscribeEvent
/*    */     public static void clientSetup(FMLClientSetupEvent event) {
/* 33 */       ItemBlockRenderTypes.setRenderLayer((Fluid)LatexModFluids.DARK_LATEX_GOO_FLUID.get(), renderType -> (renderType == RenderType.translucent()));
/* 34 */       ItemBlockRenderTypes.setRenderLayer((Fluid)LatexModFluids.FLOWING_DARK_LATEX_GOO_FLUID.get(), renderType -> (renderType == RenderType.translucent()));
/*    */     }
/*    */   }
/*    */ }


/* Location:              C:\Users\Administrator\.gradle\caches\forge_gradle\deobf_dependencies\curse\maven\1-1034197\5414946_mapped_official_1.18.2\1-1034197-5414946_mapped_official_1.18.2.jar!\net\mcreator\latexes\init\LatexModFluids.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */