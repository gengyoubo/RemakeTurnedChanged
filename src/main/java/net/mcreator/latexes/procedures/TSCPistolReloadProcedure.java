package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/TSCPistolReloadProcedure.class */
public class TSCPistolReloadProcedure {
    public static void execute(Entity entity) {
        if (entity != null) {
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.TSC_PISTOL.get()) {
                if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 13.0d) {
                    if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") > 1.0d) {
                        if ((entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack((ItemLike) LatexModItems.TS_CPISTOLMAG.get()))) {
                            if (entity instanceof Player) {
                                ((Player) entity).getCooldowns().addCooldown((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem(), 32);
                            }
                            for (int index0 = 0; index0 < 12; index0++) {
                                if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 13.0d && (entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack((ItemLike) LatexModItems.TS_CPISTOLMAG.get()))) {
                                    (entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("ammo", (entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") + 1.0d);
                                    if (entity instanceof Player) {
                                        Player _player = (Player) entity;
                                        ItemStack _stktoremove = new ItemStack((ItemLike) LatexModItems.TS_CPISTOLMAG.get());
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
                if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 13.0d && (entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack((ItemLike) LatexModItems.TS_CPISTOLMAG.get()))) {
                    if (entity instanceof Player) {
                        ((Player) entity).getCooldowns().addCooldown((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem(), 55);
                    }
                    for (int index1 = 0; index1 < 30; index1++) {
                        if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 13.0d && (entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack((ItemLike) LatexModItems.TS_CPISTOLMAG.get()))) {
                            (entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("ammo", (entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") + 1.0d);
                            if (entity instanceof Player) {
                                Player _player2 = (Player) entity;
                                ItemStack _stktoremove2 = new ItemStack((ItemLike) LatexModItems.TS_CPISTOLMAG.get());
                                _player2.getInventory().clearOrCountMatchingItems(p -> {
                                    return _stktoremove2.getItem() == p.getItem();
                                }, 1, _player2.inventoryMenu.getCraftSlots());
                            }
                        }
                    }
                    return;
                }
                return;
            }
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY).getItem() == LatexModItems.TSC_PISTOL.get()) {
                if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 13.0d) {
                    if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") > 1.0d) {
                        if ((entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack((ItemLike) LatexModItems.TS_CPISTOLMAG.get()))) {
                            if (entity instanceof Player) {
                                ((Player) entity).getCooldowns().addCooldown((entity instanceof LivingEntity ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY).getItem(), 32);
                            }
                            for (int index2 = 0; index2 < 12; index2++) {
                                if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 13.0d && (entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack((ItemLike) LatexModItems.TS_CPISTOLMAG.get()))) {
                                    (entity instanceof LivingEntity ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("ammo", (entity instanceof LivingEntity ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") + 1.0d);
                                    if (entity instanceof Player) {
                                        Player _player3 = (Player) entity;
                                        ItemStack _stktoremove3 = new ItemStack((ItemLike) LatexModItems.TS_CPISTOLMAG.get());
                                        _player3.getInventory().clearOrCountMatchingItems(p -> {
                                            return _stktoremove3.getItem() == p.getItem();
                                        }, 1, _player3.inventoryMenu.getCraftSlots());
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
                if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 13.0d && (entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack((ItemLike) LatexModItems.TS_CPISTOLMAG.get()))) {
                    if (entity instanceof Player) {
                        ((Player) entity).getCooldowns().addCooldown((entity instanceof LivingEntity ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY).getItem(), 55);
                    }
                    for (int index3 = 0; index3 < 30; index3++) {
                        if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 13.0d && (entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack((ItemLike) LatexModItems.TS_CPISTOLMAG.get()))) {
                            (entity instanceof LivingEntity ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("ammo", (entity instanceof LivingEntity ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") + 1.0d);
                            if (entity instanceof Player) {
                                Player _player4 = (Player) entity;
                                ItemStack _stktoremove4 = new ItemStack((ItemLike) LatexModItems.TS_CPISTOLMAG.get());
                                _player4.getInventory().clearOrCountMatchingItems(p -> {
                                    return _stktoremove4.getItem() == p.getItem();
                                }, 1, _player4.inventoryMenu.getCraftSlots());
                            }
                        }
                    }
                }
            }
        }
    }
}
