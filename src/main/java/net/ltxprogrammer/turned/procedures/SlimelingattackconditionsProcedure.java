package net.ltxprogrammer.turned.procedures;

import java.util.Comparator;
import net.ltxprogrammer.changed.init.ChangedItems;
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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/SlimelingattackconditionsProcedure.class */
public class SlimelingattackconditionsProcedure {
    public static boolean execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity == null) {
            return false;
        }
        if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() != ChangedItems.DARK_LATEX_MASK.get()) {
            // from class: net.ltxprogrammer.turned.procedures.SlimelingattackconditionsProcedure.1
            if ((entity instanceof TamableAnimal ? ((TamableAnimal) entity).getOwner() : null) == world.getEntitiesOfClass(Player.class, AABB.ofSize(new Vec3(x, y, z), 6.0d, 6.0d, 6.0d), e -> {
                return true;
            }).stream().min(new Object() { // from class: net.ltxprogrammer.turned.procedures.SlimelingattackconditionsProcedure.1
                Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
                    return Comparator.comparingDouble(_entcnd -> {
                        return _entcnd.distanceToSqr(_x, _y, _z);
                    });
                }
            }.compareDistOf(x, y, z)).orElse(null)) {
                if (!(world.getDifficulty() == Difficulty.PEACEFUL)) {
                    if ((world instanceof Level)) {
                        ((Level) world).isDay();
                    }
                }
                return false;
            }
        }
        return true;
    }
}
