package net.mcreator.latexes.fluid;

import net.mcreator.latexes.init.LatexModBlocks;
import net.mcreator.latexes.init.LatexModFluids;
import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.fluids.FluidAttributes;
import net.minecraftforge.fluids.ForgeFlowingFluid;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/fluid/DarkLatexGooFluidFluid.class */
public abstract class DarkLatexGooFluidFluid extends ForgeFlowingFluid {
    public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(LatexModFluids.DARK_LATEX_GOO_FLUID, LatexModFluids.FLOWING_DARK_LATEX_GOO_FLUID, FluidAttributes.builder(new ResourceLocation("latex:blocks/dark_latex_goo_fluid"), new ResourceLocation("latex:blocks/dark_latex_goo_fluid")).density(5000).viscosity(2500).temperature(350).sound(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.slime_block.place")))).explosionResistance(125.0f).canMultiply().tickRate(15).levelDecreasePerBlock(4).slopeFindDistance(3).bucket(LatexModItems.DARK_LATEX_GOO_FLUID_BUCKET).block(() -> {
        return (LiquidBlock) LatexModBlocks.DARK_LATEX_GOO_FLUID.get();
    });

    private DarkLatexGooFluidFluid() {
        super(PROPERTIES);
    }

    public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
        return getFlow(world, pos, fluidstate).scale(-2.0d);
    }

    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/fluid/DarkLatexGooFluidFluid$Source.class */
    public static class Source extends DarkLatexGooFluidFluid {
        public int getAmount(FluidState state) {
            return 8;
        }

        public boolean isSource(FluidState state) {
            return true;
        }
    }

    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/fluid/DarkLatexGooFluidFluid$Flowing.class */
    public static class Flowing extends DarkLatexGooFluidFluid {
        protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
            createFluidStateDefinition(builder);
            builder.add(new Property[]{LEVEL});
        }

        public int getAmount(FluidState state) {
            return ((Integer) state.getValue(LEVEL)).intValue();
        }

        public boolean isSource(FluidState state) {
            return false;
        }
    }
}
