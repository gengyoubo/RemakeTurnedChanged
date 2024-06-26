package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/MilitaryOnInitialEntitySpawnProcedure.class */
public class MilitaryOnInitialEntitySpawnProcedure {
    public static void execute(Entity entity) {
        if (entity != null) {
            if (Math.random() < 0.05d) {
                if (entity instanceof Player) {
                    Player _player = (Player) entity;
                    _player.getInventory().armor.set(3, new ItemStack((ItemLike) LatexModItems.GOOD_BERET_HELMET.get()));
                    _player.getInventory().setChanged();
                } else if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).setItemSlot(EquipmentSlot.HEAD, new ItemStack((ItemLike) LatexModItems.GOOD_BERET_HELMET.get()));
                }
            } else if (Math.random() >= 0.05d) {
            } else {
                if (entity instanceof Player) {
                    Player _player2 = (Player) entity;
                    _player2.getInventory().armor.set(3, new ItemStack((ItemLike) LatexModItems.RESPIRATOR_HELMET.get()));
                    _player2.getInventory().setChanged();
                } else if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).setItemSlot(EquipmentSlot.HEAD, new ItemStack((ItemLike) LatexModItems.RESPIRATOR_HELMET.get()));
                }
            }
        }
    }
}
