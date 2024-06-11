package net.mcreator.latexes.block;

import java.util.Random;
import net.mcreator.latexes.init.LatexModFluids;
import net.mcreator.latexes.procedures.DarkLatexGooFluidUpdateTickProcedure;
import net.mcreator.latexes.procedures.DarklatexblockEntityCollidesInTheBlockProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.world.level.material.Material;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/block/DarkLatexGooFluidBlock.class */
public class DarkLatexGooFluidBlock extends LiquidBlock {
    public DarkLatexGooFluidBlock() {
        super(() -> {
            return (FlowingFluid) LatexModFluids.DARK_LATEX_GOO_FLUID.get();
        }, BlockBehaviour.Properties.of(Material.WATER).strength(125.0f));
    }

    public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
        return 20;
    }

    public int getLightBlock(BlockState state, BlockGetter worldIn, BlockPos pos) {
        return 12;
    }

    public void onPlace(BlockState blockstate, Level world, BlockPos pos, BlockState oldState, boolean moving) {
        onPlace(blockstate, world, pos, oldState, moving);
        world.scheduleTick(pos, this, 10);
    }

    public void tick(BlockState blockstate, ServerLevel world, BlockPos pos, Random random) {
        tick(blockstate, world, pos, random);
        DarkLatexGooFluidUpdateTickProcedure.execute(world, (double) pos.getX(), (double) pos.getY(), (double) pos.getZ());
        world.scheduleTick(pos, this, 10);
    }

    public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
        entityInside(blockstate, world, pos, entity);
        DarklatexblockEntityCollidesInTheBlockProcedure.execute(entity);
    }
}
