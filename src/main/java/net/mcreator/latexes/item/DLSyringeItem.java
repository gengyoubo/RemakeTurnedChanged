//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.item;

import net.mcreator.latexes.init.LatexModTabs;
import net.mcreator.latexes.procedures.DLSyringeLivingEntityIsHitWithItemProcedure;
import net.mcreator.latexes.procedures.DLSyringeRightclickedOnBlockProcedure;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.context.UseOnContext;

public class DLSyringeItem extends Item {
    public DLSyringeItem() {
        super((new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(64).rarity(Rarity.COMMON));
    }

    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.EAT;
    }

    public InteractionResult useOn(UseOnContext context) {
        InteractionResult retval = super.useOn(context);
        DLSyringeRightclickedOnBlockProcedure.execute(context.getLevel(), (double)context.getClickedPos().getX(), (double)context.getClickedPos().getY(), (double)context.getClickedPos().getZ());
        return retval;
    }

    public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
        boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
        DLSyringeLivingEntityIsHitWithItemProcedure.execute(entity, itemstack);
        return retval;
    }
}
