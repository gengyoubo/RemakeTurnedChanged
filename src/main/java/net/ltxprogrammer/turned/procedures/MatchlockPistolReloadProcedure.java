package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/MatchlockPistolReloadProcedure.class */
public class MatchlockPistolReloadProcedure {
    public static void execute(Entity entity) {
        if (entity != null) {
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.MATCHLOCK_PISTOL.get()) {
                if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 1.0d && (entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack(LatexModItems.MUSKETBALL.get()))) {
                    if (entity instanceof Player) {
                        ((Player) entity).getCooldowns().addCooldown(((LivingEntity) entity).getMainHandItem().getItem(), 124);
                    }
                    ((LivingEntity) entity).getMainHandItem().getOrCreateTag().putDouble("ammo", ((LivingEntity) entity).getMainHandItem().getOrCreateTag().getDouble("ammo") + 1.0d);
                    if (entity instanceof Player _player) {
                        ItemStack _stktoremove = new ItemStack(LatexModItems.MUSKETBALL.get());
                        _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
                        return;
                    }
                    return;
                }
                return;
            }
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY).getItem() == LatexModItems.MATCHLOCK_PISTOL.get()) {
                if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getOffhandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 1.0d && (entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack(LatexModItems.MUSKETBALL.get()))) {
                    if (entity instanceof Player) {
                        ((Player) entity).getCooldowns().addCooldown(((LivingEntity) entity).getOffhandItem().getItem(), 124);
                    }
                    ((LivingEntity) entity).getOffhandItem().getOrCreateTag().putDouble("ammo", ((LivingEntity) entity).getOffhandItem().getOrCreateTag().getDouble("ammo") + 1.0d);
                    if (entity instanceof Player _player2) {
                        ItemStack _stktoremove2 = new ItemStack(LatexModItems.MUSKETBALL.get());
                        _player2.getInventory().clearOrCountMatchingItems(p -> _stktoremove2.getItem() == p.getItem(), 1, _player2.inventoryMenu.getCraftSlots());
                    }
                }
            }
        }
    }
}
