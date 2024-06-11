package net.mcreator.latexes.item;

import java.util.List;
import net.mcreator.latexes.init.LatexModItems;
import net.mcreator.latexes.procedures.YufengbodyBodyTickEventProcedure;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.Level;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/YufengbodyItem.class */
public abstract class YufengbodyItem extends ArmorItem {

    /* renamed from: net.mcreator.latexes.item.YufengbodyItem$1  reason: invalid class name */
    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/YufengbodyItem$1.class */
    class AnonymousClass1 implements ArmorMaterial {
        AnonymousClass1() {
        }

        public int getDurabilityForSlot(EquipmentSlot slot) {
            return new int[]{13, 15, 16, 11}[slot.getIndex()] * 0;
        }

        public int getDefenseForSlot(EquipmentSlot slot) {
            return new int[]{0, 0, 2, 0}[slot.getIndex()];
        }

        public int getEnchantmentValue() {
            return 0;
        }

        public SoundEvent getEquipSound() {
            return ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur"));
        }

        public Ingredient getRepairIngredient() {
            return Ingredient.of(new ItemStack[]{new ItemStack((ItemLike) LatexModItems.DARKLATEXGOO.get())});
        }

        public String getName() {
            return "yufengbody";
        }

        public float getToughness() {
            return 0.0f;
        }

        public float getKnockbackResistance() {
            return 0.0f;
        }
    }

    public YufengbodyItem(EquipmentSlot slot, Item.Properties properties) {
        super(new AnonymousClass1(), slot, properties);
    }

    /* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/item/YufengbodyItem$Chestplate.class */
    public static class Chestplate extends YufengbodyItem {
        public Chestplate() {
            super(EquipmentSlot.CHEST, new Item.Properties().tab((CreativeModeTab) null));
        }

        public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
            appendHoverText(itemstack, world, list, flag);
            list.add(new TextComponent("How did you got this?! HANDS OFF."));
        }

        public String getArmorTexture(ItemStack stack, Entity entity, EquipmentSlot slot, String type) {
            return "latex:textures/entities/yufengbodytexture.png";
        }

        public void onArmorTick(ItemStack itemstack, Level world, Player entity) {
            YufengbodyBodyTickEventProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
        }
    }
}
