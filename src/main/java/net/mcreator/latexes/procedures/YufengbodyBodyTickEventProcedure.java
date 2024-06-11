package net.mcreator.latexes.procedures;

import net.mcreator.latexes.entity.YufengEntity;
import net.mcreator.latexes.init.LatexModItems;
import net.mcreator.latexes.init.LatexModMobEffects;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;

/* loaded from: 1-1034197-5414946_mapped_official_1.18.2.jar:net/mcreator/latexes/procedures/YufengbodyBodyTickEventProcedure.class */
public class YufengbodyBodyTickEventProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == LatexModItems.DLMASK_HELMET.get()) {
                if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == LatexModItems.YUFENGBODY_CHESTPLATE.get() && (entity instanceof Player)) {
                    Player _player = (Player) entity;
                    _player.getAbilities().mayfly = true;
                    _player.onUpdateAbilities();
                }
            } else if (entity instanceof YufengEntity) {
                if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == LatexModItems.YUFENGBODY_CHESTPLATE.get() && (entity instanceof Player)) {
                    Player _player2 = (Player) entity;
                    _player2.getAbilities().mayfly = true;
                    _player2.onUpdateAbilities();
                }
            } else {
                if (!(entity instanceof Player ? ((Player) entity).getAbilities().instabuild : false)) {
                    if (entity instanceof LivingEntity) {
                        ((LivingEntity) entity).addEffect(new MobEffectInstance((MobEffect) LatexModMobEffects.DARKLATEXDARTEFFECT.get(), 150, 1, false, false));
                    }
                    if ((entity instanceof LivingEntity ? ((LivingEntity) entity).getHealth() : -1.0f) < 1.0f) {
                        if (world instanceof Level) {
                            Level _level = (Level) world;
                            if (!_level.isClientSide()) {
                                _level.playSound((Player) null, new BlockPos(x, y, z), ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f);
                            } else {
                                _level.playLocalSound(x, y, z, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("latex:transfur")), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                            }
                        }
                        entity.hurt(DamageSource.WITHER, 1.0f);
                    }
                }
            }
        }
    }
}
