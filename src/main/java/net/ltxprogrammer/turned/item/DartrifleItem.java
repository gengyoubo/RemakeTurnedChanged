package net.ltxprogrammer.turned.item;

import net.ltxprogrammer.turned.entity.DartrifleEntity;
import net.ltxprogrammer.turned.init.LatexModTabs;
import net.ltxprogrammer.turned.procedures.DartrifleCanUseRangedItemProcedure;
import net.ltxprogrammer.turned.procedures.DartrifleEntitySwingsItemProcedure;
import net.ltxprogrammer.turned.procedures.DartrifleRangedItemUsedProcedure;
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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/item/DartrifleItem.class */
public class DartrifleItem extends Item {
    public DartrifleItem() {
        super(new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(1));
    }

    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        entity.startUsingItem(hand);
        return new InteractionResultHolder<>(InteractionResult.SUCCESS, entity.getItemInHand(hand));
    }

    public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
        boolean retval = onEntitySwing(itemstack, entity);
        DartrifleEntitySwingsItemProcedure.execute(entity);
        return retval;
    }

    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.NONE;
    }

    public int getUseDuration(ItemStack itemstack) {
        return 72000;
    }

    public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
        if (!world.isClientSide() && (entityLiving instanceof ServerPlayer)) {
            ServerPlayer entity = (ServerPlayer) entityLiving;
            double x = entity.getX();
            double y = entity.getY();
            double z = entity.getZ();
            if (DartrifleCanUseRangedItemProcedure.execute(entity, itemstack)) {
                DartrifleEntity entityarrow = DartrifleEntity.shoot(world, entity, world.getRandom(), 2.5f, 2.5d, 0);
                itemstack.hurtAndBreak(1, entity, e -> {
                    e.broadcastBreakEvent(entity.getUsedItemHand());
                });
                entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
                DartrifleRangedItemUsedProcedure.execute(world, x, y, z, entity, itemstack);
            }
        }
    }
}
