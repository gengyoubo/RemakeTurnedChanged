package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/DartRifleReloadProcedure.class */
public class DartRifleReloadProcedure {
    public static void execute(Entity entity) {
        if (entity != null) {
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.DARTRIFLE.get()) {
                if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 5.0d && (entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack((ItemLike) LatexModItems.DART.get()))) {
                    if (entity instanceof Player) {
                        ((Player) entity).getCooldowns().addCooldown((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem(), 95);
                    }
                    for (int index0 = 0; index0 < 5; index0++) {
                        if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 5.0d && (entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack((ItemLike) LatexModItems.DART.get()))) {
                            (entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("ammo", (entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") + 1.0d);
                            if (entity instanceof Player) {
                                Player _player = (Player) entity;
                                ItemStack _stktoremove = new ItemStack((ItemLike) LatexModItems.DART.get());
                                _player.getInventory().clearOrCountMatchingItems(p -> {
                                    return _stktoremove.getItem() == p.getItem();
                                }, 1, _player.inventoryMenu.getCraftSlots());
                            }
                        }
                    }
                }
            }
        }
    }
}
