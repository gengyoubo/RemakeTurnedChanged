package net.ltxprogrammer.turned.item;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.Multimap;
import net.ltxprogrammer.changed.init.ChangedBlocks;
import net.ltxprogrammer.changed.init.ChangedItems;
import net.ltxprogrammer.turned.init.LatexModTabs;
import net.ltxprogrammer.turned.procedures.DLSwordLivingEntityIsHitWithToolProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attribute;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.TieredItem;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.common.ToolAction;
import net.minecraftforge.common.ToolActions;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/item/DLScytheItem.class */
public class DLScytheItem extends TieredItem {
    public DLScytheItem() {
        super(new Tier() { // from class: net.ltxprogrammer.turned.item.DLScytheItem.1
            public int getUses() {
                return 225;
            }

            public float getSpeed() {
                return 5.5f;
            }

            public float getAttackDamageBonus() {
                return 5.0f;
            }

            public int getLevel() {
                return 2;
            }

            public int getEnchantmentValue() {
                return 25;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack[]{new ItemStack((ItemLike) ChangedItems.DARK_LATEX_GOO.get()), new ItemStack((ItemLike) ChangedBlocks.DARK_LATEX_BLOCK.get()), new ItemStack((ItemLike) ChangedItems.DARK_LATEX_CRYSTAL_FRAGMENT.get())});
            }
        }, new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS));
    }

    public boolean isCorrectToolForDrops(BlockState blockstate) {
        if (2 < 3 && blockstate.is(BlockTags.NEEDS_DIAMOND_TOOL)) {
            return false;
        }
        if (2 >= 2 || !blockstate.is(BlockTags.NEEDS_IRON_TOOL)) {
            return (2 >= 1 || !blockstate.is(BlockTags.NEEDS_STONE_TOOL)) && (blockstate.is(BlockTags.MINEABLE_WITH_AXE) || blockstate.is(BlockTags.MINEABLE_WITH_HOE) || blockstate.is(BlockTags.MINEABLE_WITH_PICKAXE) || blockstate.is(BlockTags.MINEABLE_WITH_SHOVEL));
        }
        return false;
    }

    public boolean canPerformAction(ItemStack stack, ToolAction toolAction) {
        return ToolActions.DEFAULT_AXE_ACTIONS.contains(toolAction) || ToolActions.DEFAULT_HOE_ACTIONS.contains(toolAction) || ToolActions.DEFAULT_SHOVEL_ACTIONS.contains(toolAction) || ToolActions.DEFAULT_PICKAXE_ACTIONS.contains(toolAction) || ToolActions.DEFAULT_SWORD_ACTIONS.contains(toolAction);
    }

    public float getDestroySpeed(ItemStack itemstack, BlockState blockstate) {
        return 5.5f;
    }

    public Multimap<Attribute, AttributeModifier> getDefaultAttributeModifiers(EquipmentSlot equipmentSlot) {
        if (equipmentSlot != EquipmentSlot.MAINHAND) {
            return getDefaultAttributeModifiers(equipmentSlot);
        }
        ImmutableMultimap.Builder<Attribute, AttributeModifier> builder = ImmutableMultimap.builder();
        builder.putAll(getDefaultAttributeModifiers(equipmentSlot));
        builder.put(Attributes.ATTACK_DAMAGE, new AttributeModifier(BASE_ATTACK_DAMAGE_UUID, "Tool modifier", 5.0d, AttributeModifier.Operation.ADDITION));
        builder.put(Attributes.ATTACK_SPEED, new AttributeModifier(BASE_ATTACK_SPEED_UUID, "Tool modifier", -3.4d, AttributeModifier.Operation.ADDITION));
        return builder.build();
    }

    public boolean mineBlock(ItemStack itemstack, Level world, BlockState blockstate, BlockPos pos, LivingEntity entity) {
        itemstack.hurtAndBreak(1, entity, i -> {
            i.broadcastBreakEvent(EquipmentSlot.MAINHAND);
        });
        return true;
    }

    public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
        itemstack.hurtAndBreak(2, entity, i -> {
            i.broadcastBreakEvent(EquipmentSlot.MAINHAND);
        });
        DLSwordLivingEntityIsHitWithToolProcedure.execute(entity);
        return true;
    }
}
