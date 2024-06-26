//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.item;

import net.mcreator.latexes.entity.DartrifleEntity;
import net.mcreator.latexes.init.LatexModTabs;
import net.mcreator.latexes.procedures.DartrifleCanUseRangedItemProcedure;
import net.mcreator.latexes.procedures.DartrifleEntitySwingsItemProcedure;
import net.mcreator.latexes.procedures.DartrifleRangedItemUsedProcedure;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow.Pickup;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

public class DartrifleItem extends Item {
    public DartrifleItem() {
        super((new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(1));
    }

    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        entity.startUsingItem(hand);
        return new InteractionResultHolder(InteractionResult.SUCCESS, entity.getItemInHand(hand));
    }

    public boolean onEntitySwing(ItemStack itemstack, LivingEntity entity) {
        boolean retval = super.onEntitySwing(itemstack, entity);
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
        if (!world.isClientSide() && entityLiving instanceof ServerPlayer entity) {
            double x = entity.getX();
            double y = entity.getY();
            double z = entity.getZ();
            if (DartrifleCanUseRangedItemProcedure.execute(entity, itemstack)) {
                DartrifleEntity entityarrow = DartrifleEntity.shoot(world, entity, world.getRandom(), 2.5F, 2.5, 0);
                itemstack.hurtAndBreak(1, entity, (e) -> {
                    e.broadcastBreakEvent(entity.getUsedItemHand());
                });
                entityarrow.pickup = Pickup.DISALLOWED;
                DartrifleRangedItemUsedProcedure.execute(world, x, y, z, entity, itemstack);
            }
        }

    }
}
