package net.mcreator.latexes.item;

import net.mcreator.latexes.init.LatexModTabs;
import net.mcreator.latexes.procedures.SlimeessenceLivingEntityIsHitWithItemProcedure;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/SlimeessenceItem.class */
public class SlimeessenceItem extends Item {
    public SlimeessenceItem() {
        super(new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(64).rarity(Rarity.UNCOMMON));
    }

    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.EAT;
    }

    public boolean hurtEnemy(ItemStack itemstack, LivingEntity entity, LivingEntity sourceentity) {
        boolean retval = hurtEnemy(itemstack, entity, sourceentity);
        SlimeessenceLivingEntityIsHitWithItemProcedure.execute(entity.level, entity.getX(), entity.getY(), entity.getZ(), entity);
        return retval;
    }
}
