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
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

public abstract class GoodBeretItem extends ArmorItem {
    public GoodBeretItem(EquipmentSlot slot, Item.Properties properties) {
        super(new ArmorMaterial() {
            public int getDurabilityForSlot(@NotNull EquipmentSlot slot) {
                return (new int[]{13, 15, 16, 11})[slot.getIndex()] * 20;
            }

            public int getDefenseForSlot(@NotNull EquipmentSlot slot) {
                return (new int[]{2, 5, 6, 1})[slot.getIndex()];
            }

            public int getEnchantmentValue() {
                return 9;
            }

            public @NotNull SoundEvent getEquipSound() {
                return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation(""));
            }

            public @NotNull Ingredient getRepairIngredient() {
                return Ingredient.EMPTY;
            }

            public @NotNull String getName() {
                return "good_beret";
            }

            public float getToughness() {
                return 0.0F;
            }

            public float getKnockbackResistance() {
                return 0.0F;
            }
        }, slot, properties);
    }

    public static class Helmet extends GoodBeretItem {
        public Helmet() {
            super(EquipmentSlot.HEAD, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS));
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "latex:textures/models/armor/blue_beret__layer_1.png";
        }
    }
}
