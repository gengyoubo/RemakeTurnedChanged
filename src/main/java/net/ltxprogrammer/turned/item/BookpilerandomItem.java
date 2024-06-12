package net.ltxprogrammer.turned.item;

import java.util.List;
import net.ltxprogrammer.turned.init.LatexModTabs;
import net.ltxprogrammer.turned.procedures.BookpilerandomRightClickedOnBlockProcedure;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/item/BookpilerandomItem.class */
public class BookpilerandomItem extends Item {
    public BookpilerandomItem() {
        super(new Item.Properties().tab(LatexModTabs.TAB_LATEX).stacksTo(16).rarity(Rarity.COMMON));
    }

    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.EAT;
    }

    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("Places a random book pile"));
    }

    public InteractionResult useOn(UseOnContext context) {
        InteractionResult retval = useOn(context);
        BookpilerandomRightClickedOnBlockProcedure.execute(context.getLevel(), (double) context.getClickedPos().getX(), (double) context.getClickedPos().getY(), (double) context.getClickedPos().getZ(), context.getPlayer());
        return retval;
    }
}
