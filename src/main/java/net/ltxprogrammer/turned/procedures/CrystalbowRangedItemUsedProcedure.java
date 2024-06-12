package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.items.ItemHandlerHelper;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/CrystalbowRangedItemUsedProcedure.class */
public class CrystalbowRangedItemUsedProcedure {
    public static void execute(Entity entity, ItemStack itemstack) {
        if (entity != null) {
            if (entity instanceof Player) {
                ((Player) entity).getCooldowns().addCooldown(itemstack.getItem(), 25);
            }
            if (!((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == LatexModItems.DARK_LATEX_QUIVER_CHESTPLATE.get() && (entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack(LatexModItems.CRYSTALARROW.get())))) {
                if (entity instanceof Player) {
                    ((Player) entity).getCooldowns().addCooldown(itemstack.getItem(), 25);
                }
                if (entity instanceof Player _player) {
                    ItemStack _stktoremove = new ItemStack(LatexModItems.CRYSTALBOW.get());
                    _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
                }
                if (entity instanceof Player) {
                    ItemStack _setstack = new ItemStack(LatexModItems.CRYSTAL_BOW_UNLOADED.get());
                    _setstack.setCount(1);
                    ItemHandlerHelper.giveItemToPlayer((Player) entity, _setstack);
                }
            }
        }
    }
}
