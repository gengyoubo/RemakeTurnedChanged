//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.item;

import net.mcreator.latexes.init.LatexModTabs;
import net.mcreator.latexes.procedures.BloodSyringeLivingEntityIsHitWithItemProcedure;
import net.mcreator.latexes.procedures.SyringeRightClickedOnBlockProcedure;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.context.UseOnContext;

public class SyringeItem extends Item {
    public SyringeItem() {
        super((new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(64).rarity(Rarity.COMMON));
    }

    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.EAT;
    }

    public InteractionResult useOn(UseOnContext context) {
        InteractionResult retval = super.useOn(context);
        SyringeRightClickedOnBlockProcedure.execute(context.getLevel(), (double)context.getClickedPos().getX(), (double)context.getClickedPos().getY(), (double)context.getClickedPos().getZ(), context.getPlayer());
        return retval;
    }

    public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
        boolean retval = super.hurtEnemy(itemstack, entity, sourceentity);
        BloodSyringeLivingEntityIsHitWithItemProcedure.execute(entity, sourceentity);
        return retval;
    }
}
