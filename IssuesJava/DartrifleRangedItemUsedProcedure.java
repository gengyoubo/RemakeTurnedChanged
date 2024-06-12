//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package net.ltxprogrammer.turned.procedures;

import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.event.TickEvent.Phase;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class DartrifleRangedItemUsedProcedure {
    public DartrifleRangedItemUsedProcedure() {
    }

    public static void execute(LevelAccessor world, final double x, final double y, final double z, Entity entity, ItemStack itemstack) {
        if (entity != null) {
            if (entity instanceof Player) {
                Player _player = (Player)entity;
                _player.getCooldowns().addCooldown(itemstack.getItem(), 35);
            }

            if (!(itemstack.getOrCreateTag().getDouble("ammo") < 1.0)) {
                itemstack.getOrCreateTag().putDouble("ammo", itemstack.getOrCreateTag().getDouble("ammo") - 1.0);
            }

            ((<undefinedtype>)(new Object() {
                private int ticks = 0;
                private float waitTicks;
                private LevelAccessor world;

                public void start(LevelAccessor world, int waitTicks) {
                    this.waitTicks = (float)waitTicks;
                    MinecraftForge.EVENT_BUS.register(this);
                    this.world = world;
                }

                @SubscribeEvent
                public void tick(TickEvent.ServerTickEvent event) {
                    if (event.phase == Phase.END) {
                        ++this.ticks;
                        if ((float)this.ticks >= this.waitTicks) {
                            this.run();
                        }
                    }

                }

                private void run() {
                    LevelAccessor var2 = this.world;
                    if (var2 instanceof Level _level) {
                        if (!_level.isClientSide()) {
                            _level.playSound((Player)null, new BlockPos(x, y, z), (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lever.click")), SoundSource.NEUTRAL, 1.0F, 1.0F);
                        } else {
                            _level.playLocalSound(x, y, z, (SoundEvent)ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("block.lever.click")), SoundSource.NEUTRAL, 1.0F, 1.0F, false);
                        }
                    }

                    MinecraftForge.EVENT_BUS.unregister(this);
                }
            })).start(world, 35);
        }
    }
}
