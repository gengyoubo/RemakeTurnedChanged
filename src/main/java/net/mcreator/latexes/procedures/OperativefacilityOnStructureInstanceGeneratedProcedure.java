package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.MilitaryEntity;
import net.mcreator.latexes.entity.ScientistEntity;
import net.mcreator.latexes.init.LatexModEntities;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/OperativefacilityOnStructureInstanceGeneratedProcedure.class */
public class OperativefacilityOnStructureInstanceGeneratedProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z) {
        if (world instanceof ServerLevel) {
            ServerLevel _level = (ServerLevel) world;
            Entity entityToSpawn = new Villager(EntityType.VILLAGER, _level);
            entityToSpawn.moveTo(x, y + 1.0d, z, 0.0f, 0.0f);
            entityToSpawn.setYBodyRot(0.0f);
            entityToSpawn.setYHeadRot(0.0f);
            if (entityToSpawn instanceof Mob) {
                ((Mob) entityToSpawn).finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
            }
            world.addFreshEntity(entityToSpawn);
        }
        if (world instanceof ServerLevel) {
            ServerLevel _level2 = (ServerLevel) world;
            Entity entityToSpawn2 = new Villager(EntityType.VILLAGER, _level2);
            entityToSpawn2.moveTo(x, y + 1.0d, z, 0.0f, 0.0f);
            entityToSpawn2.setYBodyRot(0.0f);
            entityToSpawn2.setYHeadRot(0.0f);
            if (entityToSpawn2 instanceof Mob) {
                ((Mob) entityToSpawn2).finalizeSpawn(_level2, world.getCurrentDifficultyAt(entityToSpawn2.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
            }
            world.addFreshEntity(entityToSpawn2);
        }
        if (world instanceof ServerLevel) {
            ServerLevel _level3 = (ServerLevel) world;
            Entity entityToSpawn3 = new ScientistEntity((EntityType<ScientistEntity>) ((EntityType) LatexModEntities.SCIENTIST.get()), (Level) _level3);
            entityToSpawn3.moveTo(x, y + 1.0d, z, 0.0f, 0.0f);
            entityToSpawn3.setYBodyRot(0.0f);
            entityToSpawn3.setYHeadRot(0.0f);
            if (entityToSpawn3 instanceof Mob) {
                ((Mob) entityToSpawn3).finalizeSpawn(_level3, world.getCurrentDifficultyAt(entityToSpawn3.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
            }
            world.addFreshEntity(entityToSpawn3);
        }
        if (world instanceof ServerLevel) {
            ServerLevel _level4 = (ServerLevel) world;
            Entity entityToSpawn4 = new ScientistEntity((EntityType<ScientistEntity>) ((EntityType) LatexModEntities.SCIENTIST.get()), (Level) _level4);
            entityToSpawn4.moveTo(x, y + 1.0d, z, 0.0f, 0.0f);
            entityToSpawn4.setYBodyRot(0.0f);
            entityToSpawn4.setYHeadRot(0.0f);
            if (entityToSpawn4 instanceof Mob) {
                ((Mob) entityToSpawn4).finalizeSpawn(_level4, world.getCurrentDifficultyAt(entityToSpawn4.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
            }
            world.addFreshEntity(entityToSpawn4);
        }
        if (world instanceof ServerLevel) {
            ServerLevel _level5 = (ServerLevel) world;
            Entity entityToSpawn5 = new MilitaryEntity((EntityType<MilitaryEntity>) ((EntityType) LatexModEntities.MILITARY.get()), (Level) _level5);
            entityToSpawn5.moveTo(x, y + 1.0d, z, 0.0f, 0.0f);
            entityToSpawn5.setYBodyRot(0.0f);
            entityToSpawn5.setYHeadRot(0.0f);
            if (entityToSpawn5 instanceof Mob) {
                ((Mob) entityToSpawn5).finalizeSpawn(_level5, world.getCurrentDifficultyAt(entityToSpawn5.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
            }
            world.addFreshEntity(entityToSpawn5);
        }
    }
}
