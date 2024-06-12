package net.ltxprogrammer.turned.item;

import net.ltxprogrammer.turned.init.LatexModTabs;
import net.ltxprogrammer.turned.procedures.LatexSoupFoodEatenProcedure;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.UseAnim;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/item/LatexSoupItem.class */
public class LatexSoupItem extends Item {
    public LatexSoupItem() {
        super(new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(16).rarity(Rarity.COMMON).food(new FoodProperties.Builder().nutrition(5).saturationMod(0.5f).build()));
    }

    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.DRINK;
    }

    public int getUseDuration(ItemStack itemstack) {
        return 42;
    }

    public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
        return 0.0f;
    }

    public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
        ItemStack retval = new ItemStack(Items.BOWL);
        finishUsingItem(itemstack, world, entity);
        entity.getX();
        entity.getY();
        entity.getZ();
        LatexSoupFoodEatenProcedure.execute(entity);
        if (itemstack.isEmpty()) {
            return retval;
        }
        if (entity instanceof Player) {
            Player player = (Player) entity;
            if (!player.getAbilities().instabuild && !player.getInventory().add(retval)) {
                player.drop(retval, false);
            }
        }
        return itemstack;
    }
}
