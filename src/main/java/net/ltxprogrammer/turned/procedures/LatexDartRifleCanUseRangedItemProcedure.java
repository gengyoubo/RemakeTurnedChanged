package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.items.ItemHandlerHelper;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/LatexDartRifleCanUseRangedItemProcedure.class */
public class LatexDartRifleCanUseRangedItemProcedure {
    public static boolean execute(Entity entity, ItemStack itemstack) {
        if (entity == null) {
            return false;
        }
        if (LatexModItems.DART.get() == (entity instanceof LivingEntity ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY).getItem()) {
            if (entity instanceof Player) {
                Player _player = (Player) entity;
                ItemStack _stktoremove = new ItemStack((ItemLike) LatexModItems.LATEX_DART_RIFLE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> {
                    return _stktoremove.getItem() == p.getItem();
                }, 1, _player.inventoryMenu.getCraftSlots());
            }
            if (entity instanceof Player) {
                ItemStack _setstack = new ItemStack((ItemLike) LatexModItems.DARTRIFLE.get());
                _setstack.setCount(1);
                ItemHandlerHelper.giveItemToPlayer((Player) entity, _setstack);
            }
        }
        return itemstack.getOrCreateTag().getDouble("ammo") > 0.0d;
    }
}
