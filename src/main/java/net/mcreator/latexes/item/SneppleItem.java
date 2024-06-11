package net.mcreator.latexes.item;

import java.util.List;
import net.mcreator.latexes.entity.SneppleEntity;
import net.mcreator.latexes.init.LatexModItems;
import net.mcreator.latexes.procedures.SneppleRangedItemUsedProcedure;
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
import net.minecraft.world.item.ProjectileWeaponItem;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/SneppleItem.class */
public class SneppleItem extends Item {
    public SneppleItem() {
        super(new Item.Properties().tab((CreativeModeTab) null).stacksTo(16));
    }

    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        entity.startUsingItem(hand);
        return new InteractionResultHolder<>(InteractionResult.SUCCESS, entity.getItemInHand(hand));
    }

    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("Snep in a bottle."));
    }

    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.SPEAR;
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
            ItemStack stack = ProjectileWeaponItem.getHeldProjectile(entity, e -> {
                return e.getItem() == LatexModItems.SNEPPLE.get();
            });
            if (stack == ItemStack.EMPTY) {
                int i = 0;
                while (true) {
                    if (i < entity.getInventory().items.size()) {
                        ItemStack teststack = (ItemStack) entity.getInventory().items.get(i);
                        if (teststack != null && teststack.getItem() == LatexModItems.SNEPPLE.get()) {
                            stack = teststack;
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
            }
            if (entity.getAbilities().instabuild || stack != ItemStack.EMPTY) {
                SneppleEntity entityarrow = SneppleEntity.shoot(world, entity, world.getRandom(), 1.0f, 2.0d, 1);
                itemstack.hurtAndBreak(1, entity, e -> {
                    e.broadcastBreakEvent(entity.getUsedItemHand());
                });
                if (entity.getAbilities().instabuild) {
                    entityarrow.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
                } else if (!new ItemStack((ItemLike) LatexModItems.SNEPPLE.get()).isDamageableItem()) {
                    stack.shrink(1);
                    if (stack.isEmpty()) {
                        entity.getInventory().removeItem(stack);
                    }
                } else if (stack.hurt(1, world.getRandom(), entity)) {
                    stack.shrink(1);
                    stack.setDamageValue(0);
                    if (stack.isEmpty()) {
                        entity.getInventory().removeItem(stack);
                    }
                }
                SneppleRangedItemUsedProcedure.execute(entity, itemstack);
            }
        }
    }
}
