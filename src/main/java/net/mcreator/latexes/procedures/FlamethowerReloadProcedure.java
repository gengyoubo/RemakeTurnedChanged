package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/FlamethowerReloadProcedure.class */
public class FlamethowerReloadProcedure {
    public static void execute(Entity entity) {
        if (entity != null) {
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.FLAMETHOWER.get()) {
                if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") >= 100.0d) {
                    return;
                }
                if (((entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack(Items.COAL))) || ((entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack(Items.CHARCOAL)))) {
                    if (entity instanceof Player) {
                        ((Player) entity).getCooldowns().addCooldown((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem(), 125);
                    }
                    for (int index0 = 0; index0 < 30; index0++) {
                        if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 100.0d && (((entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack(Items.COAL))) || ((entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack(Items.CHARCOAL))))) {
                            if ((entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack(Items.COAL))) {
                                (entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("ammo", (entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") + 10.0d);
                                if (entity instanceof Player) {
                                    Player _player = (Player) entity;
                                    ItemStack _stktoremove = new ItemStack(Items.COAL);
                                    _player.getInventory().clearOrCountMatchingItems(p -> {
                                        return _stktoremove.getItem() == p.getItem();
                                    }, 1, _player.inventoryMenu.getCraftSlots());
                                }
                            } else if ((entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack(Items.CHARCOAL))) {
                                (entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("ammo", (entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") + 8.0d);
                                if (entity instanceof Player) {
                                    Player _player2 = (Player) entity;
                                    ItemStack _stktoremove2 = new ItemStack(Items.CHARCOAL);
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
}
