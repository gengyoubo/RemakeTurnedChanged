package net.ltxprogrammer.turned.item;

import net.ltxprogrammer.turned.entity.ExplosivegooEntity;
import net.ltxprogrammer.turned.init.LatexModItems;
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
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/item/ExplosivegooItem.class */
public class ExplosivegooItem extends Item {
    public ExplosivegooItem() {
        super(new Item.Properties().tab((CreativeModeTab) null).stacksTo(8));
    }

    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        entity.startUsingItem(hand);
        return new InteractionResultHolder<>(InteractionResult.SUCCESS, entity.getItemInHand(hand));
    }

    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.SPEAR;
    }

    public int getUseDuration(ItemStack itemstack) {
        return 72000;
    }

    @OnlyIn(Dist.CLIENT)
    public boolean isFoil(ItemStack itemstack) {
        return true;
    }

    public void onUsingTick(ItemStack itemstack, LivingEntity entityLiving, int count) {
        Level world = entityLiving.level;
        if (!world.isClientSide() && (entityLiving instanceof ServerPlayer)) {
            ServerPlayer entity = (ServerPlayer) entityLiving;
            entity.getX();
            entity.getY();
            entity.getZ();
            ItemStack stack = ProjectileWeaponItem.getHeldProjectile(entity, e -> {
                return e.getItem() == LatexModItems.EXPLOSIVEGOO.get();
            });
            if (stack == ItemStack.EMPTY) {
                int i = 0;
                while (true) {
                    if (i < entity.getInventory().items.size()) {
                        ItemStack teststack = (ItemStack) entity.getInventory().items.get(i);
                        if (teststack != null && teststack.getItem() == LatexModItems.EXPLOSIVEGOO.get()) {
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
                ExplosivegooEntity entityarrow = ExplosivegooEntity.shoot(world, entity, world.getRandom(), 0.5f, 0.5d, 2);
                itemstack.hurtAndBreak(1, entity, e -> {
                    e.broadcastBreakEvent(entity.getUsedItemHand());
                });
                if (entity.getAbilities().instabuild) {
                    entityarrow.pickup = AbstractArrow.Pickup.CREATIVE_ONLY;
                } else if (!new ItemStack((ItemLike) LatexModItems.EXPLOSIVEGOO.get()).isDamageableItem()) {
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
            entity.releaseUsingItem();
        }
    }
}
