package net.mcreator.latexes.item;

import net.mcreator.latexes.init.LatexModTabs;
import net.mcreator.latexes.procedures.CrystalBowUnloadedRightClickedInAirProcedure;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/CrystalBowUnloadedItem.class */
public class CrystalBowUnloadedItem extends Item {
    public CrystalBowUnloadedItem() {
        super(new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS).durability(120).rarity(Rarity.COMMON));
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
        CrystalBowUnloadedRightClickedInAirProcedure.execute(entity);
        return ar;
    }
}
