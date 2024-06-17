//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.procedures;

import java.util.Comparator;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class HertxOnInitialEntitySpawnProcedure {
    public HertxOnInitialEntitySpawnProcedure() {
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if (entity instanceof TamableAnimal) {
                TamableAnimal _tamEnt = (TamableAnimal)entity;
                if (_tamEnt.isTame()) {
                    return;
                }
            }

            if (entity instanceof TamableAnimal) {
                TamableAnimal _toTame = (TamableAnimal)entity;
                Entity var11 = (Entity)world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 8.0, 8.0, 8.0), (e) -> {
                    return true;
                }).stream().sorted(((<undefinedtype>)(new Object() {
                    Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                        return Comparator.comparingDouble((_entcnd) -> {
                            return _entcnd.distanceToSqr(_x, _y, _z);
                        });
                    }
                })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
                if (var11 instanceof Player) {
                    Player _owner = (Player)var11;
                    _toTame.tame(_owner);
                }
            }

            if (world instanceof ServerLevel) {
                ServerLevel _level = (ServerLevel)world;
                _level.sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 6, 2.0, 2.0, 2.0, 1.0);
            }

        }
    }
}
