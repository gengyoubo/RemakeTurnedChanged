package net.ltxprogrammer.turned.item;

import net.ltxprogrammer.turned.entity.MatchlockPistolEntity;
import net.ltxprogrammer.turned.init.LatexModTabs;
import net.ltxprogrammer.turned.procedures.MatchLockPistolWhenUsedProcedure;
import net.ltxprogrammer.turned.procedures.MatchlockPistolCanUseRangedItemProcedure;
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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/item/MatchlockPistolItem.class */
public class MatchlockPistolItem extends Item {
    public MatchlockPistolItem() {
        super(new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS).durability(48));
    }

    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        entity.startUsingItem(hand);
        return new InteractionResultHolder<>(InteractionResult.SUCCESS, entity.getItemInHand(hand));
    }

    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.NONE;
    }

    public int getUseDuration(ItemStack itemstack) {
        return 72000;
    }

    public void onUsingTick(ItemStack itemstack, LivingEntity entityLiving, int count) {
        Level world = entityLiving.level;
        if (!world.isClientSide() && (entityLiving instanceof ServerPlayer)) {
            ServerPlayer entity = (ServerPlayer) entityLiving;
            double x = entity.getX();
            double y = entity.getY();
            double z = entity.getZ();
            if (MatchlockPistolCanUseRangedItemProcedure.execute(itemstack)) {
                MatchlockPistolEntity entityarrow = MatchlockPistolEntity.shoot(world, entity, world.getRandom(), 2.0f, 2.0d, 1);
                itemstack.hurtAndBreak(1, entity, e -> {
                    e.broadcastBreakEvent(entity.getUsedItemHand());
                });
                entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
                MatchLockPistolWhenUsedProcedure.execute(world, x, y, z, entity, itemstack);
                entity.releaseUsingItem();
            }
        }
    }
}
