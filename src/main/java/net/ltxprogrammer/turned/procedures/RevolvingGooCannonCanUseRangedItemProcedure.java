package net.ltxprogrammer.turned.procedures;

import net.minecraft.world.item.ItemStack;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/RevolvingGooCannonCanUseRangedItemProcedure.class */
public class RevolvingGooCannonCanUseRangedItemProcedure {
    public static boolean execute(ItemStack itemstack) {
        return itemstack.getOrCreateTag().getDouble("ammo") > 0.0d;
    }
}
