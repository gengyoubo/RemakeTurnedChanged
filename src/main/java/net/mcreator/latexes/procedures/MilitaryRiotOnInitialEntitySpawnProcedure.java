package net.mcreator.latexes.procedures;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/MilitaryRiotOnInitialEntitySpawnProcedure.class */
public class MilitaryRiotOnInitialEntitySpawnProcedure {
    public static void execute(Entity entity) {
        if (entity != null && Math.random() < 0.2d && (entity instanceof LivingEntity)) {
            LivingEntity _entity = (LivingEntity) entity;
            ItemStack _setstack = new ItemStack(Items.SHIELD);
            _setstack.setCount(1);
            _entity.setItemInHand(InteractionHand.OFF_HAND, _setstack);
            if (_entity instanceof Player) {
                ((Player) _entity).getInventory().setChanged();
            }
        }
    }
}
