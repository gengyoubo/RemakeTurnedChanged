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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/HertxOnInitialEntitySpawnProcedure.class */
public class HertxOnInitialEntitySpawnProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if (!(entity instanceof TamableAnimal) || !((TamableAnimal) entity).isTame()) {
                if (entity instanceof TamableAnimal) {
                    TamableAnimal _toTame = (TamableAnimal) entity;
                    Player _owner = (Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 8.0d, 8.0d, 8.0d), e -> {
                        return true;
                    }).stream().sorted(new AnonymousClass1().compareDistOf(x, y, z)).findFirst().orElse(null);
                    if (_owner instanceof Player) {
                        _toTame.tame(_owner);
                    }
                }
                if (world instanceof ServerLevel) {
                    ((ServerLevel) world).sendParticles(ParticleTypes.HAPPY_VILLAGER, x, y, z, 6, 2.0d, 2.0d, 2.0d, 1.0d);
                }
            }
        }
    }

    /* renamed from: net.mcreator.latexes.procedures.HertxOnInitialEntitySpawnProcedure$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/HertxOnInitialEntitySpawnProcedure$1.class */
    class AnonymousClass1 {
        AnonymousClass1() {
        }

        Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
            return Comparator.comparingDouble(_entcnd -> {
                return _entcnd.distanceToSqr(_x, _y, _z);
            });
        }
    }
}
