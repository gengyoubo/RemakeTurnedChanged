package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/MilitaryOnInitialEntitySpawnProcedure.class */
public class MilitaryOnInitialEntitySpawnProcedure {
    public static void execute(Entity entity) {
        if (entity != null) {
            if (Math.random() < 0.05d) {
                if (entity instanceof Player _player) {
                    _player.getInventory().armor.set(3, new ItemStack(LatexModItems.GOOD_BERET_HELMET.get()));
                    _player.getInventory().setChanged();
                } else if (entity instanceof LivingEntity) {
                    entity.setItemSlot(EquipmentSlot.HEAD, new ItemStack(LatexModItems.GOOD_BERET_HELMET.get()));
                }
            } else if (Math.random() >= 0.05d) {
            } else {
                if (entity instanceof Player _player2) {
                    _player2.getInventory().armor.set(3, new ItemStack(LatexModItems.RESPIRATOR_HELMET.get()));
                    _player2.getInventory().setChanged();
                } else if (entity instanceof LivingEntity) {
                    entity.setItemSlot(EquipmentSlot.HEAD, new ItemStack(LatexModItems.RESPIRATOR_HELMET.get()));
                }
            }
        }
    }
}
