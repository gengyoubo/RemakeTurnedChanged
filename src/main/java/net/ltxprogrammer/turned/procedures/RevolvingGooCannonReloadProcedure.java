package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.changed.init.ChangedItems;
import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/RevolvingGooCannonReloadProcedure.class */
public class RevolvingGooCannonReloadProcedure {
    public static void execute(Entity entity) {
        if (entity != null) {
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getItem() == LatexModItems.REVOLVING_GOO_CANNON.get()) {
                if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getMainHandItem() : ItemStack.EMPTY).getOrCreateTag().getDouble("ammo") < 3.0d && (entity instanceof Player) && ((Player) entity).getInventory().contains(new ItemStack(ChangedItems.DARK_LATEX_GOO.get()))) {
                    if (entity instanceof Player) {
                        ((Player) entity).getCooldowns().addCooldown(((LivingEntity) entity).getMainHandItem().getItem(), (int) (80.0d - ((LivingEntity) entity).getMainHandItem().getOrCreateTag().getDouble("ammo") * 10.0d));
                    }
                    for (int index0 = 0; index0 < 3; index0++) {
                        if (((LivingEntity) entity).getMainHandItem().getOrCreateTag().getDouble("ammo") < 3.0d && entity instanceof Player && ((Player) entity).getInventory().contains(new ItemStack(ChangedItems.DARK_LATEX_GOO.get()))) {
                            ((LivingEntity) entity).getMainHandItem().getOrCreateTag().putDouble("ammo", ((LivingEntity) entity).getMainHandItem().getOrCreateTag().getDouble("ammo") + 1.0d);
                            if (entity instanceof Player _player) {
                                ItemStack _stktoremove = new ItemStack(ChangedItems.DARK_LATEX_GOO.get());
                                _player.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player.inventoryMenu.getCraftSlots());
                            }
                        }
                    }
                }
            }
        }
    }
}
