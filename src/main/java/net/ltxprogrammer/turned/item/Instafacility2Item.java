package net.ltxprogrammer.turned.item;

import java.util.List;
import net.ltxprogrammer.turned.procedures.Instafacility2RightClickedOnBlockProcedure;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/item/Instafacility2Item.class */
public class Instafacility2Item extends Item {
    public Instafacility2Item() {
        super(new Item.Properties().tab((CreativeModeTab) null).stacksTo(1).rarity(Rarity.UNCOMMON));
    }

    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.EAT;
    }

    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("Instant Facility for lazy people!"));
    }

    public InteractionResult useOn(UseOnContext context) {
        InteractionResult retval = useOn(context);
        Instafacility2RightClickedOnBlockProcedure.execute(context.getLevel(), (double) context.getClickedPos().getX(), (double) context.getClickedPos().getY(), (double) context.getClickedPos().getZ(), context.getPlayer());
        return retval;
    }
}
