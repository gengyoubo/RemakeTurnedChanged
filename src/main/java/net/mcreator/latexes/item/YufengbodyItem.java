//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.item;

import java.util.List;
import net.mcreator.latexes.init.LatexModItems;
import net.mcreator.latexes.procedures.YufengbodyBodyTickEventProcedure;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class YufengbodyItem extends ArmorItem {
    public YufengbodyItem(EquipmentSlot slot, Item.Properties properties) {
        super(new ArmorMaterial() {
            public int getDurabilityForSlot(EquipmentSlot slot) {
                return (new int[]{13, 15, 16, 11})[slot.getIndex()] * 0;
            }

            public int getDefenseForSlot(EquipmentSlot slot) {
                return (new int[]{0, 0, 2, 0})[slot.getIndex()];
            }

            public int getEnchantmentValue() {
                return 0;
            }

            public SoundEvent getEquipSound() {
                return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur"));
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack[]{new ItemStack((ItemLike)LatexModItems.DARKLATEXGOO.get())});
            }

            public String getName() {
                return "yufengbody";
            }

            public float getToughness() {
                return 0.0F;
            }

            public float getKnockbackResistance() {
                return 0.0F;
            }
        }, slot, properties);
    }

    public static class Chestplate extends YufengbodyItem {
        public Chestplate() {
            super(EquipmentSlot.CHEST, (new Item.Properties()).tab((CreativeModeTab)null));
        }

        public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
            super.appendHoverText(itemstack, world, list, flag);
            list.add(new TextComponent("How did you got this?! HANDS OFF."));
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "latex:textures/entities/yufengbodytexture.png";
        }

        public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
            YufengbodyBodyTickEventProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
        }
    }
}
