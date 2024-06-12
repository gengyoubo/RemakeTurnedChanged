package net.ltxprogrammer.turned.procedures;

import net.ltxprogrammer.changed.init.ChangedItems;
import net.ltxprogrammer.turned.init.LatexModItems;
import net.ltxprogrammer.turned.init.LatexModMobEffects;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.items.ItemHandlerHelper;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/VaccineSyringeRightclickedOnBlockProcedure.class */
public class VaccineSyringeRightclickedOnBlockProcedure {
    public static void execute(Entity entity) {
        if (entity != null) {
            if (entity instanceof LivingEntity) {
                ((LivingEntity) entity).addEffect(new MobEffectInstance((MobEffect) LatexModMobEffects.VACCINEEFFECT.get(), 3750, 1));
            }
            if (entity instanceof Player) {
                Player _player = (Player) entity;
                ItemStack _stktoremove = new ItemStack((ItemLike) LatexModItems.VACCINE_SYRINGE.get());
                _player.getInventory().clearOrCountMatchingItems(p -> {
                    return _stktoremove.getItem() == p.getItem();
                }, 1, _player.inventoryMenu.getCraftSlots());
            }
            if (entity instanceof Player) {
                ItemStack _setstack = new ItemStack((ItemLike) ChangedItems.SYRINGE.get());
                _setstack.setCount(1);
                ItemHandlerHelper.giveItemToPlayer((Player) entity, _setstack);
            }
        }
    }
}
