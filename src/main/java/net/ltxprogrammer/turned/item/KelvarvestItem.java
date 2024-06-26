package net.ltxprogrammer.turned.item;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/item/KelvarvestItem.class */
public abstract class KelvarvestItem extends ArmorItem {
    public KelvarvestItem(EquipmentSlot slot, Item.Properties properties) {
        super(new ArmorMaterial() { // from class: net.ltxprogrammer.turned.item.KelvarvestItem.1
            public int getDurabilityForSlot(@NotNull EquipmentSlot slot2) {
                return new int[]{13, 15, 16, 11}[slot2.getIndex()] * 200;
            }

            public int getDefenseForSlot(@NotNull EquipmentSlot slot2) {
                return new int[]{0, 0, 7, 0}[slot2.getIndex()];
            }

            public int getEnchantmentValue() {
                return 9;
            }

            public @NotNull SoundEvent getEquipSound() {
                return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_chain"));
            }

            public @NotNull Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack(Items.IRON_INGOT), new ItemStack(Items.IRON_NUGGET), new ItemStack(Items.LEATHER));
            }

            public @NotNull String getName() {
                return "kelvarvest";
            }

            public float getToughness() {
                return 1.0f;
            }

            public float getKnockbackResistance() {
                return 0.5f;
            }
        }, slot, properties);
    }

    /* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/item/KelvarvestItem$Chestplate.class */
    public static class Chestplate extends KelvarvestItem {
        public Chestplate() {
            super(EquipmentSlot.CHEST, new Item.Properties().tab(null));
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "turned:textures/models/armor/kevlar_armor__layer_1.png";
        }
    }
}