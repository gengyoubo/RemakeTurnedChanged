package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/MatchlockReloadProcedure.class */
public class MatchlockReloadProcedure {
    public static void execute(Entity entity) {
        if (entity != null) {
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.MATCH_LOCK_MUSKET.get()) {
                if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 1.0d && (entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack((ItemLike) LatexModItems.MUSKETBALL.get()))) {
                    if (entity instanceof Player) {
                        ((Player) entity).getCooldowns().addCooldown((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem(), 185);
                    }
                    (entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().putDouble("ammo", (entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") + 1.0d);
                    if (entity instanceof Player) {
                        Player _player = (Player) entity;
                        ItemStack _stktoremove = new ItemStack((ItemLike) LatexModItems.MUSKETBALL.get());
                        _player.getInventory().clearOrCountMatchingItems(p -> {
                            return _stktoremove.getItem() == p.getItem();
                        }, 1, _player.inventoryMenu.getCraftSlots());
                    }
                }
            }
        }
    }
}
