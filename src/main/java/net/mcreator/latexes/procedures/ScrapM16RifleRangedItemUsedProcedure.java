package net.mcreator.latexes.procedures;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/ScrapM16RifleRangedItemUsedProcedure.class */
public class ScrapM16RifleRangedItemUsedProcedure {
    public static void execute(Entity entity, ItemStack itemstack) {
        if (entity != null) {
            if (entity instanceof Player) {
                ((Player) entity).getCooldowns().addCooldown(itemstack.getItem(), 6);
            }
            if (itemstack.getOrCreateTag().getDouble("ammo") >= 1.0d) {
                itemstack.getOrCreateTag().putDouble("ammo", itemstack.getOrCreateTag().getDouble("ammo") - 1.0d);
            }
        }
    }
}
