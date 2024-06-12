package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/DarklatexOnInitialEntitySpawnProcedure.class */
public class DarklatexOnInitialEntitySpawnProcedure {
    public static void execute(Entity entity) {
        if (entity != null) {
            if (Math.random() < 0.05d) {
                if (entity instanceof LivingEntity _entity) {
                    ItemStack _setstack = new ItemStack(LatexModItems.DL_SWORD.get());
                    _setstack.setCount(1);
                    _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
                    if (_entity instanceof Player) {
                        ((Player) _entity).getInventory().setChanged();
                    }
                }
            } else if (Math.random() < 0.05d && (entity instanceof LivingEntity _entity2)) {
                ItemStack _setstack2 = new ItemStack(LatexModItems.DL_SCYTHE.get());
                _setstack2.setCount(1);
                _entity2.setItemInHand(InteractionHand.MAIN_HAND, _setstack2);
                if (_entity2 instanceof Player) {
                    ((Player) _entity2).getInventory().setChanged();
                }
            }
        }
    }
}
