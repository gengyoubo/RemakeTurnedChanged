package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/EvilMilitaryOnInitialEntitySpawnProcedure.class */
public class EvilMilitaryOnInitialEntitySpawnProcedure {
    public static void execute(Entity entity) {
        if (entity == null || Math.random() >= 0.05d) {
            return;
        }
        if (entity instanceof Player _player) {
            _player.getInventory().armor.set(3, new ItemStack(LatexModItems.EVIL_BERET_HELMET.get()));
            _player.getInventory().setChanged();
        } else if (entity instanceof LivingEntity) {
            entity.setItemSlot(EquipmentSlot.HEAD, new ItemStack(LatexModItems.EVIL_BERET_HELMET.get()));
        }
    }
}
