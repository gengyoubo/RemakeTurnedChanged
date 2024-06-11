package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.DarklatexslugEntity;
import net.mcreator.latexes.init.LatexModBlocks;
import net.mcreator.latexes.init.LatexModEntities;
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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/InfesteddlcobblestoneBlockDestroyedByPlayerProcedure.class */
public class InfesteddlcobblestoneBlockDestroyedByPlayerProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (Math.random() < 0.1d) {
            if (world instanceof ServerLevel) {
                ServerLevel _level = (ServerLevel) world;
                Entity entityToSpawn = new DarklatexslugEntity((EntityType<DarklatexslugEntity>) ((EntityType) LatexModEntities.DARKLATEXSLUG.get()), (Level) _level);
                entityToSpawn.moveTo(x, y, z, 0.0f, 0.0f);
                entityToSpawn.setYBodyRot(0.0f);
                entityToSpawn.setYHeadRot(0.0f);
                entityToSpawn.setDeltaMovement(0.0d, 0.0d, 0.0d);
                if (entityToSpawn instanceof Mob) {
                    ((Mob) entityToSpawn).finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                }
                world.addFreshEntity(entityToSpawn);
            }
        } else if (Math.random() < 0.001d) {
            world.setBlock(new BlockPos(x, y, z), ((Block) LatexModBlocks.DARKLATEXBLOCK.get()).defaultBlockState(), 3);
        }
    }
}
