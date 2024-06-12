package net.ltxprogrammer.turned.item;

import net.ltxprogrammer.turned.init.LatexModTabs;
import net.ltxprogrammer.turned.procedures.SlimeessenceLivingEntityIsHitWithItemProcedure;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/item/SlimeessenceItem.class */
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
