package net.ltxprogrammer.turned.item;

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
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/item/GoodBeretItem.class */
public abstract class GoodBeretItem extends ArmorItem {
    public GoodBeretItem(EquipmentSlot slot, Item.Properties properties) {
        super(new ArmorMaterial() { // from class: net.ltxprogrammer.turned.item.GoodBeretItem.1
            public int getDurabilityForSlot(EquipmentSlot slot2) {
                return new int[]{13, 15, 16, 11}[slot2.getIndex()] * 20;
            }

            public int getDefenseForSlot(EquipmentSlot slot2) {
                return new int[]{2, 5, 6, 1}[slot2.getIndex()];
            }

            public int getEnchantmentValue() {
                return 9;
            }

            public SoundEvent getEquipSound() {
                return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.EMPTY;
            }

            public String getName() {
                return "good_beret";
            }

            public float getToughness() {
                return 0.0f;
            }

            public float getKnockbackResistance() {
                return 0.0f;
            }
        }, slot, properties);
    }

    /* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/item/GoodBeretItem$Helmet.class */
    public static class Helmet extends GoodBeretItem {
        public Helmet() {
            super(EquipmentSlot.HEAD, new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS));
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "turned:textures/models/armor/blue_beret__layer_1.png";
        }
    }
}
