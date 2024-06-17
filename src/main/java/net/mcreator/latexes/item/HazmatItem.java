//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.item;

import net.mcreator.latexes.init.LatexModTabs;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

public abstract class HazmatItem extends ArmorItem {
    public HazmatItem(EquipmentSlot slot, Item.Properties properties) {
        super(new ArmorMaterial() {
            public int getDurabilityForSlot(@NotNull EquipmentSlot slot) {
                return (new int[]{13, 15, 16, 11})[slot.getIndex()] * 64;
            }

            public int getDefenseForSlot(@NotNull EquipmentSlot slot) {
                return (new int[]{2, 3, 4, 2})[slot.getIndex()];
            }

            public int getEnchantmentValue() {
                return 12;
            }

            public @NotNull SoundEvent getEquipSound() {
                return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:gas_mask_wear"));
            }

            public @NotNull Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack[]{new ItemStack(Items.IRON_INGOT), new ItemStack(Items.LEATHER), new ItemStack(Items.CHARCOAL), new ItemStack(Items.GOLD_INGOT)});
            }

            public @NotNull String getName() {
                return "hazmat";
            }

            public float getToughness() {
                return 0.0F;
            }

            public float getKnockbackResistance() {
                return 0.0F;
            }
        }, slot, properties);
    }

    public static class Boots extends HazmatItem {
        public Boots() {
            super(EquipmentSlot.FEET, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS).fireResistant());
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "latex:textures/entities/hazmat.png";
        }
    }

    public static class Leggings extends HazmatItem {
        public Leggings() {
            super(EquipmentSlot.LEGS, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS).fireResistant());
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "latex:textures/entities/hazmat.png";
        }
    }

    public static class Chestplate extends HazmatItem {
        public Chestplate() {
            super(EquipmentSlot.CHEST, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS).fireResistant());
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "latex:textures/entities/hazmat.png";
        }
    }

    public static class Helmet extends HazmatItem {
        public Helmet() {
            super(EquipmentSlot.HEAD, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS).fireResistant());
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "latex:textures/models/armor/hazmat__layer_1.png";
        }
    }
}
