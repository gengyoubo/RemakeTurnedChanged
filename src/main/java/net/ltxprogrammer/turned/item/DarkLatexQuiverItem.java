//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.item;

import net.ltxprogrammer.changed.init.ChangedItems;
import net.ltxprogrammer.turned.init.LatexModTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class DarkLatexQuiverItem extends ArmorItem {
    public DarkLatexQuiverItem(EquipmentSlot slot, Item.Properties properties) {
        super(new ArmorMaterial() {
            public int getDurabilityForSlot(EquipmentSlot slot) {
                return (new int[]{13, 15, 16, 11})[slot.getIndex()] * 75;
            }

            public int getDefenseForSlot(EquipmentSlot slot) {
                return (new int[]{0, 0, 2, 0})[slot.getIndex()];
            }

            public int getEnchantmentValue() {
                return 25;
            }

            public SoundEvent getEquipSound() {
                return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack[]{new ItemStack((ItemLike)ChangedItems.DARK_LATEX_GOO.get()), new ItemStack((ItemLike)ChangedItems.DARK_LATEX_CRYSTAL_FRAGMENT.get())});
            }

            public String getName() {
                return "dark_latex_quiver";
            }

            public float getToughness() {
                return 0.0F;
            }

            public float getKnockbackResistance() {
                return 0.0F;
            }
        }, slot, properties);
    }

    public static class Chestplate extends DarkLatexQuiverItem {
        public Chestplate() {
            super(EquipmentSlot.CHEST, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS));
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "turned:textures/entities/dark_latex_quiver.png";
        }
    }
}
