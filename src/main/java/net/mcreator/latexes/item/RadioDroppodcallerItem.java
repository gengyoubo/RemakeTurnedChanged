package net.mcreator.latexes.item;

import net.mcreator.latexes.init.LatexModTabs;
import net.mcreator.latexes.procedures.RadioDroppodcallerRightClickedOnBlockProcedure;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.context.UseOnContext;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/RadioDroppodcallerItem.class */
public class RadioDroppodcallerItem extends Item {
    public RadioDroppodcallerItem() {
        super(new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(1).rarity(Rarity.UNCOMMON));
    }

    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.EAT;
    }

    public InteractionResult useOn(UseOnContext context) {
        InteractionResult retval = useOn(context);
        RadioDroppodcallerRightClickedOnBlockProcedure.execute(context.getLevel(), (double) context.getClickedPos().getX(), (double) context.getClickedPos().getY(), (double) context.getClickedPos().getZ(), context.getPlayer(), context.getItemInHand());
        return retval;
    }
}
