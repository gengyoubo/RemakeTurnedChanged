package net.mcreator.latexes.item;

import java.util.List;
import net.mcreator.latexes.init.LatexModTabs;
import net.mcreator.latexes.procedures.DronehertxupgradekitRightclickedProcedure;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/DronehertxupgradekitItem.class */
public class DronehertxupgradekitItem extends Item {
    public DronehertxupgradekitItem() {
        super(new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(16).rarity(Rarity.COMMON));
    }

    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("Turn your drone hertx in a military one!"));
    }

    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> ar = use(world, entity, hand);
        ItemStack itemStack = (ItemStack) ar.getObject();
        DronehertxupgradekitRightclickedProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
        return ar;
    }
}