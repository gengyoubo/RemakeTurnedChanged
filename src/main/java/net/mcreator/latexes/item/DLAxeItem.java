package net.mcreator.latexes.item;

import net.mcreator.latexes.init.LatexModBlocks;
import net.mcreator.latexes.init.LatexModItems;
import net.mcreator.latexes.init.LatexModTabs;
import net.mcreator.latexes.procedures.DLSwordLivingEntityIsHitWithToolProcedure;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.AxeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/DLAxeItem.class */
public class DLAxeItem extends AxeItem {

    /* renamed from: net.mcreator.latexes.item.DLAxeItem$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/DLAxeItem$1.class */
    class AnonymousClass1 implements Tier {
        AnonymousClass1() {
        }

        public int getUses() {
            return 225;
        }

        public float getSpeed() {
            return 5.0f;
        }

        public float getAttackDamageBonus() {
            return 5.5f;
        }

        public int getLevel() {
            return 2;
        }

        public int getEnchantmentValue() {
            return 25;
        }

        public Ingredient getRepairIngredient() {
            return Ingredient.of(new ItemStack[]{new ItemStack((ItemLike) LatexModItems.DARKLATEXGOO.get()), new ItemStack((ItemLike) LatexModBlocks.DARKLATEXBLOCK.get()), new ItemStack((ItemLike) LatexModItems.DARKLATEXCRYSTAL.get())});
        }
    }

    public DLAxeItem() {
        super(new AnonymousClass1(), 1.0f, -2.5f, new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS));
    }

    public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
        boolean retval = hurtEnemy(itemstack, entity, sourceentity);
        DLSwordLivingEntityIsHitWithToolProcedure.execute(entity);
        return retval;
    }
}
