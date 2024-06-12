package net.ltxprogrammer.turned.item;

import net.ltxprogrammer.turned.entity.MatchLockMusketEntity;
import net.ltxprogrammer.turned.init.LatexModTabs;
import net.ltxprogrammer.turned.procedures.MatchLockMusketCanUseRangedItemProcedure;
import net.ltxprogrammer.turned.procedures.MatchLockMusketRangedItemUsedProcedure;
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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/item/MatchLockMusketItem.class */
public class MatchLockMusketItem extends Item {
    public MatchLockMusketItem() {
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

    public void onUsingTick(ItemStack itemstack, LivingEntity entityLiving, int count) {
        Level world = entityLiving.level;
        if (!world.isClientSide() && (entityLiving instanceof ServerPlayer entity)) {
            double x = entity.getX();
            double y = entity.getY();
            double z = entity.getZ();
            if (MatchLockMusketCanUseRangedItemProcedure.execute(entity, itemstack)) {
                MatchLockMusketEntity entityarrow = MatchLockMusketEntity.shoot(world, entity, world.getRandom(), 2.0f, 3.0d, 1);
                itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
                entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
                MatchLockMusketRangedItemUsedProcedure.execute(world, x, y, z, entity, itemstack);
                entity.releaseUsingItem();
            }
        }
    }
}
