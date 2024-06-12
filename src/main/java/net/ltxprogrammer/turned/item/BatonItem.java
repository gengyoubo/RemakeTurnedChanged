//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

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

public class BatonItem extends SwordItem {
    public BatonItem() {
        super(new Tier() {
            public int getUses() {
                return 120;
            }

            public float getSpeed() {
                return 5.0F;
            }

            public float getAttackDamageBonus() {
                return 2.5F;
            }

            public int getLevel() {
                return 1;
            }

            public int getEnchantmentValue() {
                return 5;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack[]{new ItemStack((ItemLike)LatexModItems.BATON.get()), new ItemStack(Items.IRON_INGOT), new ItemStack(Items.IRON_NUGGET)});
            }
        }, 3, -3.0F, (new Item.Properties()).tab((CreativeModeTab)null));
    }
}
