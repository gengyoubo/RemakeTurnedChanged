package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/ShotgunReloadProcedure.class */
public class ShotgunReloadProcedure {
    public static void execute(Entity entity) {
        if (entity != null) {
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.OVERUNDERSHOTGUN.get()) {
                if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 2.0d) {
                    if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") > 1.0d) {
                        if ((entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack((ItemLike) LatexModItems.SHOTGUN_SHELL.get()))) {
                            if (entity instanceof Player) {
                                ((Player) entity).getCooldowns().addCooldown((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem(), 32);
                            }
                            for (int index0 = 0; index0 < 2; index0++) {
                                if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 2.0d && (entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack((ItemLike) LatexModItems.SHOTGUN_SHELL.get()))) {
                                    (entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("ammo", (entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") + 1.0d);
                                    if (entity instanceof Player) {
                                        Player _player = (Player) entity;
                                        ItemStack _stktoremove = new ItemStack((ItemLike) LatexModItems.SHOTGUN_SHELL.get());
                                        _player.getInventory().clearOrCountMatchingItems(p -> {
                                            return _stktoremove.getItem() == p.getItem();
                                        }, 1, _player.inventoryMenu.getCraftSlots());
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
                if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 2.0d && (entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack((ItemLike) LatexModItems.SHOTGUN_SHELL.get()))) {
                    if (entity instanceof Player) {
                        ((Player) entity).getCooldowns().addCooldown((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem(), 48);
                    }
                    for (int index1 = 0; index1 < 2; index1++) {
                        if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 2.0d && (entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack((ItemLike) LatexModItems.SHOTGUN_SHELL.get()))) {
                            (entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("ammo", (entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") + 1.0d);
                            if (entity instanceof Player) {
                                Player _player2 = (Player) entity;
                                ItemStack _stktoremove2 = new ItemStack((ItemLike) LatexModItems.SHOTGUN_SHELL.get());
                                _player2.getInventory().clearOrCountMatchingItems(p -> {
                                    return _stktoremove2.getItem() == p.getItem();
                                }, 1, _player2.inventoryMenu.getCraftSlots());
                            }
                        }
                    }
                }
            }
        }
    }
}
