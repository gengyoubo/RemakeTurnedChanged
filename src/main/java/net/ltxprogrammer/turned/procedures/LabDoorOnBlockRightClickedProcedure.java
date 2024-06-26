//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.procedures;

import com.google.common.collect.UnmodifiableIterator;
import java.util.Map;
import net.ltxprogrammer.turned.init.LatexModBlocks;
import net.ltxprogrammer.turned.init.LatexModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.Property;
import net.minecraftforge.registries.ForgeRegistries;

public class LabDoorOnBlockRightClickedProcedure {
    public LabDoorOnBlockRightClickedProcedure() {
    }

    public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
        if (entity != null) {
            ItemStack var10000;
            if (entity instanceof LivingEntity) {
                LivingEntity _livEnt = (LivingEntity)entity;
                var10000 = _livEnt.getMainHandItem();
            } else {
                var10000 = ItemStack.EMPTY;
            }

            Level _level;
            if (var10000.getItem() == LatexModItems.KEYCARD.get()) {
                if (Blocks.BARRIER == world.getBlockState(new BlockPos(x - 1.0, y, z)).getBlock()) {
                    world.setBlock(new BlockPos(x - 1.0, y, z), Blocks.AIR.defaultBlockState(), 3);
                }

                if (Blocks.BARRIER == world.getBlockState(new BlockPos(x + 1.0, y, z)).getBlock()) {
                    world.setBlock(new BlockPos(x + 1.0, y, z), Blocks.AIR.defaultBlockState(), 3);
                }

                if (Blocks.BARRIER == world.getBlockState(new BlockPos(x + 1.0, y + 1.0, z)).getBlock()) {
                    world.setBlock(new BlockPos(x + 1.0, y + 1.0, z), Blocks.AIR.defaultBlockState(), 3);
                }

                if (Blocks.BARRIER == world.getBlockState(new BlockPos(x - 1.0, y + 1.0, z)).getBlock()) {
                    world.setBlock(new BlockPos(x - 1.0, y + 1.0, z), Blocks.AIR.defaultBlockState(), 3);
                }

                if (Blocks.BARRIER == world.getBlockState(new BlockPos(x, y + 1.0, z)).getBlock()) {
                    world.setBlock(new BlockPos(x, y + 1.0, z), Blocks.AIR.defaultBlockState(), 3);
                }

                if (Blocks.BARRIER == world.getBlockState(new BlockPos(x, y + 1.0, z - 1.0)).getBlock()) {
                    world.setBlock(new BlockPos(x, y + 1.0, z - 1.0), Blocks.AIR.defaultBlockState(), 3);
                }

                if (Blocks.BARRIER == world.getBlockState(new BlockPos(x, y + 1.0, z + 1.0)).getBlock()) {
                    world.setBlock(new BlockPos(x, y + 1.0, z + 1.0), Blocks.AIR.defaultBlockState(), 3);
                }

                if (Blocks.BARRIER == world.getBlockState(new BlockPos(x, y, z - 1.0)).getBlock()) {
                    world.setBlock(new BlockPos(x, y, z - 1.0), Blocks.AIR.defaultBlockState(), 3);
                }

                if (Blocks.BARRIER == world.getBlockState(new BlockPos(x, y, z + 1.0)).getBlock()) {
                    world.setBlock(new BlockPos(x, y, z + 1.0), Blocks.AIR.defaultBlockState(), 3);
                }

                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.isClientSide()) {
                        _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:approve_beep")), SoundSource.NEUTRAL, 1.0F, 1.0F);
                    } else {
                        _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:approve_beep")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
                    }
                }

                if (world instanceof Level) {
                    _level = (Level)world;
                    if (!_level.isClientSide()) {
                        _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_door.open")), SoundSource.NEUTRAL, 1.0F, 1.0F);
                    } else {
                        _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.iron_door.open")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
                    }
                }

                BlockPos _bp = new BlockPos(x, y, z);
                BlockState _bs = ((Block)LatexModBlocks.LAB_DOOR_OPEN.get()).defaultBlockState();
                BlockState _bso = world.getBlockState(_bp);
                UnmodifiableIterator var12 = _bso.getValues().entrySet().iterator();

                while(var12.hasNext()) {
                    Map.Entry<Property<?>, Comparable<?>> entry = (Map.Entry)var12.next();
                    Property _property = _bs.getBlock().getStateDefinition().getProperty(((Property)entry.getKey()).getName());
                    if (_property != null && _bs.getValue(_property) != null) {
                        try {
                            _bs = (BlockState)_bs.setValue(_property, (Comparable)entry.getValue());
                        } catch (Exception var16) {
                        }
                    }
                }

                world.setBlock(_bp, _bs, 3);
            } else if (world instanceof Level) {
                _level = (Level)world;
                if (!_level.isClientSide()) {
                    _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:deny_beep")), SoundSource.NEUTRAL, 1.0F, 1.0F);
                } else {
                    _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("turned:deny_beep")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
                }
            }

        }
    }
}