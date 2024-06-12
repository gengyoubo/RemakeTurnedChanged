package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/TSCPistolReloadProcedure.class */
public class TSCPistolReloadProcedure {
    public static void execute(Entity entity) {
        if (entity != null) {
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.TSC_PISTOL.get()) {
                if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 13.0d) {
                    if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") > 1.0d) {
                        if ((entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack(LatexModItems.TS_CPISTOLMAG.get()))) {
                            if (entity instanceof Player) {
                                ((Player) entity).getCooldowns().addCooldown(((LivingEntity) entity).getMainHandItem().getItem(), 32);
                            }
                            for (int index0 = 0; index0 < 12; index0++) {
                                if (((LivingEntity) entity).getMainHandItem().getOrCreateTag().getDouble("ammo") < 13.0d && entity instanceof Player && ((Player) entity).getInventory().contains(new ItemStack(LatexModItems.TS_CPISTOLMAG.get()))) {
                                    ((LivingEntity) entity).getMainHandItem().getOrCreateTag().putDouble("ammo", ((LivingEntity) entity).getMainHandItem().getOrCreateTag().getDouble("ammo") + 1.0d);
                                    if (entity instanceof Player _player) {
                                        ItemStack _stktoremove = new ItemStack(LatexModItems.TS_CPISTOLMAG.get());
                                        _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
                if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 13.0d && (entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack(LatexModItems.TS_CPISTOLMAG.get()))) {
                    if (entity instanceof Player) {
                        ((Player) entity).getCooldowns().addCooldown(((LivingEntity) entity).getMainHandItem().getItem(), 55);
                    }
                    for (int index1 = 0; index1 < 30; index1++) {
                        if (((LivingEntity) entity).getMainHandItem().getOrCreateTag().getDouble("ammo") < 13.0d && entity instanceof Player && ((Player) entity).getInventory().contains(new ItemStack(LatexModItems.TS_CPISTOLMAG.get()))) {
                            ((LivingEntity) entity).getMainHandItem().getOrCreateTag().putDouble("ammo", ((LivingEntity) entity).getMainHandItem().getOrCreateTag().getDouble("ammo") + 1.0d);
                            if (entity instanceof Player _player2) {
                                ItemStack _stktoremove2 = new ItemStack(LatexModItems.TS_CPISTOLMAG.get());
                                _player2.getInventory().clearOrCountMatchingItems(p -> _stktoremove2.getItem() == p.getItem(), 1, _player2.inventoryMenu.getCraftSlots());
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
                        if ((entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack(LatexModItems.TS_CPISTOLMAG.get()))) {
                            if (entity instanceof Player) {
                                ((Player) entity).getCooldowns().addCooldown(((LivingEntity) entity).getOffhandItem().getItem(), 32);
                            }
                            for (int index2 = 0; index2 < 12; index2++) {
                                if (((LivingEntity) entity).getOffhandItem().getOrCreateTag().getDouble("ammo") < 13.0d && entity instanceof Player && ((Player) entity).getInventory().contains(new ItemStack(LatexModItems.TS_CPISTOLMAG.get()))) {
                                    ((LivingEntity) entity).getOffhandItem().getOrCreateTag().putDouble("ammo", ((LivingEntity) entity).getOffhandItem().getOrCreateTag().getDouble("ammo") + 1.0d);
                                    if (entity instanceof Player _player3) {
                                        ItemStack _stktoremove3 = new ItemStack(LatexModItems.TS_CPISTOLMAG.get());
                                        _player3.getInventory().clearOrCountMatchingItems(p -> _stktoremove3.getItem() == p.getItem(), 1, _player3.inventoryMenu.getCraftSlots());
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    }
                }
                if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 13.0d && (entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack(LatexModItems.TS_CPISTOLMAG.get()))) {
                    if (entity instanceof Player) {
                        ((Player) entity).getCooldowns().addCooldown(((LivingEntity) entity).getOffhandItem().getItem(), 55);
                    }
                    for (int index3 = 0; index3 < 30; index3++) {
                        if (((LivingEntity) entity).getOffhandItem().getOrCreateTag().getDouble("ammo") < 13.0d && entity instanceof Player && ((Player) entity).getInventory().contains(new ItemStack(LatexModItems.TS_CPISTOLMAG.get()))) {
                            ((LivingEntity) entity).getOffhandItem().getOrCreateTag().putDouble("ammo", ((LivingEntity) entity).getOffhandItem().getOrCreateTag().getDouble("ammo") + 1.0d);
                            if (entity instanceof Player _player4) {
                                ItemStack _stktoremove4 = new ItemStack(LatexModItems.TS_CPISTOLMAG.get());
                                _player4.getInventory().clearOrCountMatchingItems(p -> _stktoremove4.getItem() == p.getItem(), 1, _player4.inventoryMenu.getCraftSlots());
                            }
                        }
                    }
                }
            }
        }
    }
}
