package net.ltxprogrammer.turned.item;

import net.ltxprogrammer.changed.init.ChangedBlocks;
import net.ltxprogrammer.changed.init.ChangedItems;
import net.ltxprogrammer.turned.init.LatexModTabs;
import net.ltxprogrammer.turned.procedures.DLSwordLivingEntityIsHitWithToolProcedure;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/item/DLPickaxeItem.class */
public class DLPickaxeItem extends PickaxeItem {
    public DLPickaxeItem() {
        super(new Tier() { // from class: net.ltxprogrammer.turned.item.DLPickaxeItem.1
            public int getUses() {
                return 225;
            }

            public float getSpeed() {
                return 5.0f;
            }

            public float getAttackDamageBonus() {
                return 2.0f;
            }

            public int getLevel() {
                return 2;
            }

            public int getEnchantmentValue() {
                return 25;
            }

            public @NotNull Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack((ItemLike) ChangedItems.DARK_LATEX_GOO.get()), new ItemStack((ItemLike) ChangedBlocks.DARK_LATEX_BLOCK.get()), new ItemStack((ItemLike) ChangedItems.DARK_LATEX_CRYSTAL_FRAGMENT.get()));
            }
        }, 1, -3.0f, new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS));
    }

    public boolean hurtEnemy(@NotNull ItemStack itemstack, @NotNull LivingEntity entity, @NotNull LivingEntity sourceentity) {
        boolean retval = hurtEnemy(itemstack, entity, sourceentity);
        DLSwordLivingEntityIsHitWithToolProcedure.execute(entity);
        return retval;
    }
}
