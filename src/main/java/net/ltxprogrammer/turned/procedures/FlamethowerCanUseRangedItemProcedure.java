package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/FlamethowerCanUseRangedItemProcedure.class */
public class FlamethowerCanUseRangedItemProcedure {
    public static boolean execute(Entity entity, ItemStack itemstack) {
        if (entity != null && itemstack.getOrCreateTag().getDouble("ammo") > 0.0d) {
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.FLAMETHOWER.get()) {
                return true;
            }
        }
        return false;
    }
}
