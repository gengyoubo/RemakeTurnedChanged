package net.mcreator.latexes.item;

import net.mcreator.latexes.init.LatexModItems;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/BatonItem.class */
public class BatonItem extends SwordItem {

    /* renamed from: net.mcreator.latexes.item.BatonItem$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/BatonItem$1.class */
    class AnonymousClass1 implements Tier {
        AnonymousClass1() {
        }

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

        public Ingredient getRepairIngredient() {
            return Ingredient.of(new ItemStack[]{new ItemStack((ItemLike) LatexModItems.BATON.get()), new ItemStack(Items.IRON_INGOT), new ItemStack(Items.IRON_NUGGET)});
        }
    }

    public BatonItem() {
        super(new AnonymousClass1(), 3, -3.0f, new Item.Properties().tab((CreativeModeTab) null));
    }
}
