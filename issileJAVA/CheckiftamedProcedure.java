//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.procedures;

import java.util.Comparator;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

public class CheckiftamedProcedure {
    public CheckiftamedProcedure() {
    }

    public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return false;
        } else {
            LivingEntity var10000;
            if (entity instanceof TamableAnimal) {
                TamableAnimal _tamEnt = (TamableAnimal)entity;
                var10000 = _tamEnt.getOwner();
            } else {
                var10000 = null;
            }

            return var10000 != (Entity)world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 6.0, 6.0, 6.0), (e) -> {
                return true;
            }).stream().sorted(((<undefinedtype>)(new Object() {
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble((_entcnd) -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            })).compareDistOf(x, y, z)).findFirst().orElse((Object)null);
        }
    }
}
