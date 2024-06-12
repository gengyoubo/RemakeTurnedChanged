package net.ltxprogrammer.turned.item;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.ltxprogrammer.turned.entity.AR70AssaultRifleEntity;
import net.ltxprogrammer.turned.init.LatexModTabs;
import net.ltxprogrammer.turned.procedures.AssaultRifleCanUseRangedItemProcedure;
import net.ltxprogrammer.turned.procedures.AssaultRifleRangedItemUsedProcedure;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/item/AR70AssaultRifleItem.class */
public class AR70AssaultRifleItem extends Item {
    public AR70AssaultRifleItem() {
        super(new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS).durability(280));
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

    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot slot) {
        if (slot != EquipmentSlot.MAINHAND) {
            return getDefaultAttributeModifiers(slot);
        }
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(getDefaultAttributeModifiers(slot));
        builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Ranged item modifier", 4.5d, AttributeModifier.Operation.ADDITION));
        builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Ranged item modifier", -2.4d, AttributeModifier.Operation.ADDITION));
        return builder.build();
    }

    public void onUsingTick(ItemStack itemstack, LivingEntity entityLiving, int count) {
        Level world = entityLiving.level;
        if (!world.isClientSide() && (entityLiving instanceof ServerPlayer)) {
            ServerPlayer entity = (ServerPlayer) entityLiving;
            entity.getX();
            entity.getY();
            entity.getZ();
            if (AssaultRifleCanUseRangedItemProcedure.execute(entity, itemstack)) {
                AR70AssaultRifleEntity entityarrow = AR70AssaultRifleEntity.shoot(world, entity, world.getRandom(), 2.4f, 1.0d, 0);
                itemstack.hurtAndBreak(1, entity, e -> {
                    e.broadcastBreakEvent(entity.getUsedItemHand());
                });
                entityarrow.pickup = AbstractArrow.Pickup.DISALLOWED;
                AssaultRifleRangedItemUsedProcedure.execute(entity, itemstack);
                entity.releaseUsingItem();
            }
        }
    }
}
