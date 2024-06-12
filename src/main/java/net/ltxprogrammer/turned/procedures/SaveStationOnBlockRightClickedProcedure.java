package net.ltxprogrammer.turned.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

/* loaded from: turned-730838-4352793_mapped_official_1.18.2.jar:net/ltxprogrammer/turned/procedures/SaveStationOnBlockRightClickedProcedure.class */
public class SaveStationOnBlockRightClickedProcedure {
    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            if ((entity instanceof Player) && ((Player) entity).getAbilities().instabuild) {
                if (world instanceof Level _level) {
                    if (!_level.isClientSide()) {
                        _level.playSound(null, new BlockPos(x, y, z), Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:computer_on"))), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level.playLocalSound(x, y, z, Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:computer_on"))), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (!entity.level.isClientSide() && entity.getServer() != null) {
                    entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "spawnpoint");
                }
                if (entity instanceof Player _player) {
                    if (!_player.level.isClientSide()) {
                        _player.displayClientMessage(new TextComponent("Spawnpoint Set"), true);
                    }
                }
            } else if (!(entity instanceof Player) || !((Player) entity).getInventory().contains(new ItemStack(Items.REDSTONE))) {
                if (entity instanceof Player _player2) {
                    if (!_player2.level.isClientSide()) {
                        _player2.displayClientMessage(new TextComponent("Not Enough Redstone"), true);
                    }
                }
                if (world instanceof Level _level2) {
                    if (!_level2.isClientSide()) {
                        _level2.playSound(null, new BlockPos(x, y, z), Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:deny_beep"))), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level2.playLocalSound(x, y, z, Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:deny_beep"))), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
            } else {
                if (world instanceof Level _level3) {
                    if (!_level3.isClientSide()) {
                        _level3.playSound(null, new BlockPos(x, y, z), Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:computer_on"))), SoundSource.NEUTRAL, 1.0f, 1.0f);
                    } else {
                        _level3.playLocalSound(x, y, z, Objects.requireNonNull(ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:computer_on"))), SoundSource.NEUTRAL, 1.0f, 1.0f, false);
                    }
                }
                if (entity instanceof Player _player3) {
                    ItemStack _stktoremove = new ItemStack(Items.REDSTONE);
                    _player3.getInventory().clearOrCountMatchingItems(p -> _stktoremove.getItem() == p.getItem(), 1, _player3.inventoryMenu.getCraftSlots());
                }
                if (!entity.level.isClientSide() && entity.getServer() != null) {
                    entity.getServer().getCommands().performCommand(entity.createCommandSourceStack().withSuppressedOutput().withPermission(4), "spawnpoint");
                }
                if (entity instanceof Player _player4) {
                    if (!_player4.level.isClientSide()) {
                        _player4.displayClientMessage(new TextComponent("Spawnpoint Set"), true);
                    }
                }
            }
        }
    }
}
