package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.changed.init.ChangedBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/LatexcapsuleBlockDestroyedByPlayerProcedure.class */
public class LatexcapsuleBlockDestroyedByPlayerProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (Math.random() < 0.5d) {
            world.setBlock(new BlockPos(x, y, z), ((Block) ChangedBlocks.DARK_LATEX_BLOCK.get()).defaultBlockState(), 3);
        }
    }
}
