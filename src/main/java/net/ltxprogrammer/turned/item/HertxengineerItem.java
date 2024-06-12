package net.ltxprogrammer.turned.item;

import net.ltxprogrammer.turned.init.LatexModItems;
import net.ltxprogrammer.turned.init.LatexModTabs;
import net.ltxprogrammer.turned.procedures.HertxengineerBodyTickEventProcedure;
import net.ltxprogrammer.turned.procedures.HertxengineerBootsTickEventProcedure;
import net.ltxprogrammer.turned.procedures.HertxengineerHelmetTickEventProcedure;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/item/HertxengineerItem.class */
public abstract class HertxengineerItem extends ArmorItem {
    public HertxengineerItem(EquipmentSlot slot, Item.Properties properties) {
        super(new ArmorMaterial() { // from class: net.ltxprogrammer.turned.item.HertxengineerItem.1
            public int getDurabilityForSlot(EquipmentSlot slot2) {
                return new int[]{13, 15, 16, 11}[slot2.getIndex()] * 40;
            }

            public int getDefenseForSlot(EquipmentSlot slot2) {
                return new int[]{2, 1, 5, 2}[slot2.getIndex()];
            }

            public int getEnchantmentValue() {
                return 12;
            }

            public SoundEvent getEquipSound() {
                return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_iron"));
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack[]{new ItemStack(Items.IRON_INGOT), new ItemStack((ItemLike) LatexModItems.BATTERY.get()), new ItemStack(Items.REDSTONE)});
            }

            public String getName() {
                return "hertxengineer";
            }

            public float getToughness() {
                return 0.0f;
            }

            public float getKnockbackResistance() {
                return 0.0f;
            }
        }, slot, properties);
    }

    /* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/item/HertxengineerItem$Helmet.class */
    public static class Helmet extends HertxengineerItem {
        public Helmet() {
            super(EquipmentSlot.HEAD, new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS));
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "turned:textures/models/armor/drone_hertx_armor__layer_1.png";
        }

        public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
            HertxengineerHelmetTickEventProcedure.execute(entity);
        }
    }

    /* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/item/HertxengineerItem$Chestplate.class */
    public static class Chestplate extends HertxengineerItem {
        public Chestplate() {
            super(EquipmentSlot.CHEST, new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS));
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "turned:textures/models/armor/drone_hertx_armor__layer_1.png";
        }

        public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
            HertxengineerBodyTickEventProcedure.execute(entity);
        }
    }

    /* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/item/HertxengineerItem$Leggings.class */
    public static class Leggings extends HertxengineerItem {
        public Leggings() {
            super(EquipmentSlot.LEGS, new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS));
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "turned:textures/models/armor/drone_hertx_armor__layer_2.png";
        }
    }

    /* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/item/HertxengineerItem$Boots.class */
    public static class Boots extends HertxengineerItem {
        public Boots() {
            super(EquipmentSlot.FEET, new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS));
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "turned:textures/models/armor/drone_hertx_armor__layer_1.png";
        }

        public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
            HertxengineerBootsTickEventProcedure.execute(entity);
        }
    }
}
