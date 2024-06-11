package net.mcreator.latexes.item;

import net.mcreator.latexes.entity.MatchLockMusketEntity;
import net.mcreator.latexes.init.LatexModTabs;
import net.mcreator.latexes.procedures.MatchLockMusketCanUseRangedItemProcedure;
import net.mcreator.latexes.procedures.MatchLockMusketRangedItemUsedProcedure;
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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/MatchLockMusketItem.class */
public class MatchLockMusketItem extends Item {
    public MatchLockMusketItem() {
        super(new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS).durability(64));
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
            if (MatchLockMusketCanUseRangedItemProcedure.execute(entity, itemstack)) {
                MatchLockMusketEntity entityarrow = MatchLockMusketEntity.shoot(world, entity, world.getRandom(), 2.0f, 3.0d, 1);
                itemstack.hurtAndBreak(1, entity, e -> {
                    e.broadcastBreakEvent(entity.getUsedItemHand());
                });
                entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
                MatchLockMusketRangedItemUsedProcedure.execute(world, x, y, z, entity, itemstack);
                entity.releaseUsingItem();
            }
        }
    }
}
