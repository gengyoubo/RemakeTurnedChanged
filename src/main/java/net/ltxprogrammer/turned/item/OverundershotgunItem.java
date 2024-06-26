package net.ltxprogrammer.turned.item;

import net.ltxprogrammer.turned.entity.OverundershotgunEntity;
import net.ltxprogrammer.turned.init.LatexModTabs;
import net.ltxprogrammer.turned.procedures.OverundershotgunCanUseRangedItemProcedure;
import net.ltxprogrammer.turned.procedures.OverundershotgunRangedItemUsedProcedure;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/item/OverundershotgunItem.class */
public class OverundershotgunItem extends Item {
    public OverundershotgunItem() {
        super(new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS).durability(122));
    }

    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level world, Player entity, @NotNull InteractionHand hand) {
        entity.startUsingItem(hand);
        return new InteractionResultHolder<>(InteractionResult.SUCCESS, entity.getItemInHand(hand));
    }

    public @NotNull UseAnim getUseAnimation(@NotNull ItemStack itemstack) {
        return UseAnim.NONE;
    }

    public int getUseDuration(@NotNull ItemStack itemstack) {
        return 72000;
    }

    public void releaseUsing(@NotNull ItemStack itemstack, Level world, @NotNull LivingEntity entityLiving, int timeLeft) {
        if (!world.isClientSide() && (entityLiving instanceof ServerPlayer entity)) {
            entity.getX();
            entity.getY();
            entity.getZ();
            if (OverundershotgunCanUseRangedItemProcedure.execute(entity, itemstack)) {
                OverundershotgunEntity entityarrow = OverundershotgunEntity.shoot(world, entity, world.getRandom(), 1.0f, 3.0d, 2);
                itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
                entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
                OverundershotgunRangedItemUsedProcedure.execute(entity, itemstack);
            }
        }
    }
}