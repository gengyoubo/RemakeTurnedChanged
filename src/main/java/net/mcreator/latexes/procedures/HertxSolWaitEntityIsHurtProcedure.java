package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.HertxvarSolEntity;
import net.mcreator.latexes.init.LatexModEntities;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/HertxSolWaitEntityIsHurtProcedure.class */
public class HertxSolWaitEntityIsHurtProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if (world instanceof ServerLevel) {
                ServerLevel _level = (ServerLevel) world;
                Entity entityToSpawn = new HertxvarSolEntity((EntityType<HertxvarSolEntity>) ((EntityType) LatexModEntities.HERTXVAR_SOL.get()), (Level) _level);
                entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
                entityToSpawn.setYBodyRot(entity.getYRot());
                entityToSpawn.setYHeadRot(entity.getYRot());
                if (entityToSpawn instanceof Mob) {
                    ((Mob) entityToSpawn).finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                }
                world.addFreshEntity(entityToSpawn);
            }
            if (!entity.level.isClientSide()) {
                entity.discard();
            }
        }
    }
}
