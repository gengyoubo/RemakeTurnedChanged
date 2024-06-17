//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.procedures;

import java.util.Comparator;
import net.mcreator.latexes.entity.ArmedDroneHertxWaitEntity;
import net.mcreator.latexes.entity.DroneHertxEntity;
import net.mcreator.latexes.init.LatexModEntities;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.SpawnGroupData;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class DronehertxupgradekitRightclickedProcedure {
    public DronehertxupgradekitRightclickedProcedure() {
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if (!world.getEntitiesOfClass(DroneHertxEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), (e) -> {
                return true;
            }).isEmpty()) {
                if (!((Entity)world.getEntitiesOfClass(DroneHertxEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), (e) -> {
                    return true;
                }).stream().sorted(((<undefinedtype>)(new Object() {
                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble((_entcnd) -> {
                            return _entcnd.distanceToSqr(_x, _y, _z);
                        });
                    }
                })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).level.isClientSide()) {
                    ((Entity)world.getEntitiesOfClass(DroneHertxEntity.class, AABB.ofSize(new Vec3(x, y, z), 3.0, 3.0, 3.0), (e) -> {
                        return true;
                    }).stream().sorted(((<undefinedtype>)(new Object() {
                        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                            return Comparator.comparingDouble((_entcnd) -> {
                                return _entcnd.distanceToSqr(_x, _y, _z);
                            });
                        }
                    })).compareDistOf(x, y, z)).findFirst().orElse((Object)null)).discard();
                }

                if (world instanceof ServerLevel) {
                    ServerLevel _level = (ServerLevel)world;
                    Entity entityToSpawn = new ArmedDroneHertxWaitEntity((EntityType)LatexModEntities.ARMED_DRONE_HERTX_WAIT.get(), _level);
                    entityToSpawn.moveTo(x, y, z, entity.getYRot(), entity.getXRot());
                    entityToSpawn.setYBodyRot(entity.getYRot());
                    entityToSpawn.setYHeadRot(entity.getYRot());
                    if (entityToSpawn instanceof Mob) {
                        Mob _mobToSpawn = (Mob)entityToSpawn;
                        _mobToSpawn.finalizeSpawn(_level, world.getCurrentDifficultyAt(entityToSpawn.blockPosition()), MobSpawnType.MOB_SUMMONED, (SpawnGroupData)null, (CompoundTag)null);
                    }

                    world.addFreshEntity(entityToSpawn);
                }
            }

        }
    }
}
