//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.item;

import java.util.List;
import net.ltxprogrammer.turned.init.LatexModTabs;
import net.ltxprogrammer.turned.procedures.MilitaryDroneHertxIconRightclickedOnBlockProcedure;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class MilitaryDroneHertxIconItem extends Item {
    public MilitaryDroneHertxIconItem() {
        super((new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(1).rarity(Rarity.COMMON));
    }

    @OnlyIn(Dist.CLIENT)
    public boolean isFoil(ItemStack itemstack) {
        return true;
    }

    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        super.appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("Place down your new soldier!"));
    }

    public InteractionResult useOn(UseOnContext context) {
        InteractionResult retval = super.useOn(context);
        MilitaryDroneHertxIconRightclickedOnBlockProcedure.execute(context.getLevel(), (double)context.getClickedPos().getX(), (double)context.getClickedPos().getY(), (double)context.getClickedPos().getZ(), context.getPlayer());
        return retval;
    }
}
