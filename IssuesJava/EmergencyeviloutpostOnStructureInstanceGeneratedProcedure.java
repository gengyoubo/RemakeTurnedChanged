package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.entity.EvilMilitaryEntity;
import net.ltxprogrammer.turned.entity.EvilScientistEntity;
import LatexModEntities;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/EmergencyeviloutpostOnStructureInstanceGeneratedProcedure.class */
public class EmergencyeviloutpostOnStructureInstanceGeneratedProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world instanceof ServerLevel _level) {
            Entity entityToSpawn = new EvilScientistEntity((EntityType<EvilScientistEntity>) LatexModEntities.EVIL_SCIENTIST.get(), _level);
            entityToSpawn.moveTo(x, y + 4.0d, z, 0.0f, 0.0f);
            entityToSpawn.setYBodyRot(0.0f);
            entityToSpawn.setYHeadRot(0.0f);
            ((Mob) entityToSpawn).finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
            world.addFreshEntity(entityToSpawn);
        }
        if (world instanceof ServerLevel _level2) {
            Entity entityToSpawn2 = new EvilScientistEntity((EntityType<EvilScientistEntity>) LatexModEntities.EVIL_SCIENTIST.get(), _level2);
            entityToSpawn2.moveTo(x, y + 4.0d, z, 0.0f, 0.0f);
            entityToSpawn2.setYBodyRot(0.0f);
            entityToSpawn2.setYHeadRot(0.0f);
            ((Mob) entityToSpawn2).finalizeSpawn(_level2, world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
            world.addFreshEntity(entityToSpawn2);
        }
        if (world instanceof ServerLevel _level3) {
            Entity entityToSpawn3 = new EvilMilitaryEntity((EntityType<EvilMilitaryEntity>) LatexModEntities.EVIL_MILITARY.get(), _level3);
            entityToSpawn3.moveTo(x, y + 4.0d, z, 0.0f, 0.0f);
            entityToSpawn3.setYBodyRot(0.0f);
            entityToSpawn3.setYHeadRot(0.0f);
            ((Mob) entityToSpawn3).finalizeSpawn(_level3, world.getCurrentDifficultyAt(entityToSpawn3.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
            world.addFreshEntity(entityToSpawn3);
        }
        if (Math.random() < 0.2d && (world instanceof ServerLevel _level4)) {
            Entity entityToSpawn4 = new EvilMilitaryEntity((EntityType<EvilMilitaryEntity>) LatexModEntities.EVIL_MILITARY.get(), _level4);
            entityToSpawn4.moveTo(x, y + 4.0d, z, 0.0f, 0.0f);
            entityToSpawn4.setYBodyRot(0.0f);
            entityToSpawn4.setYHeadRot(0.0f);
            ((Mob) entityToSpawn4).finalizeSpawn(_level4, world.getCurrentDifficultyAt(entityToSpawn4.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
            world.addFreshEntity(entityToSpawn4);
        }
    }
}
