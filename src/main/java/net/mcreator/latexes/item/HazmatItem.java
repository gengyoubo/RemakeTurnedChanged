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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/HazmatItem.class */
public abstract class HazmatItem extends ArmorItem {

    /* renamed from: net.mcreator.latexes.item.HazmatItem$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/HazmatItem$1.class */
    class AnonymousClass1 implements ArmorMaterial {
        AnonymousClass1() {
        }

        public int getDurabilityForSlot(EquipmentSlot slot) {
            return new int[]{13, 15, 16, 11}[slot.getIndex()] * 64;
        }

        public int getDefenseForSlot(EquipmentSlot slot) {
            return new int[]{2, 3, 4, 2}[slot.getIndex()];
        }

        public int getEnchantmentValue() {
            return 12;
        }

        public SoundEvent getEquipSound() {
            return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:gas_mask_wear"));
        }

        public Ingredient getRepairIngredient() {
            return Ingredient.of(new ItemStack[]{new ItemStack(Items.IRON_INGOT), new ItemStack(Items.LEATHER), new ItemStack(Items.CHARCOAL), new ItemStack(Items.GOLD_INGOT)});
        }

        public String getName() {
            return "hazmat";
        }

        public float getToughness() {
            return 0.0f;
        }

        public float getKnockbackResistance() {
            return 0.0f;
        }
    }

    public HazmatItem(EquipmentSlot slot, Item.Properties properties) {
        super(new AnonymousClass1(), slot, properties);
    }

    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/HazmatItem$Helmet.class */
    public static class Helmet extends HazmatItem {
        public Helmet() {
            super(EquipmentSlot.HEAD, new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS).fireResistant());
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "latex:textures/models/armor/hazmat__layer_1.png";
        }
    }

    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/HazmatItem$Chestplate.class */
    public static class Chestplate extends HazmatItem {
        public Chestplate() {
            super(EquipmentSlot.CHEST, new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS).fireResistant());
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "latex:textures/entities/hazmat.png";
        }
    }

    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/HazmatItem$Leggings.class */
    public static class Leggings extends HazmatItem {
        public Leggings() {
            super(EquipmentSlot.LEGS, new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS).fireResistant());
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "latex:textures/entities/hazmat.png";
        }
    }

    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/HazmatItem$Boots.class */
    public static class Boots extends HazmatItem {
        public Boots() {
            super(EquipmentSlot.FEET, new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS).fireResistant());
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "latex:textures/entities/hazmat.png";
        }
    }
}
