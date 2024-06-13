package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.entity.CivilianEntity;
import net.ltxprogrammer.turned.entity.EvilScientistEntity;
import net.ltxprogrammer.turned.entity.PrisionerEntity;
import LatexModEntities;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/HandcuffsRightclickedProcedure.class */
public class HandcuffsRightclickedProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if ((entity instanceof EvilScientistEntity) || (entity instanceof CivilianEntity)) {
                if (world instanceof ServerLevel _level) {
                    Entity entityToSpawn = new PrisionerEntity((EntityType<PrisionerEntity>) LatexModEntities.PRISIONER.get(), _level);
                    entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
                    entityToSpawn.setYBodyRot(entity.getYRot());
                    entityToSpawn.setYHeadRot(entity.getYRot());
                    entityToSpawn.setDeltaMovement(0.0d, 0.0d, 0.0d);
                    ((Mob) entityToSpawn).finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                    world.addFreshEntity(entityToSpawn);
                }
                if (!entity.level.isClientSide()) {
                    entity.discard();
                }
            }
        }
    }
}
