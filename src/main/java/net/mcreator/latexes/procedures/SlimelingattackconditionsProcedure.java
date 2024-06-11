package net.mcreator.latexes.procedures;

import java.util.Comparator;
import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.world.Difficulty;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/SlimelingattackconditionsProcedure.class */
public class SlimelingattackconditionsProcedure {
    public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return false;
        }
        if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() != LatexModItems.DLMASK_HELMET.get()) {
            if ((entity instanceof TamableAnimal ? ((TamableAnimal) entity).getOwner() : null) == ((Entity) world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 6.0d, 6.0d, 6.0d), e -> {
                return true;
            }).stream().sorted(new AnonymousClass1().compareDistOf(x, y, z)).findFirst().orElse(null))) {
                if (!(world.getDifficulty() == Difficulty.PEACEFUL)) {
                    if (!((world instanceof Level) && ((Level) world).isDay())) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    /* renamed from: net.mcreator.latexes.procedures.SlimelingattackconditionsProcedure$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/SlimelingattackconditionsProcedure$1.class */
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
