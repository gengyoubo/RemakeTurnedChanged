package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/NoiseStalkerOnInitialEntitySpawnProcedure.class */
public class NoiseStalkerOnInitialEntitySpawnProcedure {
    public static void execute(Entity entity) {
        if (entity != null && Math.random() < 0.05d && (entity instanceof LivingEntity)) {
            LivingEntity _entity = (LivingEntity) entity;
            ItemStack _setstack = new ItemStack((ItemLike) LatexModItems.DL_AXE.get());
            _setstack.setCount(1);
            _entity.setItemInHand(InteractionHand.MAIN_HAND, _setstack);
            if (_entity instanceof Player) {
                ((Player) _entity).getInventory().setChanged();
            }
        }
    }
}
