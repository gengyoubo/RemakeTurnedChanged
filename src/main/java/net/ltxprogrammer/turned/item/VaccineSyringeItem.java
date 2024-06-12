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
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/item/VaccineSyringeItem.class */
public class VaccineSyringeItem extends Item {
    public VaccineSyringeItem() {
        super(new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(8).rarity(Rarity.COMMON));
    }

    public @NotNull UseAnim getUseAnimation(@NotNull ItemStack itemstack) {
        return UseAnim.BOW;
    }

    public int getUseDuration(@NotNull ItemStack itemstack) {
        return 8;
    }

    public @NotNull InteractionResult useOn(@NotNull UseOnContext context) {
        InteractionResult retval = useOn(context);
        VaccineSyringeRightclickedOnBlockProcedure.execute(context.getPlayer());
        return retval;
    }

    public boolean hurtEnemy(@NotNull ItemStack itemstack, @NotNull LivingEntity entity, @NotNull LivingEntity sourceentity) {
        boolean retval = hurtEnemy(itemstack, entity, sourceentity);
        VaccineSyringeLivingEntityIsHitWithItemProcedure.execute(entity);
        return retval;
    }
}
