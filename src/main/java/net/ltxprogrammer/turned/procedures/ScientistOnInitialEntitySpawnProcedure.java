package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/ScientistOnInitialEntitySpawnProcedure.class */
public class ScientistOnInitialEntitySpawnProcedure {
    public static void execute(Entity entity) {
        if (entity != null) {
            if (Math.random() < 0.01d) {
                if (entity instanceof Player _player) {
                    _player.getInventory().armor.set(3, new ItemStack(LatexModItems.RESPIRATOR_HELMET.get()));
                    _player.getInventory().setChanged();
                } else if (entity instanceof LivingEntity) {
                    entity.setItemSlot(EquipmentSlot.HEAD, new ItemStack(LatexModItems.RESPIRATOR_HELMET.get()));
                }
            }
            if (Math.random() < 0.001d) {
                if (entity instanceof Player _player2) {
                    _player2.getInventory().armor.set(0, new ItemStack(LatexModItems.HAZMAT_HELMET.get()));
                    _player2.getInventory().setChanged();
                } else if (entity instanceof LivingEntity) {
                    entity.setItemSlot(EquipmentSlot.FEET, new ItemStack(LatexModItems.HAZMAT_HELMET.get()));
                }
                if (entity instanceof Player _player3) {
                    _player3.getInventory().armor.set(1, new ItemStack(LatexModItems.HAZMAT_CHESTPLATE.get()));
                    _player3.getInventory().setChanged();
                } else if (entity instanceof LivingEntity) {
                    entity.setItemSlot(EquipmentSlot.LEGS, new ItemStack(LatexModItems.HAZMAT_CHESTPLATE.get()));
                }
                if (entity instanceof Player _player4) {
                    _player4.getInventory().armor.set(2, new ItemStack(LatexModItems.HAZMAT_LEGGINGS.get()));
                    _player4.getInventory().setChanged();
                } else if (entity instanceof LivingEntity) {
                    entity.setItemSlot(EquipmentSlot.CHEST, new ItemStack(LatexModItems.HAZMAT_LEGGINGS.get()));
                }
                if (entity instanceof Player _player5) {
                    _player5.getInventory().armor.set(3, new ItemStack(LatexModItems.HAZMAT_BOOTS.get()));
                    _player5.getInventory().setChanged();
                } else if (entity instanceof LivingEntity) {
                    entity.setItemSlot(EquipmentSlot.HEAD, new ItemStack(LatexModItems.HAZMAT_BOOTS.get()));
                }
            } else if (Math.random() < 0.001d) {
                if (entity instanceof Player _player6) {
                    _player6.getInventory().armor.set(1, new ItemStack(LatexModItems.HAZMAT_CHESTPLATE.get()));
                    _player6.getInventory().setChanged();
                } else if (entity instanceof LivingEntity) {
                    entity.setItemSlot(EquipmentSlot.LEGS, new ItemStack(LatexModItems.HAZMAT_CHESTPLATE.get()));
                }
                if (entity instanceof Player _player7) {
                    _player7.getInventory().armor.set(2, new ItemStack(LatexModItems.HAZMAT_LEGGINGS.get()));
                    _player7.getInventory().setChanged();
                } else if (entity instanceof LivingEntity) {
                    entity.setItemSlot(EquipmentSlot.CHEST, new ItemStack(LatexModItems.HAZMAT_LEGGINGS.get()));
                }
                if (entity instanceof Player _player8) {
                    _player8.getInventory().armor.set(3, new ItemStack(LatexModItems.HAZMAT_BOOTS.get()));
                    _player8.getInventory().setChanged();
                } else if (entity instanceof LivingEntity) {
                    entity.setItemSlot(EquipmentSlot.HEAD, new ItemStack(LatexModItems.HAZMAT_BOOTS.get()));
                }
            }
        }
    }
}
