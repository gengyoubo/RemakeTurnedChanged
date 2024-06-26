package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.entity.DarkLatexSnepEntity;
import LatexModEntities;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/SneppleBulletHitsBlockProcedure.class */
public class SneppleBulletHitsBlockProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world instanceof ServerLevel _level) {
            Entity entityToSpawn = new DarkLatexSnepEntity((EntityType<DarkLatexSnepEntity>) LatexModEntities.DARK_LATEX_SNEP.get(), _level);
            entityToSpawn.moveTo(x, y, z, 0.0f, 0.0f);
            entityToSpawn.setYBodyRot(0.0f);
            entityToSpawn.setYHeadRot(0.0f);
            ((Mob) entityToSpawn).finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
            world.addFreshEntity(entityToSpawn);
        }
    }
}