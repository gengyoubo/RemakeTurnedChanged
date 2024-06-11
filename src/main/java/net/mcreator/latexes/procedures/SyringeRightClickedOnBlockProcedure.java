package net.mcreator.latexes.procedures;

import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.items.ItemHandlerHelper;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/SyringeRightClickedOnBlockProcedure.class */
public class SyringeRightClickedOnBlockProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if (world.getBlockState(new BlockPos(x, y, z)).is(BlockTags.create(new ResourceLocation("latex:darklatexblocks")))) {
                if (entity instanceof Player) {
                    Player _player = (Player) entity;
                    ItemStack _stktoremove = new ItemStack((ItemLike) LatexModItems.SYRINGE.get());
                    _player.getInventory().clearOrCountMatchingItems(p -> {
                        return _stktoremove.getItem() == p.getItem();
                    }, 1, _player.inventoryMenu.getCraftSlots());
                }
                if (entity instanceof Player) {
                    ItemStack _setstack = new ItemStack((ItemLike) LatexModItems.DL_SYRINGE.get());
                    _setstack.setCount(1);
                    ItemHandlerHelper.giveItemToPlayer((Player) entity, _setstack);
                    return;
                }
                return;
            }
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getHealth() : -1.0f) > 2.0f) {
                if (entity instanceof Player) {
                    Player _player2 = (Player) entity;
                    ItemStack _stktoremove2 = new ItemStack((ItemLike) LatexModItems.SYRINGE.get());
                    _player2.getInventory().clearOrCountMatchingItems(p -> {
                        return _stktoremove2.getItem() == p.getItem();
                    }, 1, _player2.inventoryMenu.getCraftSlots());
                }
                entity.hurt(DamageSource.DRY_OUT, 2.0f);
                if (entity instanceof Player) {
                    ItemStack _setstack2 = new ItemStack((ItemLike) LatexModItems.BLOOD_SYRINGE.get());
                    _setstack2.setCount(1);
                    ItemHandlerHelper.giveItemToPlayer((Player) entity, _setstack2);
                }
            }
        }
    }
}
