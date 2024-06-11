package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/EvilMilitaryOnInitialEntitySpawnProcedure.class */
public class EvilMilitaryOnInitialEntitySpawnProcedure {
    public static void execute(Entity entity) {
        if (entity == null || Math.random() >= 0.05d) {
            return;
        }
        if (entity instanceof Player) {
            Player _player = (Player) entity;
            _player.getInventory().armor.set(3, new ItemStack((ItemLike) LatexModItems.EVIL_BERET_HELMET.get()));
            _player.getInventory().setChanged();
        } else if (entity instanceof LivingEntity) {
            ((LivingEntity) entity).setItemSlot(EquipmentSlot.HEAD, new ItemStack((ItemLike) LatexModItems.EVIL_BERET_HELMET.get()));
        }
    }
}
