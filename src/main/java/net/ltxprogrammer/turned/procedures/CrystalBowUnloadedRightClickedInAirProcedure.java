package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.items.ItemHandlerHelper;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/CrystalBowUnloadedRightClickedInAirProcedure.class */
public class CrystalBowUnloadedRightClickedInAirProcedure {
    public static void execute(Entity entity) {
        if (entity != null) {
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY).getItem() == LatexModItems.CRYSTALARROW.get()) {
                if (entity instanceof Player _player) {
                    ItemStack _stktoremove = new ItemStack(LatexModItems.CRYSTAL_BOW_UNLOADED.get());
                    _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
                }
                if (entity instanceof Player) {
                    ItemStack _setstack = new ItemStack(LatexModItems.CRYSTALBOW.get());
                    _setstack.setCount(1);
                    ItemHandlerHelper.giveItemToPlayer((Player) entity, _setstack);
                    return;
                }
                return;
            }
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == LatexModItems.DARK_LATEX_QUIVER_CHESTPLATE.get() && (entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack(LatexModItems.CRYSTALARROW.get()))) {
                if (entity instanceof Player _player2) {
                    ItemStack _stktoremove2 = new ItemStack(LatexModItems.CRYSTAL_BOW_UNLOADED.get());
                    _player2.getInventory().clearOrCountMatchingItems(p -> _stktoremove2.getItem() == p.getItem(), 1, _player2.inventoryMenu.getCraftSlots());
                }
                if (entity instanceof Player) {
                    ItemStack _setstack2 = new ItemStack(LatexModItems.CRYSTALBOW.get());
                    _setstack2.setCount(1);
                    ItemHandlerHelper.giveItemToPlayer((Player) entity, _setstack2);
                }
            }
        }
    }
}
