//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

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

public class LatexSoupItem extends Item {
    public LatexSoupItem() {
        super((new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS).stacksTo(16).rarity(Rarity.COMMON).food((new FoodProperties.Builder()).nutrition(5).saturationMod(0.5F).build()));
    }

    public UseAnim getUseAnimation(ItemStack itemstack) {
        return UseAnim.DRINK;
    }

    public int getUseDuration(ItemStack itemstack) {
        return 42;
    }

    public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
        return 0.0F;
    }

    public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
        ItemStack retval = new ItemStack(Items.BOWL);
        super.finishUsingItem(itemstack, world, entity);
        double x = entity.getX();
        double y = entity.getY();
        double z = entity.getZ();
        LatexSoupFoodEatenProcedure.execute(entity);
        if (itemstack.isEmpty()) {
            return retval;
        } else {
            if (entity instanceof Player) {
                Player player = (Player)entity;
                if (!player.getAbilities().instabuild && !player.getInventory().add(retval)) {
                    player.drop(retval, false);
                }
            }

            return itemstack;
        }
    }
}
