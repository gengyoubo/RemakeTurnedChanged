//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.item;

import java.util.List;
import net.ltxprogrammer.turned.entity.CrystalbowEntity;
import net.ltxprogrammer.turned.init.LatexModItems;
import net.ltxprogrammer.turned.init.LatexModTabs;
import net.ltxprogrammer.turned.procedures.CrystalbowRangedItemUsedProcedure;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow.Pickup;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ProjectileWeaponItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;

public class CrystalbowItem extends Item {
    public CrystalbowItem() {
        super((new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS).durability(120));
    }

    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        entity.startUsingItem(hand);
        return new InteractionResultHolder(InteractionResult.SUCCESS, entity.getItemInHand(hand));
    }

    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("help how to make bow animations"));
    }

    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.BOW;
    }

    public int getUseDuration(ItemStack itemstack) {
        return 72000;
    }

    public void releaseUsing(ItemStack itemstack, Level world, LivingEntity entityLiving, int timeLeft) {
        if (!world.isClientSide() && entityLiving instanceof ServerPlayer entity) {
            double x = entity.getX();
            double y = entity.getY();
            double z = entity.getZ();
            ItemStack stack = ProjectileWeaponItem.getHeldProjectile(entity, (e) -> {
                return e.getItem() == LatexModItems.CRYSTALARROW.get();
            });
            if (stack == ItemStack.EMPTY) {
                for(int i = 0; i < entity.getInventory().items.size(); ++i) {
                    ItemStack teststack = (ItemStack)entity.getInventory().items.get(i);
                    if (teststack != null && teststack.getItem() == LatexModItems.CRYSTALARROW.get()) {
                        stack = teststack;
                        break;
                    }
                }
            }

            if (entity.getAbilities().instabuild || stack != ItemStack.EMPTY) {
                CrystalbowEntity entityarrow = CrystalbowEntity.shoot(world, entity, world.getRandom(), 1.5F, 1.5, 0);
                itemstack.hurtAndBreak(1, entity, (e) -> {
                    e.broadcastBreakEvent(entity.getUsedItemHand());
                });
                if (entity.getAbilities().instabuild) {
                    entityarrow.pickup = Pickup.CREATIVE_ONLY;
                } else if ((new ItemStack((ItemLike)LatexModItems.CRYSTALARROW.get())).isDamageableItem()) {
                    if (stack.hurt(1, world.getRandom(), entity)) {
                        stack.shrink(1);
                        stack.setDamageValue(0);
                        if (stack.isEmpty()) {
                            entity.getInventory().removeItem(stack);
                        }
                    }
                } else {
                    stack.shrink(1);
                    if (stack.isEmpty()) {
                        entity.getInventory().removeItem(stack);
                    }
                }

                CrystalbowRangedItemUsedProcedure.execute(entity, itemstack);
            }
        }

    }
}
