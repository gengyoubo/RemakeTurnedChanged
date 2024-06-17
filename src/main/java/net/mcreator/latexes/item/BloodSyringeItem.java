//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.item;

import net.mcreator.latexes.init.LatexModTabs;
import net.mcreator.latexes.procedures.BloodSyringeRightclickedOnBlockProcedure;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.context.UseOnContext;

public class BloodSyringeItem extends Item {
    public BloodSyringeItem() {
        super((new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(16).rarity(Rarity.COMMON));
    }

    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.BOW;
    }

    public int getUseDuration(ItemStack itemstack) {
        return 8;
    }

    public InteractionResult useOn(UseOnContext context) {
        InteractionResult retval = super.useOn(context);
        BloodSyringeRightclickedOnBlockProcedure.execute(context.getPlayer());
        return retval;
    }
}
