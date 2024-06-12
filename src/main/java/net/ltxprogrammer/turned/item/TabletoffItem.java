package net.ltxprogrammer.turned.item;

import net.ltxprogrammer.turned.procedures.TabletoffRightClickedInAirProcedure;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/item/TabletoffItem.class */
public class TabletoffItem extends Item {
    public TabletoffItem() {
        super(new Item.Properties().tab((CreativeModeTab) null).stacksTo(1).rarity(Rarity.COMMON));
    }

    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.EAT;
    }

    public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
        InteractionResultHolder<ItemStack> ar = use(world, entity, hand);
        ItemStack itemStack = (ItemStack) ar.getObject();
        entity.getX();
        entity.getY();
        entity.getZ();
        TabletoffRightClickedInAirProcedure.execute(entity);
        return ar;
    }
}
