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
                if (entity instanceof Player) {
                    Player _player = (Player) entity;
                    _player.getInventory().armor.set(3, new ItemStack((ItemLike) LatexModItems.RESPIRATOR_HELMET.get()));
                    _player.getInventory().setChanged();
                } else if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).setItemSlot(EquipmentSlot.HEAD, new ItemStack((ItemLike) LatexModItems.RESPIRATOR_HELMET.get()));
                }
            }
            if (Math.random() < 0.001d) {
                if (entity instanceof Player) {
                    Player _player2 = (Player) entity;
                    _player2.getInventory().armor.set(0, new ItemStack((ItemLike) LatexModItems.HAZMAT_HELMET.get()));
                    _player2.getInventory().setChanged();
                } else if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).setItemSlot(EquipmentSlot.FEET, new ItemStack((ItemLike) LatexModItems.HAZMAT_HELMET.get()));
                }
                if (entity instanceof Player) {
                    Player _player3 = (Player) entity;
                    _player3.getInventory().armor.set(1, new ItemStack((ItemLike) LatexModItems.HAZMAT_CHESTPLATE.get()));
                    _player3.getInventory().setChanged();
                } else if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).setItemSlot(EquipmentSlot.LEGS, new ItemStack((ItemLike) LatexModItems.HAZMAT_CHESTPLATE.get()));
                }
                if (entity instanceof Player) {
                    Player _player4 = (Player) entity;
                    _player4.getInventory().armor.set(2, new ItemStack((ItemLike) LatexModItems.HAZMAT_LEGGINGS.get()));
                    _player4.getInventory().setChanged();
                } else if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).setItemSlot(EquipmentSlot.CHEST, new ItemStack((ItemLike) LatexModItems.HAZMAT_LEGGINGS.get()));
                }
                if (entity instanceof Player) {
                    Player _player5 = (Player) entity;
                    _player5.getInventory().armor.set(3, new ItemStack((ItemLike) LatexModItems.HAZMAT_BOOTS.get()));
                    _player5.getInventory().setChanged();
                } else if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).setItemSlot(EquipmentSlot.HEAD, new ItemStack((ItemLike) LatexModItems.HAZMAT_BOOTS.get()));
                }
            } else if (Math.random() < 0.001d) {
                if (entity instanceof Player) {
                    Player _player6 = (Player) entity;
                    _player6.getInventory().armor.set(1, new ItemStack((ItemLike) LatexModItems.HAZMAT_CHESTPLATE.get()));
                    _player6.getInventory().setChanged();
                } else if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).setItemSlot(EquipmentSlot.LEGS, new ItemStack((ItemLike) LatexModItems.HAZMAT_CHESTPLATE.get()));
                }
                if (entity instanceof Player) {
                    Player _player7 = (Player) entity;
                    _player7.getInventory().armor.set(2, new ItemStack((ItemLike) LatexModItems.HAZMAT_LEGGINGS.get()));
                    _player7.getInventory().setChanged();
                } else if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).setItemSlot(EquipmentSlot.CHEST, new ItemStack((ItemLike) LatexModItems.HAZMAT_LEGGINGS.get()));
                }
                if (entity instanceof Player) {
                    Player _player8 = (Player) entity;
                    _player8.getInventory().armor.set(3, new ItemStack((ItemLike) LatexModItems.HAZMAT_BOOTS.get()));
                    _player8.getInventory().setChanged();
                } else if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).setItemSlot(EquipmentSlot.HEAD, new ItemStack((ItemLike) LatexModItems.HAZMAT_BOOTS.get()));
                }
            }
        }
    }
}
