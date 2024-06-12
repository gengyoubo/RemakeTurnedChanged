package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/FlamethowerReloadProcedure.class */
public class FlamethowerReloadProcedure {
    public static void execute(Entity entity) {
        if (entity != null) {
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.FLAMETHOWER.get()) {
                if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") >= 100.0d) {
                    return;
                }
                if (((entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack(Items.COAL))) || ((entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack(Items.CHARCOAL)))) {
                    if (entity instanceof Player) {
                        ((Player) entity).getCooldowns().addCooldown(((LivingEntity) entity).getMainHandItem().getItem(), 125);
                    }
                    for (int index0 = 0; index0 < 30; index0++) {
                        if (((LivingEntity) entity).getMainHandItem().getOrCreateTag().getDouble("ammo") < 100.0d && (entity instanceof Player && ((Player) entity).getInventory().contains(new ItemStack(Items.COAL)) || entity instanceof Player && ((Player) entity).getInventory().contains(new ItemStack(Items.CHARCOAL)))) {
                            if ((entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack(Items.COAL))) {
                                ((LivingEntity) entity).getMainHandItem().getOrCreateTag().putDouble("ammo", ((LivingEntity) entity).getMainHandItem().getOrCreateTag().getDouble("ammo") + 10.0d);
                                if (entity instanceof Player _player) {
                                    ItemStack _stktoremove = new ItemStack(Items.COAL);
                                    _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
                                }
                            } else if ((entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack(Items.CHARCOAL))) {
                                ((LivingEntity) entity).getMainHandItem().getOrCreateTag().putDouble("ammo", ((LivingEntity) entity).getMainHandItem().getOrCreateTag().getDouble("ammo") + 8.0d);
                                if (entity instanceof Player _player2) {
                                    ItemStack _stktoremove2 = new ItemStack(Items.CHARCOAL);
                                    _player2.getInventory().clearOrCountMatchingItems(p -> _stktoremove2.getItem() == p.getItem(), 1, _player2.inventoryMenu.getCraftSlots());
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
