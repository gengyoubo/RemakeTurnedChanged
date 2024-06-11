package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModBlocks;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/LatexcannonRangedItemUsedProcedure.class */
public class LatexcannonRangedItemUsedProcedure {
    public static void execute(Entity entity, ItemStack itemstack) {
        if (entity != null) {
            if (entity instanceof Player) {
                ((Player) entity).getCooldowns().addCooldown(itemstack.getItem(), 25);
            }
            if (((double) itemstack.getDamageValue()) > 0.1d) {
                return;
            }
            if ((entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack((ItemLike) LatexModBlocks.DARKLATEXBLOCKHARMLESS.get()))) {
                if (entity instanceof Player) {
                    Player _player = (Player) entity;
                    ItemStack _stktoremove = new ItemStack((ItemLike) LatexModBlocks.DARKLATEXBLOCKHARMLESS.get());
                    _player.getInventory().clearOrCountMatchingItems(p -> {
                        return _stktoremove.getItem() == p.getItem();
                    }, 1, _player.inventoryMenu.getCraftSlots());
                }
                itemstack.setDamageValue(0);
                if (entity instanceof Player) {
                    ((Player) entity).getCooldowns().addCooldown(itemstack.getItem(), 120);
                }
            } else if ((entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack((ItemLike) LatexModBlocks.DARKLATEXBLOCK.get()))) {
                if (entity instanceof Player) {
                    Player _player2 = (Player) entity;
                    ItemStack _stktoremove2 = new ItemStack((ItemLike) LatexModBlocks.DARKLATEXBLOCK.get());
                    _player2.getInventory().clearOrCountMatchingItems(p -> {
                        return _stktoremove2.getItem() == p.getItem();
                    }, 1, _player2.inventoryMenu.getCraftSlots());
                }
                itemstack.setDamageValue(0);
                if (entity instanceof Player) {
                    ((Player) entity).getCooldowns().addCooldown(itemstack.getItem(), 120);
                }
            }
        }
    }
}
