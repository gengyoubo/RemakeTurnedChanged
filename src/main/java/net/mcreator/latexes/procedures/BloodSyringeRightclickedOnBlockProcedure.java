package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.items.ItemHandlerHelper;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/BloodSyringeRightclickedOnBlockProcedure.class */
public class BloodSyringeRightclickedOnBlockProcedure {
    public static void execute(Entity entity) {
        float f;
        if (entity != null) {
            float health = entity instanceof LivingEntity ? ((LivingEntity) entity).getHealth() : -1.0f;
            if (entity instanceof LivingEntity) {
                f = ((LivingEntity) entity).getMaxHealth();
            } else {
                f = -1.0f;
            }
            if (health < f) {
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).setHealth((entity instanceof LivingEntity ? ((LivingEntity) entity).getHealth() : -1.0f) + 3.0f);
                }
                if (entity instanceof Player) {
                    Player _player = (Player) entity;
                    ItemStack _stktoremove = new ItemStack((ItemLike) LatexModItems.BLOOD_SYRINGE.get());
                    _player.getInventory().clearOrCountMatchingItems(p -> {
                        return _stktoremove.getItem() == p.getItem();
                    }, 1, _player.inventoryMenu.getCraftSlots());
                }
                if (entity instanceof Player) {
                    ItemStack _setstack = new ItemStack((ItemLike) LatexModItems.SYRINGE.get());
                    _setstack.setCount(1);
                    ItemHandlerHelper.giveItemToPlayer((Player) entity, _setstack);
                }
            }
        }
    }
}
