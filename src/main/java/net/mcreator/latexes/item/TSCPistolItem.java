package net.mcreator.latexes.item;

import net.mcreator.latexes.entity.TSCPistolEntity;
import net.mcreator.latexes.init.LatexModTabs;
import net.mcreator.latexes.procedures.TSCPistolCanUseRangedItemProcedure;
import net.mcreator.latexes.procedures.TSCPistolRangedItemUsedProcedure;
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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/TSCPistolItem.class */
public class TSCPistolItem extends Item {
    public TSCPistolItem() {
        super(new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS).durability(425));
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

    public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
        if (!world.isClientSide() && (entityLiving instanceof ServerPlayer)) {
            ServerPlayer entity = (ServerPlayer) entityLiving;
            entity.getX();
            entity.getY();
            entity.getZ();
            if (TSCPistolCanUseRangedItemProcedure.execute(itemstack)) {
                TSCPistolEntity entityarrow = TSCPistolEntity.shoot(world, entity, world.getRandom(), 3.0f, 3.0d, 1);
                itemstack.hurtAndBreak(1, entity, e -> {
                    e.broadcastBreakEvent(entity.getUsedItemHand());
                });
                entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
                TSCPistolRangedItemUsedProcedure.execute(entity, itemstack);
            }
        }
    }
}
