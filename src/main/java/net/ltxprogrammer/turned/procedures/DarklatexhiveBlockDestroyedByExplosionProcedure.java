package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.entity.DLbeeEntity;
import net.ltxprogrammer.turned.entity.DarkLatexQueenBeeEntity;
import LatexModEntities;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/DarklatexhiveBlockDestroyedByExplosionProcedure.class */
public class DarklatexhiveBlockDestroyedByExplosionProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (Math.random() < 0.6d) {
            if (world instanceof ServerLevel _level) {
                Entity entityToSpawn = new DLbeeEntity((EntityType<DLbeeEntity>) LatexModEntities.D_LBEE.get(), _level);
                entityToSpawn.moveTo(x, y, z, 0.0f, 0.0f);
                entityToSpawn.setYBodyRot(0.0f);
                entityToSpawn.setYHeadRot(0.0f);
                ((Mob) entityToSpawn).finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                world.addFreshEntity(entityToSpawn);
            }
        } else if (Math.random() < 0.2d && (world instanceof ServerLevel _level2)) {
            Entity entityToSpawn2 = new DarkLatexQueenBeeEntity((EntityType<DarkLatexQueenBeeEntity>) LatexModEntities.DARK_LATEX_QUEEN_BEE.get(), _level2);
            entityToSpawn2.moveTo(x, y, z, 0.0f, 0.0f);
            entityToSpawn2.setYBodyRot(0.0f);
            entityToSpawn2.setYHeadRot(0.0f);
            ((Mob) entityToSpawn2).finalizeSpawn(_level2, world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
            world.addFreshEntity(entityToSpawn2);
        }
    }
}
