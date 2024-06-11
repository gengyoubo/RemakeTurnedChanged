package net.mcreator.latexes.init;

import net.mcreator.latexes.LatexMod;
import net.mcreator.latexes.fluid.DarkLatexGooFluidFluid;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.material.Fluid;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/init/LatexModFluids.class */
public class LatexModFluids {
    public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(ForgeRegistries.FLUIDS, LatexMod.MODID);
    public static final RegistryObject<Fluid> DARK_LATEX_GOO_FLUID = REGISTRY.register("dark_latex_goo_fluid", () -> {
        return new DarkLatexGooFluidFluid.Source();
    });
    public static final RegistryObject<Fluid> FLOWING_DARK_LATEX_GOO_FLUID = REGISTRY.register("flowing_dark_latex_goo_fluid", () -> {
        return new DarkLatexGooFluidFluid.Flowing();
    });

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/init/LatexModFluids$ClientSideHandler.class */
    public static class ClientSideHandler {
        @SubscribeEvent
        public static void clientSetup(FMLClientSetupEvent event) {
            ItemBlockRenderTypes.setRenderLayer((Fluid) LatexModFluids.DARK_LATEX_GOO_FLUID.get(), renderType -> {
                return renderType == RenderType.translucent();
            });
            ItemBlockRenderTypes.setRenderLayer((Fluid) LatexModFluids.FLOWING_DARK_LATEX_GOO_FLUID.get(), renderType -> {
                return renderType == RenderType.translucent();
            });
        }
    }
}
