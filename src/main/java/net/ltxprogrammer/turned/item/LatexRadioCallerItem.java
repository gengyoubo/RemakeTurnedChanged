package net.ltxprogrammer.turned.item;

import net.ltxprogrammer.turned.init.LatexModTabs;
import net.ltxprogrammer.turned.procedures.LatexRadioDropPodCallerProcedure;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.context.UseOnContext;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/item/LatexRadioCallerItem.class */
public class LatexRadioCallerItem extends Item {
    public LatexRadioCallerItem() {
        super(new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(1).rarity(Rarity.UNCOMMON));
    }

    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.EAT;
    }

    public InteractionResult useOn(UseOnContext context) {
        InteractionResult retval = useOn(context);
        LatexRadioDropPodCallerProcedure.execute(context.getLevel(), (double) context.getClickedPos().getX(), (double) context.getClickedPos().getY(), (double) context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
        return retval;
    }
}
