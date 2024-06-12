package net.ltxprogrammer.turned.item;

import net.ltxprogrammer.turned.entity.M4AssaultRifleEntity;
import net.ltxprogrammer.turned.init.LatexModTabs;
import net.ltxprogrammer.turned.procedures.AssaultRifleCanUseRangedItemProcedure;
import net.ltxprogrammer.turned.procedures.M4AssaultRifleRangedItemUsedProcedure;
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

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/item/M4AssaultRifleItem.class */
public class M4AssaultRifleItem extends Item {
    public M4AssaultRifleItem() {
        super(new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS).durability(325));
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
            entity.getX();
            entity.getY();
            entity.getZ();
            if (AssaultRifleCanUseRangedItemProcedure.execute(entity, itemstack)) {
                M4AssaultRifleEntity entityarrow = M4AssaultRifleEntity.shoot(world, entity, world.getRandom(), 2.2f, 1.2000000000000002d, 0);
                itemstack.hurtAndBreak(1, entity, e -> {
                    e.broadcastBreakEvent(entity.getUsedItemHand());
                });
                entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
                M4AssaultRifleRangedItemUsedProcedure.execute(entity, itemstack);
                entity.releaseUsingItem();
            }
        }
    }
}
