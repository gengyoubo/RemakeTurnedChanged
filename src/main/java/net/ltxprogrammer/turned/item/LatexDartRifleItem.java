package net.ltxprogrammer.turned.item;

import java.util.List;
import net.ltxprogrammer.turned.entity.LatexDartRifleEntity;
import net.ltxprogrammer.turned.procedures.DartrifleEntitySwingsItemProcedure;
import net.ltxprogrammer.turned.procedures.DartrifleRangedItemUsedProcedure;
import net.ltxprogrammer.turned.procedures.LatexDartRifleCanUseRangedItemProcedure;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/item/LatexDartRifleItem.class */
public class LatexDartRifleItem extends Item {
    public LatexDartRifleItem() {
        super(new Item.Properties().tab(null).stacksTo(1));
    }

    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level world, Player entity, @NotNull InteractionHand hand) {
        entity.startUsingItem(hand);
        return new InteractionResultHolder<>(InteractionResult.SUCCESS, entity.getItemInHand(hand));
    }

    public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
        boolean retval = onEntitySwing(itemstack, entity);
        DartrifleEntitySwingsItemProcedure.execute(entity);
        return retval;
    }

    public void appendHoverText(@NotNull ItemStack itemstack, Level world, @NotNull List<Component> list, @NotNull TooltipFlag flag) {
        appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("Latex Mode"));
    }

    public @NotNull UseAnim getUseAnimation(@NotNull ItemStack itemstack) {
        return UseAnim.NONE;
    }

    public int getUseDuration(@NotNull ItemStack itemstack) {
        return 72000;
    }

    public void releaseUsing(@NotNull ItemStack itemstack, Level world, @NotNull LivingEntity entityLiving, int timeLeft) {
        if (!world.isClientSide() && (entityLiving instanceof ServerPlayer entity)) {
            double x = entity.getX();
            double y = entity.getY();
            double z = entity.getZ();
            if (LatexDartRifleCanUseRangedItemProcedure.execute(entity, itemstack)) {
                LatexDartRifleEntity entityarrow = LatexDartRifleEntity.shoot(world, entity, world.getRandom(), 2.5f, 1.5d, 0);
                itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
                entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
                DartrifleRangedItemUsedProcedure.execute(world, x, y, z, entity, itemstack);
            }
        }
    }
}
