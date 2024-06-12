//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.item;

import net.ltxprogrammer.changed.init.ChangedBlocks;
import net.ltxprogrammer.changed.init.ChangedItems;
import net.ltxprogrammer.turned.init.LatexModTabs;
import net.ltxprogrammer.turned.procedures.DLSwordLivingEntityIsHitWithToolProcedure;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;

public class DLHoeItem extends HoeItem {
    public DLHoeItem() {
        super(new Tier() {
            public int getUses() {
                return 225;
            }

            public float getSpeed() {
                return 5.0F;
            }

            public float getAttackDamageBonus() {
                return 1.5F;
            }

            public int getLevel() {
                return 2;
            }

            public int getEnchantmentValue() {
                return 25;
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack[]{new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()), new ItemStack((ItemLike)ChangedBlocks.DARK_LATEX_BLOCK.get()), new ItemStack((ItemLike)ChangedItems.DARK_LATEX_CRYSTAL_FRAGMENT.get())});
            }
        }, 0, -3.5F, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS));
    }

    public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
        boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
        DLSwordLivingEntityIsHitWithToolProcedure.execute(entity);
        return retval;
    }

    public InteractionResult useOn(UseOnContext context) {
        return super.useOn(context);
    }
}
