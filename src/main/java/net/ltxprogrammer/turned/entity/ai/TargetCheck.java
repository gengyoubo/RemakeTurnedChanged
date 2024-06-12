//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.entity.ai;

import java.util.function.Predicate;
import net.ltxprogrammer.changed.entity.LatexEntity;
import net.ltxprogrammer.changed.process.ProcessTransfur;
import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;

public class TargetCheck {
    public static Predicate<LivingEntity> IS_SLIMELING = (entity) -> {
        return entity == null ? false : entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("turned:slimeling")));
    };
    public static Predicate<LivingEntity> IS_LATEX = (entity) -> {
        if (entity instanceof LatexEntity) {
            return true;
        } else if (entity instanceof Player) {
            Player player = (Player)entity;
            return ProcessTransfur.isPlayerLatex(player);
        } else {
            return false;
        }
    };
    public static Predicate<LivingEntity> IS_HERTX = (entity) -> {
        return entity == null ? false : entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("turned:hertx")));
    };
    public static Predicate<LivingEntity> IS_ROBOT = (entity) -> {
        return entity == null ? false : entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("turned:robots")));
    };
    public static Predicate<LivingEntity> IS_EVIL = (entity) -> {
        if (entity == null) {
            return false;
        } else {
            return entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("turned:evilfaction"))) || entity.getItemBySlot(EquipmentSlot.HEAD).getItem() == LatexModItems.EVIL_BERET_HELMET.get();
        }
    };
    public static Predicate<LivingEntity> IS_GOOD = (entity) -> {
        if (entity == null) {
            return false;
        } else {
            return entity.getType().is(TagKey.create(Registry.ENTITY_TYPE_REGISTRY, new ResourceLocation("turned:goodfaction"))) || entity.getItemBySlot(EquipmentSlot.HEAD).getItem() == LatexModItems.GOOD_BERET_HELMET.get();
        }
    };

    public TargetCheck() {
    }
}
