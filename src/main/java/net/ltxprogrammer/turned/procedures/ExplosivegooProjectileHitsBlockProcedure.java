package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.changed.block.AbstractLatexBlock;
import net.ltxprogrammer.changed.entity.LatexType;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/ExplosivegooProjectileHitsBlockProcedure.class */
public class ExplosivegooProjectileHitsBlockProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world instanceof Level _level) {
            if (!_level.isClientSide()) {
                _level.explode(null, x, y, z, 1.0f, Explosion.BlockInteraction.NONE);
            }
        }
        if ((world.getBlockState(new BlockPos(x, y + 1.0d, z)).getBlock() == Blocks.AIR || world.getBlockState(new BlockPos(x, y + 1.0d, z)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x, y + 1.0d, z)).getBlock() == Blocks.CAVE_AIR) && world.getBlockState(new BlockPos(x, y, z)).getProperties().contains(AbstractLatexBlock.COVERED)) {
            world.setBlock(new BlockPos(x, y, z), world.getBlockState(new BlockPos(x, y, z)).setValue(AbstractLatexBlock.COVERED, LatexType.DARK_LATEX), 3);
        }
    }
}
