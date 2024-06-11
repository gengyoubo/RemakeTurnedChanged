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

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/RiotarmorItem.class */
public abstract class RiotarmorItem extends ArmorItem {

    /* renamed from: net.mcreator.latexes.item.RiotarmorItem$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/RiotarmorItem$1.class */
    class AnonymousClass1 implements ArmorMaterial {
        AnonymousClass1() {
        }

        public int getDurabilityForSlot(EquipmentSlot slot) {
            return new int[]{13, 15, 16, 11}[slot.getIndex()] * 125;
        }

        public int getDefenseForSlot(EquipmentSlot slot) {
            return new int[]{0, 3, 6, 2}[slot.getIndex()];
        }

        public int getEnchantmentValue() {
            return 9;
        }

        public SoundEvent getEquipSound() {
            return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("item.armor.equip_chain"));
        }

        public Ingredient getRepairIngredient() {
            return Ingredient.of(new ItemStack[]{new ItemStack(Items.IRON_INGOT), new ItemStack(Items.IRON_NUGGET)});
        }

        public String getName() {
            return "riotarmor";
        }

        public float getToughness() {
            return 0.0f;
        }

        public float getKnockbackResistance() {
            return 0.5f;
        }
    }

    public RiotarmorItem(EquipmentSlot slot, Item.Properties properties) {
        super(new AnonymousClass1(), slot, properties);
    }

    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/RiotarmorItem$Helmet.class */
    public static class Helmet extends RiotarmorItem {
        public Helmet() {
            super(EquipmentSlot.HEAD, new Item.Properties().tab((CreativeModeTab) null));
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "latex:textures/models/armor/riot_gear__layer_1.png";
        }
    }

    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/RiotarmorItem$Chestplate.class */
    public static class Chestplate extends RiotarmorItem {
        public Chestplate() {
            super(EquipmentSlot.CHEST, new Item.Properties().tab((CreativeModeTab) null));
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "latex:textures/models/armor/riot_gear__layer_1.png";
        }
    }
}
