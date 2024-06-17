package net.mcreator.latexes.item;

import net.mcreator.latexes.entity.ScrapM16RifleEntity;
import net.mcreator.latexes.init.LatexModTabs;
import net.mcreator.latexes.procedures.AssaultRifleCanUseRangedItemProcedure;
import net.mcreator.latexes.procedures.ScrapM16RifleRangedItemUsedProcedure;
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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/ScrapM16RifleItem.class */
public class ScrapM16RifleItem extends Item {
    public ScrapM16RifleItem() {
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

    public void onUsingTick(ItemStack itemstack, LivingEntity entityLiving, int count) {
        Level world = entityLiving.level;
        if (!world.isClientSide() && (entityLiving instanceof ServerPlayer)) {
            ServerPlayer entity = (ServerPlayer) entityLiving;
            entity.getX();
            entity.getY();
            entity.getZ();
            if (AssaultRifleCanUseRangedItemProcedure.execute(entity, itemstack)) {
                ScrapM16RifleEntity entityarrow = ScrapM16RifleEntity.shoot(world, entity, world.getRandom(), 2.2f, 0.9d, 0);
                itemstack.hurtAndBreak(1, entity, e -> {
                    e.broadcastBreakEvent(entity.getUsedItemHand());
                });
                entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
                ScrapM16RifleRangedItemUsedProcedure.execute(entity, itemstack);
                entity.releaseUsingItem();
            }
        }
    }
}
