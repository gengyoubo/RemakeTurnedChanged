//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.item;

import net.mcreator.latexes.init.LatexModItems;
import net.mcreator.latexes.init.LatexModTabs;
import net.mcreator.latexes.procedures.HertxengineerBodyTickEventProcedure;
import net.mcreator.latexes.procedures.HertxengineerBootsTickEventProcedure;
import net.mcreator.latexes.procedures.HertxengineerHelmetTickEventProcedure;
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

public abstract class HertxengineerItem extends ArmorItem {
    public HertxengineerItem(EquipmentSlot slot, Item.Properties properties) {
        super(new ArmorMaterial() {
            public int getDurabilityForSlot(EquipmentSlot slot) {
                return (new int[]{13, 15, 16, 11})[slot.getIndex()] * 40;
            }

            public int getDefenseForSlot(EquipmentSlot slot) {
                return (new int[]{2, 1, 5, 2})[slot.getIndex()];
            }

            public int getEnchantmentValue() {
                return 12;
            }

            public SoundEvent getEquipSound() {
                return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_iron"));
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack[]{new ItemStack(Items.IRON_INGOT), new ItemStack((ItemLike)LatexModItems.BATTERY.get()), new ItemStack(Items.REDSTONE)});
            }

            public String getName() {
                return "hertxengineer";
            }

            public float getToughness() {
                return 0.0F;
            }

            public float getKnockbackResistance() {
                return 0.0F;
            }
        }, slot, properties);
    }

    public static class Boots extends HertxengineerItem {
        public Boots() {
            super(EquipmentSlot.FEET, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS));
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "latex:textures/models/armor/drone_hertx_armor__layer_1.png";
        }

        public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
            HertxengineerBootsTickEventProcedure.execute(entity);
        }
    }

    public static class Leggings extends HertxengineerItem {
        public Leggings() {
            super(EquipmentSlot.LEGS, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS));
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "latex:textures/models/armor/drone_hertx_armor__layer_2.png";
        }
    }

    public static class Chestplate extends HertxengineerItem {
        public Chestplate() {
            super(EquipmentSlot.CHEST, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS));
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "latex:textures/models/armor/drone_hertx_armor__layer_1.png";
        }

        public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
            HertxengineerBodyTickEventProcedure.execute(entity);
        }
    }

    public static class Helmet extends HertxengineerItem {
        public Helmet() {
            super(EquipmentSlot.HEAD, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS));
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "latex:textures/models/armor/drone_hertx_armor__layer_1.png";
        }

        public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
            HertxengineerHelmetTickEventProcedure.execute(entity);
        }
    }
}
