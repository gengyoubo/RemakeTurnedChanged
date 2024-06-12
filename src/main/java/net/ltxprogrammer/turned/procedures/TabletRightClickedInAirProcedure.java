package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.items.ItemHandlerHelper;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/TabletRightClickedInAirProcedure.class */
public class TabletRightClickedInAirProcedure {
    public static void execute(Entity entity) {
        if (entity != null) {
            if (entity instanceof Player) {
                Player _player = (Player) entity;
                ItemStack _stktoremove = new ItemStack((ItemLike) LatexModItems.TABLET.get());
                _player.getInventory().clearOrCountMatchingItems(p -> {
                    return _stktoremove.getItem() == p.getItem();
                }, 1, _player.inventoryMenu.getCraftSlots());
            }
            if (entity instanceof Player) {
                ItemStack _setstack = new ItemStack((ItemLike) LatexModItems.BATTERY.get());
                _setstack.setCount(1);
                ItemHandlerHelper.giveItemToPlayer((Player) entity, _setstack);
            }
            if (entity instanceof Player) {
                ItemStack _setstack2 = new ItemStack((ItemLike) LatexModItems.TABLETOFF.get());
                _setstack2.setCount(1);
                ItemHandlerHelper.giveItemToPlayer((Player) entity, _setstack2);
            }
        }
    }
}
