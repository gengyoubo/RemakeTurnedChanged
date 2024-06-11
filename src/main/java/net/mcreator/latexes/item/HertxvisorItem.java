package net.mcreator.latexes.item;

import java.util.List;
import net.mcreator.latexes.init.LatexModTabs;
import net.mcreator.latexes.procedures.HertxvisorLivingEntityIsHitWithItemProcedure;
import net.mcreator.latexes.procedures.HertxvisorRightClickedOnBlockProcedure;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/HertxvisorItem.class */
public class HertxvisorItem extends Item {
    public HertxvisorItem() {
        super(new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(1).rarity(Rarity.COMMON));
    }

    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.EAT;
    }

    public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
        appendHoverText(itemstack, world, list, flag);
        list.add(new TextComponent("Right click on a latex block or left click on a normal latex to turn them in an hertx. (Won't work on strong latex variants.) �c(Note"));
        list.add(new TextComponent("you must be 3 blocks near the spawned hertx to insta-tame it"));
        list.add(new TextComponent("otherwise use Latex Goo)"));
    }

    public InteractionResult useOn(UseOnContext context) {
        InteractionResult retval = useOn(context);
        HertxvisorRightClickedOnBlockProcedure.execute(context.getLevel(), (double) context.getClickedPos().getX(), (double) context.getClickedPos().getY(), (double) context.getClickedPos().getZ(), context.getPlayer());
        return retval;
    }

    public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
        boolean retval = hurtEnemy(itemstack, entity, sourceentity);
        HertxvisorLivingEntityIsHitWithItemProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
        return retval;
    }
}
