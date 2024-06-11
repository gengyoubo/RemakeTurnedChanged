package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/DarklatexcarpetBlockAddedProcedure.class */
public class DarklatexcarpetBlockAddedProcedure {
    public static boolean execute(LevelAccessor world, double x, double y, double z) {
        if (!world.getBlockState(new BlockPos(x, y - 1.0d, z)).is(BlockTags.create(new ResourceLocation("latex:invalidblockbelow"))) && world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() != LatexModBlocks.DARKLATEXCRYSTALEGG.get() && world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() != LatexModBlocks.DARKLATEXICE.get() && world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() != LatexModBlocks.DARKLATEXBLOCKCRYSTALGROW.get() && world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() != LatexModBlocks.DARKLATEXBLOCK.get() && world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() != LatexModBlocks.DARKLATEXPUDDLEHARMLESS.get() && world.getBlockState(new BlockPos(x, y - 1.0d, z)).getBlock() != LatexModBlocks.DARKLATEXCARPET.get()) {
            return false;
        }
        world.destroyBlock(new BlockPos(x, y, z), false);
        return true;
    }
}
