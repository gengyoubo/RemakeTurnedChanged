//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.item;

import net.mcreator.latexes.init.LatexModBlocks;
import net.mcreator.latexes.init.LatexModItems;
import net.mcreator.latexes.init.LatexModTabs;
import net.mcreator.latexes.procedures.DLHoeRightClickedOnBlockProcedure;
import net.mcreator.latexes.procedures.DLSwordLivingEntityIsHitWithToolProcedure;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.HoeItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import org.jetbrains.annotations.NotNull;

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

            public @NotNull Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack[]{new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get()), new ItemStack((ItemLike)LatexModBlocks.DARKLATEXBLOCK.get()), new ItemStack((ItemLike)LatexModItems.DARKLATEXCRYSTAL.get())});
            }
        }, 0, -3.5F, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS));
    }

    public boolean hurtEnemy(@NotNull ItemStack itemstack, @NotNull LivingEntity entity, @NotNull LivingEntity sourceentity) {
        boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
        DLSwordLivingEntityIsHitWithToolProcedure.execute(entity);
        return retval;
    }

    public @NotNull InteractionResult useOn(@NotNull UseOnContext context) {
        InteractionResult retval = super.useOn(context);
        DLHoeRightClickedOnBlockProcedure.execute(context.getLevel(), (double)context.getClickedPos().getX(), (double)context.getClickedPos().getY(), (double)context.getClickedPos().getZ());
        return retval;
    }
}
