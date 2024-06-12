package net.ltxprogrammer.turned.item;

import java.util.List;
import net.ltxprogrammer.turned.entity.TankCannonEntity;
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
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/item/TankCannonItem.class */
public class TankCannonItem extends Item {
    public TankCannonItem() {
        super(new Item.Properties().tab(null).stacksTo(1));
    }

    public @NotNull InteractionResultHolder<ItemStack> use(@NotNull Level world, Player entity, @NotNull InteractionHand hand) {
        entity.startUsingItem(hand);
        return new InteractionResultHolder<>(InteractionResult.SUCCESS, entity.getItemInHand(hand));
    }

    public void appendHoverText(@NotNull ItemStack itemstack, Level world, @NotNull List<Component> list, @NotNull TooltipFlag flag) {
        appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("You're DEFINETIVELY not supposed to have this."));
    }

    public @NotNull UseAnim getUseAnimation(@NotNull ItemStack itemstack) {
        return UseAnim.NONE;
    }

    public int getUseDuration(@NotNull ItemStack itemstack) {
        return 72000;
    }

    public void releaseUsing(@NotNull ItemStack itemstack, Level world, @NotNull LivingEntity entityLiving, int timeLeft) {
        if (!world.isClientSide() && (entityLiving instanceof ServerPlayer entity)) {
            entity.getX();
            entity.getY();
            entity.getZ();
            ItemStack stack = ProjectileWeaponItem.getHeldProjectile(entity, e -> e.getItem() == Blocks.TNT.asItem());
            if (stack == ItemStack.EMPTY) {
                int i = 0;
                while (true) {
                    if (i < entity.getInventory().items.size()) {
                        ItemStack teststack = entity.getInventory().items.get(i);
                        if (teststack.getItem() == Blocks.TNT.asItem()) {
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
                TankCannonEntity entityarrow = TankCannonEntity.shoot(world, entity, world.getRandom(), 10.0f, 100.0d, 5);
                itemstack.hurtAndBreak(1, entity, e -> e.broadcastBreakEvent(entity.getUsedItemHand()));
                if (entity.getAbilities().instabuild) {
                    entityarrow.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
                } else if (!new ItemStack(Blocks.TNT).isDamageableItem()) {
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
            }
        }
    }
}
