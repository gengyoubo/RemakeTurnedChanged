package net.mcreator.latexes.procedures;

import net.minecraft.world.item.ItemStack;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/FlamethowerRangedItemUsedProcedure.class */
public class FlamethowerRangedItemUsedProcedure {
    public static void execute(ItemStack itemstack) {
        if (itemstack.getOrCreateTag().getDouble("ammo") >= 1.0d) {
            itemstack.getOrCreateTag().putDouble("ammo", itemstack.getOrCreateTag().getDouble("ammo") - 1.0d);
        }
    }
}
