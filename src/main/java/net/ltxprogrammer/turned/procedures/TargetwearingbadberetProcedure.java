package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.item.ItemStack;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/TargetwearingbadberetProcedure.class */
public class TargetwearingbadberetProcedure {
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
        return !(itemStack.getItem() == LatexModItems.EVIL_BERET_HELMET.get());
    }
}
