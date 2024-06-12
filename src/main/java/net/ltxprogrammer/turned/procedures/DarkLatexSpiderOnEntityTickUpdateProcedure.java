package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.init.LatexModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Blocks;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/DarkLatexSpiderOnEntityTickUpdateProcedure.class */
public class DarkLatexSpiderOnEntityTickUpdateProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if (world.getBlockState(new BlockPos(x, y, z + 1.0d)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x, y, z + 1.0d)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x, y, z + 1.0d)).getBlock() == Blocks.COBWEB || world.getBlockState(new BlockPos(x, y, z + 1.0d)).getBlock() == LatexModBlocks.DARKLATEXPUDDLEHARMLESS.get() || world.getBlockState(new BlockPos(x, y, z + 1.0d)).getBlock() == Blocks.AIR) {
                if (world.getBlockState(new BlockPos(x, y, z - 1.0d)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x, y, z - 1.0d)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x, y, z - 1.0d)).getBlock() == Blocks.COBWEB || world.getBlockState(new BlockPos(x, y, z - 1.0d)).getBlock() == LatexModBlocks.DARKLATEXPUDDLEHARMLESS.get() || world.getBlockState(new BlockPos(x, y, z - 1.0d)).getBlock() == Blocks.AIR) {
                    if (world.getBlockState(new BlockPos(x + 1.0d, y, z)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x + 1.0d, y, z)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x + 1.0d, y, z)).getBlock() == Blocks.COBWEB || world.getBlockState(new BlockPos(x + 1.0d, y, z)).getBlock() == LatexModBlocks.DARKLATEXPUDDLEHARMLESS.get() || world.getBlockState(new BlockPos(x + 1.0d, y, z)).getBlock() == Blocks.AIR) {
                        if (world.getBlockState(new BlockPos(x - 1.0d, y, z)).getBlock() == Blocks.VOID_AIR || world.getBlockState(new BlockPos(x - 1.0d, y, z)).getBlock() == Blocks.CAVE_AIR || world.getBlockState(new BlockPos(x - 1.0d, y, z)).getBlock() == Blocks.COBWEB || world.getBlockState(new BlockPos(x - 1.0d, y, z)).getBlock() == LatexModBlocks.DARKLATEXPUDDLEHARMLESS.get() || world.getBlockState(new BlockPos(x - 1.0d, y, z)).getBlock() == Blocks.AIR) {
                            return;
                        }
                    }
                }
            }
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance(MobEffects.LEVITATION, 5, 2, false, false));
            }
        }
    }
}
