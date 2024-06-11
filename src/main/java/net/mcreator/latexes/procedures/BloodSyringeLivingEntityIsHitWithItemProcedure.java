package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.items.ItemHandlerHelper;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/BloodSyringeLivingEntityIsHitWithItemProcedure.class */
public class BloodSyringeLivingEntityIsHitWithItemProcedure {
    public static void execute(Entity entity, Entity sourceentity) {
        if (entity != null && sourceentity != null) {
            if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:darklatexes")))) {
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).hurt(new DamageSource("%1$s was drained to death").bypassArmor(), 1.0f);
                }
                if (sourceentity instanceof Player) {
                    Player _player = (Player) sourceentity;
                    ItemStack _stktoremove = new ItemStack((ItemLike) LatexModItems.SYRINGE.get());
                    _player.getInventory().clearOrCountMatchingItems(p -> {
                        return _stktoremove.getItem() == p.getItem();
                    }, 1, _player.inventoryMenu.getCraftSlots());
                }
                if (sourceentity instanceof Player) {
                    ItemStack _setstack = new ItemStack((ItemLike) LatexModItems.DL_SYRINGE.get());
                    _setstack.setCount(1);
                    ItemHandlerHelper.giveItemToPlayer((Player) sourceentity, _setstack);
                }
            } else if (entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("latex:humanlikes")))) {
                if (entity instanceof LivingEntity) {
                    ((LivingEntity) entity).hurt(new DamageSource("%1$s was drained to death").bypassArmor(), 3.0f);
                }
                if (sourceentity instanceof Player) {
                    Player _player2 = (Player) sourceentity;
                    ItemStack _stktoremove2 = new ItemStack((ItemLike) LatexModItems.SYRINGE.get());
                    _player2.getInventory().clearOrCountMatchingItems(p -> {
                        return _stktoremove2.getItem() == p.getItem();
                    }, 1, _player2.inventoryMenu.getCraftSlots());
                }
                if (sourceentity instanceof Player) {
                    ItemStack _setstack2 = new ItemStack((ItemLike) LatexModItems.BLOOD_SYRINGE.get());
                    _setstack2.setCount(1);
                    ItemHandlerHelper.giveItemToPlayer((Player) sourceentity, _setstack2);
                }
            }
        }
    }
}
