package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.changed.init.ChangedBlocks;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/LatexcannonRangedItemUsedProcedure.class */
public class LatexcannonRangedItemUsedProcedure {
    public static void execute(Entity entity, ItemStack itemstack) {
        if (entity != null) {
            if (entity instanceof Player) {
                ((Player) entity).getCooldowns().addCooldown(itemstack.getItem(), 25);
            }
            if (((double) itemstack.getDamageValue()) > 0.1d) {
                return;
            }
            if ((entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack(ChangedBlocks.DARK_LATEX_BLOCK.get()))) {
                if (entity instanceof Player _player) {
                    ItemStack _stktoremove = new ItemStack(ChangedBlocks.DARK_LATEX_BLOCK.get());
                    _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
                }
                itemstack.setDamageValue(0);
                if (entity instanceof Player) {
                    ((Player) entity).getCooldowns().addCooldown(itemstack.getItem(), 120);
                }
            } else if ((entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack(ChangedBlocks.DARK_LATEX_BLOCK.get()))) {
                if (entity instanceof Player _player2) {
                    ItemStack _stktoremove2 = new ItemStack(ChangedBlocks.DARK_LATEX_BLOCK.get());
                    _player2.getInventory().clearOrCountMatchingItems(p -> _stktoremove2.getItem() == p.getItem(), 1, _player2.inventoryMenu.getCraftSlots());
                }
                itemstack.setDamageValue(0);
                if (entity instanceof Player) {
                    ((Player) entity).getCooldowns().addCooldown(itemstack.getItem(), 120);
                }
            }
        }
    }
}
