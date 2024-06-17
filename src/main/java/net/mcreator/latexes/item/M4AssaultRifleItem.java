package net.mcreator.latexes.item;

import net.mcreator.latexes.entity.M4AssaultRifleEntity;
import net.mcreator.latexes.init.LatexModTabs;
import net.mcreator.latexes.procedures.AssaultRifleCanUseRangedItemProcedure;
import net.mcreator.latexes.procedures.M4AssaultRifleRangedItemUsedProcedure;
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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/M4AssaultRifleItem.class */
public class M4AssaultRifleItem extends Item {
    public M4AssaultRifleItem() {
        super(new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS).durability(325));
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
