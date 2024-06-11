package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/TargetwearinghazmatProcedure.class */
public class TargetwearinghazmatProcedure {
    public static boolean execute(Entity entity) {
        if (entity == null) {
            return false;
        }
        if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() != LatexModItems.HAZMAT_HELMET.get()) {
            return false;
        }
        if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() != LatexModItems.HAZMAT_CHESTPLATE.get()) {
            return false;
        }
        if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() != LatexModItems.HAZMAT_LEGGINGS.get()) {
            return false;
        }
        if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == LatexModItems.HAZMAT_BOOTS.get()) {
            return true;
        }
        return false;
    }
}
