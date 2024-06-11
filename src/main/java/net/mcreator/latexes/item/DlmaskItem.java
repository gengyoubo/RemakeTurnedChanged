package net.mcreator.latexes.item;

import net.mcreator.latexes.init.LatexModBlocks;
import net.mcreator.latexes.init.LatexModItems;
import net.mcreator.latexes.init.LatexModTabs;
import net.mcreator.latexes.procedures.DlmaskHelmetTickEventProcedure;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/DlmaskItem.class */
public abstract class DlmaskItem extends ArmorItem {

    /* renamed from: net.mcreator.latexes.item.DlmaskItem$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/DlmaskItem$1.class */
    class AnonymousClass1 implements ArmorMaterial {
        AnonymousClass1() {
        }

        public int getDurabilityForSlot(EquipmentSlot slot) {
            return new int[]{13, 15, 16, 11}[slot.getIndex()] * 30;
        }

        public int getDefenseForSlot(EquipmentSlot slot) {
            return new int[]{0, 0, 0, 2}[slot.getIndex()];
        }

        public int getEnchantmentValue() {
            return 9;
        }

        public SoundEvent getEquipSound() {
            return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.slime.death"));
        }

        public Ingredient getRepairIngredient() {
            return Ingredient.of(new ItemStack[]{new ItemStack((ItemLike) LatexModItems.DARKLATEXGOO.get()), new ItemStack((ItemLike) LatexModBlocks.DARKLATEXBLOCK.get()), new ItemStack((ItemLike) LatexModItems.DARKLATEXCRYSTAL.get())});
        }

        public String getName() {
            return "dlmask";
        }

        public float getToughness() {
            return 0.0f;
        }

        public float getKnockbackResistance() {
            return 0.1f;
        }
    }

    public DlmaskItem(EquipmentSlot slot, Item.Properties properties) {
        super(new AnonymousClass1(), slot, properties);
    }

    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/DlmaskItem$Helmet.class */
    public static class Helmet extends DlmaskItem {
        public Helmet() {
            super(EquipmentSlot.HEAD, new Item.Properties().tab(LatexModTabs.TAB_LATEXITEMS));
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "latex:textures/models/armor/dark_latex_mark__layer_1.png";
        }

        public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
            DlmaskHelmetTickEventProcedure.execute(world, entity, itemstack);
        }
    }
}
