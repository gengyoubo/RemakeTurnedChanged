//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.fluid;

import net.mcreator.latexes.init.LatexModBlocks;
import net.mcreator.latexes.init.LatexModFluids;
import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
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

public abstract class DarkLatexGooFluidFluid extends ForgeFlowingFluid {
    public static final ForgeFlowingFluid.Properties PROPERTIES;

    private DarkLatexGooFluidFluid() {
        super(PROPERTIES);
    }

    public Vec3 getFlow(BlockGetter world, BlockPos pos, FluidState fluidstate) {
        return super.getFlow(world, pos, fluidstate).scale(-2.0);
    }

    static {
        PROPERTIES = (new ForgeFlowingFluid.Properties(LatexModFluids.DARK_LATEX_GOO_FLUID, LatexModFluids.FLOWING_DARK_LATEX_GOO_FLUID, FluidAttributes.builder(new ResourceLocation("latex:blocks/dark_latex_goo_fluid"), new ResourceLocation("latex:blocks/dark_latex_goo_fluid")).density(5000).viscosity(2500).temperature(350).sound((SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.slime_block.place"))))).explosionResistance(125.0F).canMultiply().tickRate(15).levelDecreasePerBlock(4).slopeFindDistance(3).bucket(LatexModItems.DARK_LATEX_GOO_FLUID_BUCKET).block(() -> {
            return (LiquidBlock)LatexModBlocks.DARK_LATEX_GOO_FLUID.get();
        });
    }

    public static class Flowing extends DarkLatexGooFluidFluid {
        public Flowing() {
        }

        protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
            super.createFluidStateDefinition(builder);
            builder.add(new Property[]{LEVEL});
        }

        public int getAmount(FluidState state) {
            return (Integer)state.getValue(LEVEL);
        }

        public boolean isSource(FluidState state) {
            return false;
        }
    }

    public static class Source extends DarkLatexGooFluidFluid {
        public Source() {
        }

        public int getAmount(FluidState state) {
            return 8;
        }

        public boolean isSource(FluidState state) {
            return true;
        }
    }
}
