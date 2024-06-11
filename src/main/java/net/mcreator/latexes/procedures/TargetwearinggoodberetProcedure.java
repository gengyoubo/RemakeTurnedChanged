package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.ItemStack;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/TargetwearinggoodberetProcedure.class */
public class TargetwearinggoodberetProcedure {
    public static boolean execute(Entity entity) {
        ItemStack itemStack;
        if (entity == null) {
            return false;
        }
        LivingEntity _entGetArmor = entity instanceof Mob ? ((Mob) entity).getTarget() : null;
        if (_entGetArmor instanceof LivingEntity) {
            itemStack = _entGetArmor.getItemBySlot(EquipmentSlot.HEAD);
        } else {
            itemStack = ItemStack.EMPTY;
        }
        if (!(itemStack.getItem() == LatexModItems.GOOD_BERET_HELMET.get())) {
            return true;
        }
        return false;
    }
}
