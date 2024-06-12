package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.changed.init.ChangedBlocks;
import net.ltxprogrammer.turned.entity.DarklatexslugEntity;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/InfesteddlcobblestoneBlockDestroyedByPlayerProcedure.class */
public class InfesteddlcobblestoneBlockDestroyedByPlayerProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (Math.random() < 0.1d) {
            if (world instanceof ServerLevel _level) {
                Entity entityToSpawn = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) LatexModEntities.DARKLATEXSLUG.get(), _level);
                entityToSpawn.moveTo(x, y, z, 0.0f, 0.0f);
                entityToSpawn.setYBodyRot(0.0f);
                entityToSpawn.setYHeadRot(0.0f);
                entityToSpawn.setDeltaMovement(0.0d, 0.0d, 0.0d);
                ((Mob) entityToSpawn).finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                world.addFreshEntity(entityToSpawn);
            }
        } else if (Math.random() < 0.001d) {
            world.setBlock(new BlockPos(x, y, z), ChangedBlocks.DARK_LATEX_BLOCK.get().defaultBlockState(), 3);
        }
    }
}
