package net.mcreator.latexes.item;

import net.mcreator.latexes.entity.LatexcannonEntity;
import net.mcreator.latexes.init.LatexModTabs;
import net.mcreator.latexes.procedures.LatexcannonRangedItemUsedProcedure;
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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/LatexcannonItem.class */
public class LatexcannonItem extends Item {
    public LatexcannonItem() {
        super(new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS).durability(64));
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
        if (!world.isClientSide() && (entityLiving instanceof ServerPlayer)) {
            ServerPlayer entity = (ServerPlayer) entityLiving;
            entity.getX();
            entity.getY();
            entity.getZ();
            LatexcannonEntity entityarrow = LatexcannonEntity.shoot(world, entity, world.getRandom(), 1.0f, 6.0d, 2);
            itemstack.hurtAndBreak(1, entity, e -> {
                e.broadcastBreakEvent(entity.getUsedItemHand());
            });
            entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
            LatexcannonRangedItemUsedProcedure.execute(entity, itemstack);
        }
    }
}
