package net.mcreator.latexes.item;

import net.mcreator.latexes.init.LatexModTabs;
import net.mcreator.latexes.procedures.VaccineSyringeLivingEntityIsHitWithItemProcedure;
import net.mcreator.latexes.procedures.VaccineSyringeRightclickedOnBlockProcedure;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.context.UseOnContext;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/VaccineSyringeItem.class */
public class VaccineSyringeItem extends Item {
    public VaccineSyringeItem() {
        super(new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(8).rarity(Rarity.COMMON));
    }

    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.BOW;
    }

    public int getUseDuration(ItemStack itemstack) {
        return 8;
    }

    public InteractionResult useOn(UseOnContext context) {
        InteractionResult retval = useOn(context);
        VaccineSyringeRightclickedOnBlockProcedure.execute(context.getPlayer());
        return retval;
    }

    public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
        boolean retval = hurtEnemy(itemstack, entity, sourceentity);
        VaccineSyringeLivingEntityIsHitWithItemProcedure.execute(entity);
        return retval;
    }
}
