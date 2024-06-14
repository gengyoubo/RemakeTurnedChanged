package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.entity.MilitaryEntity;
import net.ltxprogrammer.turned.entity.ScientistEntity;
import LatexModEntities;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/OperativefacilityOnStructureInstanceGeneratedProcedure.class */
public class OperativefacilityOnStructureInstanceGeneratedProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world instanceof ServerLevel _level) {
            Entity entityToSpawn = new Villager(EntityType.VILLAGER, _level);
            entityToSpawn.moveTo(x, y + 1.0d, z, 0.0f, 0.0f);
            entityToSpawn.setYBodyRot(0.0f);
            entityToSpawn.setYHeadRot(0.0f);
            ((Mob) entityToSpawn).finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
            world.addFreshEntity(entityToSpawn);
        }
        if (world instanceof ServerLevel _level2) {
            Entity entityToSpawn2 = new Villager(EntityType.VILLAGER, _level2);
            entityToSpawn2.moveTo(x, y + 1.0d, z, 0.0f, 0.0f);
            entityToSpawn2.setYBodyRot(0.0f);
            entityToSpawn2.setYHeadRot(0.0f);
            ((Mob) entityToSpawn2).finalizeSpawn(_level2, world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
            world.addFreshEntity(entityToSpawn2);
        }
        if (world instanceof ServerLevel _level3) {
            Entity entityToSpawn3 = new ScientistEntity((EntityType<ScientistEntity>) LatexModEntities.SCIENTIST.get(), _level3);
            entityToSpawn3.moveTo(x, y + 1.0d, z, 0.0f, 0.0f);
            entityToSpawn3.setYBodyRot(0.0f);
            entityToSpawn3.setYHeadRot(0.0f);
            ((Mob) entityToSpawn3).finalizeSpawn(_level3, world.getCurrentDifficultyAt(entityToSpawn3.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
            world.addFreshEntity(entityToSpawn3);
        }
        if (world instanceof ServerLevel _level4) {
            Entity entityToSpawn4 = new ScientistEntity((EntityType<ScientistEntity>) LatexModEntities.SCIENTIST.get(), _level4);
            entityToSpawn4.moveTo(x, y + 1.0d, z, 0.0f, 0.0f);
            entityToSpawn4.setYBodyRot(0.0f);
            entityToSpawn4.setYHeadRot(0.0f);
            ((Mob) entityToSpawn4).finalizeSpawn(_level4, world.getCurrentDifficultyAt(entityToSpawn4.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
            world.addFreshEntity(entityToSpawn4);
        }
        if (world instanceof ServerLevel _level5) {
            Entity entityToSpawn5 = new MilitaryEntity((EntityType<MilitaryEntity>) LatexModEntities.MILITARY.get(), _level5);
            entityToSpawn5.moveTo(x, y + 1.0d, z, 0.0f, 0.0f);
            entityToSpawn5.setYBodyRot(0.0f);
            entityToSpawn5.setYHeadRot(0.0f);
            ((Mob) entityToSpawn5).finalizeSpawn(_level5, world.getCurrentDifficultyAt(entityToSpawn5.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
            world.addFreshEntity(entityToSpawn5);
        }
    }
}
