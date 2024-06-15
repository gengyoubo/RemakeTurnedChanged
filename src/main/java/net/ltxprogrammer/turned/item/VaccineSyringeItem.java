//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.item;

import net.ltxprogrammer.turned.init.LatexModTabs;
import net.ltxprogrammer.turned.procedures.VaccineSyringeLivingEntityIsHitWithItemProcedure;
import net.ltxprogrammer.turned.procedures.VaccineSyringeRightclickedOnBlockProcedure;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.context.UseOnContext;

public class VaccineSyringeItem extends Item {
    public VaccineSyringeItem() {
        super((new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(8).rarity(Rarity.COMMON));
    }

    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.BOW;
    }

    public int getUseDuration(ItemStack itemstack) {
        return 8;
    }

    public InteractionResult useOn(UseOnContext context) {
        InteractionResult retval = super.useOn(context);
        VaccineSyringeRightclickedOnBlockProcedure.execute(context.getPlayer());
        return retval;
    }

    public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
        boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
        VaccineSyringeLivingEntityIsHitWithItemProcedure.execute(entity);
        return retval;
    }
}
