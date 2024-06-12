package net.ltxprogrammer.turned.item;

import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/item/BatonItem.class */
public class BatonItem extends SwordItem {
    public BatonItem() {
        super(new Tier() { // from class: net.ltxprogrammer.turned.item.BatonItem.1
            public int getUses() {
                return 120;
            }

            public float getSpeed() {
                return 5.0f;
            }

            public float getAttackDamageBonus() {
                return 2.5f;
            }

            public int getLevel() {
                return 1;
            }

            public int getEnchantmentValue() {
                return 5;
            }

            public @NotNull Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack((ItemLike) LatexModItems.BATON.get()), new ItemStack(Items.IRON_INGOT), new ItemStack(Items.IRON_NUGGET));
            }
        }, 3, -3.0f, new Item.Properties().tab(null));
    }
}
