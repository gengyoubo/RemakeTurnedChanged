//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.mcreator.latexes.item;

import net.mcreator.latexes.init.LatexModTabs;
import net.mcreator.latexes.procedures.RespiratorHelmetTickEventProcedure;
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
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;

public abstract class RespiratorItem extends ArmorItem {
    public RespiratorItem(EquipmentSlot slot, Item.Properties properties) {
        super(new ArmorMaterial() {
            public int getDurabilityForSlot(EquipmentSlot slot) {
                return (new int[]{13, 15, 16, 11})[slot.getIndex()] * 10;
            }

            public int getDefenseForSlot(EquipmentSlot slot) {
                return (new int[]{2, 3, 4, 1})[slot.getIndex()];
            }

            public int getEnchantmentValue() {
                return 10;
            }

            public SoundEvent getEquipSound() {
                return (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:gas_mask_wear"));
            }

            public Ingredient getRepairIngredient() {
                return Ingredient.of(new ItemStack[]{new ItemStack(Items.IRON_INGOT), new ItemStack(Items.LEATHER), new ItemStack(Items.CHARCOAL), new ItemStack(Items.GOLD_INGOT)});
            }

            public String getName() {
                return "respirator";
            }

            public float getToughness() {
                return 0.0F;
            }

            public float getKnockbackResistance() {
                return 0.0F;
            }
        }, slot, properties);
    }

    public static class Helmet extends RespiratorItem {
        public Helmet() {
            super(EquipmentSlot.HEAD, (new Item.Properties()).tab(LatexModTabs.TAB_LATEXITEMS));
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "latex:textures/entities/respirator_texture.png";
        }

        public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
            RespiratorHelmetTickEventProcedure.execute(entity);
        }
    }
}
