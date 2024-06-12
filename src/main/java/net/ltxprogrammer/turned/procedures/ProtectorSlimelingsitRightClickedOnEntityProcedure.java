package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.entity.ProtectorSlimelingEntity;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/ProtectorSlimelingsitRightClickedOnEntityProcedure.class */
public class ProtectorSlimelingsitRightClickedOnEntityProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
        if (entity != null && sourceentity != null && (entity instanceof TamableAnimal)) {
            TamableAnimal _tamIsTamedBy = (TamableAnimal) entity;
            if ((sourceentity instanceof LivingEntity) && _tamIsTamedBy.isOwnedBy((LivingEntity) sourceentity)) {
                if (world instanceof ServerLevel) {
                    ServerLevel _level = (ServerLevel) world;
                    Entity entityToSpawn = new ProtectorSlimelingEntity((EntityType<ProtectorSlimelingEntity>) ((EntityType) LatexModEntities.PROTECTOR_SLIMELING.get()), (Level) _level);
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
}
