package net.ltxprogrammer.turned.procedures;

import net.minecraft.world.item.ItemStack;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/FlamethowerRangedItemUsedProcedure.class */
public class FlamethowerRangedItemUsedProcedure {
    public static void execute(ItemStack itemstack) {
        if (itemstack.getOrCreateTag().getDouble("ammo") >= 1.0d) {
            itemstack.getOrCreateTag().putDouble("ammo", itemstack.getOrCreateTag().getDouble("ammo") - 1.0d);
        }
    }
}
