package net.ltxprogrammer.turned.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/TestUpdateTickProcedure.class */
public class TestUpdateTickProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world.getBlockState(new BlockPos(x, y - 1.0d, z)).is(BlockTags.create(new ResourceLocation("turned:tag_immune_blocks")))) {
            if (world instanceof ServerLevel) {
                ((ServerLevel) world).sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 6, 3.0d, 3.0d, 3.0d, 1.0d);
            }
        } else if (world instanceof ServerLevel) {
            ((ServerLevel) world).sendParticles(ParticleTypes.ANGRY_VILLAGER, x, y, z, 6, 3.0d, 3.0d, 3.0d, 1.0d);
        }
    }
}
