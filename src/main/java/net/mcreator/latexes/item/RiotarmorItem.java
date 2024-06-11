//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.item;

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

public abstract class RiotarmorItem extends ArmorItem {
    public RiotarmorItem(EquipmentSlot slot, Item.Properties properties) {
        super(new ArmorMaterial() {
            public int getDurabilityForSlot(EquipmentSlot slot) {
                return (new int[]{13, 15, 16, 11})[slot.getIndex()] * 125;
            }

            public int getDefenseForSlot(EquipmentSlot slot) {
                return (new int[]{0, 3, 6, 2})[slot.getIndex()];
            }

            public int getEnchantmentValue() {
                return 9;
            }

            public SoundEvent getEquipSound() {
                return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_chain"));
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack[]{new ItemStack(Items.IRON_INGOT), new ItemStack(Items.IRON_NUGGET)});
            }

            public String getName() {
                return "riotarmor";
            }

            public float getToughness() {
                return 0.0F;
            }

            public float getKnockbackResistance() {
                return 0.5F;
            }
        }, slot, properties);
    }

    public static class Chestplate extends RiotarmorItem {
        public Chestplate() {
            super(EquipmentSlot.CHEST, (new Item.Properties()).tab((CreativeModeTab)null));
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "latex:textures/models/armor/riot_gear__layer_1.png";
        }
    }

    public static class Helmet extends RiotarmorItem {
        public Helmet() {
            super(EquipmentSlot.HEAD, (new Item.Properties()).tab((CreativeModeTab)null));
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "latex:textures/models/armor/riot_gear__layer_1.png";
        }
    }
}
