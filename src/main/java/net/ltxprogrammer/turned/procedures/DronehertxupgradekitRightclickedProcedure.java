package net.ltxprogrammer.turned.procedures;

import java.util.Comparator;
import java.util.Objects;

import net.ltxprogrammer.turned.entity.ArmedDroneHertxWaitEntity;
import net.ltxprogrammer.turned.entity.DroneHertxEntity;
import net.ltxprogrammer.turned.init.LatexModEntities;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/DronehertxupgradekitRightclickedProcedure.class */
public class DronehertxupgradekitRightclickedProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null && !world.getEntitiesOfClass(DroneHertxEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0d, 3.0d, 3.0d), e -> true).isEmpty()) {
            if (!Objects.requireNonNull(world.getEntitiesOfClass(DroneHertxEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0d, 3.0d, 3.0d), e -> true).stream().sorted(new Object() { // from class: net.ltxprogrammer.turned.procedures.DronehertxupgradekitRightclickedProcedure.1
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                }
            }.compareDistOf(x, y, z)).findFirst().orElse(null)).level.isClientSide()) {
                Objects.requireNonNull(world.getEntitiesOfClass(DroneHertxEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0d, 3.0d, 3.0d), e -> true).stream().sorted(new Object() { // from class: net.ltxprogrammer.turned.procedures.DronehertxupgradekitRightclickedProcedure.2
                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
                    }
                }.compareDistOf(x, y, z)).findFirst().orElse(null)).discard();
            }
            if (world instanceof ServerLevel _level) {
                Entity entityToSpawn = new ArmedDroneHertxWaitEntity((EntityType<ArmedDroneHertxWaitEntity>) LatexModEntities.ARMED_DRONE_HERTX_WAIT.get(), _level);
                entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
                entityToSpawn.setYBodyRot(entity.getYRot());
                entityToSpawn.setYHeadRot(entity.getYRot());
                ((Mob) entityToSpawn).finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData) null, (CompoundTag) null);
                world.addFreshEntity(entityToSpawn);
            }
        }
    }
}
